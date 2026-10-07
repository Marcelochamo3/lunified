package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.skidush.clonex.R;

/* JADX INFO: loaded from: classes.dex */
public final class Mu0 extends AnimatorListenerAdapter implements Bm0 {
    public final ViewGroup a;
    public final View b;
    public final View c;
    public boolean d = true;
    public final /* synthetic */ C0484Hs e;

    public Mu0(C0484Hs c0484Hs, ViewGroup viewGroup, View view, View view2) {
        this.e = c0484Hs;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    @Override // o.Bm0
    public final void a(Cm0 cm0) {
        if (this.d) {
            h();
        }
    }

    @Override // o.Bm0
    public final void d(Cm0 cm0) {
        cm0.E(this);
    }

    @Override // o.Bm0
    public final void e(Cm0 cm0) {
    }

    @Override // o.Bm0
    public final void f(Cm0 cm0) {
        cm0.E(this);
    }

    @Override // o.Bm0
    public final void g(Cm0 cm0) {
        throw null;
    }

    public final void h() {
        this.c.setTag(R.id.save_overlay_view, null);
        this.a.getOverlay().remove(this.b);
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.a.getOverlay().remove(this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.b;
        if (view.getParent() == null) {
            this.a.getOverlay().add(view);
        } else {
            this.e.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.c;
            View view2 = this.b;
            view.setTag(R.id.save_overlay_view, view2);
            this.a.getOverlay().add(view2);
            this.d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        h();
    }

    @Override // o.Bm0
    public final void b() {
    }

    @Override // o.Bm0
    public final void c() {
    }
}
