package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class AY extends Ph0 implements InterfaceC0775Sy {
    public AbstractC3338yY m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ CY f172o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AY(CY cy, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f172o = cy;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((AY) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new AY(this.f172o, interfaceC0473Hh);
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
    /* JADX WARN: Code duplicated, block: B:49:0x00ed A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0100 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x009f A[SYNTHETIC] */
    @Override // o.R7
    public final Object r(Object obj) {
        AbstractC3338yY abstractC3338yY;
        O9 o9;
        String strB;
        Iterator it;
        Object next;
        Q30 q30;
        Q30 q31;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        C2985uq0 c2985uq0 = C2985uq0.a;
        CY cy = this.f172o;
        try {
            switch (i) {
                case 0:
                    Jp0.O(obj);
                    C2771sg0 c2771sg0 = cy.c;
                    this.n = 1;
                    obj = Nr0.l(c2771sg0, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    abstractC3338yY = (AbstractC3338yY) obj;
                    if (abstractC3338yY instanceof C3241xY) {
                        C2771sg0 c2771sg1 = cy.c;
                        C3144wY c3144wY = C3144wY.a;
                        this.m = abstractC3338yY;
                        this.n = 2;
                        c2771sg1.l(c3144wY, this);
                        if (c2985uq0 == enumC1706hi) {
                            return enumC1706hi;
                        }
                        o9 = O9.x;
                        this.m = abstractC3338yY;
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
                        String str = cy.b;
                        int i2 = cy.e + 1;
                        this.m = abstractC3338yY;
                        this.n = 4;
                        obj = q31.k(str, i2, this);
                        if (obj == enumC1706hi) {
                            return enumC1706hi;
                        }
                        C1688hY c1688hY = (C1688hY) obj;
                        cy.e++;
                        C2771sg0 c2771sg2 = cy.c;
                        C3241xY c3241xY = new C3241xY(C1688hY.a(((C3241xY) abstractC3338yY).a, AbstractC0911Ye.m0(((C3241xY) abstractC3338yY).a.d, c1688hY.d)), !c1688hY.d.isEmpty());
                        this.m = null;
                        this.n = 5;
                        c2771sg2.l(c3241xY, this);
                        if (c2985uq0 == enumC1706hi) {
                            return enumC1706hi;
                        }
                    }
                    return c2985uq0;
                case 1:
                    Jp0.O(obj);
                    abstractC3338yY = (AbstractC3338yY) obj;
                    if (abstractC3338yY instanceof C3241xY) {
                        C2771sg0 c2771sg3 = cy.c;
                        C3144wY c3144wY2 = C3144wY.a;
                        this.m = abstractC3338yY;
                        this.n = 2;
                        c2771sg3.l(c3144wY2, this);
                        if (c2985uq0 == enumC1706hi) {
                            return enumC1706hi;
                        }
                        o9 = O9.x;
                        this.m = abstractC3338yY;
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
                        String str2 = cy.b;
                        int i3 = cy.e + 1;
                        this.m = abstractC3338yY;
                        this.n = 4;
                        obj = q31.k(str2, i3, this);
                        if (obj == enumC1706hi) {
                            return enumC1706hi;
                        }
                        C1688hY c1688hY2 = (C1688hY) obj;
                        cy.e++;
                        C2771sg0 c2771sg4 = cy.c;
                        C3241xY c3241xY2 = new C3241xY(C1688hY.a(((C3241xY) abstractC3338yY).a, AbstractC0911Ye.m0(((C3241xY) abstractC3338yY).a.d, c1688hY2.d)), !c1688hY2.d.isEmpty());
                        this.m = null;
                        this.n = 5;
                        c2771sg4.l(c3241xY2, this);
                        if (c2985uq0 == enumC1706hi) {
                            return enumC1706hi;
                        }
                    }
                    return c2985uq0;
                case 2:
                    abstractC3338yY = this.m;
                    Jp0.O(obj);
                    o9 = O9.x;
                    this.m = abstractC3338yY;
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
                    String str3 = cy.b;
                    int i4 = cy.e + 1;
                    this.m = abstractC3338yY;
                    this.n = 4;
                    obj = q31.k(str3, i4, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    C1688hY c1688hY3 = (C1688hY) obj;
                    cy.e++;
                    C2771sg0 c2771sg5 = cy.c;
                    C3241xY c3241xY3 = new C3241xY(C1688hY.a(((C3241xY) abstractC3338yY).a, AbstractC0911Ye.m0(((C3241xY) abstractC3338yY).a.d, c1688hY3.d)), !c1688hY3.d.isEmpty());
                    this.m = null;
                    this.n = 5;
                    c2771sg5.l(c3241xY3, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return c2985uq0;
                case 3:
                    abstractC3338yY = this.m;
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
                    String str4 = cy.b;
                    int i5 = cy.e + 1;
                    this.m = abstractC3338yY;
                    this.n = 4;
                    obj = q31.k(str4, i5, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    C1688hY c1688hY4 = (C1688hY) obj;
                    cy.e++;
                    C2771sg0 c2771sg6 = cy.c;
                    C3241xY c3241xY4 = new C3241xY(C1688hY.a(((C3241xY) abstractC3338yY).a, AbstractC0911Ye.m0(((C3241xY) abstractC3338yY).a.d, c1688hY4.d)), !c1688hY4.d.isEmpty());
                    this.m = null;
                    this.n = 5;
                    c2771sg6.l(c3241xY4, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return c2985uq0;
                case 4:
                    abstractC3338yY = this.m;
                    Jp0.O(obj);
                    C1688hY c1688hY5 = (C1688hY) obj;
                    cy.e++;
                    C2771sg0 c2771sg7 = cy.c;
                    C3241xY c3241xY5 = new C3241xY(C1688hY.a(((C3241xY) abstractC3338yY).a, AbstractC0911Ye.m0(((C3241xY) abstractC3338yY).a.d, c1688hY5.d)), !c1688hY5.d.isEmpty());
                    this.m = null;
                    this.n = 5;
                    c2771sg7.l(c3241xY5, this);
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
            C2771sg0 c2771sg8 = cy.c;
            C2950uY c2950uY = new C2950uY(e);
            this.m = null;
            this.n = 6;
            c2771sg8.l(c2950uY, this);
            if (c2985uq0 == enumC1706hi) {
                return enumC1706hi;
            }
        }
    }
}
