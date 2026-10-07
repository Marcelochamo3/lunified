package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import o.G40;
import o.RunnableC0972a6;
import o.Z5;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f35o = 0;
    public final RunnableC0972a6 l;
    public float m;
    public int n;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, G40.a, 0, 0);
            try {
                this.n = typedArrayObtainStyledAttributes.getInt(0, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.l = new RunnableC0972a6(this);
    }

    public int getResizeMode() {
        return this.n;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.m <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = (this.m / (f3 / f4)) - 1.0f;
        float fAbs = Math.abs(f5);
        RunnableC0972a6 runnableC0972a6 = this.l;
        if (fAbs <= 0.01f) {
            if (runnableC0972a6.m) {
                return;
            }
            runnableC0972a6.m = true;
            ((AspectRatioFrameLayout) runnableC0972a6.n).post(runnableC0972a6);
            return;
        }
        int i3 = this.n;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    f = this.m;
                } else if (i3 == 4) {
                    if (f5 > 0.0f) {
                        f = this.m;
                    } else {
                        f2 = this.m;
                    }
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.m;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f5 > 0.0f) {
            f2 = this.m;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.m;
            measuredWidth = (int) (f4 * f);
        }
        if (!runnableC0972a6.m) {
            runnableC0972a6.m = true;
            ((AspectRatioFrameLayout) runnableC0972a6.n).post(runnableC0972a6);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.m != f) {
            this.m = f;
            requestLayout();
        }
    }

    public void setResizeMode(int i) {
        if (this.n != i) {
            this.n = i;
            requestLayout();
        }
    }

    public void setAspectRatioListener(Z5 z5) {
    }
}
