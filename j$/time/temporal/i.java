package j$.time.temporal;

import j$.time.chrono.AbstractC0113a;
import j$.time.chrono.AbstractC0121i;
import j$.time.chrono.u;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i {
    public static final p a = g.QUARTER_OF_YEAR;
    public static final p b = g.WEEK_OF_WEEK_BASED_YEAR;
    public static final p c = g.WEEK_BASED_YEAR;
    public static final TemporalUnit d = h.WEEK_BASED_YEARS;

    static {
        h hVar = h.WEEK_BASED_YEARS;
    }

    static boolean a(TemporalAccessor temporalAccessor) {
        return ((AbstractC0113a) AbstractC0121i.p(temporalAccessor)).equals(u.d);
    }
}
