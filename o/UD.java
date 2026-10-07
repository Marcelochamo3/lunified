package o;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class UD implements InterfaceC2695rr {
    public static final List g = Mr0.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = Mr0.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final C50 a;
    public final D50 b;
    public final TD c;
    public volatile C0984aE d;
    public final O30 e;
    public volatile boolean f;

    public UD(OV ov, C50 c50, D50 d50, TD td) {
        AbstractC1474fG.j(c50, "connection");
        this.a = c50;
        this.b = d50;
        this.c = td;
        O30 o30 = O30.H2_PRIOR_KNOWLEDGE;
        this.e = ov.E.contains(o30) ? o30 : O30.HTTP_2;
    }

    @Override // o.InterfaceC2695rr
    public final void a() {
        C0984aE c0984aE = this.d;
        AbstractC1474fG.g(c0984aE);
        c0984aE.g().close();
    }

    @Override // o.InterfaceC2695rr
    public final void b() {
        this.c.flush();
    }

    @Override // o.InterfaceC2695rr
    public final InterfaceC1991ke0 c(C1951k70 c1951k70, long j) {
        C0984aE c0984aE = this.d;
        AbstractC1474fG.g(c0984aE);
        return c0984aE.g();
    }

    @Override // o.InterfaceC2695rr
    public final void cancel() {
        this.f = true;
        C0984aE c0984aE = this.d;
        if (c0984aE != null) {
            c0984aE.e(9);
        }
    }

    @Override // o.InterfaceC2695rr
    public final void d(C1951k70 c1951k70) throws IOException {
        int i;
        C0984aE c0984aE;
        if (this.d != null) {
            return;
        }
        boolean z = true;
        boolean z2 = c1951k70.d != null;
        C2152mB c2152mB = c1951k70.c;
        ArrayList arrayList = new ArrayList(c2152mB.size() + 4);
        arrayList.add(new C1957kB(c1951k70.b, C1957kB.f));
        C2468pa c2468pa = C1957kB.g;
        C2446pE c2446pE = c1951k70.a;
        AbstractC1474fG.j(c2446pE, "url");
        String strB = c2446pE.b();
        String strD = c2446pE.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new C1957kB(strB, c2468pa));
        String strA = c1951k70.c.a("Host");
        if (strA != null) {
            arrayList.add(new C1957kB(strA, C1957kB.i));
        }
        arrayList.add(new C1957kB(c2446pE.a, C1957kB.h));
        int size = c2152mB.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strD2 = c2152mB.d(i2);
            Locale locale = Locale.US;
            String strI = AbstractC1701hf0.i(locale, "US", strD2, locale, "this as java.lang.String).toLowerCase(locale)");
            if (!g.contains(strI) || (AbstractC1474fG.b(strI, "te") && AbstractC1474fG.b(c2152mB.h(i2), "trailers"))) {
                arrayList.add(new C1957kB(strI, c2152mB.h(i2)));
            }
        }
        TD td = this.c;
        td.getClass();
        boolean z3 = !z2;
        synchronized (td.J) {
            synchronized (td) {
                try {
                    if (td.q > 1073741823) {
                        td.q(8);
                    }
                    if (td.r) {
                        throw new C2577qg();
                    }
                    i = td.q;
                    td.q = i + 2;
                    c0984aE = new C0984aE(i, td, z3, false, null);
                    if (z2 && td.G < td.H && c0984aE.e < c0984aE.f) {
                        z = false;
                    }
                    if (c0984aE.i()) {
                        td.n.put(Integer.valueOf(i), c0984aE);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            td.J.p(z3, i, arrayList);
        }
        if (z) {
            td.J.flush();
        }
        this.d = c0984aE;
        if (this.f) {
            C0984aE c0984aE2 = this.d;
            AbstractC1474fG.g(c0984aE2);
            c0984aE2.e(9);
            throw new IOException("Canceled");
        }
        C0984aE c0984aE3 = this.d;
        AbstractC1474fG.g(c0984aE3);
        ZD zd = c0984aE3.k;
        long j = this.b.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zd.g(j, timeUnit);
        C0984aE c0984aE4 = this.d;
        AbstractC1474fG.g(c0984aE4);
        c0984aE4.l.g(this.b.h, timeUnit);
    }

    @Override // o.InterfaceC2695rr
    public final InterfaceC2091lf0 e(C1855j80 c1855j80) {
        C0984aE c0984aE = this.d;
        AbstractC1474fG.g(c0984aE);
        return c0984aE.i;
    }

    @Override // o.InterfaceC2695rr
    public final long f(C1855j80 c1855j80) {
        if (AbstractC1960kE.a(c1855j80)) {
            return Mr0.k(c1855j80);
        }
        return 0L;
    }

    @Override // o.InterfaceC2695rr
    public final C1661h80 g(boolean z) throws IOException {
        C2152mB c2152mB;
        C0984aE c0984aE = this.d;
        if (c0984aE == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (c0984aE) {
            c0984aE.k.h();
            while (c0984aE.g.isEmpty() && c0984aE.m == 0) {
                try {
                    c0984aE.l();
                } catch (Throwable th) {
                    c0984aE.k.l();
                    throw th;
                }
            }
            c0984aE.k.l();
            if (!(!c0984aE.g.isEmpty())) {
                IOException iOException = c0984aE.n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = c0984aE.m;
                AbstractC1701hf0.p(i);
                throw new Gg0(i);
            }
            Object objRemoveFirst = c0984aE.g.removeFirst();
            AbstractC1474fG.i(objRemoveFirst, "headersQueue.removeFirst()");
            c2152mB = (C2152mB) objRemoveFirst;
        }
        O30 o30 = this.e;
        AbstractC1474fG.j(o30, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = c2152mB.size();
        C2613qy c2613qyT = null;
        for (int i2 = 0; i2 < size; i2++) {
            String strD = c2152mB.d(i2);
            String strH = c2152mB.h(i2);
            if (AbstractC1474fG.b(strD, ":status")) {
                c2613qyT = Ou0.t("HTTP/1.1 " + strH);
            } else if (!h.contains(strD)) {
                AbstractC1474fG.j(strD, "name");
                AbstractC1474fG.j(strH, "value");
                arrayList.add(strD);
                arrayList.add(AbstractC1119bh0.E0(strH).toString());
            }
        }
        if (c2613qyT == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        C1661h80 c1661h80 = new C1661h80();
        c1661h80.b = o30;
        c1661h80.c = c2613qyT.m;
        String str = (String) c2613qyT.f996o;
        AbstractC1474fG.j(str, "message");
        c1661h80.d = str;
        c1661h80.c(new C2152mB((String[]) arrayList.toArray(new String[0])));
        if (z && c1661h80.c == 100) {
            return null;
        }
        return c1661h80;
    }

    @Override // o.InterfaceC2695rr
    public final C50 h() {
        return this.a;
    }
}
