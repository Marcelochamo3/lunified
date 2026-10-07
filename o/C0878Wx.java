package o;

import android.transition.Transition;

/* JADX INFO: renamed from: o.Wx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0878Wx implements Transition.TransitionListener {
    public final /* synthetic */ Runnable a;

    public C0878Wx(RunnableC0477Hl runnableC0477Hl) {
        this.a = runnableC0477Hl;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.a.run();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}
