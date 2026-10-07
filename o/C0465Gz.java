package o;

import java.util.Iterator;

/* JADX INFO: renamed from: o.Gz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0465Gz extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ C0594Lz n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f291o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0465Gz(C0594Lz c0594Lz, String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = c0594Lz;
        this.f291o = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C0465Gz) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C0465Gz(this.n, this.f291o, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063 A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:12:0x0026, B:15:0x002e, B:42:0x009d, B:16:0x0033, B:25:0x0055, B:27:0x0063, B:39:0x0092, B:28:0x0066, B:29:0x0071, B:31:0x0077, B:35:0x008a, B:37:0x008e, B:22:0x004a), top: B:49:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0066 A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:12:0x0026, B:15:0x002e, B:42:0x009d, B:16:0x0033, B:25:0x0055, B:27:0x0063, B:39:0x0092, B:28:0x0066, B:29:0x0071, B:31:0x0077, B:35:0x008a, B:37:0x008e, B:22:0x004a), top: B:49:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0077 A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:12:0x0026, B:15:0x002e, B:42:0x009d, B:16:0x0033, B:25:0x0055, B:27:0x0063, B:39:0x0092, B:28:0x0066, B:29:0x0071, B:31:0x0077, B:35:0x008a, B:37:0x008e, B:22:0x004a), top: B:49:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008e A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:12:0x0026, B:15:0x002e, B:42:0x009d, B:16:0x0033, B:25:0x0055, B:27:0x0063, B:39:0x0092, B:28:0x0066, B:29:0x0071, B:31:0x0077, B:35:0x008a, B:37:0x008e, B:22:0x004a), top: B:49:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0091  */
    /* JADX WARN: Code duplicated, block: B:41:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x0089 A[SYNTHETIC] */
    @Override // o.R7
    public final Object r(Object obj) {
        String strB;
        Iterator it;
        Object next;
        Q30 q30;
        Q30 q31;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        C2985uq0 c2985uq0 = C2985uq0.a;
        C0594Lz c0594Lz = this.n;
        try {
            if (i != 0) {
                if (i == 1) {
                    Jp0.O(obj);
                } else if (i == 2) {
                    Jp0.O(obj);
                    strB = Cr0.m.b();
                    if (AbstractC1474fG.b(strB, "PPV.TO")) {
                        q31 = QW.b;
                    } else {
                        Q30.a.getClass();
                        it = P30.b.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!AbstractC1474fG.b(((Q30) next).getName(), strB));
                        q30 = (Q30) next;
                        if (q30 == null) {
                            q31 = C1816io0.b;
                        } else {
                            q31 = q30;
                        }
                    }
                    String str = this.f291o;
                    this.m = 3;
                    obj = q31.h(str, 1, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    c0594Lz.e = 1;
                    C2771sg0 c2771sg0 = c0594Lz.c;
                    C0413Ez c0413Ez = new C0413Ez((C2420oz) obj, true);
                    this.m = 4;
                    c2771sg0.l(c0413Ez, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                } else if (i == 3) {
                    Jp0.O(obj);
                    c0594Lz.e = 1;
                    C2771sg0 c2771sg1 = c0594Lz.c;
                    C0413Ez c0413Ez2 = new C0413Ez((C2420oz) obj, true);
                    this.m = 4;
                    c2771sg1.l(c0413Ez2, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                } else {
                    if (i != 4 && i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Jp0.O(obj);
                }
                return c2985uq0;
            }
            Jp0.O(obj);
            C2771sg0 c2771sg2 = c0594Lz.c;
            C0361Cz c0361Cz = C0361Cz.a;
            this.m = 1;
            c2771sg2.l(c0361Cz, this);
            if (c2985uq0 == enumC1706hi) {
                return enumC1706hi;
            }
            O9 o9 = O9.x;
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
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!AbstractC1474fG.b(((Q30) next).getName(), strB));
                q30 = (Q30) next;
                if (q30 == null) {
                    q31 = C1816io0.b;
                } else {
                    q31 = q30;
                }
            }
            String str2 = this.f291o;
            this.m = 3;
            obj = q31.h(str2, 1, this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
            c0594Lz.e = 1;
            C2771sg0 c2771sg3 = c0594Lz.c;
            C0413Ez c0413Ez3 = new C0413Ez((C2420oz) obj, true);
            this.m = 4;
            c2771sg3.l(c0413Ez3, this);
            if (c2985uq0 == enumC1706hi) {
                return enumC1706hi;
            }
            return c2985uq0;
        } catch (Throwable th) {
            C2771sg0 c2771sg4 = c0594Lz.c;
            C0335Bz c0335Bz = new C0335Bz(new Exception(th));
            this.m = 5;
            c2771sg4.l(c0335Bz, this);
            if (c2985uq0 == enumC1706hi) {
                return enumC1706hi;
            }
        }
    }
}
