package o;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: renamed from: o.pw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2513pw0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C3094vw0 a;
    public final /* synthetic */ Kw0 b;
    public final /* synthetic */ Kw0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public C2513pw0(C3094vw0 c3094vw0, Kw0 kw0, Kw0 kw1, int i, View view) {
        this.a = c3094vw0;
        this.b = kw0;
        this.c = kw1;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Aw0 c3385yw0;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C3094vw0 c3094vw0 = this.a;
        c3094vw0.a.d(animatedFraction);
        float fB = c3094vw0.a.b();
        PathInterpolator pathInterpolator = C2706rw0.e;
        int i = Build.VERSION.SDK_INT;
        Kw0 kw0 = this.b;
        if (i >= 30) {
            c3385yw0 = new C3482zw0(kw0);
        } else {
            c3385yw0 = i >= 29 ? new C3385yw0(kw0) : new C3288xw0(kw0);
        }
        int i2 = 1;
        while (i2 <= 256) {
            if ((this.d & i2) == 0) {
                c3385yw0.c(i2, kw0.a.f(i2));
            } else {
                TF tfF = kw0.a.f(i2);
                TF tfF2 = this.c.a.f(i2);
                float f = 1.0f - fB;
                c3385yw0.c(i2, Kw0.e(tfF, (int) (((double) ((tfF.a - tfF2.a) * f)) + 0.5d), (int) (((double) ((tfF.b - tfF2.b) * f)) + 0.5d), (int) (((double) ((tfF.c - tfF2.c) * f)) + 0.5d), (int) (((double) ((tfF.d - tfF2.d) * f)) + 0.5d)));
            }
            i2 <<= 1;
            fB = fB;
            c3094vw0 = c3094vw0;
        }
        C2706rw0.g(this.e, c3385yw0.b(), Collections.singletonList(c3094vw0));
    }
}
