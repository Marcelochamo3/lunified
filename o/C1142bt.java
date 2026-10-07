package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: o.bt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1142bt extends Ph0 implements InterfaceC0775Sy {
    public int m;

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1142bt) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1142bt(2, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0282  */
    /* JADX WARN: Code duplicated, block: B:121:0x028f A[EDGE_INSN: B:121:0x028f->B:133:0x02b7 BREAK  A[LOOP:10: B:123:0x0295->B:290:?]] */
    /* JADX WARN: Code duplicated, block: B:122:0x0291  */
    /* JADX WARN: Code duplicated, block: B:125:0x029b  */
    /* JADX WARN: Code duplicated, block: B:130:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:138:0x02dd A[LOOP:11: B:136:0x02d7->B:138:0x02dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:142:0x030f  */
    /* JADX WARN: Code duplicated, block: B:148:0x032a  */
    /* JADX WARN: Code duplicated, block: B:151:0x0347 A[LOOP:13: B:149:0x0341->B:151:0x0347, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x036a  */
    /* JADX WARN: Code duplicated, block: B:160:0x0385  */
    /* JADX WARN: Code duplicated, block: B:163:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:165:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:166:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:170:0x03b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:171:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:174:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:176:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:180:0x03db A[LOOP:15: B:178:0x03d5->B:180:0x03db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:183:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:187:0x041a  */
    /* JADX WARN: Code duplicated, block: B:189:0x0422  */
    /* JADX WARN: Code duplicated, block: B:190:0x0427  */
    /* JADX WARN: Code duplicated, block: B:194:0x043b  */
    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:201:0x045a  */
    /* JADX WARN: Code duplicated, block: B:205:0x046d  */
    /* JADX WARN: Code duplicated, block: B:210:0x0492  */
    /* JADX WARN: Code duplicated, block: B:216:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:222:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:224:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:225:0x04df  */
    /* JADX WARN: Code duplicated, block: B:228:0x04f4 A[LOOP:19: B:226:0x04ee->B:228:0x04f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:232:0x051c  */
    /* JADX WARN: Code duplicated, block: B:246:0x0572 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:247:0x0573  */
    /* JADX WARN: Code duplicated, block: B:250:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:260:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x01ce A[EDGE_INSN: B:262:0x01ce->B:86:0x01ce BREAK  A[LOOP:3: B:44:0x00d9->B:85:0x01bf], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x01ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:? A[LOOP:5: B:72:0x0182->B:271:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x02b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x027c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:? A[LOOP:10: B:123:0x0295->B:290:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x0323 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x0379 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x0364 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x04b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x048c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x0536 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x04bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x052b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x0516 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:49:0x0104  */
    /* JADX WARN: Code duplicated, block: B:51:0x0117  */
    /* JADX WARN: Code duplicated, block: B:52:0x0125  */
    /* JADX WARN: Code duplicated, block: B:54:0x0129  */
    /* JADX WARN: Code duplicated, block: B:57:0x012f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0151  */
    /* JADX WARN: Code duplicated, block: B:67:0x0156  */
    /* JADX WARN: Code duplicated, block: B:70:0x017c A[EDGE_INSN: B:70:0x017c->B:77:0x0196 BREAK  A[LOOP:5: B:72:0x0182->B:271:?]] */
    /* JADX WARN: Code duplicated, block: B:71:0x017e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0188  */
    /* JADX WARN: Code duplicated, block: B:78:0x0198  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:92:0x0200  */
    /* JADX WARN: Code duplicated, block: B:96:0x0214  */
    /* JADX WARN: Instruction removed from duplicated block: B:183:0x03f5, please report this as an issue */
    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        Object objP;
        Object objT;
        ArrayList arrayList;
        Iterator it;
        String str;
        Object next;
        C1101bX c1101bX;
        List list;
        List<C0613Ms> listU;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it2;
        String str2;
        C1101bX c1101bX2;
        List<C0613Ms> listU2;
        ArrayList arrayList4;
        Iterator it3;
        ArrayList arrayList5;
        ArrayList arrayList6;
        Set setB0;
        List<C0613Ms> listU3;
        C3421zK c3421zK;
        Iterator it4;
        Object next2;
        C1101bX c1101bX3;
        ArrayList<C1101bX> arrayList7;
        C3421zK c3421zKH;
        C0821Us c0821Us;
        C0795Ts c0795Ts;
        ArrayList arrayList8;
        HashSet hashSet;
        ArrayList arrayList9;
        ArrayList arrayListV;
        String str3;
        C0821Us c0821Us2;
        boolean z;
        C1101bX c1101bX4;
        C0821Us c0821Us3;
        ArrayList arrayList10;
        C0882Xb c0882Xb;
        boolean z2;
        C0821Us c0821Us4;
        String str4;
        C0795Ts c0795Ts2;
        ArrayList arrayList11;
        C0882Xb c0882Xb2;
        C0821Us c0821Us5;
        ArrayList arrayList12;
        Iterator it5;
        HashSet hashSet2;
        ArrayList arrayList13;
        C0613Ms c0613Ms;
        Iterator it6;
        C0613Ms c0613Ms2;
        boolean z3;
        boolean z4;
        ArrayList arrayList14;
        C0613Ms c0613Ms3;
        boolean z5;
        boolean z6;
        C0821Us c0821Us6;
        C0795Ts c0795Ts3;
        ArrayList arrayList15;
        Iterator it7;
        C0613Ms c0613Ms4;
        String str5;
        Iterator it8;
        String lowerCase;
        String str6;
        C0821Us c0821Us7;
        boolean z7;
        String str7;
        String lowerCase2;
        C0795Ts c0795Ts4;
        String str8;
        C1101bX c1101bX5;
        List listK;
        Iterator it9;
        boolean z8;
        C0821Us c0821Us8;
        C0795Ts c0795Ts5;
        C0821Us c0821Us9;
        C1101bX c1101bX6;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i != 0) {
            if (i == 1) {
                Jp0.O(obj);
                objP = obj;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
                objT = obj;
            }
            List list2 = (List) objT;
            arrayList = new ArrayList();
            for (Object obj2 : list2) {
                c1101bX6 = (C1101bX) obj2;
                if (AbstractC1468fA.t((C0821Us) c1101bX6.l, (C0795Ts) c1101bX6.m)) {
                    arrayList.add(obj2);
                }
            }
            it = list2.iterator();
            do {
                str = "spec";
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                c0821Us9 = (C0821Us) ((C1101bX) next).l;
                AbstractC1474fG.j(c0821Us9, "spec");
            } while (!AbstractC1899jh0.N(c0821Us9.b, "EventsPlaylist", true));
            c1101bX = (C1101bX) next;
            C2409ot c2409ot = C2409ot.b;
            if (c1101bX != null || (c0795Ts5 = (C0795Ts) c1101bX.m) == null) {
                list = null;
            } else {
                list = c0795Ts5.b;
            }
            if (list == null) {
                list = C1233cq.l;
            }
            listU = C2409ot.u(list);
            arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                c0821Us8 = (C0821Us) ((C1101bX) obj3).l;
                AbstractC1474fG.j(c0821Us8, "spec");
                if (!AbstractC1899jh0.N(c0821Us8.b, "EventsPlaylist", true)) {
                    arrayList2.add(obj3);
                }
            }
            C2409ot c2409ot2 = C2409ot.b;
            arrayList3 = new ArrayList();
            it2 = arrayList2.iterator();
            while (true) {
                str2 = "";
                if (it2.hasNext()) {
                    break;
                }
                C1101bX c1101bX7 = (C1101bX) it2.next();
                c0821Us6 = (C0821Us) c1101bX7.l;
                c0795Ts3 = (C0795Ts) c1101bX7.m;
                List list3 = c0795Ts3.b;
                arrayList15 = new ArrayList();
                it7 = list3.iterator();
                while (it7.hasNext()) {
                    Object next3 = it7.next();
                    c0613Ms4 = (C0613Ms) next3;
                    AbstractC1474fG.j(c0821Us6, str);
                    AbstractC1474fG.j(c0613Ms4, "card");
                    Iterator it10 = it7;
                    if (c0613Ms4.h) {
                        c1101bX5 = c1101bX;
                        it8 = it2;
                        str6 = str;
                        c0821Us7 = c0821Us6;
                        c0795Ts4 = c0795Ts3;
                        str8 = str2;
                    } else {
                        str5 = c0821Us6.c;
                        if (str5 == null) {
                            str5 = c0795Ts3.a;
                        }
                        it8 = it2;
                        if (str5 == null) {
                            str5 = str2;
                        }
                        Locale locale = Locale.ROOT;
                        lowerCase = str5.toLowerCase(locale);
                        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                        str6 = str;
                        c0821Us7 = c0821Us6;
                        if (!AbstractC1119bh0.W(lowerCase, "en vivo", false) || AbstractC1119bh0.W(lowerCase, "live", false)) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        str7 = c0613Ms4.g;
                        if (str7 == null) {
                            str7 = str2;
                        }
                        lowerCase2 = str7.toLowerCase(locale);
                        AbstractC1474fG.i(lowerCase2, "toLowerCase(...)");
                        c0795Ts4 = c0795Ts3;
                        str8 = str2;
                        c1101bX5 = c1101bX;
                        listK = AbstractC0937Ze.K("future", "program", "scheduled", "próxim", "proxim");
                        if (listK.isEmpty()) {
                            z8 = true;
                            break;
                        }
                        it9 = listK.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                z8 = true;
                                break;
                            }
                            if (AbstractC1119bh0.W(lowerCase2, (CharSequence) it9.next(), false)) {
                                z8 = false;
                                break;
                            }
                        }
                        if (z7) {
                            if (c0613Ms4.b == EnumC0639Ns.l || !(!c0613Ms4.f403o.isEmpty()) || !z8) {
                            }
                        }
                        it7 = it10;
                        it2 = it8;
                        str = str6;
                        c0821Us6 = c0821Us7;
                        c0795Ts3 = c0795Ts4;
                        str2 = str8;
                        c1101bX = c1101bX5;
                    }
                    arrayList15.add(next3);
                    it7 = it10;
                    it2 = it8;
                    str = str6;
                    c0821Us6 = c0821Us7;
                    c0795Ts3 = c0795Ts4;
                    str2 = str8;
                    c1101bX = c1101bX5;
                }
                AbstractC1406ef.Q(arrayList3, arrayList15);
            }
            c1101bX2 = c1101bX;
            listU2 = C2409ot.u(arrayList3);
            arrayList4 = new ArrayList();
            it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                List list4 = ((C0795Ts) ((C1101bX) it3.next()).m).b;
                arrayList14 = new ArrayList();
                for (Object obj4 : list4) {
                    c0613Ms3 = (C0613Ms) obj4;
                    AbstractC1474fG.j(c0613Ms3, "card");
                    if (c0613Ms3.b != EnumC0639Ns.m && !c0613Ms3.h) {
                        String str9 = c0613Ms3.g;
                        if (str9 == null) {
                            str9 = "";
                        }
                        String lowerCase3 = str9.toLowerCase(Locale.ROOT);
                        AbstractC1474fG.i(lowerCase3, "toLowerCase(...)");
                        List listK2 = AbstractC0937Ze.K("finished", "ended", "finalizado", "terminado");
                        if (!listK2.isEmpty()) {
                            Iterator it11 = listK2.iterator();
                            while (true) {
                                if (it11.hasNext()) {
                                    if (AbstractC1119bh0.W(lowerCase3, (CharSequence) it11.next(), false)) {
                                        z6 = true;
                                        break;
                                    }
                                }
                            }
                            z5 = !z6;
                        }
                        z6 = false;
                        z5 = !z6;
                    }
                    if (z5) {
                        arrayList14.add(obj4);
                    }
                }
                AbstractC1406ef.Q(arrayList4, arrayList14);
            }
            List listU4 = C2409ot.u(arrayList4);
            arrayList5 = new ArrayList();
            for (Object obj5 : listU4) {
                c0613Ms = (C0613Ms) obj5;
                if (listU2.isEmpty()) {
                    z4 = false;
                    break;
                }
                it6 = listU2.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        z4 = false;
                        break;
                    }
                    c0613Ms2 = (C0613Ms) it6.next();
                    if (c0613Ms2.b == c0613Ms.b || !AbstractC1474fG.b(c0613Ms2.a, c0613Ms.a)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        z4 = true;
                        break;
                    }
                }
                if (!z4) {
                    arrayList5.add(obj5);
                }
            }
            List listR0 = AbstractC0911Ye.r0(arrayList5, new N2(9));
            arrayList6 = new ArrayList(AbstractC1016af.O(listU2, 10));
            for (C0613Ms c0613Ms5 : listU2) {
                arrayList6.add(new C1101bX(c0613Ms5.b, c0613Ms5.a));
            }
            setB0 = AbstractC0911Ye.B0(arrayList6);
            C2409ot c2409ot3 = C2409ot.b;
            listU3 = C2409ot.u(AbstractC0911Ye.m0(listU2, listR0));
            c3421zK = new C3421zK();
            it4 = list2.iterator();
            do {
                if (it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
            } while (!AbstractC1474fG.b(((C0821Us) ((C1101bX) next2).l).b, "TopBannerPlaylist"));
            c1101bX3 = (C1101bX) next2;
            if (c1101bX3 != null) {
                c0821Us5 = (C0821Us) c1101bX3.l;
                List list5 = ((C0795Ts) c1101bX3.m).b;
                arrayList12 = new ArrayList(AbstractC1016af.O(list5, 10));
                it5 = list5.iterator();
                while (it5.hasNext()) {
                    arrayList12.add(C2409ot.C((C0613Ms) it5.next(), 2));
                }
                hashSet2 = new HashSet();
                arrayList13 = new ArrayList();
                for (Object obj6 : arrayList12) {
                    if (hashSet2.add(((C1387eR) obj6).a)) {
                        arrayList13.add(obj6);
                    }
                }
                if (!arrayList13.isEmpty()) {
                    C0882Xb c0882Xb3 = new C0882Xb("Featured", arrayList13);
                    c0882Xb3.f = AbstractC1701hf0.u("fana-playlist|", c0821Us5.a, "|Destacados");
                    c0882Xb3.g = "fana-home-featured";
                    c3421zK.add(c0882Xb3);
                }
            }
            if (!listU.isEmpty()) {
                if (c1101bX2 != null) {
                    c0821Us4 = (C0821Us) c1101bX2.l;
                } else {
                    c0821Us4 = null;
                }
                if (c0821Us4 != null || (str4 = c0821Us4.c) == null) {
                    if (c1101bX2 != null || (c0795Ts2 = (C0795Ts) c1101bX2.m) == null) {
                        str4 = null;
                    } else {
                        str4 = c0795Ts2.a;
                    }
                    if (str4 == null) {
                        str4 = "Eventos";
                    }
                }
                arrayList11 = new ArrayList(AbstractC1016af.O(listU, 10));
                for (C0613Ms c0613Ms6 : listU) {
                    C2409ot c2409ot4 = C2409ot.b;
                    boolean z9 = c0613Ms6.h;
                    arrayList11.add(c2409ot4.B(c0613Ms6, z9, z9));
                }
                c0882Xb2 = new C0882Xb(str4, arrayList11);
                if (c0821Us4 != null) {
                    c0882Xb2.f = "fana-playlist|" + c0821Us4.a + "|" + str4;
                }
                c0882Xb2.g = "fana-home-events";
                c3421zK.add(c0882Xb2);
            }
            if (!listU3.isEmpty()) {
                c1101bX4 = (C1101bX) AbstractC0911Ye.d0(arrayList2);
                if (c1101bX4 != null) {
                    c0821Us3 = (C0821Us) c1101bX4.l;
                } else {
                    c0821Us3 = null;
                }
                arrayList10 = new ArrayList(AbstractC1016af.O(listU3, 10));
                for (C0613Ms c0613Ms7 : listU3) {
                    C2409ot c2409ot5 = C2409ot.b;
                    if (!setB0.contains(new C1101bX(c0613Ms7.b, c0613Ms7.a)) || c0613Ms7.h) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    arrayList10.add(c2409ot5.B(c0613Ms7, z2, true));
                }
                c0882Xb = new C0882Xb("EN VIVO Y PRÓXIMAMENTE", arrayList10);
                if (c0821Us3 != null) {
                    c0882Xb.f = AbstractC1701hf0.h(new StringBuilder("fana-playlist|"), c0821Us3.a, "|EN VIVO Y PRÓXIMAMENTE");
                }
                c0882Xb.g = "fana-home-live-upcoming";
                c3421zK.add(c0882Xb);
            }
            arrayList7 = new ArrayList();
            for (Object obj7 : list2) {
                C1101bX c1101bX8 = (C1101bX) obj7;
                c0821Us2 = (C0821Us) c1101bX8.l;
                C0795Ts c0795Ts6 = (C0795Ts) c1101bX8.m;
                if (!AbstractC1474fG.b(c0821Us2.b, "TopBannerPlaylist") || AbstractC1468fA.t(c0821Us2, c0795Ts6)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    arrayList7.add(obj7);
                }
            }
            for (C1101bX c1101bX9 : arrayList7) {
                c0821Us = (C0821Us) c1101bX9.l;
                c0795Ts = (C0795Ts) c1101bX9.m;
                if (C2409ot.s(c0821Us, c0795Ts)) {
                    arrayListV = C2409ot.v(c0795Ts.b);
                } else {
                    List<C0613Ms> list6 = c0795Ts.b;
                    arrayList8 = new ArrayList(AbstractC1016af.O(list6, 10));
                    for (C0613Ms c0613Ms8 : list6) {
                        arrayList8.add(C2409ot.b.B(c0613Ms8, c0613Ms8.h, true));
                    }
                    hashSet = new HashSet();
                    arrayList9 = new ArrayList();
                    for (Object obj8 : arrayList8) {
                        if (hashSet.add(((C1387eR) obj8).a)) {
                            arrayList9.add(obj8);
                        }
                    }
                    arrayListV = arrayList9;
                }
                if (arrayListV.isEmpty()) {
                    str3 = c0821Us.c;
                    if (str3 == null && (str3 = c0795Ts.a) == null) {
                        str3 = "Deportes";
                    }
                    C0882Xb c0882Xb4 = new C0882Xb(str3, arrayListV);
                    StringBuilder sb = new StringBuilder("fana-playlist|");
                    String str10 = c0821Us.a;
                    sb.append(str10);
                    sb.append("|");
                    sb.append(str3);
                    c0882Xb4.f = sb.toString();
                    c0882Xb4.g = AbstractC1701hf0.t("fana-home-", str10);
                    c3421zK.add(c0882Xb4);
                }
            }
            c3421zKH = AbstractC2506pt.h(c3421zK);
            if (c3421zKH.isEmpty()) {
                throw new IOException("No se encontraron categorías con contenido");
            }
            return c3421zKH;
        }
        Jp0.O(obj);
        C2409ot c2409ot6 = C2409ot.b;
        this.m = 1;
        objP = C2409ot.p(c2409ot6, this);
        if (objP == enumC1706hi) {
            return enumC1706hi;
        }
        C2409ot c2409ot7 = C2409ot.b;
        this.m = 2;
        objT = C2409ot.t(c2409ot7, (C0665Os) objP, this);
        if (objT == enumC1706hi) {
            return enumC1706hi;
        }
        List list7 = (List) objT;
        arrayList = new ArrayList();
        while (r5.hasNext()) {
            c1101bX6 = (C1101bX) obj2;
            if (AbstractC1468fA.t((C0821Us) c1101bX6.l, (C0795Ts) c1101bX6.m)) {
                arrayList.add(obj2);
            }
        }
        it = list7.iterator();
        do {
            str = "spec";
            if (it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            c0821Us9 = (C0821Us) ((C1101bX) next).l;
            AbstractC1474fG.j(c0821Us9, "spec");
        } while (!AbstractC1899jh0.N(c0821Us9.b, "EventsPlaylist", true));
        c1101bX = (C1101bX) next;
        C2409ot c2409ot8 = C2409ot.b;
        if (c1101bX != null) {
            list = null;
        } else {
            list = null;
        }
        if (list == null) {
            list = C1233cq.l;
        }
        listU = C2409ot.u(list);
        arrayList2 = new ArrayList();
        while (r1.hasNext()) {
            c0821Us8 = (C0821Us) ((C1101bX) obj3).l;
            AbstractC1474fG.j(c0821Us8, "spec");
            if (!AbstractC1899jh0.N(c0821Us8.b, "EventsPlaylist", true)) {
                arrayList2.add(obj3);
            }
        }
        C2409ot c2409ot9 = C2409ot.b;
        arrayList3 = new ArrayList();
        it2 = arrayList2.iterator();
        while (true) {
            str2 = "";
            if (it2.hasNext()) {
                break;
                break;
            }
            C1101bX c1101bX10 = (C1101bX) it2.next();
            c0821Us6 = (C0821Us) c1101bX10.l;
            c0795Ts3 = (C0795Ts) c1101bX10.m;
            List list8 = c0795Ts3.b;
            arrayList15 = new ArrayList();
            it7 = list8.iterator();
            while (it7.hasNext()) {
                Object next4 = it7.next();
                c0613Ms4 = (C0613Ms) next4;
                AbstractC1474fG.j(c0821Us6, str);
                AbstractC1474fG.j(c0613Ms4, "card");
                Iterator it12 = it7;
                if (c0613Ms4.h) {
                    c1101bX5 = c1101bX;
                    it8 = it2;
                    str6 = str;
                    c0821Us7 = c0821Us6;
                    c0795Ts4 = c0795Ts3;
                    str8 = str2;
                } else {
                    str5 = c0821Us6.c;
                    if (str5 == null) {
                        str5 = c0795Ts3.a;
                    }
                    it8 = it2;
                    if (str5 == null) {
                        str5 = str2;
                    }
                    Locale locale2 = Locale.ROOT;
                    lowerCase = str5.toLowerCase(locale2);
                    AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                    str6 = str;
                    c0821Us7 = c0821Us6;
                    if (AbstractC1119bh0.W(lowerCase, "en vivo", false)) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    str7 = c0613Ms4.g;
                    if (str7 == null) {
                        str7 = str2;
                    }
                    lowerCase2 = str7.toLowerCase(locale2);
                    AbstractC1474fG.i(lowerCase2, "toLowerCase(...)");
                    c0795Ts4 = c0795Ts3;
                    str8 = str2;
                    c1101bX5 = c1101bX;
                    listK = AbstractC0937Ze.K("future", "program", "scheduled", "próxim", "proxim");
                    if (listK.isEmpty()) {
                        z8 = true;
                        break;
                    }
                    it9 = listK.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            z8 = true;
                            break;
                        }
                        if (AbstractC1119bh0.W(lowerCase2, (CharSequence) it9.next(), false)) {
                            z8 = false;
                            break;
                        }
                    }
                    if (z7) {
                        if (c0613Ms4.b == EnumC0639Ns.l) {
                        }
                    }
                    it7 = it12;
                    it2 = it8;
                    str = str6;
                    c0821Us6 = c0821Us7;
                    c0795Ts3 = c0795Ts4;
                    str2 = str8;
                    c1101bX = c1101bX5;
                }
                arrayList15.add(next4);
                it7 = it12;
                it2 = it8;
                str = str6;
                c0821Us6 = c0821Us7;
                c0795Ts3 = c0795Ts4;
                str2 = str8;
                c1101bX = c1101bX5;
            }
            AbstractC1406ef.Q(arrayList3, arrayList15);
        }
        c1101bX2 = c1101bX;
        listU2 = C2409ot.u(arrayList3);
        arrayList4 = new ArrayList();
        it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            List list9 = ((C0795Ts) ((C1101bX) it3.next()).m).b;
            arrayList14 = new ArrayList();
            while (r4.hasNext()) {
                c0613Ms3 = (C0613Ms) obj4;
                AbstractC1474fG.j(c0613Ms3, "card");
                z5 = c0613Ms3.b != EnumC0639Ns.m ? false : false;
                if (z5) {
                    arrayList14.add(obj4);
                }
            }
            AbstractC1406ef.Q(arrayList4, arrayList14);
        }
        List listU5 = C2409ot.u(arrayList4);
        arrayList5 = new ArrayList();
        while (r1.hasNext()) {
            c0613Ms = (C0613Ms) obj5;
            if (listU2.isEmpty()) {
                z4 = false;
                break;
            }
            it6 = listU2.iterator();
            while (true) {
                if (it6.hasNext()) {
                    z4 = false;
                    break;
                }
                c0613Ms2 = (C0613Ms) it6.next();
                if (c0613Ms2.b == c0613Ms.b) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                if (z3) {
                    z4 = true;
                    break;
                }
            }
            if (!z4) {
                arrayList5.add(obj5);
            }
        }
        List listR1 = AbstractC0911Ye.r0(arrayList5, new N2(9));
        arrayList6 = new ArrayList(AbstractC1016af.O(listU2, 10));
        while (r6.hasNext()) {
            arrayList6.add(new C1101bX(c0613Ms5.b, c0613Ms5.a));
        }
        setB0 = AbstractC0911Ye.B0(arrayList6);
        C2409ot c2409ot10 = C2409ot.b;
        listU3 = C2409ot.u(AbstractC0911Ye.m0(listU2, listR1));
        c3421zK = new C3421zK();
        it4 = list7.iterator();
        do {
            if (it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (!AbstractC1474fG.b(((C0821Us) ((C1101bX) next2).l).b, "TopBannerPlaylist"));
        c1101bX3 = (C1101bX) next2;
        if (c1101bX3 != null) {
            c0821Us5 = (C0821Us) c1101bX3.l;
            List list10 = ((C0795Ts) c1101bX3.m).b;
            arrayList12 = new ArrayList(AbstractC1016af.O(list10, 10));
            it5 = list10.iterator();
            while (it5.hasNext()) {
                arrayList12.add(C2409ot.C((C0613Ms) it5.next(), 2));
            }
            hashSet2 = new HashSet();
            arrayList13 = new ArrayList();
            while (r11.hasNext()) {
                if (hashSet2.add(((C1387eR) obj6).a)) {
                    arrayList13.add(obj6);
                }
            }
            if (!arrayList13.isEmpty()) {
                C0882Xb c0882Xb5 = new C0882Xb("Featured", arrayList13);
                c0882Xb5.f = AbstractC1701hf0.u("fana-playlist|", c0821Us5.a, "|Destacados");
                c0882Xb5.g = "fana-home-featured";
                c3421zK.add(c0882Xb5);
            }
        }
        if (!listU.isEmpty()) {
            if (c1101bX2 != null) {
                c0821Us4 = (C0821Us) c1101bX2.l;
            } else {
                c0821Us4 = null;
            }
            if (c0821Us4 != null) {
                if (c1101bX2 != null) {
                    str4 = null;
                } else {
                    str4 = null;
                }
                if (str4 == null) {
                    str4 = "Eventos";
                }
            } else {
                if (c1101bX2 != null) {
                    str4 = null;
                } else {
                    str4 = null;
                }
                if (str4 == null) {
                    str4 = "Eventos";
                }
            }
            arrayList11 = new ArrayList(AbstractC1016af.O(listU, 10));
            while (r5.hasNext()) {
                C2409ot c2409ot11 = C2409ot.b;
                boolean z10 = c0613Ms6.h;
                arrayList11.add(c2409ot11.B(c0613Ms6, z10, z10));
            }
            c0882Xb2 = new C0882Xb(str4, arrayList11);
            if (c0821Us4 != null) {
                c0882Xb2.f = "fana-playlist|" + c0821Us4.a + "|" + str4;
            }
            c0882Xb2.g = "fana-home-events";
            c3421zK.add(c0882Xb2);
        }
        if (!listU3.isEmpty()) {
            c1101bX4 = (C1101bX) AbstractC0911Ye.d0(arrayList2);
            if (c1101bX4 != null) {
                c0821Us3 = (C0821Us) c1101bX4.l;
            } else {
                c0821Us3 = null;
            }
            arrayList10 = new ArrayList(AbstractC1016af.O(listU3, 10));
            while (r0.hasNext()) {
                C2409ot c2409ot12 = C2409ot.b;
                if (setB0.contains(new C1101bX(c0613Ms7.b, c0613Ms7.a))) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                arrayList10.add(c2409ot12.B(c0613Ms7, z2, true));
            }
            c0882Xb = new C0882Xb("EN VIVO Y PRÓXIMAMENTE", arrayList10);
            if (c0821Us3 != null) {
                c0882Xb.f = AbstractC1701hf0.h(new StringBuilder("fana-playlist|"), c0821Us3.a, "|EN VIVO Y PRÓXIMAMENTE");
            }
            c0882Xb.g = "fana-home-live-upcoming";
            c3421zK.add(c0882Xb);
        }
        arrayList7 = new ArrayList();
        while (r2.hasNext()) {
            C1101bX c1101bX11 = (C1101bX) obj7;
            c0821Us2 = (C0821Us) c1101bX11.l;
            C0795Ts c0795Ts7 = (C0795Ts) c1101bX11.m;
            if (AbstractC1474fG.b(c0821Us2.b, "TopBannerPlaylist")) {
                z = true;
            } else {
                z = true;
            }
            if (!z) {
                arrayList7.add(obj7);
            }
        }
        while (r0.hasNext()) {
            c0821Us = (C0821Us) c1101bX9.l;
            c0795Ts = (C0795Ts) c1101bX9.m;
            if (C2409ot.s(c0821Us, c0795Ts)) {
                arrayListV = C2409ot.v(c0795Ts.b);
            } else {
                List<C0613Ms> list11 = c0795Ts.b;
                arrayList8 = new ArrayList(AbstractC1016af.O(list11, 10));
                while (r5.hasNext()) {
                    arrayList8.add(C2409ot.b.B(c0613Ms8, c0613Ms8.h, true));
                }
                hashSet = new HashSet();
                arrayList9 = new ArrayList();
                while (r7.hasNext()) {
                    if (hashSet.add(((C1387eR) obj8).a)) {
                        arrayList9.add(obj8);
                    }
                }
                arrayListV = arrayList9;
            }
            if (arrayListV.isEmpty()) {
                str3 = c0821Us.c;
                if (str3 == null) {
                    str3 = "Deportes";
                }
                C0882Xb c0882Xb6 = new C0882Xb(str3, arrayListV);
                StringBuilder sb2 = new StringBuilder("fana-playlist|");
                String str11 = c0821Us.a;
                sb2.append(str11);
                sb2.append("|");
                sb2.append(str3);
                c0882Xb6.f = sb2.toString();
                c0882Xb6.g = AbstractC1701hf0.t("fana-home-", str11);
                c3421zK.add(c0882Xb6);
            }
        }
        c3421zKH = AbstractC2506pt.h(c3421zK);
        if (c3421zKH.isEmpty()) {
            return c3421zKH;
        }
        throw new IOException("No se encontraron categorías con contenido");
    }
}
