package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import o.AbstractC1376eG;
import o.AbstractC1459f50;
import o.AbstractC1923jt0;
import o.AbstractC3021v9;
import o.AbstractC3045vW;
import o.AbstractC3185wt0;
import o.AbstractC3409z9;
import o.C1192cR;
import o.C1891jd0;
import o.C2183md;
import o.C2280nd;
import o.C2377od;
import o.C2474pd;
import o.C2667rd;
import o.D8;
import o.Fi0;
import o.H40;
import o.I3;
import o.Ii0;
import o.InterfaceC1678hO;
import o.InterfaceC2571qd;
import o.InterfaceC2862td0;
import o.It0;
import o.Ou0;
import o.Tw0;
import o.Uw0;
import o.Yu0;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends I3 implements InterfaceC2571qd, InterfaceC2862td0, Checkable {
    public static final Rect H = new Rect();
    public static final int[] I = {R.attr.state_selected};
    public static final int[] J = {R.attr.state_checkable};
    public int A;
    public CharSequence B;
    public final C2474pd C;
    public boolean D;
    public final Rect E;
    public final RectF F;
    public final C2280nd G;
    public C2667rd p;
    public InsetDrawable q;
    public RippleDrawable r;
    public View.OnClickListener s;
    public CompoundButton.OnCheckedChangeListener t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(AbstractC1459f50.Q(context, attributeSet, com.skidush.clonex.R.attr.chipStyle, com.skidush.clonex.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.skidush.clonex.R.attr.chipStyle);
        this.E = new Rect();
        this.F = new RectF();
        this.G = new C2280nd(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
        }
        C2667rd c2667rd = new C2667rd(context2, attributeSet);
        int[] iArr = H40.e;
        TypedArray typedArrayU = AbstractC1923jt0.u(c2667rd.p0, attributeSet, iArr, com.skidush.clonex.R.attr.chipStyle, com.skidush.clonex.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        c2667rd.Q0 = typedArrayU.hasValue(37);
        Context context3 = c2667rd.p0;
        ColorStateList colorStateListL = AbstractC3021v9.l(context3, typedArrayU, 24);
        if (c2667rd.I != colorStateListL) {
            c2667rd.I = colorStateListL;
            c2667rd.onStateChange(c2667rd.getState());
        }
        ColorStateList colorStateListL2 = AbstractC3021v9.l(context3, typedArrayU, 11);
        if (c2667rd.J != colorStateListL2) {
            c2667rd.J = colorStateListL2;
            c2667rd.onStateChange(c2667rd.getState());
        }
        float dimension = typedArrayU.getDimension(19, 0.0f);
        if (c2667rd.K != dimension) {
            c2667rd.K = dimension;
            c2667rd.invalidateSelf();
            c2667rd.w();
        }
        if (typedArrayU.hasValue(12)) {
            c2667rd.C(typedArrayU.getDimension(12, 0.0f));
        }
        c2667rd.H(AbstractC3021v9.l(context3, typedArrayU, 22));
        c2667rd.I(typedArrayU.getDimension(23, 0.0f));
        c2667rd.R(AbstractC3021v9.l(context3, typedArrayU, 36));
        String text = typedArrayU.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(c2667rd.P, text);
        Ii0 ii0 = c2667rd.v0;
        if (!zEquals) {
            c2667rd.P = text;
            ii0.e = true;
            c2667rd.invalidateSelf();
            c2667rd.w();
        }
        Fi0 fi0 = (!typedArrayU.hasValue(0) || (resourceId3 = typedArrayU.getResourceId(0, 0)) == 0) ? null : new Fi0(context3, resourceId3);
        fi0.k = typedArrayU.getDimension(1, fi0.k);
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            fi0.j = AbstractC3021v9.l(context3, typedArrayU, 2);
        }
        ii0.b(fi0, context3);
        int i2 = typedArrayU.getInt(3, 0);
        if (i2 == 1) {
            c2667rd.N0 = TextUtils.TruncateAt.START;
        } else if (i2 == 2) {
            c2667rd.N0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i2 == 3) {
            c2667rd.N0 = TextUtils.TruncateAt.END;
        }
        c2667rd.G(typedArrayU.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c2667rd.G(typedArrayU.getBoolean(15, false));
        }
        c2667rd.D(AbstractC3021v9.n(context3, typedArrayU, 14));
        if (typedArrayU.hasValue(17)) {
            c2667rd.F(AbstractC3021v9.l(context3, typedArrayU, 17));
        }
        c2667rd.E(typedArrayU.getDimension(16, -1.0f));
        c2667rd.O(typedArrayU.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c2667rd.O(typedArrayU.getBoolean(26, false));
        }
        c2667rd.J(AbstractC3021v9.n(context3, typedArrayU, 25));
        c2667rd.N(AbstractC3021v9.l(context3, typedArrayU, 30));
        c2667rd.L(typedArrayU.getDimension(28, 0.0f));
        c2667rd.y(typedArrayU.getBoolean(6, false));
        c2667rd.B(typedArrayU.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c2667rd.B(typedArrayU.getBoolean(8, false));
        }
        c2667rd.z(AbstractC3021v9.n(context3, typedArrayU, 7));
        if (typedArrayU.hasValue(9)) {
            c2667rd.A(AbstractC3021v9.l(context3, typedArrayU, 9));
        }
        c2667rd.f0 = (!typedArrayU.hasValue(39) || (resourceId2 = typedArrayU.getResourceId(39, 0)) == 0) ? null : C1192cR.a(context3, resourceId2);
        c2667rd.g0 = (!typedArrayU.hasValue(33) || (resourceId = typedArrayU.getResourceId(33, 0)) == 0) ? null : C1192cR.a(context3, resourceId);
        float dimension2 = typedArrayU.getDimension(21, 0.0f);
        if (c2667rd.h0 != dimension2) {
            c2667rd.h0 = dimension2;
            c2667rd.invalidateSelf();
            c2667rd.w();
        }
        c2667rd.Q(typedArrayU.getDimension(35, 0.0f));
        c2667rd.P(typedArrayU.getDimension(34, 0.0f));
        float dimension3 = typedArrayU.getDimension(41, 0.0f);
        if (c2667rd.k0 != dimension3) {
            c2667rd.k0 = dimension3;
            c2667rd.invalidateSelf();
            c2667rd.w();
        }
        float dimension4 = typedArrayU.getDimension(40, 0.0f);
        if (c2667rd.l0 != dimension4) {
            c2667rd.l0 = dimension4;
            c2667rd.invalidateSelf();
            c2667rd.w();
        }
        c2667rd.M(typedArrayU.getDimension(29, 0.0f));
        c2667rd.K(typedArrayU.getDimension(27, 0.0f));
        float dimension5 = typedArrayU.getDimension(13, 0.0f);
        if (c2667rd.o0 != dimension5) {
            c2667rd.o0 = dimension5;
            c2667rd.invalidateSelf();
            c2667rd.w();
        }
        c2667rd.P0 = typedArrayU.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayU.recycle();
        AbstractC1923jt0.f(context2, attributeSet, com.skidush.clonex.R.attr.chipStyle, com.skidush.clonex.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC1923jt0.g(context2, attributeSet, iArr, com.skidush.clonex.R.attr.chipStyle, com.skidush.clonex.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.skidush.clonex.R.attr.chipStyle, com.skidush.clonex.R.style.Widget_MaterialComponents_Chip_Action);
        this.y = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.A = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(c2667rd);
        c2667rd.k(AbstractC3185wt0.i(this));
        AbstractC1923jt0.f(context2, attributeSet, com.skidush.clonex.R.attr.chipStyle, com.skidush.clonex.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC1923jt0.g(context2, attributeSet, iArr, com.skidush.clonex.R.attr.chipStyle, com.skidush.clonex.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.skidush.clonex.R.attr.chipStyle, com.skidush.clonex.R.style.Widget_MaterialComponents_Chip_Action);
        if (i < 23) {
            setTextColor(AbstractC3021v9.l(context2, typedArrayObtainStyledAttributes2, 2));
        }
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.C = new C2474pd(this, this);
        e();
        if (!zHasValue) {
            setOutlineProvider(new C2377od(this, 0));
        }
        setChecked(this.u);
        setText(c2667rd.P);
        setEllipsize(c2667rd.N0);
        h();
        if (!this.p.O0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.y) {
            setMinHeight(this.A);
        }
        this.z = getLayoutDirection();
        super.setOnCheckedChangeListener(new C2183md(0, this));
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.F;
        rectF.setEmpty();
        if (c() && this.s != null) {
            C2667rd c2667rd = this.p;
            Rect bounds = c2667rd.getBounds();
            rectF.setEmpty();
            if (c2667rd.U()) {
                float f = c2667rd.o0 + c2667rd.n0 + c2667rd.Z + c2667rd.m0 + c2667rd.l0;
                if (AbstractC3045vW.p(c2667rd) == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.E;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private Fi0 getTextAppearance() {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            return c2667rd.v0.g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.w != z) {
            this.w = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.v != z) {
            this.v = z;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        this.A = i;
        if (!this.y) {
            InsetDrawable insetDrawable = this.q;
            if (insetDrawable == null) {
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.q = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.p.K));
        int iMax2 = Math.max(0, i - this.p.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.q;
            if (insetDrawable2 == null) {
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.q = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.q != null) {
            Rect rect = new Rect();
            this.q.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                f();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.q = new InsetDrawable((Drawable) this.p, i2, i3, i2, i3);
        f();
    }

    public final boolean c() {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            Object obj = c2667rd.W;
            if (obj == null) {
                obj = null;
            } else if (obj instanceof Tw0) {
                obj = ((Uw0) ((Tw0) obj)).q;
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        C2667rd c2667rd = this.p;
        return c2667rd != null && c2667rd.b0;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.D) {
            return super.dispatchHoverEvent(motionEvent);
        }
        C2474pd c2474pd = this.C;
        AccessibilityManager accessibilityManager = c2474pd.h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Chip chip = c2474pd.n;
                int i2 = (chip.c() && chip.getCloseIconTouchBounds().contains(x, y)) ? 1 : 0;
                int i3 = c2474pd.m;
                if (i3 != i2) {
                    c2474pd.m = i2;
                    c2474pd.q(i2, 128);
                    c2474pd.q(i3, 256);
                }
                if (i2 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && (i = c2474pd.m) != Integer.MIN_VALUE) {
                if (i == Integer.MIN_VALUE) {
                    return true;
                }
                c2474pd.m = Integer.MIN_VALUE;
                c2474pd.q(Integer.MIN_VALUE, 128);
                c2474pd.q(i, 256);
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        Chip chip;
        View.OnClickListener onClickListener;
        if (!this.D) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C2474pd c2474pd = this.C;
        c2474pd.getClass();
        boolean zM = false;
        int i2 = 0;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = Yu0.b.m0;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i2 < repeatCount && c2474pd.m(i3, null)) {
                                    i2++;
                                    z = true;
                                }
                                zM = z;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i = c2474pd.l;
                                if (i != Integer.MIN_VALUE) {
                                    chip = c2474pd.n;
                                    if (i == 0) {
                                        chip.performClick();
                                    } else if (i == 1) {
                                        chip.playSoundEffect(0);
                                        onClickListener = chip.s;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                        }
                                        if (chip.D) {
                                            chip.C.q(1, 1);
                                        }
                                    }
                                }
                                zM = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i = c2474pd.l;
                    if (i != Integer.MIN_VALUE) {
                        chip = c2474pd.n;
                        if (i == 0) {
                            chip.performClick();
                        } else if (i == 1) {
                            chip.playSoundEffect(0);
                            onClickListener = chip.s;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.D) {
                                chip.C.q(1, 1);
                            }
                        }
                    }
                    zM = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM = c2474pd.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM = c2474pd.m(1, null);
            }
        }
        if (!zM || c2474pd.l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // o.I3, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        int i2;
        super.drawableStateChanged();
        C2667rd c2667rd = this.p;
        boolean zX = false;
        if (c2667rd != null && C2667rd.v(c2667rd.W)) {
            C2667rd c2667rd2 = this.p;
            ?? IsEnabled = isEnabled();
            if (this.x) {
                i = IsEnabled;
                i = IsEnabled + 1;
            }
            i = IsEnabled;
            int i3 = i;
            if (this.w) {
                i3 = i + 1;
            }
            int i4 = i3;
            if (this.v) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (this.x) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.w) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.v) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            if (!Arrays.equals(c2667rd2.J0, iArr)) {
                c2667rd2.J0 = iArr;
                if (c2667rd2.U()) {
                    zX = c2667rd2.x(c2667rd2.getState(), iArr);
                }
            }
        }
        if (zX) {
            invalidate();
        }
    }

    public final void e() {
        C2667rd c2667rd;
        if (!c() || (c2667rd = this.p) == null || !c2667rd.V || this.s == null) {
            It0.p(this, null);
            this.D = false;
        } else {
            It0.p(this, this.C);
            this.D = true;
        }
    }

    public final void f() {
        this.r = new RippleDrawable(AbstractC1376eG.D(this.p.O), getBackgroundDrawable(), null);
        C2667rd c2667rd = this.p;
        if (c2667rd.K0) {
            c2667rd.K0 = false;
            c2667rd.L0 = null;
            c2667rd.onStateChange(c2667rd.getState());
        }
        RippleDrawable rippleDrawable = this.r;
        WeakHashMap weakHashMap = It0.a;
        setBackground(rippleDrawable);
        g();
    }

    public final void g() {
        C2667rd c2667rd;
        if (TextUtils.isEmpty(getText()) || (c2667rd = this.p) == null) {
            return;
        }
        int iS = (int) (c2667rd.s() + c2667rd.o0 + c2667rd.l0);
        C2667rd c2667rd2 = this.p;
        int iR = (int) (c2667rd2.r() + c2667rd2.h0 + c2667rd2.k0);
        if (this.q != null) {
            Rect rect = new Rect();
            this.q.getPadding(rect);
            iR += rect.left;
            iS += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = It0.a;
        setPaddingRelative(iR, paddingTop, iS, paddingBottom);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.B)) {
            return this.B;
        }
        if (!d()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.q;
        return insetDrawable == null ? this.p : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            return c2667rd.d0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            return c2667rd.e0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            return c2667rd.J;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            return Math.max(0.0f, c2667rd.t());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.p;
    }

    public float getChipEndPadding() {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            return c2667rd.o0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.graphics.drawable.Drawable] */
    public Drawable getChipIcon() {
        Object obj;
        C2667rd c2667rd = this.p;
        if (c2667rd == null || (obj = c2667rd.R) == null) {
            return null;
        }
        if (obj instanceof Tw0) {
            obj = ((Uw0) ((Tw0) obj)).q;
        }
        return obj;
    }

    public float getChipIconSize() {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            return c2667rd.T;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            return c2667rd.S;
        }
        return null;
    }

    public float getChipMinHeight() {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            return c2667rd.K;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            return c2667rd.h0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            return c2667rd.M;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            return c2667rd.N;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.graphics.drawable.Drawable] */
    public Drawable getCloseIcon() {
        Object obj;
        C2667rd c2667rd = this.p;
        if (c2667rd == null || (obj = c2667rd.W) == null) {
            return null;
        }
        if (obj instanceof Tw0) {
            obj = ((Uw0) ((Tw0) obj)).q;
        }
        return obj;
    }

    public CharSequence getCloseIconContentDescription() {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            return c2667rd.a0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            return c2667rd.n0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            return c2667rd.Z;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            return c2667rd.m0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            return c2667rd.Y;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            return c2667rd.N0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.D) {
            C2474pd c2474pd = this.C;
            if (c2474pd.l == 1 || c2474pd.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C1192cR getHideMotionSpec() {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            return c2667rd.g0;
        }
        return null;
    }

    public float getIconEndPadding() {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            return c2667rd.j0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            return c2667rd.i0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            return c2667rd.O;
        }
        return null;
    }

    public C1891jd0 getShapeAppearanceModel() {
        return this.p.l.a;
    }

    public C1192cR getShowMotionSpec() {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            return c2667rd.f0;
        }
        return null;
    }

    public float getTextEndPadding() {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            return c2667rd.l0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            return c2667rd.k0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            paint.drawableState = c2667rd.getState();
        }
        Fi0 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.G);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC3409z9.C(this, this.p);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, I);
        }
        if (d()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, J);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.D) {
            C2474pd c2474pd = this.C;
            int i2 = c2474pd.l;
            if (i2 != Integer.MIN_VALUE) {
                c2474pd.j(i2);
            }
            if (z) {
                c2474pd.m(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(d());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.z != i) {
            this.z = i;
            g();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.v) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z = true;
                }
                z = false;
            } else {
                if (this.v) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.s;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.D) {
                        this.C.q(1, 1);
                    }
                    z = true;
                }
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z = true;
        } else {
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.B = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.r) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // o.I3, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.r) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // o.I3, android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.y(z);
        }
    }

    public void setCheckableResource(int i) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.y(c2667rd.p0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        C2667rd c2667rd = this.p;
        if (c2667rd == null) {
            this.u = z;
        } else if (c2667rd.b0) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.z(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.z(Ou0.l(c2667rd.p0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.A(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.A(AbstractC1459f50.v(c2667rd.p0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.B(c2667rd.p0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C2667rd c2667rd = this.p;
        if (c2667rd == null || c2667rd.J == colorStateList) {
            return;
        }
        c2667rd.J = colorStateList;
        c2667rd.onStateChange(c2667rd.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListV;
        C2667rd c2667rd = this.p;
        if (c2667rd == null || c2667rd.J == (colorStateListV = AbstractC1459f50.v(c2667rd.p0, i))) {
            return;
        }
        c2667rd.J = colorStateListV;
        c2667rd.onStateChange(c2667rd.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.C(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.C(c2667rd.p0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C2667rd c2667rd) {
        C2667rd c2667rd2 = this.p;
        if (c2667rd2 != c2667rd) {
            if (c2667rd2 != null) {
                c2667rd2.M0 = new WeakReference(null);
            }
            this.p = c2667rd;
            c2667rd.O0 = false;
            c2667rd.M0 = new WeakReference(this);
            b(this.A);
        }
    }

    public void setChipEndPadding(float f) {
        C2667rd c2667rd = this.p;
        if (c2667rd == null || c2667rd.o0 == f) {
            return;
        }
        c2667rd.o0 = f;
        c2667rd.invalidateSelf();
        c2667rd.w();
    }

    public void setChipEndPaddingResource(int i) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            float dimension = c2667rd.p0.getResources().getDimension(i);
            if (c2667rd.o0 != dimension) {
                c2667rd.o0 = dimension;
                c2667rd.invalidateSelf();
                c2667rd.w();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.D(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.D(Ou0.l(c2667rd.p0, i));
        }
    }

    public void setChipIconSize(float f) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.E(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.E(c2667rd.p0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.F(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.F(AbstractC1459f50.v(c2667rd.p0, i));
        }
    }

    public void setChipIconVisible(int i) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.G(c2667rd.p0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        C2667rd c2667rd = this.p;
        if (c2667rd == null || c2667rd.K == f) {
            return;
        }
        c2667rd.K = f;
        c2667rd.invalidateSelf();
        c2667rd.w();
    }

    public void setChipMinHeightResource(int i) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            float dimension = c2667rd.p0.getResources().getDimension(i);
            if (c2667rd.K != dimension) {
                c2667rd.K = dimension;
                c2667rd.invalidateSelf();
                c2667rd.w();
            }
        }
    }

    public void setChipStartPadding(float f) {
        C2667rd c2667rd = this.p;
        if (c2667rd == null || c2667rd.h0 == f) {
            return;
        }
        c2667rd.h0 = f;
        c2667rd.invalidateSelf();
        c2667rd.w();
    }

    public void setChipStartPaddingResource(int i) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            float dimension = c2667rd.p0.getResources().getDimension(i);
            if (c2667rd.h0 != dimension) {
                c2667rd.h0 = dimension;
                c2667rd.invalidateSelf();
                c2667rd.w();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.H(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.H(AbstractC1459f50.v(c2667rd.p0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.I(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.I(c2667rd.p0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.J(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C2667rd c2667rd = this.p;
        if (c2667rd == null || c2667rd.a0 == charSequence) {
            return;
        }
        String str = D8.d;
        D8 d8 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? D8.g : D8.f;
        c2667rd.a0 = d8.c(charSequence, d8.c);
        c2667rd.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.K(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.K(c2667rd.p0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.J(Ou0.l(c2667rd.p0, i));
        }
        e();
    }

    public void setCloseIconSize(float f) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.L(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.L(c2667rd.p0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.M(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.M(c2667rd.p0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.N(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.N(AbstractC1459f50.v(c2667rd.p0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // o.I3, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // o.I3, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.k(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.p == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.N0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.y = z;
        b(this.A);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            return;
        }
        super.setGravity(i);
    }

    public void setHideMotionSpec(C1192cR c1192cR) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.g0 = c1192cR;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.g0 = C1192cR.a(c2667rd.p0, i);
        }
    }

    public void setIconEndPadding(float f) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.P(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.P(c2667rd.p0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.Q(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.Q(c2667rd.p0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.p == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.P0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.t = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.s = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.R(colorStateList);
        }
        if (this.p.K0) {
            return;
        }
        f();
    }

    public void setRippleColorResource(int i) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.R(AbstractC1459f50.v(c2667rd.p0, i));
            if (this.p.K0) {
                return;
            }
            f();
        }
    }

    @Override // o.InterfaceC2862td0
    public void setShapeAppearanceModel(C1891jd0 c1891jd0) {
        this.p.setShapeAppearanceModel(c1891jd0);
    }

    public void setShowMotionSpec(C1192cR c1192cR) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.f0 = c1192cR;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.f0 = C1192cR.a(c2667rd.p0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C2667rd c2667rd = this.p;
        if (c2667rd == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c2667rd.O0 ? null : charSequence, bufferType);
        C2667rd c2667rd2 = this.p;
        if (c2667rd2 == null || TextUtils.equals(c2667rd2.P, charSequence)) {
            return;
        }
        c2667rd2.P = charSequence;
        c2667rd2.v0.e = true;
        c2667rd2.invalidateSelf();
        c2667rd2.w();
    }

    public void setTextAppearance(Fi0 fi0) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.v0.b(fi0, c2667rd.p0);
        }
        h();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C2667rd c2667rd = this.p;
        if (c2667rd == null || c2667rd.l0 == f) {
            return;
        }
        c2667rd.l0 = f;
        c2667rd.invalidateSelf();
        c2667rd.w();
    }

    public void setTextEndPaddingResource(int i) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            float dimension = c2667rd.p0.getResources().getDimension(i);
            if (c2667rd.l0 != dimension) {
                c2667rd.l0 = dimension;
                c2667rd.invalidateSelf();
                c2667rd.w();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            Ii0 ii0 = c2667rd.v0;
            Fi0 fi0 = ii0.g;
            if (fi0 != null) {
                fi0.k = fApplyDimension;
                ii0.a.setTextSize(fApplyDimension);
                c2667rd.a();
            }
        }
        h();
    }

    public void setTextStartPadding(float f) {
        C2667rd c2667rd = this.p;
        if (c2667rd == null || c2667rd.k0 == f) {
            return;
        }
        c2667rd.k0 = f;
        c2667rd.invalidateSelf();
        c2667rd.w();
    }

    public void setTextStartPaddingResource(int i) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            float dimension = c2667rd.p0.getResources().getDimension(i);
            if (c2667rd.k0 != dimension) {
                c2667rd.k0 = dimension;
                c2667rd.invalidateSelf();
                c2667rd.w();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.O(z);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.B(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            c2667rd.G(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            Context context2 = c2667rd.p0;
            c2667rd.v0.b(new Fi0(context2, i), context2);
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C2667rd c2667rd = this.p;
        if (c2667rd != null) {
            Context context = c2667rd.p0;
            c2667rd.v0.b(new Fi0(context, i), context);
        }
        h();
    }

    public void setInternalOnCheckedChangeListener(InterfaceC1678hO interfaceC1678hO) {
    }
}
