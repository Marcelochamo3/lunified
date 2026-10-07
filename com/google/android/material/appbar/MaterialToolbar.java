package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.skidush.clonex.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import o.AbstractC1459f50;
import o.AbstractC1923jt0;
import o.AbstractC2205mo;
import o.AbstractC3045vW;
import o.AbstractC3185wt0;
import o.AbstractC3409z9;
import o.C1749i30;
import o.C2068lO;
import o.H40;
import o.It0;
import o.Jp0;
import o.Pu0;
import o.ZP;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] k0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer f0;
    public boolean g0;
    public boolean h0;
    public ImageView.ScaleType i0;
    public Boolean j0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC1459f50.Q(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayU = AbstractC1923jt0.u(context2, attributeSet, H40.u, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayU.hasValue(2)) {
            setNavigationIconTint(typedArrayU.getColor(2, -1));
        }
        this.g0 = typedArrayU.getBoolean(4, false);
        this.h0 = typedArrayU.getBoolean(3, false);
        int i = typedArrayU.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = k0;
            if (i < scaleTypeArr.length) {
                this.i0 = scaleTypeArr[i];
            }
        }
        if (typedArrayU.hasValue(0)) {
            this.j0 = Boolean.valueOf(typedArrayU.getBoolean(0, false));
        }
        typedArrayU.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : Jp0.r(background);
        if (colorStateListValueOf != null) {
            C2068lO c2068lO = new C2068lO();
            c2068lO.l(colorStateListValueOf);
            c2068lO.j(context2);
            WeakHashMap weakHashMap = It0.a;
            c2068lO.k(AbstractC3185wt0.i(this));
            setBackground(c2068lO);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.i0;
    }

    public Integer getNavigationIconTint() {
        return this.f0;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof ZP;
        if (z) {
            ((ZP) menu).w();
        }
        super.m(i);
        if (z) {
            ((ZP) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C2068lO) {
            AbstractC3409z9.C(this, (C2068lO) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        ImageView imageView2 = null;
        if (this.g0 || this.h0) {
            ArrayList arrayListL = Pu0.l(this, getTitle());
            boolean zIsEmpty = arrayListL.isEmpty();
            C1749i30 c1749i30 = Pu0.e;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListL, c1749i30);
            ArrayList arrayListL2 = Pu0.l(this, getSubtitle());
            TextView textView2 = arrayListL2.isEmpty() ? null : (TextView) Collections.max(arrayListL2, c1749i30);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i5 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i6 = 0; i6 < getChildCount(); i6++) {
                    View childAt = getChildAt(i6);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i5 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i5 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.g0 && textView != null) {
                    v(textView, pair);
                }
                if (this.h0 && textView2 != null) {
                    v(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt2 = getChildAt(i7);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.j0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.i0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C2068lO) {
            ((C2068lO) background).k(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.j0;
        if (bool == null || bool.booleanValue() != z) {
            this.j0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.i0 != scaleType) {
            this.i0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f0 != null) {
            drawable = AbstractC3045vW.R(drawable.mutate());
            AbstractC2205mo.g(drawable, this.f0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.h0 != z) {
            this.h0 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.g0 != z) {
            this.g0 = z;
            requestLayout();
        }
    }

    public final void v(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }
}
