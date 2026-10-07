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
import o.C3285xv;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements Temporal, j$.time.temporal.m, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    private final int a;

    static {
        j$.time.format.v vVar = new j$.time.format.v();
        vVar.p(j$.time.temporal.a.YEAR, 4, 10, F.EXCEEDS_PAD);
        vVar.y(Locale.getDefault());
    }

    private y(int i) {
        this.a = i;
    }

    public static y U(int i) {
        j$.time.temporal.a.YEAR.V(i);
        return new y(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w(C3285xv.h, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object C(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.l.e()) {
            return j$.time.chrono.u.d;
        }
        return temporalQuery == j$.time.temporal.l.j() ? ChronoUnit.YEARS : j$.time.temporal.l.c(this, temporalQuery);
    }

    @Override // j$.time.temporal.m
    public final Temporal E(Temporal temporal) {
        if (!((AbstractC0113a) AbstractC0121i.p(temporal)).equals(j$.time.chrono.u.d)) {
            throw new C0111b("Adjustment only supported on ISO date-time");
        }
        return temporal.d(this.a, j$.time.temporal.a.YEAR);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final y e(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (y) temporalUnit.r(this, j);
        }
        int i = x.b[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return W(j);
        }
        if (i == 2) {
            return W(j$.com.android.tools.r8.a.l(j, 10));
        }
        if (i == 3) {
            return W(j$.com.android.tools.r8.a.l(j, 100));
        }
        if (i == 4) {
            return W(j$.com.android.tools.r8.a.l(j, 1000));
        }
        if (i == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return d(j$.com.android.tools.r8.a.f(x(aVar), j), aVar);
        }
        throw new j$.time.temporal.q("Unsupported unit: " + temporalUnit);
    }

    public final y W(long j) {
        return j == 0 ? this : U(j$.time.temporal.a.YEAR.U(((long) this.a) + j));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final y d(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (y) pVar.x(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.V(j);
        int i = x.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                j = 1 - j;
            }
            return U((int) j);
        }
        if (i == 2) {
            return U((int) j);
        }
        if (i == 3) {
            return x(j$.time.temporal.a.ERA) == j ? this : U(1 - i2);
        }
        throw new j$.time.temporal.q(AbstractC0112c.a("Unsupported field: ", pVar));
    }

    final void Y(DataOutput dataOutput) {
        dataOutput.writeInt(this.a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((y) obj).a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.a == ((y) obj).a;
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        y yVarU;
        if (temporal instanceof y) {
            yVarU = (y) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!j$.time.chrono.u.d.equals(AbstractC0121i.p(temporal))) {
                    temporal = i.W(temporal);
                }
                yVarU = U(temporal.r(j$.time.temporal.a.YEAR));
            } catch (C0111b e) {
                throw new C0111b("Unable to obtain Year from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.p(this, yVarU);
        }
        long j = ((long) yVarU.a) - ((long) this.a);
        int i = x.b[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return j;
        }
        if (i == 2) {
            return j / 10;
        }
        if (i == 3) {
            return j / 100;
        }
        if (i == 4) {
            return j / 1000;
        }
        if (i == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return yVarU.x(aVar) - x(aVar);
        }
        throw new j$.time.temporal.q("Unsupported unit: " + temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return pVar == j$.time.temporal.a.YEAR || pVar == j$.time.temporal.a.YEAR_OF_ERA || pVar == j$.time.temporal.a.ERA;
        }
        return pVar != null && pVar.u(this);
    }

    public final int hashCode() {
        return this.a;
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
        return (y) AbstractC0121i.a(iVar, this);
    }

    public final String toString() {
        return Integer.toString(this.a);
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
        int i = x.a[((j$.time.temporal.a) pVar).ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 2) {
            return i2;
        }
        if (i == 3) {
            return i2 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.q(AbstractC0112c.a("Unsupported field: ", pVar));
    }
}
