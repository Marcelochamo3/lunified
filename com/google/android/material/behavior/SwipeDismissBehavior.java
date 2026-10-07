package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import o.AbstractC0706Qh;
import o.F0;
import o.It0;
import o.L80;
import o.Nt0;
import o.Qh0;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0706Qh {
    public Nt0 a;
    public boolean b;
    public boolean c;
    public int d = 2;
    public final float e = 0.5f;
    public float f = 0.0f;
    public float g = 0.5f;
    public final Qh0 h = new Qh0(this);

    @Override // o.AbstractC0706Qh
    public boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zN = this.b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zN = coordinatorLayout.n(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.b = zN;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.b = false;
        }
        if (!zN) {
            return false;
        }
        if (this.a == null) {
            this.a = new Nt0(coordinatorLayout.getContext(), coordinatorLayout, this.h);
        }
        return !this.c && this.a.o(motionEvent);
    }

    @Override // o.AbstractC0706Qh
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = It0.a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            It0.m(view, 1048576);
            It0.i(view, 0);
            if (v(view)) {
                It0.n(view, F0.j, new L80(this));
            }
        }
        return false;
    }

    @Override // o.AbstractC0706Qh
    public final boolean u(View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.i(motionEvent);
        return true;
    }

    public boolean v(View view) {
        return true;
    }
}
