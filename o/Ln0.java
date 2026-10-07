package o;

import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Ln0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Ln0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        Ln0 ln0 = new Ln0(2, interfaceC0473Hh);
        ln0.n = obj;
        return ln0;
    }

    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        InterfaceC1608gi interfaceC1608gi;
        Iterable<JSONObject> iterable;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i != 0) {
            if (i == 1) {
                interfaceC1608gi = (InterfaceC1608gi) this.n;
                Jp0.O(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
            }
            return AbstractC0911Ye.Z((Iterable) obj);
        }
        Jp0.O(obj);
        interfaceC1608gi = (InterfaceC1608gi) this.n;
        ExecutorC0891Xk executorC0891Xk = AbstractC1910jn.b;
        Kn0 kn0 = new Kn0(2, null);
        this.n = interfaceC1608gi;
        this.m = 1;
        obj = AbstractC1376eG.J(executorC0891Xk, kn0, this);
        if (obj == enumC1706hi) {
            return enumC1706hi;
        }
        JSONArray jSONArrayOptJSONArray = ((JSONObject) obj).optJSONArray("movie_genres");
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
        ArrayList<C1101bX> arrayList2 = new ArrayList();
        for (JSONObject jSONObject : iterable) {
            String strJ = AbstractC1701hf0.j(jSONObject, "slug", "optString(...)");
            String strJ2 = AbstractC1701hf0.j(jSONObject, "label", "optString(...)");
            C1101bX c1101bX = (strJ.length() == 0 || strJ2.length() == 0) ? null : new C1101bX(strJ, strJ2);
            if (c1101bX != null) {
                arrayList2.add(c1101bX);
            }
        }
        if (arrayList2.isEmpty()) {
            throw new IOException("El catálogo no devolvió géneros válidos");
        }
        ArrayList arrayList3 = new ArrayList(AbstractC1016af.O(arrayList2, 10));
        for (C1101bX c1101bX2 : arrayList2) {
            arrayList3.add(AbstractC1376eG.c(interfaceC1608gi, AbstractC1910jn.b, 0, new Jn0((String) c1101bX2.l, (String) c1101bX2.m, null), 2));
        }
        this.n = null;
        this.m = 2;
        obj = AbstractC1370eA.b(arrayList3, this);
        if (obj == enumC1706hi) {
            return enumC1706hi;
        }
        return AbstractC0911Ye.Z((Iterable) obj);
    }
}
