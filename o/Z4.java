package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: loaded from: classes.dex */
public final class Z4 extends ToggleButton implements Tj0 {
    public final Y1 l;
    public final P4 m;
    public C2139m4 n;

    public Z4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        AbstractC1220cj0.a(this, getContext());
        Y1 y1 = new Y1(this);
        this.l = y1;
        y1.k(attributeSet, R.attr.buttonStyleToggle);
        P4 p4 = new P4(this);
        this.m = p4;
        p4.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.buttonStyleToggle);
    }

    private C2139m4 getEmojiTextViewHelper() {
        if (this.n == null) {
            this.n = new C2139m4(this);
        }
        return this.n;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
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

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
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
}
