package o;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class YT {
    public final ArrayList A;
    public final Rh0 B;
    public final C3153wd0 C;
    public final Context a;
    public final Activity b;
    public WT c;
    public Bundle d;
    public Parcelable[] e;
    public boolean f;
    public final M5 g;
    public final C2771sg0 h;
    public final C2771sg0 i;
    public final LinkedHashMap j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public InterfaceC1283dK n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LT f636o;
    public final CopyOnWriteArrayList p;
    public TJ q;
    public final C0385Dx r;
    public final C0781Te s;
    public final boolean t;
    public final EU u;
    public final LinkedHashMap v;
    public InterfaceC0412Ey w;
    public InterfaceC0412Ey x;
    public final LinkedHashMap y;
    public int z;

    public YT(Context context) {
        this.a = context;
        for (Object obj : Vb0.K(context, C1182cH.t)) {
            if (((Context) obj) instanceof Activity) {
                this.b = (Activity) obj;
                this.g = new M5();
                C1233cq c1233cq = C1233cq.l;
                this.h = new C2771sg0(c1233cq);
                this.i = new C2771sg0(c1233cq);
                this.j = new LinkedHashMap();
                this.k = new LinkedHashMap();
                this.l = new LinkedHashMap();
                this.m = new LinkedHashMap();
                this.p = new CopyOnWriteArrayList();
                this.q = TJ.m;
                this.r = new C0385Dx(1, this);
                this.s = new C0781Te(2, this, false);
                this.t = true;
                EU eu = new EU();
                this.u = eu;
                this.v = new LinkedHashMap();
                this.y = new LinkedHashMap();
                eu.a(new XT(eu));
                eu.a(new F1(this.a));
                this.A = new ArrayList();
                this.B = new Rh0(new NM(this, 3));
                this.C = new C3153wd0(1, 1, 2);
            }
        }
        obj = null;
        this.b = (Activity) obj;
        this.g = new M5();
        C1233cq c1233cq2 = C1233cq.l;
        this.h = new C2771sg0(c1233cq2);
        this.i = new C2771sg0(c1233cq2);
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.p = new CopyOnWriteArrayList();
        this.q = TJ.m;
        this.r = new C0385Dx(1, this);
        this.s = new C0781Te(2, this, false);
        this.t = true;
        EU eu2 = new EU();
        this.u = eu2;
        this.v = new LinkedHashMap();
        this.y = new LinkedHashMap();
        eu2.a(new XT(eu2));
        eu2.a(new F1(this.a));
        this.A = new ArrayList();
        this.B = new Rh0(new NM(this, 3));
        this.C = new C3153wd0(1, 1, 2);
    }

    public static TT f(int i, TT tt, boolean z) {
        WT wt;
        if (tt.s == i) {
            return tt;
        }
        if (tt instanceof WT) {
            wt = (WT) tt;
        } else {
            WT wt2 = tt.m;
            AbstractC1474fG.g(wt2);
            wt = wt2;
        }
        return wt.k(i, wt, z);
    }

    public static /* synthetic */ void w(YT yt, DT dt) {
        yt.v(dt, false, new M5());
    }

    public final void A(DT dt) {
        AbstractC1474fG.j(dt, "child");
        DT dt2 = (DT) this.j.remove(dt);
        if (dt2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.k;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(dt2);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            FT ft = (FT) this.v.get(this.u.b(dt2.m.l));
            if (ft != null) {
                ft.b(dt2);
            }
            linkedHashMap.remove(dt2);
        }
    }

    public final void B() {
        AtomicInteger atomicInteger;
        C2917u50 c2917u50;
        Set set;
        ArrayList<DT> arrayListY0 = AbstractC0911Ye.y0(this.g);
        if (arrayListY0.isEmpty()) {
            return;
        }
        TT tt = ((DT) AbstractC0911Ye.i0(arrayListY0)).m;
        ArrayList arrayList = new ArrayList();
        if (tt instanceof InterfaceC1342dw) {
            Iterator it = AbstractC0911Ye.p0(arrayListY0).iterator();
            while (it.hasNext()) {
                TT tt2 = ((DT) it.next()).m;
                arrayList.add(tt2);
                if (!(tt2 instanceof InterfaceC1342dw) && !(tt2 instanceof WT)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (DT dt : AbstractC0911Ye.p0(arrayListY0)) {
            TJ tj = dt.v;
            TT tt3 = dt.m;
            TJ tj2 = TJ.p;
            TJ tj3 = TJ.f532o;
            if (tt != null && tt3.s == tt.s) {
                if (tj != tj2) {
                    FT ft = (FT) this.v.get(this.u.b(tt3.l));
                    if (AbstractC1474fG.b((ft == null || (c2917u50 = ft.f) == null || (set = (Set) c2917u50.l.getValue()) == null) ? null : Boolean.valueOf(set.contains(dt)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.k.get(dt)) != null && atomicInteger.get() == 0)) {
                        map.put(dt, tj3);
                    } else {
                        map.put(dt, tj2);
                    }
                }
                TT tt4 = (TT) AbstractC0911Ye.d0(arrayList);
                if (tt4 != null && tt4.s == tt3.s) {
                    if (arrayList.isEmpty()) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    arrayList.remove(0);
                }
                tt = tt.m;
            } else if ((!arrayList.isEmpty()) && tt3.s == ((TT) AbstractC0911Ye.b0(arrayList)).s) {
                if (arrayList.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                TT tt5 = (TT) arrayList.remove(0);
                if (tj == tj2) {
                    dt.g(tj3);
                } else if (tj != tj3) {
                    map.put(dt, tj3);
                }
                WT wt = tt5.m;
                if (wt != null && !arrayList.contains(wt)) {
                    arrayList.add(wt);
                }
            } else {
                dt.g(TJ.n);
            }
        }
        for (DT dt2 : arrayListY0) {
            TJ tj4 = (TJ) map.get(dt2);
            if (tj4 != null) {
                dt2.g(tj4);
            } else {
                dt2.h();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    public final void C() {
        boolean z;
        if (this.t) {
            z = i() > 1;
        }
        C0781Te c0781Te = this.s;
        c0781Te.a = z;
        InterfaceC0360Cy interfaceC0360Cy = c0781Te.c;
        if (interfaceC0360Cy != null) {
            interfaceC0360Cy.c();
        }
    }

    public final void a(TT tt, Bundle bundle, DT dt, List list) {
        Object objPrevious;
        Object objPrevious2;
        TT tt2 = dt.m;
        boolean z = tt2 instanceof InterfaceC1342dw;
        M5 m5 = this.g;
        if (!z) {
            while (!m5.isEmpty() && (((DT) m5.last()).m instanceof InterfaceC1342dw) && t(((DT) m5.last()).m.s, true, false)) {
            }
        }
        M5<DT> m6 = new M5();
        boolean z2 = tt instanceof WT;
        Context context = this.a;
        Object obj = null;
        if (z2) {
            TT tt3 = tt2;
            do {
                AbstractC1474fG.g(tt3);
                tt3 = tt3.m;
                if (tt3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        }
                        objPrevious2 = listIterator.previous();
                    } while (!AbstractC1474fG.b(((DT) objPrevious2).m, tt3));
                    DT dtN = (DT) objPrevious2;
                    if (dtN == null) {
                        dtN = C2743sL.n(context, tt3, bundle, k(), this.f636o);
                    }
                    m6.e(dtN);
                    if ((!m5.isEmpty()) && ((DT) m5.last()).m == tt3) {
                        w(this, (DT) m5.last());
                    }
                }
                if (tt3 == null) {
                    break;
                }
            } while (tt3 != tt);
        }
        TT tt4 = m6.isEmpty() ? tt2 : ((DT) m6.first()).m;
        while (tt4 != null && e(tt4.s) != tt4) {
            tt4 = tt4.m;
            if (tt4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator2.previous();
                } while (!AbstractC1474fG.b(((DT) objPrevious).m, tt4));
                DT dtN2 = (DT) objPrevious;
                if (dtN2 == null) {
                    dtN2 = C2743sL.n(context, tt4, tt4.a(bundle2), k(), this.f636o);
                }
                m6.e(dtN2);
            }
        }
        if (!m6.isEmpty()) {
            tt2 = ((DT) m6.first()).m;
        }
        while (!m5.isEmpty() && (((DT) m5.last()).m instanceof WT)) {
            TT tt5 = ((DT) m5.last()).m;
            AbstractC1474fG.h(tt5, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((WT) tt5).w.d(tt2.s) != null) {
                break;
            } else {
                w(this, (DT) m5.last());
            }
        }
        DT dt2 = (DT) (m5.isEmpty() ? null : m5.m[m5.l]);
        if (dt2 == null) {
            dt2 = (DT) (m6.isEmpty() ? null : m6.m[m6.l]);
        }
        if (!AbstractC1474fG.b(dt2 != null ? dt2.m : null, this.c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                Object objPrevious3 = listIterator3.previous();
                TT tt6 = ((DT) objPrevious3).m;
                WT wt = this.c;
                AbstractC1474fG.g(wt);
                if (AbstractC1474fG.b(tt6, wt)) {
                    obj = objPrevious3;
                    break;
                }
            }
            DT dtN3 = (DT) obj;
            if (dtN3 == null) {
                WT wt2 = this.c;
                AbstractC1474fG.g(wt2);
                WT wt3 = this.c;
                AbstractC1474fG.g(wt3);
                dtN3 = C2743sL.n(context, wt2, wt3.a(bundle), k(), this.f636o);
            }
            m6.e(dtN3);
        }
        for (DT dt3 : m6) {
            Object obj2 = this.v.get(this.u.b(dt3.m.l));
            if (obj2 == null) {
                throw new IllegalStateException(AbstractC1701hf0.h(new StringBuilder("NavigatorBackStack for "), tt.l, " should already be created").toString());
            }
            ((FT) obj2).a(dt3);
        }
        m5.addAll(m6);
        m5.f(dt);
        for (DT dt4 : AbstractC0911Ye.n0(m6, dt)) {
            WT wt4 = dt4.m.m;
            if (wt4 != null) {
                m(dt4, g(wt4.s));
            }
        }
    }

    public final void b(GT gt) {
        this.p.add(gt);
        M5 m5 = this.g;
        if (!m5.isEmpty()) {
            DT dt = (DT) m5.last();
            TT tt = dt.m;
            dt.b();
            gt.a(this, tt);
        }
    }

    public final boolean c() {
        M5 m5;
        while (true) {
            m5 = this.g;
            if (m5.isEmpty() || !(((DT) m5.last()).m instanceof WT)) {
                break;
            }
            w(this, (DT) m5.last());
        }
        DT dt = (DT) m5.j();
        ArrayList arrayList = this.A;
        if (dt != null) {
            arrayList.add(dt);
        }
        this.z++;
        B();
        int i = this.z - 1;
        this.z = i;
        if (i == 0) {
            ArrayList<DT> arrayListY0 = AbstractC0911Ye.y0(arrayList);
            arrayList.clear();
            for (DT dt2 : arrayListY0) {
                for (GT gt : this.p) {
                    TT tt = dt2.m;
                    dt2.b();
                    gt.a(this, tt);
                }
                this.C.o(dt2);
            }
            this.h.f(AbstractC0911Ye.y0(m5));
            this.i.f(x());
        }
        return dt != null;
    }

    public final boolean d(ArrayList arrayList, TT tt, boolean z, boolean z2) {
        String str;
        C2532q60 c2532q60 = new C2532q60();
        M5 m5 = new M5();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DU du = (DU) it.next();
            C2532q60 c2532q61 = new C2532q60();
            DT dt = (DT) this.g.last();
            this.x = new HT(c2532q61, c2532q60, this, z2, m5);
            du.i(dt, z2);
            this.x = null;
            if (!c2532q61.l) {
                break;
            }
        }
        if (z2) {
            LinkedHashMap linkedHashMap = this.l;
            if (!z) {
                C1634gv c1634gv = new C1634gv(new C2591qn(Vb0.K(tt, C1182cH.u), new IT(this, 0), 1));
                while (c1634gv.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((TT) c1634gv.next()).s);
                    ET et = (ET) (m5.isEmpty() ? null : m5.m[m5.l]);
                    linkedHashMap.put(numValueOf, et != null ? et.l : null);
                }
            }
            if (!m5.isEmpty()) {
                ET et2 = (ET) m5.first();
                C1634gv c1634gv2 = new C1634gv(new C2591qn(Vb0.K(e(et2.m), C1182cH.v), new IT(this, 1), 1));
                while (true) {
                    boolean zHasNext = c1634gv2.hasNext();
                    str = et2.l;
                    if (!zHasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((TT) c1634gv2.next()).s), str);
                }
                if (linkedHashMap.values().contains(str)) {
                    this.m.put(str, m5);
                }
            }
        }
        C();
        return c2532q60.l;
    }

    public final TT e(int i) {
        TT tt;
        WT wt = this.c;
        if (wt == null) {
            return null;
        }
        if (wt.s == i) {
            return wt;
        }
        DT dt = (DT) this.g.j();
        if (dt == null || (tt = dt.m) == null) {
            tt = this.c;
            AbstractC1474fG.g(tt);
        }
        return f(i, tt, false);
    }

    public final DT g(int i) {
        Object objPrevious;
        M5 m5 = this.g;
        ListIterator<E> listIterator = m5.listIterator(m5.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((DT) objPrevious).m.s != i);
        DT dt = (DT) objPrevious;
        if (dt != null) {
            return dt;
        }
        StringBuilder sbR = AbstractC1674hK.r("No destination with ID ", i, " is on the NavController's back stack. The current destination is ");
        sbR.append(h());
        throw new IllegalArgumentException(sbR.toString().toString());
    }

    public final TT h() {
        DT dt = (DT) this.g.j();
        if (dt != null) {
            return dt.m;
        }
        return null;
    }

    public final int i() {
        M5 m5 = this.g;
        int i = 0;
        if (!(m5 instanceof Collection) || !m5.isEmpty()) {
            Iterator it = m5.iterator();
            while (it.hasNext()) {
                if ((!(((DT) it.next()).m instanceof WT)) && (i = i + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        return i;
    }

    public final WT j() {
        WT wt = this.c;
        if (wt == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
        }
        AbstractC1474fG.h(wt, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return wt;
    }

    public final TJ k() {
        return this.n == null ? TJ.n : this.q;
    }

    public final WT l(M5 m5) {
        TT tt;
        DT dt = (DT) m5.j();
        if (dt == null || (tt = dt.m) == null) {
            tt = this.c;
            AbstractC1474fG.g(tt);
        }
        if (tt instanceof WT) {
            return (WT) tt;
        }
        WT wt = tt.m;
        AbstractC1474fG.g(wt);
        return wt;
    }

    public final void m(DT dt, DT dt2) {
        this.j.put(dt, dt2);
        LinkedHashMap linkedHashMap = this.k;
        if (linkedHashMap.get(dt2) == null) {
            linkedHashMap.put(dt2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(dt2);
        AbstractC1474fG.g(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    public final void n(int i, Bundle bundle, C1098bU c1098bU) {
        int i2;
        M5 m5 = this.g;
        TT tt = m5.isEmpty() ? this.c : ((DT) m5.last()).m;
        if (tt == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
        C3430zT c3430zTE = tt.e(i);
        Bundle bundle2 = null;
        if (c3430zTE != null) {
            if (c1098bU == null) {
                c1098bU = c3430zTE.b;
            }
            Bundle bundle3 = c3430zTE.c;
            i2 = c3430zTE.a;
            if (bundle3 != null) {
                bundle2 = new Bundle();
                bundle2.putAll(bundle3);
            }
        } else {
            i2 = i;
        }
        if (bundle != null) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putAll(bundle);
        }
        if (i2 == 0 && c1098bU != null) {
            c1098bU.getClass();
            String str = c1098bU.j;
            int i3 = c1098bU.c;
            if (i3 != -1 || str != null) {
                boolean z = c1098bU.d;
                if (str != null) {
                    if (u(str, z, false)) {
                        c();
                        return;
                    }
                    return;
                } else {
                    if (i3 != -1) {
                        s(i3, z);
                        return;
                    }
                    return;
                }
            }
        }
        if (i2 == 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
        }
        TT ttE = e(i2);
        if (ttE != null) {
            o(ttE, bundle2, c1098bU);
            return;
        }
        int i4 = TT.v;
        Context context = this.a;
        String strM = AbstractC1923jt0.m(context, i2);
        if (c3430zTE == null) {
            throw new IllegalArgumentException("Navigation action/destination " + strM + " cannot be found from the current destination " + tt);
        }
        StringBuilder sbL = AbstractC1701hf0.l("Navigation destination ", strM, " referenced from action ");
        sbL.append(AbstractC1923jt0.m(context, i));
        sbL.append(" cannot be found from the current destination ");
        sbL.append(tt);
        throw new IllegalArgumentException(sbL.toString().toString());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    /* JADX WARN: Code duplicated, block: B:53:0x0105  */
    /* JADX WARN: Code duplicated, block: B:56:0x0110 A[LOOP:4: B:54:0x010a->B:56:0x0110, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x0169  */
    /* JADX WARN: Code duplicated, block: B:62:0x0175  */
    /* JADX WARN: Code duplicated, block: B:67:0x018c A[LOOP:6: B:65:0x0186->B:67:0x018c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:93:0x017e A[SYNTHETIC] */
    public final void o(TT tt, Bundle bundle, C1098bU c1098bU) {
        boolean z;
        LinkedHashMap linkedHashMap;
        boolean z2;
        boolean z3;
        int iNextIndex;
        TT tt2;
        M5<DT> m5;
        WT wt;
        boolean zT;
        LinkedHashMap linkedHashMap2 = this.v;
        Iterator it = linkedHashMap2.values().iterator();
        while (it.hasNext()) {
            ((FT) it.next()).d = true;
        }
        C2532q60 c2532q60 = new C2532q60();
        if (c1098bU != null) {
            String str = c1098bU.j;
            boolean z4 = c1098bU.e;
            boolean z5 = c1098bU.d;
            if (str != null) {
                zT = u(str, z5, z4);
            } else {
                c1098bU.getClass();
                c1098bU.getClass();
                int i = c1098bU.c;
                if (i != -1) {
                    zT = t(i, z5, z4);
                } else {
                    z = false;
                }
            }
            z = zT;
        } else {
            z = false;
        }
        Bundle bundleA = tt.a(bundle);
        if (c1098bU != null && c1098bU.b && this.l.containsKey(Integer.valueOf(tt.s))) {
            c2532q60.l = y(tt.s, bundleA, c1098bU);
            linkedHashMap = linkedHashMap2;
            z2 = z;
            z3 = false;
        } else {
            EU eu = this.u;
            if (c1098bU == null || !c1098bU.a) {
                linkedHashMap = linkedHashMap2;
                z2 = z;
                z3 = false;
            } else {
                M5 m6 = this.g;
                DT dt = (DT) m6.j();
                ListIterator listIterator = m6.listIterator(m6.a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((DT) listIterator.previous()).m == tt) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                if (iNextIndex == -1) {
                    linkedHashMap = linkedHashMap2;
                    z2 = z;
                    z3 = false;
                } else if (tt instanceof WT) {
                    int i2 = WT.A;
                    List listQ = Vb0.Q(Vb0.M(Vb0.K((WT) tt, C1182cH.A), C1182cH.w));
                    if (m6.n - iNextIndex == listQ.size()) {
                        List listSubList = m6.subList(iNextIndex, m6.n);
                        ArrayList arrayList = new ArrayList(AbstractC1016af.O(listSubList, 10));
                        Iterator it2 = listSubList.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Integer.valueOf(((DT) it2.next()).m.s));
                        }
                        if (AbstractC1474fG.b(arrayList, listQ)) {
                            m5 = new M5();
                            while (AbstractC0937Ze.J(m6) >= iNextIndex) {
                                DT dt2 = (DT) AbstractC1406ef.T(m6);
                                A(dt2);
                                DT dt3 = new DT(dt2.l, dt2.m, dt2.m.a(bundle), dt2.f214o, dt2.p, dt2.q, dt2.r);
                                dt3.f214o = dt2.f214o;
                                dt3.g(dt2.v);
                                m5.e(dt3);
                                iNextIndex = iNextIndex;
                                z = z;
                                linkedHashMap2 = linkedHashMap2;
                            }
                            linkedHashMap = linkedHashMap2;
                            z2 = z;
                            for (DT dt4 : m5) {
                                wt = dt4.m.m;
                                if (wt != null) {
                                    m(dt4, g(wt.s));
                                }
                                m6.f(dt4);
                            }
                            for (DT dt5 : m5) {
                                eu.b(dt5.m.l).f(dt5);
                            }
                            z3 = true;
                        }
                    }
                    linkedHashMap = linkedHashMap2;
                    z2 = z;
                    z3 = false;
                } else if (dt == null || (tt2 = dt.m) == null || tt.s != tt2.s) {
                    linkedHashMap = linkedHashMap2;
                    z2 = z;
                    z3 = false;
                } else {
                    m5 = new M5();
                    while (AbstractC0937Ze.J(m6) >= iNextIndex) {
                        DT dt6 = (DT) AbstractC1406ef.T(m6);
                        A(dt6);
                        DT dt7 = new DT(dt6.l, dt6.m, dt6.m.a(bundle), dt6.f214o, dt6.p, dt6.q, dt6.r);
                        dt7.f214o = dt6.f214o;
                        dt7.g(dt6.v);
                        m5.e(dt7);
                        iNextIndex = iNextIndex;
                        z = z;
                        linkedHashMap2 = linkedHashMap2;
                    }
                    linkedHashMap = linkedHashMap2;
                    z2 = z;
                    while (r2.hasNext()) {
                        wt = dt4.m.m;
                        if (wt != null) {
                            m(dt4, g(wt.s));
                        }
                        m6.f(dt4);
                    }
                    while (r0.hasNext()) {
                        eu.b(dt5.m.l).f(dt5);
                    }
                    z3 = true;
                }
            }
            if (!z3) {
                DT dtN = C2743sL.n(this.a, tt, bundleA, k(), this.f636o);
                DU duB = eu.b(tt.l);
                List listA = AbstractC2506pt.A(dtN);
                this.w = new KT(c2532q60, this, tt, bundleA, 0);
                duB.d(listA, c1098bU);
                this.w = null;
            }
        }
        C();
        Iterator it3 = linkedHashMap.values().iterator();
        while (it3.hasNext()) {
            ((FT) it3.next()).d = false;
        }
        if (z2 || c2532q60.l || z3) {
            c();
        } else {
            B();
        }
    }

    public final void p(UT ut) {
        n(ut.b(), ut.a(), null);
    }

    public final boolean q() {
        Intent intent;
        int i = 0;
        if (i() != 1) {
            return r();
        }
        Activity activity = this.b;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        if ((extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null) == null) {
            TT ttH = h();
            AbstractC1474fG.g(ttH);
            int i2 = ttH.s;
            for (WT wt = ttH.m; wt != null; wt = wt.m) {
                if (wt.x != i2) {
                    Bundle bundle = new Bundle();
                    if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", activity.getIntent());
                        WT wtL = l(this.g);
                        Intent intent2 = activity.getIntent();
                        AbstractC1474fG.i(intent2, "activity!!.intent");
                        RT rtL = wtL.l(new RN(intent2), true, wtL);
                        if ((rtL != null ? rtL.m : null) != null) {
                            bundle.putAll(rtL.l.a(rtL.m));
                        }
                    }
                    C2303no0 c2303no0 = new C2303no0(this);
                    int i3 = wt.s;
                    ArrayList arrayList = (ArrayList) c2303no0.p;
                    arrayList.clear();
                    arrayList.add(new QT(i3, null));
                    if (((WT) c2303no0.f941o) != null) {
                        c2303no0.p();
                    }
                    ((Intent) c2303no0.n).putExtra("android-support-nav:controller:deepLinkExtras", bundle);
                    c2303no0.d().d();
                    if (activity != null) {
                        activity.finish();
                    }
                    return true;
                }
                i2 = wt.s;
            }
            return false;
        }
        if (!this.f) {
            return false;
        }
        AbstractC1474fG.g(activity);
        Intent intent3 = activity.getIntent();
        Bundle extras2 = intent3.getExtras();
        AbstractC1474fG.g(extras2);
        int[] intArray = extras2.getIntArray("android-support-nav:controller:deepLinkIds");
        AbstractC1474fG.g(intArray);
        ArrayList arrayListA0 = X5.a0(intArray);
        ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
        int iIntValue = ((Number) AbstractC1406ef.T(arrayListA0)).intValue();
        if (parcelableArrayList != null) {
        }
        if (arrayListA0.isEmpty()) {
            return false;
        }
        TT ttF = f(iIntValue, j(), false);
        if (ttF instanceof WT) {
            int i4 = WT.A;
            iIntValue = Ou0.j((WT) ttF).s;
        }
        TT ttH2 = h();
        if (ttH2 == null || iIntValue != ttH2.s) {
            return false;
        }
        C2303no0 c2303no1 = new C2303no0(this);
        Bundle bundleC = AbstractC1474fG.c(new C1101bX("android-support-nav:controller:deepLinkIntent", intent3));
        Bundle bundle2 = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
        if (bundle2 != null) {
            bundleC.putAll(bundle2);
        }
        ((Intent) c2303no1.n).putExtra("android-support-nav:controller:deepLinkExtras", bundleC);
        for (Object obj : arrayListA0) {
            int i5 = i + 1;
            if (i < 0) {
                AbstractC0937Ze.N();
                throw null;
            }
            ((ArrayList) c2303no1.p).add(new QT(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i) : null));
            if (((WT) c2303no1.f941o) != null) {
                c2303no1.p();
            }
            i = i5;
        }
        c2303no1.d().d();
        activity.finish();
        return true;
    }

    public final boolean r() {
        if (this.g.isEmpty()) {
            return false;
        }
        TT ttH = h();
        AbstractC1474fG.g(ttH);
        return s(ttH.s, true);
    }

    public final boolean s(int i, boolean z) {
        return t(i, z, false) && c();
    }

    public final boolean t(int i, boolean z, boolean z2) {
        TT tt;
        M5 m5 = this.g;
        if (m5.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = AbstractC0911Ye.p0(m5).iterator();
        do {
            if (!it.hasNext()) {
                tt = null;
                break;
            }
            tt = ((DT) it.next()).m;
            DU duB = this.u.b(tt.l);
            if (z || tt.s != i) {
                arrayList.add(duB);
            }
        } while (tt.s != i);
        if (tt != null) {
            return d(arrayList, tt, z, z2);
        }
        int i2 = TT.v;
        AbstractC1923jt0.m(this.a, i);
        return false;
    }

    public final boolean u(String str, boolean z, boolean z2) {
        Object objPrevious;
        Object objA;
        Object objA2;
        boolean z3;
        M5 m5 = this.g;
        if (m5.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = m5.listIterator(m5.a());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            DT dt = (DT) objPrevious;
            TT tt = dt.m;
            Bundle bundleB = dt.b();
            tt.getClass();
            AbstractC1474fG.j(str, "route");
            if (AbstractC1474fG.b(tt.t, str)) {
                z3 = true;
            } else {
                RT rtG = tt.g(str);
                if (AbstractC1474fG.b(tt, rtG != null ? rtG.l : null)) {
                    if (bundleB != null) {
                        Bundle bundle = rtG.m;
                        if (bundle != null) {
                            Set<String> setKeySet = bundle.keySet();
                            AbstractC1474fG.i(setKeySet, "matchingArgs.keySet()");
                            Iterator<T> it = setKeySet.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    String str2 = (String) it.next();
                                    if (bundleB.containsKey(str2)) {
                                        CT ct = (CT) rtG.l.r.get(str2);
                                        AbstractC1976kU abstractC1976kU = ct != null ? ct.a : null;
                                        if (abstractC1976kU != null) {
                                            AbstractC1474fG.i(str2, "key");
                                            objA = abstractC1976kU.a(str2, bundle);
                                        } else {
                                            objA = null;
                                        }
                                        if (abstractC1976kU != null) {
                                            AbstractC1474fG.i(str2, "key");
                                            objA2 = abstractC1976kU.a(str2, bundleB);
                                        } else {
                                            objA2 = null;
                                        }
                                        if (abstractC1976kU == null || abstractC1976kU.g(objA, objA2)) {
                                        }
                                    }
                                } else {
                                    z3 = true;
                                }
                            }
                        }
                    } else {
                        rtG.getClass();
                    }
                }
                z3 = false;
            }
            if (z || !z3) {
                arrayList.add(this.u.b(dt.m.l));
            }
        } while (!z3);
        DT dt2 = (DT) objPrevious;
        TT tt2 = dt2 != null ? dt2.m : null;
        if (tt2 == null) {
            return false;
        }
        return d(arrayList, tt2, z, z2);
    }

    public final void v(DT dt, boolean z, M5 m5) {
        LT lt;
        C2917u50 c2917u50;
        Set set;
        M5 m6 = this.g;
        DT dt2 = (DT) m6.last();
        if (!AbstractC1474fG.b(dt2, dt)) {
            throw new IllegalStateException(("Attempted to pop " + dt.m + ", which is not the top of the back stack (" + dt2.m + ')').toString());
        }
        AbstractC1406ef.T(m6);
        FT ft = (FT) this.v.get(this.u.b(dt2.m.l));
        boolean z2 = true;
        if ((ft == null || (c2917u50 = ft.f) == null || (set = (Set) c2917u50.l.getValue()) == null || !set.contains(dt2)) && !this.k.containsKey(dt2)) {
            z2 = false;
        }
        TJ tj = dt2.s.d;
        TJ tj2 = TJ.n;
        if (tj.compareTo(tj2) >= 0) {
            if (z) {
                dt2.g(tj2);
                m5.e(new ET(dt2));
            }
            if (z2) {
                dt2.g(tj2);
            } else {
                dt2.g(TJ.l);
                A(dt2);
            }
        }
        if (z || z2 || (lt = this.f636o) == null) {
            return;
        }
        String str = dt2.q;
        AbstractC1474fG.j(str, "backStackEntryId");
        Zt0 zt0 = (Zt0) lt.b.remove(str);
        if (zt0 != null) {
            zt0.a();
        }
    }

    public final ArrayList x() {
        TJ tj;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.v.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            tj = TJ.f532o;
            if (!zHasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((FT) it.next()).f.l.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                DT dt = (DT) obj;
                if (!arrayList.contains(dt) && dt.v.compareTo(tj) < 0) {
                    arrayList2.add(obj);
                }
            }
            AbstractC1406ef.Q(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.g) {
            DT dt2 = (DT) obj2;
            if (!arrayList.contains(dt2) && dt2.v.compareTo(tj) >= 0) {
                arrayList3.add(obj2);
            }
        }
        AbstractC1406ef.Q(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!(((DT) obj3).m instanceof WT)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final boolean y(int i, Bundle bundle, C1098bU c1098bU) {
        TT ttJ;
        DT dt;
        TT tt;
        LinkedHashMap linkedHashMap = this.l;
        if (!linkedHashMap.containsKey(Integer.valueOf(i))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection collectionValues = linkedHashMap.values();
        AbstractC1474fG.j(collectionValues, "<this>");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (AbstractC1474fG.b((String) it.next(), str)) {
                it.remove();
            }
        }
        LinkedHashMap linkedHashMap2 = this.m;
        Jp0.b(linkedHashMap2);
        M5<ET> m5 = (M5) linkedHashMap2.remove(str);
        ArrayList arrayList = new ArrayList();
        DT dt2 = (DT) this.g.j();
        if (dt2 == null || (ttJ = dt2.m) == null) {
            ttJ = j();
        }
        if (m5 != null) {
            for (ET et : m5) {
                TT ttF = f(et.m, ttJ, true);
                Context context = this.a;
                if (ttF == null) {
                    int i2 = TT.v;
                    throw new IllegalStateException(("Restore State failed: destination " + AbstractC1923jt0.m(context, et.m) + " cannot be found from the current destination " + ttJ).toString());
                }
                arrayList.add(et.a(context, ttF, k(), this.f636o));
                ttJ = ttF;
            }
        }
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((DT) obj).m instanceof WT)) {
                arrayList3.add(obj);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (true) {
            String str2 = null;
            if (!it2.hasNext()) {
                break;
            }
            DT dt3 = (DT) it2.next();
            List list = (List) AbstractC0911Ye.j0(arrayList2);
            if (list != null && (dt = (DT) AbstractC0911Ye.i0(list)) != null && (tt = dt.m) != null) {
                str2 = tt.l;
            }
            if (AbstractC1474fG.b(str2, dt3.m.l)) {
                list.add(dt3);
            } else {
                arrayList2.add(AbstractC0937Ze.L(dt3));
            }
        }
        C2532q60 c2532q60 = new C2532q60();
        for (List list2 : arrayList2) {
            DU duB = this.u.b(((DT) AbstractC0911Ye.b0(list2)).m.l);
            this.w = new JT(c2532q60, arrayList, new C2628r60(), this, bundle, 0);
            duB.d(list2, c1098bU);
            this.w = null;
        }
        return c2532q60.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(WT wt, Bundle bundle) {
        Activity activity;
        Intent intent;
        int[] intArray;
        WT wtL;
        RT rtL;
        int[] iArr;
        WT wt2;
        String strM;
        WT wt3;
        TT ttK;
        WT wt4;
        Bundle bundle2;
        TT ttK2;
        WT wt5;
        ArrayList<String> stringArrayList;
        boolean zB = AbstractC1474fG.b(this.c, wt);
        M5<DT> m5 = this.g;
        if (zB) {
            C2866tf0 c2866tf0 = wt.w;
            int iH = c2866tf0.h();
            for (int i = 0; i < iH; i++) {
                TT tt = (TT) c2866tf0.j(i);
                WT wt6 = this.c;
                AbstractC1474fG.g(wt6);
                int iE = wt6.w.e(i);
                WT wt7 = this.c;
                AbstractC1474fG.g(wt7);
                C2866tf0 c2866tf1 = wt7.w;
                if (c2866tf1.l) {
                    Nr0.b(c2866tf1);
                }
                int iD = Nr0.d(c2866tf1.f1044o, iE, c2866tf1.m);
                if (iD >= 0) {
                    Object[] objArr = c2866tf1.n;
                    Object obj = objArr[iD];
                    objArr[iD] = tt;
                }
            }
            for (DT dt : m5) {
                int i2 = TT.v;
                TT tt2 = dt.m;
                AbstractC1474fG.j(tt2, "<this>");
                HN hn = new HN(Vb0.Q(Vb0.K(tt2, C1182cH.z)));
                TT ttK3 = this.c;
                AbstractC1474fG.g(ttK3);
                Iterator it = hn.iterator();
                while (true) {
                    ListIterator listIterator = ((C3311y80) it).l;
                    if (listIterator.hasPrevious()) {
                        TT tt3 = (TT) listIterator.previous();
                        if ((!AbstractC1474fG.b(tt3, this.c) || !AbstractC1474fG.b(ttK3, wt)) && (ttK3 instanceof WT)) {
                            WT wt8 = (WT) ttK3;
                            ttK3 = wt8.k(tt3.s, wt8, false);
                            AbstractC1474fG.g(ttK3);
                        }
                    }
                }
                AbstractC1474fG.j(ttK3, "<set-?>");
                dt.m = ttK3;
            }
            return;
        }
        WT wt9 = this.c;
        LinkedHashMap linkedHashMap = this.v;
        int i3 = 1;
        if (wt9 != null) {
            for (Integer num : new ArrayList(this.l.keySet())) {
                AbstractC1474fG.i(num, "id");
                int iIntValue = num.intValue();
                Iterator it2 = linkedHashMap.values().iterator();
                while (it2.hasNext()) {
                    ((FT) it2.next()).d = true;
                }
                C1195cU c1195cU = new C1195cU();
                c1195cU.c = true;
                boolean z = c1195cU.b;
                C1000aU c1000aU = c1195cU.a;
                c1000aU.a = z;
                c1000aU.b = c1195cU.c;
                int i4 = c1195cU.d;
                boolean z2 = c1195cU.e;
                c1000aU.c = i4;
                c1000aU.d = null;
                c1000aU.e = false;
                c1000aU.f = z2;
                boolean zY = y(iIntValue, null, c1000aU.a());
                Iterator it3 = linkedHashMap.values().iterator();
                while (it3.hasNext()) {
                    ((FT) it3.next()).d = false;
                }
                if (zY) {
                    t(iIntValue, true, false);
                }
            }
            t(wt9.s, true, false);
        }
        this.c = wt;
        Bundle bundle3 = this.d;
        EU eu = this.u;
        if (bundle3 != null && (stringArrayList = bundle3.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            for (String str : stringArrayList) {
                AbstractC1474fG.i(str, "name");
                DU duB = eu.b(str);
                Bundle bundle4 = bundle3.getBundle(str);
                if (bundle4 != null) {
                    duB.g(bundle4);
                }
            }
        }
        Parcelable[] parcelableArr = this.e;
        Context context = this.a;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                AbstractC1474fG.h(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                ET et = (ET) parcelable;
                int i5 = et.m;
                TT ttE = e(i5);
                if (ttE == null) {
                    int i6 = TT.v;
                    StringBuilder sbL = AbstractC1701hf0.l("Restoring the Navigation back stack failed: destination ", AbstractC1923jt0.m(context, i5), " cannot be found from the current destination ");
                    sbL.append(h());
                    throw new IllegalStateException(sbL.toString());
                }
                DT dtA = et.a(context, ttE, k(), this.f636o);
                DU duB2 = eu.b(ttE.l);
                Object ft = linkedHashMap.get(duB2);
                if (ft == null) {
                    ft = new FT(this, duB2);
                    linkedHashMap.put(duB2, ft);
                }
                m5.f(dtA);
                ((FT) ft).a(dtA);
                WT wt10 = dtA.m.m;
                if (wt10 != null) {
                    m(dtA, g(wt10.s));
                }
            }
            C();
            this.e = null;
        }
        Collection collectionValues = AbstractC3327yN.B(eu.a).values();
        ArrayList<DU> arrayList = new ArrayList();
        for (Object obj2 : collectionValues) {
            if (!((DU) obj2).b) {
                arrayList.add(obj2);
            }
        }
        for (DU du : arrayList) {
            Object ft2 = linkedHashMap.get(du);
            if (ft2 == null) {
                ft2 = new FT(this, du);
                linkedHashMap.put(du, ft2);
            }
            du.e((FT) ft2);
        }
        if (this.c == null || !m5.isEmpty()) {
            c();
            return;
        }
        if (!this.f && (activity = this.b) != null && (intent = activity.getIntent()) != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                try {
                    intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                } catch (Exception unused) {
                    intent.toString();
                    intArray = null;
                }
            } else {
                intArray = null;
            }
            ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
            Bundle bundle5 = new Bundle();
            Bundle bundle6 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
            if (bundle6 != null) {
                bundle5.putAll(bundle6);
            }
            if ((intArray == null || intArray.length == 0) && (rtL = (wtL = l(m5)).l(new RN(intent), true, wtL)) != null) {
                TT tt4 = rtL.l;
                int[] iArrD = tt4.d(null);
                Bundle bundleA = tt4.a(rtL.m);
                if (bundleA != null) {
                    bundle5.putAll(bundleA);
                }
                iArr = iArrD;
                parcelableArrayList = null;
            } else {
                iArr = intArray;
            }
            if (iArr != null && iArr.length != 0) {
                WT wt11 = this.c;
                int length = iArr.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        wt2 = wt11;
                        strM = null;
                        break;
                    }
                    int i8 = iArr[i7];
                    if (i7 == 0) {
                        WT wt12 = this.c;
                        AbstractC1474fG.g(wt12);
                        ttK2 = wt12.s == i8 ? this.c : null;
                    } else {
                        AbstractC1474fG.g(wt2);
                        ttK2 = wt2.k(i8, wt2, false);
                    }
                    if (ttK2 == null) {
                        wt2 = wt11;
                        wt2 = wt11;
                        wt2 = wt11;
                        int i9 = TT.v;
                        strM = AbstractC1923jt0.m(context, i8);
                        break;
                    }
                    wt2 = wt11;
                    wt2 = wt11;
                    if (i7 == iArr.length - 1 || !(ttK2 instanceof WT)) {
                        wt2 = wt11;
                    } else {
                        while (true) {
                            wt2 = wt11;
                            wt5 = (WT) ttK2;
                            AbstractC1474fG.g(wt5);
                            if (!(wt5.k(wt5.x, wt5, false) instanceof WT)) {
                                break;
                            } else {
                                ttK2 = wt5.k(wt5.x, wt5, false);
                            }
                        }
                        wt2 = wt5;
                    }
                    i7++;
                    wt2 = wt2;
                }
                if (strM == null) {
                    bundle5.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                    int length2 = iArr.length;
                    Bundle[] bundleArr = new Bundle[length2];
                    for (int i10 = 0; i10 < length2; i10++) {
                        Bundle bundle7 = new Bundle();
                        bundle7.putAll(bundle5);
                        if (parcelableArrayList != null && (bundle2 = (Bundle) parcelableArrayList.get(i10)) != null) {
                            bundle7.putAll(bundle2);
                        }
                        bundleArr[i10] = bundle7;
                    }
                    int flags = intent.getFlags();
                    int i11 = 268435456 & flags;
                    if (i11 != 0 && (flags & 32768) == 0) {
                        intent.addFlags(32768);
                        Ai0 ai0 = new Ai0(context);
                        ComponentName component = intent.getComponent();
                        if (component == null) {
                            component = intent.resolveActivity(ai0.m.getPackageManager());
                        }
                        if (component != null) {
                            ai0.a(component);
                        }
                        ai0.l.add(intent);
                        ai0.d();
                        activity.finish();
                        activity.overridePendingTransition(0, 0);
                        return;
                    }
                    if (i11 != 0) {
                        if (!m5.isEmpty()) {
                            WT wt13 = this.c;
                            AbstractC1474fG.g(wt13);
                            t(wt13.s, true, false);
                        }
                        int i12 = 0;
                        while (i12 < iArr.length) {
                            int i13 = iArr[i12];
                            int i14 = i12 + 1;
                            Bundle bundle8 = bundleArr[i12];
                            TT ttE2 = e(i13);
                            if (ttE2 == null) {
                                int i15 = TT.v;
                                StringBuilder sbL2 = AbstractC1701hf0.l("Deep Linking failed: destination ", AbstractC1923jt0.m(context, i13), " cannot be found from the current destination ");
                                sbL2.append(h());
                                throw new IllegalStateException(sbL2.toString());
                            }
                            o(ttE2, bundle8, UK.L(new io.sentry.android.replay.capture.e(ttE2, 6, this)));
                            i12 = i14;
                        }
                        this.f = true;
                        return;
                    }
                    WT wt14 = this.c;
                    int length3 = iArr.length;
                    int i16 = 0;
                    while (i16 < length3) {
                        int i17 = iArr[i16];
                        Bundle bundle9 = bundleArr[i16];
                        if (i16 == 0) {
                            ttK = this.c;
                        } else {
                            AbstractC1474fG.g(wt3);
                            ttK = wt3.k(i17, wt3, false);
                        }
                        if (ttK == null) {
                            wt3 = wt14;
                            wt3 = wt14;
                            int i18 = TT.v;
                            throw new IllegalStateException("Deep Linking failed: destination " + AbstractC1923jt0.m(context, i17) + " cannot be found in graph " + wt3);
                        }
                        wt3 = wt14;
                        if (i16 != iArr.length - i3) {
                            if (ttK instanceof WT) {
                                while (true) {
                                    wt3 = wt14;
                                    wt4 = (WT) ttK;
                                    AbstractC1474fG.g(wt4);
                                    if (!(wt4.k(wt4.x, wt4, false) instanceof WT)) {
                                        break;
                                    } else {
                                        ttK = wt4.k(wt4.x, wt4, false);
                                    }
                                }
                                length3 = length3;
                                wt3 = wt4;
                                i16 = i16;
                                bundleArr = bundleArr;
                                context = context;
                            } else {
                                wt3 = wt14;
                            }
                            i16++;
                            length3 = length3;
                            bundleArr = bundleArr;
                            context = context;
                            i3 = 1;
                            wt3 = wt3;
                        } else {
                            wt3 = wt14;
                            WT wt15 = this.c;
                            AbstractC1474fG.g(wt15);
                            o(ttK, bundle9, new C1098bU(false, false, wt15.s, i3, false, 0, 0, -1, -1));
                        }
                        i16++;
                        length3 = length3;
                        bundleArr = bundleArr;
                        context = context;
                        i3 = 1;
                        wt3 = wt3;
                    }
                    wt3 = wt14;
                    this.f = true;
                    return;
                }
                intent.toString();
            }
        }
        TT tt5 = this.c;
        AbstractC1474fG.g(tt5);
        o(tt5, bundle, null);
    }
}
