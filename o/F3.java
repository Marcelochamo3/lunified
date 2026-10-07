package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* JADX INFO: loaded from: classes.dex */
public class F3 extends AutoCompleteTextView implements Tj0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f252o = {R.attr.popupBackground};
    public final Y1 l;
    public final P4 m;
    public final C2720s4 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.skidush.clonex.R.attr.autoCompleteTextViewStyle);
        Qj0.a(context);
        AbstractC1220cj0.a(this, getContext());
        RN rnY = RN.y(getContext(), attributeSet, f252o, com.skidush.clonex.R.attr.autoCompleteTextViewStyle, 0);
        if (((TypedArray) rnY.n).hasValue(0)) {
            setDropDownBackgroundDrawable(rnY.u(0));
        }
        rnY.A();
        Y1 y1 = new Y1(this);
        this.l = y1;
        y1.k(attributeSet, com.skidush.clonex.R.attr.autoCompleteTextViewStyle);
        P4 p4 = new P4(this);
        this.m = p4;
        p4.f(attributeSet, com.skidush.clonex.R.attr.autoCompleteTextViewStyle);
        p4.b();
        C2720s4 c2720s4 = new C2720s4(this, 5);
        this.n = c2720s4;
        c2720s4.b0(attributeSet, com.skidush.clonex.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerZ = c2720s4.Z(keyListener);
            if (keyListenerZ == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerZ);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Y1 y1 = this.l;
        if (y1 != null) {
            y1.a();
        }
        P4 p4 = this.m;
        if (p4 != null) {
            p4.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC3045vW.Q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        Y1 y1 = this.l;
        if (y1 != null) {
            return y1.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Y1 y1 = this.l;
        if (y1 != null) {
            return y1.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.m.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.m.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC1923jt0.w(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.n.c0(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        Y1 y1 = this.l;
        if (y1 != null) {
            y1.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        Y1 y1 = this.l;
        if (y1 != null) {
            y1.n(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        P4 p4 = this.m;
        if (p4 != null) {
            p4.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        P4 p4 = this.m;
        if (p4 != null) {
            p4.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC3045vW.S(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(Ou0.l(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.n.l0(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.n.Z(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        Y1 y1 = this.l;
        if (y1 != null) {
            y1.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        Y1 y1 = this.l;
        if (y1 != null) {
            y1.u(mode);
        }
    }

    @Override // o.Tj0
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        P4 p4 = this.m;
        p4.l(colorStateList);
        p4.b();
    }

    @Override // o.Tj0
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        P4 p4 = this.m;
        p4.m(mode);
        p4.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        P4 p4 = this.m;
        if (p4 != null) {
            p4.g(context, i);
        }
    }
}
