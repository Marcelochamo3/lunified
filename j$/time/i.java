package j$.time;

import j$.time.chrono.AbstractC0121i;
import j$.time.chrono.InterfaceC0114b;
import j$.time.chrono.InterfaceC0117e;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements Temporal, j$.time.temporal.m, InterfaceC0114b, Serializable {
    public static final i d = i0(-999999999, 1, 1);
    public static final i e = i0(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    private final int a;
    private final short b;
    private final short c;

    static {
        i0(1970, 1, 1);
    }

    private i(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    private static i V(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (j$.time.chrono.u.d.R(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new C0111b("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new C0111b("Invalid date '" + o.X(i2).name() + " " + i3 + "'");
            }
        }
        return new i(i, i2, i3);
    }

    public static i W(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        i iVar = (i) temporalAccessor.C(j$.time.temporal.l.f());
        if (iVar != null) {
            return iVar;
        }
        throw new C0111b("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    private int X(j$.time.temporal.p pVar) {
        int i;
        int i2 = h.a[((j$.time.temporal.a) pVar).ordinal()];
        short s = this.c;
        int i3 = this.a;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return Z();
            case 3:
                i = (s - 1) / 7;
                break;
            case 4:
                return i3 >= 1 ? i3 : 1 - i3;
            case 5:
                return Y().getValue();
            case 6:
                i = (s - 1) % 7;
                break;
            case 7:
                return ((Z() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.q("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((Z() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new j$.time.temporal.q("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i3;
            case 13:
                return i3 >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.q(AbstractC0112c.a("Unsupported field: ", pVar));
        }
        return i + 1;
    }

    private long b0() {
        return ((((long) this.a) * 12) + ((long) this.b)) - 1;
    }

    private long g0(i iVar) {
        return (((iVar.b0() * 32) + ((long) iVar.c)) - ((b0() * 32) + ((long) this.c))) / 32;
    }

    public static i h0(Clock clock) {
        Objects.requireNonNull(clock, "clock");
        Instant instant = clock.instant();
        ZoneId zoneIdA = clock.a();
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneIdA, "zone");
        return k0(j$.com.android.tools.r8.a.k(instant.getEpochSecond() + ((long) zoneIdA.V().d(instant).c0()), 86400));
    }

    public static i i0(int i, int i2, int i3) {
        j$.time.temporal.a.YEAR.V(i);
        j$.time.temporal.a.MONTH_OF_YEAR.V(i2);
        j$.time.temporal.a.DAY_OF_MONTH.V(i3);
        return V(i, i2, i3);
    }

    public static i j0(int i, o oVar, int i2) {
        j$.time.temporal.a.YEAR.V(i);
        Objects.requireNonNull(oVar, "month");
        j$.time.temporal.a.DAY_OF_MONTH.V(i2);
        return V(i, oVar.getValue(), i2);
    }

    public static i k0(long j) {
        long j2;
        j$.time.temporal.a.EPOCH_DAY.V(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        return new i(j$.time.temporal.a.YEAR.U(j5 + j2 + ((long) (i2 / 10))), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    public static i l0(int i, int i2) {
        long j = i;
        j$.time.temporal.a.YEAR.V(j);
        j$.time.temporal.a.DAY_OF_YEAR.V(i2);
        boolean zR = j$.time.chrono.u.d.R(j);
        if (i2 == 366 && !zR) {
            throw new C0111b("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
        }
        o oVarX = o.X(((i2 - 1) / 31) + 1);
        if (i2 > (oVarX.V(zR) + oVarX.U(zR)) - 1) {
            oVarX = oVarX.Y();
        }
        return new i(i, oVarX.getValue(), (i2 - oVarX.U(zR)) + 1);
    }

    private static i r0(int i, int i2, int i3) {
        int i4;
        if (i2 != 2) {
            if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
                i4 = 30;
            }
            return new i(i, i2, i3);
        }
        i4 = j$.time.chrono.u.d.R((long) i) ? 29 : 28;
        i3 = Math.min(i3, i4);
        return new i(i, i2, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 3, this);
    }

    @Override // j$.time.chrono.InterfaceC0114b
    public final InterfaceC0117e B(m mVar) {
        return k.d0(this, mVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object C(TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.l.f() ? this : AbstractC0121i.j(this, temporalQuery);
    }

    @Override // j$.time.temporal.m
    public final Temporal E(Temporal temporal) {
        return AbstractC0121i.a(this, temporal);
    }

    @Override // j$.time.chrono.InterfaceC0114b
    public final j$.time.chrono.o F() {
        return this.a >= 1 ? j$.time.chrono.v.CE : j$.time.chrono.v.BCE;
    }

    @Override // j$.time.chrono.InterfaceC0114b
    public final boolean J() {
        return j$.time.chrono.u.d.R(this.a);
    }

    @Override // j$.time.chrono.InterfaceC0114b
    public final int P() {
        return J() ? 366 : 365;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC0114b interfaceC0114b) {
        return interfaceC0114b instanceof i ? U((i) interfaceC0114b) : AbstractC0121i.b(this, interfaceC0114b);
    }

    final int U(i iVar) {
        int i = this.a - iVar.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - iVar.b;
        return i2 == 0 ? this.c - iVar.c : i2;
    }

    public final EnumC0125d Y() {
        return EnumC0125d.U(((int) j$.com.android.tools.r8.a.j(y() + 3, 7)) + 1);
    }

    public final int Z() {
        return (o.X(this.b).U(J()) + this.c) - 1;
    }

    @Override // j$.time.chrono.InterfaceC0114b
    public final j$.time.chrono.n a() {
        return j$.time.chrono.u.d;
    }

    public final int a0() {
        return this.b;
    }

    public final int c0() {
        return this.a;
    }

    public final boolean d0(i iVar) {
        if (iVar instanceof i) {
            return U(iVar) < 0;
        }
        return y() < iVar.y();
    }

    public final int e0() {
        short s = this.b;
        if (s != 2) {
            return (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31;
        }
        return J() ? 29 : 28;
    }

    @Override // j$.time.chrono.InterfaceC0114b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && U((i) obj) == 0;
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        long jY;
        long j;
        i iVarW = W(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.p(this, iVarW);
        }
        switch (h.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return iVarW.y() - y();
            case 2:
                jY = iVarW.y() - y();
                j = 7;
                break;
            case 3:
                return g0(iVarW);
            case 4:
                jY = g0(iVarW);
                j = 12;
                break;
            case 5:
                jY = g0(iVarW);
                j = 120;
                break;
            case 6:
                jY = g0(iVarW);
                j = 1200;
                break;
            case 7:
                jY = g0(iVarW);
                j = 12000;
                break;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return iVarW.x(aVar) - x(aVar);
            default:
                throw new j$.time.temporal.q("Unsupported unit: " + temporalUnit);
        }
        return jY / j;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final i p(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        return AbstractC0121i.h(this, pVar);
    }

    @Override // j$.time.chrono.InterfaceC0114b
    public final int hashCode() {
        int i = this.a;
        return (((i << 11) + (this.b << 6)) + this.c) ^ (i & (-2048));
    }

    @Override // j$.time.chrono.InterfaceC0114b
    public final InterfaceC0114b j(v vVar) {
        if (vVar instanceof v) {
            return o0(vVar.d()).n0(vVar.a());
        }
        Objects.requireNonNull(vVar, "amountToAdd");
        return (i) vVar.p(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public final i e(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (i) temporalUnit.r(this, j);
        }
        switch (h.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return n0(j);
            case 2:
                return p0(j);
            case 3:
                return o0(j);
            case 4:
                return q0(j);
            case 5:
                return q0(j$.com.android.tools.r8.a.l(j, 10));
            case 6:
                return q0(j$.com.android.tools.r8.a.l(j, 100));
            case 7:
                return q0(j$.com.android.tools.r8.a.l(j, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.f(x(aVar), j), aVar);
            default:
                throw new j$.time.temporal.q("Unsupported unit: " + temporalUnit);
        }
    }

    public final i n0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.c) + j;
        if (j2 > 0) {
            short s = this.b;
            int i = this.a;
            if (j2 <= 28) {
                return new i(i, s, (int) j2);
            }
            if (j2 <= 59) {
                long jE0 = e0();
                if (j2 <= jE0) {
                    return new i(i, s, (int) j2);
                }
                if (s < 12) {
                    return new i(i, s + 1, (int) (j2 - jE0));
                }
                int i2 = i + 1;
                j$.time.temporal.a.YEAR.V(i2);
                return new i(i2, 1, (int) (j2 - jE0));
            }
        }
        return k0(j$.com.android.tools.r8.a.f(y(), j));
    }

    public final i o0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        long j3 = 12;
        return r0(j$.time.temporal.a.YEAR.U(j$.com.android.tools.r8.a.k(j2, j3)), ((int) j$.com.android.tools.r8.a.j(j2, j3)) + 1, this.c);
    }

    public final i p0(long j) {
        return n0(j$.com.android.tools.r8.a.l(j, 7));
    }

    public final i q0(long j) {
        return j == 0 ? this : r0(j$.time.temporal.a.YEAR.U(((long) this.a) + j), this.b, this.c);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int r(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? X(pVar) : j$.time.temporal.l.a(this, pVar);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public final i d(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (i) pVar.x(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.V(j);
        int i = h.a[aVar.ordinal()];
        short s = this.c;
        short s2 = this.b;
        int i2 = this.a;
        switch (i) {
            case 1:
                int i3 = (int) j;
                return s == i3 ? this : i0(i2, s2, i3);
            case 2:
                return u0((int) j);
            case 3:
                return p0(j - x(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (i2 < 1) {
                    j = 1 - j;
                }
                return v0((int) j);
            case 5:
                return n0(j - ((long) Y().getValue()));
            case 6:
                return n0(j - x(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return n0(j - x(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return k0(j);
            case 9:
                return p0(j - x(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i4 = (int) j;
                if (s2 == i4) {
                    return this;
                }
                j$.time.temporal.a.MONTH_OF_YEAR.V(i4);
                return r0(i2, i4, s);
            case 11:
                return o0(j - b0());
            case 12:
                return v0((int) j);
            case 13:
                return x(j$.time.temporal.a.ERA) == j ? this : v0(1 - i2);
            default:
                throw new j$.time.temporal.q(AbstractC0112c.a("Unsupported field: ", pVar));
        }
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final i t(j$.time.temporal.m mVar) {
        return mVar instanceof i ? (i) mVar : (i) mVar.E(this);
    }

    @Override // j$.time.chrono.InterfaceC0114b
    public final String toString() {
        int i;
        int i2 = this.a;
        int iAbs = Math.abs(i2);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs < 1000) {
            if (i2 < 0) {
                sb.append(i2 - 10000);
                i = 1;
            } else {
                sb.append(i2 + 10000);
                i = 0;
            }
            sb.deleteCharAt(i);
        } else {
            if (i2 > 9999) {
                sb.append('+');
            }
            sb.append(i2);
        }
        short s = this.b;
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        short s2 = this.c;
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r u(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.C(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        if (!aVar.E()) {
            throw new j$.time.temporal.q(AbstractC0112c.a("Unsupported field: ", pVar));
        }
        int i = h.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.r.j(1L, e0());
        }
        if (i == 2) {
            return j$.time.temporal.r.j(1L, P());
        }
        if (i == 3) {
            return j$.time.temporal.r.j(1L, (o.X(this.b) != o.FEBRUARY || J()) ? 5L : 4L);
        }
        if (i != 4) {
            return ((j$.time.temporal.a) pVar).p();
        }
        return j$.time.temporal.r.j(1L, this.a <= 0 ? 1000000000L : 999999999L);
    }

    public final i u0(int i) {
        return Z() == i ? this : l0(this.a, i);
    }

    public final i v0(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.V(i);
        return r0(i, this.b, this.c);
    }

    final void w0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.a);
        dataOutput.writeByte(this.b);
        dataOutput.writeByte(this.c);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long x(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.t(this);
        }
        if (pVar == j$.time.temporal.a.EPOCH_DAY) {
            return y();
        }
        return pVar == j$.time.temporal.a.PROLEPTIC_MONTH ? b0() : X(pVar);
    }

    @Override // j$.time.chrono.InterfaceC0114b
    public final long y() {
        long j;
        long j2 = this.a;
        long j3 = this.b;
        long j4 = 365 * j2;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + ((long) (this.c - 1));
        if (j3 > 2) {
            j5 = !J() ? j5 - 2 : j5 - 1;
        }
        return j5 - 719528;
    }
}
