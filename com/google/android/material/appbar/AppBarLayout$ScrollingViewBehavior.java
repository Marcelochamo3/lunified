package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import o.AbstractC0397Ej;
import o.AbstractC0706Qh;
import o.AbstractC1145bu0;
import o.C0784Th;
import o.H40;
import o.It0;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC1145bu0 {
    public final int c;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void w(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // o.AbstractC0706Qh
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC0706Qh abstractC0706Qh = ((C0784Th) view2.getLayoutParams()).a;
        if (abstractC0706Qh instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC0706Qh).getClass();
            int i = this.c;
            It0.k(view, bottom - (i == 0 ? 0 : AbstractC0397Ej.i((int) (0.0f * i), 0, i)));
        }
        return false;
    }

    @Override // o.AbstractC0706Qh
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        w(coordinatorLayout.j(view));
        return false;
    }

    @Override // o.AbstractC0706Qh
    public final void p(CoordinatorLayout coordinatorLayout, View view) {
        w(coordinatorLayout.j(view));
    }

    @Override // o.AbstractC1145bu0
    public final void v(CoordinatorLayout coordinatorLayout, View view, int i) {
        w(coordinatorLayout.j(view));
        coordinatorLayout.p(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        new Rect();
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H40.y);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // o.AbstractC0706Qh
    public final void f(View view) {
    }
}
