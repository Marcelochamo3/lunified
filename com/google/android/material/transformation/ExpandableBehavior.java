package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.AbstractC0706Qh;
import o.AbstractC1674hK;
import o.It0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends AbstractC0706Qh {
    public ExpandableBehavior() {
    }

    @Override // o.AbstractC0706Qh
    public abstract void f(View view);

    @Override // o.AbstractC0706Qh
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC1674hK.w(view2);
        throw null;
    }

    @Override // o.AbstractC0706Qh
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = It0.a;
        if (!view.isLaidOut()) {
            ArrayList arrayListJ = coordinatorLayout.j(view);
            int size = arrayListJ.size();
            for (int i2 = 0; i2 < size; i2++) {
                f(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
