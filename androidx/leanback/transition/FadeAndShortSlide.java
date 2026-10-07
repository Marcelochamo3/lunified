package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import o.AbstractC1370eA;
import o.AbstractC3021v9;
import o.C0510Is;
import o.C0536Js;
import o.Q40;

/* JADX INFO: loaded from: classes.dex */
public class FadeAndShortSlide extends Visibility {
    public static final DecelerateInterpolator p = new DecelerateInterpolator();
    public static final C0510Is q = new C0510Is(0);
    public static final C0510Is r = new C0510Is(1);
    public static final C0510Is s = new C0510Is(2);
    public static final C0510Is t = new C0510Is(3);
    public static final C0510Is u = new C0510Is(4);
    public AbstractC1370eA l;
    public Visibility m;
    public final float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0536Js f18o;

    public FadeAndShortSlide(int i) {
        this.m = new Fade();
        this.n = -1.0f;
        this.f18o = new C0536Js(this);
        d(i);
    }

    @Override // android.transition.Transition
    public final Transition addListener(Transition.TransitionListener transitionListener) {
        this.m.addListener(transitionListener);
        return super.addListener(transitionListener);
    }

    public final float b(ViewGroup viewGroup) {
        float f = this.n;
        return f >= 0.0f ? f : viewGroup.getWidth() / 4;
    }

    public final float c(ViewGroup viewGroup) {
        float f = this.n;
        return f >= 0.0f ? f : viewGroup.getHeight() / 4;
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        this.m.captureEndValues(transitionValues);
        super.captureEndValues(transitionValues);
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:fadeAndShortSlideTransition:screenPosition", iArr);
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        this.m.captureStartValues(transitionValues);
        super.captureStartValues(transitionValues);
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:fadeAndShortSlideTransition:screenPosition", iArr);
    }

    public final void d(int i) {
        if (i == 48) {
            this.l = u;
            return;
        }
        if (i == 80) {
            this.l = t;
            return;
        }
        if (i == 112) {
            this.l = this.f18o;
            return;
        }
        if (i == 8388611) {
            this.l = q;
        } else if (i == 8388613) {
            this.l = r;
        } else {
            if (i != 8388615) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.l = s;
        }
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null || viewGroup == view) {
            return null;
        }
        int[] iArr = (int[]) transitionValues2.values.get("android:fadeAndShortSlideTransition:screenPosition");
        int i = iArr[0];
        int i2 = iArr[1];
        float translationX = view.getTranslationX();
        ObjectAnimator objectAnimatorG = AbstractC3021v9.g(view, transitionValues2, i, i2, this.l.s(this, viewGroup, view, iArr), this.l.t(this, viewGroup, view, iArr), translationX, view.getTranslationY(), p, this);
        Animator animatorOnAppear = this.m.onAppear(viewGroup, view, transitionValues, transitionValues2);
        if (objectAnimatorG == null) {
            return animatorOnAppear;
        }
        if (animatorOnAppear == null) {
            return objectAnimatorG;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorG).with(animatorOnAppear);
        return animatorSet;
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || viewGroup == view) {
            return null;
        }
        int[] iArr = (int[]) transitionValues.values.get("android:fadeAndShortSlideTransition:screenPosition");
        ObjectAnimator objectAnimatorG = AbstractC3021v9.g(view, transitionValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.l.s(this, viewGroup, view, iArr), this.l.t(this, viewGroup, view, iArr), p, this);
        Animator animatorOnDisappear = this.m.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        if (objectAnimatorG == null) {
            return animatorOnDisappear;
        }
        if (animatorOnDisappear == null) {
            return objectAnimatorG;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorG).with(animatorOnDisappear);
        return animatorSet;
    }

    @Override // android.transition.Transition
    public final Transition removeListener(Transition.TransitionListener transitionListener) {
        this.m.removeListener(transitionListener);
        return super.removeListener(transitionListener);
    }

    @Override // android.transition.Transition
    public final void setEpicenterCallback(Transition.EpicenterCallback epicenterCallback) {
        this.m.setEpicenterCallback(epicenterCallback);
        super.setEpicenterCallback(epicenterCallback);
    }

    @Override // android.transition.Transition
    public final Transition clone() {
        FadeAndShortSlide fadeAndShortSlide = (FadeAndShortSlide) super.clone();
        fadeAndShortSlide.m = (Visibility) this.m.clone();
        return fadeAndShortSlide;
    }

    public FadeAndShortSlide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = new Fade();
        this.n = -1.0f;
        this.f18o = new C0536Js(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q40.i);
        d(typedArrayObtainStyledAttributes.getInt(3, 8388611));
        typedArrayObtainStyledAttributes.recycle();
    }
}
