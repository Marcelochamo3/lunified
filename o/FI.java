package o;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class FI extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FI(String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((FI) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new FI(this.m, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0196  */
    @Override // o.R7
    public final Object r(Object obj) {
        List list;
        List listR0;
        List list2;
        Integer num;
        JSONArray jSONArrayOptJSONArray;
        C1688hY c1688hY;
        int iOptInt;
        Ma0 ma0;
        C2420oz c2420oz;
        Jp0.O(obj);
        JI ji = JI.b;
        StringBuilder sb = new StringBuilder("/tv/");
        String str = this.m;
        sb.append(str);
        JSONObject jSONObjectU = JI.u(sb.toString(), new C1101bX("append_to_response", "credits,recommendations,videos"));
        JSONArray jSONArrayOptJSONArray2 = jSONObjectU.optJSONArray("genres");
        List listR = C1233cq.l;
        if (jSONArrayOptJSONArray2 != null) {
            ZF zfL = U9.L(0, jSONArrayOptJSONArray2.length());
            ArrayList arrayList = new ArrayList();
            YF it = zfL.iterator();
            while (it.n) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(it.a());
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
            list = listR;
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObjectU.optJSONArray("seasons");
        if (jSONArrayOptJSONArray3 != null) {
            ZF zfL2 = U9.L(0, jSONArrayOptJSONArray3.length());
            ArrayList arrayList2 = new ArrayList();
            YF it2 = zfL2.iterator();
            while (it2.n) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray3.optJSONObject(it2.a());
                if (jSONObjectOptJSONObject2 != null && (iOptInt = jSONObjectOptJSONObject2.optInt("season_number")) > 0) {
                    String str2 = str + "@" + iOptInt;
                    String strOptString2 = jSONObjectOptJSONObject2.optString("name");
                    if (AbstractC1899jh0.O(strOptString2)) {
                        strOptString2 = AbstractC1674hK.n(iOptInt, "Temporada ");
                    }
                    String str3 = strOptString2;
                    JI ji2 = JI.b;
                    ma0 = new Ma0(str2, iOptInt, str3, JI.A(jSONObjectOptJSONObject2.optString("poster_path")), null, null, 48);
                } else {
                    ma0 = null;
                }
                if (ma0 != null) {
                    arrayList2.add(ma0);
                }
            }
            listR0 = AbstractC0911Ye.r0(arrayList2, new N2(19));
        } else {
            listR0 = listR;
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObjectU.optJSONObject("credits");
        if (jSONObjectOptJSONObject3 == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("cast")) == null) {
            list2 = listR;
        } else {
            ZF zfL3 = U9.L(0, Math.min(jSONArrayOptJSONArray.length(), 20));
            ArrayList arrayList3 = new ArrayList();
            YF it3 = zfL3.iterator();
            while (it3.n) {
                JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(it3.a());
                if (jSONObjectOptJSONObject4 != null) {
                    String strValueOf2 = String.valueOf(jSONObjectOptJSONObject4.optInt("id"));
                    String strOptString3 = jSONObjectOptJSONObject4.optString("name");
                    AbstractC1474fG.i(strOptString3, "optString(...)");
                    JI ji3 = JI.b;
                    c1688hY = new C1688hY(strValueOf2, strOptString3, JI.A(jSONObjectOptJSONObject4.optString("profile_path")), null, 8);
                } else {
                    c1688hY = null;
                }
                if (c1688hY != null) {
                    arrayList3.add(c1688hY);
                }
            }
            list2 = arrayList3;
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObjectU.optJSONObject("recommendations");
        if (jSONObjectOptJSONObject5 != null) {
            listR = JI.r(jSONObjectOptJSONObject5);
        }
        List list3 = listR;
        JSONArray jSONArrayOptJSONArray4 = jSONObjectU.optJSONArray("episode_run_time");
        if (jSONArrayOptJSONArray4 != null) {
            Integer num2 = new Integer(jSONArrayOptJSONArray4.optInt(0));
            if (num2.intValue() > 0) {
                num = num2;
            } else {
                num = null;
            }
        } else {
            num = null;
        }
        JI ji4 = JI.b;
        String strP = JI.p(jSONObjectU);
        String strOptString4 = jSONObjectU.optString("name");
        AbstractC1474fG.i(strOptString4, "optString(...)");
        String strOptString5 = jSONObjectU.optString("overview");
        AbstractC1474fG.g(strOptString5);
        String str4 = AbstractC1899jh0.O(strOptString5) ^ true ? strOptString5 : null;
        String strOptString6 = jSONObjectU.optString("first_air_date");
        AbstractC1474fG.g(strOptString6);
        String str5 = AbstractC1899jh0.O(strOptString6) ^ true ? strOptString6 : null;
        Double d = new Double(jSONObjectU.optDouble("vote_average"));
        double dDoubleValue = d.doubleValue();
        return new C2109lo0(this.m, strOptString4, str4, str5, num, strP, null, (Double.isNaN(dDoubleValue) || dDoubleValue <= 0.0d) ? null : d, JI.A(jSONObjectU.optString("poster_path")), JI.v(jSONObjectU.optString("backdrop_path")), null, listR0, list, null, list2, list3, 9280);
    }
}
