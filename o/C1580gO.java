package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.skidush.clonex.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: o.gO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1580gO extends I3 {
    public static final int[] J = {R.attr.state_indeterminate};
    public static final int[] K = {R.attr.state_error};
    public static final int[][] L = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int M = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public ColorStateList A;
    public PorterDuff.Mode B;
    public int C;
    public int[] D;
    public boolean E;
    public CharSequence F;
    public CompoundButton.OnCheckedChangeListener G;
    public final Z2 H;
    public final C1384eO I;
    public final LinkedHashSet p;
    public final LinkedHashSet q;
    public ColorStateList r;
    public boolean s;
    public boolean t;
    public boolean u;
    public CharSequence v;
    public Drawable w;
    public Drawable x;
    public boolean y;
    public ColorStateList z;

    public C1580gO(Context context, AttributeSet attributeSet) {
        Z2 z2;
        int next;
        super(AbstractC1459f50.Q(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.p = new LinkedHashSet();
        this.q = new LinkedHashSet();
        Context context2 = getContext();
        if (Build.VERSION.SDK_INT >= 24) {
            z2 = new Z2(context2);
            Resources resources = context2.getResources();
            Resources.Theme theme = context2.getTheme();
            ThreadLocal threadLocal = AbstractC1465f80.a;
            Drawable drawableA = AbstractC0977a80.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
            z2.l = drawableA;
            drawableA.setCallback(z2.q);
            new Y2(0, z2.l.getConstantState());
        } else {
            int i = Z2.r;
            try {
                XmlResourceParser xml = context2.getResources().getXml(R.drawable.mtrl_checkbox_button_checked_unchecked);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                Resources resources2 = context2.getResources();
                Resources.Theme theme2 = context2.getTheme();
                Z2 z3 = new Z2(context2);
                z3.inflate(resources2, xml, attributeSetAsAttributeSet, theme2);
                z2 = z3;
            } catch (IOException | XmlPullParserException unused) {
                z2 = null;
            }
        }
        this.H = z2;
        this.I = new C1384eO(this);
        Context context3 = getContext();
        this.w = AbstractC3045vW.o(this);
        this.z = getSuperButtonTintList();
        setSupportButtonTintList(null);
        RN rnV = AbstractC1923jt0.v(context3, attributeSet, H40.p, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        this.x = rnV.u(2);
        Drawable drawable = this.w;
        TypedArray typedArray = (TypedArray) rnV.n;
        if (drawable != null && zy0.z(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            if (resourceId == M && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.w = Ou0.l(context3, R.drawable.mtrl_checkbox_button);
                this.y = true;
                if (this.x == null) {
                    this.x = Ou0.l(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.A = AbstractC3021v9.m(context3, rnV, 3);
        this.B = AbstractC3409z9.y(typedArray.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.s = typedArray.getBoolean(10, false);
        this.t = typedArray.getBoolean(6, true);
        this.u = typedArray.getBoolean(9, false);
        this.v = typedArray.getText(8);
        if (typedArray.hasValue(7)) {
            setCheckedState(typedArray.getInt(7, 0));
        }
        rnV.A();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.C;
        if (i == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.r == null) {
            int iO = UK.o(this, R.attr.colorControlActivated);
            int iO2 = UK.o(this, R.attr.colorError);
            int iO3 = UK.o(this, R.attr.colorSurface);
            int iO4 = UK.o(this, R.attr.colorOnSurface);
            this.r = new ColorStateList(L, new int[]{UK.I(iO3, 1.0f, iO2), UK.I(iO3, 1.0f, iO), UK.I(iO3, 0.54f, iO4), UK.I(iO3, 0.38f, iO4), UK.I(iO3, 0.38f, iO4)});
        }
        return this.r;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.z;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        LayerDrawable layerDrawable;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0962a1 c0962a1;
        this.w = Jp0.l(this.w, this.z, AbstractC1604gg.b(this));
        this.x = Jp0.l(this.x, this.A, this.B);
        if (this.y) {
            Z2 z2 = this.H;
            if (z2 != null) {
                Drawable drawable = z2.l;
                C1384eO c1384eO = this.I;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (c1384eO.a == null) {
                        c1384eO.a = new M2(c1384eO);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c1384eO.a);
                }
                ArrayList arrayList = z2.p;
                X2 x2 = z2.m;
                if (arrayList != null && c1384eO != null) {
                    arrayList.remove(c1384eO);
                    if (z2.p.size() == 0 && (c0962a1 = z2.f649o) != null) {
                        x2.b.removeListener(c0962a1);
                        z2.f649o = null;
                    }
                }
                Drawable drawable2 = z2.l;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (c1384eO.a == null) {
                        c1384eO.a = new M2(c1384eO);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c1384eO.a);
                } else if (c1384eO != null) {
                    if (z2.p == null) {
                        z2.p = new ArrayList();
                    }
                    if (!z2.p.contains(c1384eO)) {
                        z2.p.add(c1384eO);
                        if (z2.f649o == null) {
                            z2.f649o = new C0962a1(1, z2);
                        }
                        x2.b.addListener(z2.f649o);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.w;
                if ((drawable3 instanceof AnimatedStateListDrawable) && z2 != null) {
                    ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, z2, false);
                    ((AnimatedStateListDrawable) this.w).addTransition(R.id.indeterminate, R.id.unchecked, z2, false);
                }
            }
        }
        Drawable drawable4 = this.w;
        if (drawable4 != null && (colorStateList2 = this.z) != null) {
            AbstractC2205mo.h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.x;
        if (drawable5 != null && (colorStateList = this.A) != null) {
            AbstractC2205mo.h(drawable5, colorStateList);
        }
        Drawable drawable6 = this.w;
        Drawable drawable7 = this.x;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
                layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
                layerDrawable.setLayerGravity(1, 17);
            } else {
                layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
                int iMax = Math.max((drawable6.getIntrinsicWidth() - intrinsicWidth) / 2, 0);
                int iMax2 = Math.max((drawable6.getIntrinsicHeight() - intrinsicHeight) / 2, 0);
                layerDrawable.setLayerInset(1, iMax, iMax2, iMax, iMax2);
            }
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.w;
    }

    public Drawable getButtonIconDrawable() {
        return this.x;
    }

    public ColorStateList getButtonIconTintList() {
        return this.A;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.B;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.z;
    }

    public int getCheckedState() {
        return this.C;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.v;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.C == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.s && this.z == null && this.A == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, J);
        }
        if (this.u) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, K);
        }
        for (int i2 = 0; i2 < iArrOnCreateDrawableState.length; i2++) {
            int i3 = iArrOnCreateDrawableState[i2];
            if (i3 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
            } else if (i3 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i2] = 16842912;
            }
            this.D = iArrCopyOf;
            return iArrOnCreateDrawableState;
        }
        iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
        iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
        this.D = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableO;
        if (!this.t || !TextUtils.isEmpty(getText()) || (drawableO = AbstractC3045vW.o(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableO.getIntrinsicWidth()) / 2) * (AbstractC3409z9.s(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableO.getBounds();
            AbstractC2205mo.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.u) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.v));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1482fO)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1482fO c1482fO = (C1482fO) parcelable;
        super.onRestoreInstanceState(c1482fO.getSuperState());
        setCheckedState(c1482fO.l);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1482fO c1482fO = new C1482fO(super.onSaveInstanceState());
        c1482fO.l = getCheckedState();
        return c1482fO;
    }

    @Override // o.I3, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(Ou0.l(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.x = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(Ou0.l(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.A == colorStateList) {
            return;
        }
        this.A = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.B == mode) {
            return;
        }
        this.B = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.z == colorStateList) {
            return;
        }
        this.z = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.t = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.C != i) {
            this.C = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && this.F == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.E) {
                return;
            }
            this.E = true;
            LinkedHashSet linkedHashSet = this.q;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    AbstractC1674hK.w(it.next());
                    throw null;
                }
            }
            if (this.C != 2 && (onCheckedChangeListener = this.G) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i2 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.E = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.v = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.u == z) {
            return;
        }
        this.u = z;
        refreshDrawableState();
        Iterator it = this.p.iterator();
        if (it.hasNext()) {
            AbstractC1674hK.w(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.G = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.F = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.s = z;
        if (z) {
            AbstractC1604gg.c(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC1604gg.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // o.I3, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.w = drawable;
        this.y = false;
        a();
    }
}
