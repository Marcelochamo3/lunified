package io.sentry.android.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.ILogger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import o.AbstractC1474fG;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f63o;
    public final /* synthetic */ Object p;

    public /* synthetic */ O(EnvelopeFileObserverIntegration envelopeFileObserverIntegration, I1 i1, String str) {
        this.l = 0;
        io.sentry.E e = io.sentry.E.a;
        this.m = envelopeFileObserverIntegration;
        this.n = e;
        this.f63o = i1;
        this.p = str;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [io.sentry.android.replay.o] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                EnvelopeFileObserverIntegration envelopeFileObserverIntegration = (EnvelopeFileObserverIntegration) this.m;
                io.sentry.K k = (io.sentry.K) this.n;
                I1 i1 = (I1) this.f63o;
                String str = (String) this.p;
                synchronized (envelopeFileObserverIntegration.f59o) {
                    try {
                        if (!envelopeFileObserverIntegration.n) {
                            envelopeFileObserverIntegration.f(k, i1, str);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 1:
                Window window = (Window) this.m;
                View viewPeekDecorView = window.peekDecorView();
                if (viewPeekDecorView != null) {
                    window.setCallback((Window.Callback) this.n);
                    io.sentry.android.core.internal.util.g.a(viewPeekDecorView, (Runnable) this.f63o, (G) this.p);
                    return;
                }
                return;
            case 2:
                View view = (View) this.m;
                Canvas canvas = (Canvas) this.n;
                ILogger iLogger = (ILogger) this.f63o;
                CountDownLatch countDownLatch = (CountDownLatch) this.p;
                try {
                    view.draw(canvas);
                    break;
                } catch (Throwable th2) {
                    try {
                        iLogger.v(EnumC0094u1.ERROR, "Taking screenshot failed (view.draw).", th2);
                    } finally {
                        countDownLatch.countDown();
                    }
                    break;
                }
                return;
            default:
                Window window2 = (Window) this.n;
                final View view2 = (View) this.p;
                final io.sentry.android.replay.q qVar = (io.sentry.android.replay.q) this.m;
                AbstractC1474fG.j(qVar, "this$0");
                final Bitmap bitmap = (Bitmap) this.f63o;
                AbstractC1474fG.j(bitmap, "$bitmap");
                try {
                    qVar.w.set(false);
                    PixelCopy.request(window2, bitmap, (PixelCopy.OnPixelCopyFinishedListener) new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.o
                        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                        public final void onPixelCopyFinished(int i) {
                            q qVar2 = qVar;
                            Bitmap bitmap2 = bitmap;
                            View view3 = view2;
                            AbstractC1474fG.j(qVar2, "this$0");
                            AbstractC1474fG.j(bitmap2, "$bitmap");
                            I1 i2 = qVar2.m;
                            if (i != 0) {
                                i2.getLogger().h(EnumC0094u1.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i));
                                bitmap2.recycle();
                            } else if (qVar2.w.get()) {
                                i2.getLogger().h(EnumC0094u1.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
                                bitmap2.recycle();
                            } else {
                                io.sentry.android.replay.viewhierarchy.d dVarH = io.sentry.config.a.h(view3, null, 0, i2);
                                qVar2.b(view3, dVarH);
                                ((ScheduledExecutorService) qVar2.p.getValue()).submit(new io.sentry.android.replay.util.a(bitmap2, qVar2, dVarH, 2));
                            }
                        }
                    }, (Handler) qVar.n.l);
                    return;
                } catch (Throwable th3) {
                    qVar.m.getLogger().v(EnumC0094u1.WARNING, "Failed to capture replay recording", th3);
                    bitmap.recycle();
                    return;
                }
        }
    }

    public /* synthetic */ O(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.l = i;
        this.m = obj;
        this.n = obj2;
        this.f63o = obj3;
        this.p = obj4;
    }
}
