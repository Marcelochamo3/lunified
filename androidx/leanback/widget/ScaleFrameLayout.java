package androidx.leanback.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ScaleFrameLayout extends FrameLayout {
    public float l;
    public float m;
    public float n;

    public ScaleFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.l = 1.0f;
        this.m = 1.0f;
        this.n = 1.0f;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        view.setScaleX(this.n);
        view.setScaleY(this.n);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        boolean zAddViewInLayout = super.addViewInLayout(view, i, layoutParams, z);
        if (zAddViewInLayout) {
            view.setScaleX(this.n);
            view.setScaleY(this.n);
        }
        return zAddViewInLayout;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00de  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int paddingRight;
        int paddingTop;
        int i6;
        int paddingBottom;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        ScaleFrameLayout scaleFrameLayout = this;
        int childCount = getChildCount();
        int layoutDirection = getLayoutDirection();
        float width = layoutDirection == 1 ? getWidth() - getPivotX() : getPivotX();
        if (scaleFrameLayout.l != 1.0f) {
            int paddingLeft2 = getPaddingLeft();
            float f = scaleFrameLayout.l;
            paddingLeft = paddingLeft2 + ((int) ((width - (width / f)) + 0.5f));
            i5 = (int) ((((i3 - i) - width) / f) + width + 0.5f);
            paddingRight = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
            i5 = i3 - i;
            paddingRight = getPaddingRight();
        }
        int i13 = i5 - paddingRight;
        float pivotY = getPivotY();
        if (scaleFrameLayout.m != 1.0f) {
            int paddingTop2 = getPaddingTop();
            float f2 = scaleFrameLayout.m;
            paddingTop = paddingTop2 + ((int) ((pivotY - (pivotY / f2)) + 0.5f));
            i6 = (int) ((((i4 - i2) - pivotY) / f2) + pivotY + 0.5f);
            paddingBottom = getPaddingBottom();
        } else {
            paddingTop = getPaddingTop();
            i6 = i4 - i2;
            paddingBottom = getPaddingBottom();
        }
        int i14 = i6 - paddingBottom;
        int i15 = 0;
        while (i15 < childCount) {
            View childAt = scaleFrameLayout.getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i16 = layoutParams.gravity;
                if (i16 == -1) {
                    i16 = 8388659;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i16, layoutDirection);
                int i17 = i16 & 112;
                int i18 = absoluteGravity & 7;
                if (i18 != 1) {
                    if (i18 != 5) {
                        i9 = layoutParams.leftMargin + paddingLeft;
                    } else {
                        i7 = i13 - measuredWidth;
                        i8 = layoutParams.rightMargin;
                    }
                    if (i17 == 16) {
                        i10 = (((i14 - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                        i11 = layoutParams.bottomMargin;
                    } else if (i17 == 48 && i17 == 80) {
                        i10 = i14 - measuredHeight;
                        i11 = layoutParams.bottomMargin;
                    } else {
                        i12 = i + paddingTop;
                        childAt.layout(i9, i12, measuredWidth + i9, measuredHeight + i12);
                        childAt.setPivotX(width - i9);
                        childAt.setPivotY(pivotY - i12);
                    }
                    i12 = i10 - i11;
                    childAt.layout(i9, i12, measuredWidth + i9, measuredHeight + i12);
                    childAt.setPivotX(width - i9);
                    childAt.setPivotY(pivotY - i12);
                } else {
                    i7 = (((i13 - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                    i8 = layoutParams.rightMargin;
                }
                i9 = i7 - i8;
                if (i17 == 16) {
                    int i19 = i17 == 48 ? layoutParams.topMargin : layoutParams.topMargin;
                    i12 = i19 + paddingTop;
                    childAt.layout(i9, i12, measuredWidth + i9, measuredHeight + i12);
                    childAt.setPivotX(width - i9);
                    childAt.setPivotY(pivotY - i12);
                } else {
                    i10 = (((i14 - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                    i11 = layoutParams.bottomMargin;
                }
                i12 = i10 - i11;
                childAt.layout(i9, i12, measuredWidth + i9, measuredHeight + i12);
                childAt.setPivotX(width - i9);
                childAt.setPivotY(pivotY - i12);
            }
            i15++;
            scaleFrameLayout = this;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f = this.l;
        if (f == 1.0f && this.m == 1.0f) {
            super.onMeasure(i, i2);
            return;
        }
        if (f != 1.0f) {
            i = View.MeasureSpec.makeMeasureSpec((int) ((View.MeasureSpec.getSize(i) / f) + 0.5f), View.MeasureSpec.getMode(i));
        }
        float f2 = this.m;
        if (f2 != 1.0f) {
            i2 = View.MeasureSpec.makeMeasureSpec((int) ((View.MeasureSpec.getSize(i2) / f2) + 0.5f), View.MeasureSpec.getMode(i2));
        }
        super.onMeasure(i, i2);
        setMeasuredDimension((int) ((getMeasuredWidth() * this.l) + 0.5f), (int) ((getMeasuredHeight() * this.m) + 0.5f));
    }

    public void setChildScale(float f) {
        if (this.n != f) {
            this.n = f;
            for (int i = 0; i < getChildCount(); i++) {
                getChildAt(i).setScaleX(f);
                getChildAt(i).setScaleY(f);
            }
        }
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        throw new UnsupportedOperationException();
    }

    public void setLayoutScaleX(float f) {
        if (f != this.l) {
            this.l = f;
            requestLayout();
        }
    }

    public void setLayoutScaleY(float f) {
        if (f != this.m) {
            this.m = f;
            requestLayout();
        }
    }
}
