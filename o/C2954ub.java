package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: o.ub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2954ub extends Ph0 implements InterfaceC0775Sy {
    public String m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1056o;
    public /* synthetic */ Object p;
    public final /* synthetic */ String q;
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2954ub(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.q = str;
        this.r = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2954ub) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C2954ub c2954ub = new C2954ub(this.q, this.r, interfaceC0473Hh);
        c2954ub.p = obj;
        return c2954ub;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0103  */
    /* JADX WARN: Code duplicated, block: B:37:0x010e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0113  */
    /* JADX WARN: Code duplicated, block: B:40:0x0117  */
    /* JADX WARN: Code duplicated, block: B:49:0x0130  */
    /* JADX WARN: Code duplicated, block: B:59:0x0166  */
    /* JADX WARN: Code duplicated, block: B:65:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0160 A[SYNTHETIC] */
    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        Object next;
        String strS;
        InterfaceC1323dm interfaceC1323dmC;
        String str;
        String str2;
        String str3;
        String str4;
        Collection collection;
        ArrayList arrayList;
        HashSet hashSet;
        ArrayList arrayList2;
        Cd0 cd0;
        List<C2420oz> list;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.f1056o;
        if (i != 0) {
            if (i == 1) {
                interfaceC1323dmC = (InterfaceC1323dm) this.n;
                str2 = this.m;
                str = (String) this.p;
                Jp0.O(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                collection = (Collection) this.n;
                str3 = this.m;
                str4 = (String) this.p;
                Jp0.O(obj);
            }
            ArrayList arrayListM0 = AbstractC0911Ye.m0(collection, (Iterable) obj);
            arrayList = new ArrayList();
            for (Object obj2 : arrayListM0) {
                cd0 = (Cd0) obj2;
                if (cd0 instanceof C1387eR) {
                    list = ((C1387eR) cd0).j;
                } else {
                    if (cd0 instanceof C2109lo0) {
                        throw new C0730Rf();
                    }
                    list = ((C2109lo0) cd0).l;
                }
                if ((list instanceof Collection) || !list.isEmpty()) {
                    for (C2420oz c2420oz : list) {
                        if (!AbstractC1899jh0.N(c2420oz.a, str4, true) || AbstractC1899jh0.N(c2420oz.b, str3, true)) {
                            arrayList.add(obj2);
                            break;
                        }
                    }
                }
            }
            C0441Gb c0441Gb = C0441Gb.b;
            hashSet = new HashSet();
            arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (hashSet.add(C0441Gb.I((Cd0) obj3))) {
                    arrayList2.add(obj3);
                }
            }
            return new C2420oz(str4, str3, arrayList2);
        }
        Jp0.O(obj);
        InterfaceC1608gi interfaceC1608gi = (InterfaceC1608gi) this.p;
        String str5 = this.q;
        String strF0 = AbstractC1119bh0.F0(AbstractC1119bh0.w0(str5, '|', str5), '/');
        Iterator it = C0441Gb.l.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC1474fG.b(((C2420oz) next).a, strF0));
        C2420oz c2420oz2 = (C2420oz) next;
        if (c2420oz2 == null || (strS = c2420oz2.b) == null) {
            strS = AbstractC1899jh0.S(strF0, '-', ' ');
            if (strS.length() > 0) {
                StringBuilder sb = new StringBuilder();
                String strValueOf = String.valueOf(strS.charAt(0));
                AbstractC1474fG.h(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                AbstractC1474fG.i(upperCase, "toUpperCase(...)");
                sb.append((Object) upperCase);
                String strSubstring = strS.substring(1);
                AbstractC1474fG.i(strSubstring, "substring(...)");
                sb.append(strSubstring);
                strS = sb.toString();
            }
        }
        int i2 = this.r;
        C1420em c1420emC = AbstractC1376eG.c(interfaceC1608gi, null, 0, new C2760sb(i2, null), 3);
        interfaceC1323dmC = AbstractC1376eG.c(interfaceC1608gi, null, 0, new C2857tb(i2, null), 3);
        this.p = strF0;
        this.m = strS;
        this.n = interfaceC1323dmC;
        this.f1056o = 1;
        obj = c1420emC.y(this);
        if (obj == enumC1706hi) {
            return enumC1706hi;
        }
        String str6 = strS;
        str = strF0;
        str2 = str6;
        Collection collection2 = (Collection) obj;
        this.p = str;
        this.m = str2;
        this.n = collection2;
        this.f1056o = 2;
        Object objK = interfaceC1323dmC.K(this);
        if (objK == enumC1706hi) {
            return enumC1706hi;
        }
        str3 = str2;
        str4 = str;
        collection = collection2;
        obj = objK;
        ArrayList arrayListM1 = AbstractC0911Ye.m0(collection, (Iterable) obj);
        arrayList = new ArrayList();
        while (r13.hasNext()) {
            cd0 = (Cd0) obj2;
            if (cd0 instanceof C1387eR) {
                list = ((C1387eR) cd0).j;
            } else {
                if (cd0 instanceof C2109lo0) {
                    throw new C0730Rf();
                }
                list = ((C2109lo0) cd0).l;
            }
            if (list instanceof Collection) {
            }
            while (r5.hasNext()) {
                if (!AbstractC1899jh0.N(c2420oz.a, str4, true)) {
                }
                arrayList.add(obj2);
                break;
            }
        }
        C0441Gb c0441Gb2 = C0441Gb.b;
        hashSet = new HashSet();
        arrayList2 = new ArrayList();
        while (r0.hasNext()) {
            if (hashSet.add(C0441Gb.I((Cd0) obj3))) {
                arrayList2.add(obj3);
            }
        }
        return new C2420oz(str4, str3, arrayList2);
    }
}
