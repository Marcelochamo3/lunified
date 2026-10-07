package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: o.mO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2165mO extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ C2262nO c;

    public C2165mO(C2262nO c2262nO, boolean z, int i) {
        this.c = c2262nO;
        this.a = z;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C2262nO c2262nO = this.c;
        c2262nO.b.setTranslationX(0.0f);
        c2262nO.a(0.0f, this.a, this.b);
    }
}
