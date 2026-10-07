package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import o.AbstractC0706Qh;
import o.AbstractC1674hK;
import o.C0784Th;
import o.H40;

/* JADX INFO: loaded from: classes.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends AbstractC0706Qh {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    @Override // o.AbstractC0706Qh
    public final /* bridge */ /* synthetic */ boolean e(View view) {
        AbstractC1674hK.v(view);
        throw null;
    }

    @Override // o.AbstractC0706Qh
    public final void g(C0784Th c0784Th) {
        if (c0784Th.h == 0) {
            c0784Th.h = 80;
        }
    }

    @Override // o.AbstractC0706Qh
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC1674hK.v(view);
        throw null;
    }

    @Override // o.AbstractC0706Qh
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        AbstractC1674hK.v(view);
        throw null;
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H40.h);
        typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
