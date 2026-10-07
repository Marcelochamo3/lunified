package o;

import java.io.IOException;

/* JADX INFO: renamed from: o.qr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2599qr {
    public final A50 a;
    public final C2691rp b;
    public final C2792sr c;
    public final InterfaceC2695rr d;
    public boolean e;
    public boolean f;
    public final C50 g;

    public C2599qr(A50 a50, C2691rp c2691rp, C2792sr c2792sr, InterfaceC2695rr interfaceC2695rr) {
        AbstractC1474fG.j(c2691rp, "eventListener");
        this.a = a50;
        this.b = c2691rp;
        this.c = c2792sr;
        this.d = interfaceC2695rr;
        this.g = interfaceC2695rr.h();
    }

    public final IOException a(boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        C2691rp c2691rp = this.b;
        A50 a50 = this.a;
        if (z2) {
            if (iOException != null) {
                c2691rp.getClass();
                AbstractC1474fG.j(a50, "call");
            } else {
                c2691rp.getClass();
                AbstractC1474fG.j(a50, "call");
            }
        }
        if (z) {
            if (iOException != null) {
                c2691rp.getClass();
                AbstractC1474fG.j(a50, "call");
            } else {
                c2691rp.getClass();
                AbstractC1474fG.j(a50, "call");
            }
        }
        return a50.k(this, z2, z, iOException);
    }

    public final E50 b(C1855j80 c1855j80) throws IOException {
        InterfaceC2695rr interfaceC2695rr = this.d;
        try {
            String strF = c1855j80.f("Content-Type", null);
            long jF = interfaceC2695rr.f(c1855j80);
            return new E50(strF, jF, Nr0.g(new C2502pr(this, interfaceC2695rr.e(c1855j80), jF)), 0);
        } catch (IOException e) {
            this.b.getClass();
            AbstractC1474fG.j(this.a, "call");
            d(e);
            throw e;
        }
    }

    public final C1661h80 c(boolean z) throws IOException {
        try {
            C1661h80 c1661h80G = this.d.g(z);
            if (c1661h80G != null) {
                c1661h80G.m = this;
            }
            return c1661h80G;
        } catch (IOException e) {
            this.b.getClass();
            AbstractC1474fG.j(this.a, "call");
            d(e);
            throw e;
        }
    }

    public final void d(IOException iOException) {
        this.f = true;
        this.c.c(iOException);
        C50 c50H = this.d.h();
        A50 a50 = this.a;
        synchronized (c50H) {
            try {
                AbstractC1474fG.j(a50, "call");
                if (iOException instanceof Gg0) {
                    if (((Gg0) iOException).l == 8) {
                        int i = c50H.n + 1;
                        c50H.n = i;
                        if (i > 1) {
                            c50H.j = true;
                            c50H.l++;
                        }
                    } else if (((Gg0) iOException).l != 9 || !a50.A) {
                        c50H.j = true;
                        c50H.l++;
                    }
                } else if (c50H.g == null || (iOException instanceof C2577qg)) {
                    c50H.j = true;
                    if (c50H.m == 0) {
                        C50.d(a50.l, c50H.b, iOException);
                        c50H.l++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
