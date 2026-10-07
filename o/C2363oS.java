package o;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.oS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2363oS extends Ph0 implements InterfaceC0775Sy {
    public AbstractC2169mS m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2557qS f948o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2363oS(C2557qS c2557qS, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f948o = c2557qS;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2363oS) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2363oS(this.f948o, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x006a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0079 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:7:0x001a, B:12:0x0024, B:47:0x00b7, B:15:0x002b, B:30:0x006b, B:32:0x0079, B:44:0x00a8, B:33:0x007c, B:34:0x0087, B:36:0x008d, B:40:0x00a0, B:42:0x00a4, B:27:0x005d), top: B:54:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:33:0x007c A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:7:0x001a, B:12:0x0024, B:47:0x00b7, B:15:0x002b, B:30:0x006b, B:32:0x0079, B:44:0x00a8, B:33:0x007c, B:34:0x0087, B:36:0x008d, B:40:0x00a0, B:42:0x00a4, B:27:0x005d), top: B:54:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:36:0x008d A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:7:0x001a, B:12:0x0024, B:47:0x00b7, B:15:0x002b, B:30:0x006b, B:32:0x0079, B:44:0x00a8, B:33:0x007c, B:34:0x0087, B:36:0x008d, B:40:0x00a0, B:42:0x00a4, B:27:0x005d), top: B:54:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:7:0x001a, B:12:0x0024, B:47:0x00b7, B:15:0x002b, B:30:0x006b, B:32:0x0079, B:44:0x00a8, B:33:0x007c, B:34:0x0087, B:36:0x008d, B:40:0x00a0, B:42:0x00a4, B:27:0x005d), top: B:54:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x00dc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x009f A[SYNTHETIC] */
    @Override // o.R7
    public final Object r(Object obj) {
        AbstractC2169mS abstractC2169mS;
        O9 o9;
        String strB;
        Iterator it;
        Object next;
        Q30 q30;
        Q30 q31;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        C2985uq0 c2985uq0 = C2985uq0.a;
        C2557qS c2557qS = this.f948o;
        try {
            switch (i) {
                case 0:
                    Jp0.O(obj);
                    C2771sg0 c2771sg0 = c2557qS.b;
                    this.n = 1;
                    obj = Nr0.l(c2771sg0, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    abstractC2169mS = (AbstractC2169mS) obj;
                    if (abstractC2169mS instanceof C2072lS) {
                        C2771sg0 c2771sg1 = c2557qS.b;
                        C1974kS c1974kS = C1974kS.a;
                        this.m = abstractC2169mS;
                        this.n = 2;
                        c2771sg1.l(c1974kS, this);
                        if (c2985uq0 == enumC1706hi) {
                            return enumC1706hi;
                        }
                        o9 = O9.x;
                        this.m = abstractC2169mS;
                        this.n = 3;
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
                        int i2 = c2557qS.d + 1;
                        this.m = abstractC2169mS;
                        this.n = 4;
                        obj = q31.i(i2, this);
                        if (obj == enumC1706hi) {
                            return enumC1706hi;
                        }
                        List list = (List) obj;
                        c2557qS.d++;
                        C2771sg0 c2771sg2 = c2557qS.b;
                        C2072lS c2072lS = new C2072lS(AbstractC0911Ye.m0(((C2072lS) abstractC2169mS).a, list), !list.isEmpty());
                        this.m = null;
                        this.n = 5;
                        c2771sg2.l(c2072lS, this);
                        if (c2985uq0 == enumC1706hi) {
                            return enumC1706hi;
                        }
                    }
                    return c2985uq0;
                case 1:
                    Jp0.O(obj);
                    abstractC2169mS = (AbstractC2169mS) obj;
                    if (abstractC2169mS instanceof C2072lS) {
                        C2771sg0 c2771sg3 = c2557qS.b;
                        C1974kS c1974kS2 = C1974kS.a;
                        this.m = abstractC2169mS;
                        this.n = 2;
                        c2771sg3.l(c1974kS2, this);
                        if (c2985uq0 == enumC1706hi) {
                            return enumC1706hi;
                        }
                        o9 = O9.x;
                        this.m = abstractC2169mS;
                        this.n = 3;
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
                        int i3 = c2557qS.d + 1;
                        this.m = abstractC2169mS;
                        this.n = 4;
                        obj = q31.i(i3, this);
                        if (obj == enumC1706hi) {
                            return enumC1706hi;
                        }
                        List list2 = (List) obj;
                        c2557qS.d++;
                        C2771sg0 c2771sg4 = c2557qS.b;
                        C2072lS c2072lS2 = new C2072lS(AbstractC0911Ye.m0(((C2072lS) abstractC2169mS).a, list2), !list2.isEmpty());
                        this.m = null;
                        this.n = 5;
                        c2771sg4.l(c2072lS2, this);
                        if (c2985uq0 == enumC1706hi) {
                            return enumC1706hi;
                        }
                    }
                    return c2985uq0;
                case 2:
                    abstractC2169mS = this.m;
                    Jp0.O(obj);
                    o9 = O9.x;
                    this.m = abstractC2169mS;
                    this.n = 3;
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
                    int i4 = c2557qS.d + 1;
                    this.m = abstractC2169mS;
                    this.n = 4;
                    obj = q31.i(i4, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    List list3 = (List) obj;
                    c2557qS.d++;
                    C2771sg0 c2771sg5 = c2557qS.b;
                    C2072lS c2072lS3 = new C2072lS(AbstractC0911Ye.m0(((C2072lS) abstractC2169mS).a, list3), !list3.isEmpty());
                    this.m = null;
                    this.n = 5;
                    c2771sg5.l(c2072lS3, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return c2985uq0;
                case 3:
                    abstractC2169mS = this.m;
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
                    int i5 = c2557qS.d + 1;
                    this.m = abstractC2169mS;
                    this.n = 4;
                    obj = q31.i(i5, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    List list4 = (List) obj;
                    c2557qS.d++;
                    C2771sg0 c2771sg6 = c2557qS.b;
                    C2072lS c2072lS4 = new C2072lS(AbstractC0911Ye.m0(((C2072lS) abstractC2169mS).a, list4), !list4.isEmpty());
                    this.m = null;
                    this.n = 5;
                    c2771sg6.l(c2072lS4, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return c2985uq0;
                case 4:
                    abstractC2169mS = this.m;
                    Jp0.O(obj);
                    List list5 = (List) obj;
                    c2557qS.d++;
                    C2771sg0 c2771sg7 = c2557qS.b;
                    C2072lS c2072lS5 = new C2072lS(AbstractC0911Ye.m0(((C2072lS) abstractC2169mS).a, list5), !list5.isEmpty());
                    this.m = null;
                    this.n = 5;
                    c2771sg7.l(c2072lS5, this);
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
            C2771sg0 c2771sg8 = c2557qS.b;
            C1780iS c1780iS = new C1780iS(e);
            this.m = null;
            this.n = 6;
            c2771sg8.l(c1780iS, this);
            if (c2985uq0 == enumC1706hi) {
                return enumC1706hi;
            }
        }
    }
}
