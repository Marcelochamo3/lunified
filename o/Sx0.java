package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Sx0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f522o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sx0(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = str;
        this.f522o = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Sx0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Sx0(this.n, this.f522o, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:32:0x0076  */
    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c3 A[LOOP:0: B:44:0x00bd->B:46:0x00c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x006e A[EDGE_INSN: B:51:0x006e->B:28:0x006e BREAK  A[LOOP:1: B:20:0x004a->B:53:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0081 A[SYNTHETIC] */
    @Override // o.R7
    public final Object r(Object obj) {
        Mx0 mx0;
        String str;
        Iterator it;
        Object next;
        List list;
        ArrayList arrayList;
        Iterator it2;
        List list2;
        Ox0 ox0;
        Nx0 nx0;
        int i;
        ArrayList arrayList2;
        Iterator it3;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = this.m;
        if (i2 != 0) {
            if (i2 == 1) {
                Jp0.O(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
            }
            mx0 = (Mx0) obj;
            str = this.n;
            if (AbstractC1474fG.b(str, "Todos los canales")) {
                list2 = mx0.b;
            } else {
                it = mx0.a.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    nx0 = (Nx0) next;
                    if (!AbstractC1899jh0.N(nx0.b, str, true)) {
                        break;
                    }
                } while (!AbstractC1474fG.b(String.valueOf(nx0.a), str));
                Nx0 nx1 = (Nx0) next;
                list = nx1 != null ? nx1.c : null;
                if (list == null) {
                    list = C1233cq.l;
                }
                arrayList = new ArrayList();
                it2 = list.iterator();
                while (it2.hasNext()) {
                    ox0 = (Ox0) mx0.c.get((String) it2.next());
                    if (ox0 != null) {
                        arrayList.add(ox0);
                    }
                }
                list2 = arrayList;
            }
            i = this.f522o;
            if (i < 1) {
                i = 1;
            }
            List listS0 = AbstractC0911Ye.s0(100, AbstractC0911Ye.Y((i - 1) * 100, list2));
            arrayList2 = new ArrayList(AbstractC1016af.O(listS0, 10));
            it3 = listS0.iterator();
            while (it3.hasNext()) {
                arrayList2.add(C1152by0.r((Ox0) it3.next()));
            }
            return new C2420oz(str, str, arrayList2);
        }
        Jp0.O(obj);
        Lx0 lx0 = Lx0.b;
        this.m = 1;
        if (lx0.A(this) == enumC1706hi) {
            return enumC1706hi;
        }
        C1152by0 c1152by0 = C1152by0.b;
        this.m = 2;
        obj = C1152by0.q(c1152by0, this);
        if (obj == enumC1706hi) {
            return enumC1706hi;
        }
        mx0 = (Mx0) obj;
        str = this.n;
        if (AbstractC1474fG.b(str, "Todos los canales")) {
            list2 = mx0.b;
        } else {
            it = mx0.a.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                nx0 = (Nx0) next;
                if (!AbstractC1899jh0.N(nx0.b, str, true)) {
                    break;
                    break;
                }
            } while (!AbstractC1474fG.b(String.valueOf(nx0.a), str));
            Nx0 nx2 = (Nx0) next;
            if (nx2 != null) {
            }
            if (list == null) {
                list = C1233cq.l;
            }
            arrayList = new ArrayList();
            it2 = list.iterator();
            while (it2.hasNext()) {
                ox0 = (Ox0) mx0.c.get((String) it2.next());
                if (ox0 != null) {
                    arrayList.add(ox0);
                }
            }
            list2 = arrayList;
        }
        i = this.f522o;
        if (i < 1) {
            i = 1;
        }
        List listS1 = AbstractC0911Ye.s0(100, AbstractC0911Ye.Y((i - 1) * 100, list2));
        arrayList2 = new ArrayList(AbstractC1016af.O(listS1, 10));
        it3 = listS1.iterator();
        while (it3.hasNext()) {
            arrayList2.add(C1152by0.r((Ox0) it3.next()));
        }
        return new C2420oz(str, str, arrayList2);
    }
}
