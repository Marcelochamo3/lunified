package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Ro0 extends Ph0 implements InterfaceC0775Sy {
    public List m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Wo0 f496o;
    public final /* synthetic */ Ma0 p;
    public final /* synthetic */ C2109lo0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ro0(Wo0 wo0, Ma0 ma0, C2109lo0 c2109lo0, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f496o = wo0;
        this.p = ma0;
        this.q = c2109lo0;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Ro0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Ro0(this.f496o, this.p, this.q, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x001b, B:12:0x0025, B:47:0x00d6, B:48:0x00dc, B:50:0x00e2, B:51:0x00ec, B:53:0x00f2, B:57:0x0105, B:59:0x0109, B:60:0x010d, B:61:0x0111, B:64:0x0119, B:65:0x0124, B:13:0x002a, B:40:0x009c, B:41:0x00b4, B:43:0x00ba, B:44:0x00c6, B:14:0x002f, B:23:0x0053, B:25:0x0061, B:37:0x0090, B:26:0x0064, B:27:0x006f, B:29:0x0075, B:33:0x0088, B:35:0x008c, B:20:0x0047), top: B:72:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0064 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x001b, B:12:0x0025, B:47:0x00d6, B:48:0x00dc, B:50:0x00e2, B:51:0x00ec, B:53:0x00f2, B:57:0x0105, B:59:0x0109, B:60:0x010d, B:61:0x0111, B:64:0x0119, B:65:0x0124, B:13:0x002a, B:40:0x009c, B:41:0x00b4, B:43:0x00ba, B:44:0x00c6, B:14:0x002f, B:23:0x0053, B:25:0x0061, B:37:0x0090, B:26:0x0064, B:27:0x006f, B:29:0x0075, B:33:0x0088, B:35:0x008c, B:20:0x0047), top: B:72:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0075 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x001b, B:12:0x0025, B:47:0x00d6, B:48:0x00dc, B:50:0x00e2, B:51:0x00ec, B:53:0x00f2, B:57:0x0105, B:59:0x0109, B:60:0x010d, B:61:0x0111, B:64:0x0119, B:65:0x0124, B:13:0x002a, B:40:0x009c, B:41:0x00b4, B:43:0x00ba, B:44:0x00c6, B:14:0x002f, B:23:0x0053, B:25:0x0061, B:37:0x0090, B:26:0x0064, B:27:0x006f, B:29:0x0075, B:33:0x0088, B:35:0x008c, B:20:0x0047), top: B:72:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008c A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x001b, B:12:0x0025, B:47:0x00d6, B:48:0x00dc, B:50:0x00e2, B:51:0x00ec, B:53:0x00f2, B:57:0x0105, B:59:0x0109, B:60:0x010d, B:61:0x0111, B:64:0x0119, B:65:0x0124, B:13:0x002a, B:40:0x009c, B:41:0x00b4, B:43:0x00ba, B:44:0x00c6, B:14:0x002f, B:23:0x0053, B:25:0x0061, B:37:0x0090, B:26:0x0064, B:27:0x006f, B:29:0x0075, B:33:0x0088, B:35:0x008c, B:20:0x0047), top: B:72:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    /* JADX WARN: Code duplicated, block: B:39:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ba A[Catch: Exception -> 0x0020, LOOP:3: B:41:0x00b4->B:43:0x00ba, LOOP_END, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x001b, B:12:0x0025, B:47:0x00d6, B:48:0x00dc, B:50:0x00e2, B:51:0x00ec, B:53:0x00f2, B:57:0x0105, B:59:0x0109, B:60:0x010d, B:61:0x0111, B:64:0x0119, B:65:0x0124, B:13:0x002a, B:40:0x009c, B:41:0x00b4, B:43:0x00ba, B:44:0x00c6, B:14:0x002f, B:23:0x0053, B:25:0x0061, B:37:0x0090, B:26:0x0064, B:27:0x006f, B:29:0x0075, B:33:0x0088, B:35:0x008c, B:20:0x0047), top: B:72:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x001b, B:12:0x0025, B:47:0x00d6, B:48:0x00dc, B:50:0x00e2, B:51:0x00ec, B:53:0x00f2, B:57:0x0105, B:59:0x0109, B:60:0x010d, B:61:0x0111, B:64:0x0119, B:65:0x0124, B:13:0x002a, B:40:0x009c, B:41:0x00b4, B:43:0x00ba, B:44:0x00c6, B:14:0x002f, B:23:0x0053, B:25:0x0061, B:37:0x0090, B:26:0x0064, B:27:0x006f, B:29:0x0075, B:33:0x0088, B:35:0x008c, B:20:0x0047), top: B:72:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f2 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x001b, B:12:0x0025, B:47:0x00d6, B:48:0x00dc, B:50:0x00e2, B:51:0x00ec, B:53:0x00f2, B:57:0x0105, B:59:0x0109, B:60:0x010d, B:61:0x0111, B:64:0x0119, B:65:0x0124, B:13:0x002a, B:40:0x009c, B:41:0x00b4, B:43:0x00ba, B:44:0x00c6, B:14:0x002f, B:23:0x0053, B:25:0x0061, B:37:0x0090, B:26:0x0064, B:27:0x006f, B:29:0x0075, B:33:0x0088, B:35:0x008c, B:20:0x0047), top: B:72:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0119 A[Catch: Exception -> 0x0020, LOOP:2: B:61:0x0111->B:64:0x0119, LOOP_END, TRY_ENTER, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x001b, B:12:0x0025, B:47:0x00d6, B:48:0x00dc, B:50:0x00e2, B:51:0x00ec, B:53:0x00f2, B:57:0x0105, B:59:0x0109, B:60:0x010d, B:61:0x0111, B:64:0x0119, B:65:0x0124, B:13:0x002a, B:40:0x009c, B:41:0x00b4, B:43:0x00ba, B:44:0x00c6, B:14:0x002f, B:23:0x0053, B:25:0x0061, B:37:0x0090, B:26:0x0064, B:27:0x006f, B:29:0x0075, B:33:0x0088, B:35:0x008c, B:20:0x0047), top: B:72:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:67:0x013e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x0151 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:74:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0087 A[SYNTHETIC] */
    @Override // o.R7
    public final Object r(Object obj) {
        O9 o9;
        String strB;
        Iterator it;
        Object next;
        Q30 q30;
        Q30 q31;
        List list;
        ArrayList arrayList;
        Iterator it2;
        Iterator it3;
        boolean zHasNext;
        C2109lo0 c2109lo0;
        Iterator it4;
        Object next2;
        C0456Gq c0456Gq;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        C2985uq0 c2985uq0 = C2985uq0.a;
        Ma0 ma0 = this.p;
        Wo0 wo0 = this.f496o;
        try {
            switch (i) {
                case 0:
                    Jp0.O(obj);
                    C2771sg0 c2771sg0 = wo0.e;
                    Lo0 lo0 = Lo0.m;
                    this.n = 1;
                    c2771sg0.l(lo0, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    o9 = O9.x;
                    this.n = 2;
                    if (o9.D(this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    strB = Cr0.m.b();
                    if (AbstractC1474fG.b(strB, "PPV.TO")) {
                        q31 = QW.b;
                    } else {
                        Q30.a.getClass();
                        it = P30.b.iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                next = null;
                            }
                            q30 = (Q30) next;
                            if (q30 == null) {
                                q31 = C1816io0.b;
                            } else {
                                q31 = q30;
                            }
                        } while (!AbstractC1474fG.b(((Q30) next).getName(), strB));
                        q30 = (Q30) next;
                        if (q30 == null) {
                            q31 = C1816io0.b;
                        } else {
                            q31 = q30;
                        }
                    }
                    String str = ma0.a;
                    this.n = 3;
                    obj = q31.c(str, null, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    list = (List) obj;
                    C0560Kq c0560KqO = wo0.b.o();
                    arrayList = new ArrayList(AbstractC1016af.O(list, 10));
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((C0456Gq) it2.next()).a);
                    }
                    C2538q90 c2538q90G = c0560KqO.g(arrayList);
                    this.m = list;
                    this.n = 4;
                    obj = Nr0.l(c2538q90G, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    for (C0456Gq c0456Gq2 : (Iterable) obj) {
                        it4 = list.iterator();
                        do {
                            if (it4.hasNext()) {
                                next2 = it4.next();
                            } else {
                                next2 = null;
                            }
                            c0456Gq = (C0456Gq) next2;
                            if (c0456Gq != null) {
                                c0456Gq.g(c0456Gq2);
                            }
                        } while (!AbstractC1474fG.b(((C0456Gq) next2).a, c0456Gq2.a));
                        c0456Gq = (C0456Gq) next2;
                        if (c0456Gq != null) {
                            c0456Gq.g(c0456Gq2);
                        }
                    }
                    it3 = list.iterator();
                    while (true) {
                        zHasNext = it3.hasNext();
                        c2109lo0 = this.q;
                        if (!zHasNext) {
                            wo0.b.o().l(list);
                            C2771sg0 c2771sg1 = wo0.e;
                            Mo0 mo0 = new Mo0(c2109lo0, ma0, list);
                            this.m = null;
                            this.n = 5;
                            c2771sg1.l(mo0, this);
                            if (c2985uq0 == enumC1706hi) {
                                return enumC1706hi;
                            }
                            return c2985uq0;
                        }
                        C0456Gq c0456Gq3 = (C0456Gq) it3.next();
                        c0456Gq3.e = c2109lo0;
                        c0456Gq3.f = ma0;
                    }
                    break;
                case 1:
                    Jp0.O(obj);
                    o9 = O9.x;
                    this.n = 2;
                    if (o9.D(this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    strB = Cr0.m.b();
                    if (AbstractC1474fG.b(strB, "PPV.TO")) {
                        q31 = QW.b;
                    } else {
                        Q30.a.getClass();
                        it = P30.b.iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                next = null;
                            }
                            q30 = (Q30) next;
                            if (q30 == null) {
                                q31 = C1816io0.b;
                            } else {
                                q31 = q30;
                            }
                        } while (!AbstractC1474fG.b(((Q30) next).getName(), strB));
                        q30 = (Q30) next;
                        if (q30 == null) {
                            q31 = C1816io0.b;
                        } else {
                            q31 = q30;
                        }
                    }
                    String str2 = ma0.a;
                    this.n = 3;
                    obj = q31.c(str2, null, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    list = (List) obj;
                    C0560Kq c0560KqO2 = wo0.b.o();
                    arrayList = new ArrayList(AbstractC1016af.O(list, 10));
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((C0456Gq) it2.next()).a);
                    }
                    C2538q90 c2538q90G2 = c0560KqO2.g(arrayList);
                    this.m = list;
                    this.n = 4;
                    obj = Nr0.l(c2538q90G2, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    while (r12.hasNext()) {
                        it4 = list.iterator();
                        do {
                            if (it4.hasNext()) {
                                next2 = it4.next();
                            } else {
                                next2 = null;
                            }
                            c0456Gq = (C0456Gq) next2;
                            if (c0456Gq != null) {
                                c0456Gq.g(c0456Gq2);
                            }
                        } while (!AbstractC1474fG.b(((C0456Gq) next2).a, c0456Gq2.a));
                        c0456Gq = (C0456Gq) next2;
                        if (c0456Gq != null) {
                            c0456Gq.g(c0456Gq2);
                        }
                    }
                    it3 = list.iterator();
                    while (true) {
                        zHasNext = it3.hasNext();
                        c2109lo0 = this.q;
                        if (!zHasNext) {
                            wo0.b.o().l(list);
                            C2771sg0 c2771sg2 = wo0.e;
                            Mo0 mo1 = new Mo0(c2109lo0, ma0, list);
                            this.m = null;
                            this.n = 5;
                            c2771sg2.l(mo1, this);
                            if (c2985uq0 == enumC1706hi) {
                                return enumC1706hi;
                            }
                            return c2985uq0;
                        }
                        C0456Gq c0456Gq4 = (C0456Gq) it3.next();
                        c0456Gq4.e = c2109lo0;
                        c0456Gq4.f = ma0;
                    }
                    break;
                case 2:
                    Jp0.O(obj);
                    strB = Cr0.m.b();
                    if (AbstractC1474fG.b(strB, "PPV.TO")) {
                        q31 = QW.b;
                    } else {
                        Q30.a.getClass();
                        it = P30.b.iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                next = null;
                            }
                            q30 = (Q30) next;
                            if (q30 == null) {
                                q31 = C1816io0.b;
                            } else {
                                q31 = q30;
                            }
                        } while (!AbstractC1474fG.b(((Q30) next).getName(), strB));
                        q30 = (Q30) next;
                        if (q30 == null) {
                            q31 = C1816io0.b;
                        } else {
                            q31 = q30;
                        }
                    }
                    String str3 = ma0.a;
                    this.n = 3;
                    obj = q31.c(str3, null, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    list = (List) obj;
                    C0560Kq c0560KqO3 = wo0.b.o();
                    arrayList = new ArrayList(AbstractC1016af.O(list, 10));
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((C0456Gq) it2.next()).a);
                    }
                    C2538q90 c2538q90G3 = c0560KqO3.g(arrayList);
                    this.m = list;
                    this.n = 4;
                    obj = Nr0.l(c2538q90G3, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    while (r12.hasNext()) {
                        it4 = list.iterator();
                        do {
                            if (it4.hasNext()) {
                                next2 = it4.next();
                            } else {
                                next2 = null;
                            }
                            c0456Gq = (C0456Gq) next2;
                            if (c0456Gq != null) {
                                c0456Gq.g(c0456Gq2);
                            }
                        } while (!AbstractC1474fG.b(((C0456Gq) next2).a, c0456Gq2.a));
                        c0456Gq = (C0456Gq) next2;
                        if (c0456Gq != null) {
                            c0456Gq.g(c0456Gq2);
                        }
                    }
                    it3 = list.iterator();
                    while (true) {
                        zHasNext = it3.hasNext();
                        c2109lo0 = this.q;
                        if (!zHasNext) {
                            wo0.b.o().l(list);
                            C2771sg0 c2771sg3 = wo0.e;
                            Mo0 mo2 = new Mo0(c2109lo0, ma0, list);
                            this.m = null;
                            this.n = 5;
                            c2771sg3.l(mo2, this);
                            if (c2985uq0 == enumC1706hi) {
                                return enumC1706hi;
                            }
                            return c2985uq0;
                        }
                        C0456Gq c0456Gq5 = (C0456Gq) it3.next();
                        c0456Gq5.e = c2109lo0;
                        c0456Gq5.f = ma0;
                    }
                    break;
                case 3:
                    Jp0.O(obj);
                    list = (List) obj;
                    C0560Kq c0560KqO4 = wo0.b.o();
                    arrayList = new ArrayList(AbstractC1016af.O(list, 10));
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((C0456Gq) it2.next()).a);
                    }
                    C2538q90 c2538q90G4 = c0560KqO4.g(arrayList);
                    this.m = list;
                    this.n = 4;
                    obj = Nr0.l(c2538q90G4, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    while (r12.hasNext()) {
                        it4 = list.iterator();
                        do {
                            if (it4.hasNext()) {
                                next2 = it4.next();
                            } else {
                                next2 = null;
                            }
                            c0456Gq = (C0456Gq) next2;
                            if (c0456Gq != null) {
                                c0456Gq.g(c0456Gq2);
                            }
                        } while (!AbstractC1474fG.b(((C0456Gq) next2).a, c0456Gq2.a));
                        c0456Gq = (C0456Gq) next2;
                        if (c0456Gq != null) {
                            c0456Gq.g(c0456Gq2);
                        }
                    }
                    it3 = list.iterator();
                    while (true) {
                        zHasNext = it3.hasNext();
                        c2109lo0 = this.q;
                        if (!zHasNext) {
                            wo0.b.o().l(list);
                            C2771sg0 c2771sg4 = wo0.e;
                            Mo0 mo3 = new Mo0(c2109lo0, ma0, list);
                            this.m = null;
                            this.n = 5;
                            c2771sg4.l(mo3, this);
                            if (c2985uq0 == enumC1706hi) {
                                return enumC1706hi;
                            }
                            return c2985uq0;
                        }
                        C0456Gq c0456Gq6 = (C0456Gq) it3.next();
                        c0456Gq6.e = c2109lo0;
                        c0456Gq6.f = ma0;
                    }
                    break;
                case 4:
                    list = this.m;
                    Jp0.O(obj);
                    while (r12.hasNext()) {
                        it4 = list.iterator();
                        do {
                            if (it4.hasNext()) {
                                next2 = it4.next();
                            } else {
                                next2 = null;
                            }
                            c0456Gq = (C0456Gq) next2;
                            if (c0456Gq != null) {
                                c0456Gq.g(c0456Gq2);
                            }
                        } while (!AbstractC1474fG.b(((C0456Gq) next2).a, c0456Gq2.a));
                        c0456Gq = (C0456Gq) next2;
                        if (c0456Gq != null) {
                            c0456Gq.g(c0456Gq2);
                        }
                    }
                    it3 = list.iterator();
                    while (true) {
                        zHasNext = it3.hasNext();
                        c2109lo0 = this.q;
                        if (!zHasNext) {
                            wo0.b.o().l(list);
                            C2771sg0 c2771sg5 = wo0.e;
                            Mo0 mo4 = new Mo0(c2109lo0, ma0, list);
                            this.m = null;
                            this.n = 5;
                            c2771sg5.l(mo4, this);
                            if (c2985uq0 == enumC1706hi) {
                                return enumC1706hi;
                            }
                            return c2985uq0;
                        }
                        C0456Gq c0456Gq7 = (C0456Gq) it3.next();
                        c0456Gq7.e = c2109lo0;
                        c0456Gq7.f = ma0;
                    }
                    break;
                case 5:
                    Jp0.O(obj);
                    return c2985uq0;
                case 6:
                    Jp0.O(obj);
                    return c2985uq0;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Exception e) {
            C2771sg0 c2771sg6 = wo0.e;
            Ko0 ko0 = new Ko0(e);
            this.m = null;
            this.n = 6;
            c2771sg6.l(ko0, this);
            if (c2985uq0 == enumC1706hi) {
                return enumC1706hi;
            }
        }
    }
}
