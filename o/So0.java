package o;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class So0 extends Ph0 implements InterfaceC0775Sy {
    public C2109lo0 m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Wo0 f520o;
    public final /* synthetic */ String p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public So0(Wo0 wo0, String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f520o = wo0;
        this.p = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((So0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new So0(this.f520o, this.p, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x005f A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:7:0x001a, B:12:0x0024, B:43:0x00d1, B:45:0x00d5, B:46:0x00dc, B:48:0x00f5, B:49:0x00f9, B:51:0x00ff, B:52:0x0108, B:54:0x0122, B:58:0x0138, B:59:0x013b, B:13:0x0029, B:40:0x009a, B:14:0x002e, B:23:0x0051, B:25:0x005f, B:37:0x008e, B:26:0x0062, B:27:0x006d, B:29:0x0073, B:33:0x0086, B:35:0x008a, B:20:0x0045, B:53:0x0118), top: B:64:0x000a, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:7:0x001a, B:12:0x0024, B:43:0x00d1, B:45:0x00d5, B:46:0x00dc, B:48:0x00f5, B:49:0x00f9, B:51:0x00ff, B:52:0x0108, B:54:0x0122, B:58:0x0138, B:59:0x013b, B:13:0x0029, B:40:0x009a, B:14:0x002e, B:23:0x0051, B:25:0x005f, B:37:0x008e, B:26:0x0062, B:27:0x006d, B:29:0x0073, B:33:0x0086, B:35:0x008a, B:20:0x0045, B:53:0x0118), top: B:64:0x000a, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0073 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:7:0x001a, B:12:0x0024, B:43:0x00d1, B:45:0x00d5, B:46:0x00dc, B:48:0x00f5, B:49:0x00f9, B:51:0x00ff, B:52:0x0108, B:54:0x0122, B:58:0x0138, B:59:0x013b, B:13:0x0029, B:40:0x009a, B:14:0x002e, B:23:0x0051, B:25:0x005f, B:37:0x008e, B:26:0x0062, B:27:0x006d, B:29:0x0073, B:33:0x0086, B:35:0x008a, B:20:0x0045, B:53:0x0118), top: B:64:0x000a, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008a A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:7:0x001a, B:12:0x0024, B:43:0x00d1, B:45:0x00d5, B:46:0x00dc, B:48:0x00f5, B:49:0x00f9, B:51:0x00ff, B:52:0x0108, B:54:0x0122, B:58:0x0138, B:59:0x013b, B:13:0x0029, B:40:0x009a, B:14:0x002e, B:23:0x0051, B:25:0x005f, B:37:0x008e, B:26:0x0062, B:27:0x006d, B:29:0x0073, B:33:0x0086, B:35:0x008a, B:20:0x0045, B:53:0x0118), top: B:64:0x000a, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:7:0x001a, B:12:0x0024, B:43:0x00d1, B:45:0x00d5, B:46:0x00dc, B:48:0x00f5, B:49:0x00f9, B:51:0x00ff, B:52:0x0108, B:54:0x0122, B:58:0x0138, B:59:0x013b, B:13:0x0029, B:40:0x009a, B:14:0x002e, B:23:0x0051, B:25:0x005f, B:37:0x008e, B:26:0x0062, B:27:0x006d, B:29:0x0073, B:33:0x0086, B:35:0x008a, B:20:0x0045, B:53:0x0118), top: B:64:0x000a, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff A[Catch: Exception -> 0x001f, LOOP:0: B:49:0x00f9->B:51:0x00ff, LOOP_END, TryCatch #0 {Exception -> 0x001f, blocks: (B:7:0x001a, B:12:0x0024, B:43:0x00d1, B:45:0x00d5, B:46:0x00dc, B:48:0x00f5, B:49:0x00f9, B:51:0x00ff, B:52:0x0108, B:54:0x0122, B:58:0x0138, B:59:0x013b, B:13:0x0029, B:40:0x009a, B:14:0x002e, B:23:0x0051, B:25:0x005f, B:37:0x008e, B:26:0x0062, B:27:0x006d, B:29:0x0073, B:33:0x0086, B:35:0x008a, B:20:0x0045, B:53:0x0118), top: B:64:0x000a, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0136 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x014e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x0085 A[SYNTHETIC] */
    @Override // o.R7
    public final Object r(Object obj) {
        O9 o9;
        String strB;
        Iterator it;
        Object next;
        Q30 q30;
        Q30 q31;
        C2109lo0 c2109lo0;
        C2109lo0 c2109lo1;
        C2109lo0 c2109lo0A;
        Iterator it2;
        F80 f80;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        C2985uq0 c2985uq0 = C2985uq0.a;
        Wo0 wo0 = this.f520o;
        try {
            switch (i) {
                case 0:
                    Jp0.O(obj);
                    C2771sg0 c2771sg0 = wo0.c;
                    Oo0 oo0 = Oo0.a;
                    this.n = 1;
                    c2771sg0.l(oo0, this);
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
                    obj = q31.j(str, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    c2109lo0 = (C2109lo0) obj;
                    C2303no0 c2303no0R = wo0.b.r();
                    String str2 = c2109lo0.a;
                    c2303no0R.getClass();
                    G80 g80A = G80.a(1, "SELECT * FROM tv_shows WHERE id = ?");
                    g80A.o(1, str2);
                    C2538q90 c2538q90J = UK.j((F80) c2303no0R.m, new String[]{"tv_shows"}, new CallableC2206mo0(c2303no0R, g80A, 0));
                    this.m = c2109lo0;
                    this.n = 4;
                    obj = Nr0.l(c2538q90J, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    c2109lo1 = (C2109lo0) obj;
                    if (c2109lo1 != null) {
                        c2109lo0.getClass();
                        c2109lo0.q = c2109lo1.q;
                    }
                    wo0.b.r().i(c2109lo0);
                    c2109lo0A = C2109lo0.a(c2109lo0, null, null, null, null, null, null, AQ.w);
                    List list = c2109lo0.k;
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((Ma0) it2.next()).e = c2109lo0A;
                    }
                    Na0 na0Q = wo0.b.q();
                    f80 = (F80) na0Q.m;
                    f80.b();
                    f80.c();
                    try {
                        ((C0482Hq) na0Q.n).g(list);
                        f80.m();
                        f80.j();
                        C2771sg0 c2771sg1 = wo0.c;
                        Po0 po0 = new Po0(c2109lo0);
                        this.m = null;
                        this.n = 5;
                        c2771sg1.l(po0, this);
                        if (c2985uq0 == enumC1706hi) {
                            return enumC1706hi;
                        }
                        return c2985uq0;
                    } catch (Throwable th) {
                        f80.j();
                        throw th;
                    }
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
                    String str3 = this.p;
                    this.n = 3;
                    obj = q31.j(str3, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    c2109lo0 = (C2109lo0) obj;
                    C2303no0 c2303no0R2 = wo0.b.r();
                    String str4 = c2109lo0.a;
                    c2303no0R2.getClass();
                    G80 g80A2 = G80.a(1, "SELECT * FROM tv_shows WHERE id = ?");
                    g80A2.o(1, str4);
                    C2538q90 c2538q90J2 = UK.j((F80) c2303no0R2.m, new String[]{"tv_shows"}, new CallableC2206mo0(c2303no0R2, g80A2, 0));
                    this.m = c2109lo0;
                    this.n = 4;
                    obj = Nr0.l(c2538q90J2, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    c2109lo1 = (C2109lo0) obj;
                    if (c2109lo1 != null) {
                        c2109lo0.getClass();
                        c2109lo0.q = c2109lo1.q;
                    }
                    wo0.b.r().i(c2109lo0);
                    c2109lo0A = C2109lo0.a(c2109lo0, null, null, null, null, null, null, AQ.w);
                    List list2 = c2109lo0.k;
                    it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((Ma0) it2.next()).e = c2109lo0A;
                    }
                    Na0 na0Q2 = wo0.b.q();
                    f80 = (F80) na0Q2.m;
                    f80.b();
                    f80.c();
                    ((C0482Hq) na0Q2.n).g(list2);
                    f80.m();
                    f80.j();
                    C2771sg0 c2771sg2 = wo0.c;
                    Po0 po1 = new Po0(c2109lo0);
                    this.m = null;
                    this.n = 5;
                    c2771sg2.l(po1, this);
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
                    String str5 = this.p;
                    this.n = 3;
                    obj = q31.j(str5, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    c2109lo0 = (C2109lo0) obj;
                    C2303no0 c2303no0R3 = wo0.b.r();
                    String str6 = c2109lo0.a;
                    c2303no0R3.getClass();
                    G80 g80A3 = G80.a(1, "SELECT * FROM tv_shows WHERE id = ?");
                    g80A3.o(1, str6);
                    C2538q90 c2538q90J3 = UK.j((F80) c2303no0R3.m, new String[]{"tv_shows"}, new CallableC2206mo0(c2303no0R3, g80A3, 0));
                    this.m = c2109lo0;
                    this.n = 4;
                    obj = Nr0.l(c2538q90J3, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    c2109lo1 = (C2109lo0) obj;
                    if (c2109lo1 != null) {
                        c2109lo0.getClass();
                        c2109lo0.q = c2109lo1.q;
                    }
                    wo0.b.r().i(c2109lo0);
                    c2109lo0A = C2109lo0.a(c2109lo0, null, null, null, null, null, null, AQ.w);
                    List list3 = c2109lo0.k;
                    it2 = list3.iterator();
                    while (it2.hasNext()) {
                        ((Ma0) it2.next()).e = c2109lo0A;
                    }
                    Na0 na0Q3 = wo0.b.q();
                    f80 = (F80) na0Q3.m;
                    f80.b();
                    f80.c();
                    ((C0482Hq) na0Q3.n).g(list3);
                    f80.m();
                    f80.j();
                    C2771sg0 c2771sg3 = wo0.c;
                    Po0 po2 = new Po0(c2109lo0);
                    this.m = null;
                    this.n = 5;
                    c2771sg3.l(po2, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return c2985uq0;
                case 3:
                    Jp0.O(obj);
                    c2109lo0 = (C2109lo0) obj;
                    C2303no0 c2303no0R4 = wo0.b.r();
                    String str7 = c2109lo0.a;
                    c2303no0R4.getClass();
                    G80 g80A4 = G80.a(1, "SELECT * FROM tv_shows WHERE id = ?");
                    g80A4.o(1, str7);
                    C2538q90 c2538q90J4 = UK.j((F80) c2303no0R4.m, new String[]{"tv_shows"}, new CallableC2206mo0(c2303no0R4, g80A4, 0));
                    this.m = c2109lo0;
                    this.n = 4;
                    obj = Nr0.l(c2538q90J4, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    c2109lo1 = (C2109lo0) obj;
                    if (c2109lo1 != null) {
                        c2109lo0.getClass();
                        c2109lo0.q = c2109lo1.q;
                    }
                    wo0.b.r().i(c2109lo0);
                    c2109lo0A = C2109lo0.a(c2109lo0, null, null, null, null, null, null, AQ.w);
                    List list4 = c2109lo0.k;
                    it2 = list4.iterator();
                    while (it2.hasNext()) {
                        ((Ma0) it2.next()).e = c2109lo0A;
                    }
                    Na0 na0Q4 = wo0.b.q();
                    f80 = (F80) na0Q4.m;
                    f80.b();
                    f80.c();
                    ((C0482Hq) na0Q4.n).g(list4);
                    f80.m();
                    f80.j();
                    C2771sg0 c2771sg4 = wo0.c;
                    Po0 po3 = new Po0(c2109lo0);
                    this.m = null;
                    this.n = 5;
                    c2771sg4.l(po3, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return c2985uq0;
                case 4:
                    c2109lo0 = this.m;
                    Jp0.O(obj);
                    c2109lo1 = (C2109lo0) obj;
                    if (c2109lo1 != null) {
                        c2109lo0.getClass();
                        c2109lo0.q = c2109lo1.q;
                    }
                    wo0.b.r().i(c2109lo0);
                    c2109lo0A = C2109lo0.a(c2109lo0, null, null, null, null, null, null, AQ.w);
                    List list5 = c2109lo0.k;
                    it2 = list5.iterator();
                    while (it2.hasNext()) {
                        ((Ma0) it2.next()).e = c2109lo0A;
                    }
                    Na0 na0Q5 = wo0.b.q();
                    f80 = (F80) na0Q5.m;
                    f80.b();
                    f80.c();
                    ((C0482Hq) na0Q5.n).g(list5);
                    f80.m();
                    f80.j();
                    C2771sg0 c2771sg5 = wo0.c;
                    Po0 po4 = new Po0(c2109lo0);
                    this.m = null;
                    this.n = 5;
                    c2771sg5.l(po4, this);
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
            C2771sg0 c2771sg6 = wo0.c;
            No0 no0 = new No0(e);
            this.m = null;
            this.n = 6;
            c2771sg6.l(no0, this);
            if (c2985uq0 == enumC1706hi) {
                return enumC1706hi;
            }
        }
    }
}
