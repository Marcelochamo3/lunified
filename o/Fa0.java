package o;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Fa0 extends Ph0 implements InterfaceC0775Sy {
    public Ea0 m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ La0 f261o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fa0(La0 la0, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f261o = la0;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Fa0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Fa0(this.f261o, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x006a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0079 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:7:0x001a, B:12:0x0024, B:47:0x00b9, B:15:0x002b, B:30:0x006b, B:32:0x0079, B:44:0x00a8, B:33:0x007c, B:34:0x0087, B:36:0x008d, B:40:0x00a0, B:42:0x00a4, B:27:0x005d), top: B:54:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:33:0x007c A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:7:0x001a, B:12:0x0024, B:47:0x00b9, B:15:0x002b, B:30:0x006b, B:32:0x0079, B:44:0x00a8, B:33:0x007c, B:34:0x0087, B:36:0x008d, B:40:0x00a0, B:42:0x00a4, B:27:0x005d), top: B:54:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:36:0x008d A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:7:0x001a, B:12:0x0024, B:47:0x00b9, B:15:0x002b, B:30:0x006b, B:32:0x0079, B:44:0x00a8, B:33:0x007c, B:34:0x0087, B:36:0x008d, B:40:0x00a0, B:42:0x00a4, B:27:0x005d), top: B:54:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:7:0x001a, B:12:0x0024, B:47:0x00b9, B:15:0x002b, B:30:0x006b, B:32:0x0079, B:44:0x00a8, B:33:0x007c, B:34:0x0087, B:36:0x008d, B:40:0x00a0, B:42:0x00a4, B:27:0x005d), top: B:54:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x00de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x009f A[SYNTHETIC] */
    @Override // o.R7
    public final Object r(Object obj) {
        Ea0 ea0;
        O9 o9;
        String strB;
        Iterator it;
        Object next;
        Q30 q30;
        Q30 q31;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        C2985uq0 c2985uq0 = C2985uq0.a;
        La0 la0 = this.f261o;
        try {
            switch (i) {
                case 0:
                    Jp0.O(obj);
                    C2771sg0 c2771sg0 = la0.b;
                    this.n = 1;
                    obj = Nr0.l(c2771sg0, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    ea0 = (Ea0) obj;
                    if (ea0 instanceof Da0) {
                        C2771sg0 c2771sg1 = la0.b;
                        Ba0 ba0 = Ba0.a;
                        this.m = ea0;
                        this.n = 2;
                        c2771sg1.l(ba0, this);
                        if (c2985uq0 == enumC1706hi) {
                            return enumC1706hi;
                        }
                        o9 = O9.x;
                        this.m = ea0;
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
                        String str = la0.d;
                        int i2 = la0.e + 1;
                        this.m = ea0;
                        this.n = 4;
                        obj = q31.a(str, i2, this);
                        if (obj == enumC1706hi) {
                            return enumC1706hi;
                        }
                        List list = (List) obj;
                        la0.e++;
                        C2771sg0 c2771sg2 = la0.b;
                        Da0 da0 = new Da0(AbstractC0911Ye.m0(((Da0) ea0).a, list), !list.isEmpty());
                        this.m = null;
                        this.n = 5;
                        c2771sg2.l(da0, this);
                        if (c2985uq0 == enumC1706hi) {
                            return enumC1706hi;
                        }
                    }
                    return c2985uq0;
                case 1:
                    Jp0.O(obj);
                    ea0 = (Ea0) obj;
                    if (ea0 instanceof Da0) {
                        C2771sg0 c2771sg3 = la0.b;
                        Ba0 ba1 = Ba0.a;
                        this.m = ea0;
                        this.n = 2;
                        c2771sg3.l(ba1, this);
                        if (c2985uq0 == enumC1706hi) {
                            return enumC1706hi;
                        }
                        o9 = O9.x;
                        this.m = ea0;
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
                        String str2 = la0.d;
                        int i3 = la0.e + 1;
                        this.m = ea0;
                        this.n = 4;
                        obj = q31.a(str2, i3, this);
                        if (obj == enumC1706hi) {
                            return enumC1706hi;
                        }
                        List list2 = (List) obj;
                        la0.e++;
                        C2771sg0 c2771sg4 = la0.b;
                        Da0 da1 = new Da0(AbstractC0911Ye.m0(((Da0) ea0).a, list2), !list2.isEmpty());
                        this.m = null;
                        this.n = 5;
                        c2771sg4.l(da1, this);
                        if (c2985uq0 == enumC1706hi) {
                            return enumC1706hi;
                        }
                    }
                    return c2985uq0;
                case 2:
                    ea0 = this.m;
                    Jp0.O(obj);
                    o9 = O9.x;
                    this.m = ea0;
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
                    String str3 = la0.d;
                    int i4 = la0.e + 1;
                    this.m = ea0;
                    this.n = 4;
                    obj = q31.a(str3, i4, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    List list3 = (List) obj;
                    la0.e++;
                    C2771sg0 c2771sg5 = la0.b;
                    Da0 da2 = new Da0(AbstractC0911Ye.m0(((Da0) ea0).a, list3), !list3.isEmpty());
                    this.m = null;
                    this.n = 5;
                    c2771sg5.l(da2, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return c2985uq0;
                case 3:
                    ea0 = this.m;
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
                    String str4 = la0.d;
                    int i5 = la0.e + 1;
                    this.m = ea0;
                    this.n = 4;
                    obj = q31.a(str4, i5, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    List list4 = (List) obj;
                    la0.e++;
                    C2771sg0 c2771sg6 = la0.b;
                    Da0 da3 = new Da0(AbstractC0911Ye.m0(((Da0) ea0).a, list4), !list4.isEmpty());
                    this.m = null;
                    this.n = 5;
                    c2771sg6.l(da3, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return c2985uq0;
                case 4:
                    ea0 = this.m;
                    Jp0.O(obj);
                    List list5 = (List) obj;
                    la0.e++;
                    C2771sg0 c2771sg7 = la0.b;
                    Da0 da4 = new Da0(AbstractC0911Ye.m0(((Da0) ea0).a, list5), !list5.isEmpty());
                    this.m = null;
                    this.n = 5;
                    c2771sg7.l(da4, this);
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
            C2771sg0 c2771sg8 = la0.b;
            C3341ya0 c3341ya0 = new C3341ya0(e);
            this.m = null;
            this.n = 6;
            c2771sg8.l(c3341ya0, this);
            if (c2985uq0 == enumC1706hi) {
                return enumC1706hi;
            }
        }
    }
}
