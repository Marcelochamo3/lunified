package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import io.sentry.C0072p0;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC1474fG;
import o.Rh0;

/* JADX INFO: loaded from: classes.dex */
public final class q implements ViewTreeObserver.OnDrawListener {
    public final r l;
    public final I1 m;
    public final C0072p0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ReplayIntegration f102o;
    public final Rh0 p;
    public WeakReference q;
    public final AtomicReference r;
    public final Paint s;
    public final Bitmap t;
    public final Canvas u;
    public final Matrix v;
    public final AtomicBoolean w;
    public final AtomicBoolean x;
    public Bitmap y;

    public q(r rVar, I1 i1, C0072p0 c0072p0, ReplayIntegration replayIntegration) {
        AbstractC1474fG.j(i1, "options");
        AbstractC1474fG.j(c0072p0, "mainLooperHandler");
        this.l = rVar;
        this.m = i1;
        this.n = c0072p0;
        this.f102o = replayIntegration;
        this.p = new Rh0(a.p);
        this.r = new AtomicReference();
        this.s = new Paint();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        AbstractC1474fG.i(bitmapCreateBitmap, "createBitmap(\n        1,…ap.Config.ARGB_8888\n    )");
        this.t = bitmapCreateBitmap;
        this.u = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.preScale(rVar.c, rVar.d);
        this.v = matrix;
        this.w = new AtomicBoolean(false);
        this.x = new AtomicBoolean(true);
    }

    public final void a(View view) {
        AbstractC1474fG.j(view, "root");
        WeakReference weakReference = this.q;
        c(weakReference != null ? (View) weakReference.get() : null);
        WeakReference weakReference2 = this.q;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.q = new WeakReference(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnDrawListener(this);
        }
    }

    public final void b(View view, io.sentry.android.replay.viewhierarchy.d dVar) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    io.sentry.android.replay.viewhierarchy.d dVarH = io.sentry.config.a.h(childAt, dVar, viewGroup.indexOfChild(childAt), this.m);
                    arrayList.add(dVarH);
                    b(childAt, dVarH);
                }
            }
            dVar.f = arrayList;
        }
    }

    public final void c(View view) {
        ViewTreeObserver viewTreeObserver;
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        WeakReference weakReference = this.q;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            this.m.getLogger().h(EnumC0094u1.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
        } else {
            this.w.set(true);
        }
    }
}
