package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: o.at, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1044at extends Ph0 implements InterfaceC0775Sy {
    public String m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f683o;
    public final /* synthetic */ String p;
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1044at(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.p = str;
        this.q = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1044at) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1044at(this.p, this.q, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x022c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:113:0x023e A[LOOP:0: B:111:0x0238->B:113:0x023e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x0261 A[LOOP:1: B:115:0x025b->B:117:0x0261, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:121:0x0283  */
    /* JADX WARN: Code duplicated, block: B:129:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:? A[LOOP:3: B:96:0x0200->B:135:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:? A[LOOP:8: B:34:0x00b8->B:150:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00be  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:49:0x010e A[LOOP:4: B:47:0x0108->B:49:0x010e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x0140  */
    /* JADX WARN: Code duplicated, block: B:55:0x0144  */
    /* JADX WARN: Code duplicated, block: B:60:0x0162  */
    /* JADX WARN: Code duplicated, block: B:62:0x0165  */
    /* JADX WARN: Code duplicated, block: B:65:0x0178  */
    /* JADX WARN: Code duplicated, block: B:68:0x0184  */
    /* JADX WARN: Code duplicated, block: B:71:0x0197 A[LOOP:6: B:69:0x0191->B:71:0x0197, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:98:0x0206  */
    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        String str;
        Object objP;
        String str2;
        Object objP2;
        C3382yv c3382yv;
        C0821Us c0821Us;
        Object objR;
        C0821Us c0821Us2;
        Object next;
        ArrayList arrayList;
        Iterator it;
        String str3;
        String str4;
        String lowerCase;
        ArrayList arrayList2;
        Iterator it2;
        HashSet hashSet;
        ArrayList arrayList3;
        ArrayList arrayList4;
        C0743Rs c0743Rs;
        Object objY;
        String str5;
        ArrayList arrayList5;
        Iterator it3;
        ArrayList arrayList6;
        Iterator it4;
        HashSet hashSet2;
        ArrayList arrayList7;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.f683o;
        String str6 = this.p;
        int i2 = this.q;
        String str7 = "Deportes";
        Object obj2 = null;
        if (i != 0) {
            if (i == 1) {
                String str8 = (String) this.n;
                str2 = this.m;
                Jp0.O(obj);
                str7 = str8;
                objP2 = obj;
                c3382yv = new C3382yv(Vb0.J(AbstractC0911Ye.U(((C0665Os) objP2).b.values()), X10.t));
                while (c3382yv.a()) {
                    next = c3382yv.next();
                    if (AbstractC1474fG.b(((C0821Us) next).a, str2)) {
                        obj2 = next;
                        break;
                    }
                }
                c0821Us = (C0821Us) obj2;
                if (c0821Us == null) {
                    c0821Us = new C0821Us(str2, "HorizontalPlaylist", null, null, null, C1330dq.l, false);
                }
                C2409ot c2409ot = C2409ot.b;
                this.m = str7;
                this.n = c0821Us;
                this.f683o = 2;
                objR = C2409ot.r(c2409ot, c0821Us, i2, this);
                if (objR == enumC1706hi) {
                    return enumC1706hi;
                }
                c0821Us2 = c0821Us;
            } else {
                if (i != 2) {
                    if (i == 3) {
                        str = this.m;
                        Jp0.O(obj);
                        objP = obj;
                        C0665Os c0665Os = (C0665Os) objP;
                        for (Object obj3 : c0665Os.a) {
                            if (AbstractC1474fG.b(((C0743Rs) obj3).a, str)) {
                                obj2 = obj3;
                                break;
                            }
                        }
                        c0743Rs = (C0743Rs) obj2;
                        if (c0743Rs != null && (str5 = c0743Rs.b) != null) {
                            str7 = str5;
                        }
                        C2409ot c2409ot2 = C2409ot.b;
                        this.m = str7;
                        this.f683o = 4;
                        objY = c2409ot2.y(c0665Os, str, i2, this);
                        if (objY == enumC1706hi) {
                            return enumC1706hi;
                        }
                    } else {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str9 = this.m;
                        Jp0.O(obj);
                        str7 = str9;
                        objY = obj;
                    }
                    arrayList5 = new ArrayList();
                    it3 = ((Iterable) objY).iterator();
                    while (it3.hasNext()) {
                        AbstractC1406ef.Q(arrayList5, ((C0795Ts) ((C1101bX) it3.next()).m).b);
                    }
                    arrayList6 = new ArrayList(AbstractC1016af.O(arrayList5, 10));
                    it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        arrayList6.add(C2409ot.C((C0613Ms) it4.next(), 6));
                    }
                    hashSet2 = new HashSet();
                    arrayList7 = new ArrayList();
                    for (Object obj4 : arrayList6) {
                        if (hashSet2.add(((C1387eR) obj4).a)) {
                            arrayList7.add(obj4);
                        }
                    }
                    return new C2420oz(str6, str7, arrayList7);
                }
                c0821Us2 = (C0821Us) this.n;
                String str10 = this.m;
                Jp0.O(obj);
                str7 = str10;
                objR = obj;
            }
            C0795Ts c0795Ts = (C0795Ts) objR;
            List list = c0795Ts.b;
            arrayList = new ArrayList(AbstractC1016af.O(list, 10));
            it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C0613Ms.a((C0613Ms) it.next(), null, null, null, null, false, null, null, null, null, null, null, null, c0821Us2.a(), 32767));
            }
            str3 = c0821Us2.c;
            str4 = c0795Ts.a;
            if (str3 == null) {
                str3 = str4;
            }
            lowerCase = (str3 != null ? str3 : "").toLowerCase(Locale.ROOT);
            AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
            if (!AbstractC1899jh0.N(c0821Us2.d, "VerticalCard", true) || AbstractC1119bh0.W(lowerCase, "programa", false)) {
                ArrayList arrayListV = C2409ot.v(arrayList);
                arrayList4 = new ArrayList();
                for (Object obj5 : arrayListV) {
                    if (obj5 instanceof Cd0) {
                        arrayList4.add(obj5);
                    }
                }
            } else {
                arrayList2 = new ArrayList(AbstractC1016af.O(arrayList, 10));
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(C2409ot.C((C0613Ms) it2.next(), 6));
                }
                hashSet = new HashSet();
                arrayList3 = new ArrayList();
                for (Object obj6 : arrayList2) {
                    if (hashSet.add(((C1387eR) obj6).a)) {
                        arrayList3.add(obj6);
                    }
                }
                arrayList4 = arrayList3;
            }
            if (str4 != null) {
                str7 = str4;
            }
            return new C2420oz(str6, str7, arrayList4);
        }
        Jp0.O(obj);
        if (!AbstractC1899jh0.U(str6, "fana-playlist|", false)) {
            C2409ot c2409ot3 = C2409ot.b;
            String strL0 = AbstractC1119bh0.l0(str6, "fana-route|");
            if (!AbstractC1899jh0.U(str6, "fana-route|", false)) {
                strL0 = null;
            }
            str = strL0 == null ? "/" : strL0;
            this.m = str;
            this.f683o = 3;
            objP = C2409ot.p(c2409ot3, this);
            if (objP == enumC1706hi) {
                return enumC1706hi;
            }
            C0665Os c0665Os2 = (C0665Os) objP;
            while (r4.hasNext()) {
                if (AbstractC1474fG.b(((C0743Rs) obj3).a, str)) {
                    obj2 = obj3;
                    break;
                }
            }
            c0743Rs = (C0743Rs) obj2;
            if (c0743Rs != null) {
                str7 = str5;
            }
            C2409ot c2409ot4 = C2409ot.b;
            this.m = str7;
            this.f683o = 4;
            objY = c2409ot4.y(c0665Os2, str, i2, this);
            if (objY == enumC1706hi) {
                return enumC1706hi;
            }
            arrayList5 = new ArrayList();
            it3 = ((Iterable) objY).iterator();
            while (it3.hasNext()) {
                AbstractC1406ef.Q(arrayList5, ((C0795Ts) ((C1101bX) it3.next()).m).b);
            }
            arrayList6 = new ArrayList(AbstractC1016af.O(arrayList5, 10));
            it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                arrayList6.add(C2409ot.C((C0613Ms) it4.next(), 6));
            }
            hashSet2 = new HashSet();
            arrayList7 = new ArrayList();
            while (r1.hasNext()) {
                if (hashSet2.add(((C1387eR) obj4).a)) {
                    arrayList7.add(obj4);
                }
            }
            return new C2420oz(str6, str7, arrayList7);
        }
        List listS0 = AbstractC1119bh0.s0(str6, new char[]{'|'}, 3, 2);
        str2 = (String) AbstractC0911Ye.e0(1, listS0);
        if (str2 == null) {
            str2 = "";
        }
        String str11 = (String) AbstractC0911Ye.e0(2, listS0);
        if (str11 == null) {
            str11 = "";
        }
        str7 = AbstractC1899jh0.O(str11) ? "Deportes" : str11;
        if (AbstractC1899jh0.O(str2)) {
            return new C2420oz(str6, str7);
        }
        C2409ot c2409ot5 = C2409ot.b;
        this.m = str2;
        this.n = str7;
        this.f683o = 1;
        objP2 = C2409ot.p(c2409ot5, this);
        if (objP2 == enumC1706hi) {
            return enumC1706hi;
        }
        c3382yv = new C3382yv(Vb0.J(AbstractC0911Ye.U(((C0665Os) objP2).b.values()), X10.t));
        while (c3382yv.a()) {
            next = c3382yv.next();
            if (AbstractC1474fG.b(((C0821Us) next).a, str2)) {
                obj2 = next;
                break;
            }
        }
        c0821Us = (C0821Us) obj2;
        if (c0821Us == null) {
            c0821Us = new C0821Us(str2, "HorizontalPlaylist", null, null, null, C1330dq.l, false);
        }
        C2409ot c2409ot6 = C2409ot.b;
        this.m = str7;
        this.n = c0821Us;
        this.f683o = 2;
        objR = C2409ot.r(c2409ot6, c0821Us, i2, this);
        if (objR == enumC1706hi) {
            return enumC1706hi;
        }
        c0821Us2 = c0821Us;
        C0795Ts c0795Ts2 = (C0795Ts) objR;
        List list2 = c0795Ts2.b;
        arrayList = new ArrayList(AbstractC1016af.O(list2, 10));
        it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(C0613Ms.a((C0613Ms) it.next(), null, null, null, null, false, null, null, null, null, null, null, null, c0821Us2.a(), 32767));
        }
        str3 = c0821Us2.c;
        str4 = c0795Ts2.a;
        if (str3 == null) {
            str3 = str4;
        }
        lowerCase = (str3 != null ? str3 : "").toLowerCase(Locale.ROOT);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        if (!AbstractC1899jh0.N(c0821Us2.d, "VerticalCard", true) || AbstractC1119bh0.W(lowerCase, "programa", false)) {
            ArrayList arrayListV2 = C2409ot.v(arrayList);
            arrayList4 = new ArrayList();
            while (r1.hasNext()) {
                if (obj5 instanceof Cd0) {
                    arrayList4.add(obj5);
                }
            }
        } else {
            arrayList2 = new ArrayList(AbstractC1016af.O(arrayList, 10));
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(C2409ot.C((C0613Ms) it2.next(), 6));
            }
            hashSet = new HashSet();
            arrayList3 = new ArrayList();
            while (r1.hasNext()) {
                if (hashSet.add(((C1387eR) obj6).a)) {
                    arrayList3.add(obj6);
                }
            }
            arrayList4 = arrayList3;
        }
        if (str4 != null) {
            str7 = str4;
        }
        return new C2420oz(str6, str7, arrayList4);
    }
}
