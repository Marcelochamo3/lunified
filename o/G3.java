package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: loaded from: classes.dex */
public class G3 extends Button implements Tj0 {
    public final Y1 l;
    public final P4 m;
    public C2139m4 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Qj0.a(context);
        AbstractC1220cj0.a(this, getContext());
        Y1 y1 = new Y1(this);
        this.l = y1;
        y1.k(attributeSet, i);
        P4 p4 = new P4(this);
        this.m = p4;
        p4.f(attributeSet, i);
        p4.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private C2139m4 getEmojiTextViewHelper() {
        if (this.n == null) {
            this.n = new C2139m4(this);
        }
        return this.n;
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
    public int getAutoSizeMaxTextSize() {
        if (AbstractC3478zu0.c) {
            return super.getAutoSizeMaxTextSize();
        }
        P4 p4 = this.m;
        if (p4 != null) {
            return Math.round(p4.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC3478zu0.c) {
            return super.getAutoSizeMinTextSize();
        }
        P4 p4 = this.m;
        if (p4 != null) {
            return Math.round(p4.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC3478zu0.c) {
            return super.getAutoSizeStepGranularity();
        }
        P4 p4 = this.m;
        if (p4 != null) {
            return Math.round(p4.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC3478zu0.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        P4 p4 = this.m;
        return p4 != null ? p4.i.f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC3478zu0.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        P4 p4 = this.m;
        if (p4 != null) {
            return p4.i.a;
        }
        return 0;
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        P4 p4 = this.m;
        if (p4 == null || AbstractC3478zu0.c) {
            return;
        }
        p4.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        P4 p4 = this.m;
        if (p4 == null || AbstractC3478zu0.c) {
            return;
        }
        Y4 y4 = p4.i;
        if (y4.f()) {
            y4.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (AbstractC3478zu0.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        P4 p4 = this.m;
        if (p4 != null) {
            p4.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (AbstractC3478zu0.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        P4 p4 = this.m;
        if (p4 != null) {
            p4.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (AbstractC3478zu0.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        P4 p4 = this.m;
        if (p4 != null) {
            p4.k(i);
        }
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC3045vW.S(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        P4 p4 = this.m;
        if (p4 != null) {
            p4.a.setAllCaps(z);
        }
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

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = AbstractC3478zu0.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        P4 p4 = this.m;
        if (p4 == null || z) {
            return;
        }
        Y4 y4 = p4.i;
        if (y4.f()) {
            return;
        }
        y4.g(i, f);
    }
}
