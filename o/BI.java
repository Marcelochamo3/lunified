package o;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class BI extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BI(String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((BI) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new BI(this.m, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x014e  */
    @Override // o.R7
    public final Object r(Object obj) {
        List list;
        List list2;
        List list3;
        JSONArray jSONArrayOptJSONArray;
        C1688hY c1688hY;
        JSONArray jSONArrayOptJSONArray2;
        C1688hY c1688hY2;
        C2420oz c2420oz;
        Jp0.O(obj);
        JI ji = JI.b;
        JSONObject jSONObjectU = JI.u("/movie/" + this.m, new C1101bX("append_to_response", "credits,recommendations,videos"));
        JSONArray jSONArrayOptJSONArray3 = jSONObjectU.optJSONArray("genres");
        List listQ = C1233cq.l;
        if (jSONArrayOptJSONArray3 != null) {
            ZF zfL = U9.L(0, jSONArrayOptJSONArray3.length());
            ArrayList arrayList = new ArrayList();
            YF it = zfL.iterator();
            while (it.n) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray3.optJSONObject(it.a());
                if (jSONObjectOptJSONObject != null) {
                    String strValueOf = String.valueOf(jSONObjectOptJSONObject.optInt("id"));
                    String strOptString = jSONObjectOptJSONObject.optString("name");
                    AbstractC1474fG.i(strOptString, "optString(...)");
                    c2420oz = new C2420oz(strValueOf, strOptString);
                } else {
                    c2420oz = null;
                }
                if (c2420oz != null) {
                    arrayList.add(c2420oz);
                }
            }
            list = arrayList;
        } else {
            list = listQ;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObjectU.optJSONObject("credits");
        if (jSONObjectOptJSONObject2 == null || (jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("cast")) == null) {
            list2 = listQ;
        } else {
            ZF zfL2 = U9.L(0, Math.min(jSONArrayOptJSONArray2.length(), 20));
            ArrayList arrayList2 = new ArrayList();
            YF it2 = zfL2.iterator();
            while (it2.n) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(it2.a());
                if (jSONObjectOptJSONObject3 != null) {
                    String strValueOf2 = String.valueOf(jSONObjectOptJSONObject3.optInt("id"));
                    String strOptString2 = jSONObjectOptJSONObject3.optString("name");
                    AbstractC1474fG.i(strOptString2, "optString(...)");
                    JI ji2 = JI.b;
                    c1688hY2 = new C1688hY(strValueOf2, strOptString2, JI.A(jSONObjectOptJSONObject3.optString("profile_path")), null, 8);
                } else {
                    c1688hY2 = null;
                }
                if (c1688hY2 != null) {
                    arrayList2.add(c1688hY2);
                }
            }
            list2 = arrayList2;
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObjectU.optJSONObject("credits");
        if (jSONObjectOptJSONObject4 == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject4.optJSONArray("crew")) == null) {
            list3 = listQ;
        } else {
            ZF zfL3 = U9.L(0, jSONArrayOptJSONArray.length());
            ArrayList arrayList3 = new ArrayList();
            YF it3 = zfL3.iterator();
            while (it3.n) {
                JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray.optJSONObject(it3.a());
                if (jSONObjectOptJSONObject5 == null) {
                    c1688hY = null;
                } else {
                    if (!AbstractC1474fG.b(jSONObjectOptJSONObject5.optString("job"), "Director")) {
                        jSONObjectOptJSONObject5 = null;
                    }
                    if (jSONObjectOptJSONObject5 != null) {
                        String strValueOf3 = String.valueOf(jSONObjectOptJSONObject5.optInt("id"));
                        String strOptString3 = jSONObjectOptJSONObject5.optString("name");
                        AbstractC1474fG.i(strOptString3, "optString(...)");
                        JI ji3 = JI.b;
                        c1688hY = new C1688hY(strValueOf3, strOptString3, JI.A(jSONObjectOptJSONObject5.optString("profile_path")), null, 8);
                    } else {
                        c1688hY = null;
                    }
                }
                if (c1688hY != null) {
                    arrayList3.add(c1688hY);
                }
            }
            list3 = arrayList3;
        }
        JSONObject jSONObjectOptJSONObject6 = jSONObjectU.optJSONObject("recommendations");
        if (jSONObjectOptJSONObject6 != null) {
            listQ = JI.q(jSONObjectOptJSONObject6);
        }
        List list4 = listQ;
        JI ji4 = JI.b;
        String strP = JI.p(jSONObjectU);
        String strOptString4 = jSONObjectU.optString("title");
        AbstractC1474fG.i(strOptString4, "optString(...)");
        String strOptString5 = jSONObjectU.optString("overview");
        AbstractC1474fG.g(strOptString5);
        String str = AbstractC1899jh0.O(strOptString5) ^ true ? strOptString5 : null;
        String strOptString6 = jSONObjectU.optString("release_date");
        AbstractC1474fG.g(strOptString6);
        String str2 = true ^ AbstractC1899jh0.O(strOptString6) ? strOptString6 : null;
        Integer num = new Integer(jSONObjectU.optInt("runtime"));
        Integer num2 = num.intValue() > 0 ? num : null;
        Double d = new Double(jSONObjectU.optDouble("vote_average"));
        double dDoubleValue = d.doubleValue();
        return new C1387eR(this.m, strOptString4, str, str2, num2, strP, null, (Double.isNaN(dDoubleValue) || dDoubleValue <= 0.0d) ? null : d, JI.A(jSONObjectU.optString("poster_path")), JI.v(jSONObjectU.optString("backdrop_path")), list, list3, list2, list4, null, 16448);
    }
}
