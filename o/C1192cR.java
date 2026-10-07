package o;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.cR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1192cR {
    public final Nd0 a = new Nd0();
    public final Nd0 b = new Nd0();

    public static C1192cR a(Context context, int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return b(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i);
            return null;
        }
    }

    public static C1192cR b(ArrayList arrayList) {
        C1192cR c1192cR = new C1192cR();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c1192cR.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC1161c3.b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC1161c3.c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC1161c3.d;
            }
            C1290dR c1290dR = new C1290dR();
            c1290dR.d = 0;
            c1290dR.e = 1;
            c1290dR.a = startDelay;
            c1290dR.b = duration;
            c1290dR.c = interpolator;
            c1290dR.d = objectAnimator.getRepeatCount();
            c1290dR.e = objectAnimator.getRepeatMode();
            c1192cR.a.put(propertyName, c1290dR);
        }
        return c1192cR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1192cR) {
            return this.a.equals(((C1192cR) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "\n" + C1192cR.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
