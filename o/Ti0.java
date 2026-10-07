package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Ti0 extends Cm0 {
    @Override // o.Cm0
    public final void e(Lm0 lm0) {
        View view = lm0.b;
        if (view instanceof TextView) {
            lm0.a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // o.Cm0
    public final void j(Lm0 lm0) {
        View view = lm0.b;
        if (view instanceof TextView) {
            lm0.a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // o.Cm0
    public final Animator o(ViewGroup viewGroup, Lm0 lm0, Lm0 lm1) {
        if (lm0 == null || lm1 == null || !(lm0.b instanceof TextView)) {
            return null;
        }
        View view = lm1.b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap map = lm0.a;
        HashMap map2 = lm1.a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new C2052l9(3, textView));
        return valueAnimatorOfFloat;
    }
}
