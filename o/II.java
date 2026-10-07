package o;

import java.net.URLEncoder;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class II extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ String m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public II(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = str;
        this.n = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((II) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new II(this.m, this.n, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b5  */
    @Override // o.R7
    public final Object r(Object obj) {
        C2420oz c2420oz;
        Cd0 cd0Z;
        Jp0.O(obj);
        String str = this.m;
        boolean zO = AbstractC1899jh0.O(str);
        C1233cq c1233cq = C1233cq.l;
        if (zO) {
            try {
                JSONArray jSONArrayOptJSONArray = JI.u("/genre/movie/list", new C1101bX[0]).optJSONArray("genres");
                if (jSONArrayOptJSONArray == null) {
                    return c1233cq;
                }
                ZF zfL = U9.L(0, jSONArrayOptJSONArray.length());
                ArrayList arrayList = new ArrayList();
                YF it = zfL.iterator();
                while (it.n) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(it.a());
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
                return arrayList;
            } catch (Exception unused) {
                return c1233cq;
            }
        }
        try {
            String strEncode = URLEncoder.encode(str, "UTF-8");
            JI ji = JI.b;
            JSONArray jSONArrayOptJSONArray2 = JI.u("/search/multi", new C1101bX("query", strEncode), new C1101bX("page", String.valueOf(this.n))).optJSONArray("results");
            if (jSONArrayOptJSONArray2 == null) {
                return c1233cq;
            }
            ZF zfL2 = U9.L(0, jSONArrayOptJSONArray2.length());
            ArrayList arrayList2 = new ArrayList();
            YF it2 = zfL2.iterator();
            while (it2.n) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(it2.a());
                if (jSONObjectOptJSONObject2 == null) {
                    cd0Z = null;
                } else {
                    String strOptString2 = jSONObjectOptJSONObject2.optString("media_type");
                    if (AbstractC1474fG.b(strOptString2, "movie")) {
                        JI ji2 = JI.b;
                        cd0Z = JI.y(jSONObjectOptJSONObject2);
                    } else if (AbstractC1474fG.b(strOptString2, "tv")) {
                        JI ji3 = JI.b;
                        cd0Z = JI.z(jSONObjectOptJSONObject2);
                    } else {
                        cd0Z = null;
                    }
                }
                if (cd0Z != null) {
                    arrayList2.add(cd0Z);
                }
            }
            return arrayList2;
        } catch (Exception e) {
            e.getMessage();
            return c1233cq;
        }
    }
}
