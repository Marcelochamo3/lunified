package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Ia0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f324o;
    public final /* synthetic */ String p;
    public final /* synthetic */ VS q;
    public final /* synthetic */ List r;
    public final /* synthetic */ La0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ia0(List list, String str, VS vs, List list2, La0 la0, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f324o = list;
        this.p = str;
        this.q = vs;
        this.r = list2;
        this.s = la0;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Ia0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        Ia0 ia0 = new Ia0(this.f324o, this.p, this.q, this.r, this.s, interfaceC0473Hh);
        ia0.n = obj;
        return ia0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            InterfaceC1608gi interfaceC1608gi = (InterfaceC1608gi) this.n;
            List list = this.f324o;
            ArrayList arrayList = new ArrayList(AbstractC1016af.O(list, 10));
            Iterator it = list.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC0937Ze.N();
                    throw null;
                }
                arrayList.add(AbstractC1376eG.w(interfaceC1608gi, null, 0, new Ha0((Q30) next, this.p, this.q, this.r, i2, this.s, null), 3));
                it = it;
                i2 = i3;
            }
            this.m = 1;
            if (AbstractC1370eA.E(arrayList, this) == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        return C2985uq0.a;
    }
}
