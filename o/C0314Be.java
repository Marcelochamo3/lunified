package o;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.Be, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0314Be extends AbstractC2500pq {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final ViewOnClickListenerC3251xe j;
    public final ViewOnFocusChangeListenerC3348ye k;
    public AnimatorSet l;
    public ValueAnimator m;

    public C0314Be(C2403oq c2403oq) {
        super(c2403oq);
        int i = 0;
        this.j = new ViewOnClickListenerC3251xe(i, this);
        this.k = new ViewOnFocusChangeListenerC3348ye(i, this);
        this.e = AbstractC3045vW.D(c2403oq.getContext(), R.attr.motionDurationShort3, 100);
        this.f = AbstractC3045vW.D(c2403oq.getContext(), R.attr.motionDurationShort3, 150);
        this.g = AbstractC3045vW.E(c2403oq.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC1161c3.a);
        this.h = AbstractC3045vW.E(c2403oq.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC1161c3.d);
    }

    @Override // o.AbstractC2500pq
    public final void a() {
        if (this.b.A != null) {
            return;
        }
        t(u());
    }

    @Override // o.AbstractC2500pq
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // o.AbstractC2500pq
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // o.AbstractC2500pq
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // o.AbstractC2500pq
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // o.AbstractC2500pq
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // o.AbstractC2500pq
    public final void m(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(u());
    }

    @Override // o.AbstractC2500pq
    public final void p(boolean z) {
        if (this.b.A == null) {
            return;
        }
        t(z);
    }

    @Override // o.AbstractC2500pq
    public final void r() {
        final int i = 1;
        final int i2 = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.h);
        valueAnimatorOfFloat.setDuration(this.f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: o.ze
            public final /* synthetic */ C0314Be b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C0314Be c0314Be = this.b;
                        c0314Be.getClass();
                        c0314Be.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0314Be c0314Be2 = this.b;
                        c0314Be2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0314Be2.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i3 = this.e;
        valueAnimatorOfFloat2.setDuration(i3);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: o.ze
            public final /* synthetic */ C0314Be b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0314Be c0314Be = this.b;
                        c0314Be.getClass();
                        c0314Be.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0314Be c0314Be2 = this.b;
                        c0314Be2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0314Be2.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.l.addListener(new C0288Ae(this, i2));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i3);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: o.ze
            public final /* synthetic */ C0314Be b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0314Be c0314Be = this.b;
                        c0314Be.getClass();
                        c0314Be.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0314Be c0314Be2 = this.b;
                        c0314Be2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0314Be2.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C0288Ae(this, i));
    }

    @Override // o.AbstractC2500pq
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new Jj0(5, this));
        }
    }

    public final void t(boolean z) {
        boolean z2 = this.b.d() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.l.cancel();
        this.m.start();
        if (z2) {
            this.m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
    }
}
