package o;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: o.cp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1231cp {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    /* JADX INFO: Fake field, exist only in values array */
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    /* JADX INFO: Fake field, exist only in values array */
    HOURS(TimeUnit.HOURS),
    /* JADX INFO: Fake field, exist only in values array */
    DAYS(TimeUnit.DAYS);

    public final TimeUnit l;

    EnumC1231cp(TimeUnit timeUnit) {
        this.l = timeUnit;
    }
}
