package o;

import com.skidush.clonex.models.Video$Type;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.eo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1424eo implements Q30 {
    public static final C1424eo b = new C1424eo();
    public static final String c = AbstractC3238xV.a("kBuKR8y3X9A+v3ykTmidvVM+E9wLO55V0aNS3f9ffoAPqH/9XgGzVjB8aVw59YLEfcRHsRHpEN9k+lK0nKqMG0eLDMjwco+H5iafHCTrK4/t");
    public static final OV d = new OV(AbstractC1370eA.h());
    public static final LinkedHashMap e = new LinkedHashMap();
    public static final LinkedHashMap f = new LinkedHashMap();
    public static final LinkedHashMap g = new LinkedHashMap();
    public static final YS h = AbstractC1923jt0.a();

    public static String p(JSONObject jSONObject) throws JSONException {
        String str = W8.a;
        String string = jSONObject.getString("iv");
        AbstractC1474fG.i(string, "getString(...)");
        String string2 = jSONObject.getString("tag");
        AbstractC1474fG.i(string2, "getString(...)");
        String string3 = jSONObject.getString("data");
        AbstractC1474fG.i(string3, "getString(...)");
        return W8.a(string, string2, string3);
    }

    public static byte[] r(String str) {
        ArrayList<String> arrayListV = AbstractC1119bh0.V(str);
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(arrayListV, 10));
        for (String str2 : arrayListV) {
            AbstractC3021v9.e(16);
            arrayList.add(Byte.valueOf((byte) Integer.parseInt(str2, 16)));
        }
        return AbstractC0911Ye.u0(arrayList);
    }

    @Override // o.Q30
    public final Object a(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        return C1233cq.l;
    }

    @Override // o.Q30
    public final Object b(String str, InterfaceC0473Hh interfaceC0473Hh) {
        C1387eR c1387eR;
        if (AbstractC1899jh0.U(str, "tigo-", false)) {
            String str2 = (String) C3068vj0.e.get(str);
            c1387eR = new C1387eR(str, str2 == null ? str : str2, null, null, null, null, null, null, null, null, null, null, null, null, null, 32764);
        } else {
            String str3 = (String) e.get(str);
            c1387eR = new C1387eR(str, str3 == null ? str : str3, null, null, null, null, null, null, null, null, null, null, null, null, null, 32764);
        }
        return c1387eR;
    }

    @Override // o.Q30
    public final Object c(String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        return C1233cq.l;
    }

    @Override // o.Q30
    public final Object d(int i, InterfaceC0473Hh interfaceC0473Hh) {
        return C1233cq.l;
    }

    @Override // o.Q30
    public final Object e(Video$Type video$Type, String str, InterfaceC0473Hh interfaceC0473Hh) {
        if (AbstractC1899jh0.U(str, "tigo-", false)) {
            String str2 = (String) C3068vj0.e.get(str);
            if (str2 == null) {
                str2 = "Tigo Sports";
            }
            return AbstractC2506pt.A(new Ds0(str, str2, null, null, 60));
        }
        String str3 = (String) e.get(str);
        if (str3 == null) {
            str3 = "Claro";
        }
        return AbstractC2506pt.A(new Ds0(str, str3, null, null, 60));
    }

    @Override // o.Q30
    public final String f() {
        return "https://static.vecteezy.com/system/resources/thumbnails/007/688/855/small/tv-logo-free-vector.jpg";
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:? A[LOOP:2: B:87:0x01bd->B:112:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00be  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:58:0x0109  */
    /* JADX WARN: Code duplicated, block: B:65:0x011e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0126  */
    /* JADX WARN: Code duplicated, block: B:69:0x0133  */
    /* JADX WARN: Code duplicated, block: B:71:0x0137  */
    /* JADX WARN: Code duplicated, block: B:72:0x0183  */
    /* JADX WARN: Code duplicated, block: B:73:0x0186  */
    /* JADX WARN: Code duplicated, block: B:74:0x018c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0194  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c3  */
    @Override // o.Q30
    public final Object g(InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C1132bo c1132bo;
        List arrayList;
        C1424eo c1424eo;
        C1424eo c1424eo2;
        List list;
        Iterator it;
        String str;
        ArrayList arrayList2;
        Object objK;
        Throwable thA;
        C1387eR c1387eR;
        String str2;
        Object objK2;
        Throwable thA2;
        String str3;
        Integer numJ;
        int iIntValue;
        if (interfaceC0473Hh instanceof C1132bo) {
            c1132bo = (C1132bo) interfaceC0473Hh;
            int i = c1132bo.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1132bo.p = i - Integer.MIN_VALUE;
            } else {
                c1132bo = new C1132bo(this, interfaceC0473Hh);
            }
        } else {
            c1132bo = new C1132bo(this, interfaceC0473Hh);
        }
        Object objJ = c1132bo.n;
        Object obj = EnumC1706hi.l;
        int i2 = c1132bo.p;
        LinkedHashMap linkedHashMap = g;
        LinkedHashMap linkedHashMap2 = f;
        LinkedHashMap linkedHashMap3 = e;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    arrayList = c1132bo.m;
                    c1424eo = (C1424eo) c1132bo.l;
                    try {
                        Jp0.O(objJ);
                    } catch (Exception e2) {
                        e = e2;
                        e.getMessage();
                    }
                } else if (i2 == 2) {
                    arrayList = c1132bo.m;
                    c1424eo2 = (C1424eo) c1132bo.l;
                    Jp0.O(objJ);
                    c1132bo.l = arrayList;
                    c1132bo.m = null;
                    c1132bo.p = 3;
                    objJ = c1424eo2.q(c1132bo);
                    if (objJ == obj) {
                        return obj;
                    }
                    list = arrayList;
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) c1132bo.l;
                    Jp0.O(objJ);
                }
                for (Map.Entry entry : ((Map) objJ).entrySet()) {
                    str = (String) entry.getKey();
                    List<C0946Zn> list2 = (List) entry.getValue();
                    arrayList2 = new ArrayList();
                    for (C0946Zn c0946Zn : list2) {
                        try {
                            objK = p(c0946Zn.c);
                        } catch (Throwable th) {
                            objK = Jp0.k(th);
                        }
                        thA = C2536q80.a(objK);
                        if (thA == null) {
                            str2 = (String) objK;
                            try {
                                objK2 = p(c0946Zn.d);
                            } catch (Throwable th2) {
                                objK2 = Jp0.k(th2);
                            }
                            thA2 = C2536q80.a(objK2);
                            if (thA2 == null) {
                                str3 = (String) objK2;
                                numJ = AbstractC1802ih0.J(str2);
                                if (numJ != null) {
                                    iIntValue = numJ.intValue();
                                    if (AbstractC1119bh0.W(str3, ":", false)) {
                                        String strN = AbstractC1674hK.n(iIntValue, "claroandina-");
                                        linkedHashMap3.put(strN, c0946Zn.a);
                                        linkedHashMap2.put(strN, new Integer(iIntValue));
                                        linkedHashMap.put(strN, str3);
                                        c1387eR = new C1387eR(strN, c0946Zn.a, null, null, null, null, null, null, c0946Zn.b, null, null, null, null, null, AbstractC3327yN.y(new C1101bX("is_tv_channel", Boolean.TRUE)), 16124);
                                    } else {
                                        String str4 = c0946Zn.a;
                                    }
                                    if (c1387eR != null) {
                                        arrayList2.add(c1387eR);
                                    }
                                } else {
                                    String str5 = c0946Zn.a;
                                }
                            } else {
                                String str6 = c0946Zn.a;
                                thA2.getMessage();
                            }
                        } else {
                            String str7 = c0946Zn.a;
                            thA.getMessage();
                        }
                        c1387eR = null;
                        if (c1387eR != null) {
                            arrayList2.add(c1387eR);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        list.add(new C0882Xb(str, arrayList2));
                    }
                }
                if ((list instanceof Collection) || !list.isEmpty()) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        if (!AbstractC1474fG.b(((C0882Xb) it.next()).a, "FUTBOL PY")) {
                            return list;
                        }
                    }
                }
                throw new IOException("No se pudo construir la lista de canales Paraguay");
            }
            Jp0.O(objJ);
            arrayList = new ArrayList();
            linkedHashMap3.clear();
            linkedHashMap2.clear();
            linkedHashMap.clear();
            try {
                String str8 = C3068vj0.a;
                c1132bo.l = this;
                c1132bo.m = arrayList;
                c1132bo.p = 1;
                objJ = AbstractC1376eG.J(AbstractC1910jn.b, new C2584qj0(2, null), c1132bo);
                if (objJ == obj) {
                    return obj;
                }
                c1424eo = this;
            } catch (Exception e3) {
                e = e3;
                c1424eo = this;
                e.getMessage();
            }
            List list3 = (List) objJ;
            if (!list3.isEmpty()) {
                arrayList.add(new C0882Xb("FUTBOL PY", list3));
            }
            String str9 = W8.a;
            c1132bo.l = c1424eo;
            c1132bo.m = arrayList;
            c1132bo.p = 2;
            if (W8.b(c1132bo) == obj) {
                return obj;
            }
            c1424eo2 = c1424eo;
            c1132bo.l = arrayList;
            c1132bo.m = null;
            c1132bo.p = 3;
            objJ = c1424eo2.q(c1132bo);
            if (objJ == obj) {
                return obj;
            }
            list = arrayList;
            while (r3.hasNext()) {
                str = (String) entry.getKey();
                List<C0946Zn> list4 = (List) entry.getValue();
                arrayList2 = new ArrayList();
                while (r11.hasNext()) {
                    objK = p(c0946Zn.c);
                    thA = C2536q80.a(objK);
                    if (thA == null) {
                        str2 = (String) objK;
                        objK2 = p(c0946Zn.d);
                        thA2 = C2536q80.a(objK2);
                        if (thA2 == null) {
                            str3 = (String) objK2;
                            numJ = AbstractC1802ih0.J(str2);
                            if (numJ != null) {
                                iIntValue = numJ.intValue();
                                if (AbstractC1119bh0.W(str3, ":", false)) {
                                    String str10 = c0946Zn.a;
                                } else {
                                    String strN2 = AbstractC1674hK.n(iIntValue, "claroandina-");
                                    linkedHashMap3.put(strN2, c0946Zn.a);
                                    linkedHashMap2.put(strN2, new Integer(iIntValue));
                                    linkedHashMap.put(strN2, str3);
                                    c1387eR = new C1387eR(strN2, c0946Zn.a, null, null, null, null, null, null, c0946Zn.b, null, null, null, null, null, AbstractC3327yN.y(new C1101bX("is_tv_channel", Boolean.TRUE)), 16124);
                                }
                                if (c1387eR != null) {
                                    arrayList2.add(c1387eR);
                                }
                            } else {
                                String str11 = c0946Zn.a;
                            }
                        } else {
                            String str12 = c0946Zn.a;
                            thA2.getMessage();
                        }
                    } else {
                        String str13 = c0946Zn.a;
                        thA.getMessage();
                    }
                    c1387eR = null;
                    if (c1387eR != null) {
                        arrayList2.add(c1387eR);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    list.add(new C0882Xb(str, arrayList2));
                }
            }
            if (list instanceof Collection) {
                it = list.iterator();
                while (it.hasNext()) {
                    if (!AbstractC1474fG.b(((C0882Xb) it.next()).a, "FUTBOL PY")) {
                        return list;
                    }
                }
            } else {
                it = list.iterator();
                while (it.hasNext()) {
                    if (!AbstractC1474fG.b(((C0882Xb) it.next()).a, "FUTBOL PY")) {
                        return list;
                    }
                }
            }
            throw new IOException("No se pudo construir la lista de canales Paraguay");
        } catch (CancellationException e4) {
            throw e4;
        }
    }

    @Override // o.Q30
    public final String getName() {
        return "CANALES SOLO PARAGUAY";
    }

    @Override // o.Q30
    public final Object h(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2420oz(str, str);
    }

    @Override // o.Q30
    public final Object i(int i, InterfaceC0473Hh interfaceC0473Hh) {
        return C1233cq.l;
    }

    @Override // o.Q30
    public final Object j(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2109lo0(str, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532);
    }

    @Override // o.Q30
    public final Object k(String str, int i, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        throw new Exception("Not yet implemented");
    }

    @Override // o.Q30
    public final boolean l() {
        return false;
    }

    @Override // o.Q30
    public final String m() {
        return "es";
    }

    @Override // o.Q30
    public final Object n(Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new C1229co(ds0, null), interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object o(String str, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        Cdo cdo;
        YS ys;
        Throwable th;
        VS vs;
        VS vs2;
        VS vs3;
        if (interfaceC0473Hh instanceof Cdo) {
            cdo = (Cdo) interfaceC0473Hh;
            int i = cdo.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                cdo.p = i - Integer.MIN_VALUE;
            } else {
                cdo = new Cdo(this, interfaceC0473Hh);
            }
        } else {
            cdo = new Cdo(this, interfaceC0473Hh);
        }
        Object obj = cdo.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = cdo.p;
        LinkedHashMap linkedHashMap = g;
        LinkedHashMap linkedHashMap2 = f;
        C2985uq0 c2985uq0 = C2985uq0.a;
        try {
            if (i2 == 0) {
                Jp0.O(obj);
                if (!AbstractC1899jh0.U(str, "claroandina-", false)) {
                    return c2985uq0;
                }
                if (linkedHashMap2.containsKey(str) && linkedHashMap.containsKey(str)) {
                    return c2985uq0;
                }
                cdo.l = str;
                YS ys2 = h;
                cdo.m = ys2;
                cdo.p = 1;
                Object objD = ys2.d(null, cdo);
                ys = ys2;
                if (objD == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vs = (VS) cdo.l;
                    try {
                        Jp0.O(obj);
                        vs2 = vs;
                        vs3 = vs2;
                        vs3 = ys;
                        ((YS) vs3).e(null);
                        return c2985uq0;
                    } catch (Throwable th2) {
                        th = th2;
                        ((YS) vs).e(null);
                        throw th;
                    }
                }
                YS ys3 = cdo.m;
                String str2 = (String) cdo.l;
                Jp0.O(obj);
                ys = ys3;
                str = str2;
            }
            if (linkedHashMap2.containsKey(str)) {
                if (!linkedHashMap.containsKey(str)) {
                    vs3 = ys;
                }
                vs3 = ys;
                ((YS) vs3).e(null);
                return c2985uq0;
            }
            C1424eo c1424eo = b;
            cdo.l = ys;
            cdo.m = null;
            cdo.p = 2;
            if (c1424eo.g(cdo) == enumC1706hi) {
                return enumC1706hi;
            }
            vs2 = ys;
            vs3 = vs2;
            vs3 = ys;
            ((YS) vs3).e(null);
            return c2985uq0;
        } catch (Throwable th3) {
            YS ys4 = ys;
            th = th3;
            vs = ys4;
            ((YS) vs).e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable q(InterfaceC0473Hh interfaceC0473Hh) throws JSONException, IOException {
        C1034ao c1034ao;
        JSONObject jSONObjectOptJSONObject;
        if (interfaceC0473Hh instanceof C1034ao) {
            c1034ao = (C1034ao) interfaceC0473Hh;
            int i = c1034ao.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1034ao.n = i - Integer.MIN_VALUE;
            } else {
                c1034ao = new C1034ao(this, interfaceC0473Hh);
            }
        } else {
            c1034ao = new C1034ao(this, interfaceC0473Hh);
        }
        Object objC = c1034ao.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c1034ao.n;
        if (i2 == 0) {
            Jp0.O(objC);
            C0560Kq c0560Kq = new C0560Kq();
            c0560Kq.u(c);
            c0560Kq.j("Cache-Control", "no-cache");
            A50 a50C = d.c(c0560Kq.c());
            c1034ao.n = 1;
            objC = Jp0.c(a50C, Long.MAX_VALUE, c1034ao);
            if (objC == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objC);
        }
        Wg0 wg0 = (Wg0) objC;
        int i3 = wg0.a;
        if (200 > i3 || i3 >= 300) {
            throw new IOException("Catálogo Paraguay HTTP " + wg0.a);
        }
        String str = wg0.b;
        if (AbstractC1899jh0.O(str)) {
            throw new IOException("El catálogo Paraguay respondió vacío");
        }
        JSONObject jSONObject = new JSONObject(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        AbstractC1474fG.i(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONArray jSONArray = jSONObject.getJSONArray(next);
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i4 = 0; i4 < length; i4++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                String strOptString = jSONObject2.optString("name");
                AbstractC1474fG.g(strOptString);
                if (strOptString.length() <= 0) {
                    strOptString = null;
                }
                if (strOptString != null) {
                    String strOptString2 = jSONObject2.optString("logo");
                    AbstractC1474fG.g(strOptString2);
                    String str2 = strOptString2.length() > 0 ? strOptString2 : null;
                    JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("group_id");
                    if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObject2.optJSONObject("key_pair")) != null) {
                        arrayList.add(new C0946Zn(strOptString, str2, jSONObjectOptJSONObject2, jSONObjectOptJSONObject));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                AbstractC1474fG.g(next);
                linkedHashMap.put(next, arrayList);
            }
        }
        if (linkedHashMap.isEmpty()) {
            throw new IOException("El catálogo Paraguay no contiene canales válidos");
        }
        return linkedHashMap;
    }
}
