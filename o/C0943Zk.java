package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: o.Zk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0943Zk extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ AbstractC2144m60 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ C1418el e;

    public C0943Zk(C1418el c1418el, AbstractC2144m60 abstractC2144m60, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = c1418el;
        this.b = abstractC2144m60;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.d.setListener(null);
                this.c.setAlpha(1.0f);
                C1418el c1418el = this.e;
                AbstractC2144m60 abstractC2144m60 = this.b;
                c1418el.c(abstractC2144m60);
                c1418el.q.remove(abstractC2144m60);
                c1418el.i();
                break;
            default:
                this.d.setListener(null);
                C1418el c1418el2 = this.e;
                AbstractC2144m60 abstractC2144m61 = this.b;
                c1418el2.c(abstractC2144m61);
                c1418el2.f761o.remove(abstractC2144m61);
                c1418el2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.e.getClass();
                break;
            default:
                this.e.getClass();
                break;
        }
    }

    public C0943Zk(C1418el c1418el, AbstractC2144m60 abstractC2144m60, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = c1418el;
        this.b = abstractC2144m60;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
