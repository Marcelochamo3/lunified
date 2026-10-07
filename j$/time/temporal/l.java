package j$.time.temporal;

import j$.time.AbstractC0112c;
import j$.time.C0111b;
import j$.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class l {
    static final TemporalQuery a = new o(1);
    static final TemporalQuery b = new o(2);
    static final TemporalQuery c = new o(3);
    static final TemporalQuery d = new o(4);
    static final TemporalQuery e = new o(5);
    static final TemporalQuery f = new o(6);
    static final TemporalQuery g = new o(7);

    public static int a(TemporalAccessor temporalAccessor, p pVar) {
        r rVarU = temporalAccessor.u(pVar);
        if (!rVarU.h()) {
            throw new q("Invalid field " + pVar + " for get() method, use getLong() instead");
        }
        long jX = temporalAccessor.x(pVar);
        if (rVarU.i(jX)) {
            return (int) jX;
        }
        throw new C0111b("Invalid value for " + pVar + " (valid values " + rVarU + "): " + jX);
    }

    public static Temporal b(Temporal temporal, long j, TemporalUnit temporalUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            temporal = temporal.e(Long.MAX_VALUE, temporalUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return temporal.e(j2, temporalUnit);
    }

    public static Object c(TemporalAccessor temporalAccessor, TemporalQuery temporalQuery) {
        if (temporalQuery == a || temporalQuery == b || temporalQuery == c) {
            return null;
        }
        return temporalQuery.queryFrom(temporalAccessor);
    }

    public static r d(TemporalAccessor temporalAccessor, p pVar) {
        if (!(pVar instanceof a)) {
            Objects.requireNonNull(pVar, "field");
            return pVar.C(temporalAccessor);
        }
        if (temporalAccessor.g(pVar)) {
            return ((a) pVar).p();
        }
        throw new q(AbstractC0112c.a("Unsupported field: ", pVar));
    }

    public static TemporalQuery e() {
        return b;
    }

    public static TemporalQuery f() {
        return f;
    }

    public static TemporalQuery g() {
        return g;
    }

    public static /* synthetic */ int h(int i) {
        int i2 = i % 7;
        if (i2 == 0) {
            return 0;
        }
        return (((i ^ 7) >> 31) | 1) > 0 ? i2 : i2 + 7;
    }

    public static TemporalQuery i() {
        return d;
    }

    public static TemporalQuery j() {
        return c;
    }

    public static TemporalQuery k() {
        return e;
    }

    public static TemporalQuery l() {
        return a;
    }
}
