package o;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.nt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2312nt extends Ph0 implements InterfaceC0775Sy {
    public C0665Os m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f944o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2312nt(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f944o = str;
        this.p = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2312nt) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2312nt(this.f944o, this.p, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0054 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0166 A[LOOP:0: B:45:0x0160->B:47:0x0166, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x0189  */
    /* JADX WARN: Code duplicated, block: B:62:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0183 A[SYNTHETIC] */
    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        C0665Os c0665Os;
        ArrayList arrayList;
        Iterator it;
        HashSet hashSet;
        ArrayList arrayList2;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        if (i == 0) {
            Jp0.O(obj);
            String str = this.f944o;
            boolean zO = AbstractC1899jh0.O(str);
            int i2 = this.p;
            if (!zO) {
                C2349oE c2349oE = new C2349oE();
                c2349oE.g(null, "https://watch.fanatiz.com/api/1.0/search/content");
                C2349oE c2349oEF = c2349oE.b().f();
                if (i2 < 1) {
                    i2 = 1;
                }
                c2349oEF.a("page", String.valueOf(i2));
                C2446pE c2446pEB = c2349oEF.b();
                BA ba = C2409ot.c;
                String lowerCase = AbstractC1119bh0.E0(str).toString().toLowerCase(Locale.ROOT);
                AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                Map mapZ = AbstractC3327yN.z(new C1101bX("term", lowerCase), new C1101bX("appCode", "fanatiz"));
                ba.getClass();
                Class<?> cls = mapZ.getClass();
                StringWriter stringWriter = new StringWriter();
                try {
                    ba.h(mapZ, cls, ba.g(stringWriter));
                    String string = stringWriter.toString();
                    AbstractC1474fG.i(string, "toJson(...)");
                    Pattern pattern = TP.e;
                    C2243n70 c2243n70K = C2743sL.k(string, AbstractC1474fG.o("application/json"));
                    C2409ot c2409ot = C2409ot.b;
                    C0560Kq c0560Kq = new C0560Kq();
                    c0560Kq.m = c2446pEB;
                    c0560Kq.m("POST", c2243n70K);
                    C1951k70 c1951k70C = c0560Kq.c();
                    this.n = 3;
                    obj = AbstractC1376eG.J(AbstractC1910jn.b, new C0485Ht(c1951k70C, "búsqueda", null), this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    List list = O9.A((String) obj).b;
                    arrayList = new ArrayList(AbstractC1016af.O(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C2409ot.C((C0613Ms) it.next(), 6));
                    }
                    hashSet = new HashSet();
                    arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (hashSet.add(((C1387eR) obj2).a)) {
                            arrayList2.add(obj2);
                        }
                    }
                    return arrayList2;
                } catch (IOException e) {
                    throw new RH(e);
                }
            }
            if (i2 > 1) {
                return C1233cq.l;
            }
            C2409ot c2409ot2 = C2409ot.b;
            this.n = 1;
            obj = C2409ot.p(c2409ot2, this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
            c0665Os = (C0665Os) obj;
            C2409ot c2409ot3 = C2409ot.b;
            this.m = c0665Os;
            this.n = 2;
            obj = C2409ot.q(c2409ot3, this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
        } else if (i == 1) {
            Jp0.O(obj);
            c0665Os = (C0665Os) obj;
            C2409ot c2409ot4 = C2409ot.b;
            this.m = c0665Os;
            this.n = 2;
            obj = C2409ot.q(c2409ot4, this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(obj);
                List list2 = O9.A((String) obj).b;
                arrayList = new ArrayList(AbstractC1016af.O(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(C2409ot.C((C0613Ms) it.next(), 6));
                }
                hashSet = new HashSet();
                arrayList2 = new ArrayList();
                while (r0.hasNext()) {
                    if (hashSet.add(((C1387eR) obj2).a)) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            }
            c0665Os = this.m;
            Jp0.O(obj);
        }
        String str2 = (String) obj;
        List list3 = c0665Os.a;
        ArrayList<C0743Rs> arrayList3 = new ArrayList();
        for (Object obj3 : list3) {
            C0743Rs c0743Rs = (C0743Rs) obj3;
            if (str2 == null || !c0743Rs.c.contains(str2)) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList(AbstractC1016af.O(arrayList3, 10));
        for (C0743Rs c0743Rs2 : arrayList3) {
            C2409ot c2409ot5 = C2409ot.b;
            arrayList4.add(new C2420oz(AbstractC1701hf0.t("fana-route|", c0743Rs2.a), c0743Rs2.b));
        }
        return arrayList4;
    }
}
