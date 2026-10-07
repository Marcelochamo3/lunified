package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import io.sentry.C0001a;
import io.sentry.C0083q1;
import io.sentry.C0104y;
import io.sentry.EnumC0094u1;
import io.sentry.ILogger;
import io.sentry.InterfaceC0092u;
import io.sentry.K1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC1674hK;

/* JADX INFO: loaded from: classes.dex */
public final class ViewHierarchyEventProcessor implements InterfaceC0092u {
    public final SentryAndroidOptions l;
    public final io.sentry.android.core.internal.util.d m;

    public ViewHierarchyEventProcessor(SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.config.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.l = sentryAndroidOptions;
        this.m = new io.sentry.android.core.internal.util.d(3, 2000L);
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            io.sentry.config.a.a(ViewHierarchyEventProcessor.class);
        }
    }

    public static void b(View view, io.sentry.protocol.G g, List list) {
        if (view instanceof ViewGroup) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                AbstractC1674hK.w(it.next());
                throw null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    io.sentry.protocol.G gC = c(childAt);
                    arrayList.add(gC);
                    b(childAt, gC, list);
                }
            }
            g.v = arrayList;
        }
    }

    public static io.sentry.protocol.G c(View view) {
        io.sentry.protocol.G g = new io.sentry.protocol.G();
        g.m = io.sentry.config.a.i(view);
        try {
            g.n = io.sentry.config.a.o(view);
        } catch (Throwable unused) {
        }
        g.r = Double.valueOf(view.getX());
        g.s = Double.valueOf(view.getY());
        g.p = Double.valueOf(view.getWidth());
        g.q = Double.valueOf(view.getHeight());
        g.u = Double.valueOf(view.getAlpha());
        int visibility = view.getVisibility();
        if (visibility == 0) {
            g.t = "visible";
        } else if (visibility == 4) {
            g.t = "invisible";
        } else if (visibility == 8) {
            g.t = "gone";
        }
        return g;
    }

    @Override // io.sentry.InterfaceC0092u
    public final K1 a(K1 k1, C0104y c0104y) {
        return k1;
    }

    @Override // io.sentry.InterfaceC0092u
    public final io.sentry.protocol.A f(io.sentry.protocol.A a, C0104y c0104y) {
        return a;
    }

    @Override // io.sentry.InterfaceC0092u
    public final C0083q1 i(C0083q1 c0083q1, C0104y c0104y) {
        if (!c0083q1.c()) {
            return c0083q1;
        }
        SentryAndroidOptions sentryAndroidOptions = this.l;
        if (!sentryAndroidOptions.isAttachViewHierarchy()) {
            sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
            return c0083q1;
        }
        if (io.sentry.config.a.v(c0104y)) {
            return c0083q1;
        }
        boolean zB = this.m.b();
        sentryAndroidOptions.getBeforeViewHierarchyCaptureCallback();
        if (zB) {
            return c0083q1;
        }
        WeakReference weakReference = (WeakReference) G.m.l;
        io.sentry.protocol.F f = null;
        Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
        final List<Object> viewHierarchyExporters = sentryAndroidOptions.getViewHierarchyExporters();
        io.sentry.util.thread.a mainThreadChecker = sentryAndroidOptions.getMainThreadChecker();
        final ILogger logger = sentryAndroidOptions.getLogger();
        if (activity == null) {
            logger.h(EnumC0094u1.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
        } else {
            Window window = activity.getWindow();
            if (window == null) {
                logger.h(EnumC0094u1.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
            } else {
                final View viewPeekDecorView = window.peekDecorView();
                if (viewPeekDecorView == null) {
                    logger.h(EnumC0094u1.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
                } else {
                    try {
                        if (mainThreadChecker.a()) {
                            ArrayList arrayList = new ArrayList(1);
                            io.sentry.protocol.F f2 = new io.sentry.protocol.F("android_view_system", arrayList);
                            io.sentry.protocol.G gC = c(viewPeekDecorView);
                            arrayList.add(gC);
                            b(viewPeekDecorView, gC, viewHierarchyExporters);
                            f = f2;
                        } else {
                            final CountDownLatch countDownLatch = new CountDownLatch(1);
                            final AtomicReference atomicReference = new AtomicReference(null);
                            activity.runOnUiThread(new Runnable() { // from class: io.sentry.android.core.h0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AtomicReference atomicReference2 = atomicReference;
                                    View view = viewPeekDecorView;
                                    List list = viewHierarchyExporters;
                                    CountDownLatch countDownLatch2 = countDownLatch;
                                    try {
                                        ArrayList arrayList2 = new ArrayList(1);
                                        io.sentry.protocol.F f3 = new io.sentry.protocol.F("android_view_system", arrayList2);
                                        io.sentry.protocol.G gC2 = ViewHierarchyEventProcessor.c(view);
                                        arrayList2.add(gC2);
                                        ViewHierarchyEventProcessor.b(view, gC2, list);
                                        atomicReference2.set(f3);
                                        countDownLatch2.countDown();
                                    } catch (Throwable th) {
                                        logger.v(EnumC0094u1.ERROR, "Failed to process view hierarchy.", th);
                                    }
                                }
                            });
                            if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                f = (io.sentry.protocol.F) atomicReference.get();
                            }
                        }
                    } catch (Throwable th) {
                        logger.v(EnumC0094u1.ERROR, "Failed to process view hierarchy.", th);
                    }
                }
            }
        }
        if (f != null) {
            c0104y.d = new C0001a(f);
        }
        return c0083q1;
    }
}
