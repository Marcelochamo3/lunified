package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import o.AbstractC1587gV;
import o.Nr0;

/* JADX INFO: loaded from: classes.dex */
class GuidedActionItemContainer extends AbstractC1587gV {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f20o;

    public GuidedActionItemContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20o = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        if (this.f20o || !Nr0.s(this, view)) {
            return super.focusSearch(view, i);
        }
        View viewFocusSearch = super.focusSearch(view, i);
        if (Nr0.s(this, viewFocusSearch)) {
            return viewFocusSearch;
        }
        return null;
    }
}
