package o;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Ex0 extends Ph0 implements InterfaceC0775Sy {
    public /* synthetic */ Object m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ex0(String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Ex0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        Ex0 ex0 = new Ex0(this.n, interfaceC0473Hh);
        ex0.m = obj;
        return ex0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [o.p80] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    @Override // o.R7
    public final Object r(Object obj) {
        ?? K;
        Jp0.O(obj);
        String str = this.n;
        try {
            Lx0 lx0 = Lx0.b;
            ArrayList arrayListV = Lx0.v(str, "0");
            K = new ArrayList();
            Iterator it = arrayListV.iterator();
            while (it.hasNext()) {
                Cd0 cd0S = Lx0.S((JSONObject) it.next());
                if (cd0S != null) {
                    K.add(cd0S);
                }
            }
        } catch (Throwable th) {
            K = Jp0.k(th);
        }
        return K instanceof C2439p80 ? C1233cq.l : K;
    }
}
