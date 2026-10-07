package io.sentry;

import java.util.Locale;

/* JADX INFO: renamed from: io.sentry.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0093u0 {
    NANOSECOND,
    MICROSECOND,
    MILLISECOND,
    SECOND,
    MINUTE,
    HOUR,
    DAY,
    WEEK;

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
