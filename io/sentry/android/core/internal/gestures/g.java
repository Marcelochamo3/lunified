package io.sentry.android.core.internal.gestures;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.core.view.GestureDetectorCompat;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.hints.i;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h {
    public final Window.Callback m;
    public final f n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final GestureDetectorCompat f78o;
    public final I1 p;
    public final i q;

    public g(Window.Callback callback, Context context, f fVar, SentryAndroidOptions sentryAndroidOptions) {
        GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(context, fVar);
        i iVar = new i();
        super(callback);
        this.m = callback;
        this.n = fVar;
        this.p = sentryAndroidOptions;
        this.f78o = gestureDetectorCompat;
        this.q = iVar;
    }

    public final void a(MotionEvent motionEvent) {
        String str;
        this.f78o.a.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            f fVar = this.n;
            View viewB = fVar.b("onUp");
            e eVar = fVar.r;
            io.sentry.internal.gestures.b bVar = eVar.b;
            if (viewB == null || bVar == null) {
                return;
            }
            d dVar = eVar.a;
            d dVar2 = d.Unknown;
            if (dVar == dVar2) {
                fVar.n.getLogger().h(EnumC0094u1.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
                return;
            }
            float x = motionEvent.getX() - eVar.c;
            float y = motionEvent.getY() - eVar.d;
            if (Math.abs(x) > Math.abs(y)) {
                str = x > 0.0f ? "right" : "left";
            } else {
                str = y > 0.0f ? "down" : "up";
            }
            fVar.a(bVar, eVar.a, Collections.singletonMap("direction", str), motionEvent);
            fVar.d(bVar, eVar.a);
            eVar.b = null;
            eVar.a = dVar2;
            eVar.c = 0.0f;
            eVar.d = 0.0f;
        }
    }

    @Override // io.sentry.android.core.internal.gestures.h, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.q.getClass();
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            try {
                a(motionEventObtain);
            } catch (Throwable th) {
                I1 i1 = this.p;
                if (i1 != null) {
                    try {
                        i1.getLogger().v(EnumC0094u1.ERROR, "Error dispatching touch event", th);
                    } finally {
                        motionEventObtain.recycle();
                    }
                }
            }
        }
        return this.l.dispatchTouchEvent(motionEvent);
    }
}
