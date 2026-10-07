package o;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import j$.util.Objects;

/* JADX INFO: renamed from: o.Al, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC0295Al implements Animation.AnimationListener {
    public final /* synthetic */ C3157wf0 a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ View c;
    public final /* synthetic */ C0321Bl d;

    public AnimationAnimationListenerC0295Al(C3157wf0 c3157wf0, ViewGroup viewGroup, View view, C0321Bl c0321Bl) {
        this.a = c3157wf0;
        this.b = viewGroup;
        this.c = view;
        this.d = c0321Bl;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AbstractC1474fG.j(animation, "animation");
        ViewGroup viewGroup = this.b;
        viewGroup.post(new RunnableC1169c7(viewGroup, this.c, this.d, 3));
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(this.a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        AbstractC1474fG.j(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        AbstractC1474fG.j(animation, "animation");
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(this.a);
        }
    }
}
