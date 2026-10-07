package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.skidush.clonex.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.s8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2728s8 extends FrameLayout {
    public static final ViewOnTouchListenerC2631r8 t = new ViewOnTouchListenerC2631r8(0);
    public final C1891jd0 l;
    public int m;
    public final float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f1019o;
    public final int p;
    public final int q;
    public ColorStateList r;
    public PorterDuff.Mode s;

    public AbstractC2728s8(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        Drawable drawableR;
        super(AbstractC1459f50.Q(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, H40.B);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = It0.a;
            AbstractC3185wt0.s(this, dimensionPixelSize);
        }
        this.m = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.l = C1891jd0.b(context2, attributeSet, 0, 0).a();
        }
        this.n = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC3021v9.l(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(AbstractC3409z9.y(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f1019o = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(t);
        setFocusable(true);
        if (getBackground() == null) {
            int I = UK.I(UK.o(this, R.attr.colorSurface), getBackgroundOverlayColorAlpha(), UK.o(this, R.attr.colorOnSurface));
            C1891jd0 c1891jd0 = this.l;
            if (c1891jd0 != null) {
                int i = AbstractC2825t8.a;
                C2068lO c2068lO = new C2068lO(c1891jd0);
                c2068lO.l(ColorStateList.valueOf(I));
                drawable = c2068lO;
            } else {
                Resources resources = getResources();
                int i2 = AbstractC2825t8.a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(I);
                drawable = gradientDrawable;
            }
            if (this.r != null) {
                drawableR = AbstractC3045vW.R(drawable);
                AbstractC2205mo.h(drawableR, this.r);
            } else {
                drawableR = AbstractC3045vW.R(drawable);
            }
            WeakHashMap weakHashMap2 = It0.a;
            setBackground(drawableR);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f1019o;
    }

    public int getAnimationMode() {
        return this.m;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.n;
    }

    public int getMaxInlineActionWidth() {
        return this.q;
    }

    public int getMaxWidth() {
        return this.p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = It0.a;
        AbstractC2991ut0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.p;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.m = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.r != null) {
            drawable = AbstractC3045vW.R(drawable.mutate());
            AbstractC2205mo.h(drawable, this.r);
            AbstractC2205mo.i(drawable, this.s);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.r = colorStateList;
        if (getBackground() != null) {
            Drawable drawableR = AbstractC3045vW.R(getBackground().mutate());
            AbstractC2205mo.h(drawableR, colorStateList);
            AbstractC2205mo.i(drawableR, this.s);
            if (drawableR != getBackground()) {
                super.setBackgroundDrawable(drawableR);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.s = mode;
        if (getBackground() != null) {
            Drawable drawableR = AbstractC3045vW.R(getBackground().mutate());
            AbstractC2205mo.i(drawableR, mode);
            if (drawableR != getBackground()) {
                super.setBackgroundDrawable(drawableR);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : t);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(AbstractC2825t8 abstractC2825t8) {
    }
}
