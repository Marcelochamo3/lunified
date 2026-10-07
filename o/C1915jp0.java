package o;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.jp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1915jp0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ C2111lp0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1915jp0(C2111lp0 c2111lp0, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = c2111lp0;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1915jp0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1915jp0(this.n, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0026, B:15:0x002e, B:42:0x009a, B:16:0x0032, B:25:0x0054, B:27:0x0062, B:39:0x0091, B:28:0x0065, B:29:0x0070, B:31:0x0076, B:35:0x0089, B:37:0x008d, B:22:0x0049), top: B:49:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0065 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0026, B:15:0x002e, B:42:0x009a, B:16:0x0032, B:25:0x0054, B:27:0x0062, B:39:0x0091, B:28:0x0065, B:29:0x0070, B:31:0x0076, B:35:0x0089, B:37:0x008d, B:22:0x0049), top: B:49:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0076 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0026, B:15:0x002e, B:42:0x009a, B:16:0x0032, B:25:0x0054, B:27:0x0062, B:39:0x0091, B:28:0x0065, B:29:0x0070, B:31:0x0076, B:35:0x0089, B:37:0x008d, B:22:0x0049), top: B:49:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008d A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:12:0x0026, B:15:0x002e, B:42:0x009a, B:16:0x0032, B:25:0x0054, B:27:0x0062, B:39:0x0091, B:28:0x0065, B:29:0x0070, B:31:0x0076, B:35:0x0089, B:37:0x008d, B:22:0x0049), top: B:49:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0090  */
    /* JADX WARN: Code duplicated, block: B:41:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x0088 A[SYNTHETIC] */
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
        C2111lp0 c2111lp0 = this.n;
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
                    this.m = 3;
                    obj = q31.d(1, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    c2111lp0.d = 1;
                    C2771sg0 c2771sg0 = c2111lp0.b;
                    C1721hp0 c1721hp0 = new C1721hp0((List) obj, true);
                    this.m = 4;
                    c2771sg0.l(c1721hp0, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                } else if (i == 3) {
                    Jp0.O(obj);
                    c2111lp0.d = 1;
                    C2771sg0 c2771sg1 = c2111lp0.b;
                    C1721hp0 c1721hp1 = new C1721hp0((List) obj, true);
                    this.m = 4;
                    c2771sg1.l(c1721hp1, this);
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
            C2771sg0 c2771sg2 = c2111lp0.b;
            C1525fp0 c1525fp0 = C1525fp0.a;
            this.m = 1;
            c2771sg2.l(c1525fp0, this);
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
            this.m = 3;
            obj = q31.d(1, this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
            c2111lp0.d = 1;
            C2771sg0 c2771sg3 = c2111lp0.b;
            C1721hp0 c1721hp2 = new C1721hp0((List) obj, true);
            this.m = 4;
            c2771sg3.l(c1721hp2, this);
            if (c2985uq0 == enumC1706hi) {
                return enumC1706hi;
            }
            return c2985uq0;
        } catch (Exception e) {
            C2771sg0 c2771sg4 = c2111lp0.b;
            C1427ep0 c1427ep0 = new C1427ep0(e);
            this.m = 5;
            c2771sg4.l(c1427ep0, this);
            if (c2985uq0 == enumC1706hi) {
                return enumC1706hi;
            }
        }
    }
}
