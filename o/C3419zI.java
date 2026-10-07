package o;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.zI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3419zI extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ String m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3419zI(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = str;
        this.n = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C3419zI) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C3419zI(this.m, this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        String strOptString;
        List list;
        int i = this.n;
        String str = this.m;
        Jp0.O(obj);
        try {
            JSONArray jSONArrayOptJSONArray = JI.u("/genre/movie/list", new C1101bX[0]).optJSONArray("genres");
            if (jSONArrayOptJSONArray == null) {
                strOptString = str;
                break;
            }
            int length = jSONArrayOptJSONArray.length();
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    strOptString = str;
                    break;
                }
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null && AbstractC1474fG.b(String.valueOf(jSONObjectOptJSONObject.optInt("id")), str)) {
                    strOptString = jSONObjectOptJSONObject.optString("name");
                    AbstractC1474fG.i(strOptString, "optString(...)");
                    break;
                }
                i2++;
            }
        } catch (Exception unused) {
        }
        try {
            ArrayList arrayList = new ArrayList();
            JI ji = JI.b;
            arrayList.addAll(JI.q(JI.u("/discover/movie", new C1101bX("with_genres", str), new C1101bX("page", String.valueOf(i)), new C1101bX("sort_by", "popularity.desc"))));
            arrayList.addAll(JI.r(JI.u("/discover/tv", new C1101bX("with_genres", str), new C1101bX("page", String.valueOf(i)), new C1101bX("sort_by", "popularity.desc"))));
            list = arrayList;
        } catch (Exception e) {
            e.getMessage();
            list = C1233cq.l;
        }
        return new C2420oz(str, strOptString, list);
    }
}
