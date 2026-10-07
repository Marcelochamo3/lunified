package o;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.skidush.clonex.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.g9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1564g9 extends AbstractC2462pU {
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public boolean W;
    public final ArrayList a0;

    public C1564g9(Context context) {
        super(context);
        this.a0 = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.S = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.T = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.U = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.V = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                WeakHashMap weakHashMap = It0.a;
                if (getLayoutDirection() == 1) {
                    int i8 = i5 - measuredWidth;
                    childAt.layout(i8 - childAt.getMeasuredWidth(), 0, i8, i6);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i6);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ZP menu = getMenu();
        int size = View.MeasureSpec.getSize(i);
        int size2 = menu.l().size();
        int childCount = getChildCount();
        ArrayList arrayList = this.a0;
        arrayList.clear();
        int size3 = View.MeasureSpec.getSize(i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int labelVisibilityMode = getLabelVisibilityMode();
        boolean z = labelVisibilityMode != -1 ? labelVisibilityMode == 0 : size2 > 3;
        int i5 = this.U;
        if (z && this.W) {
            View childAt = getChildAt(getSelectedItemPosition());
            int visibility = childAt.getVisibility();
            int iMax = this.V;
            if (visibility != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), iMakeMeasureSpec);
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
            }
            int i6 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int iMin = Math.min(size - (this.T * i6), Math.min(iMax, i5));
            int i7 = size - iMin;
            int iMin2 = Math.min(i7 / (i6 != 0 ? i6 : 1), this.S);
            int i8 = i7 - (i6 * iMin2);
            int i9 = 0;
            while (i9 < childCount) {
                if (getChildAt(i9).getVisibility() != 8) {
                    i4 = i9 == getSelectedItemPosition() ? iMin : iMin2;
                    if (i8 > 0) {
                        i4++;
                        i8--;
                    }
                } else {
                    i4 = 0;
                }
                arrayList.add(Integer.valueOf(i4));
                i9++;
            }
        } else {
            int iMin3 = Math.min(size / (size2 != 0 ? size2 : 1), i5);
            int i10 = size - (size2 * iMin3);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (getChildAt(i11).getVisibility() == 8) {
                    i3 = 0;
                } else if (i10 > 0) {
                    i3 = iMin3 + 1;
                    i10--;
                } else {
                    i3 = iMin3;
                }
                arrayList.add(Integer.valueOf(i3));
            }
        }
        int measuredWidth = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) arrayList.get(i12)).intValue(), 1073741824), iMakeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                measuredWidth = childAt2.getMeasuredWidth() + measuredWidth;
            }
        }
        setMeasuredDimension(measuredWidth, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.W = z;
    }
}
