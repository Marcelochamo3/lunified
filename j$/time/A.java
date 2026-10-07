package j$.time;

import j$.time.chrono.AbstractC0113a;
import j$.time.chrono.AbstractC0121i;
import j$.time.format.F;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class A implements Temporal, j$.time.temporal.m, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 4183400860270640070L;
    private final int a;
    private final int b;

    static {
        j$.time.format.v vVar = new j$.time.format.v();
        vVar.p(j$.time.temporal.a.YEAR, 4, 10, F.EXCEEDS_PAD);
        vVar.e('-');
        vVar.o(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        vVar.y(Locale.getDefault());
    }

    private A(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private long U() {
        return ((((long) this.a) * 12) + ((long) this.b)) - 1;
    }

    public static A V(int i, int i2) {
        j$.time.temporal.a.YEAR.V(i);
        j$.time.temporal.a.MONTH_OF_YEAR.V(i2);
        return new A(i, i2);
    }

    private A Z(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new A(i, i2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 12, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object C(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.l.e()) {
            return j$.time.chrono.u.d;
        }
        return temporalQuery == j$.time.temporal.l.j() ? ChronoUnit.MONTHS : j$.time.temporal.l.c(this, temporalQuery);
    }

    @Override // j$.time.temporal.m
    public final Temporal E(Temporal temporal) {
        if (!((AbstractC0113a) AbstractC0121i.p(temporal)).equals(j$.time.chrono.u.d)) {
            throw new C0111b("Adjustment only supported on ISO date-time");
        }
        return temporal.d(U(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final A e(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (A) temporalUnit.r(this, j);
        }
        switch (z.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return X(j);
            case 2:
                return Y(j);
            case 3:
                return Y(j$.com.android.tools.r8.a.l(j, 10));
            case 4:
                return Y(j$.com.android.tools.r8.a.l(j, 100));
            case 5:
                return Y(j$.com.android.tools.r8.a.l(j, 1000));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.f(x(aVar), j), aVar);
            default:
                throw new j$.time.temporal.q("Unsupported unit: " + temporalUnit);
        }
    }

    public final A X(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        long j3 = 12;
        return Z(j$.time.temporal.a.YEAR.U(j$.com.android.tools.r8.a.k(j2, j3)), ((int) j$.com.android.tools.r8.a.j(j2, j3)) + 1);
    }

    public final A Y(long j) {
        return j == 0 ? this : Z(j$.time.temporal.a.YEAR.U(((long) this.a) + j), this.b);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final A d(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (A) pVar.x(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.V(j);
        int i = z.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            int i3 = (int) j;
            j$.time.temporal.a.MONTH_OF_YEAR.V(i3);
            return Z(i2, i3);
        }
        if (i == 2) {
            return X(j - U());
        }
        int i4 = this.b;
        if (i == 3) {
            if (i2 < 1) {
                j = 1 - j;
            }
            int i5 = (int) j;
            j$.time.temporal.a.YEAR.V(i5);
            return Z(i5, i4);
        }
        if (i == 4) {
            int i6 = (int) j;
            j$.time.temporal.a.YEAR.V(i6);
            return Z(i6, i4);
        }
        if (i != 5) {
            throw new j$.time.temporal.q(AbstractC0112c.a("Unsupported field: ", pVar));
        }
        if (x(j$.time.temporal.a.ERA) == j) {
            return this;
        }
        int i7 = 1 - i2;
        j$.time.temporal.a.YEAR.V(i7);
        return Z(i7, i4);
    }

    final void b0(DataOutput dataOutput) {
        dataOutput.writeInt(this.a);
        dataOutput.writeByte(this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        A a = (A) obj;
        int i = this.a - a.a;
        return i == 0 ? this.b - a.b : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a = (A) obj;
        return this.a == a.a && this.b == a.b;
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        A aV;
        if (temporal instanceof A) {
            aV = (A) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!j$.time.chrono.u.d.equals(AbstractC0121i.p(temporal))) {
                    temporal = i.W(temporal);
                }
                aV = V(temporal.r(j$.time.temporal.a.YEAR), temporal.r(j$.time.temporal.a.MONTH_OF_YEAR));
            } catch (C0111b e) {
                throw new C0111b("Unable to obtain YearMonth from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.p(this, aV);
        }
        long jU = aV.U() - U();
        switch (z.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jU;
            case 2:
                return jU / 12;
            case 3:
                return jU / 120;
            case 4:
                return jU / 1200;
            case 5:
                return jU / 12000;
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return aV.x(aVar) - x(aVar);
            default:
                throw new j$.time.temporal.q("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return pVar == j$.time.temporal.a.YEAR || pVar == j$.time.temporal.a.MONTH_OF_YEAR || pVar == j$.time.temporal.a.PROLEPTIC_MONTH || pVar == j$.time.temporal.a.YEAR_OF_ERA || pVar == j$.time.temporal.a.ERA;
        }
        return pVar != null && pVar.u(this);
    }

    public final int hashCode() {
        return (this.b << 27) ^ this.a;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal p(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int r(j$.time.temporal.p pVar) {
        return u(pVar).a(x(pVar), pVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal t(i iVar) {
        return (A) AbstractC0121i.a(iVar, this);
    }

    public final String toString() {
        int i;
        int i2 = this.a;
        int iAbs = Math.abs(i2);
        StringBuilder sb = new StringBuilder(9);
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
            sb.append(i2);
        }
        int i3 = this.b;
        sb.append(i3 < 10 ? "-0" : "-");
        sb.append(i3);
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r u(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.r.j(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.l.d(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long x(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.t(this);
        }
        int i = z.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return U();
        }
        int i2 = this.a;
        if (i == 3) {
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 4) {
            return i2;
        }
        if (i == 5) {
            return i2 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.q(AbstractC0112c.a("Unsupported field: ", pVar));
    }
}
