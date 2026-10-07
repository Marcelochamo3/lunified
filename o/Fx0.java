package o;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Fx0 extends Ph0 implements InterfaceC0775Sy {
    public String m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f268o;
    public List p;
    public long q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fx0(String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.t = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Fx0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        Fx0 fx0 = new Fx0(this.t, interfaceC0473Hh);
        fx0.s = obj;
        return fx0;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:26:0x00de  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:37:0x010c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0121  */
    /* JADX WARN: Code duplicated, block: B:44:0x0136  */
    /* JADX WARN: Code duplicated, block: B:50:0x015e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0168  */
    /* JADX WARN: Code duplicated, block: B:56:0x0179 A[EDGE_INSN: B:56:0x0179->B:57:0x017c BREAK  A[LOOP:2: B:51:0x0162->B:101:?]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0190  */
    /* JADX WARN: Code duplicated, block: B:66:0x01bc A[LOOP:4: B:64:0x01b6->B:66:0x01bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x01df  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:76:0x0215  */
    /* JADX WARN: Code duplicated, block: B:82:0x0222  */
    /* JADX WARN: Code duplicated, block: B:85:0x0244 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:86:0x0245  */
    /* JADX WARN: Code duplicated, block: B:93:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x014d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        InterfaceC1608gi interfaceC1608gi;
        long jElapsedRealtime;
        Object objY;
        String str;
        InterfaceC1323dm interfaceC1323dm;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str2;
        Object objK;
        Object obj2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayListY0;
        HashSet hashSet;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Iterator it;
        List listR0;
        Iterator it2;
        Object next;
        int iIntValue;
        Object next2;
        int iIntValue2;
        Object obj3;
        JSONObject jSONObject3;
        C2109lo0 c2109lo0T;
        String str3;
        Object objK2;
        C2109lo0 c2109lo0;
        String str4;
        String str5;
        String str6;
        List list;
        Iterator it3;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.r;
        String str7 = this.t;
        if (i != 0) {
            if (i == 1) {
                jElapsedRealtime = this.q;
                interfaceC1608gi = (InterfaceC1608gi) this.s;
                Jp0.O(obj);
            } else if (i == 2) {
                jElapsedRealtime = this.q;
                InterfaceC1323dm interfaceC1323dm2 = (InterfaceC1323dm) this.n;
                str = this.m;
                Jp0.O(obj);
                interfaceC1323dm = interfaceC1323dm2;
                objY = obj;
                jSONObject = (JSONObject) objY;
                if (jSONObject == null) {
                    jSONObject = (JSONObject) Lx0.j.get(str);
                }
                jSONObject2 = jSONObject;
                if (jSONObject2 == null) {
                    ((JH) interfaceC1323dm).f(null);
                    C2109lo0 c2109lo1 = new C2109lo0(this.t, "Serie", null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532);
                    Lx0 lx0 = Lx0.b;
                    c2109lo1.r = "RECOMENDADO PARA PELÍCULAS Y SERIES";
                    return c2109lo1;
                }
                Lx0 lx1 = Lx0.b;
                str2 = (String) Lx0.R(jSONObject2).l;
                try {
                    objK = Lx0.s(1, str2);
                } catch (Throwable th) {
                    objK = Jp0.k(th);
                }
                obj2 = C1233cq.l;
                if (objK instanceof C2439p80) {
                    objK = obj2;
                }
                arrayList = new ArrayList();
                for (Object obj4 : (Iterable) objK) {
                    if (AbstractC1474fG.b(((JSONObject) obj4).optString("programType"), "teleplay")) {
                        arrayList.add(obj4);
                    }
                }
                arrayList2 = new ArrayList();
                for (Object obj5 : arrayList) {
                    Lx0 lx2 = Lx0.b;
                    if (AbstractC1899jh0.N((String) Lx0.R((JSONObject) obj5).l, str2, true)) {
                        arrayList2.add(obj5);
                    }
                }
                arrayListY0 = AbstractC0911Ye.y0(arrayList2);
                if (arrayListY0.isEmpty()) {
                    arrayListY0.add(jSONObject2);
                    break;
                }
                it3 = arrayListY0.iterator();
                do {
                    if (it3.hasNext()) {
                        arrayListY0.add(jSONObject2);
                        break;
                    }
                } while (!AbstractC1474fG.b(((JSONObject) it3.next()).optString("contentId"), str));
                hashSet = new HashSet();
                arrayList3 = new ArrayList();
                for (Object obj6 : arrayListY0) {
                    if (hashSet.add(((JSONObject) obj6).optString("contentId"))) {
                        arrayList3.add(obj6);
                    }
                }
                Lx0 lx3 = Lx0.b;
                arrayList4 = new ArrayList(AbstractC1016af.O(arrayList3, 10));
                it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add(Lx0.Q((JSONObject) it.next()));
                }
                listR0 = AbstractC0911Ye.r0(arrayList4, new C1749i30(13));
                it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        Lx0 lx4 = Lx0.b;
                        iIntValue = ((Number) Lx0.R((JSONObject) next).m).intValue();
                        do {
                            next2 = it2.next();
                            Lx0 lx5 = Lx0.b;
                            iIntValue2 = ((Number) Lx0.R((JSONObject) next2).m).intValue();
                            if (iIntValue > iIntValue2) {
                                next = next2;
                                iIntValue = iIntValue2;
                            }
                        } while (it2.hasNext());
                    }
                    obj3 = next;
                } else {
                    obj3 = null;
                }
                jSONObject3 = (JSONObject) obj3;
                if (jSONObject3 == null) {
                    jSONObject3 = jSONObject2;
                }
                Lx0 lx6 = Lx0.b;
                C2109lo0 c2109lo0T2 = Lx0.T(jSONObject2);
                c2109lo0T = Lx0.T(jSONObject3);
                str3 = c2109lo0T2.c;
                this.s = c2109lo0T;
                this.m = str7;
                this.n = str2;
                this.f268o = str3;
                this.p = listR0;
                this.q = jElapsedRealtime;
                this.r = 3;
                objK2 = interfaceC1323dm.K(this);
                if (objK2 == enumC1706hi) {
                    return enumC1706hi;
                }
                c2109lo0 = c2109lo0T;
                str4 = str3;
                str5 = str7;
                str6 = str2;
                list = listR0;
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list2 = this.p;
                String str8 = this.f268o;
                String str9 = (String) this.n;
                String str10 = this.m;
                C2109lo0 c2109lo2 = (C2109lo0) this.s;
                Jp0.O(obj);
                objK2 = obj;
                list = list2;
                str4 = str8;
                str6 = str9;
                c2109lo0 = c2109lo2;
                str5 = str10;
            }
            C2109lo0 c2109lo0A = C2109lo0.a(c2109lo0, str5, str6, str4, null, list, (List) objK2, 30712);
            Lx0 lx7 = Lx0.b;
            c2109lo0A.r = "RECOMENDADO PARA PELÍCULAS Y SERIES";
            SystemClock.elapsedRealtime();
            return c2109lo0A;
        }
        Jp0.O(obj);
        interfaceC1608gi = (InterfaceC1608gi) this.s;
        jElapsedRealtime = SystemClock.elapsedRealtime();
        Lx0 lx8 = Lx0.b;
        this.s = interfaceC1608gi;
        this.q = jElapsedRealtime;
        this.r = 1;
        if (lx8.A(this) == enumC1706hi) {
            return enumC1706hi;
        }
        String strL0 = AbstractC1119bh0.l0(str7, "xuper-series:");
        ExecutorC0891Xk executorC0891Xk = AbstractC1910jn.b;
        C1420em c1420emC = AbstractC1376eG.c(interfaceC1608gi, executorC0891Xk, 0, new Dx0(strL0, null), 2);
        C1420em c1420emC2 = AbstractC1376eG.c(interfaceC1608gi, executorC0891Xk, 0, new Ex0(strL0, null), 2);
        this.s = interfaceC1608gi;
        this.m = strL0;
        this.n = c1420emC2;
        this.q = jElapsedRealtime;
        this.r = 2;
        objY = c1420emC.y(this);
        if (objY == enumC1706hi) {
            return enumC1706hi;
        }
        str = strL0;
        interfaceC1323dm = c1420emC2;
        jSONObject = (JSONObject) objY;
        if (jSONObject == null) {
            jSONObject = (JSONObject) Lx0.j.get(str);
        }
        jSONObject2 = jSONObject;
        if (jSONObject2 == null) {
            ((JH) interfaceC1323dm).f(null);
            C2109lo0 c2109lo3 = new C2109lo0(this.t, "Serie", null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532);
            Lx0 lx9 = Lx0.b;
            c2109lo3.r = "RECOMENDADO PARA PELÍCULAS Y SERIES";
            return c2109lo3;
        }
        Lx0 lx10 = Lx0.b;
        str2 = (String) Lx0.R(jSONObject2).l;
        objK = Lx0.s(1, str2);
        obj2 = C1233cq.l;
        if (objK instanceof C2439p80) {
            objK = obj2;
        }
        arrayList = new ArrayList();
        while (r0.hasNext()) {
            if (AbstractC1474fG.b(((JSONObject) obj4).optString("programType"), "teleplay")) {
                arrayList.add(obj4);
            }
        }
        arrayList2 = new ArrayList();
        while (r3.hasNext()) {
            Lx0 lx11 = Lx0.b;
            if (AbstractC1899jh0.N((String) Lx0.R((JSONObject) obj5).l, str2, true)) {
                arrayList2.add(obj5);
            }
        }
        arrayListY0 = AbstractC0911Ye.y0(arrayList2);
        if (arrayListY0.isEmpty()) {
            arrayListY0.add(jSONObject2);
            break;
        }
        it3 = arrayListY0.iterator();
        do {
            if (it3.hasNext()) {
                arrayListY0.add(jSONObject2);
                break;
            }
        } while (!AbstractC1474fG.b(((JSONObject) it3.next()).optString("contentId"), str));
        hashSet = new HashSet();
        arrayList3 = new ArrayList();
        while (r0.hasNext()) {
            if (hashSet.add(((JSONObject) obj6).optString("contentId"))) {
                arrayList3.add(obj6);
            }
        }
        Lx0 lx12 = Lx0.b;
        arrayList4 = new ArrayList(AbstractC1016af.O(arrayList3, 10));
        it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(Lx0.Q((JSONObject) it.next()));
        }
        listR0 = AbstractC0911Ye.r0(arrayList4, new C1749i30(13));
        it2 = arrayList3.iterator();
        if (it2.hasNext()) {
            obj3 = null;
        } else {
            next = it2.next();
            if (it2.hasNext()) {
                Lx0 lx13 = Lx0.b;
                iIntValue = ((Number) Lx0.R((JSONObject) next).m).intValue();
                do {
                    next2 = it2.next();
                    Lx0 lx14 = Lx0.b;
                    iIntValue2 = ((Number) Lx0.R((JSONObject) next2).m).intValue();
                    if (iIntValue > iIntValue2) {
                        next = next2;
                        iIntValue = iIntValue2;
                    }
                } while (it2.hasNext());
            }
            obj3 = next;
        }
        jSONObject3 = (JSONObject) obj3;
        if (jSONObject3 == null) {
            jSONObject3 = jSONObject2;
        }
        Lx0 lx15 = Lx0.b;
        C2109lo0 c2109lo0T3 = Lx0.T(jSONObject2);
        c2109lo0T = Lx0.T(jSONObject3);
        str3 = c2109lo0T3.c;
        this.s = c2109lo0T;
        this.m = str7;
        this.n = str2;
        this.f268o = str3;
        this.p = listR0;
        this.q = jElapsedRealtime;
        this.r = 3;
        objK2 = interfaceC1323dm.K(this);
        if (objK2 == enumC1706hi) {
            return enumC1706hi;
        }
        c2109lo0 = c2109lo0T;
        str4 = str3;
        str5 = str7;
        str6 = str2;
        list = listR0;
        C2109lo0 c2109lo0A2 = C2109lo0.a(c2109lo0, str5, str6, str4, null, list, (List) objK2, 30712);
        Lx0 lx16 = Lx0.b;
        c2109lo0A2.r = "RECOMENDADO PARA PELÍCULAS Y SERIES";
        SystemClock.elapsedRealtime();
        return c2109lo0A2;
    }
}
