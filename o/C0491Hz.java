package o;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.Hz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0491Hz extends Ph0 implements InterfaceC0775Sy {
    public AbstractC0439Fz m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0594Lz f315o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0491Hz(C0594Lz c0594Lz, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f315o = c0594Lz;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C0491Hz) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C0491Hz(this.f315o, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x006a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0079 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:7:0x001a, B:12:0x0024, B:47:0x00b9, B:49:0x00ca, B:15:0x002b, B:30:0x006b, B:32:0x0079, B:44:0x00a8, B:33:0x007c, B:34:0x0087, B:36:0x008d, B:40:0x00a0, B:42:0x00a4, B:27:0x005d), top: B:56:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:33:0x007c A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:7:0x001a, B:12:0x0024, B:47:0x00b9, B:49:0x00ca, B:15:0x002b, B:30:0x006b, B:32:0x0079, B:44:0x00a8, B:33:0x007c, B:34:0x0087, B:36:0x008d, B:40:0x00a0, B:42:0x00a4, B:27:0x005d), top: B:56:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:36:0x008d A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:7:0x001a, B:12:0x0024, B:47:0x00b9, B:49:0x00ca, B:15:0x002b, B:30:0x006b, B:32:0x0079, B:44:0x00a8, B:33:0x007c, B:34:0x0087, B:36:0x008d, B:40:0x00a0, B:42:0x00a4, B:27:0x005d), top: B:56:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:7:0x001a, B:12:0x0024, B:47:0x00b9, B:49:0x00ca, B:15:0x002b, B:30:0x006b, B:32:0x0079, B:44:0x00a8, B:33:0x007c, B:34:0x0087, B:36:0x008d, B:40:0x00a0, B:42:0x00a4, B:27:0x005d), top: B:56:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0103 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x009f A[SYNTHETIC] */
    @Override // o.R7
    public final Object r(Object obj) {
        AbstractC0439Fz abstractC0439Fz;
        O9 o9;
        String strB;
        Iterator it;
        Object next;
        Q30 q30;
        Q30 q31;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        C2985uq0 c2985uq0 = C2985uq0.a;
        C0594Lz c0594Lz = this.f315o;
        try {
            switch (i) {
                case 0:
                    Jp0.O(obj);
                    C2771sg0 c2771sg0 = c0594Lz.c;
                    this.n = 1;
                    obj = Nr0.l(c2771sg0, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    abstractC0439Fz = (AbstractC0439Fz) obj;
                    if (abstractC0439Fz instanceof C0413Ez) {
                        C2771sg0 c2771sg1 = c0594Lz.c;
                        C0387Dz c0387Dz = C0387Dz.a;
                        this.m = abstractC0439Fz;
                        this.n = 2;
                        c2771sg1.l(c0387Dz, this);
                        if (c2985uq0 == enumC1706hi) {
                            return enumC1706hi;
                        }
                        o9 = O9.x;
                        this.m = abstractC0439Fz;
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
                        String str = c0594Lz.b;
                        int i2 = c0594Lz.e + 1;
                        this.m = abstractC0439Fz;
                        this.n = 4;
                        obj = q31.h(str, i2, this);
                        if (obj == enumC1706hi) {
                            return enumC1706hi;
                        }
                        C2420oz c2420oz = (C2420oz) obj;
                        c0594Lz.e++;
                        C2771sg0 c2771sg2 = c0594Lz.c;
                        String str2 = c2420oz.a;
                        List list = c2420oz.c;
                        C0413Ez c0413Ez = new C0413Ez(new C2420oz(str2, c2420oz.b, AbstractC0911Ye.m0(((C0413Ez) abstractC0439Fz).a.c, list)), !list.isEmpty());
                        this.m = null;
                        this.n = 5;
                        c2771sg2.l(c0413Ez, this);
                        if (c2985uq0 == enumC1706hi) {
                            return enumC1706hi;
                        }
                    }
                    return c2985uq0;
                case 1:
                    Jp0.O(obj);
                    abstractC0439Fz = (AbstractC0439Fz) obj;
                    if (abstractC0439Fz instanceof C0413Ez) {
                        C2771sg0 c2771sg3 = c0594Lz.c;
                        C0387Dz c0387Dz2 = C0387Dz.a;
                        this.m = abstractC0439Fz;
                        this.n = 2;
                        c2771sg3.l(c0387Dz2, this);
                        if (c2985uq0 == enumC1706hi) {
                            return enumC1706hi;
                        }
                        o9 = O9.x;
                        this.m = abstractC0439Fz;
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
                        String str3 = c0594Lz.b;
                        int i3 = c0594Lz.e + 1;
                        this.m = abstractC0439Fz;
                        this.n = 4;
                        obj = q31.h(str3, i3, this);
                        if (obj == enumC1706hi) {
                            return enumC1706hi;
                        }
                        C2420oz c2420oz2 = (C2420oz) obj;
                        c0594Lz.e++;
                        C2771sg0 c2771sg4 = c0594Lz.c;
                        String str4 = c2420oz2.a;
                        List list2 = c2420oz2.c;
                        C0413Ez c0413Ez2 = new C0413Ez(new C2420oz(str4, c2420oz2.b, AbstractC0911Ye.m0(((C0413Ez) abstractC0439Fz).a.c, list2)), !list2.isEmpty());
                        this.m = null;
                        this.n = 5;
                        c2771sg4.l(c0413Ez2, this);
                        if (c2985uq0 == enumC1706hi) {
                            return enumC1706hi;
                        }
                    }
                    return c2985uq0;
                case 2:
                    abstractC0439Fz = this.m;
                    Jp0.O(obj);
                    o9 = O9.x;
                    this.m = abstractC0439Fz;
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
                    String str5 = c0594Lz.b;
                    int i4 = c0594Lz.e + 1;
                    this.m = abstractC0439Fz;
                    this.n = 4;
                    obj = q31.h(str5, i4, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    C2420oz c2420oz3 = (C2420oz) obj;
                    c0594Lz.e++;
                    C2771sg0 c2771sg5 = c0594Lz.c;
                    String str6 = c2420oz3.a;
                    List list3 = c2420oz3.c;
                    C0413Ez c0413Ez3 = new C0413Ez(new C2420oz(str6, c2420oz3.b, AbstractC0911Ye.m0(((C0413Ez) abstractC0439Fz).a.c, list3)), !list3.isEmpty());
                    this.m = null;
                    this.n = 5;
                    c2771sg5.l(c0413Ez3, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return c2985uq0;
                case 3:
                    abstractC0439Fz = this.m;
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
                    String str7 = c0594Lz.b;
                    int i5 = c0594Lz.e + 1;
                    this.m = abstractC0439Fz;
                    this.n = 4;
                    obj = q31.h(str7, i5, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    C2420oz c2420oz4 = (C2420oz) obj;
                    c0594Lz.e++;
                    C2771sg0 c2771sg6 = c0594Lz.c;
                    String str8 = c2420oz4.a;
                    List list4 = c2420oz4.c;
                    C0413Ez c0413Ez4 = new C0413Ez(new C2420oz(str8, c2420oz4.b, AbstractC0911Ye.m0(((C0413Ez) abstractC0439Fz).a.c, list4)), !list4.isEmpty());
                    this.m = null;
                    this.n = 5;
                    c2771sg6.l(c0413Ez4, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return c2985uq0;
                case 4:
                    abstractC0439Fz = this.m;
                    Jp0.O(obj);
                    C2420oz c2420oz5 = (C2420oz) obj;
                    c0594Lz.e++;
                    C2771sg0 c2771sg7 = c0594Lz.c;
                    String str9 = c2420oz5.a;
                    List list5 = c2420oz5.c;
                    C0413Ez c0413Ez5 = new C0413Ez(new C2420oz(str9, c2420oz5.b, AbstractC0911Ye.m0(((C0413Ez) abstractC0439Fz).a.c, list5)), !list5.isEmpty());
                    this.m = null;
                    this.n = 5;
                    c2771sg7.l(c0413Ez5, this);
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
        } catch (Throwable th) {
            C2771sg0 c2771sg8 = c0594Lz.c;
            C0335Bz c0335Bz = new C0335Bz(new Exception(th));
            this.m = null;
            this.n = 6;
            c2771sg8.l(c0335Bz, this);
            if (c2985uq0 == enumC1706hi) {
                return enumC1706hi;
            }
        }
    }
}
