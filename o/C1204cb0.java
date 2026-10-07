package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.cb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1204cb0 extends Ph0 implements InterfaceC0775Sy {
    public List m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1302db0 f718o;
    public final /* synthetic */ String p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1204cb0(C1302db0 c1302db0, String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f718o = c1302db0;
        this.p = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1204cb0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1204cb0(this.f718o, this.p, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x005f A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:7:0x0019, B:12:0x0023, B:47:0x00d4, B:48:0x00da, B:50:0x00e0, B:51:0x00ea, B:53:0x00f0, B:57:0x0103, B:59:0x0107, B:60:0x010b, B:61:0x010f, B:63:0x0115, B:64:0x0124, B:13:0x0028, B:40:0x009a, B:41:0x00b2, B:43:0x00b8, B:44:0x00c4, B:14:0x002d, B:23:0x0051, B:25:0x005f, B:37:0x008e, B:26:0x0062, B:27:0x006d, B:29:0x0073, B:33:0x0086, B:35:0x008a, B:20:0x0045), top: B:71:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:7:0x0019, B:12:0x0023, B:47:0x00d4, B:48:0x00da, B:50:0x00e0, B:51:0x00ea, B:53:0x00f0, B:57:0x0103, B:59:0x0107, B:60:0x010b, B:61:0x010f, B:63:0x0115, B:64:0x0124, B:13:0x0028, B:40:0x009a, B:41:0x00b2, B:43:0x00b8, B:44:0x00c4, B:14:0x002d, B:23:0x0051, B:25:0x005f, B:37:0x008e, B:26:0x0062, B:27:0x006d, B:29:0x0073, B:33:0x0086, B:35:0x008a, B:20:0x0045), top: B:71:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0073 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:7:0x0019, B:12:0x0023, B:47:0x00d4, B:48:0x00da, B:50:0x00e0, B:51:0x00ea, B:53:0x00f0, B:57:0x0103, B:59:0x0107, B:60:0x010b, B:61:0x010f, B:63:0x0115, B:64:0x0124, B:13:0x0028, B:40:0x009a, B:41:0x00b2, B:43:0x00b8, B:44:0x00c4, B:14:0x002d, B:23:0x0051, B:25:0x005f, B:37:0x008e, B:26:0x0062, B:27:0x006d, B:29:0x0073, B:33:0x0086, B:35:0x008a, B:20:0x0045), top: B:71:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008a A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:7:0x0019, B:12:0x0023, B:47:0x00d4, B:48:0x00da, B:50:0x00e0, B:51:0x00ea, B:53:0x00f0, B:57:0x0103, B:59:0x0107, B:60:0x010b, B:61:0x010f, B:63:0x0115, B:64:0x0124, B:13:0x0028, B:40:0x009a, B:41:0x00b2, B:43:0x00b8, B:44:0x00c4, B:14:0x002d, B:23:0x0051, B:25:0x005f, B:37:0x008e, B:26:0x0062, B:27:0x006d, B:29:0x0073, B:33:0x0086, B:35:0x008a, B:20:0x0045), top: B:71:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b8 A[Catch: Exception -> 0x001e, LOOP:3: B:41:0x00b2->B:43:0x00b8, LOOP_END, TryCatch #0 {Exception -> 0x001e, blocks: (B:7:0x0019, B:12:0x0023, B:47:0x00d4, B:48:0x00da, B:50:0x00e0, B:51:0x00ea, B:53:0x00f0, B:57:0x0103, B:59:0x0107, B:60:0x010b, B:61:0x010f, B:63:0x0115, B:64:0x0124, B:13:0x0028, B:40:0x009a, B:41:0x00b2, B:43:0x00b8, B:44:0x00c4, B:14:0x002d, B:23:0x0051, B:25:0x005f, B:37:0x008e, B:26:0x0062, B:27:0x006d, B:29:0x0073, B:33:0x0086, B:35:0x008a, B:20:0x0045), top: B:71:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e0 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:7:0x0019, B:12:0x0023, B:47:0x00d4, B:48:0x00da, B:50:0x00e0, B:51:0x00ea, B:53:0x00f0, B:57:0x0103, B:59:0x0107, B:60:0x010b, B:61:0x010f, B:63:0x0115, B:64:0x0124, B:13:0x0028, B:40:0x009a, B:41:0x00b2, B:43:0x00b8, B:44:0x00c4, B:14:0x002d, B:23:0x0051, B:25:0x005f, B:37:0x008e, B:26:0x0062, B:27:0x006d, B:29:0x0073, B:33:0x0086, B:35:0x008a, B:20:0x0045), top: B:71:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f0 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:7:0x0019, B:12:0x0023, B:47:0x00d4, B:48:0x00da, B:50:0x00e0, B:51:0x00ea, B:53:0x00f0, B:57:0x0103, B:59:0x0107, B:60:0x010b, B:61:0x010f, B:63:0x0115, B:64:0x0124, B:13:0x0028, B:40:0x009a, B:41:0x00b2, B:43:0x00b8, B:44:0x00c4, B:14:0x002d, B:23:0x0051, B:25:0x005f, B:37:0x008e, B:26:0x0062, B:27:0x006d, B:29:0x0073, B:33:0x0086, B:35:0x008a, B:20:0x0045), top: B:71:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0115 A[Catch: Exception -> 0x001e, LOOP:2: B:61:0x010f->B:63:0x0115, LOOP_END, TryCatch #0 {Exception -> 0x001e, blocks: (B:7:0x0019, B:12:0x0023, B:47:0x00d4, B:48:0x00da, B:50:0x00e0, B:51:0x00ea, B:53:0x00f0, B:57:0x0103, B:59:0x0107, B:60:0x010b, B:61:0x010f, B:63:0x0115, B:64:0x0124, B:13:0x0028, B:40:0x009a, B:41:0x00b2, B:43:0x00b8, B:44:0x00c4, B:14:0x002d, B:23:0x0051, B:25:0x005f, B:37:0x008e, B:26:0x0062, B:27:0x006d, B:29:0x0073, B:33:0x0086, B:35:0x008a, B:20:0x0045), top: B:71:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x013e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0151 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0085 A[SYNTHETIC] */
    @Override // o.R7
    public final Object r(Object obj) {
        O9 o9;
        String strB;
        Iterator it;
        Object next;
        Q30 q30;
        Q30 q31;
        List<C0456Gq> list;
        ArrayList arrayList;
        Iterator it2;
        Iterator it3;
        Object next2;
        C0456Gq c0456Gq;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        C2985uq0 c2985uq0 = C2985uq0.a;
        C1302db0 c1302db0 = this.f718o;
        try {
            switch (i) {
                case 0:
                    Jp0.O(obj);
                    C2771sg0 c2771sg0 = c1302db0.e;
                    Za0 za0 = Za0.a;
                    this.n = 1;
                    c2771sg0.l(za0, this);
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
                    String str = this.p;
                    this.n = 3;
                    obj = q31.c(str, null, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    list = (List) obj;
                    C0560Kq c0560KqO = c1302db0.d.o();
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
                        it3 = list.iterator();
                        do {
                            if (it3.hasNext()) {
                                next2 = it3.next();
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
                    for (C0456Gq c0456Gq3 : list) {
                        c0456Gq3.e = c1302db0.b;
                        c0456Gq3.f = c1302db0.c;
                    }
                    c1302db0.d.o().l(list);
                    C2771sg0 c2771sg1 = c1302db0.e;
                    C1009ab0 c1009ab0 = new C1009ab0(list);
                    this.m = null;
                    this.n = 5;
                    c2771sg1.l(c1009ab0, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return c2985uq0;
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
                    String str2 = this.p;
                    this.n = 3;
                    obj = q31.c(str2, null, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    list = (List) obj;
                    C0560Kq c0560KqO2 = c1302db0.d.o();
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
                    while (r11.hasNext()) {
                        it3 = list.iterator();
                        do {
                            if (it3.hasNext()) {
                                next2 = it3.next();
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
                    while (r11.hasNext()) {
                        c0456Gq3.e = c1302db0.b;
                        c0456Gq3.f = c1302db0.c;
                    }
                    c1302db0.d.o().l(list);
                    C2771sg0 c2771sg2 = c1302db0.e;
                    C1009ab0 c1009ab1 = new C1009ab0(list);
                    this.m = null;
                    this.n = 5;
                    c2771sg2.l(c1009ab1, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return c2985uq0;
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
                    String str3 = this.p;
                    this.n = 3;
                    obj = q31.c(str3, null, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    list = (List) obj;
                    C0560Kq c0560KqO3 = c1302db0.d.o();
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
                    while (r11.hasNext()) {
                        it3 = list.iterator();
                        do {
                            if (it3.hasNext()) {
                                next2 = it3.next();
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
                    while (r11.hasNext()) {
                        c0456Gq3.e = c1302db0.b;
                        c0456Gq3.f = c1302db0.c;
                    }
                    c1302db0.d.o().l(list);
                    C2771sg0 c2771sg3 = c1302db0.e;
                    C1009ab0 c1009ab2 = new C1009ab0(list);
                    this.m = null;
                    this.n = 5;
                    c2771sg3.l(c1009ab2, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return c2985uq0;
                case 3:
                    Jp0.O(obj);
                    list = (List) obj;
                    C0560Kq c0560KqO4 = c1302db0.d.o();
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
                    while (r11.hasNext()) {
                        it3 = list.iterator();
                        do {
                            if (it3.hasNext()) {
                                next2 = it3.next();
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
                    while (r11.hasNext()) {
                        c0456Gq3.e = c1302db0.b;
                        c0456Gq3.f = c1302db0.c;
                    }
                    c1302db0.d.o().l(list);
                    C2771sg0 c2771sg4 = c1302db0.e;
                    C1009ab0 c1009ab3 = new C1009ab0(list);
                    this.m = null;
                    this.n = 5;
                    c2771sg4.l(c1009ab3, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return c2985uq0;
                case 4:
                    list = this.m;
                    Jp0.O(obj);
                    while (r11.hasNext()) {
                        it3 = list.iterator();
                        do {
                            if (it3.hasNext()) {
                                next2 = it3.next();
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
                    while (r11.hasNext()) {
                        c0456Gq3.e = c1302db0.b;
                        c0456Gq3.f = c1302db0.c;
                    }
                    c1302db0.d.o().l(list);
                    C2771sg0 c2771sg5 = c1302db0.e;
                    C1009ab0 c1009ab4 = new C1009ab0(list);
                    this.m = null;
                    this.n = 5;
                    c2771sg5.l(c1009ab4, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return c2985uq0;
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
            C2771sg0 c2771sg6 = c1302db0.e;
            Ya0 ya0 = new Ya0(e);
            this.m = null;
            this.n = 6;
            c2771sg6.l(ya0, this);
            if (c2985uq0 == enumC1706hi) {
                return enumC1706hi;
            }
        }
    }
}
