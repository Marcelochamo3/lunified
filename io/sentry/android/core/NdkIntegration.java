package io.sentry.android.core;

import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.ILogger;
import io.sentry.InterfaceC0002a0;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class NdkIntegration implements InterfaceC0002a0, Closeable {
    public final Class l;
    public SentryAndroidOptions m;

    public NdkIntegration(Class cls) {
        this.l = cls;
    }

    public static void a(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.m;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class cls = this.l;
        try {
            if (cls != null) {
                try {
                    try {
                        cls.getMethod("close", null).invoke(null, null);
                        this.m.getLogger().h(EnumC0094u1.DEBUG, "NdkIntegration removed.", new Object[0]);
                    } catch (Throwable th) {
                        this.m.getLogger().v(EnumC0094u1.ERROR, "Failed to close SentryNdk.", th);
                    }
                } catch (NoSuchMethodException e) {
                    this.m.getLogger().v(EnumC0094u1.ERROR, "Failed to invoke the SentryNdk.close method.", e);
                }
            }
        } finally {
            a(this.m);
        }
    }

    @Override // io.sentry.InterfaceC0002a0
    public final void l(I1 i1) {
        Class cls;
        SentryAndroidOptions sentryAndroidOptions = i1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) i1 : null;
        io.sentry.config.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.m = sentryAndroidOptions;
        boolean zIsEnableNdk = sentryAndroidOptions.isEnableNdk();
        ILogger logger = this.m.getLogger();
        EnumC0094u1 enumC0094u1 = EnumC0094u1.DEBUG;
        logger.h(enumC0094u1, "NdkIntegration enabled: %s", Boolean.valueOf(zIsEnableNdk));
        if (!zIsEnableNdk || (cls = this.l) == null) {
            a(this.m);
            return;
        }
        if (this.m.getCacheDirPath() == null) {
            this.m.getLogger().h(EnumC0094u1.ERROR, "No cache dir path is defined in options.", new Object[0]);
            a(this.m);
            return;
        }
        try {
            cls.getMethod("init", SentryAndroidOptions.class).invoke(null, this.m);
            this.m.getLogger().h(enumC0094u1, "NdkIntegration installed.", new Object[0]);
            io.sentry.config.a.a(NdkIntegration.class);
        } catch (NoSuchMethodException e) {
            a(this.m);
            this.m.getLogger().v(EnumC0094u1.ERROR, "Failed to invoke the SentryNdk.init method.", e);
        } catch (Throwable th) {
            a(this.m);
            this.m.getLogger().v(EnumC0094u1.ERROR, "Failed to initialize SentryNdk.", th);
        }
    }
}
