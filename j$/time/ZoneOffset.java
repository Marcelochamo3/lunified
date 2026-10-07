package j$.time;

import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import o.Yu0;

/* JADX INFO: loaded from: classes2.dex */
public final class ZoneOffset extends ZoneId implements TemporalAccessor, j$.time.temporal.m, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;
    private final int b;
    private final transient String c;
    private static final ConcurrentHashMap d = new ConcurrentHashMap(16, 4);
    private static final ConcurrentHashMap e = new ConcurrentHashMap(16, 4);
    public static final ZoneOffset UTC = f0(0);
    public static final ZoneOffset f = f0(-64800);
    public static final ZoneOffset g = f0(64800);

    private ZoneOffset(int i) {
        String string;
        this.b = i;
        if (i == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i);
            StringBuilder sb = new StringBuilder();
            int i2 = iAbs / 3600;
            int i3 = (iAbs / 60) % 60;
            sb.append(i < 0 ? "-" : "+");
            sb.append(i2 < 10 ? "0" : "");
            sb.append(i2);
            sb.append(i3 < 10 ? ":0" : ":");
            sb.append(i3);
            int i4 = iAbs % 60;
            if (i4 != 0) {
                sb.append(i4 < 10 ? ":0" : ":");
                sb.append(i4);
            }
            string = sb.toString();
        }
        this.c = string;
    }

    public static ZoneOffset b0(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        ZoneOffset zoneOffset = (ZoneOffset) temporalAccessor.C(j$.time.temporal.l.i());
        if (zoneOffset != null) {
            return zoneOffset;
        }
        throw new C0111b("Unable to obtain ZoneOffset from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Multi-variable type inference failed */
    public static ZoneOffset d0(String str) {
        int iG0;
        int iG1;
        int iG2;
        char cCharAt;
        Objects.requireNonNull(str, "offsetId");
        ZoneOffset zoneOffset = (ZoneOffset) e.get(str);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        int length = str.length();
        if (length != 2) {
            if (length != 3) {
                if (length != 5) {
                    if (length == 6) {
                        iG0 = g0(str, 1, false);
                        iG1 = g0(str, 4, true);
                    } else if (length == 7) {
                        iG0 = g0(str, 1, false);
                        iG1 = g0(str, 3, false);
                        iG2 = g0(str, 5, false);
                    } else {
                        if (length != 9) {
                            throw new C0111b("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                        }
                        iG0 = g0(str, 1, false);
                        iG1 = g0(str, 4, true);
                        iG2 = g0(str, 7, true);
                    }
                    cCharAt = str.charAt(0);
                    if (cCharAt != '+' || cCharAt == '-') {
                        return cCharAt == '-' ? e0(-iG0, -iG1, -iG2) : e0(iG0, iG1, iG2);
                    }
                    throw new C0111b("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
                }
                iG0 = g0(str, 1, false);
                iG1 = g0(str, 3, false);
            }
            iG2 = 0;
            cCharAt = str.charAt(0);
            if (cCharAt != '+') {
            }
            if (cCharAt == '-') {
            }
        }
        str = str.charAt(0) + "0" + str.charAt(1);
        iG0 = g0(str, 1, false);
        iG1 = 0;
        iG2 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt != '+') {
        }
        if (cCharAt == '-') {
        }
    }

    public static ZoneOffset e0(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            throw new C0111b("Zone offset hours not in valid range: value " + i + " is not in the range -18 to 18");
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new C0111b("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new C0111b("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new C0111b("Zone offset minutes and seconds must have the same sign");
        }
        if (i2 < -59 || i2 > 59) {
            throw new C0111b("Zone offset minutes not in valid range: value " + i2 + " is not in the range -59 to 59");
        }
        if (i3 < -59 || i3 > 59) {
            throw new C0111b("Zone offset seconds not in valid range: value " + i3 + " is not in the range -59 to 59");
        }
        if (Math.abs(i) == 18 && (i2 | i3) != 0) {
            throw new C0111b("Zone offset not in valid range: -18:00 to +18:00");
        }
        return f0((i2 * 60) + (i * 3600) + i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ZoneOffset f0(int i) {
        if (i < -64800 || i > 64800) {
            throw new C0111b("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i % 900 != 0) {
            return new ZoneOffset(i);
        }
        Integer numValueOf = Integer.valueOf(i);
        ConcurrentHashMap concurrentHashMap = d;
        ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(numValueOf);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        concurrentHashMap.putIfAbsent(numValueOf, new ZoneOffset(i));
        ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(numValueOf);
        e.putIfAbsent(zoneOffset2.c, zoneOffset2);
        return zoneOffset2;
    }

    private static int g0(CharSequence charSequence, int i, boolean z) {
        if (z && charSequence.charAt(i - 1) != ':') {
            throw new C0111b("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) charSequence));
        }
        char cCharAt = charSequence.charAt(i);
        char cCharAt2 = charSequence.charAt(i + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new C0111b("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) charSequence));
    }

    static ZoneOffset h0(DataInput dataInput) throws IOException {
        byte b = dataInput.readByte();
        return b == 127 ? f0(dataInput.readInt()) : f0(b * 900);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 8, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object C(TemporalQuery temporalQuery) {
        return (temporalQuery == j$.time.temporal.l.i() || temporalQuery == j$.time.temporal.l.k()) ? this : j$.time.temporal.l.c(this, temporalQuery);
    }

    @Override // j$.time.temporal.m
    public final Temporal E(Temporal temporal) {
        return temporal.d(this.b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f V() {
        return j$.time.zone.f.j(this);
    }

    @Override // j$.time.ZoneId
    final void Z(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        i0(dataOutput);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.b - this.b;
    }

    public final int c0() {
        return this.b;
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneOffset) {
            return this.b == ((ZoneOffset) obj).b;
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return pVar == j$.time.temporal.a.OFFSET_SECONDS;
        }
        return pVar != null && pVar.u(this);
    }

    @Override // j$.time.ZoneId
    public final int hashCode() {
        return this.b;
    }

    final void i0(DataOutput dataOutput) {
        int i = this.b;
        int i2 = i % 900 == 0 ? i / 900 : Yu0.b.k0;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    @Override // j$.time.ZoneId
    public final String o() {
        return this.c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int r(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.b;
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.q(AbstractC0112c.a("Unsupported field: ", pVar));
        }
        return j$.time.temporal.l.d(this, pVar).a(x(pVar), pVar);
    }

    @Override // j$.time.ZoneId
    public final String toString() {
        return this.c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r u(j$.time.temporal.p pVar) {
        return j$.time.temporal.l.d(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long x(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.b;
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.q(AbstractC0112c.a("Unsupported field: ", pVar));
        }
        return pVar.t(this);
    }
}
