package io.sentry.android.core;

import io.sentry.EnumC0094u1;
import java.io.File;

/* JADX INFO: renamed from: io.sentry.android.core.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0016m implements io.sentry.util.b {
    public final /* synthetic */ int l;
    public final /* synthetic */ SentryAndroidOptions m;

    public /* synthetic */ C0016m(SentryAndroidOptions sentryAndroidOptions, int i) {
        this.l = i;
        this.m = sentryAndroidOptions;
    }

    public String a() {
        switch (this.l) {
            case 1:
                return this.m.getCacheDirPath();
            default:
                return this.m.getOutboxPath();
        }
    }

    @Override // io.sentry.util.b
    public Object d() {
        boolean z = false;
        int i = io.sentry.android.core.cache.a.t;
        SentryAndroidOptions sentryAndroidOptions = this.m;
        String outboxPath = sentryAndroidOptions.getOutboxPath();
        if (outboxPath == null) {
            sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
        } else {
            File file = new File(outboxPath, "startup_crash");
            try {
                boolean zExists = file.exists();
                if (zExists && !file.delete()) {
                    sentryAndroidOptions.getLogger().h(EnumC0094u1.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
                }
                z = zExists;
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().v(EnumC0094u1.ERROR, "Error reading/deleting the startup crash marker file on the disk", th);
            }
        }
        return Boolean.valueOf(z);
    }
}
