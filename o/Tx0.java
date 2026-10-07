package o;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Tx0 extends Ph0 implements InterfaceC0775Sy {
    public long m;
    public int n;

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Tx0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Tx0(2, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0055  */
    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x009b A[LOOP:2: B:26:0x0095->B:28:0x009b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0066 A[SYNTHETIC] */
    @Override // o.R7
    public final Object r(Object obj) {
        long jElapsedRealtime;
        Mx0 mx0;
        C3421zK c3421zK;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        Iterator it2;
        Ox0 ox0;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        if (i != 0) {
            if (i == 1) {
                jElapsedRealtime = this.m;
                Jp0.O(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
            }
            mx0 = (Mx0) obj;
            c3421zK = new C3421zK();
            for (Nx0 nx0 : mx0.a) {
                List list = nx0.c;
                arrayList = new ArrayList();
                it = list.iterator();
                while (it.hasNext()) {
                    ox0 = (Ox0) mx0.c.get((String) it.next());
                    if (ox0 != null) {
                        arrayList.add(ox0);
                    }
                }
                List listS0 = AbstractC0911Ye.s0(30, arrayList);
                arrayList2 = new ArrayList(AbstractC1016af.O(listS0, 10));
                it2 = listS0.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(C1152by0.r((Ox0) it2.next()));
                }
                if (!arrayList2.isEmpty()) {
                    c3421zK.add(new C0882Xb(nx0.b, arrayList2));
                }
            }
            C3421zK c3421zKH = AbstractC2506pt.h(c3421zK);
            SystemClock.elapsedRealtime();
            c3421zKH.a();
            return c3421zKH;
        }
        Jp0.O(obj);
        jElapsedRealtime = SystemClock.elapsedRealtime();
        Lx0 lx0 = Lx0.b;
        this.m = jElapsedRealtime;
        this.n = 1;
        if (lx0.A(this) == enumC1706hi) {
            return enumC1706hi;
        }
        SystemClock.elapsedRealtime();
        C1152by0 c1152by0 = C1152by0.b;
        this.m = jElapsedRealtime;
        this.n = 2;
        obj = C1152by0.q(c1152by0, this);
        if (obj == enumC1706hi) {
            return enumC1706hi;
        }
        mx0 = (Mx0) obj;
        c3421zK = new C3421zK();
        while (r1.hasNext()) {
            List list2 = nx0.c;
            arrayList = new ArrayList();
            it = list2.iterator();
            while (it.hasNext()) {
                ox0 = (Ox0) mx0.c.get((String) it.next());
                if (ox0 != null) {
                    arrayList.add(ox0);
                }
            }
            List listS1 = AbstractC0911Ye.s0(30, arrayList);
            arrayList2 = new ArrayList(AbstractC1016af.O(listS1, 10));
            it2 = listS1.iterator();
            while (it2.hasNext()) {
                arrayList2.add(C1152by0.r((Ox0) it2.next()));
            }
            if (!arrayList2.isEmpty()) {
                c3421zK.add(new C0882Xb(nx0.b, arrayList2));
            }
        }
        C3421zK c3421zKH2 = AbstractC2506pt.h(c3421zK);
        SystemClock.elapsedRealtime();
        c3421zKH2.a();
        return c3421zKH2;
    }
}
