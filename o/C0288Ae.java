package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: o.Ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0288Ae extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0314Be b;

    public /* synthetic */ C0288Ae(C0314Be c0314Be, int i) {
        this.a = i;
        this.b = c0314Be;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                this.b.b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
