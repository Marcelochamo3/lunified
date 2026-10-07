package o;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: renamed from: o.Bl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0321Bl extends AbstractC3060vf0 {
    public final C0347Cl c;

    public C0321Bl(C0347Cl c0347Cl) {
        this.c = c0347Cl;
    }

    @Override // o.AbstractC3060vf0
    public final void b(ViewGroup viewGroup) {
        AbstractC1474fG.j(viewGroup, "container");
        C0347Cl c0347Cl = this.c;
        C3157wf0 c3157wf0 = (C3157wf0) c0347Cl.a;
        View view = c3157wf0.c.S;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        ((C3157wf0) c0347Cl.a).c(this);
        if (Log.isLoggable("FragmentManager", 2)) {
            c3157wf0.toString();
        }
    }

    @Override // o.AbstractC3060vf0
    public final void c(ViewGroup viewGroup) {
        AbstractC1474fG.j(viewGroup, "container");
        C0347Cl c0347Cl = this.c;
        boolean zG = c0347Cl.g();
        C3157wf0 c3157wf0 = (C3157wf0) c0347Cl.a;
        if (zG) {
            c3157wf0.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = c3157wf0.c.S;
        AbstractC1474fG.i(context, "context");
        C2994uv c2994uvR = c0347Cl.r(context);
        if (c2994uvR == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        Animation animation = (Animation) c2994uvR.m;
        if (animation == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        if (c3157wf0.a != 1) {
            view.startAnimation(animation);
            c3157wf0.c(this);
            return;
        }
        viewGroup.startViewTransition(view);
        RunnableC1638gx runnableC1638gx = new RunnableC1638gx(animation, viewGroup, view);
        runnableC1638gx.setAnimationListener(new AnimationAnimationListenerC0295Al(c3157wf0, viewGroup, view, this));
        view.startAnimation(runnableC1638gx);
        if (Log.isLoggable("FragmentManager", 2)) {
            c3157wf0.toString();
        }
    }
}
