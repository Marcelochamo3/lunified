package o;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.nx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2321nx0 extends Ph0 implements InterfaceC0775Sy {
    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2321nx0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2321nx0(2, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws JSONException {
        Jp0.O(obj);
        Lx0 lx0 = Lx0.b;
        JSONObject jSONObject = new JSONObject();
        String strH = com.skidush.clonex.bridge.N7.a.h(12);
        if (strH != null) {
            if (!(!AbstractC1899jh0.O(strH))) {
                strH = null;
            }
            if (strH != null) {
                Integer numJ = AbstractC1802ih0.J(strH);
                if (numJ != null) {
                    if (numJ.intValue() <= 0) {
                        numJ = null;
                    }
                    if (numJ != null) {
                        jSONObject.put("columnId", numJ.intValue());
                        jSONObject.put("specialFlag", "0");
                        jSONObject.put("pageNum", 1);
                        jSONObject.put("pageSize", 100);
                        jSONObject.put("isAv1", "0");
                        JSONObject jSONObjectN = Lx0.N(2, jSONObject);
                        Lx0.O(jSONObjectN, "Explorar");
                        JSONObject jSONObjectOptJSONObject = jSONObjectN.optJSONObject("data");
                        List listG = Lx0.G(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("childColumnList") : null);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : listG) {
                            JSONObject jSONObject2 = (JSONObject) obj2;
                            Lx0 lx1 = Lx0.b;
                            String strJ = Lx0.J(jSONObject2.optString("name"));
                            if (strJ == null && (strJ = Lx0.J(jSONObject2.optString("alias"))) == null) {
                                strJ = "";
                            }
                            if (!Lx0.F(strJ)) {
                                arrayList.add(obj2);
                            }
                        }
                        return arrayList;
                    }
                }
                throw new IllegalStateException("Configuración protegida no válida");
            }
        }
        throw new IllegalStateException("Configuración protegida no disponible");
    }
}
