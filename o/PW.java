package o;

import j$.util.Map;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class PW extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PW(String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = str;
    }

    public static final void w(LinkedHashMap linkedHashMap, JSONObject jSONObject, String str) {
        String strJ = AbstractC1701hf0.j(jSONObject, "data", "optString(...)");
        String str2 = null;
        if (strJ.length() <= 0) {
            strJ = null;
        }
        if (strJ == null) {
            return;
        }
        String strJ2 = AbstractC1701hf0.j(jSONObject, "name", "optString(...)");
        String str3 = (str == null || !(AbstractC1899jh0.O(str) ^ true)) ? null : str;
        if ((!AbstractC1899jh0.O(strJ2)) && !AbstractC1899jh0.N(strJ2, str, true) && !AbstractC1899jh0.N(strJ2, "main", true)) {
            str2 = strJ2;
        }
        String strH0 = AbstractC0911Ye.h0(X5.P(new String[]{str3, str2}), " · ", null, null, null, 62);
        if (AbstractC1899jh0.O(strH0)) {
            strH0 = "Principal";
        }
        Map.EL.putIfAbsent(linkedHashMap, strJ, new Ds0(strJ, strH0, null, null, 60));
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((PW) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new PW(this.m, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Jp0.O(obj);
        String str = this.m;
        if (!AbstractC1899jh0.U(str, "ppv-", false)) {
            return C1233cq.l;
        }
        String str2 = (String) QW.j.get(str);
        if (str2 == null) {
            return QW.p(str);
        }
        try {
            JSONObject jSONObject = new JSONObject(QW.q("streams/".concat(str2)));
            if (!jSONObject.optBoolean("success", false)) {
                return QW.p(str);
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("sources");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i);
                AbstractC1474fG.i(jSONObject3, "getJSONObject(...)");
                w(linkedHashMap, jSONObject3, null);
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("substreams");
            if (jSONArrayOptJSONArray2 == null) {
                jSONArrayOptJSONArray2 = new JSONArray();
            }
            int length2 = jSONArrayOptJSONArray2.length();
            int i2 = 0;
            while (i2 < length2) {
                JSONObject jSONObject4 = jSONArrayOptJSONArray2.getJSONObject(i2);
                i2++;
                String strOptString = jSONObject4.optString("source_tag", "Server " + i2);
                JSONArray jSONArrayOptJSONArray3 = jSONObject4.optJSONArray("sources");
                if (jSONArrayOptJSONArray3 == null) {
                    jSONArrayOptJSONArray3 = new JSONArray();
                }
                int length3 = jSONArrayOptJSONArray3.length();
                for (int i3 = 0; i3 < length3; i3++) {
                    JSONObject jSONObject5 = jSONArrayOptJSONArray3.getJSONObject(i3);
                    AbstractC1474fG.i(jSONObject5, "getJSONObject(...)");
                    w(linkedHashMap, jSONObject5, strOptString);
                }
            }
            Collection collectionValues = linkedHashMap.values();
            AbstractC1474fG.i(collectionValues, "<get-values>(...)");
            List listX0 = AbstractC0911Ye.x0(collectionValues);
            return listX0.isEmpty() ? QW.p(str) : listX0;
        } catch (Exception e) {
            e.getMessage();
            return QW.p(str);
        }
    }
}
