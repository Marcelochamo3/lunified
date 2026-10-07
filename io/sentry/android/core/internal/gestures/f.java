package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import io.sentry.C0039e0;
import io.sentry.C0041f;
import io.sentry.C0042f0;
import io.sentry.C0104y;
import io.sentry.EnumC0094u1;
import io.sentry.ILogger;
import io.sentry.K;
import io.sentry.W;
import io.sentry.Y1;
import io.sentry.android.core.C0008e;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.f2;
import io.sentry.g2;
import io.sentry.protocol.C;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import o.AbstractC1701hf0;

/* JADX INFO: loaded from: classes.dex */
public final class f implements GestureDetector.OnGestureListener {
    public final WeakReference l;
    public final K m;
    public final SentryAndroidOptions n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public io.sentry.internal.gestures.b f77o = null;
    public W p = null;
    public d q;
    public final e r;

    public f(Activity activity, K k, SentryAndroidOptions sentryAndroidOptions) {
        d dVar = d.Unknown;
        this.q = dVar;
        e eVar = new e();
        eVar.a = dVar;
        eVar.c = 0.0f;
        eVar.d = 0.0f;
        this.r = eVar;
        this.l = new WeakReference(activity);
        this.m = k;
        this.n = sentryAndroidOptions;
    }

    public static String c(d dVar) {
        int i = c.a[dVar.ordinal()];
        if (i == 1) {
            return "click";
        }
        if (i != 2) {
            return i != 3 ? "unknown" : "swipe";
        }
        return "scroll";
    }

    public final void a(io.sentry.internal.gestures.b bVar, d dVar, Map map, MotionEvent motionEvent) {
        if (this.n.isEnableUserInteractionBreadcrumbs()) {
            String strC = c(dVar);
            C0104y c0104y = new C0104y();
            c0104y.c(motionEvent, "android:motionEvent");
            c0104y.c(bVar.a.get(), "android:view");
            C0041f c0041f = new C0041f();
            c0041f.n = "user";
            c0041f.p = "ui.".concat(strC);
            String str = bVar.c;
            if (str != null) {
                c0041f.b(str, "view.id");
            }
            String str2 = bVar.b;
            if (str2 != null) {
                c0041f.b(str2, "view.class");
            }
            String str3 = bVar.d;
            if (str3 != null) {
                c0041f.b(str3, "view.tag");
            }
            for (Map.Entry entry : map.entrySet()) {
                c0041f.f111o.put((String) entry.getKey(), entry.getValue());
            }
            c0041f.q = EnumC0094u1.INFO;
            this.m.c(c0041f, c0104y);
        }
    }

    public final View b(String str) {
        Activity activity = (Activity) this.l.get();
        SentryAndroidOptions sentryAndroidOptions = this.n;
        if (activity == null) {
            sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, AbstractC1701hf0.u("Activity is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, AbstractC1701hf0.u("Window is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView != null) {
            return decorView;
        }
        sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, AbstractC1701hf0.u("DecorView is null in ", str, ". No breadcrumb captured."), new Object[0]);
        return null;
    }

    public final void d(io.sentry.internal.gestures.b bVar, d dVar) {
        boolean z = dVar == d.Click || !(dVar == this.q && bVar.equals(this.f77o));
        SentryAndroidOptions sentryAndroidOptions = this.n;
        boolean zIsTracingEnabled = sentryAndroidOptions.isTracingEnabled();
        K k = this.m;
        if (!zIsTracingEnabled || !sentryAndroidOptions.isEnableUserInteractionTracing()) {
            if (z) {
                k.m(new C0042f0(5));
                this.f77o = bVar;
                this.q = dVar;
                return;
            }
            return;
        }
        Activity activity = (Activity) this.l.get();
        if (activity == null) {
            sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String str = bVar.c;
        if (str == null) {
            String str2 = bVar.d;
            io.sentry.config.a.C(str2, "UiElement.tag can't be null");
            str = str2;
        }
        W w = this.p;
        if (w != null) {
            if (!z && !w.d()) {
                sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, AbstractC1701hf0.u("The view with id: ", str, " already has an ongoing transaction assigned. Rescheduling finish"), new Object[0]);
                if (sentryAndroidOptions.getIdleTimeout() != null) {
                    this.p.i();
                    return;
                }
                return;
            }
            e(Y1.OK);
        }
        String str3 = activity.getClass().getSimpleName() + "." + str;
        String strConcat = "ui.action.".concat(c(dVar));
        g2 g2Var = new g2();
        g2Var.d = true;
        g2Var.f = 30000L;
        g2Var.e = sentryAndroidOptions.getIdleTimeout();
        g2Var.a = true;
        W wK = k.k(new f2(str3, C.COMPONENT, strConcat, null), g2Var);
        wK.k().t = "auto.ui.gesture_listener." + bVar.e;
        k.m(new C0039e0(this, 5, wK));
        this.p = wK;
        this.f77o = bVar;
        this.q = dVar;
    }

    public final void e(Y1 y1) {
        W w = this.p;
        if (w != null) {
            if (w.m() == null) {
                this.p.l(y1);
            } else {
                this.p.q();
            }
        }
        this.m.m(new C0008e(3, this));
        this.p = null;
        if (this.f77o != null) {
            this.f77o = null;
        }
        this.q = d.Unknown;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        e eVar = this.r;
        eVar.b = null;
        eVar.a = d.Unknown;
        eVar.c = 0.0f;
        eVar.d = 0.0f;
        eVar.c = motionEvent.getX();
        eVar.d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.r.a = d.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        View viewB = b("onScroll");
        if (viewB != null && motionEvent != null) {
            e eVar = this.r;
            if (eVar.a == d.Unknown) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                io.sentry.internal.gestures.a aVar = io.sentry.internal.gestures.a.SCROLLABLE;
                SentryAndroidOptions sentryAndroidOptions = this.n;
                io.sentry.internal.gestures.b bVarF = io.sentry.config.a.f(sentryAndroidOptions, viewB, x, y, aVar);
                if (bVarF == null) {
                    sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                    return false;
                }
                ILogger logger = sentryAndroidOptions.getLogger();
                EnumC0094u1 enumC0094u1 = EnumC0094u1.DEBUG;
                String str = bVarF.c;
                if (str == null) {
                    String str2 = bVarF.d;
                    io.sentry.config.a.C(str2, "UiElement.tag can't be null");
                    str = str2;
                }
                logger.h(enumC0094u1, "Scroll target found: ".concat(str), new Object[0]);
                eVar.b = bVarF;
                eVar.a = d.Scroll;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View viewB = b("onSingleTapUp");
        if (viewB != null && motionEvent != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            io.sentry.internal.gestures.a aVar = io.sentry.internal.gestures.a.CLICKABLE;
            SentryAndroidOptions sentryAndroidOptions = this.n;
            io.sentry.internal.gestures.b bVarF = io.sentry.config.a.f(sentryAndroidOptions, viewB, x, y, aVar);
            if (bVarF == null) {
                sentryAndroidOptions.getLogger().h(EnumC0094u1.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            d dVar = d.Click;
            a(bVarF, dVar, Collections.emptyMap(), motionEvent);
            d(bVarF, dVar);
        }
        return false;
    }
}
