package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.Kv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0565Kv extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f371o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0565Kv(List list, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f371o = list;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C0565Kv) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C0565Kv c0565Kv = new C0565Kv(this.f371o, interfaceC0473Hh);
        c0565Kv.n = obj;
        return c0565Kv;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            InterfaceC1608gi interfaceC1608gi = (InterfaceC1608gi) this.n;
            List list = this.f371o;
            ArrayList arrayList = new ArrayList(AbstractC1016af.O(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC1376eG.c(interfaceC1608gi, AbstractC1910jn.b, 0, new C0539Jv((Ds0) it.next(), null), 2));
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
        ArrayList arrayListP = AbstractC1016af.P((Iterable) obj);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayListP) {
            if (hashSet.add(((Ds0) obj2).l)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }
}
