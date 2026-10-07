package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import o.AbstractC1674hK;
import o.ViewOnLayoutChangeListenerC1368e9;

/* JADX INFO: loaded from: classes.dex */
public class BottomAppBar$Behavior extends HideBottomViewOnScrollBehavior<Object> {
    public BottomAppBar$Behavior() {
        new ViewOnLayoutChangeListenerC1368e9(0, this);
        new Rect();
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, o.AbstractC0706Qh
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        AbstractC1674hK.v(view);
        throw null;
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, o.AbstractC0706Qh
    public final boolean s(View view, int i, int i2) {
        AbstractC1674hK.v(view);
        throw null;
    }

    public BottomAppBar$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new ViewOnLayoutChangeListenerC1368e9(0, this);
        new Rect();
    }
}
