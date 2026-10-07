package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class Lu0 extends AnimatorListenerAdapter implements Bm0 {
    public final View a;
    public final int b;
    public final ViewGroup c;
    public boolean e;
    public boolean f = false;
    public final boolean d = true;

    public Lu0(View view, int i) {
        this.a = view;
        this.b = i;
        this.c = (ViewGroup) view.getParent();
        h(true);
    }

    @Override // o.Bm0
    public final void b() {
        h(false);
        if (this.f) {
            return;
        }
        AbstractC3381yu0.b(this.a, this.b);
    }

    @Override // o.Bm0
    public final void c() {
        h(true);
        if (this.f) {
            return;
        }
        AbstractC3381yu0.b(this.a, 0);
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

    public final void h(boolean z) {
        ViewGroup viewGroup;
        if (!this.d || this.e == z || (viewGroup = this.c) == null) {
            return;
        }
        this.e = z;
        Ou0.F(viewGroup, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f) {
            AbstractC3381yu0.b(this.a, this.b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            AbstractC3381yu0.b(this.a, 0);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        if (!this.f) {
            AbstractC3381yu0.b(this.a, this.b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    @Override // o.Bm0
    public final void a(Cm0 cm0) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
