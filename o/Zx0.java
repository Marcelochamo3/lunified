package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Zx0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f667o;
    public final /* synthetic */ Jb0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zx0(List list, Jb0 jb0, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f667o = list;
        this.p = jb0;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Zx0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        Zx0 zx0 = new Zx0(this.f667o, this.p, interfaceC0473Hh);
        zx0.n = obj;
        return zx0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            InterfaceC1608gi interfaceC1608gi = (InterfaceC1608gi) this.n;
            List list = this.f667o;
            ArrayList arrayList = new ArrayList(AbstractC1016af.O(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC1376eG.c(interfaceC1608gi, AbstractC1910jn.b, 0, new Yx0(null, this.p, (JSONObject) it.next()), 2));
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
        return AbstractC0911Ye.Z((Iterable) obj);
    }
}
