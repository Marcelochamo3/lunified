package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.Gs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0458Gs extends AnimatorListenerAdapter implements Bm0 {
    public final View a;
    public boolean b = false;

    public C0458Gs(View view) {
        this.a = view;
    }

    @Override // o.Bm0
    public final void b() {
        View view = this.a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? AbstractC3381yu0.a.r(view) : 0.0f));
    }

    @Override // o.Bm0
    public final void c() {
        this.a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // o.Bm0
    public final void d(Cm0 cm0) {
    }

    @Override // o.Bm0
    public final void f(Cm0 cm0) {
        throw null;
    }

    @Override // o.Bm0
    public final void g(Cm0 cm0) {
        throw null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC3381yu0.a.F(this.a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.b;
        View view = this.a;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        Du0 du0 = AbstractC3381yu0.a;
        du0.F(view, 1.0f);
        du0.getClass();
    }

    @Override // o.Bm0
    public final void a(Cm0 cm0) {
    }

    @Override // o.Bm0
    public final void e(Cm0 cm0) {
    }
}
