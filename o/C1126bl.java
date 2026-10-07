package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: o.bl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1126bl extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ C1223cl b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ C1418el e;

    public /* synthetic */ C1126bl(C1418el c1418el, C1223cl c1223cl, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.a = i;
        this.e = c1418el;
        this.b = c1223cl;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C1223cl c1223cl = this.b;
                AbstractC2144m60 abstractC2144m60 = c1223cl.a;
                C1418el c1418el = this.e;
                c1418el.c(abstractC2144m60);
                c1418el.r.remove(c1223cl.a);
                c1418el.i();
                break;
            default:
                this.c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C1223cl c1223cl2 = this.b;
                AbstractC2144m60 abstractC2144m61 = c1223cl2.b;
                C1418el c1418el2 = this.e;
                c1418el2.c(abstractC2144m61);
                c1418el2.r.remove(c1223cl2.b);
                c1418el2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                AbstractC2144m60 abstractC2144m60 = this.b.a;
                this.e.getClass();
                break;
            default:
                AbstractC2144m60 abstractC2144m61 = this.b.b;
                this.e.getClass();
                break;
        }
    }
}
