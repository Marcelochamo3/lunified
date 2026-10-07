package o;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class FT {
    public final ReentrantLock a;
    public final C2771sg0 b;
    public final C2771sg0 c;
    public boolean d;
    public final C2917u50 e;
    public final C2917u50 f;
    public final DU g;
    public final /* synthetic */ YT h;

    public FT(YT yt, DU du) {
        AbstractC1474fG.j(du, "navigator");
        this.h = yt;
        this.a = new ReentrantLock(true);
        C2771sg0 c2771sg0 = new C2771sg0(C1233cq.l);
        this.b = c2771sg0;
        C2771sg0 c2771sg1 = new C2771sg0(C1722hq.l);
        this.c = c2771sg1;
        this.e = new C2917u50(c2771sg0);
        this.f = new C2917u50(c2771sg1);
        this.g = du;
    }

    public final void a(DT dt) {
        AbstractC1474fG.j(dt, "backStackEntry");
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            C2771sg0 c2771sg0 = this.b;
            c2771sg0.f(AbstractC0911Ye.n0((Collection) c2771sg0.getValue(), dt));
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00af  */
    public final void b(DT dt) {
        LT lt;
        Zt0 zt0;
        AbstractC1474fG.j(dt, "entry");
        YT yt = this.h;
        boolean zB = AbstractC1474fG.b(yt.y.get(dt), Boolean.TRUE);
        C2771sg0 c2771sg0 = this.c;
        Set set = (Set) c2771sg0.getValue();
        AbstractC1474fG.j(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC3327yN.x(set.size()));
        boolean z = false;
        for (Object obj : set) {
            boolean z2 = true;
            if (!z && AbstractC1474fG.b(obj, dt)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj);
            }
        }
        c2771sg0.f(linkedHashSet);
        yt.y.remove(dt);
        M5 m5 = yt.g;
        boolean zContains = m5.contains(dt);
        C2771sg0 c2771sg1 = yt.i;
        if (zContains) {
            if (this.d) {
                return;
            }
            yt.B();
            yt.h.f(AbstractC0911Ye.y0(m5));
            c2771sg1.f(yt.x());
            return;
        }
        yt.A(dt);
        if (dt.s.d.compareTo(TJ.n) >= 0) {
            dt.g(TJ.l);
        }
        boolean z3 = m5 instanceof Collection;
        String str = dt.q;
        if (!z3 || !m5.isEmpty()) {
            Iterator it = m5.iterator();
            while (it.hasNext()) {
                if (AbstractC1474fG.b(((DT) it.next()).q, str)) {
                }
            }
            if (!zB && (lt = yt.f636o) != null) {
                AbstractC1474fG.j(str, "backStackEntryId");
                zt0 = (Zt0) lt.b.remove(str);
                if (zt0 != null) {
                    zt0.a();
                }
            }
        } else if (!zB) {
            AbstractC1474fG.j(str, "backStackEntryId");
            zt0 = (Zt0) lt.b.remove(str);
            if (zt0 != null) {
                zt0.a();
            }
        }
        yt.B();
        c2771sg1.f(yt.x());
    }

    public final void c(DT dt) {
        int iNextIndex;
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            ArrayList arrayListY0 = AbstractC0911Ye.y0((Collection) this.e.l.getValue());
            ListIterator listIterator = arrayListY0.listIterator(arrayListY0.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (AbstractC1474fG.b(((DT) listIterator.previous()).q, dt.q)) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            arrayListY0.set(iNextIndex, dt);
            this.b.f(arrayListY0);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(DT dt, boolean z) {
        AbstractC1474fG.j(dt, "popUpTo");
        YT yt = this.h;
        DU duB = yt.u.b(dt.m.l);
        yt.y.put(dt, Boolean.valueOf(z));
        if (!AbstractC1474fG.b(duB, this.g)) {
            Object obj = yt.v.get(duB);
            AbstractC1474fG.g(obj);
            ((FT) obj).d(dt, z);
            return;
        }
        InterfaceC0412Ey interfaceC0412Ey = yt.x;
        if (interfaceC0412Ey != null) {
            interfaceC0412Ey.b(dt);
            e(dt);
            return;
        }
        M5 m5 = yt.g;
        int iIndexOf = m5.indexOf(dt);
        if (iIndexOf < 0) {
            dt.toString();
            return;
        }
        int i = iIndexOf + 1;
        if (i != m5.n) {
            yt.t(((DT) m5.get(i)).m.s, true, false);
        }
        YT.w(yt, dt);
        e(dt);
        yt.C();
        yt.c();
    }

    public final void e(DT dt) {
        AbstractC1474fG.j(dt, "popUpTo");
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            C2771sg0 c2771sg0 = this.b;
            Iterable iterable = (Iterable) c2771sg0.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (!(!AbstractC1474fG.b((DT) obj, dt))) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            c2771sg0.f(arrayList);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void f(DT dt, boolean z) {
        Object objPrevious;
        AbstractC1474fG.j(dt, "popUpTo");
        C2771sg0 c2771sg0 = this.c;
        Iterable iterable = (Iterable) c2771sg0.getValue();
        boolean z2 = iterable instanceof Collection;
        C2917u50 c2917u50 = this.e;
        if (!z2 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((DT) it.next()) == dt) {
                    Iterable iterable2 = (Iterable) c2917u50.l.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((DT) it2.next()) == dt) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        c2771sg0.f(Lc0.S((Set) c2771sg0.getValue(), dt));
        List list = (List) c2917u50.l.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            DT dt2 = (DT) objPrevious;
            if (!AbstractC1474fG.b(dt2, dt)) {
                InterfaceC2578qg0 interfaceC2578qg0 = c2917u50.l;
                if (((List) interfaceC2578qg0.getValue()).lastIndexOf(dt2) < ((List) interfaceC2578qg0.getValue()).lastIndexOf(dt)) {
                    break;
                }
            }
        }
        DT dt3 = (DT) objPrevious;
        if (dt3 != null) {
            c2771sg0.f(Lc0.S((Set) c2771sg0.getValue(), dt3));
        }
        d(dt, z);
    }

    public final void g(DT dt) {
        AbstractC1474fG.j(dt, "backStackEntry");
        YT yt = this.h;
        DU duB = yt.u.b(dt.m.l);
        if (!AbstractC1474fG.b(duB, this.g)) {
            Object obj = yt.v.get(duB);
            if (obj == null) {
                throw new IllegalStateException(AbstractC1701hf0.h(new StringBuilder("NavigatorBackStack for "), dt.m.l, " should already be created").toString());
            }
            ((FT) obj).g(dt);
            return;
        }
        InterfaceC0412Ey interfaceC0412Ey = yt.w;
        if (interfaceC0412Ey == null) {
            Objects.toString(dt.m);
        } else {
            interfaceC0412Ey.b(dt);
            a(dt);
        }
    }

    public final void h(DT dt) {
        C2771sg0 c2771sg0 = this.c;
        Iterable iterable = (Iterable) c2771sg0.getValue();
        boolean z = iterable instanceof Collection;
        C2917u50 c2917u50 = this.e;
        if (!z || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((DT) it.next()) == dt) {
                    Iterable iterable2 = (Iterable) c2917u50.l.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((DT) it2.next()) == dt) {
                                return;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        DT dt2 = (DT) AbstractC0911Ye.j0((List) c2917u50.l.getValue());
        if (dt2 != null) {
            c2771sg0.f(Lc0.S((Set) c2771sg0.getValue(), dt2));
        }
        c2771sg0.f(Lc0.S((Set) c2771sg0.getValue(), dt));
        g(dt);
    }
}
