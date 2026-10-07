package o;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.Vx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0852Vx implements Transition.TransitionListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Object c = null;
    public final /* synthetic */ ArrayList d = null;
    public final /* synthetic */ Object e = null;
    public final /* synthetic */ ArrayList f = null;
    public final /* synthetic */ C0904Xx g;

    public C0852Vx(C0904Xx c0904Xx, Object obj, ArrayList arrayList) {
        this.g = c0904Xx;
        this.a = obj;
        this.b = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        C0904Xx c0904Xx = this.g;
        Object obj = this.a;
        if (obj != null) {
            c0904Xx.v(obj, this.b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            c0904Xx.v(obj2, this.d, null);
        }
        Object obj3 = this.e;
        if (obj3 != null) {
            c0904Xx.v(obj3, this.f, null);
        }
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
}
