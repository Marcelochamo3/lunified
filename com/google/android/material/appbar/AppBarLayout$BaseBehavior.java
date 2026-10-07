package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import o.AbstractC1145bu0;
import o.AbstractC1674hK;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends AbstractC1145bu0 {
    public boolean c;
    public int d;
    public int e;
    public int f;
    public VelocityTracker g;

    public AppBarLayout$BaseBehavior() {
        this.d = -1;
        this.f = -1;
    }

    @Override // o.AbstractC0706Qh
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f < 0) {
            this.f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.c) {
            int i = this.d;
            if (i == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y - this.e) > this.f) {
                this.e = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.g;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.d = -1;
        motionEvent.getX();
        motionEvent.getY();
        AbstractC1674hK.v(view);
        throw null;
    }

    @Override // o.AbstractC1145bu0, o.AbstractC0706Qh
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        AbstractC1674hK.v(view);
        throw null;
    }

    @Override // o.AbstractC0706Qh
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        AbstractC1674hK.v(view);
        throw null;
    }

    @Override // o.AbstractC0706Qh
    public final void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        AbstractC1674hK.v(view);
        throw null;
    }

    @Override // o.AbstractC0706Qh
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        AbstractC1674hK.v(view);
        throw null;
    }

    @Override // o.AbstractC0706Qh
    public final void q(View view, Parcelable parcelable) {
        AbstractC1674hK.v(view);
        throw null;
    }

    @Override // o.AbstractC0706Qh
    public final Parcelable r(View view) {
        AbstractC1674hK.v(view);
        throw null;
    }

    @Override // o.AbstractC0706Qh
    public final boolean s(View view, int i, int i2) {
        AbstractC1674hK.v(view);
        throw null;
    }

    @Override // o.AbstractC0706Qh
    public final void t(View view, View view2, int i) {
        AbstractC1674hK.v(view);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    @Override // o.AbstractC0706Qh
    public final boolean u(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.d);
                if (iFindPointerIndex == -1) {
                    return false;
                }
                this.e = (int) motionEvent.getY(iFindPointerIndex);
                AbstractC1674hK.w(view);
                throw null;
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i = motionEvent.getActionIndex() != 0 ? 0 : 1;
                    this.d = motionEvent.getPointerId(i);
                    this.e = (int) (motionEvent.getY(i) + 0.5f);
                }
            }
            velocityTracker = this.g;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return this.c;
        }
        VelocityTracker velocityTracker2 = this.g;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
            this.g.computeCurrentVelocity(1000);
            this.g.getYVelocity(this.d);
            AbstractC1674hK.w(view);
            throw null;
        }
        this.c = false;
        this.d = -1;
        VelocityTracker velocityTracker3 = this.g;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.g = null;
        }
        velocityTracker = this.g;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return this.c;
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.d = -1;
        this.f = -1;
    }
}
