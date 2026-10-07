package j$.time.zone;

import j$.time.EnumC0125d;
import j$.time.ZoneOffset;
import j$.time.chrono.u;
import j$.time.k;
import j$.time.m;
import j$.time.o;
import j$.time.temporal.n;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    private final o a;
    private final byte b;
    private final EnumC0125d c;
    private final m d;
    private final boolean e;
    private final d f;
    private final ZoneOffset g;
    private final ZoneOffset h;
    private final ZoneOffset i;

    e(o oVar, int i, EnumC0125d enumC0125d, m mVar, boolean z, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.a = oVar;
        this.b = (byte) i;
        this.c = enumC0125d;
        this.d = mVar;
        this.e = z;
        this.f = dVar;
        this.g = zoneOffset;
        this.h = zoneOffset2;
        this.i = zoneOffset3;
    }

    static e b(DataInput dataInput) {
        ZoneOffset zoneOffsetF0;
        ZoneOffset zoneOffsetF1;
        int i = dataInput.readInt();
        o oVarX = o.X(i >>> 28);
        int i2 = ((264241152 & i) >>> 22) - 32;
        int i3 = (3670016 & i) >>> 19;
        EnumC0125d enumC0125dU = i3 == 0 ? null : EnumC0125d.U(i3);
        int i4 = (507904 & i) >>> 14;
        d dVar = d.values()[(i & 12288) >>> 12];
        int i5 = (i & 4080) >>> 4;
        int i6 = (i & 12) >>> 2;
        int i7 = i & 3;
        m mVarE0 = i4 == 31 ? m.e0(dataInput.readInt()) : m.b0(i4 % 24);
        ZoneOffset zoneOffsetF2 = ZoneOffset.f0(i5 == 255 ? dataInput.readInt() : (i5 - 128) * 900);
        if (i6 == 3) {
            zoneOffsetF0 = ZoneOffset.f0(dataInput.readInt());
        } else {
            zoneOffsetF0 = ZoneOffset.f0((i6 * 1800) + zoneOffsetF2.c0());
        }
        ZoneOffset zoneOffset = zoneOffsetF0;
        if (i7 == 3) {
            zoneOffsetF1 = ZoneOffset.f0(dataInput.readInt());
        } else {
            zoneOffsetF1 = ZoneOffset.f0((i7 * 1800) + zoneOffsetF2.c0());
        }
        boolean z = i4 == 24;
        Objects.requireNonNull(oVarX, "month");
        Objects.requireNonNull(mVarE0, "time");
        Objects.requireNonNull(dVar, "timeDefnition");
        Objects.requireNonNull(zoneOffsetF2, "standardOffset");
        Objects.requireNonNull(zoneOffset, "offsetBefore");
        Objects.requireNonNull(zoneOffsetF1, "offsetAfter");
        if (i2 < -28 || i2 > 31 || i2 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z && !mVarE0.equals(m.g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (mVarE0.Z() == 0) {
            return new e(oVarX, i2, enumC0125dU, mVarE0, z, dVar, zoneOffsetF2, zoneOffset, zoneOffsetF1);
        }
        throw new IllegalArgumentException("Time's nano-of-second must be zero");
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final b a(int i) {
        j$.time.i iVarJ0;
        n nVar;
        int iC0;
        ZoneOffset zoneOffset;
        EnumC0125d enumC0125d = this.c;
        o oVar = this.a;
        byte b = this.b;
        if (b < 0) {
            iVarJ0 = j$.time.i.j0(i, oVar, oVar.V(u.d.R(i)) + 1 + b);
            if (enumC0125d != null) {
                nVar = new n(enumC0125d.getValue(), 1);
                iVarJ0 = iVarJ0.m(nVar);
            }
        } else {
            iVarJ0 = j$.time.i.j0(i, oVar, b);
            if (enumC0125d != null) {
                nVar = new n(enumC0125d.getValue(), 0);
                iVarJ0 = iVarJ0.m(nVar);
            }
        }
        if (this.e) {
            iVarJ0 = iVarJ0.n0(1L);
        }
        k kVarD0 = k.d0(iVarJ0, this.d);
        d dVar = this.f;
        dVar.getClass();
        int i2 = c.a[dVar.ordinal()];
        ZoneOffset zoneOffset2 = this.h;
        if (i2 != 1) {
            if (i2 == 2) {
                iC0 = zoneOffset2.c0();
                zoneOffset = this.g;
            }
            return new b(kVarD0, zoneOffset2, this.i);
        }
        iC0 = zoneOffset2.c0();
        zoneOffset = ZoneOffset.UTC;
        kVarD0 = kVarD0.h0(iC0 - zoneOffset.c0());
        return new b(kVarD0, zoneOffset2, this.i);
    }

    final void c(DataOutput dataOutput) {
        int iY;
        m mVar = this.d;
        boolean z = this.e;
        int iM0 = z ? 86400 : mVar.m0();
        int iC0 = this.g.c0();
        ZoneOffset zoneOffset = this.h;
        int iC1 = zoneOffset.c0() - iC0;
        ZoneOffset zoneOffset2 = this.i;
        int iC2 = zoneOffset2.c0() - iC0;
        if (iM0 % 3600 == 0) {
            iY = z ? 24 : mVar.Y();
        } else {
            iY = 31;
        }
        int i = iC0 % 900 == 0 ? (iC0 / 900) + 128 : 255;
        int i2 = (iC1 == 0 || iC1 == 1800 || iC1 == 3600) ? iC1 / 1800 : 3;
        int i3 = (iC2 == 0 || iC2 == 1800 || iC2 == 3600) ? iC2 / 1800 : 3;
        EnumC0125d enumC0125d = this.c;
        dataOutput.writeInt((this.a.getValue() << 28) + ((this.b + 32) << 22) + ((enumC0125d == null ? 0 : enumC0125d.getValue()) << 19) + (iY << 14) + (this.f.ordinal() << 12) + (i << 4) + (i2 << 2) + i3);
        if (iY == 31) {
            dataOutput.writeInt(iM0);
        }
        if (i == 255) {
            dataOutput.writeInt(iC0);
        }
        if (i2 == 3) {
            dataOutput.writeInt(zoneOffset.c0());
        }
        if (i3 == 3) {
            dataOutput.writeInt(zoneOffset2.c0());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.f == eVar.f && this.d.equals(eVar.d) && this.e == eVar.e && this.g.equals(eVar.g) && this.h.equals(eVar.h) && this.i.equals(eVar.i);
    }

    public final int hashCode() {
        int iM0 = ((this.d.m0() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        EnumC0125d enumC0125d = this.c;
        return ((this.g.hashCode() ^ (this.f.ordinal() + (iM0 + ((enumC0125d == null ? 7 : enumC0125d.ordinal()) << 2)))) ^ this.h.hashCode()) ^ this.i.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.h;
        ZoneOffset zoneOffset2 = this.i;
        sb.append(zoneOffset.compareTo(zoneOffset2) > 0 ? "Gap " : "Overlap ");
        sb.append(zoneOffset);
        sb.append(" to ");
        sb.append(zoneOffset2);
        sb.append(", ");
        o oVar = this.a;
        byte b = this.b;
        EnumC0125d enumC0125d = this.c;
        if (enumC0125d == null) {
            sb.append(oVar.name());
            sb.append(' ');
            sb.append((int) b);
        } else {
            if (b == -1) {
                sb.append(enumC0125d.name());
                str = " on or before last day of ";
            } else if (b < 0) {
                sb.append(enumC0125d.name());
                sb.append(" on or before last day minus ");
                sb.append((-b) - 1);
                str = " of ";
            } else {
                sb.append(enumC0125d.name());
                sb.append(" on or after ");
                sb.append(oVar.name());
                sb.append(' ');
                sb.append((int) b);
            }
            sb.append(str);
            sb.append(oVar.name());
        }
        sb.append(" at ");
        sb.append(this.e ? "24:00" : this.d.toString());
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }
}
