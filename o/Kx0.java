package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Kx0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f372o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kx0(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = str;
        this.f372o = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Kx0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Kx0(this.n, this.f372o, interfaceC0473Hh);
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
        String str = this.n;
        boolean zO = AbstractC1899jh0.O(str);
        int i2 = this.f372o;
        if (zO) {
            return i2 == 1 ? Lx0.t() : C1233cq.l;
        }
        Lx0 lx1 = Lx0.b;
        List listS = Lx0.s(i2, str);
        ArrayList arrayList = new ArrayList();
        Iterator it = listS.iterator();
        while (it.hasNext()) {
            Cd0 cd0S = Lx0.S((JSONObject) it.next());
            if (cd0S != null) {
                arrayList.add(cd0S);
            }
        }
        return arrayList;
    }
}
