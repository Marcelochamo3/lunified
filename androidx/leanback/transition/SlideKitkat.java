package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.skidush.clonex.R;
import o.C2864te0;
import o.C2961ue0;
import o.C3155we0;
import o.InterfaceC3058ve0;
import o.Q40;

/* JADX INFO: loaded from: classes.dex */
class SlideKitkat extends Visibility {
    public static final DecelerateInterpolator m = new DecelerateInterpolator();
    public static final AccelerateInterpolator n = new AccelerateInterpolator();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2864te0 f19o = new C2864te0(0);
    public static final C2961ue0 p = new C2961ue0(0);
    public static final C2864te0 q = new C2864te0(1);
    public static final C2961ue0 r = new C2961ue0(1);
    public static final C2864te0 s = new C2864te0(2);
    public static final C2864te0 t = new C2864te0(3);
    public final InterfaceC3058ve0 l;

    public SlideKitkat(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q40.i);
        int i = typedArrayObtainStyledAttributes.getInt(3, 80);
        if (i == 3) {
            this.l = f19o;
        } else if (i == 5) {
            this.l = q;
        } else if (i == 48) {
            this.l = p;
        } else if (i == 80) {
            this.l = r;
        } else if (i == 8388611) {
            this.l = s;
        } else {
            if (i != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.l = t;
        }
        long j = typedArrayObtainStyledAttributes.getInt(1, -1);
        if (j >= 0) {
            setDuration(j);
        }
        long j2 = typedArrayObtainStyledAttributes.getInt(2, -1);
        if (j2 > 0) {
            setStartDelay(j2);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static ObjectAnimator b(View view, Property property, float f, float f2, float f3, BaseInterpolator baseInterpolator, int i) {
        float[] fArr = (float[]) view.getTag(R.id.lb_slide_transition_value);
        if (fArr != null) {
            f = View.TRANSLATION_Y == property ? fArr[1] : fArr[0];
            view.setTag(R.id.lb_slide_transition_value, null);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f, f2);
        C3155we0 c3155we0 = new C3155we0(view, property, f3, f2, i);
        objectAnimatorOfFloat.addListener(c3155we0);
        objectAnimatorOfFloat.addPauseListener(c3155we0);
        objectAnimatorOfFloat.setInterpolator(baseInterpolator);
        return objectAnimatorOfFloat;
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
        View view = transitionValues2 != null ? transitionValues2.view : null;
        if (view == null) {
            return null;
        }
        float fB = this.l.b(view);
        return b(view, this.l.c(), this.l.a(view), fB, fB, m, 0);
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
        View view = transitionValues != null ? transitionValues.view : null;
        if (view == null) {
            return null;
        }
        float fB = this.l.b(view);
        return b(view, this.l.c(), fB, this.l.a(view), fB, n, 4);
    }
}
