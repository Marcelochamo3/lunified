package o;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AI extends Ph0 implements InterfaceC0775Sy {
    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((AI) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new AI(2, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Cd0 cd0Z;
        Jp0.O(obj);
        ArrayList arrayList = new ArrayList();
        for (C1101bX c1101bX : AbstractC0937Ze.K(new C1101bX("Tendencias", "/trending/all/week"), new C1101bX("Películas populares", "/movie/popular"), new C1101bX("Series populares", "/tv/popular"), new C1101bX("Mejor valoradas", "/movie/top_rated"), new C1101bX("En cartelera", "/movie/now_playing"))) {
            String str = (String) c1101bX.l;
            String str2 = (String) c1101bX.m;
            try {
                JSONArray jSONArrayOptJSONArray = JI.u(str2, new C1101bX[0]).optJSONArray("results");
                if (jSONArrayOptJSONArray != null) {
                    ZF zfL = U9.L(0, jSONArrayOptJSONArray.length());
                    ArrayList arrayList2 = new ArrayList();
                    YF it = zfL.iterator();
                    while (it.n) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(it.a());
                        if (jSONObjectOptJSONObject == null) {
                            cd0Z = null;
                        } else {
                            String strOptString = jSONObjectOptJSONObject.optString("media_type");
                            if (AbstractC1474fG.b(strOptString, "tv") || AbstractC1119bh0.W(str2, "/tv/", false)) {
                                JI ji = JI.b;
                                cd0Z = JI.z(jSONObjectOptJSONObject);
                            } else if (AbstractC1474fG.b(strOptString, "movie") || AbstractC1119bh0.W(str2, "/movie/", false) || !jSONObjectOptJSONObject.has("name") || jSONObjectOptJSONObject.has("title")) {
                                JI ji2 = JI.b;
                                cd0Z = JI.y(jSONObjectOptJSONObject);
                            } else {
                                JI ji3 = JI.b;
                                cd0Z = JI.z(jSONObjectOptJSONObject);
                            }
                        }
                        if (cd0Z != null) {
                            arrayList2.add(cd0Z);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        arrayList.add(new C0882Xb(str, AbstractC0911Ye.s0(20, arrayList2)));
                    }
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return arrayList;
    }
}
