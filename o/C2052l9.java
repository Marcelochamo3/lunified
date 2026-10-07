package o;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: o.l9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2052l9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C2052l9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C2068lO c2068lO = ((BottomSheetBehavior) this.b).i;
                if (c2068lO != null) {
                    C1970kO c1970kO = c2068lO.l;
                    if (c1970kO.j != fFloatValue) {
                        c1970kO.j = fFloatValue;
                        c2068lO.p = true;
                        c2068lO.invalidateSelf();
                    }
                }
                break;
            case 1:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0640Nt c0640Nt = (C0640Nt) this.b;
                c0640Nt.c.setAlpha(iFloatValue);
                c0640Nt.d.setAlpha(iFloatValue);
                c0640Nt.s.invalidate();
                break;
            case 2:
                ((TextInputLayout) this.b).G0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) this.b;
                textView.setScaleX(fFloatValue2);
                textView.setScaleY(fFloatValue2);
                break;
        }
    }
}
