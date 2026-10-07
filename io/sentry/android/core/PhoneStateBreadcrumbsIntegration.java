package io.sentry.android.core;

import android.content.Context;
import android.telephony.TelephonyManager;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.InterfaceC0002a0;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class PhoneStateBreadcrumbsIntegration implements InterfaceC0002a0, Closeable {
    public final Context l;
    public SentryAndroidOptions m;
    public Y n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TelephonyManager f64o;
    public boolean p = false;
    public final Object q = new Object();

    public PhoneStateBreadcrumbsIntegration(Context context) {
        this.l = context;
    }

    public final void a(io.sentry.K k, I1 i1) {
        TelephonyManager telephonyManager = (TelephonyManager) this.l.getSystemService("phone");
        this.f64o = telephonyManager;
        if (telephonyManager == null) {
            i1.getLogger().h(EnumC0094u1.INFO, "TelephonyManager is not available", new Object[0]);
            return;
        }
        try {
            Y y = new Y(k);
            this.n = y;
            this.f64o.listen(y, 32);
            i1.getLogger().h(EnumC0094u1.DEBUG, "PhoneStateBreadcrumbsIntegration installed.", new Object[0]);
            io.sentry.config.a.a(PhoneStateBreadcrumbsIntegration.class);
        } catch (Throwable th) {
            i1.getLogger().s(EnumC0094u1.INFO, th, "TelephonyManager is not available or ready to use.", new Object[0]);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Y y;
        synchronized (this.q) {
            this.p = true;
        }
        TelephonyManager telephonyManager = this.f64o;
        if (telephonyManager == null || (y = this.n) == null) {
            return;
        }
        telephonyManager.listen(y, 0);
        this.n = null;
        SentryAndroidOptions sentryAndroidOptions = this.m;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "PhoneStateBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC0002a0
    public final void l(I1 i1) {
        SentryAndroidOptions sentryAndroidOptions = i1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) i1 : null;
        io.sentry.config.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.m = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "enableSystemEventBreadcrumbs enabled: %s", Boolean.valueOf(this.m.isEnableSystemEventBreadcrumbs()));
        if (this.m.isEnableSystemEventBreadcrumbs() && io.sentry.config.a.t(this.l, "android.permission.READ_PHONE_STATE")) {
            try {
                i1.getExecutorService().submit(new Z(this, i1));
            } catch (Throwable th) {
                i1.getLogger().v(EnumC0094u1.DEBUG, "Failed to start PhoneStateBreadcrumbsIntegration on executor thread.", th);
            }
        }
    }
}
