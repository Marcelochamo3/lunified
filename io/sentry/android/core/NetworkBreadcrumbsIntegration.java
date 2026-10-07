package io.sentry.android.core;

import android.content.Context;
import android.net.ConnectivityManager;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.ILogger;
import io.sentry.InterfaceC0002a0;
import io.sentry.e2;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class NetworkBreadcrumbsIntegration implements InterfaceC0002a0, Closeable {
    public final Context l;
    public final G m;
    public final ILogger n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public V f62o;

    public NetworkBreadcrumbsIntegration(Context context, ILogger iLogger, G g) {
        this.l = context;
        this.m = g;
        io.sentry.config.a.C(iLogger, "ILogger is required");
        this.n = iLogger;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        V v = this.f62o;
        if (v != null) {
            this.m.getClass();
            Context context = this.l;
            ILogger iLogger = this.n;
            ConnectivityManager connectivityManagerE = e2.e(context, iLogger);
            if (connectivityManagerE != null) {
                try {
                    connectivityManagerE.unregisterNetworkCallback(v);
                } catch (Throwable th) {
                    iLogger.v(EnumC0094u1.WARNING, "unregisterNetworkCallback failed", th);
                }
            }
            iLogger.h(EnumC0094u1.DEBUG, "NetworkBreadcrumbsIntegration remove.", new Object[0]);
        }
        this.f62o = null;
    }

    @Override // io.sentry.InterfaceC0002a0
    public final void l(I1 i1) {
        SentryAndroidOptions sentryAndroidOptions = i1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) i1 : null;
        io.sentry.config.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        EnumC0094u1 enumC0094u1 = EnumC0094u1.DEBUG;
        Object[] objArr = {Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs())};
        ILogger iLogger = this.n;
        iLogger.h(enumC0094u1, "NetworkBreadcrumbsIntegration enabled: %s", objArr);
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            G g = this.m;
            g.getClass();
            V v = new V(g, i1.getDateProvider());
            this.f62o = v;
            if (e2.f(this.l, iLogger, g, v)) {
                iLogger.h(enumC0094u1, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                io.sentry.config.a.a(NetworkBreadcrumbsIntegration.class);
            } else {
                this.f62o = null;
                iLogger.h(enumC0094u1, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
            }
        }
    }
}
