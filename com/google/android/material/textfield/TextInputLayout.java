package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import o.AbstractC1161c3;
import o.AbstractC1459f50;
import o.AbstractC1701hf0;
import o.AbstractC1894jf;
import o.AbstractC1923jt0;
import o.AbstractC2205mo;
import o.AbstractC2492pm;
import o.AbstractC3021v9;
import o.AbstractC3045vW;
import o.AbstractC3077vo;
import o.AbstractC3409z9;
import o.AbstractC3476zt0;
import o.C0292Ai;
import o.C0318Bi;
import o.C0484Hs;
import o.C0859We;
import o.C0869Wo;
import o.C1306dd0;
import o.C1398eb;
import o.C1672hI;
import o.C1795id0;
import o.C1846j4;
import o.C1891jd0;
import o.C1970kO;
import o.C2052l9;
import o.C2068lO;
import o.C2133m1;
import o.C2190mg0;
import o.C2306nq;
import o.C2403oq;
import o.C2421p;
import o.C2691rp;
import o.CF;
import o.D8;
import o.DF;
import o.Fi0;
import o.Gm0;
import o.H40;
import o.InterfaceC0888Xh;
import o.It0;
import o.J80;
import o.LN;
import o.Mi0;
import o.Ni0;
import o.Nr0;
import o.Oi0;
import o.Ou0;
import o.Pi0;
import o.RN;
import o.RunnableC1147bv0;
import o.RunnableC3102w1;
import o.T4;
import o.UK;
import o.Y70;
import o.zy0;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] N0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public int A;
    public int A0;
    public int B;
    public int B0;
    public CharSequence C;
    public int C0;
    public boolean D;
    public int D0;
    public T4 E;
    public int E0;
    public ColorStateList F;
    public boolean F0;
    public int G;
    public final C0859We G0;
    public C0484Hs H;
    public boolean H0;
    public C0484Hs I;
    public boolean I0;
    public ColorStateList J;
    public ValueAnimator J0;
    public ColorStateList K;
    public boolean K0;
    public ColorStateList L;
    public boolean L0;
    public ColorStateList M;
    public boolean M0;
    public boolean N;
    public CharSequence O;
    public boolean P;
    public C2068lO Q;
    public C2068lO R;
    public StateListDrawable S;
    public boolean T;
    public C2068lO U;
    public C2068lO V;
    public C1891jd0 W;
    public boolean a0;
    public final int b0;
    public int c0;
    public int d0;
    public int e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public final Rect j0;
    public final Rect k0;
    public final FrameLayout l;
    public final RectF l0;
    public final C2190mg0 m;
    public Typeface m0;
    public final C2403oq n;
    public ColorDrawable n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public EditText f45o;
    public int o0;
    public CharSequence p;
    public final LinkedHashSet p0;
    public int q;
    public ColorDrawable q0;
    public int r;
    public int r0;
    public int s;
    public Drawable s0;
    public int t;
    public ColorStateList t0;
    public final DF u;
    public ColorStateList u0;
    public boolean v;
    public int v0;
    public int w;
    public int w0;
    public boolean x;
    public int x0;
    public Oi0 y;
    public ColorStateList y0;
    public T4 z;
    public int z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC1459f50.Q(context, attributeSet, com.skidush.clonex.R.attr.textInputStyle, com.skidush.clonex.R.style.Widget_Design_TextInputLayout), attributeSet, com.skidush.clonex.R.attr.textInputStyle);
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = new DF(this);
        this.y = new C1306dd0(3);
        this.j0 = new Rect();
        this.k0 = new Rect();
        this.l0 = new RectF();
        this.p0 = new LinkedHashSet();
        C0859We c0859We = new C0859We(this);
        this.G0 = c0859We;
        this.M0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.l = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC1161c3.a;
        c0859We.Q = linearInterpolator;
        c0859We.h(false);
        c0859We.P = linearInterpolator;
        c0859We.h(false);
        if (c0859We.g != 8388659) {
            c0859We.g = 8388659;
            c0859We.h(false);
        }
        RN rnV = AbstractC1923jt0.v(context2, attributeSet, H40.F, com.skidush.clonex.R.attr.textInputStyle, com.skidush.clonex.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        C2190mg0 c2190mg0 = new C2190mg0(this, rnV);
        this.m = c2190mg0;
        TypedArray typedArray = (TypedArray) rnV.n;
        this.N = typedArray.getBoolean(48, true);
        setHint(typedArray.getText(4));
        this.I0 = typedArray.getBoolean(47, true);
        this.H0 = typedArray.getBoolean(42, true);
        if (typedArray.hasValue(6)) {
            setMinEms(typedArray.getInt(6, -1));
        } else if (typedArray.hasValue(3)) {
            setMinWidth(typedArray.getDimensionPixelSize(3, -1));
        }
        if (typedArray.hasValue(5)) {
            setMaxEms(typedArray.getInt(5, -1));
        } else if (typedArray.hasValue(2)) {
            setMaxWidth(typedArray.getDimensionPixelSize(2, -1));
        }
        this.W = C1891jd0.b(context2, attributeSet, com.skidush.clonex.R.attr.textInputStyle, com.skidush.clonex.R.style.Widget_Design_TextInputLayout).a();
        this.b0 = context2.getResources().getDimensionPixelOffset(com.skidush.clonex.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.d0 = typedArray.getDimensionPixelOffset(9, 0);
        this.f0 = typedArray.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.skidush.clonex.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.g0 = typedArray.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.skidush.clonex.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.e0 = this.f0;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        C1795id0 c1795id0E = this.W.e();
        if (dimension >= 0.0f) {
            c1795id0E.e = new C2421p(dimension);
        }
        if (dimension2 >= 0.0f) {
            c1795id0E.f = new C2421p(dimension2);
        }
        if (dimension3 >= 0.0f) {
            c1795id0E.g = new C2421p(dimension3);
        }
        if (dimension4 >= 0.0f) {
            c1795id0E.h = new C2421p(dimension4);
        }
        this.W = c1795id0E.a();
        ColorStateList colorStateListM = AbstractC3021v9.m(context2, rnV, 7);
        if (colorStateListM != null) {
            int defaultColor = colorStateListM.getDefaultColor();
            this.z0 = defaultColor;
            this.i0 = defaultColor;
            if (colorStateListM.isStateful()) {
                this.A0 = colorStateListM.getColorForState(new int[]{-16842910}, -1);
                this.B0 = colorStateListM.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.C0 = colorStateListM.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.B0 = this.z0;
                ColorStateList colorStateListV = AbstractC1459f50.v(context2, com.skidush.clonex.R.color.mtrl_filled_background_color);
                this.A0 = colorStateListV.getColorForState(new int[]{-16842910}, -1);
                this.C0 = colorStateListV.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.i0 = 0;
            this.z0 = 0;
            this.A0 = 0;
            this.B0 = 0;
            this.C0 = 0;
        }
        if (typedArray.hasValue(1)) {
            ColorStateList colorStateListS = rnV.s(1);
            this.u0 = colorStateListS;
            this.t0 = colorStateListS;
        }
        ColorStateList colorStateListM2 = AbstractC3021v9.m(context2, rnV, 14);
        this.x0 = typedArray.getColor(14, 0);
        this.v0 = AbstractC1459f50.u(context2, com.skidush.clonex.R.color.mtrl_textinput_default_box_stroke_color);
        this.D0 = AbstractC1459f50.u(context2, com.skidush.clonex.R.color.mtrl_textinput_disabled_color);
        this.w0 = AbstractC1459f50.u(context2, com.skidush.clonex.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListM2 != null) {
            setBoxStrokeColorStateList(colorStateListM2);
        }
        if (typedArray.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC3021v9.m(context2, rnV, 15));
        }
        if (typedArray.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(49, 0));
        }
        this.L = rnV.s(24);
        this.M = rnV.s(25);
        int resourceId = typedArray.getResourceId(40, 0);
        CharSequence text = typedArray.getText(35);
        int i = typedArray.getInt(34, 1);
        boolean z = typedArray.getBoolean(36, false);
        int resourceId2 = typedArray.getResourceId(45, 0);
        boolean z2 = typedArray.getBoolean(44, false);
        CharSequence text2 = typedArray.getText(43);
        int resourceId3 = typedArray.getResourceId(57, 0);
        CharSequence text3 = typedArray.getText(56);
        boolean z3 = typedArray.getBoolean(18, false);
        setCounterMaxLength(typedArray.getInt(19, -1));
        this.B = typedArray.getResourceId(22, 0);
        this.A = typedArray.getResourceId(20, 0);
        setBoxBackgroundMode(typedArray.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.A);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.B);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(41)) {
            setErrorTextColor(rnV.s(41));
        }
        if (typedArray.hasValue(46)) {
            setHelperTextColor(rnV.s(46));
        }
        if (typedArray.hasValue(50)) {
            setHintTextColor(rnV.s(50));
        }
        if (typedArray.hasValue(23)) {
            setCounterTextColor(rnV.s(23));
        }
        if (typedArray.hasValue(21)) {
            setCounterOverflowTextColor(rnV.s(21));
        }
        if (typedArray.hasValue(58)) {
            setPlaceholderTextColor(rnV.s(58));
        }
        C2403oq c2403oq = new C2403oq(this, rnV);
        this.n = c2403oq;
        boolean z4 = typedArray.getBoolean(0, true);
        rnV.A();
        setImportantForAccessibility(2);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && i2 >= 26) {
            AbstractC3476zt0.m(this, 1);
        }
        frameLayout.addView(c2190mg0);
        frameLayout.addView(c2403oq);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f45o;
        if (!(editText instanceof AutoCompleteTextView) || Ou0.q(editText)) {
            return this.Q;
        }
        int iO = UK.o(this.f45o, com.skidush.clonex.R.attr.colorControlHighlight);
        int i = this.c0;
        int[][] iArr = N0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            C2068lO c2068lO = this.Q;
            int i2 = this.i0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{UK.I(iO, 0.1f, i2), i2}), c2068lO, c2068lO);
        }
        Context context = getContext();
        C2068lO c2068lO2 = this.Q;
        TypedValue typedValueA = zy0.A(com.skidush.clonex.R.attr.colorSurface, context, "TextInputLayout");
        int i3 = typedValueA.resourceId;
        int iU = i3 != 0 ? AbstractC1459f50.u(context, i3) : typedValueA.data;
        C2068lO c2068lO3 = new C2068lO(c2068lO2.l.a);
        int I = UK.I(iO, 0.1f, iU);
        c2068lO3.l(new ColorStateList(iArr, new int[]{I, 0}));
        c2068lO3.setTint(iU);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{I, iU});
        C2068lO c2068lO4 = new C2068lO(c2068lO2.l.a);
        c2068lO4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c2068lO3, c2068lO4), c2068lO2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.S == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.S = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.S.addState(new int[0], f(false));
        }
        return this.S;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.R == null) {
            this.R = f(true);
        }
        return this.R;
    }

    public static void k(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f45o != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3) {
            boolean z = editText instanceof TextInputEditText;
        }
        this.f45o = editText;
        int i = this.q;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.s);
        }
        int i2 = this.r;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.t);
        }
        this.T = false;
        i();
        setTextInputAccessibilityDelegate(new Ni0(this));
        Typeface typeface = this.f45o.getTypeface();
        C0859We c0859We = this.G0;
        c0859We.m(typeface);
        float textSize = this.f45o.getTextSize();
        if (c0859We.h != textSize) {
            c0859We.h = textSize;
            c0859We.h(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f45o.getLetterSpacing();
        if (c0859We.W != letterSpacing) {
            c0859We.W = letterSpacing;
            c0859We.h(false);
        }
        int gravity = this.f45o.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (c0859We.g != i4) {
            c0859We.g = i4;
            c0859We.h(false);
        }
        if (c0859We.f != gravity) {
            c0859We.f = gravity;
            c0859We.h(false);
        }
        WeakHashMap weakHashMap = It0.a;
        this.E0 = editText.getMinimumHeight();
        this.f45o.addTextChangedListener(new Mi0(this, editText));
        if (this.t0 == null) {
            this.t0 = this.f45o.getHintTextColors();
        }
        if (this.N) {
            if (TextUtils.isEmpty(this.O)) {
                CharSequence hint = this.f45o.getHint();
                this.p = hint;
                setHint(hint);
                this.f45o.setHint((CharSequence) null);
            }
            this.P = true;
        }
        if (i3 >= 29) {
            p();
        }
        if (this.z != null) {
            n(this.f45o.getText());
        }
        r();
        this.u.b();
        this.m.bringToFront();
        C2403oq c2403oq = this.n;
        c2403oq.bringToFront();
        Iterator it = this.p0.iterator();
        while (it.hasNext()) {
            ((C2306nq) it.next()).a(this);
        }
        c2403oq.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.O)) {
            return;
        }
        this.O = charSequence;
        C0859We c0859We = this.G0;
        if (charSequence == null || !TextUtils.equals(c0859We.A, charSequence)) {
            c0859We.A = charSequence;
            c0859We.B = null;
            Bitmap bitmap = c0859We.E;
            if (bitmap != null) {
                bitmap.recycle();
                c0859We.E = null;
            }
            c0859We.h(false);
        }
        if (this.F0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.D == z) {
            return;
        }
        if (z) {
            T4 t4 = this.E;
            if (t4 != null) {
                this.l.addView(t4);
                this.E.setVisibility(0);
            }
        } else {
            T4 t5 = this.E;
            if (t5 != null) {
                t5.setVisibility(8);
            }
            this.E = null;
        }
        this.D = z;
    }

    public final void a(float f) {
        C0859We c0859We = this.G0;
        if (c0859We.b == f) {
            return;
        }
        if (this.J0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.J0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC3045vW.E(getContext(), com.skidush.clonex.R.attr.motionEasingEmphasizedInterpolator, AbstractC1161c3.b));
            this.J0.setDuration(AbstractC3045vW.D(getContext(), com.skidush.clonex.R.attr.motionDurationMedium4, 167));
            this.J0.addUpdateListener(new C2052l9(2, this));
        }
        this.J0.setFloatValues(c0859We.b, f);
        this.J0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.l;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i;
        int i2;
        C2068lO c2068lO = this.Q;
        if (c2068lO == null) {
            return;
        }
        C1891jd0 c1891jd0 = c2068lO.l.a;
        C1891jd0 c1891jd1 = this.W;
        if (c1891jd0 != c1891jd1) {
            c2068lO.setShapeAppearanceModel(c1891jd1);
        }
        if (this.c0 == 2 && (i = this.e0) > -1 && (i2 = this.h0) != 0) {
            C2068lO c2068lO2 = this.Q;
            c2068lO2.l.k = i;
            c2068lO2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
            C1970kO c1970kO = c2068lO2.l;
            if (c1970kO.d != colorStateListValueOf) {
                c1970kO.d = colorStateListValueOf;
                c2068lO2.onStateChange(c2068lO2.getState());
            }
        }
        int iD = this.i0;
        if (this.c0 == 1) {
            iD = AbstractC1894jf.d(this.i0, UK.n(getContext(), com.skidush.clonex.R.attr.colorSurface, 0));
        }
        this.i0 = iD;
        this.Q.l(ColorStateList.valueOf(iD));
        C2068lO c2068lO3 = this.U;
        if (c2068lO3 != null && this.V != null) {
            if (this.e0 > -1 && this.h0 != 0) {
                c2068lO3.l(this.f45o.isFocused() ? ColorStateList.valueOf(this.v0) : ColorStateList.valueOf(this.h0));
                this.V.l(ColorStateList.valueOf(this.h0));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float fD;
        if (!this.N) {
            return 0;
        }
        int i = this.c0;
        C0859We c0859We = this.G0;
        if (i == 0) {
            fD = c0859We.d();
        } else {
            if (i != 2) {
                return 0;
            }
            fD = c0859We.d() / 2.0f;
        }
        return (int) fD;
    }

    public final C0484Hs d() {
        C0484Hs c0484Hs = new C0484Hs();
        c0484Hs.n = AbstractC3045vW.D(getContext(), com.skidush.clonex.R.attr.motionDurationShort2, 87);
        c0484Hs.f202o = AbstractC3045vW.E(getContext(), com.skidush.clonex.R.attr.motionEasingLinearInterpolator, AbstractC1161c3.a);
        return c0484Hs;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f45o;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.p != null) {
            boolean z = this.P;
            this.P = false;
            CharSequence hint = editText.getHint();
            this.f45o.setHint(this.p);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f45o.setHint(hint);
                this.P = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.l;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f45o) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.L0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.L0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C2068lO c2068lO;
        int i;
        super.draw(canvas);
        boolean z = this.N;
        C0859We c0859We = this.G0;
        if (z) {
            c0859We.getClass();
            int iSave = canvas.save();
            if (c0859We.B != null) {
                RectF rectF = c0859We.e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = c0859We.N;
                    textPaint.setTextSize(c0859We.G);
                    float f = c0859We.p;
                    float f2 = c0859We.q;
                    float f3 = c0859We.F;
                    if (f3 != 1.0f) {
                        canvas.scale(f3, f3, f, f2);
                    }
                    if (c0859We.d0 <= 1 || c0859We.C) {
                        canvas.translate(f, f2);
                        c0859We.Y.draw(canvas);
                    } else {
                        float lineStart = c0859We.p - c0859We.Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f2);
                        float f4 = alpha;
                        textPaint.setAlpha((int) (c0859We.b0 * f4));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            float f5 = c0859We.H;
                            float f6 = c0859We.I;
                            float f7 = c0859We.J;
                            int i3 = c0859We.K;
                            textPaint.setShadowLayer(f5, f6, f7, AbstractC1894jf.f(i3, (textPaint.getAlpha() * Color.alpha(i3)) / 255));
                        }
                        c0859We.Y.draw(canvas);
                        textPaint.setAlpha((int) (c0859We.a0 * f4));
                        if (i2 >= 31) {
                            float f8 = c0859We.H;
                            float f9 = c0859We.I;
                            float f10 = c0859We.J;
                            int i4 = c0859We.K;
                            textPaint.setShadowLayer(f8, f9, f10, AbstractC1894jf.f(i4, (Color.alpha(i4) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = c0859We.Y.getLineBaseline(0);
                        CharSequence charSequence = c0859We.c0;
                        float f11 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(c0859We.H, c0859We.I, c0859We.J, c0859We.K);
                        }
                        String strTrim = c0859We.c0.toString().trim();
                        if (strTrim.endsWith("…")) {
                            i = 0;
                            strTrim = strTrim.substring(0, strTrim.length() - 1);
                        } else {
                            i = 0;
                        }
                        String str = strTrim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(c0859We.Y.getLineEnd(i), str.length()), 0.0f, f11, (Paint) textPaint);
                    }
                    canvas.restoreToCount(iSave);
                }
            }
        }
        if (this.V == null || (c2068lO = this.U) == null) {
            return;
        }
        c2068lO.draw(canvas);
        if (this.f45o.isFocused()) {
            Rect bounds = this.V.getBounds();
            Rect bounds2 = this.U.getBounds();
            float f12 = c0859We.b;
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC1161c3.c(iCenterX, f12, bounds2.left);
            bounds.right = AbstractC1161c3.c(iCenterX, f12, bounds2.right);
            this.V.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.K0) {
            return;
        }
        this.K0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C0859We c0859We = this.G0;
        if (c0859We != null) {
            c0859We.L = drawableState;
            ColorStateList colorStateList2 = c0859We.k;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = c0859We.j) == null || !colorStateList.isStateful())) {
                z = false;
            } else {
                c0859We.h(false);
                z = true;
            }
        } else {
            z = false;
        }
        if (this.f45o != null) {
            WeakHashMap weakHashMap = It0.a;
            u(isLaidOut() && isEnabled(), false);
        }
        r();
        x();
        if (z) {
            invalidate();
        }
        this.K0 = false;
    }

    public final boolean e() {
        return this.N && !TextUtils.isEmpty(this.O) && (this.Q instanceof C0318Bi);
    }

    public final C2068lO f(boolean z) {
        int i = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.skidush.clonex.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f45o;
        float popupElevation = editText instanceof LN ? ((LN) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.skidush.clonex.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.skidush.clonex.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        J80 j80 = new J80();
        J80 j81 = new J80();
        J80 j82 = new J80();
        J80 j83 = new J80();
        C2691rp c2691rp = new C2691rp(i);
        C2691rp c2691rp2 = new C2691rp(i);
        C2691rp c2691rp3 = new C2691rp(i);
        C2691rp c2691rp4 = new C2691rp(i);
        C2421p c2421p = new C2421p(f);
        C2421p c2421p2 = new C2421p(f);
        C2421p c2421p3 = new C2421p(dimensionPixelOffset);
        C2421p c2421p4 = new C2421p(dimensionPixelOffset);
        C1891jd0 c1891jd0 = new C1891jd0();
        c1891jd0.a = j80;
        c1891jd0.b = j81;
        c1891jd0.c = j82;
        c1891jd0.d = j83;
        c1891jd0.e = c2421p;
        c1891jd0.f = c2421p2;
        c1891jd0.g = c2421p4;
        c1891jd0.h = c2421p3;
        c1891jd0.i = c2691rp;
        c1891jd0.j = c2691rp2;
        c1891jd0.k = c2691rp3;
        c1891jd0.l = c2691rp4;
        EditText editText2 = this.f45o;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof LN ? ((LN) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = C2068lO.H;
            TypedValue typedValueA = zy0.A(com.skidush.clonex.R.attr.colorSurface, context, C2068lO.class.getSimpleName());
            int i2 = typedValueA.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? AbstractC1459f50.u(context, i2) : typedValueA.data);
        }
        C2068lO c2068lO = new C2068lO();
        c2068lO.j(context);
        c2068lO.l(dropDownBackgroundTintList);
        c2068lO.k(popupElevation);
        c2068lO.setShapeAppearanceModel(c1891jd0);
        C1970kO c1970kO = c2068lO.l;
        if (c1970kO.h == null) {
            c1970kO.h = new Rect();
        }
        c2068lO.l.h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        c2068lO.invalidateSelf();
        return c2068lO;
    }

    public final int g(int i, boolean z) {
        int compoundPaddingLeft;
        if (z || getPrefixText() == null) {
            compoundPaddingLeft = (!z || getSuffixText() == null) ? this.f45o.getCompoundPaddingLeft() : this.n.c();
        } else {
            compoundPaddingLeft = this.m.a();
        }
        return compoundPaddingLeft + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f45o;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public C2068lO getBoxBackground() {
        int i = this.c0;
        if (i == 1 || i == 2) {
            return this.Q;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.i0;
    }

    public int getBoxBackgroundMode() {
        return this.c0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.d0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zS = AbstractC3409z9.s(this);
        RectF rectF = this.l0;
        return zS ? this.W.h.a(rectF) : this.W.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zS = AbstractC3409z9.s(this);
        RectF rectF = this.l0;
        return zS ? this.W.g.a(rectF) : this.W.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zS = AbstractC3409z9.s(this);
        RectF rectF = this.l0;
        return zS ? this.W.e.a(rectF) : this.W.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zS = AbstractC3409z9.s(this);
        RectF rectF = this.l0;
        return zS ? this.W.f.a(rectF) : this.W.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.x0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.y0;
    }

    public int getBoxStrokeWidth() {
        return this.f0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.g0;
    }

    public int getCounterMaxLength() {
        return this.w;
    }

    public CharSequence getCounterOverflowDescription() {
        T4 t4;
        if (this.v && this.x && (t4 = this.z) != null) {
            return t4.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.K;
    }

    public ColorStateList getCounterTextColor() {
        return this.J;
    }

    public ColorStateList getCursorColor() {
        return this.L;
    }

    public ColorStateList getCursorErrorColor() {
        return this.M;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.t0;
    }

    public EditText getEditText() {
        return this.f45o;
    }

    public CharSequence getEndIconContentDescription() {
        return this.n.r.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.n.r.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.n.x;
    }

    public int getEndIconMode() {
        return this.n.t;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.n.y;
    }

    public CheckableImageButton getEndIconView() {
        return this.n.r;
    }

    public CharSequence getError() {
        DF df = this.u;
        if (df.q) {
            return df.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.u.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.u.s;
    }

    public int getErrorCurrentTextColors() {
        T4 t4 = this.u.r;
        if (t4 != null) {
            return t4.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.n.n.getDrawable();
    }

    public CharSequence getHelperText() {
        DF df = this.u;
        if (df.x) {
            return df.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        T4 t4 = this.u.y;
        if (t4 != null) {
            return t4.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.N) {
            return this.O;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.G0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C0859We c0859We = this.G0;
        return c0859We.e(c0859We.k);
    }

    public ColorStateList getHintTextColor() {
        return this.u0;
    }

    public Oi0 getLengthCounter() {
        return this.y;
    }

    public int getMaxEms() {
        return this.r;
    }

    public int getMaxWidth() {
        return this.t;
    }

    public int getMinEms() {
        return this.q;
    }

    public int getMinWidth() {
        return this.s;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.n.r.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.n.r.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.D) {
            return this.C;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.G;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.F;
    }

    public CharSequence getPrefixText() {
        return this.m.n;
    }

    public ColorStateList getPrefixTextColor() {
        return this.m.m.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.m.m;
    }

    public C1891jd0 getShapeAppearanceModel() {
        return this.W;
    }

    public CharSequence getStartIconContentDescription() {
        return this.m.f916o.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.m.f916o.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.m.r;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.m.s;
    }

    public CharSequence getSuffixText() {
        return this.n.A;
    }

    public ColorStateList getSuffixTextColor() {
        return this.n.B.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.n.B;
    }

    public Typeface getTypeface() {
        return this.m0;
    }

    public final int h(int i, boolean z) {
        int compoundPaddingRight;
        if (z || getSuffixText() == null) {
            compoundPaddingRight = (!z || getPrefixText() == null) ? this.f45o.getCompoundPaddingRight() : this.m.a();
        } else {
            compoundPaddingRight = this.n.c();
        }
        return i - compoundPaddingRight;
    }

    public final void i() {
        int i = this.c0;
        if (i == 0) {
            this.Q = null;
            this.U = null;
            this.V = null;
        } else if (i == 1) {
            this.Q = new C2068lO(this.W);
            this.U = new C2068lO();
            this.V = new C2068lO();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(AbstractC1701hf0.g(new StringBuilder(), this.c0, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.N || (this.Q instanceof C0318Bi)) {
                this.Q = new C2068lO(this.W);
            } else {
                C1891jd0 c1891jd0 = this.W;
                int i2 = C0318Bi.J;
                if (c1891jd0 == null) {
                    c1891jd0 = new C1891jd0();
                }
                this.Q = new C0318Bi(new C0292Ai(c1891jd0, new RectF()));
            }
            this.U = null;
            this.V = null;
        }
        s();
        x();
        if (this.c0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.d0 = getResources().getDimensionPixelSize(com.skidush.clonex.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (AbstractC3021v9.s(getContext())) {
                this.d0 = getResources().getDimensionPixelSize(com.skidush.clonex.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f45o != null && this.c0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f45o;
                WeakHashMap weakHashMap = It0.a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.skidush.clonex.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f45o.getPaddingEnd(), getResources().getDimensionPixelSize(com.skidush.clonex.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (AbstractC3021v9.s(getContext())) {
                EditText editText2 = this.f45o;
                WeakHashMap weakHashMap2 = It0.a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.skidush.clonex.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f45o.getPaddingEnd(), getResources().getDimensionPixelSize(com.skidush.clonex.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.c0 != 0) {
            t();
        }
        EditText editText3 = this.f45o;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.c0;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008d  */
    public final void j() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        int i;
        int i2;
        if (e()) {
            int width = this.f45o.getWidth();
            int gravity = this.f45o.getGravity();
            C0859We c0859We = this.G0;
            boolean zB = c0859We.b(c0859We.A);
            c0859We.C = zB;
            Rect rect = c0859We.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zB) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = c0859We.Z;
                    }
                } else if (zB) {
                    f = rect.right;
                    f2 = c0859We.Z;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float fMax = Math.max(f3, rect.left);
                rectF = this.l0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (c0859We.Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c0859We.C) {
                        f4 = fMax + c0859We.Z;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (c0859We.C) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f4 = c0859We.Z + fMax;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = c0859We.d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f5 = rectF.left;
                float f6 = this.b0;
                rectF.left = f5 - f6;
                rectF.right += f6;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.e0);
                C0318Bi c0318Bi = (C0318Bi) this.Q;
                c0318Bi.getClass();
                c0318Bi.p(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = c0859We.Z / 2.0f;
            f3 = f - f2;
            float fMax2 = Math.max(f3, rect.left);
            rectF = this.l0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f4 = (width / 2.0f) + (c0859We.Z / 2.0f);
            } else {
                f4 = (width / 2.0f) + (c0859We.Z / 2.0f);
            }
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = c0859We.d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(TextView textView, int i) {
        try {
            AbstractC3045vW.L(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        AbstractC3045vW.L(textView, com.skidush.clonex.R.style.TextAppearance_AppCompat_Caption);
        textView.setTextColor(AbstractC1459f50.u(getContext(), com.skidush.clonex.R.color.design_error));
    }

    public final boolean m() {
        DF df = this.u;
        return (df.f212o != 1 || df.r == null || TextUtils.isEmpty(df.p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((C1306dd0) this.y).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.x;
        int i = this.w;
        String string = null;
        if (i == -1) {
            this.z.setText(String.valueOf(length));
            this.z.setContentDescription(null);
            this.x = false;
        } else {
            this.x = length > i;
            Context context = getContext();
            this.z.setContentDescription(context.getString(this.x ? com.skidush.clonex.R.string.character_counter_overflowed_content_description : com.skidush.clonex.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.w)));
            if (z != this.x) {
                o();
            }
            String str = D8.d;
            D8 d8 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? D8.g : D8.f;
            T4 t4 = this.z;
            String string2 = getContext().getString(com.skidush.clonex.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.w));
            if (string2 == null) {
                d8.getClass();
            } else {
                string = d8.c(string2, d8.c).toString();
            }
            t4.setText(string);
        }
        if (this.f45o == null || z == this.x) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        T4 t4 = this.z;
        if (t4 != null) {
            l(t4, this.x ? this.A : this.B);
            if (!this.x && (colorStateList2 = this.J) != null) {
                this.z.setTextColor(colorStateList2);
            }
            if (!this.x || (colorStateList = this.K) == null) {
                return;
            }
            this.z.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.G0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        C2403oq c2403oq = this.n;
        c2403oq.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.M0 = false;
        if (this.f45o != null && this.f45o.getMeasuredHeight() < (iMax = Math.max(c2403oq.getMeasuredHeight(), this.m.getMeasuredHeight()))) {
            this.f45o.setMinimumHeight(iMax);
            z = true;
        }
        boolean zQ = q();
        if (z || zQ) {
            this.f45o.post(new RunnableC1147bv0(this, 1));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f45o;
        if (editText != null) {
            ThreadLocal threadLocal = AbstractC2492pm.a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.j0;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = AbstractC2492pm.a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            AbstractC2492pm.a(this, editText, matrix);
            ThreadLocal threadLocal3 = AbstractC2492pm.b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            C2068lO c2068lO = this.U;
            if (c2068lO != null) {
                int i5 = rect.bottom;
                c2068lO.setBounds(rect.left, i5 - this.f0, rect.right, i5);
            }
            C2068lO c2068lO2 = this.V;
            if (c2068lO2 != null) {
                int i6 = rect.bottom;
                c2068lO2.setBounds(rect.left, i6 - this.g0, rect.right, i6);
            }
            if (this.N) {
                float textSize = this.f45o.getTextSize();
                C0859We c0859We = this.G0;
                if (c0859We.h != textSize) {
                    c0859We.h = textSize;
                    c0859We.h(false);
                }
                int gravity = this.f45o.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (c0859We.g != i7) {
                    c0859We.g = i7;
                    c0859We.h(false);
                }
                if (c0859We.f != gravity) {
                    c0859We.f = gravity;
                    c0859We.h(false);
                }
                if (this.f45o == null) {
                    throw new IllegalStateException();
                }
                boolean zS = AbstractC3409z9.s(this);
                int i8 = rect.bottom;
                Rect rect2 = this.k0;
                rect2.bottom = i8;
                int i9 = this.c0;
                if (i9 == 1) {
                    rect2.left = g(rect.left, zS);
                    rect2.top = rect.top + this.d0;
                    rect2.right = h(rect.right, zS);
                } else if (i9 != 2) {
                    rect2.left = g(rect.left, zS);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, zS);
                } else {
                    rect2.left = this.f45o.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.f45o.getPaddingRight();
                }
                int i10 = rect2.left;
                int i11 = rect2.top;
                int i12 = rect2.right;
                int i13 = rect2.bottom;
                Rect rect3 = c0859We.d;
                if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                    rect3.set(i10, i11, i12, i13);
                    c0859We.M = true;
                }
                if (this.f45o == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = c0859We.O;
                textPaint.setTextSize(c0859We.h);
                textPaint.setTypeface(c0859We.u);
                textPaint.setLetterSpacing(c0859We.W);
                float f = -textPaint.ascent();
                rect2.left = this.f45o.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.c0 != 1 || this.f45o.getMinLines() > 1) ? rect.top + this.f45o.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect2.right = rect.right - this.f45o.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.c0 != 1 || this.f45o.getMinLines() > 1) ? rect.bottom - this.f45o.getCompoundPaddingBottom() : (int) (rect2.top + f);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = c0859We.c;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    c0859We.M = true;
                }
                c0859We.h(false);
                if (!e() || this.F0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.M0;
        C2403oq c2403oq = this.n;
        if (!z) {
            c2403oq.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.M0 = true;
        }
        if (this.E != null && (editText = this.f45o) != null) {
            this.E.setGravity(editText.getGravity());
            this.E.setPadding(this.f45o.getCompoundPaddingLeft(), this.f45o.getCompoundPaddingTop(), this.f45o.getCompoundPaddingRight(), this.f45o.getCompoundPaddingBottom());
        }
        c2403oq.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Pi0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Pi0 pi0 = (Pi0) parcelable;
        super.onRestoreInstanceState(pi0.l);
        setError(pi0.n);
        if (pi0.f460o) {
            post(new RunnableC3102w1(25, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.a0) {
            InterfaceC0888Xh interfaceC0888Xh = this.W.e;
            RectF rectF = this.l0;
            float fA = interfaceC0888Xh.a(rectF);
            float fA2 = this.W.f.a(rectF);
            float fA3 = this.W.h.a(rectF);
            float fA4 = this.W.g.a(rectF);
            C1891jd0 c1891jd0 = this.W;
            Nr0 nr0 = c1891jd0.a;
            Nr0 nr1 = c1891jd0.b;
            Nr0 nr2 = c1891jd0.d;
            Nr0 nr3 = c1891jd0.c;
            C2691rp c2691rp = new C2691rp(0);
            C2691rp c2691rp2 = new C2691rp(0);
            C2691rp c2691rp3 = new C2691rp(0);
            C2691rp c2691rp4 = new C2691rp(0);
            C1795id0.b(nr1);
            C1795id0.b(nr0);
            C1795id0.b(nr3);
            C1795id0.b(nr2);
            C2421p c2421p = new C2421p(fA2);
            C2421p c2421p2 = new C2421p(fA);
            C2421p c2421p3 = new C2421p(fA4);
            C2421p c2421p4 = new C2421p(fA3);
            C1891jd0 c1891jd1 = new C1891jd0();
            c1891jd1.a = nr1;
            c1891jd1.b = nr0;
            c1891jd1.c = nr2;
            c1891jd1.d = nr3;
            c1891jd1.e = c2421p;
            c1891jd1.f = c2421p2;
            c1891jd1.g = c2421p4;
            c1891jd1.h = c2421p3;
            c1891jd1.i = c2691rp;
            c1891jd1.j = c2691rp2;
            c1891jd1.k = c2691rp3;
            c1891jd1.l = c2691rp4;
            this.a0 = z;
            setShapeAppearanceModel(c1891jd1);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Pi0 pi0 = new Pi0(super.onSaveInstanceState());
        if (m()) {
            pi0.n = getError();
        }
        C2403oq c2403oq = this.n;
        pi0.f460o = c2403oq.t != 0 && c2403oq.r.f43o;
        return pi0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void p() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.L;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueY = zy0.y(context, com.skidush.clonex.R.attr.colorControlActivated);
            if (typedValueY != null) {
                int i = typedValueY.resourceId;
                if (i != 0) {
                    colorStateListValueOf = AbstractC1459f50.v(context, i);
                } else {
                    int i2 = typedValueY.data;
                    if (i2 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i2);
                    } else {
                        colorStateListValueOf = null;
                    }
                }
            } else {
                colorStateListValueOf = null;
            }
        }
        EditText editText = this.f45o;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = AbstractC3045vW.R(this.f45o.getTextCursorDrawable()).mutate();
        if ((m() || (this.z != null && this.x)) && (colorStateList = this.M) != null) {
            colorStateListValueOf = colorStateList;
        }
        AbstractC2205mo.h(drawableMutate, colorStateListValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    public final boolean q() {
        boolean z;
        if (this.f45o == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            C2190mg0 c2190mg0 = this.m;
            if (c2190mg0.getMeasuredWidth() > 0) {
                int measuredWidth = c2190mg0.getMeasuredWidth() - this.f45o.getPaddingLeft();
                if (this.n0 == null || this.o0 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.n0 = colorDrawable;
                    this.o0 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.f45o.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.n0;
                if (drawable != colorDrawable2) {
                    this.f45o.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z = true;
                } else {
                    z = false;
                }
            } else if (this.n0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.f45o.getCompoundDrawablesRelative();
                this.f45o.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.n0 = null;
                z = true;
            } else {
                z = false;
            }
        } else if (this.n0 != null) {
            Drawable[] compoundDrawablesRelative3 = this.f45o.getCompoundDrawablesRelative();
            this.f45o.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.n0 = null;
            z = true;
        } else {
            z = false;
        }
        C2403oq c2403oq = this.n;
        if ((c2403oq.e() || ((c2403oq.t != 0 && c2403oq.d()) || c2403oq.A != null)) && c2403oq.getMeasuredWidth() > 0) {
            int measuredWidth2 = c2403oq.B.getMeasuredWidth() - this.f45o.getPaddingRight();
            if (c2403oq.e()) {
                checkableImageButton = c2403oq.n;
            } else if (c2403oq.t != 0 && c2403oq.d()) {
                checkableImageButton = c2403oq.r;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative4 = this.f45o.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.q0;
            if (colorDrawable3 == null || this.r0 == measuredWidth2) {
                if (colorDrawable3 == null) {
                    ColorDrawable colorDrawable4 = new ColorDrawable();
                    this.q0 = colorDrawable4;
                    this.r0 = measuredWidth2;
                    colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable2 = compoundDrawablesRelative4[2];
                ColorDrawable colorDrawable5 = this.q0;
                if (drawable2 != colorDrawable5) {
                    this.s0 = drawable2;
                    this.f45o.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.r0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f45o.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.q0, compoundDrawablesRelative4[3]);
            }
        } else {
            if (this.q0 == null) {
                return z;
            }
            Drawable[] compoundDrawablesRelative5 = this.f45o.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.q0) {
                this.f45o.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.s0, compoundDrawablesRelative5[3]);
            } else {
                z2 = z;
            }
            this.q0 = null;
        }
        return z2;
    }

    public final void r() {
        Drawable background;
        T4 t4;
        PorterDuffColorFilter porterDuffColorFilterH;
        EditText editText = this.f45o;
        if (editText == null || this.c0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC3077vo.a;
        Drawable drawableMutate = background.mutate();
        if (m()) {
            int errorCurrentTextColors = getErrorCurrentTextColors();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            PorterDuff.Mode mode2 = C1846j4.b;
            synchronized (C1846j4.class) {
                porterDuffColorFilterH = Y70.h(errorCurrentTextColors, mode);
            }
            drawableMutate.setColorFilter(porterDuffColorFilterH);
            return;
        }
        if (this.x && (t4 = this.z) != null) {
            drawableMutate.setColorFilter(C1846j4.c(t4.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            AbstractC3045vW.l(drawableMutate);
            this.f45o.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.f45o;
        if (editText == null || this.Q == null) {
            return;
        }
        if ((this.T || editText.getBackground() == null) && this.c0 != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f45o;
            WeakHashMap weakHashMap = It0.a;
            editText2.setBackground(editTextBoxBackground);
            this.T = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.i0 != i) {
            this.i0 = i;
            this.z0 = i;
            this.B0 = i;
            this.C0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(AbstractC1459f50.u(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.z0 = defaultColor;
        this.i0 = defaultColor;
        this.A0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.B0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.C0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.c0) {
            return;
        }
        this.c0 = i;
        if (this.f45o != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.d0 = i;
    }

    public void setBoxCornerFamily(int i) {
        C1795id0 c1795id0E = this.W.e();
        InterfaceC0888Xh interfaceC0888Xh = this.W.e;
        Nr0 nr0J = AbstractC3409z9.j(i);
        c1795id0E.a = nr0J;
        C1795id0.b(nr0J);
        c1795id0E.e = interfaceC0888Xh;
        InterfaceC0888Xh interfaceC0888Xh2 = this.W.f;
        Nr0 nr0J2 = AbstractC3409z9.j(i);
        c1795id0E.b = nr0J2;
        C1795id0.b(nr0J2);
        c1795id0E.f = interfaceC0888Xh2;
        InterfaceC0888Xh interfaceC0888Xh3 = this.W.h;
        Nr0 nr0J3 = AbstractC3409z9.j(i);
        c1795id0E.d = nr0J3;
        C1795id0.b(nr0J3);
        c1795id0E.h = interfaceC0888Xh3;
        InterfaceC0888Xh interfaceC0888Xh4 = this.W.g;
        Nr0 nr0J4 = AbstractC3409z9.j(i);
        c1795id0E.c = nr0J4;
        C1795id0.b(nr0J4);
        c1795id0E.g = interfaceC0888Xh4;
        this.W = c1795id0E.a();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.x0 != i) {
            this.x0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.v0 = colorStateList.getDefaultColor();
            this.D0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.w0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.x0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.x0 != colorStateList.getDefaultColor()) {
            this.x0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.y0 != colorStateList) {
            this.y0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f0 = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.g0 = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.v != z) {
            DF df = this.u;
            if (z) {
                T4 t4 = new T4(getContext(), null);
                this.z = t4;
                t4.setId(com.skidush.clonex.R.id.textinput_counter);
                Typeface typeface = this.m0;
                if (typeface != null) {
                    this.z.setTypeface(typeface);
                }
                this.z.setMaxLines(1);
                df.a(this.z, 2);
                ((ViewGroup.MarginLayoutParams) this.z.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.skidush.clonex.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.z != null) {
                    EditText editText = this.f45o;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                df.g(this.z, 2);
                this.z = null;
            }
            this.v = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.w != i) {
            if (i > 0) {
                this.w = i;
            } else {
                this.w = -1;
            }
            if (!this.v || this.z == null) {
                return;
            }
            EditText editText = this.f45o;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.A != i) {
            this.A = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.K != colorStateList) {
            this.K = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.B != i) {
            this.B = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.J != colorStateList) {
            this.J = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.L != colorStateList) {
            this.L = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.M != colorStateList) {
            this.M = colorStateList;
            if (m() || (this.z != null && this.x)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.t0 = colorStateList;
        this.u0 = colorStateList;
        if (this.f45o != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        k(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.n.r.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.n.r.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        C2403oq c2403oq = this.n;
        CharSequence text = i != 0 ? c2403oq.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = c2403oq.r;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        C2403oq c2403oq = this.n;
        Drawable drawableL = i != 0 ? Ou0.l(c2403oq.getContext(), i) : null;
        CheckableImageButton checkableImageButton = c2403oq.r;
        checkableImageButton.setImageDrawable(drawableL);
        if (drawableL != null) {
            ColorStateList colorStateList = c2403oq.v;
            PorterDuff.Mode mode = c2403oq.w;
            TextInputLayout textInputLayout = c2403oq.l;
            AbstractC1459f50.d(textInputLayout, checkableImageButton, colorStateList, mode);
            AbstractC1459f50.J(textInputLayout, checkableImageButton, c2403oq.v);
        }
    }

    public void setEndIconMinSize(int i) {
        C2403oq c2403oq = this.n;
        if (i < 0) {
            c2403oq.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != c2403oq.x) {
            c2403oq.x = i;
            CheckableImageButton checkableImageButton = c2403oq.r;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = c2403oq.n;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.n.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C2403oq c2403oq = this.n;
        View.OnLongClickListener onLongClickListener = c2403oq.z;
        CheckableImageButton checkableImageButton = c2403oq.r;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC1459f50.M(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C2403oq c2403oq = this.n;
        c2403oq.z = onLongClickListener;
        CheckableImageButton checkableImageButton = c2403oq.r;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC1459f50.M(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C2403oq c2403oq = this.n;
        c2403oq.y = scaleType;
        c2403oq.r.setScaleType(scaleType);
        c2403oq.n.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C2403oq c2403oq = this.n;
        if (c2403oq.v != colorStateList) {
            c2403oq.v = colorStateList;
            AbstractC1459f50.d(c2403oq.l, c2403oq.r, colorStateList, c2403oq.w);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C2403oq c2403oq = this.n;
        if (c2403oq.w != mode) {
            c2403oq.w = mode;
            AbstractC1459f50.d(c2403oq.l, c2403oq.r, c2403oq.v, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.n.h(z);
    }

    public void setError(CharSequence charSequence) {
        DF df = this.u;
        if (!df.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            df.f();
            return;
        }
        df.c();
        df.p = charSequence;
        df.r.setText(charSequence);
        int i = df.n;
        if (i != 1) {
            df.f212o = 1;
        }
        df.i(i, df.f212o, df.h(df.r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        DF df = this.u;
        df.t = i;
        T4 t4 = df.r;
        if (t4 != null) {
            WeakHashMap weakHashMap = It0.a;
            t4.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        DF df = this.u;
        df.s = charSequence;
        T4 t4 = df.r;
        if (t4 != null) {
            t4.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        DF df = this.u;
        if (df.q == z) {
            return;
        }
        df.c();
        TextInputLayout textInputLayout = df.h;
        if (z) {
            T4 t4 = new T4(df.g, null);
            df.r = t4;
            t4.setId(com.skidush.clonex.R.id.textinput_error);
            df.r.setTextAlignment(5);
            Typeface typeface = df.B;
            if (typeface != null) {
                df.r.setTypeface(typeface);
            }
            int i = df.u;
            df.u = i;
            T4 t5 = df.r;
            if (t5 != null) {
                textInputLayout.l(t5, i);
            }
            ColorStateList colorStateList = df.v;
            df.v = colorStateList;
            T4 t6 = df.r;
            if (t6 != null && colorStateList != null) {
                t6.setTextColor(colorStateList);
            }
            CharSequence charSequence = df.s;
            df.s = charSequence;
            T4 t7 = df.r;
            if (t7 != null) {
                t7.setContentDescription(charSequence);
            }
            int i2 = df.t;
            df.t = i2;
            T4 t8 = df.r;
            if (t8 != null) {
                WeakHashMap weakHashMap = It0.a;
                t8.setAccessibilityLiveRegion(i2);
            }
            df.r.setVisibility(4);
            df.a(df.r, 0);
        } else {
            df.f();
            df.g(df.r, 0);
            df.r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        df.q = z;
    }

    public void setErrorIconDrawable(int i) {
        C2403oq c2403oq = this.n;
        c2403oq.i(i != 0 ? Ou0.l(c2403oq.getContext(), i) : null);
        AbstractC1459f50.J(c2403oq.l, c2403oq.n, c2403oq.f954o);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C2403oq c2403oq = this.n;
        CheckableImageButton checkableImageButton = c2403oq.n;
        View.OnLongClickListener onLongClickListener = c2403oq.q;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC1459f50.M(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C2403oq c2403oq = this.n;
        c2403oq.q = onLongClickListener;
        CheckableImageButton checkableImageButton = c2403oq.n;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC1459f50.M(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C2403oq c2403oq = this.n;
        if (c2403oq.f954o != colorStateList) {
            c2403oq.f954o = colorStateList;
            AbstractC1459f50.d(c2403oq.l, c2403oq.n, colorStateList, c2403oq.p);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C2403oq c2403oq = this.n;
        if (c2403oq.p != mode) {
            c2403oq.p = mode;
            AbstractC1459f50.d(c2403oq.l, c2403oq.n, c2403oq.f954o, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        DF df = this.u;
        df.u = i;
        T4 t4 = df.r;
        if (t4 != null) {
            df.h.l(t4, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        DF df = this.u;
        df.v = colorStateList;
        T4 t4 = df.r;
        if (t4 == null || colorStateList == null) {
            return;
        }
        t4.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.H0 != z) {
            this.H0 = z;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        DF df = this.u;
        if (zIsEmpty) {
            if (df.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!df.x) {
            setHelperTextEnabled(true);
        }
        df.c();
        df.w = charSequence;
        df.y.setText(charSequence);
        int i = df.n;
        if (i != 2) {
            df.f212o = 2;
        }
        df.i(i, df.f212o, df.h(df.y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        DF df = this.u;
        df.A = colorStateList;
        T4 t4 = df.y;
        if (t4 == null || colorStateList == null) {
            return;
        }
        t4.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        DF df = this.u;
        if (df.x == z) {
            return;
        }
        df.c();
        if (z) {
            T4 t4 = new T4(df.g, null);
            df.y = t4;
            t4.setId(com.skidush.clonex.R.id.textinput_helper_text);
            df.y.setTextAlignment(5);
            Typeface typeface = df.B;
            if (typeface != null) {
                df.y.setTypeface(typeface);
            }
            df.y.setVisibility(4);
            df.y.setAccessibilityLiveRegion(1);
            int i = df.z;
            df.z = i;
            T4 t5 = df.y;
            if (t5 != null) {
                AbstractC3045vW.L(t5, i);
            }
            ColorStateList colorStateList = df.A;
            df.A = colorStateList;
            T4 t6 = df.y;
            if (t6 != null && colorStateList != null) {
                t6.setTextColor(colorStateList);
            }
            df.a(df.y, 1);
            df.y.setAccessibilityDelegate(new CF(df));
        } else {
            df.c();
            int i2 = df.n;
            if (i2 == 2) {
                df.f212o = 0;
            }
            df.i(i2, df.f212o, df.h(df.y, ""));
            df.g(df.y, 1);
            df.y = null;
            TextInputLayout textInputLayout = df.h;
            textInputLayout.r();
            textInputLayout.x();
        }
        df.x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        DF df = this.u;
        df.z = i;
        T4 t4 = df.y;
        if (t4 != null) {
            AbstractC3045vW.L(t4, i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.N) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(C1672hI.a.g);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.I0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.N) {
            this.N = z;
            if (z) {
                CharSequence hint = this.f45o.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.O)) {
                        setHint(hint);
                    }
                    this.f45o.setHint((CharSequence) null);
                }
                this.P = true;
            } else {
                this.P = false;
                if (!TextUtils.isEmpty(this.O) && TextUtils.isEmpty(this.f45o.getHint())) {
                    this.f45o.setHint(this.O);
                }
                setHintInternal(null);
            }
            if (this.f45o != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        C0859We c0859We = this.G0;
        View view = c0859We.a;
        Fi0 fi0 = new Fi0(view.getContext(), i);
        ColorStateList colorStateList = fi0.j;
        if (colorStateList != null) {
            c0859We.k = colorStateList;
        }
        float f = fi0.k;
        if (f != 0.0f) {
            c0859We.i = f;
        }
        ColorStateList colorStateList2 = fi0.a;
        if (colorStateList2 != null) {
            c0859We.U = colorStateList2;
        }
        c0859We.S = fi0.e;
        c0859We.T = fi0.f;
        c0859We.R = fi0.g;
        c0859We.V = fi0.i;
        C1398eb c1398eb = c0859We.y;
        if (c1398eb != null) {
            c1398eb.f756o = true;
        }
        C2133m1 c2133m1 = new C2133m1(9, c0859We);
        fi0.a();
        c0859We.y = new C1398eb(c2133m1, fi0.n);
        fi0.c(view.getContext(), c0859We.y);
        c0859We.h(false);
        this.u0 = c0859We.k;
        if (this.f45o != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.u0 != colorStateList) {
            if (this.t0 == null) {
                C0859We c0859We = this.G0;
                if (c0859We.k != colorStateList) {
                    c0859We.k = colorStateList;
                    c0859We.h(false);
                }
            }
            this.u0 = colorStateList;
            if (this.f45o != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(Oi0 oi0) {
        this.y = oi0;
    }

    public void setMaxEms(int i) {
        this.r = i;
        EditText editText = this.f45o;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.t = i;
        EditText editText = this.f45o;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.q = i;
        EditText editText = this.f45o;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.s = i;
        EditText editText = this.f45o;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        C2403oq c2403oq = this.n;
        c2403oq.r.setContentDescription(i != 0 ? c2403oq.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        C2403oq c2403oq = this.n;
        c2403oq.r.setImageDrawable(i != 0 ? Ou0.l(c2403oq.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        C2403oq c2403oq = this.n;
        if (z && c2403oq.t != 1) {
            c2403oq.g(1);
        } else if (z) {
            c2403oq.getClass();
        } else {
            c2403oq.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C2403oq c2403oq = this.n;
        c2403oq.v = colorStateList;
        AbstractC1459f50.d(c2403oq.l, c2403oq.r, colorStateList, c2403oq.w);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C2403oq c2403oq = this.n;
        c2403oq.w = mode;
        AbstractC1459f50.d(c2403oq.l, c2403oq.r, c2403oq.v, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.E == null) {
            T4 t4 = new T4(getContext(), null);
            this.E = t4;
            t4.setId(com.skidush.clonex.R.id.textinput_placeholder);
            this.E.setImportantForAccessibility(2);
            C0484Hs c0484HsD = d();
            this.H = c0484HsD;
            c0484HsD.m = 67L;
            this.I = d();
            setPlaceholderTextAppearance(this.G);
            setPlaceholderTextColor(this.F);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.D) {
                setPlaceholderTextEnabled(true);
            }
            this.C = charSequence;
        }
        EditText editText = this.f45o;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.G = i;
        T4 t4 = this.E;
        if (t4 != null) {
            AbstractC3045vW.L(t4, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            T4 t4 = this.E;
            if (t4 == null || colorStateList == null) {
                return;
            }
            t4.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        C2190mg0 c2190mg0 = this.m;
        c2190mg0.getClass();
        c2190mg0.n = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c2190mg0.m.setText(charSequence);
        c2190mg0.e();
    }

    public void setPrefixTextAppearance(int i) {
        AbstractC3045vW.L(this.m.m, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.m.m.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C1891jd0 c1891jd0) {
        C2068lO c2068lO = this.Q;
        if (c2068lO == null || c2068lO.l.a == c1891jd0) {
            return;
        }
        this.W = c1891jd0;
        b();
    }

    public void setStartIconCheckable(boolean z) {
        this.m.f916o.setCheckable(z);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.m.f916o;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? Ou0.l(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        C2190mg0 c2190mg0 = this.m;
        if (i < 0) {
            c2190mg0.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != c2190mg0.r) {
            c2190mg0.r = i;
            CheckableImageButton checkableImageButton = c2190mg0.f916o;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C2190mg0 c2190mg0 = this.m;
        View.OnLongClickListener onLongClickListener = c2190mg0.t;
        CheckableImageButton checkableImageButton = c2190mg0.f916o;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC1459f50.M(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C2190mg0 c2190mg0 = this.m;
        c2190mg0.t = onLongClickListener;
        CheckableImageButton checkableImageButton = c2190mg0.f916o;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC1459f50.M(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        C2190mg0 c2190mg0 = this.m;
        c2190mg0.s = scaleType;
        c2190mg0.f916o.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C2190mg0 c2190mg0 = this.m;
        if (c2190mg0.p != colorStateList) {
            c2190mg0.p = colorStateList;
            AbstractC1459f50.d(c2190mg0.l, c2190mg0.f916o, colorStateList, c2190mg0.q);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C2190mg0 c2190mg0 = this.m;
        if (c2190mg0.q != mode) {
            c2190mg0.q = mode;
            AbstractC1459f50.d(c2190mg0.l, c2190mg0.f916o, c2190mg0.p, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.m.c(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        C2403oq c2403oq = this.n;
        c2403oq.getClass();
        c2403oq.A = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c2403oq.B.setText(charSequence);
        c2403oq.n();
    }

    public void setSuffixTextAppearance(int i) {
        AbstractC3045vW.L(this.n.B, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.n.B.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(Ni0 ni0) {
        EditText editText = this.f45o;
        if (editText != null) {
            It0.p(editText, ni0);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.m0) {
            this.m0 = typeface;
            this.G0.m(typeface);
            DF df = this.u;
            if (typeface != df.B) {
                df.B = typeface;
                T4 t4 = df.r;
                if (t4 != null) {
                    t4.setTypeface(typeface);
                }
                T4 t5 = df.y;
                if (t5 != null) {
                    t5.setTypeface(typeface);
                }
            }
            T4 t6 = this.z;
            if (t6 != null) {
                t6.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.c0 != 1) {
            FrameLayout frameLayout = this.l;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iC = c();
            if (iC != layoutParams.topMargin) {
                layoutParams.topMargin = iC;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z, boolean z2) {
        ColorStateList colorStateList;
        T4 t4;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f45o;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f45o;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.t0;
        C0859We c0859We = this.G0;
        if (colorStateList2 != null) {
            c0859We.i(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.t0;
            c0859We.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.D0) : this.D0));
        } else if (m()) {
            T4 t5 = this.u.r;
            c0859We.i(t5 != null ? t5.getTextColors() : null);
        } else if (this.x && (t4 = this.z) != null) {
            c0859We.i(t4.getTextColors());
        } else if (z4 && (colorStateList = this.u0) != null && c0859We.k != colorStateList) {
            c0859We.k = colorStateList;
            c0859We.h(false);
        }
        C2403oq c2403oq = this.n;
        C2190mg0 c2190mg0 = this.m;
        if (z3 || !this.H0 || (isEnabled() && z4)) {
            if (z2 || this.F0) {
                ValueAnimator valueAnimator = this.J0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.J0.cancel();
                }
                if (z && this.I0) {
                    a(1.0f);
                } else {
                    c0859We.k(1.0f);
                }
                this.F0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f45o;
                v(editText3 != null ? editText3.getText() : null);
                c2190mg0.u = false;
                c2190mg0.e();
                c2403oq.C = false;
                c2403oq.n();
                return;
            }
            return;
        }
        if (z2 || !this.F0) {
            ValueAnimator valueAnimator2 = this.J0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.J0.cancel();
            }
            if (z && this.I0) {
                a(0.0f);
            } else {
                c0859We.k(0.0f);
            }
            if (e() && (!((C0318Bi) this.Q).I.v.isEmpty()) && e()) {
                ((C0318Bi) this.Q).p(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.F0 = true;
            T4 t6 = this.E;
            if (t6 != null && this.D) {
                t6.setText((CharSequence) null);
                Gm0.a(this.l, this.I);
                this.E.setVisibility(4);
            }
            c2190mg0.u = true;
            c2190mg0.e();
            c2403oq.C = true;
            c2403oq.n();
        }
    }

    public final void v(Editable editable) {
        ((C1306dd0) this.y).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.l;
        if (length != 0 || this.F0) {
            T4 t4 = this.E;
            if (t4 == null || !this.D) {
                return;
            }
            t4.setText((CharSequence) null);
            Gm0.a(frameLayout, this.I);
            this.E.setVisibility(4);
            return;
        }
        if (this.E == null || !this.D || TextUtils.isEmpty(this.C)) {
            return;
        }
        this.E.setText(this.C);
        Gm0.a(frameLayout, this.H);
        this.E.setVisibility(0);
        this.E.bringToFront();
        announceForAccessibility(this.C);
    }

    public final void w(boolean z, boolean z2) {
        int defaultColor = this.y0.getDefaultColor();
        int colorForState = this.y0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.y0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.h0 = colorForState2;
        } else if (z2) {
            this.h0 = colorForState;
        } else {
            this.h0 = defaultColor;
        }
    }

    public final void x() {
        T4 t4;
        EditText editText;
        EditText editText2;
        if (this.Q == null || this.c0 == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f45o) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f45o) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.h0 = this.D0;
        } else if (m()) {
            if (this.y0 != null) {
                w(z2, z);
            } else {
                this.h0 = getErrorCurrentTextColors();
            }
        } else if (!this.x || (t4 = this.z) == null) {
            if (z2) {
                this.h0 = this.x0;
            } else if (z) {
                this.h0 = this.w0;
            } else {
                this.h0 = this.v0;
            }
        } else if (this.y0 != null) {
            w(z2, z);
        } else {
            this.h0 = t4.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        C2403oq c2403oq = this.n;
        c2403oq.l();
        CheckableImageButton checkableImageButton = c2403oq.n;
        ColorStateList colorStateList = c2403oq.f954o;
        TextInputLayout textInputLayout = c2403oq.l;
        AbstractC1459f50.J(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = c2403oq.v;
        CheckableImageButton checkableImageButton2 = c2403oq.r;
        AbstractC1459f50.J(textInputLayout, checkableImageButton2, colorStateList2);
        if (c2403oq.b() instanceof C0869Wo) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                AbstractC1459f50.d(textInputLayout, checkableImageButton2, c2403oq.v, c2403oq.w);
            } else {
                Drawable drawableMutate = AbstractC3045vW.R(checkableImageButton2.getDrawable()).mutate();
                AbstractC2205mo.g(drawableMutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(drawableMutate);
            }
        }
        C2190mg0 c2190mg0 = this.m;
        AbstractC1459f50.J(c2190mg0.l, c2190mg0.f916o, c2190mg0.p);
        if (this.c0 == 2) {
            int i = this.e0;
            if (z2 && isEnabled()) {
                this.e0 = this.g0;
            } else {
                this.e0 = this.f0;
            }
            if (this.e0 != i && e() && !this.F0) {
                if (e()) {
                    ((C0318Bi) this.Q).p(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.c0 == 1) {
            if (!isEnabled()) {
                this.i0 = this.A0;
            } else if (z && !z2) {
                this.i0 = this.C0;
            } else if (z2) {
                this.i0 = this.B0;
            } else {
                this.i0 = this.z0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.m.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.n.r.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.n.r.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.n.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.n.r;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        C2403oq c2403oq = this.n;
        CheckableImageButton checkableImageButton = c2403oq.r;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = c2403oq.v;
            PorterDuff.Mode mode = c2403oq.w;
            TextInputLayout textInputLayout = c2403oq.l;
            AbstractC1459f50.d(textInputLayout, checkableImageButton, colorStateList, mode);
            AbstractC1459f50.J(textInputLayout, checkableImageButton, c2403oq.v);
        }
    }
}
