package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class OW extends Ph0 implements InterfaceC0775Sy {
    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((OW) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new OW(2, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Exception {
        Object next;
        Jp0.O(obj);
        if ((!QW.f.isEmpty()) && System.currentTimeMillis() - QW.g < 300000) {
            return QW.f;
        }
        QW.h.clear();
        QW.i.clear();
        QW.j.clear();
        JSONObject jSONObject = new JSONObject(QW.q("streams"));
        if (!jSONObject.optBoolean("success", false)) {
            throw new Exception("ppv.st API respondió con success=false");
        }
        JSONArray jSONArray = jSONObject.getJSONArray("streams");
        ZF zfL = U9.L(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(zfL, 10));
        YF it = zfL.iterator();
        while (it.n) {
            arrayList.add(jSONArray.getJSONObject(it.a()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!AbstractC1899jh0.N(((JSONObject) next).getString("category"), "Football", true));
        JSONObject jSONObject2 = (JSONObject) next;
        if (jSONObject2 != null) {
            List listR = QW.r(jSONObject2);
            if (!listR.isEmpty()) {
                arrayList2.add(new C0882Xb("FOOTBALL", listR));
            }
        }
        ArrayList<JSONObject> arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!AbstractC1899jh0.N(((JSONObject) obj2).getString("category"), "Football", true)) {
                arrayList3.add(obj2);
            }
        }
        for (JSONObject jSONObject3 : arrayList3) {
            QW qw = QW.b;
            AbstractC1474fG.g(jSONObject3);
            List listR2 = QW.r(jSONObject3);
            if (!listR2.isEmpty()) {
                String string = jSONObject3.getString("category");
                AbstractC1474fG.i(string, "getString(...)");
                String upperCase = string.toUpperCase(Locale.ROOT);
                AbstractC1474fG.i(upperCase, "toUpperCase(...)");
                arrayList2.add(new C0882Xb(upperCase, listR2));
            }
        }
        arrayList2.size();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            ((C0882Xb) it3.next()).b.size();
        }
        QW.f = arrayList2;
        QW.g = System.currentTimeMillis();
        return arrayList2;
    }
}
