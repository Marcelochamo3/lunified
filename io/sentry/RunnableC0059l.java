package io.sentry;

import android.app.Application;
import android.view.Choreographer;
import io.sentry.android.core.AppLifecycleIntegration;
import io.sentry.android.core.C0004a;
import io.sentry.android.core.SentryPerformanceProvider;
import io.sentry.android.core.TempSensorBreadcrumbsIntegration;
import io.sentry.protocol.C0076c;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: io.sentry.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0059l implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ RunnableC0059l(I1 i1) {
        this.l = 2;
        this.m = E.a;
        this.n = i1;
    }

    private final void a() {
        TempSensorBreadcrumbsIntegration tempSensorBreadcrumbsIntegration = (TempSensorBreadcrumbsIntegration) this.m;
        I1 i1 = (I1) this.n;
        synchronized (tempSensorBreadcrumbsIntegration.q) {
            try {
                if (!tempSensorBreadcrumbsIntegration.p) {
                    tempSensorBreadcrumbsIntegration.a(i1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.sentry.android.core.c0 c0Var;
        switch (this.l) {
            case 0:
                ((C0065n) this.m).g((W) this.n);
                return;
            case 1:
                ((T) this.n).j(((D) this.m).a.getShutdownTimeoutMillis());
                return;
            case 2:
                ((K) this.m).j(((I1) this.n).getFlushTimeoutMillis());
                return;
            case 3:
                C0088s1 c0088s1 = (C0088s1) this.n;
                SpotlightIntegration spotlightIntegration = (SpotlightIntegration) this.m;
                spotlightIntegration.getClass();
                try {
                    I1 i1 = spotlightIntegration.l;
                    if (i1 == null) {
                        throw new IllegalArgumentException("SentryOptions are required to send envelopes.");
                    }
                    HttpURLConnection httpURLConnectionF = SpotlightIntegration.f(i1.getSpotlightConnectionUrl() != null ? spotlightIntegration.l.getSpotlightConnectionUrl() : io.sentry.util.d.a ? "http://10.0.2.2:8969/stream" : "http://localhost:8969/stream");
                    try {
                        OutputStream outputStream = httpURLConnectionF.getOutputStream();
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                            try {
                                spotlightIntegration.l.getSerializer().r(c0088s1, gZIPOutputStream);
                                gZIPOutputStream.close();
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                spotlightIntegration.m.h(EnumC0094u1.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionF.getResponseCode()));
                                return;
                            } catch (Throwable th) {
                                try {
                                    gZIPOutputStream.close();
                                    break;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                break;
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        try {
                            spotlightIntegration.m.v(EnumC0094u1.ERROR, "An exception occurred while submitting the envelope to the Sentry server.", th5);
                            spotlightIntegration.m.h(EnumC0094u1.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionF.getResponseCode()));
                        } finally {
                            spotlightIntegration.m.h(EnumC0094u1.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionF.getResponseCode()));
                            SpotlightIntegration.a(httpURLConnectionF);
                        }
                    }
                } catch (Exception e) {
                    spotlightIntegration.m.v(EnumC0094u1.ERROR, "An exception occurred while creating the connection to spotlight.", e);
                    return;
                }
                break;
            case 4:
                C0004a c0004a = (C0004a) this.m;
                io.sentry.transport.f fVar = (io.sentry.transport.f) this.n;
                c0004a.getClass();
                c0004a.s = fVar.b();
                c0004a.t.set(false);
                return;
            case 5:
                ((AppLifecycleIntegration) this.m).a((K) this.n);
                return;
            case 6:
                io.sentry.android.core.c0 c0Var2 = (io.sentry.android.core.c0) this.m;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.n;
                c0Var2.getClass();
                if (atomicBoolean.compareAndSet(false, true)) {
                    SentryPerformanceProvider sentryPerformanceProvider = c0Var2.f73o;
                    synchronized (sentryPerformanceProvider) {
                        io.sentry.android.core.performance.c cVarC = io.sentry.android.core.performance.c.c();
                        cVarC.c.d();
                        cVarC.b.d();
                        Application application = sentryPerformanceProvider.m;
                        if (application != null && (c0Var = sentryPerformanceProvider.n) != null) {
                            application.unregisterActivityLifecycleCallbacks(c0Var);
                        }
                        break;
                    }
                    return;
                }
                return;
            case 7:
                a();
                return;
            case 8:
                io.sentry.android.core.internal.util.m mVar = (io.sentry.android.core.internal.util.m) this.m;
                mVar.getClass();
                try {
                    mVar.u = Choreographer.getInstance();
                    return;
                } catch (Throwable th6) {
                    ((ILogger) this.n).v(EnumC0094u1.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th6);
                    return;
                }
            case 9:
                io.sentry.android.replay.k kVar = (io.sentry.android.replay.k) this.m;
                String str = (String) this.n;
                if (str == null) {
                    io.sentry.cache.a.a((I1) kVar.b, ".scope-cache", "transaction.json");
                    return;
                } else {
                    io.sentry.cache.a.c((I1) kVar.b, str, ".scope-cache", "transaction.json");
                    return;
                }
            case 10:
                io.sentry.cache.a.c((I1) ((io.sentry.android.replay.k) this.m).b, (Map) this.n, ".scope-cache", "tags.json");
                return;
            case 11:
                io.sentry.android.replay.k kVar2 = (io.sentry.android.replay.k) this.m;
                U1 u1 = (U1) this.n;
                if (u1 == null) {
                    io.sentry.cache.a.a((I1) kVar2.b, ".scope-cache", "trace.json");
                    return;
                } else {
                    io.sentry.cache.a.c((I1) kVar2.b, u1, ".scope-cache", "trace.json");
                    return;
                }
            case 12:
                io.sentry.cache.a.c((I1) ((io.sentry.android.replay.k) this.m).b, (Collection) this.n, ".scope-cache", "breadcrumbs.json");
                return;
            case 13:
                Runnable runnable = (Runnable) this.n;
                io.sentry.android.replay.k kVar3 = (io.sentry.android.replay.k) this.m;
                kVar3.getClass();
                try {
                    runnable.run();
                    return;
                } catch (Throwable th7) {
                    ((I1) kVar3.b).getLogger().v(EnumC0094u1.ERROR, "Serialization task failed", th7);
                    return;
                }
            default:
                io.sentry.cache.a.c((I1) ((io.sentry.android.replay.k) this.m).b, (C0076c) this.n, ".scope-cache", "contexts.json");
                return;
        }
    }

    public /* synthetic */ RunnableC0059l(AppLifecycleIntegration appLifecycleIntegration) {
        this.l = 5;
        E e = E.a;
        this.m = appLifecycleIntegration;
        this.n = e;
    }

    public /* synthetic */ RunnableC0059l(Object obj, int i, Object obj2) {
        this.l = i;
        this.m = obj;
        this.n = obj2;
    }
}
