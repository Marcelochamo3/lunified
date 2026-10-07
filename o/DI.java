package o;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class DI extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ int m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DI(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = i;
        this.n = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((DI) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new DI(this.n, this.m, interfaceC0473Hh);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [o.cq] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    @Override // o.R7
    public final Object r(Object obj) {
        ?? arrayList;
        JSONArray jSONArrayOptJSONArray;
        String str = this.n;
        Jp0.O(obj);
        if (this.m > 1) {
            return new C1688hY(this.n, "", null, null, 12);
        }
        try {
            JI ji = JI.b;
            JSONObject jSONObjectU = JI.u("/person/" + str, new C1101bX("append_to_response", "combined_credits"));
            JSONObject jSONObjectOptJSONObject = jSONObjectU.optJSONObject("combined_credits");
            if (jSONObjectOptJSONObject == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("cast")) == null) {
                arrayList = C1233cq.l;
            } else {
                ZF zfL = U9.L(0, jSONArrayOptJSONArray.length());
                arrayList = new ArrayList();
                YF it = zfL.iterator();
                while (it.n) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(it.a());
                    Cd0 cd0Z = null;
                    if (jSONObjectOptJSONObject2 != null) {
                        String strOptString = jSONObjectOptJSONObject2.optString("media_type");
                        if (AbstractC1474fG.b(strOptString, "movie")) {
                            JI ji2 = JI.b;
                            cd0Z = JI.y(jSONObjectOptJSONObject2);
                        } else if (AbstractC1474fG.b(strOptString, "tv")) {
                            JI ji3 = JI.b;
                            cd0Z = JI.z(jSONObjectOptJSONObject2);
                        }
                    }
                    if (cd0Z != null) {
                        arrayList.add(cd0Z);
                    }
                }
            }
            String strOptString2 = jSONObjectU.optString("name");
            AbstractC1474fG.i(strOptString2, "optString(...)");
            JI ji4 = JI.b;
            return new C1688hY(str, strOptString2, JI.A(jSONObjectU.optString("profile_path")), arrayList);
        } catch (Exception unused) {
            return new C1688hY(this.n, "", null, null, 12);
        }
    }
}
