package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class NonOverlappingLinearLayout extends LinearLayout {
    public boolean l;
    public boolean m;
    public final ArrayList n;

    public NonOverlappingLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.l = false;
        this.n = new ArrayList();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void focusableViewAvailable(View view) {
        int iIndexOfChild;
        if (!this.m) {
            super.focusableViewAvailable(view);
            return;
        }
        View view2 = view;
        while (true) {
            if (view2 == this || view2 == null) {
                iIndexOfChild = -1;
                break;
            } else {
                if (view2.getParent() == this) {
                    iIndexOfChild = indexOfChild(view2);
                    break;
                }
                view2 = (View) view2.getParent();
            }
        }
        if (iIndexOfChild != -1) {
            ((ArrayList) this.n.get(iIndexOfChild)).add(view);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ?? r0 = this.n;
        ?? r1 = 0;
        int i5 = 0;
        try {
            boolean z2 = this.l && getOrientation() == 0 && getLayoutDirection() == 1;
            this.m = z2;
            if (z2) {
                while (r0.size() > getChildCount()) {
                    r0.remove(r0.size() - 1);
                }
                while (r0.size() < getChildCount()) {
                    r0.add(new ArrayList());
                }
            }
            super.onLayout(z, i, i2, i3, i4);
            if (this.m) {
                for (int i6 = 0; i6 < r0.size(); i6++) {
                    for (int i7 = 0; i7 < ((ArrayList) r0.get(i6)).size(); i7++) {
                        super.focusableViewAvailable((View) ((ArrayList) r0.get(i6)).get(i7));
                    }
                }
            }
        } finally {
            if (this.m) {
                this.m = false;
                while (r1 < r0.size()) {
                    ((ArrayList) r0.get(r1)).clear();
                    r1++;
                }
            }
        }
    }

    public void setFocusableViewAvailableFixEnabled(boolean z) {
        this.l = z;
    }
}
