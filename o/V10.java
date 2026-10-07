package o;

import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class V10 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ Z10 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Ds0 f564o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V10(Z10 z10, Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = z10;
        this.f564o = ds0;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((V10) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new V10(this.n, this.f564o, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006a A[Catch: Exception -> 0x002b, CancellationException -> 0x002e, TryCatch #2 {CancellationException -> 0x002e, Exception -> 0x002b, blocks: (B:12:0x0026, B:17:0x0031, B:44:0x00a2, B:46:0x00ac, B:49:0x00c1, B:50:0x00c8, B:18:0x0036, B:27:0x005c, B:29:0x006a, B:41:0x0099, B:30:0x006d, B:31:0x0078, B:33:0x007e, B:37:0x0091, B:39:0x0095, B:24:0x0051), top: B:57:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:30:0x006d A[Catch: Exception -> 0x002b, CancellationException -> 0x002e, TryCatch #2 {CancellationException -> 0x002e, Exception -> 0x002b, blocks: (B:12:0x0026, B:17:0x0031, B:44:0x00a2, B:46:0x00ac, B:49:0x00c1, B:50:0x00c8, B:18:0x0036, B:27:0x005c, B:29:0x006a, B:41:0x0099, B:30:0x006d, B:31:0x0078, B:33:0x007e, B:37:0x0091, B:39:0x0095, B:24:0x0051), top: B:57:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:33:0x007e A[Catch: Exception -> 0x002b, CancellationException -> 0x002e, TryCatch #2 {CancellationException -> 0x002e, Exception -> 0x002b, blocks: (B:12:0x0026, B:17:0x0031, B:44:0x00a2, B:46:0x00ac, B:49:0x00c1, B:50:0x00c8, B:18:0x0036, B:27:0x005c, B:29:0x006a, B:41:0x0099, B:30:0x006d, B:31:0x0078, B:33:0x007e, B:37:0x0091, B:39:0x0095, B:24:0x0051), top: B:57:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0095 A[Catch: Exception -> 0x002b, CancellationException -> 0x002e, TryCatch #2 {CancellationException -> 0x002e, Exception -> 0x002b, blocks: (B:12:0x0026, B:17:0x0031, B:44:0x00a2, B:46:0x00ac, B:49:0x00c1, B:50:0x00c8, B:18:0x0036, B:27:0x005c, B:29:0x006a, B:41:0x0099, B:30:0x006d, B:31:0x0078, B:33:0x007e, B:37:0x0091, B:39:0x0095, B:24:0x0051), top: B:57:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ac A[Catch: Exception -> 0x002b, CancellationException -> 0x002e, TryCatch #2 {CancellationException -> 0x002e, Exception -> 0x002b, blocks: (B:12:0x0026, B:17:0x0031, B:44:0x00a2, B:46:0x00ac, B:49:0x00c1, B:50:0x00c8, B:18:0x0036, B:27:0x005c, B:29:0x006a, B:41:0x0099, B:30:0x006d, B:31:0x0078, B:33:0x007e, B:37:0x0091, B:39:0x0095, B:24:0x0051), top: B:57:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1 A[Catch: Exception -> 0x002b, CancellationException -> 0x002e, TryCatch #2 {CancellationException -> 0x002e, Exception -> 0x002b, blocks: (B:12:0x0026, B:17:0x0031, B:44:0x00a2, B:46:0x00ac, B:49:0x00c1, B:50:0x00c8, B:18:0x0036, B:27:0x005c, B:29:0x006a, B:41:0x0099, B:30:0x006d, B:31:0x0078, B:33:0x007e, B:37:0x0091, B:39:0x0095, B:24:0x0051), top: B:57:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0090 A[SYNTHETIC] */
    @Override // o.R7
    public final Object r(Object obj) {
        String strB;
        Iterator it;
        Object next;
        Q30 q30;
        Q30 q31;
        Js0 js0;
        I9 i9;
        N10 n10;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        Ds0 ds0 = this.f564o;
        Z10 z10 = this.n;
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
                    obj = q31.n(ds0, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    js0 = (Js0) obj;
                    if (js0.l.length() == 0) {
                        throw new Exception("No source found");
                    }
                    Z10.e(z10, js0);
                    i9 = z10.e;
                    n10 = new N10(js0, ds0, z10.g);
                    this.m = 4;
                    if (i9.e(n10, this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                } else if (i == 3) {
                    Jp0.O(obj);
                    js0 = (Js0) obj;
                    if (js0.l.length() == 0) {
                        throw new Exception("No source found");
                    }
                    Z10.e(z10, js0);
                    i9 = z10.e;
                    n10 = new N10(js0, ds0, z10.g);
                    this.m = 4;
                    if (i9.e(n10, this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                } else {
                    if (i != 4 && i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Jp0.O(obj);
                }
                return C2985uq0.a;
            }
            Jp0.O(obj);
            I9 i10 = z10.e;
            J10 j10 = new J10(ds0);
            this.m = 1;
            if (i10.e(j10, this) == enumC1706hi) {
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
            obj = q31.n(ds0, this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
            js0 = (Js0) obj;
            if (js0.l.length() == 0) {
                throw new Exception("No source found");
            }
            Z10.e(z10, js0);
            i9 = z10.e;
            n10 = new N10(js0, ds0, z10.g);
            this.m = 4;
            if (i9.e(n10, this) == enumC1706hi) {
                return enumC1706hi;
            }
            return C2985uq0.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Z10.f(z10, "video", e2);
            AbstractC1899jh0.U(z10.c, "xuper-", true);
            G10 g10 = new G10(e2, ds0);
            this.m = 5;
            if (z10.e.e(g10, this) == enumC1706hi) {
                return enumC1706hi;
            }
        }
    }
}
