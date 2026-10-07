package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.skidush.clonex.R;

/* JADX INFO: loaded from: classes.dex */
public final class J3 extends CheckedTextView implements Tj0 {
    public final K3 l;
    public final Y1 m;
    public final P4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C2139m4 f334o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J3(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        Qj0.a(context);
        AbstractC1220cj0.a(this, getContext());
        P4 p4 = new P4(this);
        this.n = p4;
        p4.f(attributeSet, R.attr.checkedTextViewStyle);
        p4.b();
        Y1 y1 = new Y1(this);
        this.m = y1;
        y1.k(attributeSet, R.attr.checkedTextViewStyle);
        this.l = new K3(this);
        Context context2 = getContext();
        int[] iArr = T40.l;
        RN rnY = RN.y(context2, attributeSet, iArr, R.attr.checkedTextViewStyle, 0);
        TypedArray typedArray = (TypedArray) rnY.n;
        It0.o(this, getContext(), iArr, attributeSet, (TypedArray) rnY.n, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(Ou0.l(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(Ou0.l(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(Ou0.l(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(rnY.s(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC3077vo.c(typedArray.getInt(3, -1), null));
            }
            rnY.A();
            getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            rnY.A();
            throw th;
        }
    }

    private C2139m4 getEmojiTextViewHelper() {
        if (this.f334o == null) {
            this.f334o = new C2139m4(this);
        }
        return this.f334o;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        P4 p4 = this.n;
        if (p4 != null) {
            p4.b();
        }
        Y1 y1 = this.m;
        if (y1 != null) {
            y1.a();
        }
        K3 k3 = this.l;
        if (k3 != null) {
            k3.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC3045vW.Q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        Y1 y1 = this.m;
        if (y1 != null) {
            return y1.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Y1 y1 = this.m;
        if (y1 != null) {
            return y1.i();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        K3 k3 = this.l;
        if (k3 != null) {
            return (ColorStateList) k3.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        K3 k3 = this.l;
        if (k3 != null) {
            return (PorterDuff.Mode) k3.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.n.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.n.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC1923jt0.w(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        Y1 y1 = this.m;
        if (y1 != null) {
            y1.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        Y1 y1 = this.m;
        if (y1 != null) {
            y1.n(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        K3 k3 = this.l;
        if (k3 != null) {
            if (k3.e) {
                k3.e = false;
            } else {
                k3.e = true;
                k3.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        P4 p4 = this.n;
        if (p4 != null) {
            p4.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        P4 p4 = this.n;
        if (p4 != null) {
            p4.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC3045vW.S(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        Y1 y1 = this.m;
        if (y1 != null) {
            y1.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        Y1 y1 = this.m;
        if (y1 != null) {
            y1.u(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        K3 k3 = this.l;
        if (k3 != null) {
            k3.a = colorStateList;
            k3.c = true;
            k3.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        K3 k3 = this.l;
        if (k3 != null) {
            k3.b = mode;
            k3.d = true;
            k3.b();
        }
    }

    @Override // o.Tj0
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        P4 p4 = this.n;
        p4.l(colorStateList);
        p4.b();
    }

    @Override // o.Tj0
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        P4 p4 = this.n;
        p4.m(mode);
        p4.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        P4 p4 = this.n;
        if (p4 != null) {
            p4.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(Ou0.l(getContext(), i));
    }
}
