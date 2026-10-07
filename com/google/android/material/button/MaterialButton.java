package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import o.AbstractC1376eG;
import o.AbstractC1459f50;
import o.AbstractC1674hK;
import o.AbstractC1923jt0;
import o.AbstractC2205mo;
import o.AbstractC3021v9;
import o.AbstractC3045vW;
import o.AbstractC3409z9;
import o.C0334By;
import o.C1795id0;
import o.C1891jd0;
import o.C2421p;
import o.C80;
import o.G3;
import o.H40;
import o.InterfaceC2862td0;
import o.It0;
import o.Ou0;
import o.TN;
import o.UN;
import o.VN;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends G3 implements Checkable, InterfaceC2862td0 {
    public static final int[] C = {R.attr.state_checkable};
    public static final int[] D = {R.attr.state_checked};
    public boolean A;
    public int B;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final VN f41o;
    public final LinkedHashSet p;
    public TN q;
    public PorterDuff.Mode r;
    public ColorStateList s;
    public Drawable t;
    public String u;
    public int v;
    public int w;
    public int x;
    public int y;
    public boolean z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(AbstractC1459f50.Q(context, attributeSet, com.skidush.clonex.R.attr.materialButtonStyle, com.skidush.clonex.R.style.Widget_MaterialComponents_Button), attributeSet, com.skidush.clonex.R.attr.materialButtonStyle);
        this.p = new LinkedHashSet();
        this.z = false;
        this.A = false;
        Context context2 = getContext();
        TypedArray typedArrayU = AbstractC1923jt0.u(context2, attributeSet, H40.l, com.skidush.clonex.R.attr.materialButtonStyle, com.skidush.clonex.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.y = typedArrayU.getDimensionPixelSize(12, 0);
        int i = typedArrayU.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.r = AbstractC3409z9.y(i, mode);
        this.s = AbstractC3021v9.l(getContext(), typedArrayU, 14);
        this.t = AbstractC3021v9.n(getContext(), typedArrayU, 10);
        this.B = typedArrayU.getInteger(11, 1);
        this.v = typedArrayU.getDimensionPixelSize(13, 0);
        VN vn = new VN(this, C1891jd0.b(context2, attributeSet, com.skidush.clonex.R.attr.materialButtonStyle, com.skidush.clonex.R.style.Widget_MaterialComponents_Button).a());
        this.f41o = vn;
        vn.c = typedArrayU.getDimensionPixelOffset(1, 0);
        vn.d = typedArrayU.getDimensionPixelOffset(2, 0);
        vn.e = typedArrayU.getDimensionPixelOffset(3, 0);
        vn.f = typedArrayU.getDimensionPixelOffset(4, 0);
        if (typedArrayU.hasValue(8)) {
            int dimensionPixelSize = typedArrayU.getDimensionPixelSize(8, -1);
            vn.g = dimensionPixelSize;
            float f = dimensionPixelSize;
            C1795id0 c1795id0E = vn.b.e();
            c1795id0E.e = new C2421p(f);
            c1795id0E.f = new C2421p(f);
            c1795id0E.g = new C2421p(f);
            c1795id0E.h = new C2421p(f);
            vn.c(c1795id0E.a());
            vn.p = true;
        }
        vn.h = typedArrayU.getDimensionPixelSize(20, 0);
        vn.i = AbstractC3409z9.y(typedArrayU.getInt(7, -1), mode);
        vn.j = AbstractC3021v9.l(getContext(), typedArrayU, 6);
        vn.k = AbstractC3021v9.l(getContext(), typedArrayU, 19);
        vn.l = AbstractC3021v9.l(getContext(), typedArrayU, 16);
        vn.q = typedArrayU.getBoolean(5, false);
        vn.t = typedArrayU.getDimensionPixelSize(9, 0);
        vn.r = typedArrayU.getBoolean(21, true);
        WeakHashMap weakHashMap = It0.a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayU.hasValue(0)) {
            vn.f573o = true;
            setSupportBackgroundTintList(vn.j);
            setSupportBackgroundTintMode(vn.i);
        } else {
            vn.e();
        }
        setPaddingRelative(paddingStart + vn.c, paddingTop + vn.e, paddingEnd + vn.d, paddingBottom + vn.f);
        typedArrayU.recycle();
        setCompoundDrawablePadding(this.y);
        d(this.t != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    public final boolean a() {
        VN vn = this.f41o;
        return vn != null && vn.q;
    }

    public final boolean b() {
        VN vn = this.f41o;
        return (vn == null || vn.f573o) ? false : true;
    }

    public final void c() {
        int i = this.B;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        if (z) {
            setCompoundDrawablesRelative(this.t, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.t, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.t, null, null);
        }
    }

    public final void d(boolean z) {
        Drawable drawable = this.t;
        if (drawable != null) {
            Drawable drawableMutate = AbstractC3045vW.R(drawable).mutate();
            this.t = drawableMutate;
            AbstractC2205mo.h(drawableMutate, this.s);
            PorterDuff.Mode mode = this.r;
            if (mode != null) {
                AbstractC2205mo.i(this.t, mode);
            }
            int intrinsicWidth = this.v;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.t.getIntrinsicWidth();
            }
            int intrinsicHeight = this.v;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.t.getIntrinsicHeight();
            }
            Drawable drawable2 = this.t;
            int i = this.w;
            int i2 = this.x;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.t.setVisible(true, z);
        }
        if (z) {
            c();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.B;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.t) || (((i3 == 3 || i3 == 4) && drawable5 != this.t) || ((i3 == 16 || i3 == 32) && drawable4 != this.t))) {
            c();
        }
    }

    public final void e(int i, int i2) {
        if (this.t == null || getLayout() == null) {
            return;
        }
        int i3 = this.B;
        if (!(i3 == 1 || i3 == 2) && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.w = 0;
                if (i3 == 16) {
                    this.x = 0;
                    d(false);
                    return;
                }
                int intrinsicHeight = this.v;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.t.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.y) - getPaddingBottom()) / 2);
                if (this.x != iMax) {
                    this.x = iMax;
                    d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.x = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.B;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.w = 0;
            d(false);
            return;
        }
        int intrinsicWidth = this.v;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.t.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = It0.a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.y) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.B == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.w != paddingEnd) {
            this.w = paddingEnd;
            d(false);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.u)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.u;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.f41o.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.t;
    }

    public int getIconGravity() {
        return this.B;
    }

    public int getIconPadding() {
        return this.y;
    }

    public int getIconSize() {
        return this.v;
    }

    public ColorStateList getIconTint() {
        return this.s;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.r;
    }

    public int getInsetBottom() {
        return this.f41o.f;
    }

    public int getInsetTop() {
        return this.f41o.e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.f41o.l;
        }
        return null;
    }

    public C1891jd0 getShapeAppearanceModel() {
        if (b()) {
            return this.f41o.b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.f41o.k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.f41o.h;
        }
        return 0;
    }

    @Override // o.G3
    public ColorStateList getSupportBackgroundTintList() {
        return b() ? this.f41o.j : super.getSupportBackgroundTintList();
    }

    @Override // o.G3
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return b() ? this.f41o.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.z;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            AbstractC3409z9.C(this, this.f41o.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, C);
        }
        if (this.z) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, D);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // o.G3, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.z);
    }

    @Override // o.G3, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(this.z);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // o.G3, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof UN)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        UN un = (UN) parcelable;
        super.onRestoreInstanceState(un.l);
        setChecked(un.n);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        UN un = new UN(super.onSaveInstanceState());
        un.n = this.z;
        return un;
    }

    @Override // o.G3, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f41o.r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.t != null) {
            if (this.t.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.u = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!b()) {
            super.setBackgroundColor(i);
            return;
        }
        VN vn = this.f41o;
        if (vn.b(false) != null) {
            vn.b(false).setTint(i);
        }
    }

    @Override // o.G3, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!b()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        VN vn = this.f41o;
        vn.f573o = true;
        ColorStateList colorStateList = vn.j;
        MaterialButton materialButton = vn.a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(vn.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // o.G3, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? Ou0.l(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (b()) {
            this.f41o.q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (a() && isEnabled() && this.z != z) {
            this.z = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z2 = this.z;
                if (!materialButtonToggleGroup.q) {
                    materialButtonToggleGroup.b(getId(), z2);
                }
            }
            if (this.A) {
                return;
            }
            this.A = true;
            Iterator it = this.p.iterator();
            if (it.hasNext()) {
                AbstractC1674hK.w(it.next());
                throw null;
            }
            this.A = false;
        }
    }

    public void setCornerRadius(int i) {
        if (b()) {
            VN vn = this.f41o;
            if (vn.p && vn.g == i) {
                return;
            }
            vn.g = i;
            vn.p = true;
            float f = i;
            C1795id0 c1795id0E = vn.b.e();
            c1795id0E.e = new C2421p(f);
            c1795id0E.f = new C2421p(f);
            c1795id0E.g = new C2421p(f);
            c1795id0E.h = new C2421p(f);
            vn.c(c1795id0E.a());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (b()) {
            this.f41o.b(false).k(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.t != drawable) {
            this.t = drawable;
            d(true);
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.B != i) {
            this.B = i;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.y != i) {
            this.y = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? Ou0.l(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.v != i) {
            this.v = i;
            d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.s != colorStateList) {
            this.s = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.r != mode) {
            this.r = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(AbstractC1459f50.v(getContext(), i));
    }

    public void setInsetBottom(int i) {
        VN vn = this.f41o;
        vn.d(vn.e, i);
    }

    public void setInsetTop(int i) {
        VN vn = this.f41o;
        vn.d(i, vn.f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(TN tn) {
        this.q = tn;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        TN tn = this.q;
        if (tn != null) {
            ((MaterialButtonToggleGroup) ((C0334By) tn).m).invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            VN vn = this.f41o;
            if (vn.l != colorStateList) {
                vn.l = colorStateList;
                boolean z = VN.u;
                MaterialButton materialButton = vn.a;
                if (z && (materialButton.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(AbstractC1376eG.D(colorStateList));
                } else {
                    if (z || !(materialButton.getBackground() instanceof C80)) {
                        return;
                    }
                    ((C80) materialButton.getBackground()).setTintList(AbstractC1376eG.D(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (b()) {
            setRippleColor(AbstractC1459f50.v(getContext(), i));
        }
    }

    @Override // o.InterfaceC2862td0
    public void setShapeAppearanceModel(C1891jd0 c1891jd0) {
        if (!b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f41o.c(c1891jd0);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (b()) {
            VN vn = this.f41o;
            vn.n = z;
            vn.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            VN vn = this.f41o;
            if (vn.k != colorStateList) {
                vn.k = colorStateList;
                vn.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (b()) {
            setStrokeColor(AbstractC1459f50.v(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (b()) {
            VN vn = this.f41o;
            if (vn.h != i) {
                vn.h = i;
                vn.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // o.G3
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        VN vn = this.f41o;
        if (vn.j != colorStateList) {
            vn.j = colorStateList;
            if (vn.b(false) != null) {
                AbstractC2205mo.h(vn.b(false), vn.j);
            }
        }
    }

    @Override // o.G3
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        VN vn = this.f41o;
        if (vn.i != mode) {
            vn.i = mode;
            if (vn.b(false) == null || vn.i == null) {
                return;
            }
            AbstractC2205mo.i(vn.b(false), vn.i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f41o.r = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.z);
    }
}
