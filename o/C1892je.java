package o;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: o.je, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1892je extends Ph0 implements InterfaceC0775Sy {
    public List m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f846o;

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1892je) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C1892je c1892je = new C1892je(2, interfaceC0473Hh);
        c1892je.f846o = obj;
        return c1892je;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x027d A[Catch: Exception -> 0x0194, TryCatch #3 {Exception -> 0x0194, blocks: (B:70:0x017c, B:72:0x0185, B:74:0x018f, B:78:0x019a, B:81:0x01bb, B:84:0x01c5, B:86:0x0223, B:87:0x022b, B:92:0x024c, B:93:0x0259, B:95:0x025f, B:97:0x026a, B:98:0x026e, B:99:0x0277, B:101:0x027d, B:103:0x02a6, B:104:0x02aa, B:106:0x02b2), top: B:124:0x017c }] */
    /* JADX WARN: Code duplicated, block: B:106:0x02b2 A[Catch: Exception -> 0x0194, TRY_LEAVE, TryCatch #3 {Exception -> 0x0194, blocks: (B:70:0x017c, B:72:0x0185, B:74:0x018f, B:78:0x019a, B:81:0x01bb, B:84:0x01c5, B:86:0x0223, B:87:0x022b, B:92:0x024c, B:93:0x0259, B:95:0x025f, B:97:0x026a, B:98:0x026e, B:99:0x0277, B:101:0x027d, B:103:0x02a6, B:104:0x02aa, B:106:0x02b2), top: B:124:0x017c }] */
    /* JADX WARN: Code duplicated, block: B:109:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:113:0x02cf A[Catch: Exception -> 0x0021, TryCatch #5 {Exception -> 0x0021, blocks: (B:7:0x001a, B:38:0x00c6, B:39:0x00ec, B:108:0x02bb, B:110:0x02c1, B:111:0x02c9, B:113:0x02cf, B:115:0x02e9), top: B:128:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:126:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x022b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x026a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x02a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x02e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0130 A[Catch: Exception -> 0x0242, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0242, blocks: (B:42:0x00f6, B:46:0x0104, B:48:0x0121, B:50:0x0125, B:54:0x0130), top: B:126:0x00f6 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0151 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0153  */
    /* JADX WARN: Code duplicated, block: B:60:0x0156  */
    /* JADX WARN: Code duplicated, block: B:61:0x0159  */
    /* JADX WARN: Code duplicated, block: B:77:0x0199  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:86:0x0223 A[Catch: Exception -> 0x0194, TryCatch #3 {Exception -> 0x0194, blocks: (B:70:0x017c, B:72:0x0185, B:74:0x018f, B:78:0x019a, B:81:0x01bb, B:84:0x01c5, B:86:0x0223, B:87:0x022b, B:92:0x024c, B:93:0x0259, B:95:0x025f, B:97:0x026a, B:98:0x026e, B:99:0x0277, B:101:0x027d, B:103:0x02a6, B:104:0x02aa, B:106:0x02b2), top: B:124:0x017c }] */
    /* JADX WARN: Code duplicated, block: B:95:0x025f A[Catch: Exception -> 0x0194, TryCatch #3 {Exception -> 0x0194, blocks: (B:70:0x017c, B:72:0x0185, B:74:0x018f, B:78:0x019a, B:81:0x01bb, B:84:0x01c5, B:86:0x0223, B:87:0x022b, B:92:0x024c, B:93:0x0259, B:95:0x025f, B:97:0x026a, B:98:0x026e, B:99:0x0277, B:101:0x027d, B:103:0x02a6, B:104:0x02aa, B:106:0x02b2), top: B:124:0x017c }] */
    /* JADX WARN: Instruction removed from duplicated block: B:101:0x027d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:54:0x0130, please report this as an issue */
    @Override // o.R7
    public final Object r(Object obj) {
        List list;
        Object objK;
        List list2;
        Object objB;
        List listR0;
        LinkedHashMap linkedHashMap;
        Iterator it;
        List list3;
        ArrayList<C2508pu> arrayList;
        ArrayList arrayList2;
        String str;
        List list4;
        C1387eR c1387eR;
        String str2;
        String str3;
        Long l;
        boolean z;
        String str4;
        String str5;
        String str6;
        String str7;
        String string;
        Object arrayList3;
        Instant instantOfEpochMilli;
        InterfaceC1608gi interfaceC1608gi;
        List arrayList4;
        Object objJ;
        int i = 0;
        int i2 = 1;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = this.n;
        try {
            try {
                if (i3 == 0) {
                    Jp0.O(obj);
                    interfaceC1608gi = (InterfaceC1608gi) this.f846o;
                    C2379oe.j.clear();
                    arrayList4 = new ArrayList();
                    C3380yu c3380yuQ = C2379oe.q();
                    int iIntValue = ((Number) AbstractC0911Ye.b0(C2379oe.c)).intValue();
                    this.f846o = interfaceC1608gi;
                    this.m = arrayList4;
                    this.n = 1;
                    c3380yuQ.getClass();
                    objJ = AbstractC1376eG.J(AbstractC1910jn.b, new C3186wu(c3380yuQ, iIntValue, null), this);
                    if (objJ == enumC1706hi) {
                        return enumC1706hi;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list2 = this.m;
                        list = (List) this.f846o;
                        try {
                            Jp0.O(obj);
                            objB = obj;
                            listR0 = AbstractC0911Ye.r0(AbstractC0911Ye.m0(list2, AbstractC1016af.P((Iterable) objB)), new C1698he(new C1698he(new N2(5), i2), i));
                            linkedHashMap = new LinkedHashMap();
                            it = listR0.iterator();
                            while (it.hasNext()) {
                                try {
                                    C2508pu c2508pu = (C2508pu) it.next();
                                    try {
                                        int i4 = c2508pu.b;
                                        str2 = c2508pu.e;
                                        str3 = c2508pu.c;
                                        String str8 = "fctvevent-" + i4 + "-" + c2508pu.a;
                                        C2379oe c2379oe = C2379oe.b;
                                        C1101bX c1101bXV = C2379oe.v(str3);
                                        String str9 = (String) c1101bXV.l;
                                        String str10 = (String) c1101bXV.m;
                                        l = c2508pu.i;
                                        z = c2508pu.j;
                                        if (!z) {
                                            str3 = C2379oe.p(l) + " • " + str3;
                                        }
                                        String str11 = str3;
                                        str4 = c2508pu.h;
                                        str5 = c2508pu.g;
                                        str6 = c2508pu.f;
                                        if (str5 == null) {
                                            str7 = str5;
                                        } else if (str4 == null) {
                                            str7 = str6;
                                        } else {
                                            str7 = str4;
                                        }
                                        Boolean bool = Boolean.TRUE;
                                        C1101bX c1101bX = new C1101bX("is_tv_channel", bool);
                                        Iterator it2 = it;
                                        C1101bX c1101bX2 = new C1101bX("is_live_channel", Boolean.valueOf(z));
                                        C1101bX c1101bX3 = new C1101bX("category", str2);
                                        list3 = list;
                                        try {
                                            C1101bX c1101bX4 = new C1101bX("dual_team_event", bool);
                                            if (l != null || (instantOfEpochMilli = Instant.ofEpochMilli(l.longValue())) == null) {
                                                string = null;
                                            } else {
                                                string = instantOfEpochMilli.toString();
                                            }
                                            C1101bX c1101bX5 = new C1101bX("fana_start_date", string);
                                            C1101bX c1101bX6 = new C1101bX("fana_tournament", str2);
                                            List list5 = listR0;
                                            C1101bX c1101bX7 = new C1101bX("fana_home_name", str9);
                                            C1101bX c1101bX8 = new C1101bX("fana_away_name", str10);
                                            if (str5 == null) {
                                                str5 = str6;
                                            }
                                            C1101bX c1101bX9 = new C1101bX("fana_home_logo", str5);
                                            if (str4 == null) {
                                                str4 = str6;
                                            }
                                            C1387eR c1387eR2 = new C1387eR(str8, str11, null, null, null, null, null, null, str7, str6, null, null, null, null, AbstractC3327yN.z(c1101bX, c1101bX2, c1101bX3, c1101bX4, c1101bX5, c1101bX6, c1101bX7, c1101bX8, c1101bX9, new C1101bX("fana_away_logo", str4)), 15612);
                                            c1387eR2.t = C2379oe.e;
                                            C2379oe.j.put(str8, c1387eR2);
                                            arrayList3 = linkedHashMap.get(str2);
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                                linkedHashMap.put(str2, arrayList3);
                                            }
                                            ((List) arrayList3).add(c1387eR2);
                                            it = it2;
                                            list = list3;
                                            listR0 = list5;
                                        } catch (Exception e) {
                                            e = e;
                                            list = list3;
                                            e.getMessage();
                                            return list;
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        list3 = list;
                                        list = list3;
                                        e.getMessage();
                                        return list;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    e.getMessage();
                                    return list;
                                }
                            }
                            List list6 = listR0;
                            list3 = list;
                            arrayList = new ArrayList();
                            for (Object obj2 : list6) {
                                if (((C2508pu) obj2).j) {
                                    arrayList.add(obj2);
                                }
                            }
                            arrayList2 = new ArrayList();
                            for (C2508pu c2508pu2 : arrayList) {
                                c1387eR = (C1387eR) C2379oe.j.get("fctvevent-" + c2508pu2.b + "-" + c2508pu2.a);
                                if (c1387eR != null) {
                                    arrayList2.add(c1387eR);
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                list = list3;
                                list.add(new C0882Xb("TODO", arrayList2));
                            } else {
                                list = list3;
                            }
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                str = (String) entry.getKey();
                                list4 = (List) entry.getValue();
                                if (!list4.isEmpty()) {
                                    list.add(new C0882Xb(str, AbstractC0911Ye.x0(list4)));
                                }
                            }
                        } catch (Exception e4) {
                            e = e4;
                            e.getMessage();
                            return list;
                        }
                        return list;
                    }
                    arrayList4 = this.m;
                    interfaceC1608gi = (InterfaceC1608gi) this.f846o;
                    Jp0.O(obj);
                    objJ = obj;
                }
                objK = (List) objJ;
            } catch (Exception e5) {
                e = e5;
                list = arrayList4;
                e.getMessage();
                return list;
            }
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        Object obj3 = C1233cq.l;
        if (objK instanceof C2439p80) {
            objK = obj3;
        }
        list2 = (List) objK;
        List listY = AbstractC0911Ye.Y(1, C2379oe.c);
        ArrayList arrayList5 = new ArrayList(AbstractC1016af.O(listY, 10));
        Iterator it3 = listY.iterator();
        while (it3.hasNext()) {
            arrayList5.add(AbstractC1376eG.c(interfaceC1608gi, null, 0, new C1796ie(((Number) it3.next()).intValue(), null), 3));
        }
        this.f846o = arrayList4;
        this.m = list2;
        this.n = 2;
        objB = AbstractC1370eA.b(arrayList5, this);
        if (objB == enumC1706hi) {
            return enumC1706hi;
        }
        list = arrayList4;
        listR0 = AbstractC0911Ye.r0(AbstractC0911Ye.m0(list2, AbstractC1016af.P((Iterable) objB)), new C1698he(new C1698he(new N2(5), i2), i));
        linkedHashMap = new LinkedHashMap();
        it = listR0.iterator();
        while (it.hasNext()) {
            C2508pu c2508pu3 = (C2508pu) it.next();
            int i5 = c2508pu3.b;
            str2 = c2508pu3.e;
            str3 = c2508pu3.c;
            String str12 = "fctvevent-" + i5 + "-" + c2508pu3.a;
            C2379oe c2379oe2 = C2379oe.b;
            C1101bX c1101bXV2 = C2379oe.v(str3);
            String str13 = (String) c1101bXV2.l;
            String str14 = (String) c1101bXV2.m;
            l = c2508pu3.i;
            z = c2508pu3.j;
            if (!z) {
                str3 = C2379oe.p(l) + " • " + str3;
            }
            String str15 = str3;
            str4 = c2508pu3.h;
            str5 = c2508pu3.g;
            str6 = c2508pu3.f;
            if (str5 == null) {
                str7 = str5;
            } else if (str4 == null) {
                str7 = str6;
            } else {
                str7 = str4;
            }
            Boolean bool2 = Boolean.TRUE;
            C1101bX c1101bX10 = new C1101bX("is_tv_channel", bool2);
            Iterator it4 = it;
            C1101bX c1101bX11 = new C1101bX("is_live_channel", Boolean.valueOf(z));
            C1101bX c1101bX12 = new C1101bX("category", str2);
            list3 = list;
            C1101bX c1101bX13 = new C1101bX("dual_team_event", bool2);
            if (l != null) {
                string = null;
            } else {
                string = null;
            }
            C1101bX c1101bX14 = new C1101bX("fana_start_date", string);
            C1101bX c1101bX15 = new C1101bX("fana_tournament", str2);
            List list7 = listR0;
            C1101bX c1101bX16 = new C1101bX("fana_home_name", str13);
            C1101bX c1101bX17 = new C1101bX("fana_away_name", str14);
            if (str5 == null) {
                str5 = str6;
            }
            C1101bX c1101bX18 = new C1101bX("fana_home_logo", str5);
            if (str4 == null) {
                str4 = str6;
            }
            C1387eR c1387eR3 = new C1387eR(str12, str15, null, null, null, null, null, null, str7, str6, null, null, null, null, AbstractC3327yN.z(c1101bX10, c1101bX11, c1101bX12, c1101bX13, c1101bX14, c1101bX15, c1101bX16, c1101bX17, c1101bX18, new C1101bX("fana_away_logo", str4)), 15612);
            c1387eR3.t = C2379oe.e;
            C2379oe.j.put(str12, c1387eR3);
            arrayList3 = linkedHashMap.get(str2);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(str2, arrayList3);
            }
            ((List) arrayList3).add(c1387eR3);
            it = it4;
            list = list3;
            listR0 = list7;
        }
        List list8 = listR0;
        list3 = list;
        arrayList = new ArrayList();
        while (r1.hasNext()) {
            if (((C2508pu) obj2).j) {
                arrayList.add(obj2);
            }
        }
        arrayList2 = new ArrayList();
        while (r0.hasNext()) {
            c1387eR = (C1387eR) C2379oe.j.get("fctvevent-" + c2508pu2.b + "-" + c2508pu2.a);
            if (c1387eR != null) {
                arrayList2.add(c1387eR);
            }
        }
        if (!arrayList2.isEmpty()) {
            list = list3;
            list.add(new C0882Xb("TODO", arrayList2));
        } else {
            list = list3;
        }
        while (r0.hasNext()) {
            str = (String) entry.getKey();
            list4 = (List) entry.getValue();
            if (!list4.isEmpty()) {
                list.add(new C0882Xb(str, AbstractC0911Ye.x0(list4)));
            }
        }
        return list;
    }
}
