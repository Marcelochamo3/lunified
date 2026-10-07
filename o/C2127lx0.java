package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.lx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2127lx0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f905o;
    public final /* synthetic */ Jb0 p;
    public final /* synthetic */ C1737hx0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2127lx0(List list, InterfaceC0473Hh interfaceC0473Hh, Jb0 jb0, C1737hx0 c1737hx0) {
        super(2, interfaceC0473Hh);
        this.f905o = list;
        this.p = jb0;
        this.q = c1737hx0;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2127lx0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C2127lx0 c2127lx0 = new C2127lx0(this.f905o, interfaceC0473Hh, this.p, this.q);
        c2127lx0.n = obj;
        return c2127lx0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            InterfaceC1608gi interfaceC1608gi = (InterfaceC1608gi) this.n;
            List list = this.f905o;
            ArrayList arrayList = new ArrayList(AbstractC1016af.O(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC1376eG.c(interfaceC1608gi, AbstractC1910jn.b, 0, new C2029kx0((List) it.next(), null, this.p, this.q), 2));
            }
            this.m = 1;
            obj = AbstractC1370eA.b(arrayList, this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        return AbstractC1016af.P((Iterable) obj);
    }
}
