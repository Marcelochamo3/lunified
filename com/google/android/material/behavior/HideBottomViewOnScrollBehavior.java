package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.skidush.clonex.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.AbstractC0706Qh;
import o.AbstractC1161c3;
import o.AbstractC1674hK;
import o.AbstractC3045vW;
import o.C0962a1;

/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0706Qh {
    public int b;
    public int c;
    public TimeInterpolator d;
    public TimeInterpolator e;
    public ViewPropertyAnimator h;
    public final LinkedHashSet a = new LinkedHashSet();
    public int f = 0;
    public int g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // o.AbstractC0706Qh
    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.b = AbstractC3045vW.D(view.getContext(), R.attr.motionDurationLong2, 225);
        this.c = AbstractC3045vW.D(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = AbstractC3045vW.E(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC1161c3.d);
        this.e = AbstractC3045vW.E(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC1161c3.c);
        return false;
    }

    @Override // o.AbstractC0706Qh
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.a;
        if (i > 0) {
            if (this.g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                AbstractC1674hK.w(it.next());
                throw null;
            }
            this.h = view.animate().translationY(this.f).setInterpolator(this.e).setDuration(this.c).setListener(new C0962a1(4, this));
            return;
        }
        if (i >= 0 || this.g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            AbstractC1674hK.w(it2.next());
            throw null;
        }
        this.h = view.animate().translationY(0).setInterpolator(this.d).setDuration(this.b).setListener(new C0962a1(4, this));
    }

    @Override // o.AbstractC0706Qh
    public boolean s(View view, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
