package o;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.qj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2584qj0 extends Ph0 implements InterfaceC0775Sy {
    public C2196mj0 m;
    public Set n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Set f992o;
    public Map p;
    public List q;
    public Map r;
    public int s;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable w(C2196mj0 c2196mj0, String str, Map map, InterfaceC0473Hh interfaceC0473Hh) throws JSONException, IOException {
        C2487pj0 c2487pj0;
        if (interfaceC0473Hh instanceof C2487pj0) {
            c2487pj0 = (C2487pj0) interfaceC0473Hh;
            int i = c2487pj0.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2487pj0.m = i - Integer.MIN_VALUE;
            } else {
                c2487pj0 = new C2487pj0(interfaceC0473Hh);
            }
        } else {
            c2487pj0 = new C2487pj0(interfaceC0473Hh);
        }
        Object objC = c2487pj0.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c2487pj0.m;
        if (i2 == 0) {
            Jp0.O(objC);
            String str2 = c2196mj0.b + "/" + C2196mj0.a(str, AbstractC3327yN.y(new C1101bX("country", c2196mj0.d)));
            OV ov = C3068vj0.g;
            C0560Kq c0560Kq = new C0560Kq();
            c0560Kq.u(str2);
            for (Map.Entry entry : map.entrySet()) {
                c0560Kq.j((String) entry.getKey(), (String) entry.getValue());
            }
            A50 a50C = ov.c(c0560Kq.c());
            c2487pj0.m = 1;
            objC = Jp0.c(a50C, Long.MAX_VALUE, c2487pj0);
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
            throw new IOException("HTTP " + wg0.a);
        }
        String str3 = wg0.b;
        if (!(!AbstractC1899jh0.O(str3))) {
            str3 = null;
        }
        if (str3 == null) {
            return C1233cq.l;
        }
        JSONArray jSONArray = new JSONArray(str3);
        C3421zK c3421zK = new C3421zK();
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i4);
            AbstractC1474fG.i(jSONObject, "getJSONObject(...)");
            c3421zK.add(jSONObject);
        }
        return AbstractC2506pt.h(c3421zK);
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2584qj0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2584qj0(2, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0245  */
    /* JADX WARN: Code duplicated, block: B:103:0x024c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:104:0x024d  */
    /* JADX WARN: Code duplicated, block: B:107:0x026b  */
    /* JADX WARN: Code duplicated, block: B:121:0x02b7 A[Catch: Exception -> 0x03fe, TRY_ENTER, TRY_LEAVE, TryCatch #12 {Exception -> 0x03fe, blocks: (B:113:0x029c, B:126:0x02c9, B:132:0x02db, B:135:0x02e5, B:121:0x02b7), top: B:216:0x029c }] */
    /* JADX WARN: Code duplicated, block: B:123:0x02bd A[Catch: Exception -> 0x02af, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x02af, blocks: (B:116:0x02a6, B:123:0x02bd), top: B:197:0x02a6 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:131:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:134:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:135:0x02e5 A[Catch: Exception -> 0x03fe, TRY_LEAVE, TryCatch #12 {Exception -> 0x03fe, blocks: (B:113:0x029c, B:126:0x02c9, B:132:0x02db, B:135:0x02e5, B:121:0x02b7), top: B:216:0x029c }] */
    /* JADX WARN: Code duplicated, block: B:137:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:140:0x02f3 A[Catch: Exception -> 0x0314, TryCatch #9 {Exception -> 0x0314, blocks: (B:153:0x0346, B:161:0x0365, B:163:0x036e, B:138:0x02ed, B:140:0x02f3, B:142:0x02f9, B:144:0x02ff, B:148:0x031a), top: B:212:0x0346 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0316  */
    /* JADX WARN: Code duplicated, block: B:148:0x031a A[Catch: Exception -> 0x0314, TRY_LEAVE, TryCatch #9 {Exception -> 0x0314, blocks: (B:153:0x0346, B:161:0x0365, B:163:0x036e, B:138:0x02ed, B:140:0x02f3, B:142:0x02f9, B:144:0x02ff, B:148:0x031a), top: B:212:0x0346 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0332  */
    /* JADX WARN: Code duplicated, block: B:156:0x0355 A[Catch: Exception -> 0x03fa, TRY_ENTER, TRY_LEAVE, TryCatch #16 {Exception -> 0x03fa, blocks: (B:151:0x0334, B:156:0x0355, B:166:0x0384, B:171:0x03a9), top: B:223:0x0334 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0362  */
    /* JADX WARN: Code duplicated, block: B:161:0x0365 A[Catch: Exception -> 0x0314, TRY_ENTER, TryCatch #9 {Exception -> 0x0314, blocks: (B:153:0x0346, B:161:0x0365, B:163:0x036e, B:138:0x02ed, B:140:0x02f3, B:142:0x02f9, B:144:0x02ff, B:148:0x031a), top: B:212:0x0346 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x036e A[Catch: Exception -> 0x0314, TRY_LEAVE, TryCatch #9 {Exception -> 0x0314, blocks: (B:153:0x0346, B:161:0x0365, B:163:0x036e, B:138:0x02ed, B:140:0x02f3, B:142:0x02f9, B:144:0x02ff, B:148:0x031a), top: B:212:0x0346 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0382  */
    /* JADX WARN: Code duplicated, block: B:168:0x03a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:169:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:170:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:197:0x02a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0346 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x01f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x02c9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x015d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x015e  */
    /* JADX WARN: Code duplicated, block: B:52:0x016b A[Catch: CancellationException -> 0x0093, Exception -> 0x018d, TryCatch #2 {Exception -> 0x018d, blocks: (B:49:0x015f, B:50:0x0165, B:52:0x016b, B:54:0x017d, B:56:0x0189), top: B:199:0x015f }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x01bb A[Catch: CancellationException -> 0x006e, Exception -> 0x01e3, TRY_LEAVE, TryCatch #17 {CancellationException -> 0x006e, blocks: (B:18:0x0059, B:64:0x01af, B:65:0x01b5, B:67:0x01bb, B:70:0x01cf, B:72:0x01d8, B:61:0x0197), top: B:201:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d8 A[Catch: CancellationException -> 0x006e, Exception -> 0x01dc, TRY_LEAVE, TryCatch #13 {Exception -> 0x01dc, blocks: (B:70:0x01cf, B:72:0x01d8), top: B:218:0x01cf }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01de  */
    /* JADX WARN: Code duplicated, block: B:85:0x020c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:86:0x020d  */
    /* JADX WARN: Code duplicated, block: B:90:0x021a A[Catch: CancellationException -> 0x0042, Exception -> 0x023b, TryCatch #3 {CancellationException -> 0x0042, blocks: (B:10:0x002a, B:87:0x020e, B:88:0x0214, B:90:0x021a, B:92:0x022c, B:94:0x0237, B:81:0x01f4, B:83:0x0201), top: B:201:0x0014 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:148:0x031a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:163:0x036e, please report this as an issue */
    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        Object objB;
        C2196mj0 c2196mj0;
        Object objJ;
        Set linkedHashSet;
        Set linkedHashSet2;
        Map linkedHashMap;
        ArrayList arrayList;
        Object obj2;
        C1233cq c1233cq;
        String str;
        Map mapZ;
        Map map;
        List list;
        Object objW;
        C2196mj0 c2196mj1;
        List list2;
        Object objW2;
        String strP;
        String str2;
        Set set;
        Map map2;
        List list3;
        Object objW3;
        Set set2;
        String strP2;
        C2196mj0 c2196mj2;
        Map map3;
        ArrayList arrayList2;
        LinkedHashSet linkedHashSet3;
        Iterator it;
        JSONObject jSONObject;
        Iterator it2;
        Object obj3;
        String strP3;
        boolean zContains;
        String strP4;
        String strP5;
        String strP6;
        boolean zContains2;
        Set set3;
        String strP7;
        String str3;
        String string;
        String strA;
        String strP8;
        String str4;
        String str5;
        String strP9;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.s;
        C1233cq c1233cq2 = C1233cq.l;
        try {
            try {
                try {
                    try {
                        try {
                            if (i != 0) {
                                if (i == 1) {
                                    Jp0.O(obj);
                                    objB = obj;
                                } else {
                                    if (i == 2) {
                                        c2196mj0 = this.m;
                                        Jp0.O(obj);
                                        objJ = obj;
                                        C2390oj0 c2390oj0 = (C2390oj0) objJ;
                                        linkedHashSet = new LinkedHashSet();
                                        linkedHashSet2 = new LinkedHashSet();
                                        linkedHashMap = new LinkedHashMap();
                                        arrayList = new ArrayList();
                                        String str6 = C3068vj0.a;
                                        Map mapE = C3068vj0.e(c2390oj0.a, c2390oj0.b);
                                        obj2 = "Eventos Tigo Sports";
                                        c1233cq = c1233cq2;
                                        str = "next";
                                        mapZ = AbstractC3327yN.z(new C1101bX("Authorization", "Bearer " + c2390oj0.a), new C1101bX("Origin", "https://www.tigosports.com.py"), new C1101bX("Referer", "https://www.tigosports.com.py/"), new C1101bX("Accept", "application/json, text/plain, */*"), new C1101bX("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36"));
                                        String str7 = c2196mj0.e;
                                        this.m = c2196mj0;
                                        this.n = linkedHashSet;
                                        this.f992o = linkedHashSet2;
                                        this.p = linkedHashMap;
                                        this.q = arrayList;
                                        this.r = mapZ;
                                        this.s = 3;
                                        objW = w(c2196mj0, str7, mapE, this);
                                        if (objW == enumC1706hi) {
                                            return enumC1706hi;
                                        }
                                        list = arrayList;
                                        for (JSONObject jSONObject2 : (Iterable) objW) {
                                            strP = Jp0.p(jSONObject2, c2196mj0.l);
                                            if (strP.length() > 0) {
                                                linkedHashSet2.add(strP);
                                                linkedHashMap.put(strP, "live");
                                                if (linkedHashSet.add(strP)) {
                                                    list.add(jSONObject2);
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                        map = mapZ;
                                        List list4 = list;
                                        c2196mj1 = c2196mj0;
                                        list2 = list4;
                                        String str8 = c2196mj1.f;
                                        this.m = c2196mj1;
                                        this.n = linkedHashSet;
                                        this.f992o = linkedHashSet2;
                                        this.p = linkedHashMap;
                                        this.q = list2;
                                        this.r = map;
                                        this.s = 4;
                                        objW2 = w(c2196mj1, str8, map, this);
                                        if (objW2 == enumC1706hi) {
                                            return enumC1706hi;
                                        }
                                        for (JSONObject jSONObject3 : (Iterable) objW2) {
                                            strP2 = Jp0.p(jSONObject3, c2196mj1.l);
                                            if (strP2.length() > 0) {
                                                str2 = str;
                                                j$.util.Map.EL.putIfAbsent(linkedHashMap, strP2, str2);
                                                if (linkedHashSet.add(strP2)) {
                                                    list2.add(jSONObject3);
                                                } else {
                                                    continue;
                                                }
                                            } else {
                                                str2 = str;
                                            }
                                            str = str2;
                                        }
                                        str2 = str;
                                        set = linkedHashSet2;
                                        List list5 = list2;
                                        map2 = map;
                                        list3 = list5;
                                        if (list3.isEmpty()) {
                                            String str9 = c2196mj1.g;
                                            this.m = c2196mj1;
                                            this.n = linkedHashSet;
                                            this.f992o = set;
                                            this.p = linkedHashMap;
                                            this.q = list3;
                                            this.r = null;
                                            this.s = 5;
                                            objW3 = w(c2196mj1, str9, map2, this);
                                            if (objW3 == enumC1706hi) {
                                                return enumC1706hi;
                                            }
                                            set2 = linkedHashSet;
                                        }
                                        if (list3.isEmpty()) {
                                            return c1233cq;
                                        }
                                        arrayList2 = new ArrayList();
                                        linkedHashSet3 = new LinkedHashSet();
                                        C3068vj0.e.clear();
                                        C3068vj0.f.clear();
                                        it = list3.iterator();
                                        while (it.hasNext()) {
                                            jSONObject = (JSONObject) it.next();
                                            strP3 = Jp0.p(jSONObject, c2196mj1.l);
                                            if (strP3.length() != 0) {
                                                zContains = set.contains(strP3);
                                                strP4 = Jp0.p(jSONObject, c2196mj1.n);
                                                String strP10 = Jp0.p(jSONObject, c2196mj1.f919o);
                                                strP5 = Jp0.p(jSONObject, c2196mj1.p);
                                                strP6 = Jp0.p(jSONObject, c2196mj1.q);
                                                it2 = it;
                                                zContains2 = c2196mj1.t.contains(strP6);
                                                set3 = c2196mj1.v;
                                                if (zContains2) {
                                                    if (!set3.contains(strP4)) {
                                                    }
                                                    strP7 = Jp0.p(jSONObject, c2196mj1.m);
                                                    if (set3.contains(strP7)) {
                                                        strP7 = null;
                                                    }
                                                    if (strP7 == null) {
                                                        strP7 = "";
                                                    }
                                                    if (strP7.length() > 0) {
                                                        str3 = strP7;
                                                        obj3 = obj2;
                                                    } else {
                                                        if (strP4.length() > 0) {
                                                            obj3 = obj2;
                                                            if (AbstractC1474fG.b(strP4, obj3)) {
                                                            }
                                                        } else {
                                                            obj3 = obj2;
                                                        }
                                                        if (zContains) {
                                                            str3 = "En vivo " + (arrayList2.size() + 1);
                                                        } else {
                                                            str3 = "Próximo evento";
                                                        }
                                                    }
                                                    string = AbstractC1119bh0.E0(str3).toString();
                                                    strA = C3068vj0.a(string);
                                                    if (strA.length() <= 0) {
                                                        strP8 = Jp0.p(jSONObject, c2196mj1.r);
                                                        if (strP8.length() <= 0) {
                                                            strP8 = null;
                                                        }
                                                        if (strP8 != null) {
                                                            if (AbstractC1899jh0.U(strP8, "//", false)) {
                                                                strP8 = "https:" + strP8;
                                                            }
                                                            str4 = strP8;
                                                        } else {
                                                            str4 = null;
                                                        }
                                                        String str10 = "tigo-" + strP3;
                                                        C3068vj0.e.put(str10, string);
                                                        LinkedHashMap linkedHashMap2 = C3068vj0.f;
                                                        str5 = (String) linkedHashMap.get(strP3);
                                                        if (str5 == null) {
                                                            if (zContains) {
                                                                str5 = "live";
                                                            } else {
                                                                str5 = str2;
                                                            }
                                                        }
                                                        linkedHashMap2.put(str10, str5);
                                                        C1101bX c1101bX = new C1101bX("is_tv_channel", Boolean.TRUE);
                                                        C1101bX c1101bX2 = new C1101bX("is_live_channel", Boolean.valueOf(zContains));
                                                        C1101bX[] c1101bXArr = new C1101bX[2];
                                                        c1101bXArr[0] = c1101bX;
                                                        c1101bXArr[1] = c1101bX2;
                                                        arrayList2.add(new C1387eR(str10, string, strP6, null, null, null, null, null, str4, null, null, null, null, null, AbstractC3327yN.z(c1101bXArr), 16120));
                                                    } else if (linkedHashSet3.add(strA)) {
                                                        strP8 = Jp0.p(jSONObject, c2196mj1.r);
                                                        if (strP8.length() <= 0) {
                                                            strP8 = null;
                                                        }
                                                        if (strP8 != null) {
                                                            if (AbstractC1899jh0.U(strP8, "//", false)) {
                                                                strP8 = "https:" + strP8;
                                                            }
                                                            str4 = strP8;
                                                        } else {
                                                            str4 = null;
                                                        }
                                                        String str11 = "tigo-" + strP3;
                                                        C3068vj0.e.put(str11, string);
                                                        LinkedHashMap linkedHashMap3 = C3068vj0.f;
                                                        str5 = (String) linkedHashMap.get(strP3);
                                                        if (str5 == null) {
                                                            if (zContains) {
                                                                str5 = "live";
                                                            } else {
                                                                str5 = str2;
                                                            }
                                                        }
                                                        linkedHashMap3.put(str11, str5);
                                                        C1101bX c1101bX3 = new C1101bX("is_tv_channel", Boolean.TRUE);
                                                        C1101bX c1101bX4 = new C1101bX("is_live_channel", Boolean.valueOf(zContains));
                                                        C1101bX[] c1101bXArr2 = new C1101bX[2];
                                                        c1101bXArr2[0] = c1101bX3;
                                                        c1101bXArr2[1] = c1101bX4;
                                                        arrayList2.add(new C1387eR(str11, string, strP6, null, null, null, null, null, str4, null, null, null, null, null, AbstractC3327yN.z(c1101bXArr2), 16120));
                                                    }
                                                    obj2 = obj3;
                                                    it = it2;
                                                } else {
                                                    if (c2196mj1.u.contains(strP5)) {
                                                        if (!set3.contains(strP4)) {
                                                        }
                                                    }
                                                    strP7 = Jp0.p(jSONObject, c2196mj1.m);
                                                    if (set3.contains(strP7)) {
                                                        strP7 = null;
                                                    }
                                                    if (strP7 == null) {
                                                        strP7 = "";
                                                    }
                                                    if (strP7.length() > 0) {
                                                        str3 = strP7;
                                                        obj3 = obj2;
                                                    } else {
                                                        if (strP4.length() > 0) {
                                                            obj3 = obj2;
                                                            if (AbstractC1474fG.b(strP4, obj3)) {
                                                            }
                                                        } else {
                                                            obj3 = obj2;
                                                        }
                                                        if (zContains) {
                                                            str3 = "En vivo " + (arrayList2.size() + 1);
                                                        } else {
                                                            str3 = "Próximo evento";
                                                        }
                                                    }
                                                    string = AbstractC1119bh0.E0(str3).toString();
                                                    strA = C3068vj0.a(string);
                                                    if (strA.length() <= 0) {
                                                        strP8 = Jp0.p(jSONObject, c2196mj1.r);
                                                        if (strP8.length() <= 0) {
                                                            strP8 = null;
                                                        }
                                                        if (strP8 != null) {
                                                            if (AbstractC1899jh0.U(strP8, "//", false)) {
                                                                strP8 = "https:" + strP8;
                                                            }
                                                            str4 = strP8;
                                                        } else {
                                                            str4 = null;
                                                        }
                                                        String str12 = "tigo-" + strP3;
                                                        C3068vj0.e.put(str12, string);
                                                        LinkedHashMap linkedHashMap4 = C3068vj0.f;
                                                        str5 = (String) linkedHashMap.get(strP3);
                                                        if (str5 == null) {
                                                            if (zContains) {
                                                                str5 = "live";
                                                            } else {
                                                                str5 = str2;
                                                            }
                                                        }
                                                        linkedHashMap4.put(str12, str5);
                                                        C1101bX c1101bX5 = new C1101bX("is_tv_channel", Boolean.TRUE);
                                                        C1101bX c1101bX6 = new C1101bX("is_live_channel", Boolean.valueOf(zContains));
                                                        C1101bX[] c1101bXArr3 = new C1101bX[2];
                                                        c1101bXArr3[0] = c1101bX5;
                                                        c1101bXArr3[1] = c1101bX6;
                                                        arrayList2.add(new C1387eR(str12, string, strP6, null, null, null, null, null, str4, null, null, null, null, null, AbstractC3327yN.z(c1101bXArr3), 16120));
                                                    } else if (linkedHashSet3.add(strA)) {
                                                        strP8 = Jp0.p(jSONObject, c2196mj1.r);
                                                        if (strP8.length() <= 0) {
                                                            strP8 = null;
                                                        }
                                                        if (strP8 != null) {
                                                            if (AbstractC1899jh0.U(strP8, "//", false)) {
                                                                strP8 = "https:" + strP8;
                                                            }
                                                            str4 = strP8;
                                                        } else {
                                                            str4 = null;
                                                        }
                                                        String str13 = "tigo-" + strP3;
                                                        C3068vj0.e.put(str13, string);
                                                        LinkedHashMap linkedHashMap5 = C3068vj0.f;
                                                        str5 = (String) linkedHashMap.get(strP3);
                                                        if (str5 == null) {
                                                            if (zContains) {
                                                                str5 = "live";
                                                            } else {
                                                                str5 = str2;
                                                            }
                                                        }
                                                        linkedHashMap5.put(str13, str5);
                                                        C1101bX c1101bX7 = new C1101bX("is_tv_channel", Boolean.TRUE);
                                                        C1101bX c1101bX8 = new C1101bX("is_live_channel", Boolean.valueOf(zContains));
                                                        C1101bX[] c1101bXArr4 = new C1101bX[2];
                                                        c1101bXArr4[0] = c1101bX7;
                                                        c1101bXArr4[1] = c1101bX8;
                                                        arrayList2.add(new C1387eR(str13, string, strP6, null, null, null, null, null, str4, null, null, null, null, null, AbstractC3327yN.z(c1101bXArr4), 16120));
                                                    }
                                                    obj2 = obj3;
                                                    it = it2;
                                                }
                                            }
                                        }
                                        return arrayList2;
                                    }
                                    if (i == 3) {
                                        map = this.r;
                                        list = this.q;
                                        linkedHashMap = this.p;
                                        linkedHashSet2 = this.f992o;
                                        linkedHashSet = this.n;
                                        c2196mj0 = this.m;
                                        try {
                                            Jp0.O(obj);
                                            mapZ = map;
                                            obj2 = "Eventos Tigo Sports";
                                            c1233cq = c1233cq2;
                                            str = "next";
                                            objW = obj;
                                            try {
                                                while (r0.hasNext()) {
                                                    strP = Jp0.p(jSONObject2, c2196mj0.l);
                                                    if (strP.length() > 0) {
                                                        linkedHashSet2.add(strP);
                                                        linkedHashMap.put(strP, "live");
                                                        if (linkedHashSet.add(strP)) {
                                                            list.add(jSONObject2);
                                                        } else {
                                                            continue;
                                                        }
                                                    }
                                                }
                                            } catch (Exception unused) {
                                            }
                                            map = mapZ;
                                        } catch (Exception unused2) {
                                            obj2 = "Eventos Tigo Sports";
                                            c1233cq = c1233cq2;
                                            str = "next";
                                        }
                                        List list6 = list;
                                        c2196mj1 = c2196mj0;
                                        list2 = list6;
                                        try {
                                            String str14 = c2196mj1.f;
                                            this.m = c2196mj1;
                                            this.n = linkedHashSet;
                                            this.f992o = linkedHashSet2;
                                            this.p = linkedHashMap;
                                            this.q = list2;
                                            this.r = map;
                                            this.s = 4;
                                            objW2 = w(c2196mj1, str14, map, this);
                                            if (objW2 == enumC1706hi) {
                                                return enumC1706hi;
                                            }
                                            while (r3.hasNext()) {
                                                strP2 = Jp0.p(jSONObject3, c2196mj1.l);
                                                if (strP2.length() > 0) {
                                                    str2 = str;
                                                    j$.util.Map.EL.putIfAbsent(linkedHashMap, strP2, str2);
                                                    if (linkedHashSet.add(strP2)) {
                                                        list2.add(jSONObject3);
                                                    } else {
                                                        continue;
                                                    }
                                                } else {
                                                    str2 = str;
                                                }
                                                str = str2;
                                            }
                                            str2 = str;
                                        } catch (Exception unused3) {
                                            str2 = str;
                                            set = linkedHashSet2;
                                            List list7 = list2;
                                            map2 = map;
                                            list3 = list7;
                                            if (list3.isEmpty()) {
                                                String str15 = c2196mj1.g;
                                                this.m = c2196mj1;
                                                this.n = linkedHashSet;
                                                this.f992o = set;
                                                this.p = linkedHashMap;
                                                this.q = list3;
                                                this.r = null;
                                                this.s = 5;
                                                objW3 = w(c2196mj1, str15, map2, this);
                                                if (objW3 == enumC1706hi) {
                                                    return enumC1706hi;
                                                }
                                                set2 = linkedHashSet;
                                                for (JSONObject jSONObject4 : (Iterable) objW3) {
                                                    strP9 = Jp0.p(jSONObject4, c2196mj1.l);
                                                    if (strP9.length() > 0) {
                                                        j$.util.Map.EL.putIfAbsent(linkedHashMap, strP9, "replay");
                                                        if (set2.add(strP9)) {
                                                            list3.add(jSONObject4);
                                                        }
                                                    }
                                                }
                                            }
                                            if (list3.isEmpty()) {
                                                return c1233cq;
                                            }
                                            arrayList2 = new ArrayList();
                                            linkedHashSet3 = new LinkedHashSet();
                                            C3068vj0.e.clear();
                                            C3068vj0.f.clear();
                                            it = list3.iterator();
                                            while (it.hasNext()) {
                                                jSONObject = (JSONObject) it.next();
                                                strP3 = Jp0.p(jSONObject, c2196mj1.l);
                                                if (strP3.length() != 0) {
                                                    zContains = set.contains(strP3);
                                                    strP4 = Jp0.p(jSONObject, c2196mj1.n);
                                                    String strP11 = Jp0.p(jSONObject, c2196mj1.f919o);
                                                    strP5 = Jp0.p(jSONObject, c2196mj1.p);
                                                    strP6 = Jp0.p(jSONObject, c2196mj1.q);
                                                    it2 = it;
                                                    zContains2 = c2196mj1.t.contains(strP6);
                                                    set3 = c2196mj1.v;
                                                    if (zContains2) {
                                                        if (c2196mj1.u.contains(strP5)) {
                                                            if (!set3.contains(strP4)) {
                                                            }
                                                        }
                                                        strP7 = Jp0.p(jSONObject, c2196mj1.m);
                                                        if (set3.contains(strP7)) {
                                                            strP7 = null;
                                                        }
                                                        if (strP7 == null) {
                                                            strP7 = "";
                                                        }
                                                        if (strP7.length() > 0) {
                                                            str3 = strP7;
                                                            obj3 = obj2;
                                                        } else {
                                                            if (strP4.length() > 0) {
                                                                obj3 = obj2;
                                                                if (AbstractC1474fG.b(strP4, obj3)) {
                                                                }
                                                            } else {
                                                                obj3 = obj2;
                                                            }
                                                            if (zContains) {
                                                                str3 = "En vivo " + (arrayList2.size() + 1);
                                                            } else {
                                                                str3 = "Próximo evento";
                                                            }
                                                        }
                                                        string = AbstractC1119bh0.E0(str3).toString();
                                                        strA = C3068vj0.a(string);
                                                        if (strA.length() <= 0) {
                                                            strP8 = Jp0.p(jSONObject, c2196mj1.r);
                                                            if (strP8.length() <= 0) {
                                                                strP8 = null;
                                                            }
                                                            if (strP8 != null) {
                                                                if (AbstractC1899jh0.U(strP8, "//", false)) {
                                                                    strP8 = "https:" + strP8;
                                                                }
                                                                str4 = strP8;
                                                            } else {
                                                                str4 = null;
                                                            }
                                                            String str16 = "tigo-" + strP3;
                                                            C3068vj0.e.put(str16, string);
                                                            LinkedHashMap linkedHashMap6 = C3068vj0.f;
                                                            str5 = (String) linkedHashMap.get(strP3);
                                                            if (str5 == null) {
                                                                if (zContains) {
                                                                    str5 = "live";
                                                                } else {
                                                                    str5 = str2;
                                                                }
                                                            }
                                                            linkedHashMap6.put(str16, str5);
                                                            C1101bX c1101bX9 = new C1101bX("is_tv_channel", Boolean.TRUE);
                                                            C1101bX c1101bX10 = new C1101bX("is_live_channel", Boolean.valueOf(zContains));
                                                            C1101bX[] c1101bXArr5 = new C1101bX[2];
                                                            c1101bXArr5[0] = c1101bX9;
                                                            c1101bXArr5[1] = c1101bX10;
                                                            arrayList2.add(new C1387eR(str16, string, strP6, null, null, null, null, null, str4, null, null, null, null, null, AbstractC3327yN.z(c1101bXArr5), 16120));
                                                        } else if (linkedHashSet3.add(strA)) {
                                                            strP8 = Jp0.p(jSONObject, c2196mj1.r);
                                                            if (strP8.length() <= 0) {
                                                                strP8 = null;
                                                            }
                                                            if (strP8 != null) {
                                                                if (AbstractC1899jh0.U(strP8, "//", false)) {
                                                                    strP8 = "https:" + strP8;
                                                                }
                                                                str4 = strP8;
                                                            } else {
                                                                str4 = null;
                                                            }
                                                            String str17 = "tigo-" + strP3;
                                                            C3068vj0.e.put(str17, string);
                                                            LinkedHashMap linkedHashMap7 = C3068vj0.f;
                                                            str5 = (String) linkedHashMap.get(strP3);
                                                            if (str5 == null) {
                                                                if (zContains) {
                                                                    str5 = "live";
                                                                } else {
                                                                    str5 = str2;
                                                                }
                                                            }
                                                            linkedHashMap7.put(str17, str5);
                                                            C1101bX c1101bX11 = new C1101bX("is_tv_channel", Boolean.TRUE);
                                                            C1101bX c1101bX12 = new C1101bX("is_live_channel", Boolean.valueOf(zContains));
                                                            C1101bX[] c1101bXArr6 = new C1101bX[2];
                                                            c1101bXArr6[0] = c1101bX11;
                                                            c1101bXArr6[1] = c1101bX12;
                                                            arrayList2.add(new C1387eR(str17, string, strP6, null, null, null, null, null, str4, null, null, null, null, null, AbstractC3327yN.z(c1101bXArr6), 16120));
                                                        }
                                                        obj2 = obj3;
                                                        it = it2;
                                                    } else {
                                                        if (!set3.contains(strP4)) {
                                                        }
                                                        strP7 = Jp0.p(jSONObject, c2196mj1.m);
                                                        if (set3.contains(strP7)) {
                                                            strP7 = null;
                                                        }
                                                        if (strP7 == null) {
                                                            strP7 = "";
                                                        }
                                                        if (strP7.length() > 0) {
                                                            str3 = strP7;
                                                            obj3 = obj2;
                                                        } else {
                                                            if (strP4.length() > 0) {
                                                                obj3 = obj2;
                                                                if (AbstractC1474fG.b(strP4, obj3)) {
                                                                }
                                                            } else {
                                                                obj3 = obj2;
                                                            }
                                                            if (zContains) {
                                                                str3 = "En vivo " + (arrayList2.size() + 1);
                                                            } else {
                                                                str3 = "Próximo evento";
                                                            }
                                                        }
                                                        string = AbstractC1119bh0.E0(str3).toString();
                                                        strA = C3068vj0.a(string);
                                                        if (strA.length() <= 0) {
                                                            strP8 = Jp0.p(jSONObject, c2196mj1.r);
                                                            if (strP8.length() <= 0) {
                                                                strP8 = null;
                                                            }
                                                            if (strP8 != null) {
                                                                if (AbstractC1899jh0.U(strP8, "//", false)) {
                                                                    strP8 = "https:" + strP8;
                                                                }
                                                                str4 = strP8;
                                                            } else {
                                                                str4 = null;
                                                            }
                                                            String str18 = "tigo-" + strP3;
                                                            C3068vj0.e.put(str18, string);
                                                            LinkedHashMap linkedHashMap8 = C3068vj0.f;
                                                            str5 = (String) linkedHashMap.get(strP3);
                                                            if (str5 == null) {
                                                                if (zContains) {
                                                                    str5 = "live";
                                                                } else {
                                                                    str5 = str2;
                                                                }
                                                            }
                                                            linkedHashMap8.put(str18, str5);
                                                            C1101bX c1101bX13 = new C1101bX("is_tv_channel", Boolean.TRUE);
                                                            C1101bX c1101bX14 = new C1101bX("is_live_channel", Boolean.valueOf(zContains));
                                                            C1101bX[] c1101bXArr7 = new C1101bX[2];
                                                            c1101bXArr7[0] = c1101bX13;
                                                            c1101bXArr7[1] = c1101bX14;
                                                            arrayList2.add(new C1387eR(str18, string, strP6, null, null, null, null, null, str4, null, null, null, null, null, AbstractC3327yN.z(c1101bXArr7), 16120));
                                                        } else if (linkedHashSet3.add(strA)) {
                                                            strP8 = Jp0.p(jSONObject, c2196mj1.r);
                                                            if (strP8.length() <= 0) {
                                                                strP8 = null;
                                                            }
                                                            if (strP8 != null) {
                                                                if (AbstractC1899jh0.U(strP8, "//", false)) {
                                                                    strP8 = "https:" + strP8;
                                                                }
                                                                str4 = strP8;
                                                            } else {
                                                                str4 = null;
                                                            }
                                                            String str19 = "tigo-" + strP3;
                                                            C3068vj0.e.put(str19, string);
                                                            LinkedHashMap linkedHashMap9 = C3068vj0.f;
                                                            str5 = (String) linkedHashMap.get(strP3);
                                                            if (str5 == null) {
                                                                if (zContains) {
                                                                    str5 = "live";
                                                                } else {
                                                                    str5 = str2;
                                                                }
                                                            }
                                                            linkedHashMap9.put(str19, str5);
                                                            C1101bX c1101bX15 = new C1101bX("is_tv_channel", Boolean.TRUE);
                                                            C1101bX c1101bX16 = new C1101bX("is_live_channel", Boolean.valueOf(zContains));
                                                            C1101bX[] c1101bXArr8 = new C1101bX[2];
                                                            c1101bXArr8[0] = c1101bX15;
                                                            c1101bXArr8[1] = c1101bX16;
                                                            arrayList2.add(new C1387eR(str19, string, strP6, null, null, null, null, null, str4, null, null, null, null, null, AbstractC3327yN.z(c1101bXArr8), 16120));
                                                        }
                                                        obj2 = obj3;
                                                        it = it2;
                                                    }
                                                }
                                            }
                                            return arrayList2;
                                        }
                                        set = linkedHashSet2;
                                        List list8 = list2;
                                        map2 = map;
                                        list3 = list8;
                                        if (list3.isEmpty()) {
                                            String str110 = c2196mj1.g;
                                            this.m = c2196mj1;
                                            this.n = linkedHashSet;
                                            this.f992o = set;
                                            this.p = linkedHashMap;
                                            this.q = list3;
                                            this.r = null;
                                            this.s = 5;
                                            objW3 = w(c2196mj1, str110, map2, this);
                                            if (objW3 == enumC1706hi) {
                                                return enumC1706hi;
                                            }
                                            set2 = linkedHashSet;
                                        }
                                        if (list3.isEmpty()) {
                                            return c1233cq;
                                        }
                                        arrayList2 = new ArrayList();
                                        linkedHashSet3 = new LinkedHashSet();
                                        C3068vj0.e.clear();
                                        C3068vj0.f.clear();
                                        it = list3.iterator();
                                        while (it.hasNext()) {
                                            jSONObject = (JSONObject) it.next();
                                            strP3 = Jp0.p(jSONObject, c2196mj1.l);
                                            if (strP3.length() != 0) {
                                                zContains = set.contains(strP3);
                                                strP4 = Jp0.p(jSONObject, c2196mj1.n);
                                                String strP12 = Jp0.p(jSONObject, c2196mj1.f919o);
                                                strP5 = Jp0.p(jSONObject, c2196mj1.p);
                                                strP6 = Jp0.p(jSONObject, c2196mj1.q);
                                                it2 = it;
                                                zContains2 = c2196mj1.t.contains(strP6);
                                                set3 = c2196mj1.v;
                                                if (zContains2) {
                                                    if (c2196mj1.u.contains(strP5)) {
                                                        if (!set3.contains(strP4)) {
                                                        }
                                                    }
                                                    strP7 = Jp0.p(jSONObject, c2196mj1.m);
                                                    if (set3.contains(strP7)) {
                                                        strP7 = null;
                                                    }
                                                    if (strP7 == null) {
                                                        strP7 = "";
                                                    }
                                                    if (strP7.length() > 0) {
                                                        str3 = strP7;
                                                        obj3 = obj2;
                                                    } else {
                                                        if (strP4.length() > 0) {
                                                            obj3 = obj2;
                                                            if (AbstractC1474fG.b(strP4, obj3)) {
                                                            }
                                                        } else {
                                                            obj3 = obj2;
                                                        }
                                                        if (zContains) {
                                                            str3 = "En vivo " + (arrayList2.size() + 1);
                                                        } else {
                                                            str3 = "Próximo evento";
                                                        }
                                                    }
                                                    string = AbstractC1119bh0.E0(str3).toString();
                                                    strA = C3068vj0.a(string);
                                                    if (strA.length() <= 0) {
                                                        strP8 = Jp0.p(jSONObject, c2196mj1.r);
                                                        if (strP8.length() <= 0) {
                                                            strP8 = null;
                                                        }
                                                        if (strP8 != null) {
                                                            if (AbstractC1899jh0.U(strP8, "//", false)) {
                                                                strP8 = "https:" + strP8;
                                                            }
                                                            str4 = strP8;
                                                        } else {
                                                            str4 = null;
                                                        }
                                                        String str111 = "tigo-" + strP3;
                                                        C3068vj0.e.put(str111, string);
                                                        LinkedHashMap linkedHashMap10 = C3068vj0.f;
                                                        str5 = (String) linkedHashMap.get(strP3);
                                                        if (str5 == null) {
                                                            if (zContains) {
                                                                str5 = "live";
                                                            } else {
                                                                str5 = str2;
                                                            }
                                                        }
                                                        linkedHashMap10.put(str111, str5);
                                                        C1101bX c1101bX17 = new C1101bX("is_tv_channel", Boolean.TRUE);
                                                        C1101bX c1101bX18 = new C1101bX("is_live_channel", Boolean.valueOf(zContains));
                                                        C1101bX[] c1101bXArr9 = new C1101bX[2];
                                                        c1101bXArr9[0] = c1101bX17;
                                                        c1101bXArr9[1] = c1101bX18;
                                                        arrayList2.add(new C1387eR(str111, string, strP6, null, null, null, null, null, str4, null, null, null, null, null, AbstractC3327yN.z(c1101bXArr9), 16120));
                                                    } else if (linkedHashSet3.add(strA)) {
                                                        strP8 = Jp0.p(jSONObject, c2196mj1.r);
                                                        if (strP8.length() <= 0) {
                                                            strP8 = null;
                                                        }
                                                        if (strP8 != null) {
                                                            if (AbstractC1899jh0.U(strP8, "//", false)) {
                                                                strP8 = "https:" + strP8;
                                                            }
                                                            str4 = strP8;
                                                        } else {
                                                            str4 = null;
                                                        }
                                                        String str112 = "tigo-" + strP3;
                                                        C3068vj0.e.put(str112, string);
                                                        LinkedHashMap linkedHashMap11 = C3068vj0.f;
                                                        str5 = (String) linkedHashMap.get(strP3);
                                                        if (str5 == null) {
                                                            if (zContains) {
                                                                str5 = "live";
                                                            } else {
                                                                str5 = str2;
                                                            }
                                                        }
                                                        linkedHashMap11.put(str112, str5);
                                                        C1101bX c1101bX19 = new C1101bX("is_tv_channel", Boolean.TRUE);
                                                        C1101bX c1101bX110 = new C1101bX("is_live_channel", Boolean.valueOf(zContains));
                                                        C1101bX[] c1101bXArr10 = new C1101bX[2];
                                                        c1101bXArr10[0] = c1101bX19;
                                                        c1101bXArr10[1] = c1101bX110;
                                                        arrayList2.add(new C1387eR(str112, string, strP6, null, null, null, null, null, str4, null, null, null, null, null, AbstractC3327yN.z(c1101bXArr10), 16120));
                                                    }
                                                    obj2 = obj3;
                                                    it = it2;
                                                } else {
                                                    if (!set3.contains(strP4)) {
                                                    }
                                                    strP7 = Jp0.p(jSONObject, c2196mj1.m);
                                                    if (set3.contains(strP7)) {
                                                        strP7 = null;
                                                    }
                                                    if (strP7 == null) {
                                                        strP7 = "";
                                                    }
                                                    if (strP7.length() > 0) {
                                                        str3 = strP7;
                                                        obj3 = obj2;
                                                    } else {
                                                        if (strP4.length() > 0) {
                                                            obj3 = obj2;
                                                            if (AbstractC1474fG.b(strP4, obj3)) {
                                                            }
                                                        } else {
                                                            obj3 = obj2;
                                                        }
                                                        if (zContains) {
                                                            str3 = "En vivo " + (arrayList2.size() + 1);
                                                        } else {
                                                            str3 = "Próximo evento";
                                                        }
                                                    }
                                                    string = AbstractC1119bh0.E0(str3).toString();
                                                    strA = C3068vj0.a(string);
                                                    if (strA.length() <= 0) {
                                                        strP8 = Jp0.p(jSONObject, c2196mj1.r);
                                                        if (strP8.length() <= 0) {
                                                            strP8 = null;
                                                        }
                                                        if (strP8 != null) {
                                                            if (AbstractC1899jh0.U(strP8, "//", false)) {
                                                                strP8 = "https:" + strP8;
                                                            }
                                                            str4 = strP8;
                                                        } else {
                                                            str4 = null;
                                                        }
                                                        String str113 = "tigo-" + strP3;
                                                        C3068vj0.e.put(str113, string);
                                                        LinkedHashMap linkedHashMap12 = C3068vj0.f;
                                                        str5 = (String) linkedHashMap.get(strP3);
                                                        if (str5 == null) {
                                                            if (zContains) {
                                                                str5 = "live";
                                                            } else {
                                                                str5 = str2;
                                                            }
                                                        }
                                                        linkedHashMap12.put(str113, str5);
                                                        C1101bX c1101bX111 = new C1101bX("is_tv_channel", Boolean.TRUE);
                                                        C1101bX c1101bX112 = new C1101bX("is_live_channel", Boolean.valueOf(zContains));
                                                        C1101bX[] c1101bXArr11 = new C1101bX[2];
                                                        c1101bXArr11[0] = c1101bX111;
                                                        c1101bXArr11[1] = c1101bX112;
                                                        arrayList2.add(new C1387eR(str113, string, strP6, null, null, null, null, null, str4, null, null, null, null, null, AbstractC3327yN.z(c1101bXArr11), 16120));
                                                    } else if (linkedHashSet3.add(strA)) {
                                                        strP8 = Jp0.p(jSONObject, c2196mj1.r);
                                                        if (strP8.length() <= 0) {
                                                            strP8 = null;
                                                        }
                                                        if (strP8 != null) {
                                                            if (AbstractC1899jh0.U(strP8, "//", false)) {
                                                                strP8 = "https:" + strP8;
                                                            }
                                                            str4 = strP8;
                                                        } else {
                                                            str4 = null;
                                                        }
                                                        String str114 = "tigo-" + strP3;
                                                        C3068vj0.e.put(str114, string);
                                                        LinkedHashMap linkedHashMap13 = C3068vj0.f;
                                                        str5 = (String) linkedHashMap.get(strP3);
                                                        if (str5 == null) {
                                                            if (zContains) {
                                                                str5 = "live";
                                                            } else {
                                                                str5 = str2;
                                                            }
                                                        }
                                                        linkedHashMap13.put(str114, str5);
                                                        C1101bX c1101bX113 = new C1101bX("is_tv_channel", Boolean.TRUE);
                                                        C1101bX c1101bX114 = new C1101bX("is_live_channel", Boolean.valueOf(zContains));
                                                        C1101bX[] c1101bXArr12 = new C1101bX[2];
                                                        c1101bXArr12[0] = c1101bX113;
                                                        c1101bXArr12[1] = c1101bX114;
                                                        arrayList2.add(new C1387eR(str114, string, strP6, null, null, null, null, null, str4, null, null, null, null, null, AbstractC3327yN.z(c1101bXArr12), 16120));
                                                    }
                                                    obj2 = obj3;
                                                    it = it2;
                                                }
                                            }
                                        }
                                        return arrayList2;
                                    }
                                    if (i == 4) {
                                        map = this.r;
                                        list2 = this.q;
                                        linkedHashMap = this.p;
                                        linkedHashSet2 = this.f992o;
                                        linkedHashSet = this.n;
                                        c2196mj1 = this.m;
                                        try {
                                            Jp0.O(obj);
                                            objW2 = obj;
                                            obj2 = "Eventos Tigo Sports";
                                            c1233cq = c1233cq2;
                                            str = "next";
                                            while (r3.hasNext()) {
                                                strP2 = Jp0.p(jSONObject3, c2196mj1.l);
                                                if (strP2.length() > 0) {
                                                    str2 = str;
                                                    try {
                                                        j$.util.Map.EL.putIfAbsent(linkedHashMap, strP2, str2);
                                                        if (linkedHashSet.add(strP2)) {
                                                            list2.add(jSONObject3);
                                                        } else {
                                                            continue;
                                                        }
                                                    } catch (Exception unused4) {
                                                        set = linkedHashSet2;
                                                        List list9 = list2;
                                                        map2 = map;
                                                        list3 = list9;
                                                        if (list3.isEmpty()) {
                                                            try {
                                                                String str115 = c2196mj1.g;
                                                                this.m = c2196mj1;
                                                                this.n = linkedHashSet;
                                                                this.f992o = set;
                                                                this.p = linkedHashMap;
                                                                this.q = list3;
                                                                try {
                                                                    this.r = null;
                                                                    this.s = 5;
                                                                    objW3 = w(c2196mj1, str115, map2, this);
                                                                    if (objW3 == enumC1706hi) {
                                                                        return enumC1706hi;
                                                                    }
                                                                    set2 = linkedHashSet;
                                                                    while (r2.hasNext()) {
                                                                        strP9 = Jp0.p(jSONObject4, c2196mj1.l);
                                                                        if (strP9.length() > 0) {
                                                                            j$.util.Map.EL.putIfAbsent(linkedHashMap, strP9, "replay");
                                                                            if (set2.add(strP9)) {
                                                                                list3.add(jSONObject4);
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (Exception unused5) {
                                                                    map3 = linkedHashMap;
                                                                    c2196mj2 = c2196mj1;
                                                                    c2196mj1 = c2196mj2;
                                                                    linkedHashMap = map3;
                                                                }
                                                            } catch (Exception unused6) {
                                                                map3 = linkedHashMap;
                                                                c2196mj2 = c2196mj1;
                                                                c2196mj1 = c2196mj2;
                                                                linkedHashMap = map3;
                                                            }
                                                        }
                                                        if (list3.isEmpty()) {
                                                            return c1233cq;
                                                        }
                                                        arrayList2 = new ArrayList();
                                                        linkedHashSet3 = new LinkedHashSet();
                                                        C3068vj0.e.clear();
                                                        C3068vj0.f.clear();
                                                        it = list3.iterator();
                                                        while (it.hasNext()) {
                                                            jSONObject = (JSONObject) it.next();
                                                            try {
                                                                strP3 = Jp0.p(jSONObject, c2196mj1.l);
                                                                if (strP3.length() != 0) {
                                                                    zContains = set.contains(strP3);
                                                                    strP4 = Jp0.p(jSONObject, c2196mj1.n);
                                                                    String strP13 = Jp0.p(jSONObject, c2196mj1.f919o);
                                                                    strP5 = Jp0.p(jSONObject, c2196mj1.p);
                                                                    strP6 = Jp0.p(jSONObject, c2196mj1.q);
                                                                    it2 = it;
                                                                    try {
                                                                        zContains2 = c2196mj1.t.contains(strP6);
                                                                        set3 = c2196mj1.v;
                                                                        if (zContains2) {
                                                                            try {
                                                                                if (c2196mj1.u.contains(strP5)) {
                                                                                    if (!set3.contains(strP4)) {
                                                                                    }
                                                                                }
                                                                                strP7 = Jp0.p(jSONObject, c2196mj1.m);
                                                                                if (set3.contains(strP7)) {
                                                                                    strP7 = null;
                                                                                }
                                                                                if (strP7 == null) {
                                                                                    strP7 = "";
                                                                                }
                                                                                if (strP7.length() > 0) {
                                                                                    str3 = strP7;
                                                                                    obj3 = obj2;
                                                                                } else {
                                                                                    if (strP4.length() > 0) {
                                                                                        obj3 = obj2;
                                                                                        if (AbstractC1474fG.b(strP4, obj3)) {
                                                                                        }
                                                                                    } else {
                                                                                        obj3 = obj2;
                                                                                    }
                                                                                    if (zContains) {
                                                                                        str3 = "En vivo " + (arrayList2.size() + 1);
                                                                                    } else {
                                                                                        str3 = "Próximo evento";
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    string = AbstractC1119bh0.E0(str3).toString();
                                                                                    strA = C3068vj0.a(string);
                                                                                    if (strA.length() <= 0) {
                                                                                        try {
                                                                                            if (linkedHashSet3.add(strA)) {
                                                                                                strP8 = Jp0.p(jSONObject, c2196mj1.r);
                                                                                                if (strP8.length() <= 0) {
                                                                                                    strP8 = null;
                                                                                                }
                                                                                                if (strP8 != null) {
                                                                                                    if (AbstractC1899jh0.U(strP8, "//", false)) {
                                                                                                        strP8 = "https:" + strP8;
                                                                                                    }
                                                                                                    str4 = strP8;
                                                                                                } else {
                                                                                                    str4 = null;
                                                                                                }
                                                                                                String str116 = "tigo-" + strP3;
                                                                                                C3068vj0.e.put(str116, string);
                                                                                                LinkedHashMap linkedHashMap14 = C3068vj0.f;
                                                                                                str5 = (String) linkedHashMap.get(strP3);
                                                                                                if (str5 == null) {
                                                                                                    if (zContains) {
                                                                                                        str5 = "live";
                                                                                                    } else {
                                                                                                        str5 = str2;
                                                                                                    }
                                                                                                }
                                                                                                linkedHashMap14.put(str116, str5);
                                                                                                C1101bX c1101bX115 = new C1101bX("is_tv_channel", Boolean.TRUE);
                                                                                                C1101bX c1101bX116 = new C1101bX("is_live_channel", Boolean.valueOf(zContains));
                                                                                                try {
                                                                                                    C1101bX[] c1101bXArr13 = new C1101bX[2];
                                                                                                    try {
                                                                                                        c1101bXArr13[0] = c1101bX115;
                                                                                                        try {
                                                                                                            c1101bXArr13[1] = c1101bX116;
                                                                                                            arrayList2.add(new C1387eR(str116, string, strP6, null, null, null, null, null, str4, null, null, null, null, null, AbstractC3327yN.z(c1101bXArr13), 16120));
                                                                                                        } catch (Exception unused7) {
                                                                                                        }
                                                                                                    } catch (Exception unused8) {
                                                                                                    }
                                                                                                } catch (Exception unused9) {
                                                                                                    obj2 = obj3;
                                                                                                    it = it2;
                                                                                                }
                                                                                            }
                                                                                        } catch (Exception unused10) {
                                                                                        }
                                                                                    } else {
                                                                                        strP8 = Jp0.p(jSONObject, c2196mj1.r);
                                                                                        if (strP8.length() <= 0) {
                                                                                            strP8 = null;
                                                                                        }
                                                                                        if (strP8 != null) {
                                                                                            if (AbstractC1899jh0.U(strP8, "//", false)) {
                                                                                                strP8 = "https:" + strP8;
                                                                                            }
                                                                                            str4 = strP8;
                                                                                        } else {
                                                                                            str4 = null;
                                                                                        }
                                                                                        String str117 = "tigo-" + strP3;
                                                                                        C3068vj0.e.put(str117, string);
                                                                                        LinkedHashMap linkedHashMap15 = C3068vj0.f;
                                                                                        str5 = (String) linkedHashMap.get(strP3);
                                                                                        if (str5 == null) {
                                                                                            if (zContains) {
                                                                                                str5 = "live";
                                                                                            } else {
                                                                                                str5 = str2;
                                                                                            }
                                                                                        }
                                                                                        linkedHashMap15.put(str117, str5);
                                                                                        C1101bX c1101bX117 = new C1101bX("is_tv_channel", Boolean.TRUE);
                                                                                        C1101bX c1101bX118 = new C1101bX("is_live_channel", Boolean.valueOf(zContains));
                                                                                        C1101bX[] c1101bXArr14 = new C1101bX[2];
                                                                                        c1101bXArr14[0] = c1101bX117;
                                                                                        c1101bXArr14[1] = c1101bX118;
                                                                                        arrayList2.add(new C1387eR(str117, string, strP6, null, null, null, null, null, str4, null, null, null, null, null, AbstractC3327yN.z(c1101bXArr14), 16120));
                                                                                    }
                                                                                } catch (Exception unused11) {
                                                                                    obj2 = obj3;
                                                                                    it = it2;
                                                                                }
                                                                            } catch (Exception unused12) {
                                                                                obj3 = obj2;
                                                                                obj2 = obj3;
                                                                                it = it2;
                                                                            }
                                                                            obj2 = obj3;
                                                                            it = it2;
                                                                        } else {
                                                                            if (!set3.contains(strP4)) {
                                                                            }
                                                                            strP7 = Jp0.p(jSONObject, c2196mj1.m);
                                                                            if (set3.contains(strP7)) {
                                                                                strP7 = null;
                                                                            }
                                                                            if (strP7 == null) {
                                                                                strP7 = "";
                                                                            }
                                                                            if (strP7.length() > 0) {
                                                                                str3 = strP7;
                                                                                obj3 = obj2;
                                                                            } else {
                                                                                if (strP4.length() > 0) {
                                                                                    obj3 = obj2;
                                                                                    if (AbstractC1474fG.b(strP4, obj3)) {
                                                                                    }
                                                                                } else {
                                                                                    obj3 = obj2;
                                                                                }
                                                                                if (zContains) {
                                                                                    str3 = "En vivo " + (arrayList2.size() + 1);
                                                                                } else {
                                                                                    str3 = "Próximo evento";
                                                                                }
                                                                            }
                                                                            string = AbstractC1119bh0.E0(str3).toString();
                                                                            strA = C3068vj0.a(string);
                                                                            if (strA.length() <= 0) {
                                                                                strP8 = Jp0.p(jSONObject, c2196mj1.r);
                                                                                if (strP8.length() <= 0) {
                                                                                    strP8 = null;
                                                                                }
                                                                                if (strP8 != null) {
                                                                                    if (AbstractC1899jh0.U(strP8, "//", false)) {
                                                                                        strP8 = "https:" + strP8;
                                                                                    }
                                                                                    str4 = strP8;
                                                                                } else {
                                                                                    str4 = null;
                                                                                }
                                                                                String str118 = "tigo-" + strP3;
                                                                                C3068vj0.e.put(str118, string);
                                                                                LinkedHashMap linkedHashMap16 = C3068vj0.f;
                                                                                str5 = (String) linkedHashMap.get(strP3);
                                                                                if (str5 == null) {
                                                                                    if (zContains) {
                                                                                        str5 = "live";
                                                                                    } else {
                                                                                        str5 = str2;
                                                                                    }
                                                                                }
                                                                                linkedHashMap16.put(str118, str5);
                                                                                C1101bX c1101bX119 = new C1101bX("is_tv_channel", Boolean.TRUE);
                                                                                C1101bX c1101bX1110 = new C1101bX("is_live_channel", Boolean.valueOf(zContains));
                                                                                C1101bX[] c1101bXArr15 = new C1101bX[2];
                                                                                c1101bXArr15[0] = c1101bX119;
                                                                                c1101bXArr15[1] = c1101bX1110;
                                                                                arrayList2.add(new C1387eR(str118, string, strP6, null, null, null, null, null, str4, null, null, null, null, null, AbstractC3327yN.z(c1101bXArr15), 16120));
                                                                            } else if (linkedHashSet3.add(strA)) {
                                                                                strP8 = Jp0.p(jSONObject, c2196mj1.r);
                                                                                if (strP8.length() <= 0) {
                                                                                    strP8 = null;
                                                                                }
                                                                                if (strP8 != null) {
                                                                                    if (AbstractC1899jh0.U(strP8, "//", false)) {
                                                                                        strP8 = "https:" + strP8;
                                                                                    }
                                                                                    str4 = strP8;
                                                                                } else {
                                                                                    str4 = null;
                                                                                }
                                                                                String str119 = "tigo-" + strP3;
                                                                                C3068vj0.e.put(str119, string);
                                                                                LinkedHashMap linkedHashMap17 = C3068vj0.f;
                                                                                str5 = (String) linkedHashMap.get(strP3);
                                                                                if (str5 == null) {
                                                                                    if (zContains) {
                                                                                        str5 = "live";
                                                                                    } else {
                                                                                        str5 = str2;
                                                                                    }
                                                                                }
                                                                                linkedHashMap17.put(str119, str5);
                                                                                C1101bX c1101bX1111 = new C1101bX("is_tv_channel", Boolean.TRUE);
                                                                                C1101bX c1101bX1112 = new C1101bX("is_live_channel", Boolean.valueOf(zContains));
                                                                                C1101bX[] c1101bXArr16 = new C1101bX[2];
                                                                                c1101bXArr16[0] = c1101bX1111;
                                                                                c1101bXArr16[1] = c1101bX1112;
                                                                                arrayList2.add(new C1387eR(str119, string, strP6, null, null, null, null, null, str4, null, null, null, null, null, AbstractC3327yN.z(c1101bXArr16), 16120));
                                                                            }
                                                                            obj2 = obj3;
                                                                            it = it2;
                                                                        }
                                                                    } catch (Exception unused13) {
                                                                        obj3 = obj2;
                                                                        obj2 = obj3;
                                                                        it = it2;
                                                                    }
                                                                }
                                                            } catch (Exception unused14) {
                                                                it2 = it;
                                                            }
                                                        }
                                                        return arrayList2;
                                                    }
                                                } else {
                                                    str2 = str;
                                                }
                                                str = str2;
                                            }
                                            str2 = str;
                                        } catch (Exception unused15) {
                                            obj2 = "Eventos Tigo Sports";
                                            c1233cq = c1233cq2;
                                            str2 = "next";
                                        }
                                        set = linkedHashSet2;
                                        List list10 = list2;
                                        map2 = map;
                                        list3 = list10;
                                        if (list3.isEmpty()) {
                                            String str1110 = c2196mj1.g;
                                            this.m = c2196mj1;
                                            this.n = linkedHashSet;
                                            this.f992o = set;
                                            this.p = linkedHashMap;
                                            this.q = list3;
                                            this.r = null;
                                            this.s = 5;
                                            objW3 = w(c2196mj1, str1110, map2, this);
                                            if (objW3 == enumC1706hi) {
                                                return enumC1706hi;
                                            }
                                            set2 = linkedHashSet;
                                        }
                                        if (list3.isEmpty()) {
                                            return c1233cq;
                                        }
                                        arrayList2 = new ArrayList();
                                        linkedHashSet3 = new LinkedHashSet();
                                        C3068vj0.e.clear();
                                        C3068vj0.f.clear();
                                        it = list3.iterator();
                                        while (it.hasNext()) {
                                            jSONObject = (JSONObject) it.next();
                                            strP3 = Jp0.p(jSONObject, c2196mj1.l);
                                            if (strP3.length() != 0) {
                                                zContains = set.contains(strP3);
                                                strP4 = Jp0.p(jSONObject, c2196mj1.n);
                                                String strP14 = Jp0.p(jSONObject, c2196mj1.f919o);
                                                strP5 = Jp0.p(jSONObject, c2196mj1.p);
                                                strP6 = Jp0.p(jSONObject, c2196mj1.q);
                                                it2 = it;
                                                zContains2 = c2196mj1.t.contains(strP6);
                                                set3 = c2196mj1.v;
                                                if (zContains2) {
                                                    if (c2196mj1.u.contains(strP5)) {
                                                        if (!set3.contains(strP4) && set3.contains(strP14)) {
                                                            it = it2;
                                                        }
                                                    }
                                                    strP7 = Jp0.p(jSONObject, c2196mj1.m);
                                                    if (set3.contains(strP7)) {
                                                        strP7 = null;
                                                    }
                                                    if (strP7 == null) {
                                                        strP7 = "";
                                                    }
                                                    if (strP7.length() > 0) {
                                                        str3 = strP7;
                                                        obj3 = obj2;
                                                    } else {
                                                        if (strP4.length() > 0) {
                                                            obj3 = obj2;
                                                            if (AbstractC1474fG.b(strP4, obj3) && strP14.length() > 0 && !AbstractC1474fG.b(strP14, obj3)) {
                                                                str3 = strP4 + " vs " + strP14;
                                                            }
                                                        } else {
                                                            obj3 = obj2;
                                                        }
                                                        if (zContains) {
                                                            str3 = "En vivo " + (arrayList2.size() + 1);
                                                        } else {
                                                            str3 = "Próximo evento";
                                                        }
                                                    }
                                                    string = AbstractC1119bh0.E0(str3).toString();
                                                    strA = C3068vj0.a(string);
                                                    if (strA.length() <= 0) {
                                                        strP8 = Jp0.p(jSONObject, c2196mj1.r);
                                                        if (strP8.length() <= 0) {
                                                            strP8 = null;
                                                        }
                                                        if (strP8 != null) {
                                                            if (AbstractC1899jh0.U(strP8, "//", false)) {
                                                                strP8 = "https:" + strP8;
                                                            }
                                                            str4 = strP8;
                                                        } else {
                                                            str4 = null;
                                                        }
                                                        String str1111 = "tigo-" + strP3;
                                                        C3068vj0.e.put(str1111, string);
                                                        LinkedHashMap linkedHashMap18 = C3068vj0.f;
                                                        str5 = (String) linkedHashMap.get(strP3);
                                                        if (str5 == null) {
                                                            if (zContains) {
                                                                str5 = "live";
                                                            } else {
                                                                str5 = str2;
                                                            }
                                                        }
                                                        linkedHashMap18.put(str1111, str5);
                                                        C1101bX c1101bX1113 = new C1101bX("is_tv_channel", Boolean.TRUE);
                                                        C1101bX c1101bX1114 = new C1101bX("is_live_channel", Boolean.valueOf(zContains));
                                                        C1101bX[] c1101bXArr17 = new C1101bX[2];
                                                        c1101bXArr17[0] = c1101bX1113;
                                                        c1101bXArr17[1] = c1101bX1114;
                                                        arrayList2.add(new C1387eR(str1111, string, strP6, null, null, null, null, null, str4, null, null, null, null, null, AbstractC3327yN.z(c1101bXArr17), 16120));
                                                    } else if (linkedHashSet3.add(strA)) {
                                                        strP8 = Jp0.p(jSONObject, c2196mj1.r);
                                                        if (strP8.length() <= 0) {
                                                            strP8 = null;
                                                        }
                                                        if (strP8 != null) {
                                                            if (AbstractC1899jh0.U(strP8, "//", false)) {
                                                                strP8 = "https:" + strP8;
                                                            }
                                                            str4 = strP8;
                                                        } else {
                                                            str4 = null;
                                                        }
                                                        String str1112 = "tigo-" + strP3;
                                                        C3068vj0.e.put(str1112, string);
                                                        LinkedHashMap linkedHashMap19 = C3068vj0.f;
                                                        str5 = (String) linkedHashMap.get(strP3);
                                                        if (str5 == null) {
                                                            if (zContains) {
                                                                str5 = "live";
                                                            } else {
                                                                str5 = str2;
                                                            }
                                                        }
                                                        linkedHashMap19.put(str1112, str5);
                                                        C1101bX c1101bX1115 = new C1101bX("is_tv_channel", Boolean.TRUE);
                                                        C1101bX c1101bX1116 = new C1101bX("is_live_channel", Boolean.valueOf(zContains));
                                                        C1101bX[] c1101bXArr18 = new C1101bX[2];
                                                        c1101bXArr18[0] = c1101bX1115;
                                                        c1101bXArr18[1] = c1101bX1116;
                                                        arrayList2.add(new C1387eR(str1112, string, strP6, null, null, null, null, null, str4, null, null, null, null, null, AbstractC3327yN.z(c1101bXArr18), 16120));
                                                    }
                                                    obj2 = obj3;
                                                    it = it2;
                                                } else {
                                                    if (!set3.contains(strP4)) {
                                                    }
                                                    strP7 = Jp0.p(jSONObject, c2196mj1.m);
                                                    if (set3.contains(strP7)) {
                                                        strP7 = null;
                                                    }
                                                    if (strP7 == null) {
                                                        strP7 = "";
                                                    }
                                                    if (strP7.length() > 0) {
                                                        str3 = strP7;
                                                        obj3 = obj2;
                                                    } else {
                                                        if (strP4.length() > 0) {
                                                            obj3 = obj2;
                                                            if (AbstractC1474fG.b(strP4, obj3)) {
                                                            }
                                                        } else {
                                                            obj3 = obj2;
                                                        }
                                                        if (zContains) {
                                                            str3 = "En vivo " + (arrayList2.size() + 1);
                                                        } else {
                                                            str3 = "Próximo evento";
                                                        }
                                                    }
                                                    string = AbstractC1119bh0.E0(str3).toString();
                                                    strA = C3068vj0.a(string);
                                                    if (strA.length() <= 0) {
                                                        strP8 = Jp0.p(jSONObject, c2196mj1.r);
                                                        if (strP8.length() <= 0) {
                                                            strP8 = null;
                                                        }
                                                        if (strP8 != null) {
                                                            if (AbstractC1899jh0.U(strP8, "//", false)) {
                                                                strP8 = "https:" + strP8;
                                                            }
                                                            str4 = strP8;
                                                        } else {
                                                            str4 = null;
                                                        }
                                                        String str1113 = "tigo-" + strP3;
                                                        C3068vj0.e.put(str1113, string);
                                                        LinkedHashMap linkedHashMap110 = C3068vj0.f;
                                                        str5 = (String) linkedHashMap.get(strP3);
                                                        if (str5 == null) {
                                                            if (zContains) {
                                                                str5 = "live";
                                                            } else {
                                                                str5 = str2;
                                                            }
                                                        }
                                                        linkedHashMap110.put(str1113, str5);
                                                        C1101bX c1101bX1117 = new C1101bX("is_tv_channel", Boolean.TRUE);
                                                        C1101bX c1101bX1118 = new C1101bX("is_live_channel", Boolean.valueOf(zContains));
                                                        C1101bX[] c1101bXArr19 = new C1101bX[2];
                                                        c1101bXArr19[0] = c1101bX1117;
                                                        c1101bXArr19[1] = c1101bX1118;
                                                        arrayList2.add(new C1387eR(str1113, string, strP6, null, null, null, null, null, str4, null, null, null, null, null, AbstractC3327yN.z(c1101bXArr19), 16120));
                                                    } else if (linkedHashSet3.add(strA)) {
                                                        strP8 = Jp0.p(jSONObject, c2196mj1.r);
                                                        if (strP8.length() <= 0) {
                                                            strP8 = null;
                                                        }
                                                        if (strP8 != null) {
                                                            if (AbstractC1899jh0.U(strP8, "//", false)) {
                                                                strP8 = "https:" + strP8;
                                                            }
                                                            str4 = strP8;
                                                        } else {
                                                            str4 = null;
                                                        }
                                                        String str1114 = "tigo-" + strP3;
                                                        C3068vj0.e.put(str1114, string);
                                                        LinkedHashMap linkedHashMap111 = C3068vj0.f;
                                                        str5 = (String) linkedHashMap.get(strP3);
                                                        if (str5 == null) {
                                                            if (zContains) {
                                                                str5 = "live";
                                                            } else {
                                                                str5 = str2;
                                                            }
                                                        }
                                                        linkedHashMap111.put(str1114, str5);
                                                        C1101bX c1101bX1119 = new C1101bX("is_tv_channel", Boolean.TRUE);
                                                        C1101bX c1101bX11110 = new C1101bX("is_live_channel", Boolean.valueOf(zContains));
                                                        C1101bX[] c1101bXArr110 = new C1101bX[2];
                                                        c1101bXArr110[0] = c1101bX1119;
                                                        c1101bXArr110[1] = c1101bX11110;
                                                        arrayList2.add(new C1387eR(str1114, string, strP6, null, null, null, null, null, str4, null, null, null, null, null, AbstractC3327yN.z(c1101bXArr110), 16120));
                                                    }
                                                    obj2 = obj3;
                                                    it = it2;
                                                }
                                            }
                                        }
                                        return arrayList2;
                                    }
                                    if (i != 5) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    list3 = this.q;
                                    map3 = this.p;
                                    set = this.f992o;
                                    set2 = this.n;
                                    c2196mj2 = this.m;
                                    try {
                                        Jp0.O(obj);
                                        obj2 = "Eventos Tigo Sports";
                                        c2196mj1 = c2196mj2;
                                        c1233cq = c1233cq2;
                                        str2 = "next";
                                        linkedHashMap = map3;
                                        objW3 = obj;
                                    } catch (Exception unused16) {
                                        obj2 = "Eventos Tigo Sports";
                                        c1233cq = c1233cq2;
                                        str2 = "next";
                                        c2196mj1 = c2196mj2;
                                        linkedHashMap = map3;
                                    }
                                }
                                while (r2.hasNext()) {
                                    strP9 = Jp0.p(jSONObject4, c2196mj1.l);
                                    if (strP9.length() > 0) {
                                        j$.util.Map.EL.putIfAbsent(linkedHashMap, strP9, "replay");
                                        if (set2.add(strP9)) {
                                            list3.add(jSONObject4);
                                        }
                                    }
                                }
                                if (list3.isEmpty()) {
                                    return c1233cq;
                                }
                                arrayList2 = new ArrayList();
                                linkedHashSet3 = new LinkedHashSet();
                                C3068vj0.e.clear();
                                C3068vj0.f.clear();
                                it = list3.iterator();
                                while (it.hasNext()) {
                                    jSONObject = (JSONObject) it.next();
                                    strP3 = Jp0.p(jSONObject, c2196mj1.l);
                                    if (strP3.length() != 0) {
                                        zContains = set.contains(strP3);
                                        strP4 = Jp0.p(jSONObject, c2196mj1.n);
                                        String strP15 = Jp0.p(jSONObject, c2196mj1.f919o);
                                        strP5 = Jp0.p(jSONObject, c2196mj1.p);
                                        strP6 = Jp0.p(jSONObject, c2196mj1.q);
                                        it2 = it;
                                        zContains2 = c2196mj1.t.contains(strP6);
                                        set3 = c2196mj1.v;
                                        if (zContains2) {
                                            if (c2196mj1.u.contains(strP5)) {
                                                if (!set3.contains(strP4)) {
                                                }
                                            }
                                            strP7 = Jp0.p(jSONObject, c2196mj1.m);
                                            if (set3.contains(strP7)) {
                                                strP7 = null;
                                            }
                                            if (strP7 == null) {
                                                strP7 = "";
                                            }
                                            if (strP7.length() > 0) {
                                                str3 = strP7;
                                                obj3 = obj2;
                                            } else {
                                                if (strP4.length() > 0) {
                                                    obj3 = obj2;
                                                    if (AbstractC1474fG.b(strP4, obj3)) {
                                                    }
                                                } else {
                                                    obj3 = obj2;
                                                }
                                                if (zContains) {
                                                    str3 = "En vivo " + (arrayList2.size() + 1);
                                                } else {
                                                    str3 = "Próximo evento";
                                                }
                                            }
                                            string = AbstractC1119bh0.E0(str3).toString();
                                            strA = C3068vj0.a(string);
                                            if (strA.length() <= 0) {
                                                strP8 = Jp0.p(jSONObject, c2196mj1.r);
                                                if (strP8.length() <= 0) {
                                                    strP8 = null;
                                                }
                                                if (strP8 != null) {
                                                    if (AbstractC1899jh0.U(strP8, "//", false)) {
                                                        strP8 = "https:" + strP8;
                                                    }
                                                    str4 = strP8;
                                                } else {
                                                    str4 = null;
                                                }
                                                String str1115 = "tigo-" + strP3;
                                                C3068vj0.e.put(str1115, string);
                                                LinkedHashMap linkedHashMap112 = C3068vj0.f;
                                                str5 = (String) linkedHashMap.get(strP3);
                                                if (str5 == null) {
                                                    if (zContains) {
                                                        str5 = "live";
                                                    } else {
                                                        str5 = str2;
                                                    }
                                                }
                                                linkedHashMap112.put(str1115, str5);
                                                C1101bX c1101bX11111 = new C1101bX("is_tv_channel", Boolean.TRUE);
                                                C1101bX c1101bX11112 = new C1101bX("is_live_channel", Boolean.valueOf(zContains));
                                                C1101bX[] c1101bXArr111 = new C1101bX[2];
                                                c1101bXArr111[0] = c1101bX11111;
                                                c1101bXArr111[1] = c1101bX11112;
                                                arrayList2.add(new C1387eR(str1115, string, strP6, null, null, null, null, null, str4, null, null, null, null, null, AbstractC3327yN.z(c1101bXArr111), 16120));
                                            } else if (linkedHashSet3.add(strA)) {
                                                strP8 = Jp0.p(jSONObject, c2196mj1.r);
                                                if (strP8.length() <= 0) {
                                                    strP8 = null;
                                                }
                                                if (strP8 != null) {
                                                    if (AbstractC1899jh0.U(strP8, "//", false)) {
                                                        strP8 = "https:" + strP8;
                                                    }
                                                    str4 = strP8;
                                                } else {
                                                    str4 = null;
                                                }
                                                String str1116 = "tigo-" + strP3;
                                                C3068vj0.e.put(str1116, string);
                                                LinkedHashMap linkedHashMap113 = C3068vj0.f;
                                                str5 = (String) linkedHashMap.get(strP3);
                                                if (str5 == null) {
                                                    if (zContains) {
                                                        str5 = "live";
                                                    } else {
                                                        str5 = str2;
                                                    }
                                                }
                                                linkedHashMap113.put(str1116, str5);
                                                C1101bX c1101bX11113 = new C1101bX("is_tv_channel", Boolean.TRUE);
                                                C1101bX c1101bX11114 = new C1101bX("is_live_channel", Boolean.valueOf(zContains));
                                                C1101bX[] c1101bXArr112 = new C1101bX[2];
                                                c1101bXArr112[0] = c1101bX11113;
                                                c1101bXArr112[1] = c1101bX11114;
                                                arrayList2.add(new C1387eR(str1116, string, strP6, null, null, null, null, null, str4, null, null, null, null, null, AbstractC3327yN.z(c1101bXArr112), 16120));
                                            }
                                            obj2 = obj3;
                                            it = it2;
                                        } else {
                                            if (!set3.contains(strP4)) {
                                            }
                                            strP7 = Jp0.p(jSONObject, c2196mj1.m);
                                            if (set3.contains(strP7)) {
                                                strP7 = null;
                                            }
                                            if (strP7 == null) {
                                                strP7 = "";
                                            }
                                            if (strP7.length() > 0) {
                                                str3 = strP7;
                                                obj3 = obj2;
                                            } else {
                                                if (strP4.length() > 0) {
                                                    obj3 = obj2;
                                                    if (AbstractC1474fG.b(strP4, obj3)) {
                                                    }
                                                } else {
                                                    obj3 = obj2;
                                                }
                                                if (zContains) {
                                                    str3 = "En vivo " + (arrayList2.size() + 1);
                                                } else {
                                                    str3 = "Próximo evento";
                                                }
                                            }
                                            string = AbstractC1119bh0.E0(str3).toString();
                                            strA = C3068vj0.a(string);
                                            if (strA.length() <= 0) {
                                                strP8 = Jp0.p(jSONObject, c2196mj1.r);
                                                if (strP8.length() <= 0) {
                                                    strP8 = null;
                                                }
                                                if (strP8 != null) {
                                                    if (AbstractC1899jh0.U(strP8, "//", false)) {
                                                        strP8 = "https:" + strP8;
                                                    }
                                                    str4 = strP8;
                                                } else {
                                                    str4 = null;
                                                }
                                                String str1117 = "tigo-" + strP3;
                                                C3068vj0.e.put(str1117, string);
                                                LinkedHashMap linkedHashMap114 = C3068vj0.f;
                                                str5 = (String) linkedHashMap.get(strP3);
                                                if (str5 == null) {
                                                    if (zContains) {
                                                        str5 = "live";
                                                    } else {
                                                        str5 = str2;
                                                    }
                                                }
                                                linkedHashMap114.put(str1117, str5);
                                                C1101bX c1101bX11115 = new C1101bX("is_tv_channel", Boolean.TRUE);
                                                C1101bX c1101bX11116 = new C1101bX("is_live_channel", Boolean.valueOf(zContains));
                                                C1101bX[] c1101bXArr113 = new C1101bX[2];
                                                c1101bXArr113[0] = c1101bX11115;
                                                c1101bXArr113[1] = c1101bX11116;
                                                arrayList2.add(new C1387eR(str1117, string, strP6, null, null, null, null, null, str4, null, null, null, null, null, AbstractC3327yN.z(c1101bXArr113), 16120));
                                            } else if (linkedHashSet3.add(strA)) {
                                                strP8 = Jp0.p(jSONObject, c2196mj1.r);
                                                if (strP8.length() <= 0) {
                                                    strP8 = null;
                                                }
                                                if (strP8 != null) {
                                                    if (AbstractC1899jh0.U(strP8, "//", false)) {
                                                        strP8 = "https:" + strP8;
                                                    }
                                                    str4 = strP8;
                                                } else {
                                                    str4 = null;
                                                }
                                                String str1118 = "tigo-" + strP3;
                                                C3068vj0.e.put(str1118, string);
                                                LinkedHashMap linkedHashMap115 = C3068vj0.f;
                                                str5 = (String) linkedHashMap.get(strP3);
                                                if (str5 == null) {
                                                    if (zContains) {
                                                        str5 = "live";
                                                    } else {
                                                        str5 = str2;
                                                    }
                                                }
                                                linkedHashMap115.put(str1118, str5);
                                                C1101bX c1101bX11117 = new C1101bX("is_tv_channel", Boolean.TRUE);
                                                C1101bX c1101bX11118 = new C1101bX("is_live_channel", Boolean.valueOf(zContains));
                                                C1101bX[] c1101bXArr114 = new C1101bX[2];
                                                c1101bXArr114[0] = c1101bX11117;
                                                c1101bXArr114[1] = c1101bX11118;
                                                arrayList2.add(new C1387eR(str1118, string, strP6, null, null, null, null, null, str4, null, null, null, null, null, AbstractC3327yN.z(c1101bXArr114), 16120));
                                            }
                                            obj2 = obj3;
                                            it = it2;
                                        }
                                    }
                                }
                                return arrayList2;
                            }
                            Jp0.O(obj);
                            C3359yj0 c3359yj0 = C3359yj0.a;
                            this.s = 1;
                            objB = c3359yj0.b(this);
                            if (objB == enumC1706hi) {
                                return enumC1706hi;
                            }
                            String str20 = c2196mj0.e;
                            this.m = c2196mj0;
                            this.n = linkedHashSet;
                            this.f992o = linkedHashSet2;
                            this.p = linkedHashMap;
                            this.q = arrayList;
                            this.r = mapZ;
                            this.s = 3;
                            objW = w(c2196mj0, str20, mapE, this);
                            if (objW == enumC1706hi) {
                                return enumC1706hi;
                            }
                            list = arrayList;
                            while (r0.hasNext()) {
                                strP = Jp0.p(jSONObject2, c2196mj0.l);
                                if (strP.length() > 0) {
                                    linkedHashSet2.add(strP);
                                    linkedHashMap.put(strP, "live");
                                    if (linkedHashSet.add(strP)) {
                                        list.add(jSONObject2);
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            map = mapZ;
                            List list11 = list;
                            c2196mj1 = c2196mj0;
                            list2 = list11;
                            String str120 = c2196mj1.f;
                            this.m = c2196mj1;
                            this.n = linkedHashSet;
                            this.f992o = linkedHashSet2;
                            this.p = linkedHashMap;
                            this.q = list2;
                            this.r = map;
                            this.s = 4;
                            objW2 = w(c2196mj1, str120, map, this);
                            if (objW2 == enumC1706hi) {
                                return enumC1706hi;
                            }
                            while (r3.hasNext()) {
                                strP2 = Jp0.p(jSONObject3, c2196mj1.l);
                                if (strP2.length() > 0) {
                                    str2 = str;
                                    j$.util.Map.EL.putIfAbsent(linkedHashMap, strP2, str2);
                                    if (linkedHashSet.add(strP2)) {
                                        list2.add(jSONObject3);
                                    } else {
                                        continue;
                                    }
                                } else {
                                    str2 = str;
                                }
                                str = str2;
                            }
                            str2 = str;
                            set = linkedHashSet2;
                            List list12 = list2;
                            map2 = map;
                            list3 = list12;
                            if (list3.isEmpty()) {
                                String str1119 = c2196mj1.g;
                                this.m = c2196mj1;
                                this.n = linkedHashSet;
                                this.f992o = set;
                                this.p = linkedHashMap;
                                this.q = list3;
                                this.r = null;
                                this.s = 5;
                                objW3 = w(c2196mj1, str1119, map2, this);
                                if (objW3 == enumC1706hi) {
                                    return enumC1706hi;
                                }
                                set2 = linkedHashSet;
                                while (r2.hasNext()) {
                                    strP9 = Jp0.p(jSONObject4, c2196mj1.l);
                                    if (strP9.length() > 0) {
                                        j$.util.Map.EL.putIfAbsent(linkedHashMap, strP9, "replay");
                                        if (set2.add(strP9)) {
                                            list3.add(jSONObject4);
                                        }
                                    }
                                }
                            }
                            if (list3.isEmpty()) {
                                return c1233cq;
                            }
                            arrayList2 = new ArrayList();
                            linkedHashSet3 = new LinkedHashSet();
                            C3068vj0.e.clear();
                            C3068vj0.f.clear();
                            it = list3.iterator();
                            while (it.hasNext()) {
                                jSONObject = (JSONObject) it.next();
                                strP3 = Jp0.p(jSONObject, c2196mj1.l);
                                if (strP3.length() != 0) {
                                    zContains = set.contains(strP3);
                                    strP4 = Jp0.p(jSONObject, c2196mj1.n);
                                    String strP16 = Jp0.p(jSONObject, c2196mj1.f919o);
                                    strP5 = Jp0.p(jSONObject, c2196mj1.p);
                                    strP6 = Jp0.p(jSONObject, c2196mj1.q);
                                    it2 = it;
                                    zContains2 = c2196mj1.t.contains(strP6);
                                    set3 = c2196mj1.v;
                                    if (zContains2) {
                                        if (c2196mj1.u.contains(strP5)) {
                                            if (!set3.contains(strP4)) {
                                            }
                                        }
                                        strP7 = Jp0.p(jSONObject, c2196mj1.m);
                                        if (set3.contains(strP7)) {
                                            strP7 = null;
                                        }
                                        if (strP7 == null) {
                                            strP7 = "";
                                        }
                                        if (strP7.length() > 0) {
                                            str3 = strP7;
                                            obj3 = obj2;
                                        } else {
                                            if (strP4.length() > 0) {
                                                obj3 = obj2;
                                                if (AbstractC1474fG.b(strP4, obj3)) {
                                                }
                                            } else {
                                                obj3 = obj2;
                                            }
                                            if (zContains) {
                                                str3 = "En vivo " + (arrayList2.size() + 1);
                                            } else {
                                                str3 = "Próximo evento";
                                            }
                                        }
                                        string = AbstractC1119bh0.E0(str3).toString();
                                        strA = C3068vj0.a(string);
                                        if (strA.length() <= 0) {
                                            strP8 = Jp0.p(jSONObject, c2196mj1.r);
                                            if (strP8.length() <= 0) {
                                                strP8 = null;
                                            }
                                            if (strP8 != null) {
                                                if (AbstractC1899jh0.U(strP8, "//", false)) {
                                                    strP8 = "https:" + strP8;
                                                }
                                                str4 = strP8;
                                            } else {
                                                str4 = null;
                                            }
                                            String str11110 = "tigo-" + strP3;
                                            C3068vj0.e.put(str11110, string);
                                            LinkedHashMap linkedHashMap116 = C3068vj0.f;
                                            str5 = (String) linkedHashMap.get(strP3);
                                            if (str5 == null) {
                                                if (zContains) {
                                                    str5 = "live";
                                                } else {
                                                    str5 = str2;
                                                }
                                            }
                                            linkedHashMap116.put(str11110, str5);
                                            C1101bX c1101bX11119 = new C1101bX("is_tv_channel", Boolean.TRUE);
                                            C1101bX c1101bX111110 = new C1101bX("is_live_channel", Boolean.valueOf(zContains));
                                            C1101bX[] c1101bXArr115 = new C1101bX[2];
                                            c1101bXArr115[0] = c1101bX11119;
                                            c1101bXArr115[1] = c1101bX111110;
                                            arrayList2.add(new C1387eR(str11110, string, strP6, null, null, null, null, null, str4, null, null, null, null, null, AbstractC3327yN.z(c1101bXArr115), 16120));
                                        } else if (linkedHashSet3.add(strA)) {
                                            strP8 = Jp0.p(jSONObject, c2196mj1.r);
                                            if (strP8.length() <= 0) {
                                                strP8 = null;
                                            }
                                            if (strP8 != null) {
                                                if (AbstractC1899jh0.U(strP8, "//", false)) {
                                                    strP8 = "https:" + strP8;
                                                }
                                                str4 = strP8;
                                            } else {
                                                str4 = null;
                                            }
                                            String str11111 = "tigo-" + strP3;
                                            C3068vj0.e.put(str11111, string);
                                            LinkedHashMap linkedHashMap117 = C3068vj0.f;
                                            str5 = (String) linkedHashMap.get(strP3);
                                            if (str5 == null) {
                                                if (zContains) {
                                                    str5 = "live";
                                                } else {
                                                    str5 = str2;
                                                }
                                            }
                                            linkedHashMap117.put(str11111, str5);
                                            C1101bX c1101bX111111 = new C1101bX("is_tv_channel", Boolean.TRUE);
                                            C1101bX c1101bX111112 = new C1101bX("is_live_channel", Boolean.valueOf(zContains));
                                            C1101bX[] c1101bXArr116 = new C1101bX[2];
                                            c1101bXArr116[0] = c1101bX111111;
                                            c1101bXArr116[1] = c1101bX111112;
                                            arrayList2.add(new C1387eR(str11111, string, strP6, null, null, null, null, null, str4, null, null, null, null, null, AbstractC3327yN.z(c1101bXArr116), 16120));
                                        }
                                        obj2 = obj3;
                                        it = it2;
                                    } else {
                                        if (!set3.contains(strP4)) {
                                        }
                                        strP7 = Jp0.p(jSONObject, c2196mj1.m);
                                        if (set3.contains(strP7)) {
                                            strP7 = null;
                                        }
                                        if (strP7 == null) {
                                            strP7 = "";
                                        }
                                        if (strP7.length() > 0) {
                                            str3 = strP7;
                                            obj3 = obj2;
                                        } else {
                                            if (strP4.length() > 0) {
                                                obj3 = obj2;
                                                if (AbstractC1474fG.b(strP4, obj3)) {
                                                }
                                            } else {
                                                obj3 = obj2;
                                            }
                                            if (zContains) {
                                                str3 = "En vivo " + (arrayList2.size() + 1);
                                            } else {
                                                str3 = "Próximo evento";
                                            }
                                        }
                                        string = AbstractC1119bh0.E0(str3).toString();
                                        strA = C3068vj0.a(string);
                                        if (strA.length() <= 0) {
                                            strP8 = Jp0.p(jSONObject, c2196mj1.r);
                                            if (strP8.length() <= 0) {
                                                strP8 = null;
                                            }
                                            if (strP8 != null) {
                                                if (AbstractC1899jh0.U(strP8, "//", false)) {
                                                    strP8 = "https:" + strP8;
                                                }
                                                str4 = strP8;
                                            } else {
                                                str4 = null;
                                            }
                                            String str11112 = "tigo-" + strP3;
                                            C3068vj0.e.put(str11112, string);
                                            LinkedHashMap linkedHashMap118 = C3068vj0.f;
                                            str5 = (String) linkedHashMap.get(strP3);
                                            if (str5 == null) {
                                                if (zContains) {
                                                    str5 = "live";
                                                } else {
                                                    str5 = str2;
                                                }
                                            }
                                            linkedHashMap118.put(str11112, str5);
                                            C1101bX c1101bX111113 = new C1101bX("is_tv_channel", Boolean.TRUE);
                                            C1101bX c1101bX111114 = new C1101bX("is_live_channel", Boolean.valueOf(zContains));
                                            C1101bX[] c1101bXArr117 = new C1101bX[2];
                                            c1101bXArr117[0] = c1101bX111113;
                                            c1101bXArr117[1] = c1101bX111114;
                                            arrayList2.add(new C1387eR(str11112, string, strP6, null, null, null, null, null, str4, null, null, null, null, null, AbstractC3327yN.z(c1101bXArr117), 16120));
                                        } else if (linkedHashSet3.add(strA)) {
                                            strP8 = Jp0.p(jSONObject, c2196mj1.r);
                                            if (strP8.length() <= 0) {
                                                strP8 = null;
                                            }
                                            if (strP8 != null) {
                                                if (AbstractC1899jh0.U(strP8, "//", false)) {
                                                    strP8 = "https:" + strP8;
                                                }
                                                str4 = strP8;
                                            } else {
                                                str4 = null;
                                            }
                                            String str11113 = "tigo-" + strP3;
                                            C3068vj0.e.put(str11113, string);
                                            LinkedHashMap linkedHashMap119 = C3068vj0.f;
                                            str5 = (String) linkedHashMap.get(strP3);
                                            if (str5 == null) {
                                                if (zContains) {
                                                    str5 = "live";
                                                } else {
                                                    str5 = str2;
                                                }
                                            }
                                            linkedHashMap119.put(str11113, str5);
                                            C1101bX c1101bX111115 = new C1101bX("is_tv_channel", Boolean.TRUE);
                                            C1101bX c1101bX111116 = new C1101bX("is_live_channel", Boolean.valueOf(zContains));
                                            C1101bX[] c1101bXArr118 = new C1101bX[2];
                                            c1101bXArr118[0] = c1101bX111115;
                                            c1101bXArr118[1] = c1101bX111116;
                                            arrayList2.add(new C1387eR(str11113, string, strP6, null, null, null, null, null, str4, null, null, null, null, null, AbstractC3327yN.z(c1101bXArr118), 16120));
                                        }
                                        obj2 = obj3;
                                        it = it2;
                                    }
                                }
                            }
                            return arrayList2;
                        } catch (Exception unused17) {
                            map = mapZ;
                            list = arrayList;
                        }
                        c2196mj0 = (C2196mj0) objB;
                        String str21 = C3068vj0.a;
                        this.m = c2196mj0;
                        this.s = 2;
                        objJ = AbstractC1376eG.J(AbstractC1910jn.b, new C2874tj0(null, null), this);
                        if (objJ == enumC1706hi) {
                            return enumC1706hi;
                        }
                        C2390oj0 c2390oj1 = (C2390oj0) objJ;
                        linkedHashSet = new LinkedHashSet();
                        linkedHashSet2 = new LinkedHashSet();
                        linkedHashMap = new LinkedHashMap();
                        arrayList = new ArrayList();
                        String str22 = C3068vj0.a;
                        Map mapE2 = C3068vj0.e(c2390oj1.a, c2390oj1.b);
                        obj2 = "Eventos Tigo Sports";
                        c1233cq = c1233cq2;
                        str = "next";
                        mapZ = AbstractC3327yN.z(new C1101bX("Authorization", "Bearer " + c2390oj1.a), new C1101bX("Origin", "https://www.tigosports.com.py"), new C1101bX("Referer", "https://www.tigosports.com.py/"), new C1101bX("Accept", "application/json, text/plain, */*"), new C1101bX("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36"));
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception unused18) {
                        return c1233cq2;
                    }
                } catch (CancellationException e2) {
                    throw e2;
                }
            } catch (CancellationException e3) {
                throw e3;
            }
        } catch (CancellationException e4) {
            throw e4;
        }
    }
}
