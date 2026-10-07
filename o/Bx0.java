package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Bx0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bx0(int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Bx0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Bx0(this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws JSONException {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            Lx0 lx0 = Lx0.b;
            this.m = 1;
            if (lx0.A(this) == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        Lx0 lx1 = Lx0.b;
        List listP = Lx0.p(this.n, "movies");
        ArrayList arrayList = new ArrayList();
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            C1387eR c1387eRU = Lx0.U((JSONObject) it.next());
            if (c1387eRU != null) {
                arrayList.add(c1387eRU);
            }
        }
        return arrayList;
    }
}
