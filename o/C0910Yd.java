package o;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.Yd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0910Yd extends Ph0 implements InterfaceC0775Sy {
    public /* synthetic */ Object m;
    public final /* synthetic */ Map n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f639o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0910Yd(Map map, int i, String str, String str2, String str3, String str4, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = map;
        this.f639o = i;
        this.p = str;
        this.q = str2;
        this.r = str3;
        this.s = str4;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C0910Yd) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C0910Yd c0910Yd = new C0910Yd(this.n, this.f639o, this.p, this.q, this.r, this.s, interfaceC0473Hh);
        c0910Yd.m = obj;
        return c0910Yd;
    }

    @Override // o.R7
    public final Object r(Object obj) throws Exception {
        int i;
        JSONObject jSONObjectOptJSONObject;
        Object objK;
        Object objK2;
        boolean z;
        int i2 = 1;
        Jp0.O(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map map = this.n;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (!AbstractC1899jh0.U(str, "payway_token", false) && !AbstractC1474fG.b(str, "stream_type") && !AbstractC1474fG.b(str, "group_id")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        String str2 = (String) map.get("payway_token");
        Set setEntrySet = map.entrySet();
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Object obj2 : setEntrySet) {
            if (AbstractC1899jh0.U((String) ((Map.Entry) obj2).getKey(), "payway_token_", false)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1016af.O(arrayList, 10));
        for (Map.Entry entry2 : arrayList) {
            arrayList2.add(new C1101bX((String) entry2.getKey(), (String) entry2.getValue()));
        }
        C1101bX c1101bX = str2 != null ? new C1101bX("payway_token", str2) : null;
        ArrayList<C1101bX> arrayListM0 = AbstractC0911Ye.m0(c1101bX != null ? AbstractC2506pt.A(c1101bX) : C1233cq.l, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayListM0.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i = this.f639o;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            String str3 = (String) ((C1101bX) next).m;
            C1600ge c1600ge = C1600ge.a;
            try {
                char[] cArr = new char[i2];
                cArr[0] = '.';
                String str4 = (String) AbstractC0911Ye.e0(i2, AbstractC1119bh0.s0(str3, cArr, 0, 6));
                if (str4 != null) {
                    byte[] bArrDecode = Base64.decode(str4, 11);
                    AbstractC1474fG.g(bArrDecode);
                    JSONObject jSONObjectOptJSONObject2 = new JSONObject(new String(bArrDecode, AbstractC1305dd.a)).optJSONObject("pgs");
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optJSONArray("groups") : null;
                    if (jSONArrayOptJSONArray != null) {
                        Iterable iterableL = U9.L(0, jSONArrayOptJSONArray.length());
                        if (!(iterableL instanceof Collection) || !((Collection) iterableL).isEmpty()) {
                            YF it2 = iterableL.iterator();
                            while (true) {
                                if (it2.n) {
                                    if (AbstractC1474fG.b(jSONArrayOptJSONArray.optString(it2.a()), String.valueOf(i))) {
                                        z = true;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                    break;
                }
                z = false;
                break;
                objK2 = Boolean.valueOf(z);
            } catch (Throwable th) {
                objK2 = Jp0.k(th);
            }
            Object obj3 = Boolean.FALSE;
            if (objK2 instanceof C2439p80) {
                objK2 = obj3;
            }
            if (((Boolean) objK2).booleanValue()) {
                arrayList3.add(next);
            }
            i2 = 1;
        }
        if (!arrayList3.isEmpty()) {
            arrayListM0 = arrayList3;
        }
        if (arrayListM0.isEmpty()) {
            throw new Exception(AbstractC1674hK.n(i, "No hay payway_token en el config para group_id="));
        }
        Exception e = null;
        for (C1101bX c1101bX2 : arrayListM0) {
            String str5 = (String) c1101bX2.m;
            ArrayList arrayList4 = new ArrayList(linkedHashMap.size() + 3);
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                arrayList4.add(new C1101bX((String) entry3.getKey(), (String) entry3.getValue()));
            }
            arrayList4.add(new C1101bX("group_id", String.valueOf(i)));
            arrayList4.add(new C1101bX("stream_type", this.p));
            arrayList4.add(new C1101bX("payway_token", str5));
            C1600ge c1600ge2 = C1600ge.a;
            try {
                JSONObject jSONObject = new JSONObject(C1600ge.b(C1600ge.a(this.q, arrayList4)));
                if (jSONObject.optInt("status") == 200) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("response").getJSONObject("media");
                    String string = jSONObject2.getString("video_url");
                    String strOptString = jSONObject2.optString("challenge");
                    AbstractC1474fG.g(strOptString);
                    String str6 = "";
                    String str7 = str6;
                    if (!AbstractC1899jh0.O(strOptString)) {
                        try {
                            objK = new JSONObject(strOptString).optString("token");
                        } catch (Throwable th2) {
                            objK = Jp0.k(th2);
                        }
                        try {
                            str7 = (String) (objK instanceof C2439p80 ? str6 : objK);
                        } catch (Exception e2) {
                            e = e2;
                            e.getMessage();
                        }
                    }
                    String str8 = this.s;
                    if (str8 != null) {
                        C1600ge c1600ge3 = C1600ge.a;
                        AbstractC1474fG.g(string);
                        if (!C1600ge.f(string, str8)) {
                            e = new Exception("Claro devolvió una variante DRM que no corresponde al canal");
                        }
                    }
                    AbstractC1474fG.g(string);
                    AbstractC1474fG.g(str7);
                    return new C0858Wd(string, str7);
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("errors");
                String strOptString2 = (jSONArrayOptJSONArray2 == null || (jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(0)) == null) ? null : jSONObjectOptJSONObject.optString("message");
                if (strOptString2 == null) {
                    strOptString2 = "desconocido";
                }
                jSONObject.optInt("status");
                e = new Exception("Claro getmedia status=" + jSONObject.optInt("status") + ": " + strOptString2);
            } catch (Exception e3) {
                e = e3;
            }
        }
        if (e != null) {
            throw e;
        }
        throw new Exception(this.r + ": todos los payway_token fallaron para group_id=" + i);
    }
}
