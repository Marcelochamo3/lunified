package o;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: o.Kx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@CU("fragment")
public class C0567Kx extends DU {
    public final Context c;
    public final C3289xx d;
    public final int e;
    public final LinkedHashSet f = new LinkedHashSet();
    public final ArrayList g = new ArrayList();
    public final C0385Dx h = new C0385Dx(0, this);
    public final io.sentry.android.replay.v i = new io.sentry.android.replay.v(5, this);

    public C0567Kx(Context context, C3289xx c3289xx, int i) {
        this.c = context;
        this.d = c3289xx;
        this.e = i;
    }

    public static void k(C0567Kx c0567Kx, String str, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        boolean z2 = (i & 4) != 0;
        ArrayList arrayList = c0567Kx.g;
        if (z2) {
            AbstractC1406ef.S(arrayList, new C5(str, 2));
        }
        arrayList.add(new C1101bX(str, Boolean.valueOf(z)));
    }

    public static boolean n() {
        return Log.isLoggable("FragmentManager", 2) || Log.isLoggable("FragmentNavigator", 2);
    }

    @Override // o.DU
    public final TT a() {
        return new C0463Gx(this);
    }

    @Override // o.DU
    public final void d(List list, C1098bU c1098bU) {
        C3289xx c3289xx = this.d;
        if (c3289xx.P()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DT dt = (DT) it.next();
            boolean zIsEmpty = ((List) b().e.l.getValue()).isEmpty();
            if (c1098bU == null || zIsEmpty || !c1098bU.b || !this.f.remove(dt.q)) {
                F7 f7M = m(dt, c1098bU);
                if (!zIsEmpty) {
                    DT dt2 = (DT) AbstractC0911Ye.j0((List) b().e.l.getValue());
                    if (dt2 != null) {
                        k(this, dt2.q, false, 6);
                    }
                    String str = dt.q;
                    k(this, str, false, 6);
                    f7M.c(str);
                }
                f7M.e(false);
                if (n()) {
                    dt.toString();
                }
                b().h(dt);
            } else {
                c3289xx.x(new C3192wx(c3289xx, dt.q, 0), false);
                b().h(dt);
            }
        }
    }

    @Override // o.DU
    public final void e(final FT ft) {
        this.a = ft;
        this.b = true;
        n();
        InterfaceC0592Lx interfaceC0592Lx = new InterfaceC0592Lx() { // from class: o.Ex
            @Override // o.InterfaceC0592Lx
            public final void b(C3289xx c3289xx, AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
                Object obj;
                Object objPrevious;
                FT ft2 = ft;
                AbstractC1474fG.j(ft2, "$state");
                C0567Kx c0567Kx = this;
                AbstractC1474fG.j(c0567Kx, "this$0");
                List list = (List) ft2.e.l.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                do {
                    obj = null;
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                } while (!AbstractC1474fG.b(((DT) objPrevious).q, abstractComponentCallbacksC1247cx.L));
                DT dt = (DT) objPrevious;
                if (C0567Kx.n()) {
                    abstractComponentCallbacksC1247cx.toString();
                    Objects.toString(dt);
                    Objects.toString(c0567Kx.d);
                }
                if (dt != null) {
                    C0541Jx c0541Jx = new C0541Jx(new io.sentry.android.replay.p(c0567Kx, abstractComponentCallbacksC1247cx, dt, 1));
                    TS ts = abstractComponentCallbacksC1247cx.d0;
                    ts.getClass();
                    TS.a("observe");
                    if (abstractComponentCallbacksC1247cx.b0.d != TJ.l) {
                        WK wk = new WK(ts, abstractComponentCallbacksC1247cx, c0541Jx);
                        C3022v90 c3022v90 = ts.b;
                        C2731s90 c2731s90A = c3022v90.a(c0541Jx);
                        if (c2731s90A != null) {
                            obj = c2731s90A.m;
                        } else {
                            C2731s90 c2731s90 = new C2731s90(c0541Jx, wk);
                            c3022v90.f1071o++;
                            C2731s90 c2731s91 = c3022v90.m;
                            if (c2731s91 == null) {
                                c3022v90.l = c2731s90;
                                c3022v90.m = c2731s90;
                            } else {
                                c2731s91.n = c2731s90;
                                c2731s90.f1020o = c2731s91;
                                c3022v90.m = c2731s90;
                            }
                        }
                        XK xk = (XK) obj;
                        if (xk != null && !xk.d(abstractComponentCallbacksC1247cx)) {
                            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
                        }
                        if (xk == null) {
                            abstractComponentCallbacksC1247cx.b0.a(wk);
                        }
                    }
                    abstractComponentCallbacksC1247cx.b0.a(c0567Kx.h);
                    c0567Kx.l(abstractComponentCallbacksC1247cx, dt, ft2);
                }
            }
        };
        C3289xx c3289xx = this.d;
        c3289xx.f1127o.add(interfaceC0592Lx);
        c3289xx.m.add(new C0515Ix(ft, this));
    }

    @Override // o.DU
    public final void f(DT dt) {
        C3289xx c3289xx = this.d;
        if (c3289xx.P()) {
            return;
        }
        F7 f7M = m(dt, null);
        List list = (List) b().e.l.getValue();
        if (list.size() > 1) {
            DT dt2 = (DT) AbstractC0911Ye.e0(AbstractC0937Ze.J(list) - 1, list);
            if (dt2 != null) {
                k(this, dt2.q, false, 6);
            }
            String str = dt.q;
            k(this, str, true, 4);
            c3289xx.x(new C2998ux(c3289xx, str, -1), false);
            k(this, str, false, 2);
            f7M.c(str);
        }
        f7M.e(false);
        b().c(dt);
    }

    @Override // o.DU
    public final void g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f;
            linkedHashSet.clear();
            AbstractC1406ef.Q(linkedHashSet, stringArrayList);
        }
    }

    @Override // o.DU
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return AbstractC1474fG.c(new C1101bX("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    @Override // o.DU
    public final void i(DT dt, boolean z) {
        int i;
        boolean z2;
        AbstractC1474fG.j(dt, "popUpTo");
        C3289xx c3289xx = this.d;
        if (c3289xx.P()) {
            return;
        }
        List list = (List) b().e.l.getValue();
        int iIndexOf = list.indexOf(dt);
        List listSubList = list.subList(iIndexOf, list.size());
        DT dt2 = (DT) AbstractC0911Ye.b0(list);
        DT dt3 = (DT) AbstractC0911Ye.e0(iIndexOf - 1, list);
        if (dt3 != null) {
            k(this, dt3.q, false, 6);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSubList) {
            DT dt4 = (DT) obj;
            C3074vm0 c3074vm0M = Vb0.M(AbstractC0911Ye.U(this.g), E1.G);
            String str = dt4.q;
            Iterator it = c3074vm0M.a.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object objB = c3074vm0M.b.b(it.next());
                if (i2 < 0) {
                    AbstractC0937Ze.N();
                    throw null;
                }
                if (AbstractC1474fG.b(str, objB)) {
                    i = i2;
                    break;
                }
                i2++;
            }
            if (i >= 0) {
                z2 = true;
            } else if (AbstractC1474fG.b(dt4.q, dt2.q)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k(this, ((DT) it2.next()).q, true, 4);
        }
        if (z) {
            for (DT dt5 : AbstractC0911Ye.p0(listSubList)) {
                if (AbstractC1474fG.b(dt5, dt2)) {
                    Objects.toString(dt5);
                } else {
                    c3289xx.x(new C3192wx(c3289xx, dt5.q, 1), false);
                    this.f.add(dt5.q);
                }
            }
        } else {
            c3289xx.x(new C2998ux(c3289xx, dt.q, -1), false);
        }
        if (n()) {
            dt.toString();
        }
        b().f(dt, z);
    }

    public final void l(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, DT dt, FT ft) {
        AbstractC1474fG.j(abstractComponentCallbacksC1247cx, "fragment");
        AbstractC1474fG.j(ft, "state");
        Zt0 zt0E = abstractComponentCallbacksC1247cx.e();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C2766se c2766seA = AbstractC2822t60.a(C0437Fx.class);
        if (!(!linkedHashMap.containsKey(c2766seA))) {
            throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + Pu0.k(c2766seA) + '.').toString());
        }
        linkedHashMap.put(c2766seA, new Wt0(c2766seA));
        Collection collectionValues = linkedHashMap.values();
        AbstractC1474fG.j(collectionValues, "initializers");
        Wt0[] wt0Arr = (Wt0[]) collectionValues.toArray(new Wt0[0]);
        C0744Rt c0744Rt = new C0744Rt((Wt0[]) Arrays.copyOf(wt0Arr, wt0Arr.length));
        C2290ni c2290ni = C2290ni.b;
        AbstractC1474fG.j(c2290ni, "defaultCreationExtras");
        RN rn = new RN(zt0E, c0744Rt, c2290ni);
        C2766se c2766seA2 = AbstractC2822t60.a(C0437Fx.class);
        String strK = Pu0.k(c2766seA2);
        if (strK == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
        }
        ((C0437Fx) rn.x(c2766seA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strK))).b = new WeakReference(new C3053vc(dt, ft, this, abstractComponentCallbacksC1247cx));
    }

    public final F7 m(DT dt, C1098bU c1098bU) {
        TT tt = dt.m;
        AbstractC1474fG.h(tt, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle bundleB = dt.b();
        String str = ((C0463Gx) tt).w;
        if (str == null) {
            throw new IllegalStateException("Fragment class was not set".toString());
        }
        char cCharAt = str.charAt(0);
        Context context = this.c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        C3289xx c3289xx = this.d;
        C2611qx c2611qxI = c3289xx.I();
        context.getClassLoader();
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxA = c2611qxI.a(str);
        AbstractC1474fG.i(abstractComponentCallbacksC1247cxA, "fragmentManager.fragment…t.classLoader, className)");
        abstractComponentCallbacksC1247cxA.U(bundleB);
        F7 f7 = new F7(c3289xx);
        int i = c1098bU != null ? c1098bU.f : -1;
        int i2 = c1098bU != null ? c1098bU.g : -1;
        int i3 = c1098bU != null ? c1098bU.h : -1;
        int i4 = c1098bU != null ? c1098bU.i : -1;
        if (i != -1 || i2 != -1 || i3 != -1 || i4 != -1) {
            if (i == -1) {
                i = 0;
            }
            if (i2 == -1) {
                i2 = 0;
            }
            if (i3 == -1) {
                i3 = 0;
            }
            int i5 = i4 != -1 ? i4 : 0;
            f7.b = i;
            f7.c = i2;
            f7.d = i3;
            f7.e = i5;
        }
        f7.h(this.e, abstractComponentCallbacksC1247cxA, dt.q);
        f7.i(abstractComponentCallbacksC1247cxA);
        f7.p = true;
        return f7;
    }
}
