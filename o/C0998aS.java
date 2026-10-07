package o;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.aS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0998aS extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ C1096bS n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0998aS(C1096bS c1096bS, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = c1096bS;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C0998aS) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C0998aS(this.n, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x005d A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:7:0x0019, B:10:0x0021, B:46:0x00bd, B:48:0x00c2, B:11:0x0026, B:40:0x00a3, B:12:0x002b, B:21:0x004e, B:23:0x005d, B:35:0x008c, B:37:0x0094, B:41:0x00a6, B:43:0x00ae, B:47:0x00c0, B:24:0x0060, B:25:0x006b, B:27:0x0071, B:31:0x0084, B:33:0x0088, B:18:0x0043), top: B:55:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0060 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:7:0x0019, B:10:0x0021, B:46:0x00bd, B:48:0x00c2, B:11:0x0026, B:40:0x00a3, B:12:0x002b, B:21:0x004e, B:23:0x005d, B:35:0x008c, B:37:0x0094, B:41:0x00a6, B:43:0x00ae, B:47:0x00c0, B:24:0x0060, B:25:0x006b, B:27:0x0071, B:31:0x0084, B:33:0x0088, B:18:0x0043), top: B:55:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0071 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:7:0x0019, B:10:0x0021, B:46:0x00bd, B:48:0x00c2, B:11:0x0026, B:40:0x00a3, B:12:0x002b, B:21:0x004e, B:23:0x005d, B:35:0x008c, B:37:0x0094, B:41:0x00a6, B:43:0x00ae, B:47:0x00c0, B:24:0x0060, B:25:0x006b, B:27:0x0071, B:31:0x0084, B:33:0x0088, B:18:0x0043), top: B:55:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0088 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:7:0x0019, B:10:0x0021, B:46:0x00bd, B:48:0x00c2, B:11:0x0026, B:40:0x00a3, B:12:0x002b, B:21:0x004e, B:23:0x005d, B:35:0x008c, B:37:0x0094, B:41:0x00a6, B:43:0x00ae, B:47:0x00c0, B:24:0x0060, B:25:0x006b, B:27:0x0071, B:31:0x0084, B:33:0x0088, B:18:0x0043), top: B:55:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0094 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:7:0x0019, B:10:0x0021, B:46:0x00bd, B:48:0x00c2, B:11:0x0026, B:40:0x00a3, B:12:0x002b, B:21:0x004e, B:23:0x005d, B:35:0x008c, B:37:0x0094, B:41:0x00a6, B:43:0x00ae, B:47:0x00c0, B:24:0x0060, B:25:0x006b, B:27:0x0071, B:31:0x0084, B:33:0x0088, B:18:0x0043), top: B:55:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:7:0x0019, B:10:0x0021, B:46:0x00bd, B:48:0x00c2, B:11:0x0026, B:40:0x00a3, B:12:0x002b, B:21:0x004e, B:23:0x005d, B:35:0x008c, B:37:0x0094, B:41:0x00a6, B:43:0x00ae, B:47:0x00c0, B:24:0x0060, B:25:0x006b, B:27:0x0071, B:31:0x0084, B:33:0x0088, B:18:0x0043), top: B:55:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:7:0x0019, B:10:0x0021, B:46:0x00bd, B:48:0x00c2, B:11:0x0026, B:40:0x00a3, B:12:0x002b, B:21:0x004e, B:23:0x005d, B:35:0x008c, B:37:0x0094, B:41:0x00a6, B:43:0x00ae, B:47:0x00c0, B:24:0x0060, B:25:0x006b, B:27:0x0071, B:31:0x0084, B:33:0x0088, B:18:0x0043), top: B:55:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c0 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:7:0x0019, B:10:0x0021, B:46:0x00bd, B:48:0x00c2, B:11:0x0026, B:40:0x00a3, B:12:0x002b, B:21:0x004e, B:23:0x005d, B:35:0x008c, B:37:0x0094, B:41:0x00a6, B:43:0x00ae, B:47:0x00c0, B:24:0x0060, B:25:0x006b, B:27:0x0071, B:31:0x0084, B:33:0x0088, B:18:0x0043), top: B:55:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x0083 A[SYNTHETIC] */
    @Override // o.R7
    public final Object r(Object obj) {
        O9 o9;
        String strB;
        Iterator it;
        Object next;
        Q30 q30;
        Q30 q31;
        List list;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        C2985uq0 c2985uq0 = C2985uq0.a;
        C1096bS c1096bS = this.n;
        try {
            switch (i) {
                case 0:
                    Jp0.O(obj);
                    C2771sg0 c2771sg0 = c1096bS.b;
                    XR xr = XR.a;
                    this.m = 1;
                    c2771sg0.l(xr, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    o9 = O9.x;
                    this.m = 2;
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
                    if (AbstractC1474fG.b(q31, C1816io0.b)) {
                        this.m = 3;
                        obj = zy0.n(new Ln0(2, null), this);
                        if (obj == enumC1706hi) {
                            return enumC1706hi;
                        }
                        list = (List) obj;
                    } else if (AbstractC1474fG.b(q31, Lx0.b)) {
                        this.m = 4;
                        obj = zy0.n(new C2612qx0(2, null), this);
                        if (obj == enumC1706hi) {
                            return enumC1706hi;
                        }
                        list = (List) obj;
                    } else {
                        list = C1233cq.l;
                    }
                    C2771sg0 c2771sg1 = c1096bS.b;
                    YR yr = new YR(list);
                    this.m = 5;
                    c2771sg1.l(yr, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return c2985uq0;
                case 1:
                    Jp0.O(obj);
                    o9 = O9.x;
                    this.m = 2;
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
                    if (AbstractC1474fG.b(q31, C1816io0.b)) {
                        this.m = 3;
                        obj = zy0.n(new Ln0(2, null), this);
                        if (obj == enumC1706hi) {
                            return enumC1706hi;
                        }
                        list = (List) obj;
                    } else if (AbstractC1474fG.b(q31, Lx0.b)) {
                        this.m = 4;
                        obj = zy0.n(new C2612qx0(2, null), this);
                        if (obj == enumC1706hi) {
                            return enumC1706hi;
                        }
                        list = (List) obj;
                    } else {
                        list = C1233cq.l;
                    }
                    C2771sg0 c2771sg2 = c1096bS.b;
                    YR yr2 = new YR(list);
                    this.m = 5;
                    c2771sg2.l(yr2, this);
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
                    if (AbstractC1474fG.b(q31, C1816io0.b)) {
                        this.m = 3;
                        obj = zy0.n(new Ln0(2, null), this);
                        if (obj == enumC1706hi) {
                            return enumC1706hi;
                        }
                        list = (List) obj;
                    } else if (AbstractC1474fG.b(q31, Lx0.b)) {
                        this.m = 4;
                        obj = zy0.n(new C2612qx0(2, null), this);
                        if (obj == enumC1706hi) {
                            return enumC1706hi;
                        }
                        list = (List) obj;
                    } else {
                        list = C1233cq.l;
                    }
                    C2771sg0 c2771sg3 = c1096bS.b;
                    YR yr3 = new YR(list);
                    this.m = 5;
                    c2771sg3.l(yr3, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return c2985uq0;
                case 3:
                    Jp0.O(obj);
                    list = (List) obj;
                    C2771sg0 c2771sg4 = c1096bS.b;
                    YR yr4 = new YR(list);
                    this.m = 5;
                    c2771sg4.l(yr4, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return c2985uq0;
                case 4:
                    Jp0.O(obj);
                    list = (List) obj;
                    C2771sg0 c2771sg5 = c1096bS.b;
                    YR yr5 = new YR(list);
                    this.m = 5;
                    c2771sg5.l(yr5, this);
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
            C2771sg0 c2771sg6 = c1096bS.b;
            WR wr = new WR(e);
            this.m = 6;
            c2771sg6.l(wr, this);
            if (c2985uq0 == enumC1706hi) {
                return enumC1706hi;
            }
        }
    }
}
