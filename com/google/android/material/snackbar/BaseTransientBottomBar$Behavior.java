package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import o.AbstractC2728s8;
import o.L0;
import o.O9;

/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final O9 i;

    public BaseTransientBottomBar$Behavior() {
        O9 o9 = new O9(24);
        this.f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.d = 0;
        this.i = o9;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, o.AbstractC0706Qh
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.i.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (L0.m == null) {
                    L0.m = new L0(4);
                }
                synchronized (L0.m.l) {
                }
            }
        } else if (coordinatorLayout.n(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (L0.m == null) {
                L0.m = new L0(4);
            }
            L0.m.e();
        }
        return super.j(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean v(View view) {
        this.i.getClass();
        return view instanceof AbstractC2728s8;
    }
}
