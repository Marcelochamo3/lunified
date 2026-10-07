package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SwitchCompat;
import java.util.WeakHashMap;
import o.AbstractC1459f50;
import o.AbstractC1923jt0;
import o.AbstractC3185wt0;
import o.C3467zp;
import o.H40;
import o.It0;
import o.UK;

/* JADX INFO: loaded from: classes.dex */
public class SwitchMaterial extends SwitchCompat {
    public static final int[][] l0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public final C3467zp h0;
    public ColorStateList i0;
    public ColorStateList j0;
    public boolean k0;

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        super(AbstractC1459f50.Q(context, attributeSet, com.skidush.clonex.R.attr.switchStyle, com.skidush.clonex.R.style.Widget_MaterialComponents_CompoundButton_Switch), attributeSet, 0);
        Context context2 = getContext();
        this.h0 = new C3467zp(context2);
        int[] iArr = H40.C;
        AbstractC1923jt0.f(context2, attributeSet, com.skidush.clonex.R.attr.switchStyle, com.skidush.clonex.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        AbstractC1923jt0.g(context2, attributeSet, iArr, com.skidush.clonex.R.attr.switchStyle, com.skidush.clonex.R.style.Widget_MaterialComponents_CompoundButton_Switch, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.skidush.clonex.R.attr.switchStyle, com.skidush.clonex.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        this.k0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.i0 == null) {
            int iO = UK.o(this, com.skidush.clonex.R.attr.colorSurface);
            int iO2 = UK.o(this, com.skidush.clonex.R.attr.colorControlActivated);
            float dimension = getResources().getDimension(com.skidush.clonex.R.dimen.mtrl_switch_thumb_elevation);
            C3467zp c3467zp = this.h0;
            if (c3467zp.a) {
                float fI = 0.0f;
                for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                    WeakHashMap weakHashMap = It0.a;
                    fI += AbstractC3185wt0.i((View) parent);
                }
                dimension += fI;
            }
            int iA = c3467zp.a(iO, dimension);
            this.i0 = new ColorStateList(l0, new int[]{UK.I(iO, 1.0f, iO2), iA, UK.I(iO, 0.38f, iO2), iA});
        }
        return this.i0;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.j0 == null) {
            int iO = UK.o(this, com.skidush.clonex.R.attr.colorSurface);
            int iO2 = UK.o(this, com.skidush.clonex.R.attr.colorControlActivated);
            int iO3 = UK.o(this, com.skidush.clonex.R.attr.colorOnSurface);
            this.j0 = new ColorStateList(l0, new int[]{UK.I(iO, 0.54f, iO2), UK.I(iO, 0.32f, iO3), UK.I(iO, 0.12f, iO2), UK.I(iO, 0.12f, iO3)});
        }
        return this.j0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.k0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.k0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.k0 = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }
}
