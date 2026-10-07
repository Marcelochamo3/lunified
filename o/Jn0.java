package o;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Jn0 extends Ph0 implements InterfaceC0775Sy {
    public /* synthetic */ Object m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f350o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jn0(String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = str;
        this.f350o = str2;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Jn0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        Jn0 jn0 = new Jn0(this.n, this.f350o, interfaceC0473Hh);
        jn0.m = obj;
        return jn0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Object objK;
        Iterable iterable;
        Object objK2;
        Jp0.O(obj);
        String str = this.n;
        String str2 = this.f350o;
        try {
            C1816io0 c1816io0 = C1816io0.b;
            JSONArray jSONArrayOptJSONArray = C1816io0.x("/pages/movies/" + str + "/1.json").optJSONArray("data");
            if (jSONArrayOptJSONArray == null) {
                iterable = C1233cq.l;
            } else {
                ZF zfL = U9.L(0, jSONArrayOptJSONArray.length());
                ArrayList arrayList = new ArrayList();
                YF it = zfL.iterator();
                while (it.n) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(it.a());
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(jSONObjectOptJSONObject);
                    }
                }
                iterable = arrayList;
            }
            ArrayList<C1387eR> arrayList2 = new ArrayList();
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                try {
                    objK2 = C1816io0.s((JSONObject) it2.next());
                } catch (Throwable th) {
                    objK2 = Jp0.k(th);
                }
                if (objK2 instanceof C2439p80) {
                    objK2 = null;
                }
                C1387eR c1387eR = (C1387eR) objK2;
                if (c1387eR != null) {
                    arrayList2.add(c1387eR);
                }
            }
            if (arrayList2.isEmpty()) {
                objK = null;
            } else {
                ArrayList arrayList3 = new ArrayList(AbstractC1016af.O(arrayList2, 10));
                for (C1387eR c1387eR2 : arrayList2) {
                    AbstractC1474fG.h(c1387eR2, "null cannot be cast to non-null type com.skidush.clonex.adapters.AppAdapter.Item");
                    arrayList3.add(c1387eR2);
                }
                objK = new C0882Xb(str2, arrayList3);
            }
        } catch (Throwable th2) {
            objK = Jp0.k(th2);
        }
        if (objK instanceof C2439p80) {
            return null;
        }
        return objK;
    }
}
