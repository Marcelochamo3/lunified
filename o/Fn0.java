package o;

import android.os.SystemClock;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Fn0 extends Ph0 implements InterfaceC0775Sy {
    public int m;

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Fn0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Fn0(2, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        Object objJ;
        String str;
        String str2;
        String str3 = "id";
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            SystemClock.elapsedRealtime();
            C1816io0 c1816io0 = C1816io0.b;
            String strA = AbstractC3238xV.a("1wyfWd7hFYxjjV/DcV6/5gk9Ft8=");
            String str4 = C1816io0.c;
            this.m = 1;
            objJ = AbstractC1376eG.J(AbstractC1910jn.b, new C1719ho0(true, strA, new byte[0], str4, null), this);
            if (objJ == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
            objJ = obj;
        }
        String str5 = (String) objJ;
        SystemClock.elapsedRealtime();
        JSONArray jSONArray = new JSONArray(str5);
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        int i2 = 0;
        while (i2 < length) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                String string = jSONObject.getString("name");
                JSONArray jSONArray2 = jSONObject.getJSONArray("samples");
                ArrayList arrayList2 = new ArrayList(jSONArray2.length());
                int length2 = jSONArray2.length();
                int i3 = 0;
                while (i3 < length2) {
                    try {
                        JSONObject jSONObject2 = jSONArray2.getJSONObject(i3);
                        if (jSONObject2.has(str3) && jSONObject2.has("name")) {
                            int i4 = jSONObject2.getInt(str3);
                            StringBuilder sb = new StringBuilder();
                            str2 = str3;
                            try {
                                sb.append("tv-");
                                sb.append(i4);
                                String string2 = sb.toString();
                                String string3 = jSONObject2.getString("name");
                                String strOptString = jSONObject2.optString("logo", "");
                                C1330dq c1330dq = C1330dq.l;
                                AbstractC1474fG.g(string3);
                                arrayList2.add(new C1387eR(string2, string3, "", null, null, null, null, null, strOptString, null, null, null, null, null, c1330dq, 15456));
                            } catch (Exception unused) {
                            }
                        } else {
                            str2 = str3;
                        }
                    } catch (Exception unused2) {
                    }
                    i3++;
                    str3 = str2;
                }
                str = str3;
                try {
                    if (!arrayList2.isEmpty()) {
                        arrayList2.size();
                        AbstractC1474fG.g(string);
                        linkedHashMap.put(string, arrayList2);
                        List<C1387eR> listS0 = AbstractC0911Ye.s0(24, arrayList2);
                        ArrayList arrayList3 = new ArrayList(AbstractC1016af.O(listS0, 10));
                        for (C1387eR c1387eR : listS0) {
                            AbstractC1474fG.h(c1387eR, "null cannot be cast to non-null type com.skidush.clonex.adapters.AppAdapter.Item");
                            arrayList3.add(c1387eR);
                        }
                        C0882Xb c0882Xb = new C0882Xb(string, arrayList3);
                        c0882Xb.e = listS0.size();
                        arrayList.add(c0882Xb);
                    }
                } catch (Exception unused3) {
                }
            } catch (Exception unused4) {
                str = str3;
            }
            i2++;
            str3 = str;
        }
        if (arrayList.isEmpty()) {
            throw new IOException("La API no devolvió categorías de canales válidas");
        }
        ConcurrentHashMap concurrentHashMap = C1816io0.e;
        concurrentHashMap.clear();
        concurrentHashMap.putAll(linkedHashMap);
        C1816io0.m = arrayList;
        C1816io0.n = SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        arrayList.size();
        str5.getClass();
        return arrayList;
    }
}
