package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Cx0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cx0(String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Cx0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Cx0(this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws JSONException {
        String str;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            Lx0 lx0 = Lx0.b;
            this.m = 1;
            if (lx0.A(this) == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        String str2 = this.n;
        if (AbstractC1899jh0.U(str2, "xuper-movie:", false)) {
            String strL0 = AbstractC1119bh0.l0(str2, "xuper-movie:");
            JSONObject jSONObject = (JSONObject) Lx0.j.get(strL0);
            String strOptString = jSONObject != null ? jSONObject.optString("name") : null;
            str = strOptString != null ? strOptString : "";
            Lx0 lx1 = Lx0.b;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("columnId", -1);
            jSONObject2.put("contentId", strL0);
            jSONObject2.put("startTime", 0);
            jSONObject2.put("type", "1");
            JSONObject jSONObjectN = Lx0.N(7, jSONObject2);
            Lx0.O(jSONObjectN, "Reproducción de película");
            JSONObject jSONObjectOptJSONObject = jSONObjectN.optJSONObject("data");
            List listG = Lx0.G(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("episodeList") : null);
            ArrayList arrayList = new ArrayList();
            Iterator it = listG.iterator();
            while (it.hasNext()) {
                AbstractC1406ef.Q(arrayList, Lx0.u((JSONObject) it.next(), str));
            }
            return arrayList;
        }
        boolean zU = AbstractC1899jh0.U(str2, "xuper-episode:", false);
        C1233cq c1233cq = C1233cq.l;
        if (!zU) {
            return c1233cq;
        }
        List listS0 = AbstractC1119bh0.s0(AbstractC1119bh0.l0(str2, "xuper-episode:"), new char[]{':'}, 3, 2);
        String str3 = (String) AbstractC0911Ye.e0(0, listS0);
        str = str3 != null ? str3 : "";
        String str4 = (String) AbstractC0911Ye.e0(1, listS0);
        Integer numJ = str4 != null ? AbstractC1802ih0.J(str4) : null;
        if (AbstractC1899jh0.O(str) || numJ == null) {
            return c1233cq;
        }
        Lx0 lx2 = Lx0.b;
        List<JSONObject> listR = Lx0.r(str, AbstractC2506pt.A(numJ));
        ArrayList arrayList2 = new ArrayList();
        for (JSONObject jSONObject3 : listR) {
            Lx0 lx3 = Lx0.b;
            AbstractC1406ef.Q(arrayList2, Lx0.u(jSONObject3, "Episodio " + numJ));
        }
        return arrayList2;
    }
}
