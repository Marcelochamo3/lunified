package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* JADX INFO: loaded from: classes.dex */
public class I3 extends CheckBox implements Sj0, Tj0 {
    public final K3 l;
    public final Y1 m;
    public final P4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C2139m4 f317o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Qj0.a(context);
        AbstractC1220cj0.a(this, getContext());
        K3 k3 = new K3(this);
        this.l = k3;
        k3.e(attributeSet, i);
        Y1 y1 = new Y1(this);
        this.m = y1;
        y1.k(attributeSet, i);
        P4 p4 = new P4(this);
        this.n = p4;
        p4.f(attributeSet, i);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private C2139m4 getEmojiTextViewHelper() {
        if (this.f317o == null) {
            this.f317o = new C2139m4(this);
        }
        return this.f317o;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Y1 y1 = this.m;
        if (y1 != null) {
            y1.a();
        }
        P4 p4 = this.n;
        if (p4 != null) {
            p4.b();
        }
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

    @Override // o.Sj0
    public ColorStateList getSupportButtonTintList() {
        K3 k3 = this.l;
        if (k3 != null) {
            return (ColorStateList) k3.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        K3 k3 = this.l;
        if (k3 != null) {
            if (k3.e) {
                k3.e = false;
            } else {
                k3.e = true;
                k3.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        P4 p4 = this.n;
        if (p4 != null) {
            p4.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        P4 p4 = this.n;
        if (p4 != null) {
            p4.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
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

    @Override // o.Sj0
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        K3 k3 = this.l;
        if (k3 != null) {
            k3.a = colorStateList;
            k3.c = true;
            k3.a();
        }
    }

    @Override // o.Sj0
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        K3 k3 = this.l;
        if (k3 != null) {
            k3.b = mode;
            k3.d = true;
            k3.a();
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(Ou0.l(getContext(), i));
    }
}
