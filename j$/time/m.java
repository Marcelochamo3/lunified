package j$.time;

import j$.time.chrono.AbstractC0121i;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements Temporal, j$.time.temporal.m, Comparable, Serializable {
    public static final m e;
    public static final m f;
    public static final m g;
    private static final m[] h = new m[24];
    private static final long serialVersionUID = 6414437269572265201L;
    private final byte a;
    private final byte b;
    private final byte c;
    private final int d;

    static {
        int i = 0;
        while (true) {
            m[] mVarArr = h;
            if (i >= mVarArr.length) {
                m mVar = mVarArr[0];
                g = mVar;
                m mVar2 = mVarArr[12];
                e = mVar;
                f = new m(23, 59, 59, 999999999);
                return;
            }
            mVarArr[i] = new m(i, 0, 0, 0);
            i++;
        }
    }

    private m(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    private static m V(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? h[i] : new m(i, i2, i3, i4);
    }

    public static m W(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        m mVar = (m) temporalAccessor.C(j$.time.temporal.l.g());
        if (mVar != null) {
            return mVar;
        }
        throw new C0111b("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    private int X(j$.time.temporal.p pVar) {
        int i = l.a[((j$.time.temporal.a) pVar).ordinal()];
        byte b = this.b;
        int i2 = this.d;
        byte b2 = this.a;
        switch (i) {
            case 1:
                return i2;
            case 2:
                throw new j$.time.temporal.q("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i2 / 1000;
            case 4:
                throw new j$.time.temporal.q("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i2 / 1000000;
            case 6:
                return (int) (l0() / 1000000);
            case 7:
                return this.c;
            case 8:
                return m0();
            case 9:
                return b;
            case 10:
                return (b2 * 60) + b;
            case 11:
                return b2 % 12;
            case 12:
                int i3 = b2 % 12;
                if (i3 % 12 == 0) {
                    return 12;
                }
                return i3;
            case 13:
                return b2;
            case 14:
                if (b2 == 0) {
                    return 24;
                }
                return b2;
            case 15:
                return b2 / 12;
            default:
                throw new j$.time.temporal.q(AbstractC0112c.a("Unsupported field: ", pVar));
        }
    }

    public static m b0(int i) {
        j$.time.temporal.a.HOUR_OF_DAY.V(i);
        return h[i];
    }

    public static m c0(int i, int i2, int i3, int i4) {
        j$.time.temporal.a.HOUR_OF_DAY.V(i);
        j$.time.temporal.a.MINUTE_OF_HOUR.V(i2);
        j$.time.temporal.a.SECOND_OF_MINUTE.V(i3);
        j$.time.temporal.a.NANO_OF_SECOND.V(i4);
        return V(i, i2, i3, i4);
    }

    public static m d0(long j) {
        j$.time.temporal.a.NANO_OF_DAY.V(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return V(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    public static m e0(long j) {
        j$.time.temporal.a.SECOND_OF_DAY.V(j);
        int i = (int) (j / 3600);
        long j2 = j - ((long) (i * 3600));
        int i2 = (int) (j2 / 60);
        return V(i, i2, (int) (j2 - ((long) (i2 * 60))), 0);
    }

    static m k0(DataInput dataInput) throws IOException {
        int i;
        int i2;
        int i3 = dataInput.readByte();
        int i4 = 0;
        if (i3 >= 0) {
            byte b = dataInput.readByte();
            if (b < 0) {
                int i5 = ~b;
                i2 = 0;
                i4 = i5;
                i = 0;
            } else {
                byte b2 = dataInput.readByte();
                if (b2 < 0) {
                    i = ~b2;
                    i4 = b;
                } else {
                    int i6 = dataInput.readInt();
                    i = b2;
                    i2 = i6;
                    i4 = b;
                }
            }
            return c0(i3, i4, i, i2);
        }
        i3 = ~i3;
        i = 0;
        i2 = 0;
        return c0(i3, i4, i, i2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 4, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object C(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.l.e() || temporalQuery == j$.time.temporal.l.l() || temporalQuery == j$.time.temporal.l.k() || temporalQuery == j$.time.temporal.l.i()) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.l.g()) {
            return this;
        }
        if (temporalQuery == j$.time.temporal.l.f()) {
            return null;
        }
        return temporalQuery == j$.time.temporal.l.j() ? ChronoUnit.NANOS : temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.m
    public final Temporal E(Temporal temporal) {
        return temporal.d(l0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final int compareTo(m mVar) {
        int iCompare = Integer.compare(this.a, mVar.a);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Integer.compare(this.b, mVar.b);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Integer.compare(this.c, mVar.c);
        return iCompare3 == 0 ? Integer.compare(this.d, mVar.d) : iCompare3;
    }

    public final int Y() {
        return this.a;
    }

    public final int Z() {
        return this.d;
    }

    public final int a0() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a == mVar.a && this.b == mVar.b && this.c == mVar.c && this.d == mVar.d;
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        long j;
        m mVarW = W(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.p(this, mVarW);
        }
        long jL0 = mVarW.l0() - l0();
        switch (l.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jL0;
            case 2:
                j = 1000;
                break;
            case 3:
                j = 1000000;
                break;
            case 4:
                j = 1000000000;
                break;
            case 5:
                j = 60000000000L;
                break;
            case 6:
                j = 3600000000000L;
                break;
            case 7:
                j = 43200000000000L;
                break;
            default:
                throw new j$.time.temporal.q("Unsupported unit: " + temporalUnit);
        }
        return jL0 / j;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final m e(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (m) temporalUnit.r(this, j);
        }
        switch (l.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return i0(j);
            case 2:
                return i0((j % 86400000000L) * 1000);
            case 3:
                return i0((j % 86400000) * 1000000);
            case 4:
                return j0(j);
            case 5:
                return h0(j);
            case 6:
                return g0(j);
            case 7:
                return g0((j % 2) * 12);
            default:
                throw new j$.time.temporal.q("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).W();
        }
        return pVar != null && pVar.u(this);
    }

    public final m g0(long j) {
        if (j == 0) {
            return this;
        }
        return V(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final m h0(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.a * 60) + this.b;
        int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
        return i == i2 ? this : V(i2 / 60, i2 % 60, this.c, this.d);
    }

    public final int hashCode() {
        long jL0 = l0();
        return (int) (jL0 ^ (jL0 >>> 32));
    }

    public final m i0(long j) {
        if (j == 0) {
            return this;
        }
        long jL0 = l0();
        long j2 = (((j % 86400000000000L) + jL0) + 86400000000000L) % 86400000000000L;
        return jL0 == j2 ? this : V((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
    }

    public final m j0(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.b * 60) + (this.a * 3600) + this.c;
        int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
        return i == i2 ? this : V(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
    }

    public final long l0() {
        return (((long) this.c) * 1000000000) + (((long) this.b) * 60000000000L) + (((long) this.a) * 3600000000000L) + ((long) this.d);
    }

    public final int m0() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public final m d(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (m) pVar.x(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.V(j);
        int i = l.a[aVar.ordinal()];
        byte b = this.b;
        byte b2 = this.c;
        int i2 = this.d;
        byte b3 = this.a;
        switch (i) {
            case 1:
                return o0((int) j);
            case 2:
                return d0(j);
            case 3:
                return o0(((int) j) * 1000);
            case 4:
                return d0(j * 1000);
            case 5:
                return o0(((int) j) * 1000000);
            case 6:
                return d0(j * 1000000);
            case 7:
                int i3 = (int) j;
                if (b2 == i3) {
                    return this;
                }
                j$.time.temporal.a.SECOND_OF_MINUTE.V(i3);
                return V(b3, b, i3, i2);
            case 8:
                return j0(j - ((long) m0()));
            case 9:
                int i4 = (int) j;
                if (b == i4) {
                    return this;
                }
                j$.time.temporal.a.MINUTE_OF_HOUR.V(i4);
                return V(b3, i4, b2, i2);
            case 10:
                return h0(j - ((long) ((b3 * 60) + b)));
            case 11:
                return g0(j - ((long) (b3 % 12)));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return g0(j - ((long) (b3 % 12)));
            case 13:
                int i5 = (int) j;
                if (b3 == i5) {
                    return this;
                }
                j$.time.temporal.a.HOUR_OF_DAY.V(i5);
                return V(i5, b, b2, i2);
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i6 = (int) j;
                if (b3 == i6) {
                    return this;
                }
                j$.time.temporal.a.HOUR_OF_DAY.V(i6);
                return V(i6, b, b2, i2);
            case 15:
                return g0((j - ((long) (b3 / 12))) * 12);
            default:
                throw new j$.time.temporal.q(AbstractC0112c.a("Unsupported field: ", pVar));
        }
    }

    public final m o0(int i) {
        if (this.d == i) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.V(i);
        return V(this.a, this.b, this.c, i);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal p(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    final void p0(DataOutput dataOutput) {
        int i;
        byte b = this.c;
        byte b2 = this.a;
        byte b3 = this.b;
        int i2 = this.d;
        if (i2 != 0) {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(b);
            dataOutput.writeInt(i2);
            return;
        }
        if (b != 0) {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(b3);
            i = ~b;
        } else if (b3 == 0) {
            i = ~b2;
        } else {
            dataOutput.writeByte(b2);
            i = ~b3;
        }
        dataOutput.writeByte(i);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int r(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? X(pVar) : j$.time.temporal.l.a(this, pVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal t(i iVar) {
        boolean z = iVar instanceof m;
        Temporal temporalA = iVar;
        if (!z) {
            temporalA = AbstractC0121i.a(iVar, this);
        }
        return (m) temporalA;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        byte b2 = this.b;
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        byte b3 = this.c;
        int i2 = this.d;
        if (b3 > 0 || i2 > 0) {
            sb.append(b3 < 10 ? ":0" : ":");
            sb.append((int) b3);
            if (i2 > 0) {
                sb.append('.');
                int i3 = 1000000;
                if (i2 % 1000000 == 0) {
                    i = (i2 / 1000000) + 1000;
                } else {
                    if (i2 % 1000 == 0) {
                        i2 /= 1000;
                    } else {
                        i3 = 1000000000;
                    }
                    i = i2 + i3;
                }
                sb.append(Integer.toString(i).substring(1));
            }
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r u(j$.time.temporal.p pVar) {
        return j$.time.temporal.l.d(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long x(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.t(this);
        }
        if (pVar == j$.time.temporal.a.NANO_OF_DAY) {
            return l0();
        }
        return pVar == j$.time.temporal.a.MICRO_OF_DAY ? l0() / 1000 : X(pVar);
    }
}
