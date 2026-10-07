package o;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.exoplayer2.ui.DefaultTimeBar;

/* JADX INFO: renamed from: o.Ol, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0658Ol implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0658Ol(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                int i = DefaultTimeBar.b0;
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) obj;
                defaultTimeBar.getClass();
                defaultTimeBar.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                defaultTimeBar.invalidate(defaultTimeBar.l);
                break;
            case 1:
                C0869Wo c0869Wo = (C0869Wo) obj;
                c0869Wo.getClass();
                c0869Wo.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((View) ((C2416ow0) ((L80) obj).l).g.getParent()).invalidate();
                break;
        }
    }

    public /* synthetic */ C0658Ol(L80 l80, View view) {
        this.a = 2;
        this.b = l80;
    }
}
