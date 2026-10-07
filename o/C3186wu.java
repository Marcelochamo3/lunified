package o;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.wu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3186wu extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ C3380yu m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3186wu(C3380yu c3380yu, int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = c3380yu;
        this.n = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C3186wu) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C3186wu(this.m, this.n, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:238:0x040b  */
    /* JADX WARN: Code duplicated, block: B:277:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:402:0x04c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0109  */
    /* JADX WARN: Code duplicated, block: B:71:0x018b  */
    @Override // o.R7
    public final Object r(Object obj) {
        Object objK;
        String str;
        Object next;
        String strB;
        Object next2;
        Object next3;
        byte[] bArrJ;
        Object next4;
        Object next5;
        Object next6;
        Object next7;
        Object next8;
        String str2;
        String strB2;
        Object next9;
        String strB3;
        String strH0;
        Iterator it;
        Iterator it2;
        Object next10;
        String strB4;
        Object next11;
        Object next12;
        Object next13;
        Object next14;
        C3186wu c3186wu = this;
        int i = 1;
        int i2 = 0;
        Jp0.O(obj);
        C2701ru c2701ru = C3380yu.e;
        C3380yu c3380yu = c3186wu.m;
        for (String str3 : c3380yu.t()) {
            String strH = c3380yu.h();
            StringBuilder sbS = AbstractC1674hK.s(str3, "/api/common/bs?code=100&sportType=");
            int i3 = c3186wu.n;
            sbS.append(i3);
            sbS.append("&stream=true");
            byte[] bArrJ2 = c3380yu.j(sbS.toString(), strH);
            int i4 = 2;
            if (bArrJ2 == null) {
                str = null;
            } else {
                try {
                    Iterator it3 = new C2605qu(i2, bArrJ2).a().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                        C2411ou c2411ou = (C2411ou) next;
                        if (c2411ou.a == 10 && c2411ou.b == 2) {
                            break;
                        }
                    }
                    C2411ou c2411ou2 = (C2411ou) next;
                    if (c2411ou2 != null) {
                        ArrayList arrayListA = new C2605qu(i2, c2411ou2.a()).a();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : arrayListA) {
                            C2411ou c2411ou3 = (C2411ou) obj2;
                            if (c2411ou3.a == i && c2411ou3.b == 2) {
                                arrayList.add(obj2);
                            }
                        }
                        Iterator it4 = arrayList.iterator();
                        do {
                            if (!it4.hasNext()) {
                                strB = null;
                                break;
                            }
                            ArrayList arrayListA2 = new C2605qu(i2, ((C2411ou) it4.next()).a()).a();
                            Iterator it5 = arrayListA2.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it5.next();
                                C2411ou c2411ou4 = (C2411ou) next2;
                                if (c2411ou4.a == i && c2411ou4.b == 0) {
                                    break;
                                }
                            }
                            C2411ou c2411ou5 = (C2411ou) next2;
                            if (c2411ou5 == null || c2411ou5.c != 100) {
                                strB = null;
                            } else {
                                Iterator it6 = arrayListA2.iterator();
                                while (true) {
                                    if (!it6.hasNext()) {
                                        next3 = null;
                                        break;
                                    }
                                    next3 = it6.next();
                                    C2411ou c2411ou6 = (C2411ou) next3;
                                    if (c2411ou6.a == 2 && c2411ou6.b == 2) {
                                        break;
                                    }
                                }
                                C2411ou c2411ou7 = (C2411ou) next3;
                                if (c2411ou7 != null) {
                                    strB = c2411ou7.b();
                                } else {
                                    strB = null;
                                }
                            }
                        } while (strB == null);
                        if (strB != null) {
                            Pattern patternCompile = Pattern.compile("[a-zA-Z0-9_-]+");
                            AbstractC1474fG.i(patternCompile, "compile(...)");
                            if (!patternCompile.matcher(strB).matches()) {
                                strB = null;
                            }
                            if (strB != null) {
                                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                                byte[] bytes = ("{\"sportType\":" + i3 + ",\"language\":4}").getBytes(AbstractC1305dd.a);
                                AbstractC1474fG.i(bytes, "getBytes(...)");
                                byte[] bArrDigest = messageDigest.digest(bytes);
                                AbstractC1474fG.i(bArrDigest, "digest(...)");
                                objK = str3 + "/sfver" + AbstractC1119bh0.D0(6, X5.R(bArrDigest, E1.y)) + strB + "/api/match/live?sportType=" + i3 + "&language=4";
                            } else {
                                objK = null;
                            }
                        } else {
                            objK = null;
                        }
                    } else {
                        objK = null;
                    }
                } catch (Throwable th) {
                    objK = Jp0.k(th);
                }
                if (C2536q80.a(objK) != null) {
                    objK = null;
                }
                str = (String) objK;
            }
            if (str != null && (bArrJ = c3380yu.j(str, strH)) != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it7 = new C2605qu(i2, bArrJ).a().iterator();
                do {
                    if (!it7.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it7.next();
                } while (((C2411ou) next4).a != 10);
                C2411ou c2411ou8 = (C2411ou) next4;
                if (c2411ou8 != null) {
                    byte[] bArrA = c2411ou8.a();
                    C2701ru c2701ruR = c3380yu.r();
                    Integer num = c2701ruR.c;
                    int iIntValue = num != null ? num.intValue() : 4;
                    Long l = c2701ruR.d;
                    long jLongValue = l != null ? l.longValue() : 10000L;
                    ArrayList arrayListA3 = new C2605qu(i2, bArrA).a();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : arrayListA3) {
                        if (((C2411ou) obj3).a == i) {
                            arrayList3.add(obj3);
                        }
                    }
                    Iterator it8 = arrayList3.iterator();
                    while (it8.hasNext()) {
                        ArrayList arrayListA4 = new C2605qu(i2, ((C2411ou) it8.next()).a()).a();
                        Iterator it9 = arrayListA4.iterator();
                        do {
                            if (!it9.hasNext()) {
                                next5 = null;
                                break;
                            }
                            next5 = it9.next();
                        } while (((C2411ou) next5).a != iIntValue);
                        C2411ou c2411ou9 = (C2411ou) next5;
                        long j = c2411ou9 != null ? c2411ou9.c : 0L;
                        if (j < jLongValue) {
                            boolean z = j > 0;
                            Iterator it10 = arrayListA4.iterator();
                            do {
                                if (!it10.hasNext()) {
                                    next6 = null;
                                    break;
                                }
                                next6 = it10.next();
                            } while (((C2411ou) next6).a != 3);
                            C2411ou c2411ou10 = (C2411ou) next6;
                            Long lValueOf = c2411ou10 != null ? Long.valueOf(c2411ou10.c) : null;
                            Iterator it11 = arrayListA4.iterator();
                            do {
                                if (!it11.hasNext()) {
                                    next7 = null;
                                    break;
                                }
                                next7 = it11.next();
                            } while (((C2411ou) next7).a != i);
                            C2411ou c2411ou11 = (C2411ou) next7;
                            if (c2411ou11 != null) {
                                Iterator it12 = arrayListA4.iterator();
                                do {
                                    if (!it12.hasNext()) {
                                        next8 = null;
                                        break;
                                    }
                                    next8 = it12.next();
                                } while (((C2411ou) next8).a != i4);
                                C2411ou c2411ou12 = (C2411ou) next8;
                                if (c2411ou12 != null) {
                                    int i5 = (int) c2411ou12.c;
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj4 : arrayListA4) {
                                        if (((C2411ou) obj4).a == 30) {
                                            arrayList4.add(obj4);
                                        }
                                    }
                                    Iterator it13 = arrayList4.iterator();
                                    while (true) {
                                        if (!it13.hasNext()) {
                                            str2 = null;
                                            break;
                                        }
                                        Iterator it14 = new C2605qu(0, ((C2411ou) it13.next()).a()).a().iterator();
                                        while (true) {
                                            if (!it14.hasNext()) {
                                                next14 = null;
                                                break;
                                            }
                                            next14 = it14.next();
                                            C2411ou c2411ou13 = (C2411ou) next14;
                                            if (c2411ou13.a == 2 && c2411ou13.b == 2) {
                                                break;
                                            }
                                        }
                                        C2411ou c2411ou14 = (C2411ou) next14;
                                        String strB5 = c2411ou14 != null ? c2411ou14.b() : null;
                                        if (strB5 != null) {
                                            str2 = strB5;
                                            break;
                                        }
                                    }
                                    if (str2 == null) {
                                        i = 1;
                                        i2 = 0;
                                    } else {
                                        ArrayList arrayList5 = new ArrayList();
                                        for (Object obj5 : arrayListA4) {
                                            int i6 = ((C2411ou) obj5).a;
                                            if (150 <= i6 && i6 < 211) {
                                                arrayList5.add(obj5);
                                            }
                                        }
                                        Iterator it15 = arrayList5.iterator();
                                        do {
                                            if (!it15.hasNext()) {
                                                strB2 = null;
                                                break;
                                            }
                                            Iterator it16 = new C2605qu(0, ((C2411ou) it15.next()).a()).a().iterator();
                                            while (true) {
                                                if (!it16.hasNext()) {
                                                    next13 = null;
                                                    break;
                                                }
                                                next13 = it16.next();
                                                C2411ou c2411ou15 = (C2411ou) next13;
                                                if (c2411ou15.a == 21 && c2411ou15.b == 2) {
                                                    break;
                                                }
                                            }
                                            C2411ou c2411ou16 = (C2411ou) next13;
                                            strB2 = c2411ou16 != null ? c2411ou16.b() : null;
                                        } while (strB2 == null);
                                        String str4 = strB2 == null ? "" : strB2;
                                        Iterator it17 = arrayListA4.iterator();
                                        do {
                                            if (!it17.hasNext()) {
                                                next9 = null;
                                                break;
                                            }
                                            next9 = it17.next();
                                        } while (((C2411ou) next9).a != 10);
                                        C2411ou c2411ou17 = (C2411ou) next9;
                                        if (c2411ou17 != null) {
                                            Iterator it18 = new C2605qu(0, c2411ou17.a()).a().iterator();
                                            while (true) {
                                                if (!it18.hasNext()) {
                                                    next12 = null;
                                                    break;
                                                }
                                                next12 = it18.next();
                                                C2411ou c2411ou18 = (C2411ou) next12;
                                                if (c2411ou18.a == 4 && c2411ou18.b == 2) {
                                                    break;
                                                }
                                            }
                                            C2411ou c2411ou19 = (C2411ou) next12;
                                            if (c2411ou19 != null) {
                                                strB3 = c2411ou19.b();
                                            } else {
                                                strB3 = null;
                                            }
                                        } else {
                                            strB3 = null;
                                        }
                                        ArrayList arrayList6 = new ArrayList();
                                        for (Object obj6 : arrayListA4) {
                                            if (((C2411ou) obj6).a == 30) {
                                                arrayList6.add(obj6);
                                            }
                                        }
                                        ArrayList arrayList7 = new ArrayList();
                                        Iterator it19 = arrayList6.iterator();
                                        while (it19.hasNext()) {
                                            Iterator it20 = new C2605qu(0, ((C2411ou) it19.next()).a()).a().iterator();
                                            while (true) {
                                                if (!it20.hasNext()) {
                                                    it = it8;
                                                    it2 = it19;
                                                    next10 = null;
                                                    break;
                                                }
                                                next10 = it20.next();
                                                C2411ou c2411ou20 = (C2411ou) next10;
                                                it = it8;
                                                it2 = it19;
                                                if (c2411ou20.a == 10 && c2411ou20.b == 2) {
                                                    break;
                                                }
                                                it19 = it2;
                                                it8 = it;
                                            }
                                            C2411ou c2411ou21 = (C2411ou) next10;
                                            if (c2411ou21 != null) {
                                                Iterator it21 = new C2605qu(0, c2411ou21.a()).a().iterator();
                                                while (true) {
                                                    if (!it21.hasNext()) {
                                                        next11 = null;
                                                        break;
                                                    }
                                                    next11 = it21.next();
                                                    C2411ou c2411ou22 = (C2411ou) next11;
                                                    if (c2411ou22.a == 4 && c2411ou22.b == 2) {
                                                        break;
                                                    }
                                                }
                                                C2411ou c2411ou23 = (C2411ou) next11;
                                                strB4 = c2411ou23 != null ? c2411ou23.b() : null;
                                                if (strB4 != null) {
                                                    arrayList7.add(strB4);
                                                }
                                                it19 = it2;
                                                it8 = it;
                                            }
                                            if (strB4 != null) {
                                                arrayList7.add(strB4);
                                            }
                                            it19 = it2;
                                            it8 = it;
                                        }
                                        Iterator it22 = it8;
                                        String strM = C3380yu.m((String) AbstractC0911Ye.e0(0, arrayList7));
                                        String strM2 = C3380yu.m((String) AbstractC0911Ye.e0(1, arrayList7));
                                        String strM3 = strM == null ? strM2 == null ? C3380yu.m(strB3) : strM2 : strM;
                                        C3380yu c3380yu2 = c3380yu;
                                        String strValueOf = String.valueOf(c2411ou11.c);
                                        if (AbstractC1899jh0.O(str4) || AbstractC1474fG.b(str4, "def")) {
                                            strH0 = (String) C3380yu.l.get(Integer.valueOf(i5));
                                            if (strH0 == null) {
                                                strH0 = "Otros";
                                            }
                                        } else {
                                            List listT0 = AbstractC1119bh0.t0(AbstractC1119bh0.E0(AbstractC1899jh0.R(AbstractC1899jh0.R(str4, "--", " ", false), "-", " ", false)).toString(), new String[]{" "}, 0, 6);
                                            ArrayList arrayList8 = new ArrayList();
                                            for (Object obj7 : listT0) {
                                                if (!AbstractC1899jh0.O((String) obj7)) {
                                                    arrayList8.add(obj7);
                                                }
                                            }
                                            strH0 = AbstractC0911Ye.h0(arrayList8, " ", null, null, E1.B, 30);
                                        }
                                        arrayList2.add(new C2508pu(strValueOf, i5, str2, str4, strH0, strM3, strM, strM2, lValueOf, z));
                                        c3380yu = c3380yu2;
                                        it8 = it22;
                                        i = 1;
                                        i2 = 0;
                                    }
                                    i4 = 2;
                                }
                            }
                        }
                        i = 1;
                    }
                }
                C3380yu c3380yu3 = c3380yu;
                if (!arrayList2.isEmpty()) {
                    arrayList2.size();
                    if (!arrayList2.isEmpty()) {
                        Iterator it23 = arrayList2.iterator();
                        int i7 = 0;
                        while (it23.hasNext()) {
                            if (((C2508pu) it23.next()).j && (i7 = i7 + 1) < 0) {
                                throw new ArithmeticException("Count overflow has happened.");
                            }
                        }
                    }
                    return arrayList2;
                }
                c3186wu = this;
                c3380yu = c3380yu3;
                i = 1;
                i2 = 0;
            }
        }
        return C1233cq.l;
    }
}
