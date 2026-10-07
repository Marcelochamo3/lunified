package o;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;

/* JADX INFO: renamed from: o.El, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0399El extends AbstractC3060vf0 {
    public final C0347Cl c;
    public AnimatorSet d;

    public C0399El(C0347Cl c0347Cl) {
        this.c = c0347Cl;
    }

    @Override // o.AbstractC3060vf0
    public final void b(ViewGroup viewGroup) {
        AbstractC1474fG.j(viewGroup, "container");
        AnimatorSet animatorSet = this.d;
        C0347Cl c0347Cl = this.c;
        if (animatorSet == null) {
            ((C3157wf0) c0347Cl.a).c(this);
            return;
        }
        C3157wf0 c3157wf0 = (C3157wf0) c0347Cl.a;
        if (!c3157wf0.g) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0451Gl.a.a(animatorSet);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            c3157wf0.toString();
        }
    }

    @Override // o.AbstractC3060vf0
    public final void c(ViewGroup viewGroup) {
        AbstractC1474fG.j(viewGroup, "container");
        C3157wf0 c3157wf0 = (C3157wf0) this.c.a;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            c3157wf0.c(this);
            return;
        }
        animatorSet.start();
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(c3157wf0);
        }
    }

    @Override // o.AbstractC3060vf0
    public final void d(E7 e7, ViewGroup viewGroup) {
        AbstractC1474fG.j(e7, "backEvent");
        AbstractC1474fG.j(viewGroup, "container");
        C3157wf0 c3157wf0 = (C3157wf0) this.c.a;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            c3157wf0.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !c3157wf0.c.x) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            c3157wf0.toString();
        }
        long jA = C0425Fl.a.a(animatorSet);
        long j = (long) (e7.c * jA);
        if (j == 0) {
            j = 1;
        }
        if (j == jA) {
            j = jA - 1;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            animatorSet.toString();
            c3157wf0.toString();
        }
        C0451Gl.a.b(animatorSet, j);
    }

    @Override // o.AbstractC3060vf0
    public final void e(ViewGroup viewGroup) {
        C0347Cl c0347Cl = this.c;
        if (c0347Cl.g()) {
            return;
        }
        Context context = viewGroup.getContext();
        AbstractC1474fG.i(context, "context");
        C2994uv c2994uvR = c0347Cl.r(context);
        this.d = c2994uvR != null ? (AnimatorSet) c2994uvR.n : null;
        C3157wf0 c3157wf0 = (C3157wf0) c0347Cl.a;
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = c3157wf0.c;
        boolean z = c3157wf0.a == 3;
        View view = abstractComponentCallbacksC1247cx.S;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.addListener(new C0373Dl(viewGroup, view, z, c3157wf0, this));
        }
        AnimatorSet animatorSet2 = this.d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
