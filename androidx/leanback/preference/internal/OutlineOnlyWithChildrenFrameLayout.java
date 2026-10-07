package androidx.leanback.preference.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import o.C2377od;

/* JADX INFO: loaded from: classes.dex */
public class OutlineOnlyWithChildrenFrameLayout extends FrameLayout {
    public C2377od l;
    public ViewOutlineProvider m;

    public OutlineOnlyWithChildrenFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        invalidateOutline();
    }

    @Override // android.view.View
    public void setOutlineProvider(ViewOutlineProvider viewOutlineProvider) {
        this.m = viewOutlineProvider;
        if (this.l == null) {
            this.l = new C2377od(this, 1);
        }
        super.setOutlineProvider(this.l);
    }
}
