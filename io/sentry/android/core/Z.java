package io.sentry.android.core;

import io.sentry.EnumC0053j;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.L0;
import io.sentry.W0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Z implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f71o;

    public /* synthetic */ Z(AnrIntegration anrIntegration, SentryAndroidOptions sentryAndroidOptions) {
        this.l = 2;
        io.sentry.E e = io.sentry.E.a;
        this.m = anrIntegration;
        this.f71o = e;
        this.n = sentryAndroidOptions;
    }

    private final void a() {
        AnrIntegration anrIntegration = (AnrIntegration) this.m;
        io.sentry.K k = (io.sentry.K) this.f71o;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.n;
        synchronized (anrIntegration.n) {
            try {
                if (!anrIntegration.m) {
                    anrIntegration.a(k, sentryAndroidOptions);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        PhoneStateBreadcrumbsIntegration phoneStateBreadcrumbsIntegration = (PhoneStateBreadcrumbsIntegration) this.m;
        io.sentry.K k = (io.sentry.K) this.f71o;
        I1 i1 = (I1) this.n;
        synchronized (phoneStateBreadcrumbsIntegration.q) {
            try {
                if (!phoneStateBreadcrumbsIntegration.p) {
                    phoneStateBreadcrumbsIntegration.a(k, i1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.n;
                SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration = (SendCachedEnvelopeIntegration) this.m;
                sendCachedEnvelopeIntegration.getClass();
                try {
                    if (sendCachedEnvelopeIntegration.t.get()) {
                        sentryAndroidOptions.getLogger().h(EnumC0094u1.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);
                        return;
                    }
                    boolean andSet = sendCachedEnvelopeIntegration.s.getAndSet(true);
                    io.sentry.K k = (io.sentry.K) this.f71o;
                    if (!andSet) {
                        io.sentry.H connectionStatusProvider = sentryAndroidOptions.getConnectionStatusProvider();
                        sendCachedEnvelopeIntegration.f66o = connectionStatusProvider;
                        connectionStatusProvider.b(sendCachedEnvelopeIntegration);
                        sendCachedEnvelopeIntegration.r = sendCachedEnvelopeIntegration.l.a(k, sentryAndroidOptions);
                    }
                    io.sentry.H h = sendCachedEnvelopeIntegration.f66o;
                    if (h != null && h.a() == io.sentry.F.DISCONNECTED) {
                        sentryAndroidOptions.getLogger().h(EnumC0094u1.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
                        return;
                    }
                    io.sentry.r rVarE = k.e();
                    if (rVarE != null && rVarE.b(EnumC0053j.All)) {
                        sentryAndroidOptions.getLogger().h(EnumC0094u1.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
                        return;
                    }
                    W0 w0 = sendCachedEnvelopeIntegration.r;
                    if (w0 == null) {
                        sentryAndroidOptions.getLogger().h(EnumC0094u1.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
                        return;
                    } else {
                        w0.a();
                        return;
                    }
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().v(EnumC0094u1.ERROR, "Failed trying to send cached events.", th);
                    return;
                }
            case 1:
                Runnable runnable = (Runnable) this.n;
                L0 l0 = (L0) this.m;
                l0.getClass();
                try {
                    runnable.run();
                    return;
                } catch (Throwable unused) {
                    String str = (String) this.f71o;
                    if (str != null) {
                        ((SentryAndroidOptions) l0.b).getLogger().h(EnumC0094u1.WARNING, "Failed to execute ".concat(str), new Object[0]);
                        return;
                    }
                    return;
                }
            case 2:
                a();
                return;
            case 3:
                b();
                return;
            default:
                SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = (SystemEventsBreadcrumbsIntegration) this.m;
                io.sentry.K k2 = (io.sentry.K) this.f71o;
                I1 i1 = (I1) this.n;
                synchronized (systemEventsBreadcrumbsIntegration.q) {
                    try {
                        if (!systemEventsBreadcrumbsIntegration.p) {
                            systemEventsBreadcrumbsIntegration.a(k2, (SentryAndroidOptions) i1);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    public /* synthetic */ Z(PhoneStateBreadcrumbsIntegration phoneStateBreadcrumbsIntegration, I1 i1) {
        this.l = 3;
        io.sentry.E e = io.sentry.E.a;
        this.m = phoneStateBreadcrumbsIntegration;
        this.f71o = e;
        this.n = i1;
    }

    public /* synthetic */ Z(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, I1 i1) {
        this.l = 4;
        io.sentry.E e = io.sentry.E.a;
        this.m = systemEventsBreadcrumbsIntegration;
        this.f71o = e;
        this.n = i1;
    }

    public /* synthetic */ Z(Object obj, Object obj2, Object obj3, int i) {
        this.l = i;
        this.m = obj;
        this.n = obj2;
        this.f71o = obj3;
    }
}
