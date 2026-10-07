package o;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class MV implements InterfaceC0621Na {
    public final C3212x70 l;
    public final Object m;
    public final Object[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC0595Ma f395o;
    public final InterfaceC0602Mh p;
    public volatile boolean q;
    public A50 r;
    public Throwable s;
    public boolean t;

    public MV(C3212x70 c3212x70, Object obj, Object[] objArr, InterfaceC0595Ma interfaceC0595Ma, InterfaceC0602Mh interfaceC0602Mh) {
        this.l = c3212x70;
        this.m = obj;
        this.n = objArr;
        this.f395o = interfaceC0595Ma;
        this.p = interfaceC0602Mh;
    }

    @Override // o.InterfaceC0621Na
    public final InterfaceC0621Na a() {
        return new MV(this.l, this.m, this.n, this.f395o, this.p);
    }

    public final A50 b() {
        C2446pE c2446pEJ;
        C3212x70 c3212x70 = this.l;
        c3212x70.getClass();
        Object[] objArr = this.n;
        int length = objArr.length;
        Pu0[] pu0Arr = c3212x70.k;
        if (length != pu0Arr.length) {
            throw new IllegalArgumentException(AbstractC1701hf0.g(AbstractC1674hK.r("Argument count (", length, ") doesn't match expected count ("), pu0Arr.length, ")"));
        }
        C2534q70 c2534q70 = new C2534q70(c3212x70.d, c3212x70.c, c3212x70.e, c3212x70.f, c3212x70.g, c3212x70.h, c3212x70.i, c3212x70.j);
        if (c3212x70.l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            pu0Arr[i].a(c2534q70, objArr[i]);
        }
        C2349oE c2349oE = c2534q70.d;
        if (c2349oE != null) {
            c2446pEJ = c2349oE.b();
        } else {
            String str = c2534q70.c;
            C2446pE c2446pE = c2534q70.b;
            c2446pEJ = c2446pE.j(str);
            if (c2446pEJ == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + c2446pE + ", Relative: " + c2534q70.c);
            }
        }
        AbstractC2340o70 c2146m70 = c2534q70.k;
        if (c2146m70 == null) {
            Na0 na0 = c2534q70.j;
            if (na0 != null) {
                c2146m70 = new C0540Jw((ArrayList) na0.n, (ArrayList) na0.f414o);
            } else {
                RN rn = c2534q70.i;
                if (rn != null) {
                    ArrayList arrayList2 = (ArrayList) rn.f488o;
                    if (!(!arrayList2.isEmpty())) {
                        throw new IllegalStateException("Multipart body must have at least one part.".toString());
                    }
                    c2146m70 = new RS((C2468pa) rn.m, (TP) rn.n, Mr0.x(arrayList2));
                } else if (c2534q70.h) {
                    c2146m70 = C2743sL.o(null, new byte[0]);
                }
            }
        }
        TP tp = c2534q70.g;
        C2112lq c2112lq = c2534q70.f;
        if (tp != null) {
            if (c2146m70 != null) {
                c2146m70 = new C2146m70(c2146m70, tp);
            } else {
                c2112lq.a("Content-Type", tp.a);
            }
        }
        C0560Kq c0560Kq = c2534q70.e;
        c0560Kq.getClass();
        c0560Kq.m = c2446pEJ;
        c0560Kq.f370o = c2112lq.f().f();
        c0560Kq.m(c2534q70.a, c2146m70);
        c0560Kq.r(C2448pG.class, new C2448pG(c3212x70.a, this.m, c3212x70.b, arrayList));
        return ((OV) this.f395o).c(c0560Kq.c());
    }

    public final A50 c() throws IOException {
        A50 a50 = this.r;
        if (a50 != null) {
            return a50;
        }
        Throwable th = this.s;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            A50 a50B = b();
            this.r = a50B;
            return a50B;
        } catch (IOException | Error | RuntimeException e) {
            UK.U(e);
            this.s = e;
            throw e;
        }
    }

    @Override // o.InterfaceC0621Na
    public final void cancel() {
        A50 a50;
        this.q = true;
        synchronized (this) {
            a50 = this.r;
        }
        if (a50 != null) {
            a50.cancel();
        }
    }

    public final Object clone() {
        return new MV(this.l, this.m, this.n, this.f395o, this.p);
    }

    public final C1759i80 d(C1855j80 c1855j80) throws IOException {
        C1661h80 c1661h80Q = c1855j80.q();
        AbstractC2051l80 abstractC2051l80 = c1855j80.r;
        c1661h80Q.g = new LV(abstractC2051l80.l(), abstractC2051l80.i());
        C1855j80 c1855j80A = c1661h80Q.a();
        int i = c1855j80A.f840o;
        if (i < 200 || i >= 300) {
            try {
                abstractC2051l80.p().u(new E9());
                abstractC2051l80.l();
                abstractC2051l80.i();
                if (c1855j80A.p()) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                C1759i80 c1759i80 = new C1759i80(c1855j80A, null);
                abstractC2051l80.close();
                return c1759i80;
            } catch (Throwable th) {
                abstractC2051l80.close();
                throw th;
            }
        }
        if (i == 204 || i == 205) {
            abstractC2051l80.close();
            if (c1855j80A.p()) {
                return new C1759i80(c1855j80A, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        KV kv = new KV(abstractC2051l80);
        try {
            Object objL = this.p.l(kv);
            if (c1855j80A.p()) {
                return new C1759i80(c1855j80A, objL);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e) {
            IOException iOException = kv.f361o;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    @Override // o.InterfaceC0621Na
    public final void f(InterfaceC0777Ta interfaceC0777Ta) {
        A50 a50;
        Throwable th;
        synchronized (this) {
            try {
                if (this.t) {
                    throw new IllegalStateException("Already executed.");
                }
                this.t = true;
                a50 = this.r;
                th = this.s;
                if (a50 == null && th == null) {
                    try {
                        A50 a50B = b();
                        this.r = a50B;
                        a50 = a50B;
                    } catch (Throwable th2) {
                        th = th2;
                        UK.U(th);
                        this.s = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            interfaceC0777Ta.w(this, th);
            return;
        }
        if (this.q) {
            a50.cancel();
        }
        a50.e(new C2994uv(this, interfaceC0777Ta, 17, false));
    }

    @Override // o.InterfaceC0621Na
    public final synchronized C1951k70 i() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return c().m;
    }

    @Override // o.InterfaceC0621Na
    public final boolean l() {
        boolean z = true;
        if (this.q) {
            return true;
        }
        synchronized (this) {
            A50 a50 = this.r;
            if (a50 == null || !a50.A) {
                z = false;
            }
        }
        return z;
    }
}
