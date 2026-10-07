package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class IR extends Ph0 implements InterfaceC0775Sy {
    public C1387eR m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MR f323o;
    public final /* synthetic */ String p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IR(MR mr, String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f323o = mr;
        this.p = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((IR) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new IR(this.f323o, this.p, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:7:0x001c, B:12:0x0026, B:43:0x00cf, B:45:0x00d3, B:46:0x00d6, B:13:0x002b, B:40:0x009a, B:14:0x0030, B:23:0x0053, B:25:0x0061, B:37:0x0090, B:26:0x0064, B:27:0x006f, B:29:0x0075, B:33:0x0088, B:35:0x008c, B:20:0x0047), top: B:53:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0064 A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:7:0x001c, B:12:0x0026, B:43:0x00cf, B:45:0x00d3, B:46:0x00d6, B:13:0x002b, B:40:0x009a, B:14:0x0030, B:23:0x0053, B:25:0x0061, B:37:0x0090, B:26:0x0064, B:27:0x006f, B:29:0x0075, B:33:0x0088, B:35:0x008c, B:20:0x0047), top: B:53:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0075 A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:7:0x001c, B:12:0x0026, B:43:0x00cf, B:45:0x00d3, B:46:0x00d6, B:13:0x002b, B:40:0x009a, B:14:0x0030, B:23:0x0053, B:25:0x0061, B:37:0x0090, B:26:0x0064, B:27:0x006f, B:29:0x0075, B:33:0x0088, B:35:0x008c, B:20:0x0047), top: B:53:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008c A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:7:0x001c, B:12:0x0026, B:43:0x00cf, B:45:0x00d3, B:46:0x00d6, B:13:0x002b, B:40:0x009a, B:14:0x0030, B:23:0x0053, B:25:0x0061, B:37:0x0090, B:26:0x0064, B:27:0x006f, B:29:0x0075, B:33:0x0088, B:35:0x008c, B:20:0x0047), top: B:53:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3 A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:7:0x001c, B:12:0x0026, B:43:0x00cf, B:45:0x00d3, B:46:0x00d6, B:13:0x002b, B:40:0x009a, B:14:0x0030, B:23:0x0053, B:25:0x0061, B:37:0x0090, B:26:0x0064, B:27:0x006f, B:29:0x0075, B:33:0x0088, B:35:0x008c, B:20:0x0047), top: B:53:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x0103 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0087 A[SYNTHETIC] */
    @Override // o.R7
    public final Object r(Object obj) {
        O9 o9;
        String strB;
        Iterator it;
        Object next;
        Q30 q30;
        Q30 q31;
        C1387eR c1387eR;
        C1387eR c1387eR2;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        C2985uq0 c2985uq0 = C2985uq0.a;
        String str = this.p;
        MR mr = this.f323o;
        try {
            switch (i) {
                case 0:
                    Jp0.O(obj);
                    C2771sg0 c2771sg0 = mr.c;
                    FR fr = FR.a;
                    this.n = 1;
                    c2771sg0.l(fr, this);
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
                    this.n = 3;
                    obj = q31.b(str, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    c1387eR = (C1387eR) obj;
                    C1583gR c1583gRP = mr.b.p();
                    c1583gRP.getClass();
                    G80 g80A = G80.a(1, "SELECT * FROM movies WHERE id = ?");
                    g80A.o(1, str);
                    C2538q90 c2538q90J = UK.j((F80) c1583gRP.m, new String[]{"movies"}, new CallableC1485fR(c1583gRP, g80A, 0));
                    this.m = c1387eR;
                    this.n = 4;
                    obj = Nr0.l(c2538q90J, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    c1387eR2 = (C1387eR) obj;
                    if (c1387eR2 != null) {
                        c1387eR.h(c1387eR2);
                    }
                    mr.b.p().y(c1387eR);
                    C2771sg0 c2771sg1 = mr.c;
                    GR gr = new GR(c1387eR);
                    this.m = null;
                    this.n = 5;
                    c2771sg1.l(gr, this);
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
                    this.n = 3;
                    obj = q31.b(str, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    c1387eR = (C1387eR) obj;
                    C1583gR c1583gRP2 = mr.b.p();
                    c1583gRP2.getClass();
                    G80 g80A2 = G80.a(1, "SELECT * FROM movies WHERE id = ?");
                    g80A2.o(1, str);
                    C2538q90 c2538q90J2 = UK.j((F80) c1583gRP2.m, new String[]{"movies"}, new CallableC1485fR(c1583gRP2, g80A2, 0));
                    this.m = c1387eR;
                    this.n = 4;
                    obj = Nr0.l(c2538q90J2, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    c1387eR2 = (C1387eR) obj;
                    if (c1387eR2 != null) {
                        c1387eR.h(c1387eR2);
                    }
                    mr.b.p().y(c1387eR);
                    C2771sg0 c2771sg2 = mr.c;
                    GR gr2 = new GR(c1387eR);
                    this.m = null;
                    this.n = 5;
                    c2771sg2.l(gr2, this);
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
                    this.n = 3;
                    obj = q31.b(str, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    c1387eR = (C1387eR) obj;
                    C1583gR c1583gRP3 = mr.b.p();
                    c1583gRP3.getClass();
                    G80 g80A3 = G80.a(1, "SELECT * FROM movies WHERE id = ?");
                    g80A3.o(1, str);
                    C2538q90 c2538q90J3 = UK.j((F80) c1583gRP3.m, new String[]{"movies"}, new CallableC1485fR(c1583gRP3, g80A3, 0));
                    this.m = c1387eR;
                    this.n = 4;
                    obj = Nr0.l(c2538q90J3, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    c1387eR2 = (C1387eR) obj;
                    if (c1387eR2 != null) {
                        c1387eR.h(c1387eR2);
                    }
                    mr.b.p().y(c1387eR);
                    C2771sg0 c2771sg3 = mr.c;
                    GR gr3 = new GR(c1387eR);
                    this.m = null;
                    this.n = 5;
                    c2771sg3.l(gr3, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return c2985uq0;
                case 3:
                    Jp0.O(obj);
                    c1387eR = (C1387eR) obj;
                    C1583gR c1583gRP4 = mr.b.p();
                    c1583gRP4.getClass();
                    G80 g80A4 = G80.a(1, "SELECT * FROM movies WHERE id = ?");
                    g80A4.o(1, str);
                    C2538q90 c2538q90J4 = UK.j((F80) c1583gRP4.m, new String[]{"movies"}, new CallableC1485fR(c1583gRP4, g80A4, 0));
                    this.m = c1387eR;
                    this.n = 4;
                    obj = Nr0.l(c2538q90J4, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    c1387eR2 = (C1387eR) obj;
                    if (c1387eR2 != null) {
                        c1387eR.h(c1387eR2);
                    }
                    mr.b.p().y(c1387eR);
                    C2771sg0 c2771sg4 = mr.c;
                    GR gr4 = new GR(c1387eR);
                    this.m = null;
                    this.n = 5;
                    c2771sg4.l(gr4, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return c2985uq0;
                case 4:
                    c1387eR = this.m;
                    Jp0.O(obj);
                    c1387eR2 = (C1387eR) obj;
                    if (c1387eR2 != null) {
                        c1387eR.h(c1387eR2);
                    }
                    mr.b.p().y(c1387eR);
                    C2771sg0 c2771sg5 = mr.c;
                    GR gr5 = new GR(c1387eR);
                    this.m = null;
                    this.n = 5;
                    c2771sg5.l(gr5, this);
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
            C2771sg0 c2771sg6 = mr.c;
            ER er = new ER(e);
            this.m = null;
            this.n = 6;
            c2771sg6.l(er, this);
            if (c2985uq0 == enumC1706hi) {
                return enumC1706hi;
            }
        }
    }
}
