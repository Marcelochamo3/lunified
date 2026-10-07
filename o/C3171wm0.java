package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: renamed from: o.wm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3171wm0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public C3171wm0(C3094vw0 c3094vw0, View view) {
        this.b = c3094vw0;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((S5) this.b).remove(animator);
                ((Cm0) this.c).y.remove(animator);
                break;
            default:
                ((C3094vw0) this.b).a.d(1.0f);
                C2706rw0.e((View) this.c);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((Cm0) this.c).y.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C3171wm0(Cm0 cm0, S5 s5) {
        this.c = cm0;
        this.b = s5;
    }
}
