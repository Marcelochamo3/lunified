package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import io.sentry.C0041f;
import io.sentry.C0104y;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.ILogger;
import io.sentry.InterfaceC0002a0;
import io.sentry.protocol.EnumC0078e;
import java.io.Closeable;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class AppComponentsBreadcrumbsIntegration implements InterfaceC0002a0, Closeable, ComponentCallbacks2 {
    public final Context l;
    public io.sentry.K m;
    public SentryAndroidOptions n;

    public AppComponentsBreadcrumbsIntegration(Context context) {
        this.l = context;
    }

    public final void a(Integer num) {
        if (this.m != null) {
            C0041f c0041f = new C0041f();
            if (num != null) {
                if (num.intValue() < 40) {
                    return;
                } else {
                    c0041f.b(num, "level");
                }
            }
            c0041f.n = "system";
            c0041f.p = "device.event";
            c0041f.m = "Low memory";
            c0041f.b("LOW_MEMORY", "action");
            c0041f.q = EnumC0094u1.WARNING;
            this.m.f(c0041f);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.l.unregisterComponentCallbacks(this);
        } catch (Throwable th) {
            SentryAndroidOptions sentryAndroidOptions = this.n;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().s(EnumC0094u1.DEBUG, th, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.n;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().h(EnumC0094u1.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC0002a0
    public final void l(I1 i1) {
        this.m = io.sentry.E.a;
        SentryAndroidOptions sentryAndroidOptions = i1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) i1 : null;
        io.sentry.config.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.n = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        EnumC0094u1 enumC0094u1 = EnumC0094u1.DEBUG;
        logger.h(enumC0094u1, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.n.isEnableAppComponentBreadcrumbs()));
        if (this.n.isEnableAppComponentBreadcrumbs()) {
            try {
                this.l.registerComponentCallbacks(this);
                i1.getLogger().h(enumC0094u1, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                io.sentry.config.a.a(AppComponentsBreadcrumbsIntegration.class);
            } catch (Throwable th) {
                this.n.setEnableAppComponentBreadcrumbs(false);
                i1.getLogger().s(EnumC0094u1.INFO, th, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        EnumC0078e enumC0078e;
        if (this.m != null) {
            int i = this.l.getResources().getConfiguration().orientation;
            if (i != 1) {
                enumC0078e = i != 2 ? null : EnumC0078e.LANDSCAPE;
            } else {
                enumC0078e = EnumC0078e.PORTRAIT;
            }
            String lowerCase = enumC0078e != null ? enumC0078e.name().toLowerCase(Locale.ROOT) : "undefined";
            C0041f c0041f = new C0041f();
            c0041f.n = "navigation";
            c0041f.p = "device.orientation";
            c0041f.b(lowerCase, "position");
            c0041f.q = EnumC0094u1.INFO;
            C0104y c0104y = new C0104y();
            c0104y.c(configuration, "android:configuration");
            this.m.c(c0041f, c0104y);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        a(null);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        a(Integer.valueOf(i));
    }
}
