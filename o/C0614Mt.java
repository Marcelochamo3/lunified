package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: o.Mt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0614Mt extends AnimatorListenerAdapter {
    public boolean a = false;
    public final /* synthetic */ C0640Nt b;

    public C0614Mt(C0640Nt c0640Nt) {
        this.b = c0640Nt;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.a = false;
            return;
        }
        C0640Nt c0640Nt = this.b;
        if (((Float) c0640Nt.z.getAnimatedValue()).floatValue() == 0.0f) {
            c0640Nt.A = 0;
            c0640Nt.g(0);
        } else {
            c0640Nt.A = 2;
            c0640Nt.s.invalidate();
        }
    }
}
