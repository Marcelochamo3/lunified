package o;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.Jl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0529Jl extends AbstractC3060vf0 {
    public final List c;
    public final C3157wf0 d;
    public final C3157wf0 e;
    public final AbstractC0956Zx f;
    public final ArrayList g;
    public final ArrayList h;
    public final S5 i;
    public final C1790ib j = new C1790ib();
    public Object k;

    public C0529Jl(ArrayList arrayList, C3157wf0 c3157wf0, C3157wf0 c3157wf1, AbstractC0956Zx abstractC0956Zx, ArrayList arrayList2, ArrayList arrayList3, S5 s5, ArrayList arrayList4, ArrayList arrayList5, S5 s6, S5 s7, boolean z) {
        this.c = arrayList;
        this.d = c3157wf0;
        this.e = c3157wf1;
        this.f = abstractC0956Zx;
        this.g = arrayList2;
        this.h = arrayList3;
        this.i = s5;
    }

    public static void f(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (Ot0.b(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                f(childAt, arrayList);
            }
        }
    }

    @Override // o.AbstractC3060vf0
    public final boolean a() {
        Object obj;
        AbstractC0956Zx abstractC0956Zx = this.f;
        if (abstractC0956Zx.j()) {
            List<C0555Kl> list = this.c;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (C0555Kl c0555Kl : list) {
                    if (Build.VERSION.SDK_INT < 34 || (obj = c0555Kl.b) == null || !abstractC0956Zx.k(obj)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // o.AbstractC3060vf0
    public final void b(ViewGroup viewGroup) {
        AbstractC1474fG.j(viewGroup, "container");
        C1790ib c1790ib = this.j;
        synchronized (c1790ib) {
            try {
                if (c1790ib.a) {
                    return;
                }
                c1790ib.a = true;
                c1790ib.c = true;
                C1054ay c1054ay = c1790ib.b;
                if (c1054ay != null) {
                    try {
                        Runnable runnable = (Runnable) c1054ay.m;
                        if (runnable == null) {
                            ((Cm0) c1054ay.f685o).cancel();
                            ((Runnable) c1054ay.n).run();
                        } else {
                            runnable.run();
                        }
                    } catch (Throwable th) {
                        synchronized (c1790ib) {
                            c1790ib.c = false;
                            c1790ib.notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (c1790ib) {
                    c1790ib.c = false;
                    c1790ib.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // o.AbstractC3060vf0
    public final void c(ViewGroup viewGroup) {
        Object obj;
        AbstractC1474fG.j(viewGroup, "container");
        boolean zIsLaidOut = viewGroup.isLaidOut();
        List<C0555Kl> list = this.c;
        if (!zIsLaidOut) {
            for (C0555Kl c0555Kl : list) {
                C3157wf0 c3157wf0 = (C3157wf0) c0555Kl.a;
                if (Log.isLoggable("FragmentManager", 2)) {
                    viewGroup.toString();
                    Objects.toString(c3157wf0);
                }
                ((C3157wf0) c0555Kl.a).c(this);
            }
            return;
        }
        Object obj2 = this.k;
        AbstractC0956Zx abstractC0956Zx = this.f;
        C3157wf0 c3157wf1 = this.e;
        C3157wf0 c3157wf2 = this.d;
        if (obj2 != null) {
            abstractC0956Zx.c(obj2);
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(c3157wf2);
                Objects.toString(c3157wf1);
                return;
            }
            return;
        }
        C1101bX c1101bXG = g(viewGroup);
        ArrayList arrayList = (ArrayList) c1101bXG.l;
        ArrayList arrayList2 = new ArrayList(AbstractC1016af.O(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add((C3157wf0) ((C0555Kl) it.next()).a);
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            obj = c1101bXG.m;
            if (!zHasNext) {
                break;
            }
            C3157wf0 c3157wf3 = (C3157wf0) it2.next();
            abstractC0956Zx.s(c3157wf3.c, obj, this.j, new RunnableC0477Hl(c3157wf3, this, 1));
        }
        i(arrayList, viewGroup, new C3053vc(this, viewGroup, obj, 1));
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(c3157wf2);
            Objects.toString(c3157wf1);
        }
    }

    @Override // o.AbstractC3060vf0
    public final void d(E7 e7, ViewGroup viewGroup) {
        AbstractC1474fG.j(e7, "backEvent");
        AbstractC1474fG.j(viewGroup, "container");
        Object obj = this.k;
        if (obj != null) {
            this.f.p(obj, e7.c);
        }
    }

    @Override // o.AbstractC3060vf0
    public final void e(ViewGroup viewGroup) {
        boolean zIsLaidOut = viewGroup.isLaidOut();
        List list = this.c;
        if (!zIsLaidOut) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C3157wf0 c3157wf0 = (C3157wf0) ((C0555Kl) it.next()).a;
                if (Log.isLoggable("FragmentManager", 2)) {
                    viewGroup.toString();
                    Objects.toString(c3157wf0);
                }
            }
            return;
        }
        h();
        if (!a() || !h()) {
            return;
        }
        IF r6 = new IF();
        C1101bX c1101bXG = g(viewGroup);
        ArrayList arrayList = (ArrayList) c1101bXG.l;
        ArrayList arrayList2 = new ArrayList(AbstractC1016af.O(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add((C3157wf0) ((C0555Kl) it2.next()).a);
        }
        Iterator it3 = arrayList2.iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            Object obj = c1101bXG.m;
            if (!zHasNext) {
                i(arrayList, viewGroup, new C1205cc(this, viewGroup, obj, r6, 1));
                return;
            }
            C3157wf0 c3157wf1 = (C3157wf0) it3.next();
            Jj0 jj0 = new Jj0(12, r6);
            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = c3157wf1.c;
            this.f.r(obj, this.j, jj0, new RunnableC0477Hl(c3157wf1, this, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x009c  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b2 A[LOOP:2: B:23:0x00ac->B:25:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d5 A[LOOP:3: B:29:0x00cf->B:31:0x00d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e6 A[SYNTHETIC] */
    public final C1101bX g(ViewGroup viewGroup) {
        AbstractC0956Zx abstractC0956Zx;
        View view = new View(viewGroup.getContext());
        new Rect();
        List list = this.c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C0555Kl) it.next()).getClass();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        Object objM = null;
        Object objM2 = null;
        while (true) {
            boolean zHasNext = it2.hasNext();
            abstractC0956Zx = this.f;
            if (!zHasNext) {
                break;
            }
            C0555Kl c0555Kl = (C0555Kl) it2.next();
            C3157wf0 c3157wf0 = (C3157wf0) c0555Kl.a;
            Object objG = abstractC0956Zx.g(c0555Kl.b);
            if (objG != null) {
                ArrayList arrayList2 = new ArrayList();
                View view2 = c3157wf0.c.S;
                AbstractC1474fG.i(view2, "operation.fragment.mView");
                f(view2, arrayList2);
                if (arrayList2.isEmpty()) {
                    abstractC0956Zx.a(view, objG);
                } else {
                    abstractC0956Zx.b(objG, arrayList2);
                    abstractC0956Zx.o(objG, objG, arrayList2);
                    if (c3157wf0.a == 3) {
                        c3157wf0.i = false;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = c3157wf0.c;
                        arrayList3.remove(abstractComponentCallbacksC1247cx.S);
                        abstractC0956Zx.n(objG, abstractComponentCallbacksC1247cx.S, arrayList3);
                        ViewTreeObserverOnPreDrawListenerC2754sW.a(viewGroup, new Jj0(13, arrayList2));
                    }
                    if (c3157wf0.a == 2) {
                        arrayList.addAll(arrayList2);
                        if (Log.isLoggable("FragmentManager", 2)) {
                            objG.toString();
                            for (Object obj : arrayList2) {
                                AbstractC1474fG.i(obj, "transitioningViews");
                                ((View) obj).toString();
                            }
                        }
                    } else {
                        abstractC0956Zx.q(objG);
                        if (Log.isLoggable("FragmentManager", 2)) {
                            objG.toString();
                            for (Object obj2 : arrayList2) {
                                AbstractC1474fG.i(obj2, "transitioningViews");
                                ((View) obj2).toString();
                            }
                        }
                    }
                    if (c0555Kl.c) {
                        objM = abstractC0956Zx.m(objM, objG);
                    } else {
                        objM2 = abstractC0956Zx.m(objM2, objG);
                    }
                }
                if (c3157wf0.a == 2) {
                    arrayList.addAll(arrayList2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        objG.toString();
                        while (r8.hasNext()) {
                            AbstractC1474fG.i(obj, "transitioningViews");
                            ((View) obj).toString();
                        }
                    }
                } else {
                    abstractC0956Zx.q(objG);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        objG.toString();
                        while (r8.hasNext()) {
                            AbstractC1474fG.i(obj2, "transitioningViews");
                            ((View) obj2).toString();
                        }
                    }
                }
                if (c0555Kl.c) {
                    objM = abstractC0956Zx.m(objM, objG);
                } else {
                    objM2 = abstractC0956Zx.m(objM2, objG);
                }
            }
        }
        Object objL = abstractC0956Zx.l(objM, objM2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(objL);
        }
        return new C1101bX(arrayList, objL);
    }

    public final boolean h() {
        List list = this.c;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((C3157wf0) ((C0555Kl) it.next()).a).c.x) {
                return false;
            }
        }
        return true;
    }

    public final void i(ArrayList arrayList, ViewGroup viewGroup, InterfaceC0360Cy interfaceC0360Cy) {
        AbstractC0800Tx.a(4, arrayList);
        AbstractC0956Zx abstractC0956Zx = this.f;
        abstractC0956Zx.getClass();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.h;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList3.get(i);
            WeakHashMap weakHashMap = It0.a;
            arrayList2.add(AbstractC3185wt0.k(view));
            AbstractC3185wt0.v(view, null);
        }
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 2);
        ArrayList arrayList4 = this.g;
        if (zIsLoggable) {
            for (Object obj : arrayList4) {
                AbstractC1474fG.i(obj, "sharedElementFirstOutViews");
                View view2 = (View) obj;
                view2.toString();
                WeakHashMap weakHashMap2 = It0.a;
                AbstractC3185wt0.k(view2);
            }
            for (Object obj2 : arrayList3) {
                AbstractC1474fG.i(obj2, "sharedElementLastInViews");
                View view3 = (View) obj2;
                view3.toString();
                WeakHashMap weakHashMap3 = It0.a;
                AbstractC3185wt0.k(view3);
            }
        }
        interfaceC0360Cy.c();
        int size2 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        int i2 = 0;
        while (true) {
            ArrayList arrayList6 = this.g;
            if (i2 >= size2) {
                ViewTreeObserverOnPreDrawListenerC2754sW.a(viewGroup, new RunnableC0930Yx(size2, arrayList3, arrayList2, arrayList6, arrayList5));
                AbstractC0800Tx.a(0, arrayList);
                abstractC0956Zx.t(arrayList4, arrayList3);
                return;
            }
            View view4 = (View) arrayList6.get(i2);
            WeakHashMap weakHashMap4 = It0.a;
            String strK = AbstractC3185wt0.k(view4);
            arrayList5.add(strK);
            if (strK != null) {
                AbstractC3185wt0.v(view4, null);
                String str = (String) this.i.get(strK);
                for (int i3 = 0; i3 < size2; i3++) {
                    if (str.equals(arrayList2.get(i3))) {
                        AbstractC3185wt0.v((View) arrayList3.get(i3), strK);
                        break;
                    }
                }
            }
            i2++;
        }
    }
}
