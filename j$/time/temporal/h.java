package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
enum h implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears", Duration.ofSeconds(31556952)),
    QUARTER_YEARS("QuarterYears", Duration.ofSeconds(7889238));

    private final String a;
    private final Duration b;

    h(String str, Duration duration) {
        this.a = str;
        this.b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final long p(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.f(temporal2, this);
        }
        int i = b.a[ordinal()];
        if (i == 1) {
            p pVar = i.c;
            return j$.com.android.tools.r8.a.m(temporal2.x(pVar), temporal.x(pVar));
        }
        if (i == 2) {
            return temporal.f(temporal2, ChronoUnit.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Temporal r(Temporal temporal, long j) {
        int i = b.a[ordinal()];
        if (i == 1) {
            p pVar = i.c;
            return temporal.d(j$.com.android.tools.r8.a.f(temporal.r(pVar), j), pVar);
        }
        if (i == 2) {
            return temporal.e(j / 4, ChronoUnit.YEARS).e((j % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // j$.time.temporal.TemporalUnit
    public final boolean t() {
        return true;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Duration u() {
        return this.b;
    }
}
