package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Handler;
import io.sentry.C0042f0;
import io.sentry.C0083q1;
import io.sentry.EnumC0094u1;
import io.sentry.ILogger;
import io.sentry.RunnableC0059l;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import o.AbstractC1674hK;
import o.AbstractC1701hf0;

/* JADX INFO: renamed from: io.sentry.android.core.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0004a extends Thread {
    public final boolean l;
    public final C0011h m;
    public final G n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final io.sentry.transport.f f72o;
    public final long p;
    public final long q;
    public final ILogger r;
    public volatile long s;
    public final AtomicBoolean t;
    public final Context u;
    public final RunnableC0059l v;

    public C0004a(long j, boolean z, C0011h c0011h, ILogger iLogger, Context context) {
        C0042f0 c0042f0 = new C0042f0(3);
        G g = new G(3);
        super("|ANR-WatchDog|");
        this.s = 0L;
        this.t = new AtomicBoolean(false);
        this.f72o = c0042f0;
        this.q = j;
        this.p = 500L;
        this.l = z;
        this.m = c0011h;
        this.r = iLogger;
        this.n = g;
        this.u = context;
        this.v = new RunnableC0059l(this, 4, c0042f0);
        if (j < 1000) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", 1000L));
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        this.v.run();
        while (!isInterrupted()) {
            ((Handler) this.n.l).post(this.v);
            try {
                Thread.sleep(this.p);
                if (this.f72o.b() - this.s > this.q) {
                    if (this.l || !(Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        ActivityManager activityManager = (ActivityManager) this.u.getSystemService("activity");
                        if (activityManager != null) {
                            try {
                                processesInErrorState = activityManager.getProcessesInErrorState();
                            } catch (Throwable th) {
                                this.r.v(EnumC0094u1.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th);
                                processesInErrorState = null;
                            }
                            if (processesInErrorState != null) {
                                Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (it.next().condition == 2) {
                                        }
                                    }
                                }
                            }
                        }
                        if (this.t.compareAndSet(false, true)) {
                            ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(AbstractC1674hK.q(new StringBuilder("Application Not Responding for at least "), this.q, " ms."), ((Handler) this.n.l).getLooper().getThread());
                            C0011h c0011h = this.m;
                            ((AnrIntegration) c0011h.l).getClass();
                            SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) c0011h.n;
                            sentryAndroidOptions.getLogger().h(EnumC0094u1.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
                            boolean zEquals = Boolean.TRUE.equals(B.b.a);
                            String strT = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
                            if (zEquals) {
                                strT = AbstractC1701hf0.t("Background ", strT);
                            }
                            ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(strT, applicationNotResponding.l);
                            io.sentry.protocol.j jVar = new io.sentry.protocol.j();
                            jVar.l = "ANR";
                            C0083q1 c0083q1 = new C0083q1(new io.sentry.exception.a(jVar, applicationNotResponding2, applicationNotResponding2.l, true));
                            c0083q1.F = EnumC0094u1.ERROR;
                            ((io.sentry.K) c0011h.m).w(c0083q1, io.sentry.config.a.b(new C0023u(zEquals)));
                        }
                    } else {
                        this.r.h(EnumC0094u1.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.t.set(true);
                    }
                }
            } catch (InterruptedException e) {
                try {
                    Thread.currentThread().interrupt();
                    this.r.h(EnumC0094u1.WARNING, "Interrupted: %s", e.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.r.h(EnumC0094u1.WARNING, "Failed to interrupt due to SecurityException: %s", e.getMessage());
                    return;
                }
            }
        }
    }
}
