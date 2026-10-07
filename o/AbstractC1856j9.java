package o;

import android.view.View;

/* JADX INFO: renamed from: o.j9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1856j9 extends AbstractC3043vU {
    @Override // o.AbstractC3043vU
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i2) != 1073741824 && suggestedMinimumHeight > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        C1564g9 c1564g9 = (C1564g9) getMenuView();
        if (c1564g9.W != z) {
            c1564g9.setItemHorizontalTranslationEnabled(z);
            getPresenter().d(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(InterfaceC1662h9 interfaceC1662h9) {
        setOnItemReselectedListener(interfaceC1662h9);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(InterfaceC1760i9 interfaceC1760i9) {
        setOnItemSelectedListener(interfaceC1760i9);
    }
}
