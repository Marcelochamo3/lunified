package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import o.AbstractC0446Gg;
import o.C0498Ig;

/* JADX INFO: loaded from: classes.dex */
public class Group extends AbstractC0446Gg {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // o.AbstractC0446Gg
    public final void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    @Override // o.AbstractC0446Gg
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
    }

    @Override // o.AbstractC0446Gg
    public final void j() {
        C0498Ig c0498Ig = (C0498Ig) getLayoutParams();
        c0498Ig.p0.O(0);
        c0498Ig.p0.L(0);
    }

    @Override // o.AbstractC0446Gg, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        d();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        d();
    }
}
