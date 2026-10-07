package j$.time.chrono;

import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalQuery;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class v implements o {
    public static final v BCE;
    public static final v CE;
    private static final /* synthetic */ v[] a;

    static {
        v vVar = new v("BCE", 0);
        BCE = vVar;
        v vVar2 = new v("CE", 1);
        CE = vVar2;
        a = new v[]{vVar, vVar2};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) a.clone();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object C(TemporalQuery temporalQuery) {
        return AbstractC0121i.m(this, temporalQuery);
    }

    @Override // j$.time.temporal.m
    public final Temporal E(Temporal temporal) {
        return temporal.d(getValue(), j$.time.temporal.a.ERA);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean g(j$.time.temporal.p pVar) {
        return AbstractC0121i.i(this, pVar);
    }

    @Override // j$.time.chrono.o
    public final int getValue() {
        return ordinal();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int r(j$.time.temporal.p pVar) {
        return AbstractC0121i.f(this, (j$.time.temporal.a) pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r u(j$.time.temporal.p pVar) {
        return j$.time.temporal.l.d(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long x(j$.time.temporal.p pVar) {
        return AbstractC0121i.g(this, pVar);
    }
}
