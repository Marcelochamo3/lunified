package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: o.gx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1638gx extends AnimationSet implements Runnable {
    public final ViewGroup l;
    public final View m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f802o;
    public boolean p;

    public RunnableC1638gx(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.p = true;
        this.l = viewGroup;
        this.m = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.p = true;
        if (this.n) {
            return !this.f802o;
        }
        if (!super.getTransformation(j, transformation)) {
            this.n = true;
            ViewTreeObserverOnPreDrawListenerC2754sW.a(this.l, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.n;
        ViewGroup viewGroup = this.l;
        if (z || !this.p) {
            viewGroup.endViewTransition(this.m);
            this.f802o = true;
        } else {
            this.p = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.p = true;
        if (this.n) {
            return !this.f802o;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.n = true;
            ViewTreeObserverOnPreDrawListenerC2754sW.a(this.l, this);
        }
        return true;
    }
}
