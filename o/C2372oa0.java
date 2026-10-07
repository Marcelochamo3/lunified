package o;

import android.animation.ValueAnimator;
import androidx.leanback.widget.SearchOrbView;

/* JADX INFO: renamed from: o.oa0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2372oa0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchOrbView b;

    public /* synthetic */ C2372oa0(SearchOrbView searchOrbView, int i) {
        this.a = i;
        this.b = searchOrbView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.setOrbViewColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                this.b.setSearchOrbZ(valueAnimator.getAnimatedFraction());
                break;
        }
    }
}
