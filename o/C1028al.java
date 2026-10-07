package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: o.al, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1028al extends AnimatorListenerAdapter {
    public final /* synthetic */ AbstractC2144m60 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewPropertyAnimator e;
    public final /* synthetic */ C1418el f;

    public C1028al(C1418el c1418el, AbstractC2144m60 abstractC2144m60, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = c1418el;
        this.a = abstractC2144m60;
        this.b = i;
        this.c = view;
        this.d = i2;
        this.e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.b;
        View view = this.c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        C1418el c1418el = this.f;
        AbstractC2144m60 abstractC2144m60 = this.a;
        c1418el.c(abstractC2144m60);
        c1418el.p.remove(abstractC2144m60);
        c1418el.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f.getClass();
    }
}
