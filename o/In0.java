package o;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class In0 extends Ph0 implements InterfaceC0775Sy {
    public /* synthetic */ Object m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public In0(int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((In0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        In0 in0 = new In0(this.n, interfaceC0473Hh);
        in0.m = obj;
        return in0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Iterable] */
    @Override // o.R7
    public final Object r(Object obj) {
        ?? arrayList;
        Object objK;
        C1233cq c1233cq = C1233cq.l;
        Jp0.O(obj);
        try {
            C1816io0 c1816io0 = C1816io0.b;
            JSONArray jSONArrayOptJSONArray = C1816io0.x("/pages/movies/all/" + this.n + ".json").optJSONArray("data");
            if (jSONArrayOptJSONArray == null) {
                arrayList = c1233cq;
            } else {
                ZF zfL = U9.L(0, jSONArrayOptJSONArray.length());
                arrayList = new ArrayList();
                YF it = zfL.iterator();
                while (it.n) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(it.a());
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(jSONObjectOptJSONObject);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    objK = C1816io0.s((JSONObject) it2.next());
                } catch (Throwable th) {
                    objK = Jp0.k(th);
                }
                if (objK instanceof C2439p80) {
                    objK = null;
                }
                C1387eR c1387eR = (C1387eR) objK;
                if (c1387eR != null) {
                    arrayList2.add(c1387eR);
                }
            }
            return arrayList2;
        } catch (Exception unused) {
            return c1233cq;
        }
    }
}
