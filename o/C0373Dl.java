package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;

/* JADX INFO: renamed from: o.Dl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0373Dl extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ C3157wf0 d;
    public final /* synthetic */ C0399El e;

    public C0373Dl(ViewGroup viewGroup, View view, boolean z, C3157wf0 c3157wf0, C0399El c0399El) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = c3157wf0;
        this.e = c0399El;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AbstractC1474fG.j(animator, "anim");
        ViewGroup viewGroup = this.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        C3157wf0 c3157wf0 = this.d;
        if (z) {
            int i = c3157wf0.a;
            AbstractC1474fG.i(view, "viewToAnimate");
            AbstractC1674hK.d(i, view, viewGroup);
        }
        C0399El c0399El = this.e;
        ((C3157wf0) c0399El.c.a).c(c0399El);
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(c3157wf0);
        }
    }
}
