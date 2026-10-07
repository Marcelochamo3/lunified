package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.skidush.clonex.R;

/* JADX INFO: loaded from: classes.dex */
public class ThumbsBar extends LinearLayout {
    public int l;
    public final int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f27o;
    public final int p;
    public int q;
    public boolean r;

    public ThumbsBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.l = -1;
        new SparseArray();
        this.r = false;
        this.m = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_thumbs_width);
        this.n = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_thumbs_height);
        this.p = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_hero_thumbs_width);
        this.f27o = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_hero_thumbs_height);
        this.q = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_thumbs_margin);
    }

    public final void a() {
        int i;
        int i2;
        while (getChildCount() > this.l) {
            removeView(getChildAt(getChildCount() - 1));
        }
        while (true) {
            int childCount = getChildCount();
            int i3 = this.l;
            i = this.n;
            i2 = this.m;
            if (childCount >= i3) {
                break;
            } else {
                addView(new ImageView(getContext()), new LinearLayout.LayoutParams(i2, i));
            }
        }
        int heroIndex = getHeroIndex();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (heroIndex == i4) {
                layoutParams.width = this.f27o;
                layoutParams.height = this.p;
            } else {
                layoutParams.width = i2;
                layoutParams.height = i;
            }
            childAt.setLayoutParams(layoutParams);
        }
    }

    public int getHeroIndex() {
        return getChildCount() / 2;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int heroIndex = getHeroIndex();
        View childAt = getChildAt(heroIndex);
        int width = (getWidth() / 2) - (childAt.getMeasuredWidth() / 2);
        int measuredWidth = (childAt.getMeasuredWidth() / 2) + (getWidth() / 2);
        childAt.layout(width, getPaddingTop(), measuredWidth, childAt.getMeasuredHeight() + getPaddingTop());
        int measuredHeight = (childAt.getMeasuredHeight() / 2) + getPaddingTop();
        for (int i5 = heroIndex - 1; i5 >= 0; i5--) {
            int i6 = width - this.q;
            View childAt2 = getChildAt(i5);
            childAt2.layout(i6 - childAt2.getMeasuredWidth(), measuredHeight - (childAt2.getMeasuredHeight() / 2), i6, (childAt2.getMeasuredHeight() / 2) + measuredHeight);
            width = i6 - childAt2.getMeasuredWidth();
        }
        while (true) {
            heroIndex++;
            if (heroIndex >= this.l) {
                return;
            }
            int i7 = measuredWidth + this.q;
            View childAt3 = getChildAt(heroIndex);
            childAt3.layout(i7, measuredHeight - (childAt3.getMeasuredHeight() / 2), childAt3.getMeasuredWidth() + i7, (childAt3.getMeasuredHeight() / 2) + measuredHeight);
            measuredWidth = i7 + childAt3.getMeasuredWidth();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (this.r) {
            return;
        }
        int i3 = measuredWidth - this.f27o;
        int i4 = this.m + this.q;
        int i5 = ((i3 + i4) - 1) / i4;
        if (i5 < 2) {
            i5 = 2;
        } else if ((i5 & 1) != 0) {
            i5++;
        }
        int i6 = i5 + 1;
        if (this.l != i6) {
            this.l = i6;
            a();
        }
    }

    public void setNumberOfThumbs(int i) {
        this.r = true;
        this.l = i;
        a();
    }

    public void setThumbSpace(int i) {
        this.q = i;
        requestLayout();
    }
}
