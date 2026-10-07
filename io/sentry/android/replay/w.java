package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.view.View;
import io.sentry.C0072p0;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.android.core.RunnableC0006c;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o.AP;
import o.AbstractC1474fG;
import o.CJ;
import o.IJ;
import o.Rh0;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Closeable {
    public final I1 l;
    public final ReplayIntegration m;
    public final ReplayIntegration n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0072p0 f104o;
    public final CJ p;
    public final AtomicBoolean q;
    public final ArrayList r;
    public q s;
    public ScheduledFuture t;
    public final Rh0 u;
    public final t v;

    public w(I1 i1, ReplayIntegration replayIntegration, ReplayIntegration replayIntegration2, C0072p0 c0072p0) {
        AbstractC1474fG.j(c0072p0, "mainLooperHandler");
        this.l = i1;
        this.m = replayIntegration;
        this.n = replayIntegration2;
        this.f104o = c0072p0;
        this.p = AP.m(IJ.n, a.u);
        this.q = new AtomicBoolean(false);
        this.r = new ArrayList();
        this.u = new Rh0(a.t);
        this.v = new t(this);
    }

    public final void a(r rVar) {
        ScheduledFuture<?> scheduledFutureScheduleAtFixedRate;
        if (this.q.getAndSet(true)) {
            return;
        }
        I1 i1 = this.l;
        this.s = new q(rVar, i1, this.f104o, this.m);
        ((n) this.p.getValue()).a.add(this.v);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.u.getValue();
        AbstractC1474fG.i(scheduledExecutorService, "capturer");
        long j = 1000 / ((long) rVar.e);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        RunnableC0006c runnableC0006c = new RunnableC0006c(4, this);
        AbstractC1474fG.j(timeUnit, "unit");
        try {
            scheduledFutureScheduleAtFixedRate = scheduledExecutorService.scheduleAtFixedRate(new io.sentry.android.replay.util.a(runnableC0006c, i1), 0L, j, timeUnit);
        } catch (Throwable th) {
            i1.getLogger().v(EnumC0094u1.ERROR, "Failed to submit task WindowRecorder.capture to executor", th);
            scheduledFutureScheduleAtFixedRate = null;
        }
        this.t = scheduledFutureScheduleAtFixedRate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.u.getValue();
        AbstractC1474fG.i(scheduledExecutorService, "capturer");
        io.sentry.config.a.s(scheduledExecutorService, this.l);
    }

    public final void f() {
        ((n) this.p.getValue()).a.remove(this.v);
        ArrayList<WeakReference> arrayList = this.r;
        for (WeakReference weakReference : arrayList) {
            q qVar = this.s;
            if (qVar != null) {
                qVar.c((View) weakReference.get());
            }
        }
        q qVar2 = this.s;
        if (qVar2 != null) {
            WeakReference weakReference2 = qVar2.q;
            qVar2.c(weakReference2 != null ? (View) weakReference2.get() : null);
            WeakReference weakReference3 = qVar2.q;
            if (weakReference3 != null) {
                weakReference3.clear();
            }
            Bitmap bitmap = qVar2.y;
            if (bitmap != null) {
                bitmap.recycle();
            }
            qVar2.r.set(null);
            qVar2.x.set(false);
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) qVar2.p.getValue();
            AbstractC1474fG.i(scheduledExecutorService, "recorder");
            io.sentry.config.a.s(scheduledExecutorService, qVar2.m);
        }
        arrayList.clear();
        this.s = null;
        ScheduledFuture scheduledFuture = this.t;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.t = null;
        this.q.set(false);
    }
}
