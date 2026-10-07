package o;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: o.lU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2074lU implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ AbstractC2268nU b;

    public C2074lU(AbstractC2268nU abstractC2268nU, float f) {
        this.b = abstractC2268nU;
        this.a = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.b.e(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.a);
    }
}
