package o;

/* JADX INFO: loaded from: classes.dex */
public final class A20 extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A20(String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((A20) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new A20(this.m, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0070 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:4:0x002e, B:8:0x0038, B:10:0x003c, B:16:0x0048, B:19:0x005d, B:21:0x0065, B:27:0x0070, B:28:0x0085, B:30:0x008b, B:34:0x009a), top: B:43:0x002e, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x008b A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:4:0x002e, B:8:0x0038, B:10:0x003c, B:16:0x0048, B:19:0x005d, B:21:0x0065, B:27:0x0070, B:28:0x0085, B:30:0x008b, B:34:0x009a), top: B:43:0x002e, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0099 A[SYNTHETIC] */
    @Override // o.R7
    public final Object r(Object obj) {
        C1634gv c1634gv;
        Object next;
        String strB;
        Jp0.O(obj);
        try {
            C0560Kq c0560Kq = new C0560Kq();
            c0560Kq.u(this.m);
            c0560Kq.j("Referer", C20.b.r());
            c0560Kq.j("User-Agent", "Mozilla/5.0 (Linux; Android 13; Pixel 7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Mobile Safari/537.36");
            C1855j80 c1855j80G = C20.c.c(c0560Kq.c()).g();
            try {
                if (!c1855j80G.p()) {
                    AbstractC3409z9.g(c1855j80G, null);
                    return null;
                }
                AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
                String strQ = abstractC2051l80 != null ? abstractC2051l80.q() : null;
                if (strQ == null) {
                    strQ = "";
                }
                C3176wp c3176wpX = RN.z(strQ, c1855j80G.l.a.i).X("iframe[src]");
                if (c3176wpX == null || (strB = c3176wpX.b("src")) == null) {
                    c1634gv = new C1634gv(Vb0.N(AbstractC0911Ye.U(C20.e), new C5(strQ, 7)));
                    do {
                        if (c1634gv.hasNext()) {
                            next = null;
                            break;
                        }
                        next = c1634gv.next();
                    } while (!AbstractC1899jh0.U((String) next, "http", false));
                    strB = (String) next;
                } else {
                    if (!AbstractC1899jh0.U(strB, "http", false)) {
                        strB = null;
                    }
                    if (strB == null) {
                        c1634gv = new C1634gv(Vb0.N(AbstractC0911Ye.U(C20.e), new C5(strQ, 7)));
                        do {
                            if (c1634gv.hasNext()) {
                                next = null;
                                break;
                            }
                            next = c1634gv.next();
                        } while (!AbstractC1899jh0.U((String) next, "http", false));
                        strB = (String) next;
                    }
                }
                AbstractC3409z9.g(c1855j80G, null);
                return strB;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3409z9.g(c1855j80G, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            return null;
        }
        return null;
    }
}
