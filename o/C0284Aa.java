package o;

import io.sentry.C0032c;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: o.Aa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0284Aa {
    public static final String k;
    public static final String l;
    public final C2446pE a;
    public final C2152mB b;
    public final String c;
    public final O30 d;
    public final int e;
    public final String f;
    public final C2152mB g;
    public final C1469fB h;
    public final long i;
    public final long j;

    static {
        VY vy = VY.a;
        VY.a.getClass();
        k = "OkHttp-Sent-Millis";
        VY.a.getClass();
        l = "OkHttp-Received-Millis";
    }

    public C0284Aa(InterfaceC2091lf0 interfaceC2091lf0) {
        C2446pE c2446pEB;
        AbstractC1474fG.j(interfaceC2091lf0, "rawSource");
        try {
            C3111w50 c3111w50G = Nr0.g(interfaceC2091lf0);
            String strI = c3111w50G.I(Long.MAX_VALUE);
            try {
                C2349oE c2349oE = new C2349oE();
                c2349oE.g(null, strI);
                c2446pEB = c2349oE.b();
            } catch (IllegalArgumentException unused) {
                c2446pEB = null;
            }
            if (c2446pEB == null) {
                IOException iOException = new IOException("Cache corruption for ".concat(strI));
                VY vy = VY.a;
                VY.a.getClass();
                VY.i(5, "cache corruption", iOException);
                throw iOException;
            }
            this.a = c2446pEB;
            this.c = c3111w50G.I(Long.MAX_VALUE);
            C2112lq c2112lq = new C2112lq(1);
            int iT = AP.t(c3111w50G);
            for (int i = 0; i < iT; i++) {
                c2112lq.b(c3111w50G.I(Long.MAX_VALUE));
            }
            this.b = c2112lq.f();
            C2613qy c2613qyT = Ou0.t(c3111w50G.I(Long.MAX_VALUE));
            this.d = (O30) c2613qyT.n;
            this.e = c2613qyT.m;
            this.f = (String) c2613qyT.f996o;
            C2112lq c2112lq2 = new C2112lq(1);
            int iT2 = AP.t(c3111w50G);
            for (int i2 = 0; i2 < iT2; i2++) {
                c2112lq2.b(c3111w50G.I(Long.MAX_VALUE));
            }
            String str = k;
            String strG = c2112lq2.g(str);
            String str2 = l;
            String strG2 = c2112lq2.g(str2);
            c2112lq2.n(str);
            c2112lq2.n(str2);
            this.i = strG != null ? Long.parseLong(strG) : 0L;
            this.j = strG2 != null ? Long.parseLong(strG2) : 0L;
            this.g = c2112lq2.f();
            if (AbstractC1474fG.b(this.a.a, "https")) {
                String strI2 = c3111w50G.I(Long.MAX_VALUE);
                if (strI2.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + strI2 + '\"');
                }
                this.h = new C1469fB(!c3111w50G.D() ? Sr0.h(c3111w50G.I(Long.MAX_VALUE)) : Xj0.SSL_3_0, C0676Pd.b.D(c3111w50G.I(Long.MAX_VALUE)), Mr0.x(a(c3111w50G)), new C1371eB(0, Mr0.x(a(c3111w50G))));
            } else {
                this.h = null;
            }
            AbstractC3409z9.g(interfaceC2091lf0, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3409z9.g(interfaceC2091lf0, th);
                throw th2;
            }
        }
    }

    public static List a(C3111w50 c3111w50) throws IOException {
        int iT = AP.t(c3111w50);
        if (iT == -1) {
            return C1233cq.l;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(iT);
            for (int i = 0; i < iT; i++) {
                String strI = c3111w50.I(Long.MAX_VALUE);
                E9 e9 = new E9();
                C2468pa c2468pa = C2468pa.f972o;
                C2468pa c2468paR = C2691rp.r(strI);
                if (c2468paR == null) {
                    throw new IOException("Corrupt certificate in cache entry");
                }
                e9.c0(c2468paR);
                arrayList.add(certificateFactory.generateCertificate(new C9(e9, 0)));
            }
            return arrayList;
        } catch (CertificateException e) {
            throw new IOException(e.getMessage());
        }
    }

    public static void b(C3014v50 c3014v50, List list) throws IOException {
        try {
            c3014v50.O(list.size());
            c3014v50.F(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] encoded = ((Certificate) it.next()).getEncoded();
                C2468pa c2468pa = C2468pa.f972o;
                AbstractC1474fG.i(encoded, "bytes");
                c3014v50.N(C2691rp.y(encoded).a());
                c3014v50.F(10);
            }
        } catch (CertificateEncodingException e) {
            throw new IOException(e.getMessage());
        }
    }

    public final void c(C0032c c0032c) {
        C2446pE c2446pE = this.a;
        C1469fB c1469fB = this.h;
        C2152mB c2152mB = this.g;
        C2152mB c2152mB2 = this.b;
        C3014v50 c3014v50F = Nr0.f(c0032c.r(0));
        try {
            c3014v50F.N(c2446pE.i);
            c3014v50F.F(10);
            c3014v50F.N(this.c);
            c3014v50F.F(10);
            c3014v50F.O(c2152mB2.size());
            c3014v50F.F(10);
            int size = c2152mB2.size();
            for (int i = 0; i < size; i++) {
                c3014v50F.N(c2152mB2.d(i));
                c3014v50F.N(": ");
                c3014v50F.N(c2152mB2.h(i));
                c3014v50F.F(10);
            }
            O30 o30 = this.d;
            int i2 = this.e;
            String str = this.f;
            AbstractC1474fG.j(o30, "protocol");
            AbstractC1474fG.j(str, "message");
            StringBuilder sb = new StringBuilder();
            if (o30 == O30.HTTP_1_0) {
                sb.append("HTTP/1.0");
            } else {
                sb.append("HTTP/1.1");
            }
            sb.append(' ');
            sb.append(i2);
            sb.append(' ');
            sb.append(str);
            String string = sb.toString();
            AbstractC1474fG.i(string, "StringBuilder().apply(builderAction).toString()");
            c3014v50F.N(string);
            c3014v50F.F(10);
            c3014v50F.O(c2152mB.size() + 2);
            c3014v50F.F(10);
            int size2 = c2152mB.size();
            for (int i3 = 0; i3 < size2; i3++) {
                c3014v50F.N(c2152mB.d(i3));
                c3014v50F.N(": ");
                c3014v50F.N(c2152mB.h(i3));
                c3014v50F.F(10);
            }
            c3014v50F.N(k);
            c3014v50F.N(": ");
            c3014v50F.O(this.i);
            c3014v50F.F(10);
            c3014v50F.N(l);
            c3014v50F.N(": ");
            c3014v50F.O(this.j);
            c3014v50F.F(10);
            if (AbstractC1474fG.b(c2446pE.a, "https")) {
                c3014v50F.F(10);
                AbstractC1474fG.g(c1469fB);
                c3014v50F.N(c1469fB.b.a);
                c3014v50F.F(10);
                b(c3014v50F, c1469fB.a());
                b(c3014v50F, c1469fB.c);
                c3014v50F.N(c1469fB.a.l);
                c3014v50F.F(10);
            }
            AbstractC3409z9.g(c3014v50F, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3409z9.g(c3014v50F, th);
                throw th2;
            }
        }
    }

    public C0284Aa(C1855j80 c1855j80) {
        C2152mB c2152mB;
        C1951k70 c1951k70 = c1855j80.l;
        this.a = c1951k70.a;
        C1855j80 c1855j81 = c1855j80.s;
        AbstractC1474fG.g(c1855j81);
        C2152mB c2152mB2 = c1855j81.l.c;
        C2152mB c2152mB3 = c1855j80.q;
        Set setY = AP.y(c2152mB3);
        if (setY.isEmpty()) {
            c2152mB = Mr0.b;
        } else {
            ArrayList arrayList = new ArrayList(20);
            int size = c2152mB2.size();
            for (int i = 0; i < size; i++) {
                String strD = c2152mB2.d(i);
                if (setY.contains(strD)) {
                    String strH = c2152mB2.h(i);
                    AbstractC1474fG.j(strD, "name");
                    AbstractC1474fG.j(strH, "value");
                    AbstractC1468fA.c(strD);
                    AbstractC1468fA.e(strH, strD);
                    arrayList.add(strD);
                    arrayList.add(AbstractC1119bh0.E0(strH).toString());
                }
            }
            c2152mB = new C2152mB((String[]) arrayList.toArray(new String[0]));
        }
        this.b = c2152mB;
        this.c = c1951k70.b;
        this.d = c1855j80.m;
        this.e = c1855j80.f840o;
        this.f = c1855j80.n;
        this.g = c2152mB3;
        this.h = c1855j80.p;
        this.i = c1855j80.v;
        this.j = c1855j80.w;
    }
}
