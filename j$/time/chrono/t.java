package j$.time.chrono;

import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalQuery;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class t implements o {
    public static final t AH;
    private static final /* synthetic */ t[] a;

    static {
        t tVar = new t("AH", 0);
        AH = tVar;
        a = new t[]{tVar};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) a.clone();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object C(TemporalQuery temporalQuery) {
        return AbstractC0121i.m(this, temporalQuery);
    }

    @Override // j$.time.temporal.m
    public final Temporal E(Temporal temporal) {
        return temporal.d(1, j$.time.temporal.a.ERA);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean g(j$.time.temporal.p pVar) {
        return AbstractC0121i.i(this, pVar);
    }

    @Override // j$.time.chrono.o
    public final int getValue() {
        return 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int r(j$.time.temporal.p pVar) {
        return AbstractC0121i.f(this, (j$.time.temporal.a) pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r u(j$.time.temporal.p pVar) {
        return pVar == j$.time.temporal.a.ERA ? j$.time.temporal.r.j(1L, 1L) : j$.time.temporal.l.d(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long x(j$.time.temporal.p pVar) {
        return AbstractC0121i.g(this, pVar);
    }
}
