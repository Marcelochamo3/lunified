package o;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class T4 extends TextView implements Tj0 {
    public final Y1 l;
    public final P4 m;
    public final C2720s4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C2139m4 f527o;
    public boolean p;
    public C2133m1 q;
    public Future r;

    public T4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C2139m4 getEmojiTextViewHelper() {
        if (this.f527o == null) {
            this.f527o = new C2139m4(this);
        }
        return this.f527o;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public Q4 getSuperCaller() {
        if (this.q == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.q = new S4(this);
            } else if (i >= 28) {
                this.q = new R4(this);
            } else if (i >= 26) {
                this.q = new C2133m1(4, this);
            }
        }
        return this.q;
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
    public CharSequence getText() {
        m();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C2720s4 c2720s4;
        if (Build.VERSION.SDK_INT >= 28 || (c2720s4 = this.n) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c2720s4.n;
        return textClassifier == null ? J4.a((TextView) c2720s4.m) : textClassifier;
    }

    public G20 getTextMetricsParamsCompat() {
        return AbstractC3045vW.s(this);
    }

    public final void m() {
        Future future = this.r;
        if (future == null) {
            return;
        }
        try {
            this.r = null;
            AbstractC1674hK.w(future.get());
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            AbstractC3045vW.s(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.m.getClass();
        P4.h(this, inputConnectionOnCreateInputConnection, editorInfo);
        AbstractC1923jt0.w(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        P4 p4 = this.m;
        if (p4 == null || AbstractC3478zu0.c) {
            return;
        }
        p4.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        m();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        P4 p4 = this.m;
        if (p4 != null) {
            p4.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        P4 p4 = this.m;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().C(i);
        } else {
            AbstractC3045vW.H(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().j(i);
        } else {
            AbstractC3045vW.I(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        AbstractC3045vW.K(this, i);
    }

    public void setPrecomputedText(H20 h20) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC3045vW.s(this);
        throw null;
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
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        P4 p4 = this.m;
        if (p4 != null) {
            p4.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C2720s4 c2720s4;
        if (Build.VERSION.SDK_INT >= 28 || (c2720s4 = this.n) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c2720s4.n = textClassifier;
        }
    }

    public void setTextFuture(Future<H20> future) {
        this.r = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(G20 g20) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = g20.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        int i2 = Build.VERSION.SDK_INT;
        TextPaint textPaint = g20.a;
        if (i2 >= 23) {
            getPaint().set(textPaint);
            Ui0.e(this, g20.c);
            Ui0.h(this, g20.d);
        } else {
            float textScaleX = textPaint.getTextScaleX();
            getPaint().set(textPaint);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
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

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.p) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            AbstractC1468fA abstractC1468fA = Lp0.a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.p = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.p = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Qj0.a(context);
        this.p = false;
        this.q = null;
        AbstractC1220cj0.a(this, getContext());
        Y1 y1 = new Y1(this);
        this.l = y1;
        y1.k(attributeSet, i);
        P4 p4 = new P4(this);
        this.m = p4;
        p4.f(attributeSet, i);
        p4.b();
        C2720s4 c2720s4 = new C2720s4((char) 0, 6);
        c2720s4.m = this;
        this.n = c2720s4;
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().J(i, f);
        } else if (i2 >= 34) {
            Xi0.a(this, i, f);
        } else {
            AbstractC3045vW.K(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? Ou0.l(context, i) : null, i2 != 0 ? Ou0.l(context, i2) : null, i3 != 0 ? Ou0.l(context, i3) : null, i4 != 0 ? Ou0.l(context, i4) : null);
        P4 p4 = this.m;
        if (p4 != null) {
            p4.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? Ou0.l(context, i) : null, i2 != 0 ? Ou0.l(context, i2) : null, i3 != 0 ? Ou0.l(context, i3) : null, i4 != 0 ? Ou0.l(context, i4) : null);
        P4 p4 = this.m;
        if (p4 != null) {
            p4.b();
        }
    }
}
