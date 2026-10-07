package o;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.zn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3464zn0 extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3464zn0(String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = str;
        this.n = str2;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C3464zn0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C3464zn0(this.m, this.n, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022  */
    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // o.R7
    public final Object r(Object obj) {
        String str;
        int iE0;
        Jp0.O(obj);
        String str2 = this.n;
        String strB0 = this.m;
        if (strB0 == null) {
            if (AbstractC1899jh0.U(str2, "tv-", false)) {
                str = str2;
            } else {
                str = null;
            }
            if (str != null) {
                strB0 = AbstractC1119bh0.B0(str, "-season-");
            } else {
                strB0 = null;
            }
        } else {
            if (!AbstractC1899jh0.U(strB0, "tv-", false)) {
                strB0 = null;
            }
            if (strB0 == null) {
                if (AbstractC1899jh0.U(str2, "tv-", false)) {
                    str = str2;
                } else {
                    str = null;
                }
                if (str != null) {
                    strB0 = AbstractC1119bh0.B0(str, "-season-");
                } else {
                    strB0 = null;
                }
            }
        }
        if (strB0 != null) {
            C1387eR c1387eRP = C1816io0.p(strB0);
            String strConcat = strB0.concat("-1-1");
            String str3 = c1387eRP.b;
            if (str3 == null) {
                str3 = "Unknown Title";
            }
            String str4 = str3;
            String str5 = c1387eRP.h;
            if (str5 == null) {
                str5 = "";
            }
            return AbstractC2506pt.A(new C0456Gq(strConcat, 1, str4, null, str5, null, null, 104));
        }
        boolean zU = AbstractC1899jh0.U(str2, "lumix-series-", false);
        C1233cq c1233cq = C1233cq.l;
        if (zU && (iE0 = AbstractC1119bh0.e0(str2, "|season-", 0, false, 6)) != -1) {
            String strSubstring = str2.substring(13, iE0);
            AbstractC1474fG.i(strSubstring, "substring(...)");
            String strSubstring2 = str2.substring(iE0 + 8);
            AbstractC1474fG.i(strSubstring2, "substring(...)");
            try {
                C1816io0 c1816io0 = C1816io0.b;
                JSONArray jSONArray = C1816io0.x("/series/" + strSubstring + "/t" + strSubstring2 + ".json").getJSONArray("episodios");
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    long j = jSONObject.getLong("id");
                    int i2 = jSONObject.getInt("number");
                    String strOptString = jSONObject.optString("titulo");
                    AbstractC1474fG.g(strOptString);
                    if (strOptString.length() <= 0) {
                        strOptString = null;
                    }
                    String str6 = strOptString == null ? "Episodio " + i2 : strOptString;
                    String strOptString2 = jSONObject.optString("imagen");
                    AbstractC1474fG.g(strOptString2);
                    String str7 = strOptString2.length() > 0 ? strOptString2 : null;
                    String str8 = "lumix-episode-" + j + "|" + strSubstring + "|" + strSubstring2;
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("servidores");
                    if (jSONArrayOptJSONArray != null) {
                        ArrayList arrayList2 = new ArrayList();
                        int length2 = jSONArrayOptJSONArray.length();
                        for (int i3 = 0; i3 < length2; i3++) {
                            C1816io0 c1816io1 = C1816io0.b;
                            JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i3);
                            AbstractC1474fG.i(jSONObject2, "getJSONObject(...)");
                            arrayList2.add(C1816io0.t(jSONObject2));
                        }
                        C1816io0.r.put(str8, arrayList2);
                    }
                    arrayList.add(new C0456Gq(str8, i2, str6, null, str7, null, null, 104));
                }
                return arrayList;
            } catch (Exception unused) {
            }
        }
        return c1233cq;
    }
}
