package o;

import com.skidush.clonex.models.Video$Type;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class EI extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ Video$Type m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EI(Video$Type video$Type, String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = video$Type;
        this.n = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((EI) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new EI(this.m, this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArrayOptJSONArray2;
        JSONArray jSONArrayOptJSONArray3;
        C1233cq c1233cq = C1233cq.l;
        Jp0.O(obj);
        try {
            Video$Type video$Type = this.m;
            if (video$Type instanceof Is0) {
                JI ji = JI.b;
                String strT = JI.t("SourcesM%2F" + ((Is0) video$Type).l + ".json");
                return (strT == null || (jSONArrayOptJSONArray3 = new JSONObject(strT).optJSONArray("sources")) == null) ? c1233cq : JI.s(jSONArrayOptJSONArray3);
            }
            if (!(video$Type instanceof Hs0)) {
                throw new C0730Rf();
            }
            String str = ((Hs0) video$Type).p.l;
            int i = ((Hs0) video$Type).q.l;
            int i2 = ((Hs0) video$Type).m;
            JI ji2 = JI.b;
            String strT2 = JI.t("SourcesT%2F" + str + ".json");
            if (strT2 == null || (jSONArrayOptJSONArray = new JSONObject(strT2).optJSONArray("temporadas")) == null) {
                return c1233cq;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i3 = 0; i3 < length; i3++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i3);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("temporada");
                    AbstractC1474fG.i(strOptString, "optString(...)");
                    Integer numJ = AbstractC1802ih0.J(strOptString);
                    String strOptString2 = jSONObjectOptJSONObject.optString("capitulo");
                    AbstractC1474fG.i(strOptString2, "optString(...)");
                    Integer numJ2 = AbstractC1802ih0.J(strOptString2);
                    if (numJ != null && numJ.intValue() == i && numJ2 != null && numJ2.intValue() == i2 && (jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("sources")) != null) {
                        return JI.s(jSONArrayOptJSONArray2);
                    }
                }
            }
            return c1233cq;
        } catch (Exception e) {
            e.getMessage();
            return c1233cq;
        }
    }
}
