package o;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class Qe0 extends Ph0 implements InterfaceC0775Sy {
    public String m;
    public VS n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f476o;
    public int p;
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qe0(String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.q = str;
        this.r = str2;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Qe0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Qe0(this.q, this.r, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:129:0x00ca A[EDGE_INSN: B:129:0x00ca->B:124:0x00ca BREAK  A[LOOP:4: B:45:0x0113->B:51:0x014c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x014a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x014c A[LOOP:4: B:45:0x0113->B:51:0x014c, LOOP_END] */
    @Override // o.R7
    public final Object r(Object obj) {
        C2446pE c2446pEB;
        C2446pE c2446pEB2;
        Iterable<String> iterableUnmodifiableSet;
        VS vs;
        String str;
        String str2;
        Object objPutIfAbsent;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.p;
        if (i == 0) {
            Jp0.O(obj);
            String str3 = this.q;
            AbstractC1474fG.j(str3, "url");
            try {
                C2349oE c2349oE = new C2349oE();
                c2349oE.g(null, str3);
                c2446pEB = c2349oE.b();
            } catch (IllegalArgumentException unused) {
                c2446pEB = null;
            }
            if (c2446pEB == null) {
                throw new IllegalArgumentException("URL Premium inválida");
            }
            try {
                C2349oE c2349oE2 = new C2349oE();
                c2349oE2.g(null, str3);
                c2446pEB2 = c2349oE2.b();
            } catch (IllegalArgumentException unused2) {
                c2446pEB2 = null;
            }
            if (c2446pEB2 != null) {
                String lowerCase = c2446pEB2.d.toLowerCase(Locale.ROOT);
                AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                if (c2446pEB2.j && (AbstractC1474fG.b(lowerCase, "pelisserieshoy.com") || AbstractC1899jh0.L(lowerCase, ".pelisserieshoy.com", false))) {
                    C2349oE c2349oEF = c2446pEB.f();
                    c2349oEF.h = null;
                    Set setT = Lc0.T("ptok", "token", "sig", "signature", "auth", "expires");
                    List list = c2446pEB.g;
                    if (list == null) {
                        iterableUnmodifiableSet = C1722hq.l;
                    } else {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        XF xfH = U9.H(U9.L(0, list.size()), 2);
                        int i2 = xfH.l;
                        int i3 = xfH.m;
                        int i4 = xfH.n;
                        if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
                            while (true) {
                                Object obj2 = list.get(i2);
                                AbstractC1474fG.g(obj2);
                                linkedHashSet.add(obj2);
                                if (i2 == i3) {
                                    break;
                                }
                                i2 += i4;
                            }
                        }
                        iterableUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
                        AbstractC1474fG.i(iterableUnmodifiableSet, "unmodifiableSet(result)");
                    }
                    for (String str4 : iterableUnmodifiableSet) {
                        String lowerCase2 = str4.toLowerCase(Locale.ROOT);
                        AbstractC1474fG.i(lowerCase2, "toLowerCase(...)");
                        if (setT.contains(lowerCase2) && ((ArrayList) c2349oEF.i) != null) {
                            String strL = C0622Nb.l(str4, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219);
                            ArrayList arrayList = (ArrayList) c2349oEF.i;
                            AbstractC1474fG.g(arrayList);
                            int size = arrayList.size() - 2;
                            int iN = Sr0.n(size, 0, -2);
                            if (iN <= size) {
                                while (true) {
                                    ArrayList arrayList2 = (ArrayList) c2349oEF.i;
                                    AbstractC1474fG.g(arrayList2);
                                    if (AbstractC1474fG.b(strL, arrayList2.get(size))) {
                                        ArrayList arrayList3 = (ArrayList) c2349oEF.i;
                                        AbstractC1474fG.g(arrayList3);
                                        arrayList3.remove(size + 1);
                                        ArrayList arrayList4 = (ArrayList) c2349oEF.i;
                                        AbstractC1474fG.g(arrayList4);
                                        arrayList4.remove(size);
                                        ArrayList arrayList5 = (ArrayList) c2349oEF.i;
                                        AbstractC1474fG.g(arrayList5);
                                        if (arrayList5.isEmpty()) {
                                            c2349oEF.i = null;
                                            break;
                                        }
                                        if (size != iN) {
                                            break;
                                        }
                                        size -= 2;
                                    } else {
                                        if (size != iN) {
                                            break;
                                            break;
                                        }
                                        size -= 2;
                                    }
                                }
                            }
                        }
                    }
                    C2446pE c2446pEB3 = c2349oEF.b();
                    ConcurrentHashMap concurrentHashMap = C1603gf0.f;
                    String str5 = c2446pEB3.i;
                    Object objA = concurrentHashMap.get(str5);
                    if (objA == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str5, (objA = AbstractC1923jt0.a()))) != null) {
                        objA = objPutIfAbsent;
                    }
                    VS vs2 = (VS) objA;
                    this.m = str5;
                    this.n = vs2;
                    String str6 = this.r;
                    this.f476o = str6;
                    this.p = 1;
                    if (((YS) vs2).d(null, this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    vs = vs2;
                    str = str5;
                    str2 = str6;
                }
            }
            throw new IllegalArgumentException("Host Premium inválido");
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str2 = this.f476o;
        vs = this.n;
        str = this.m;
        Jp0.O(obj);
        try {
            Me0 me0P = C1603gf0.p(str, str2, false);
            List<Oe0> list2 = me0P.b;
            ArrayList arrayList6 = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                String str7 = ((Oe0) it.next()).b;
                if (str7 != null) {
                    arrayList6.add(str7);
                }
            }
            ArrayList arrayList7 = new ArrayList();
            for (Object obj3 : arrayList6) {
                if (!AbstractC1899jh0.O((String) obj3)) {
                    arrayList7.add(obj3);
                }
            }
            int size2 = AbstractC0911Ye.X(arrayList7).size();
            ArrayList arrayList8 = new ArrayList(AbstractC1016af.O(list2, 10));
            for (Oe0 oe0 : list2) {
                String str8 = oe0.a;
                AbstractC1474fG.j(str, "playerUrl");
                AbstractC1474fG.j(str2, "outerReferer");
                AbstractC1474fG.j(str8, "label");
                StringBuilder sb = new StringBuilder();
                sb.append("sololatino-premium-v1:");
                Nr0.c(sb, str);
                Nr0.c(sb, str2);
                Nr0.c(sb, str8);
                String str9 = oe0.b;
                Nr0.c(sb, str9 == null ? "" : str9);
                String string = sb.toString();
                AbstractC1474fG.i(string, "toString(...)");
                String strK = Nr0.k(oe0.a, str9, size2 > 1);
                C1603gf0 c1603gf0 = C1603gf0.b;
                arrayList8.add(new Ds0(string, strK, null, C1603gf0.w(me0P.a), 52));
            }
            return arrayList8;
        } finally {
            ((YS) vs).e(null);
        }
    }
}
