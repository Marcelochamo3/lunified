package o;

import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o.Xx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0904Xx extends AbstractC0956Zx {
    public static boolean u(Transition transition) {
        return (AbstractC0956Zx.i(transition.getTargetIds()) && AbstractC0956Zx.i(transition.getTargetNames()) && AbstractC0956Zx.i(transition.getTargetTypes())) ? false : true;
    }

    @Override // o.AbstractC0956Zx
    public final void a(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    @Override // o.AbstractC0956Zx
    public final void b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                b(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (u(transition) || !AbstractC0956Zx.i(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget((View) arrayList.get(i));
            i++;
        }
    }

    @Override // o.AbstractC0956Zx
    public final void e(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // o.AbstractC0956Zx
    public final boolean f(Object obj) {
        return obj instanceof Transition;
    }

    @Override // o.AbstractC0956Zx
    public final Object g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // o.AbstractC0956Zx
    public final boolean j() {
        Log.isLoggable("FragmentManager", 4);
        return false;
    }

    @Override // o.AbstractC0956Zx
    public final boolean k(Object obj) {
        if (!Log.isLoggable("FragmentManager", 2)) {
            return false;
        }
        Objects.toString(obj);
        return false;
    }

    @Override // o.AbstractC0956Zx
    public final Object l(Object obj, Object obj2) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        if (transition != null && transition2 != null) {
            return new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        }
        if (transition != null) {
            return transition;
        }
        if (transition2 != null) {
            return transition2;
        }
        return null;
    }

    @Override // o.AbstractC0956Zx
    public final Object m(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // o.AbstractC0956Zx
    public final void n(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new C0826Ux(view, arrayList));
    }

    @Override // o.AbstractC0956Zx
    public final void o(Object obj, Object obj2, ArrayList arrayList) {
        ((Transition) obj).addListener(new C0852Vx(this, obj2, arrayList));
    }

    @Override // o.AbstractC0956Zx
    public final void s(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, Object obj, C1790ib c1790ib, RunnableC0477Hl runnableC0477Hl) {
        ((Transition) obj).addListener(new C0878Wx(runnableC0477Hl));
    }

    public final void v(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                v(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (u(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget((View) arrayList2.get(i));
            i++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget((View) arrayList.get(size2));
        }
    }

    @Override // o.AbstractC0956Zx
    public final void q(Object obj) {
    }

    @Override // o.AbstractC0956Zx
    public final void t(ArrayList arrayList, ArrayList arrayList2) {
    }
}
