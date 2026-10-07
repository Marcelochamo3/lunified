package o;

import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Nn0 extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nn0(String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Nn0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Nn0(this.m, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        String str;
        Jp0.O(obj);
        String str2 = this.m;
        if (AbstractC1899jh0.U(str2, "tv-", false)) {
            C1387eR c1387eRP = C1816io0.p(str2);
            String strConcat = str2.concat("-1-1");
            String str3 = c1387eRP.b;
            String str4 = str3 == null ? "Unknown Title" : str3;
            String str5 = c1387eRP.h;
            Ma0 ma0 = new Ma0(str2.concat("-season-1"), 1, "Season 1", null, null, AbstractC2506pt.A(new C0456Gq(strConcat, 1, str4, null, str5 == null ? "" : str5, null, null, 104)), 24);
            String str6 = c1387eRP.b;
            String str7 = str6 == null ? "Unknown Title" : str6;
            String str8 = c1387eRP.c;
            if (str8 != null) {
                if (str8.length() == 0) {
                    str8 = "Live TV channel";
                }
                str = str8;
            } else {
                str = "Live TV channel";
            }
            String str9 = c1387eRP.h;
            String str10 = str9 == null ? "" : str9;
            String str11 = c1387eRP.i;
            return new C2109lo0(this.m, str7, str, null, c1387eRP.d, null, null, c1387eRP.g, str10, str11 == null ? str9 == null ? "" : str9 : str11, null, AbstractC2506pt.A(ma0), null, null, null, null, 62560);
        }
        if (AbstractC1899jh0.U(str2, "lumix-series-", false)) {
            String strL0 = AbstractC1119bh0.l0(str2, "lumix-series-");
            try {
                C1816io0 c1816io0 = C1816io0.b;
                JSONObject jSONObjectX = C1816io0.x("/series/" + strL0 + ".json");
                ArrayList arrayList = new ArrayList();
                for (int i = 1; i <= 30; i++) {
                    try {
                        C1816io0 c1816io1 = C1816io0.b;
                        C1816io0.x("/series/" + strL0 + "/t" + i + ".json");
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        sb.append("|season-");
                        sb.append(i);
                        arrayList.add(new Ma0(sb.toString(), i, "Temporada " + i, null, null, null, 56));
                    } catch (Exception unused) {
                    }
                }
                C1816io0 c1816io2 = C1816io0.b;
                String strOptString = jSONObjectX.optString("poster");
                AbstractC1474fG.i(strOptString, "optString(...)");
                String strR = strOptString.length() == 0 ? null : AbstractC1899jh0.R(strOptString, "/t/p/original/", "/t/p/w500/", false);
                String strOptString2 = jSONObjectX.optString("backdrop");
                AbstractC1474fG.i(strOptString2, "optString(...)");
                String strR2 = strOptString2.length() == 0 ? null : AbstractC1899jh0.R(strOptString2, "/t/p/original/", "/t/p/w1280/", false);
                String str12 = strR2 == null ? strR : strR2;
                String string = jSONObjectX.getString("titulo");
                String strOptString3 = jSONObjectX.optString("overview");
                AbstractC1474fG.g(strOptString3);
                String str13 = strOptString3.length() > 0 ? strOptString3 : null;
                Double d = (!jSONObjectX.has("rating") || jSONObjectX.isNull("rating")) ? null : new Double(jSONObjectX.getDouble("rating"));
                String strOptString4 = jSONObjectX.optString("release_date");
                AbstractC1474fG.g(strOptString4);
                if (strOptString4.length() <= 0) {
                    strOptString4 = null;
                }
                String str14 = this.m;
                AbstractC1474fG.g(string);
                return new C2109lo0(str14, string, str13, strOptString4, null, null, null, d, strR, str12, null, arrayList, null, null, null, null, 62576);
            } catch (Exception unused2) {
            }
        }
        return new C2109lo0(this.m, "Error al cargar", null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532);
    }
}
