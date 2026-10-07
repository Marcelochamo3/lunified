package o;

import com.skidush.clonex.models.Video$Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Mn0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Video$Type f401o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mn0(Video$Type video$Type, String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = str;
        this.f401o = video$Type;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Mn0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Mn0(this.f401o, this.n, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        Object objJ;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        C1233cq c1233cq = C1233cq.l;
        if (i == 0) {
            Jp0.O(obj);
            int i2 = 0;
            if (AbstractC1899jh0.U(this.n, "fctvevent-", false)) {
                C2379oe c2379oe = C2379oe.b;
                String str = this.n;
                Video$Type video$Type = this.f401o;
                this.m = 1;
                Object objE = c2379oe.e(video$Type, str, this);
                return objE == enumC1706hi ? enumC1706hi : objE;
            }
            if (!AbstractC1899jh0.U(this.n, "tv-", false)) {
                if (AbstractC1899jh0.U(this.n, "tigo-", false)) {
                    C3084vr0 c3084vr0 = C3084vr0.a;
                    C3084vr0.s = false;
                    String str2 = this.n;
                    String str3 = (String) C3068vj0.e.get(str2);
                    if (str3 == null) {
                        str3 = "Tigo Sports";
                    }
                    return AbstractC2506pt.A(new Ds0(str2, str3, null, null, 60));
                }
                if (AbstractC1899jh0.U(this.n, "lumix-movie-", false)) {
                    List list = (List) C1816io0.r.get(this.n);
                    if (list != null) {
                        return list;
                    }
                    try {
                        JSONArray jSONArray = C1816io0.x("/movies/" + AbstractC1119bh0.l0(this.n, "lumix-movie-") + ".json").getJSONArray("servidores");
                        ArrayList arrayList = new ArrayList();
                        int length = jSONArray.length();
                        while (i2 < length) {
                            C1816io0 c1816io0 = C1816io0.b;
                            JSONObject jSONObject = jSONArray.getJSONObject(i2);
                            AbstractC1474fG.i(jSONObject, "getJSONObject(...)");
                            arrayList.add(C1816io0.t(jSONObject));
                            i2++;
                        }
                        C1816io0.r.put(this.n, arrayList);
                        return arrayList;
                    } catch (Exception unused) {
                        return c1233cq;
                    }
                }
                if (AbstractC1899jh0.U(this.n, "lumix-episode-", false)) {
                    List list2 = (List) C1816io0.r.get(this.n);
                    if (list2 != null) {
                        return list2;
                    }
                    List listT0 = AbstractC1119bh0.t0(AbstractC1119bh0.l0(this.n, "lumix-episode-"), new String[]{"|"}, 0, 6);
                    if (listT0.size() >= 3) {
                        String str4 = (String) listT0.get(0);
                        try {
                            JSONArray jSONArray2 = C1816io0.x("/series/" + ((String) listT0.get(1)) + "/t" + ((String) listT0.get(2)) + ".json").getJSONArray("episodios");
                            int length2 = jSONArray2.length();
                            for (int i3 = 0; i3 < length2; i3++) {
                                JSONObject jSONObject2 = jSONArray2.getJSONObject(i3);
                                if (AbstractC1474fG.b(String.valueOf(jSONObject2.getLong("id")), str4)) {
                                    JSONArray jSONArray3 = jSONObject2.getJSONArray("servidores");
                                    ArrayList arrayList2 = new ArrayList();
                                    int length3 = jSONArray3.length();
                                    while (i2 < length3) {
                                        C1816io0 c1816io1 = C1816io0.b;
                                        JSONObject jSONObject3 = jSONArray3.getJSONObject(i2);
                                        AbstractC1474fG.i(jSONObject3, "getJSONObject(...)");
                                        arrayList2.add(C1816io0.t(jSONObject3));
                                        i2++;
                                    }
                                    C1816io0.r.put(this.n, arrayList2);
                                    return arrayList2;
                                }
                            }
                        } catch (Exception unused2) {
                        }
                    }
                }
                return c1233cq;
            }
            C1816io0 c1816io2 = C1816io0.b;
            String str5 = this.n;
            this.m = 2;
            objJ = AbstractC1376eG.J(AbstractC1910jn.b, new C3270xn0(str5, null), this);
            if (objJ == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i == 1) {
                Jp0.O(obj);
                return obj;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
            objJ = obj;
        }
        C1387eR c1387eR = (C1387eR) objJ;
        if (c1387eR == null) {
            return c1233cq;
        }
        Object obj2 = c1387eR.n.get("stream_uri");
        String str6 = obj2 instanceof String ? (String) obj2 : null;
        if (str6 == null) {
            return c1233cq;
        }
        Object obj3 = c1387eR.n.get("headers");
        Map map = obj3 instanceof Map ? (Map) obj3 : null;
        if (map == null) {
            map = C1330dq.l;
        }
        Object obj4 = c1387eR.n.get("drm_scheme");
        String str7 = obj4 instanceof String ? (String) obj4 : null;
        Object obj5 = c1387eR.n.get("drm_license_uri");
        String str8 = obj5 instanceof String ? (String) obj5 : null;
        LinkedHashMap linkedHashMapD = AbstractC3327yN.D(map);
        String str9 = c1387eR.b;
        if (str9 == null) {
            str9 = "";
        }
        linkedHashMapD.put("_channel_title", str9);
        linkedHashMapD.put("_channel_stream_url", str6);
        Object obj6 = c1387eR.n.get("flow_original_uri");
        String str10 = obj6 instanceof String ? (String) obj6 : null;
        if (str10 != null) {
        }
        Object obj7 = c1387eR.n.get("clearkey_json");
        String str11 = obj7 instanceof String ? (String) obj7 : null;
        if (str11 != null) {
        }
        Object obj8 = c1387eR.n.get("webview");
        Boolean bool = Boolean.TRUE;
        if (AbstractC1474fG.b(obj8, bool)) {
            linkedHashMapD.put("_channel_webview", "true");
        }
        if (AbstractC1474fG.b(c1387eR.n.get("claroandina"), bool)) {
            linkedHashMapD.put("_channel_claroandina", "true");
            Object obj9 = c1387eR.n.get("groupid");
            if (obj9 != null) {
            }
            Object obj10 = c1387eR.n.get("region");
            if (obj10 != null) {
            }
            Object obj11 = c1387eR.n.get("header_api");
            Map map2 = obj11 instanceof Map ? (Map) obj11 : null;
            if (map2 != null) {
                String string = new JSONObject(map2).toString();
                AbstractC1474fG.i(string, "toString(...)");
            }
        }
        Object obj12 = c1387eR.n.get("default_KID");
        if (obj12 != null) {
        }
        if (str7 != null) {
        }
        if (str8 != null) {
            linkedHashMapD.put("_channel_drm_license_uri", str8);
        }
        return AbstractC2506pt.A(new Ds0(this.n, "TV Server", str6, linkedHashMapD, str7, str8));
    }
}
