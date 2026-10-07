package o;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Hn0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hn0(String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Hn0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Hn0(this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
            return obj;
        }
        Jp0.O(obj);
        String str = this.n;
        if (AbstractC1899jh0.U(str, "fctvevent-", false)) {
            C2379oe c2379oe = C2379oe.b;
            this.m = 1;
            Object objB = c2379oe.b(str, this);
            return objB == enumC1706hi ? enumC1706hi : objB;
        }
        if (AbstractC1899jh0.U(str, "tigo-", false)) {
            LinkedHashMap linkedHashMap = C3068vj0.e;
            String str2 = this.n;
            String str3 = (String) linkedHashMap.get(str2);
            return new C1387eR(str2, str3 == null ? str : str3, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC3327yN.y(new C1101bX("is_tv_channel", Boolean.TRUE)), 16380);
        }
        if (AbstractC1899jh0.U(str, "tv-", false)) {
            return C1816io0.p(str);
        }
        if (AbstractC1899jh0.U(str, "lumix-movie-", false)) {
            String strL0 = AbstractC1119bh0.l0(str, "lumix-movie-");
            try {
                C1816io0 c1816io0 = C1816io0.b;
                JSONObject jSONObjectX = C1816io0.x("/movies/" + strL0 + ".json");
                String strOptString = jSONObjectX.optString("poster");
                AbstractC1474fG.i(strOptString, "optString(...)");
                String strR = strOptString.length() == 0 ? null : AbstractC1899jh0.R(strOptString, "/t/p/original/", "/t/p/w500/", false);
                String strOptString2 = jSONObjectX.optString("backdrop");
                AbstractC1474fG.i(strOptString2, "optString(...)");
                String strR2 = strOptString2.length() == 0 ? null : AbstractC1899jh0.R(strOptString2, "/t/p/original/", "/t/p/w1280/", false);
                String str4 = strR2 == null ? strR : strR2;
                JSONArray jSONArrayOptJSONArray = jSONObjectX.optJSONArray("servidores");
                if (jSONArrayOptJSONArray != null) {
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        C1816io0 c1816io1 = C1816io0.b;
                        JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i2);
                        AbstractC1474fG.i(jSONObject, "getJSONObject(...)");
                        arrayList.add(C1816io0.t(jSONObject));
                    }
                    C1816io0.r.put(str, arrayList);
                }
                String string = jSONObjectX.getString("titulo");
                String strOptString3 = jSONObjectX.optString("overview");
                AbstractC1474fG.g(strOptString3);
                String str5 = strOptString3.length() > 0 ? strOptString3 : null;
                Double d = (!jSONObjectX.has("rating") || jSONObjectX.isNull("rating")) ? null : new Double(jSONObjectX.getDouble("rating"));
                String strOptString4 = jSONObjectX.optString("release_date");
                AbstractC1474fG.g(strOptString4);
                String str6 = strOptString4.length() > 0 ? strOptString4 : null;
                String str7 = this.n;
                AbstractC1474fG.g(string);
                return new C1387eR(str7, string, str5, str6, null, null, null, d, strR, str4, null, null, null, null, null, 31856);
            } catch (Exception unused) {
            }
        }
        StringBuilder sb = new StringBuilder("Movie ");
        String str8 = this.n;
        sb.append(str8);
        return new C1387eR(str8, sb.toString(), null, null, null, null, null, null, null, null, null, null, null, null, null, 32764);
    }
}
