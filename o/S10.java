package o;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class S10 extends Ph0 implements InterfaceC0775Sy {
    public Q30 m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z10 f501o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S10(Z10 z10, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f501o = z10;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((S10) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new S10(this.f501o, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Object next;
        Q30 q30;
        Q30 q31;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        if (i == 0) {
            Jp0.O(obj);
            String strB = Cr0.m.b();
            if (AbstractC1474fG.b(strB, "PPV.TO")) {
                q30 = QW.b;
            } else {
                Q30.a.getClass();
                Iterator it = P30.b.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!AbstractC1474fG.b(((Q30) next).getName(), strB));
                Q30 q32 = (Q30) next;
                if (q32 == null) {
                    q32 = C1816io0.b;
                }
                q30 = q32;
            }
            O9 o9 = O9.x;
            this.m = q30;
            this.n = 1;
            if (o9.D(this) == enumC1706hi) {
                return enumC1706hi;
            }
            q31 = q30;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q31 = this.m;
            Jp0.O(obj);
        }
        boolean z = q31 instanceof C1816io0;
        Z10 z10 = this.f501o;
        if (z) {
            String str = z10.c;
            ((C1816io0) q31).getClass();
            AbstractC1474fG.j(str, "currentId");
            if (AbstractC1899jh0.U(str, "fctvevent-", false)) {
                return C2379oe.b.t(str);
            }
            for (List list : C1816io0.e.values()) {
                AbstractC1474fG.g(list);
                Iterator it2 = list.iterator();
                int i2 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (AbstractC1474fG.b(((C1387eR) it2.next()).a, str)) {
                        break;
                    }
                    i2++;
                }
                if (i2 != -1) {
                    int size = i2 - 1;
                    if (size < 0) {
                        size = list.size() - 1;
                    }
                    return (C1387eR) list.get(size);
                }
            }
            return null;
        }
        if (q31 instanceof C2379oe) {
            return ((C2379oe) q31).t(z10.c);
        }
        if (!(q31 instanceof H5)) {
            return null;
        }
        String str2 = z10.c;
        ((H5) q31).getClass();
        AbstractC1474fG.j(str2, "currentId");
        for (List list2 : H5.j.values()) {
            Iterator it3 = list2.iterator();
            int i3 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (AbstractC1474fG.b(((C1387eR) it3.next()).a, str2)) {
                    break;
                }
                i3++;
            }
            if (i3 != -1) {
                int size2 = i3 - 1;
                if (size2 < 0) {
                    size2 = list2.size() - 1;
                }
                return (C1387eR) list2.get(size2);
            }
        }
        return null;
    }
}
