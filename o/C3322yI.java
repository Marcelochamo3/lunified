package o;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3322yI extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3322yI(String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C3322yI) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C3322yI(this.m, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Jp0.O(obj);
        String str = this.m;
        String strB0 = AbstractC1119bh0.B0(str, "@");
        Integer numJ = AbstractC1802ih0.J(AbstractC1119bh0.x0(str, "@", str));
        C1233cq c1233cq = C1233cq.l;
        if (numJ == null) {
            return c1233cq;
        }
        int iIntValue = numJ.intValue();
        try {
            JI ji = JI.b;
            JSONArray jSONArrayOptJSONArray = JI.u("/tv/" + strB0 + "/season/" + iIntValue, new C1101bX[0]).optJSONArray("episodes");
            if (jSONArrayOptJSONArray == null) {
                return c1233cq;
            }
            ZF zfL = U9.L(0, jSONArrayOptJSONArray.length());
            ArrayList arrayList = new ArrayList();
            YF it = zfL.iterator();
            while (it.n) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(it.a());
                C0456Gq c0456Gq = null;
                if (jSONObjectOptJSONObject != null) {
                    int iOptInt = jSONObjectOptJSONObject.optInt("episode_number");
                    String str2 = strB0 + "@" + iIntValue + "@" + iOptInt;
                    String strOptString = jSONObjectOptJSONObject.optString("name");
                    AbstractC1474fG.g(strOptString);
                    if (!(!AbstractC1899jh0.O(strOptString))) {
                        strOptString = null;
                    }
                    if (strOptString == null) {
                        strOptString = "Episodio " + iOptInt;
                    }
                    String str3 = strOptString;
                    String strOptString2 = jSONObjectOptJSONObject.optString("air_date");
                    AbstractC1474fG.g(strOptString2);
                    String str4 = AbstractC1899jh0.O(strOptString2) ^ true ? strOptString2 : null;
                    JI ji2 = JI.b;
                    c0456Gq = new C0456Gq(str2, iOptInt, str3, str4, JI.A(jSONObjectOptJSONObject.optString("still_path")), null, null, 96);
                }
                if (c0456Gq != null) {
                    arrayList.add(c0456Gq);
                }
            }
            return arrayList;
        } catch (Exception e) {
            e.getMessage();
            return c1233cq;
        }
    }
}
