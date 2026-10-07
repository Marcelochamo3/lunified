package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class ControlBar extends LinearLayout {
    public int l;
    public final boolean m;

    public ControlBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = -1;
        this.m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        if (i != 33 && i != 130) {
            super.addFocusables(arrayList, i, i2);
            return;
        }
        int i3 = this.l;
        if (i3 >= 0 && i3 < getChildCount()) {
            arrayList.add(getChildAt(this.l));
        } else if (getChildCount() > 0) {
            arrayList.add(getChildAt(this.m ? getChildCount() / 2 : 0));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int childCount;
        if (getChildCount() > 0) {
            int i2 = this.l;
            if (i2 < 0 || i2 >= getChildCount()) {
                childCount = this.m ? getChildCount() / 2 : 0;
            } else {
                childCount = this.l;
            }
            if (getChildAt(childCount).requestFocus(i, rect)) {
                return true;
            }
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        this.l = indexOfChild(view);
    }
}
