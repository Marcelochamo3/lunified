package o;

import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.Rd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0728Rd extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C0728Rd) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C0728Rd c0728Rd = new C0728Rd(2, interfaceC0473Hh);
        c0728Rd.n = obj;
        return c0728Rd;
    }

    @Override // o.R7
    public final Object r(Object obj) throws JSONException {
        Object objK;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            InterfaceC1608gi interfaceC1608gi = (InterfaceC1608gi) this.n;
            String str = W8.a;
            this.n = interfaceC1608gi;
            this.m = 1;
            if (W8.b(this) == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        try {
            String str2 = C0754Sd.a;
            C0754Sd.f = new JSONObject(C0754Sd.a(C0754Sd.a));
            objK = C2985uq0.a;
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        C2536q80.a(objK);
        JSONObject jSONObject = new JSONObject(C0754Sd.a(C0754Sd.b));
        String str3 = W8.a;
        String string = jSONObject.getString("iv");
        AbstractC1474fG.i(string, "getString(...)");
        String string2 = jSONObject.getString("tag");
        AbstractC1474fG.i(string2, "getString(...)");
        String string3 = jSONObject.getString("data");
        AbstractC1474fG.i(string3, "getString(...)");
        JSONObject jSONObject2 = new JSONObject(W8.a(string, string2, string3));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject2.keys();
        AbstractC1474fG.i(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            AbstractC1474fG.g(next);
            String string4 = jSONObject2.getString(next);
            AbstractC1474fG.i(string4, "getString(...)");
            linkedHashMap.put(next, string4);
        }
        C0754Sd.g = linkedHashMap;
        return new Integer(Log.d("ClaroAndinaConfig", "ClaroAndina config lista: region=" + C0754Sd.g.get("region")));
    }
}
