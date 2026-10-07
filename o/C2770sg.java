package o;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: o.sg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2770sg {
    public static final C2770sg e;
    public static final C2770sg f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        C0676Pd c0676Pd = C0676Pd.r;
        C0676Pd c0676Pd2 = C0676Pd.s;
        C0676Pd c0676Pd3 = C0676Pd.t;
        C0676Pd c0676Pd4 = C0676Pd.l;
        C0676Pd c0676Pd5 = C0676Pd.n;
        C0676Pd c0676Pd6 = C0676Pd.m;
        C0676Pd c0676Pd7 = C0676Pd.f458o;
        C0676Pd c0676Pd8 = C0676Pd.q;
        C0676Pd c0676Pd9 = C0676Pd.p;
        C0676Pd[] c0676PdArr = {c0676Pd, c0676Pd2, c0676Pd3, c0676Pd4, c0676Pd5, c0676Pd6, c0676Pd7, c0676Pd8, c0676Pd9, C0676Pd.j, C0676Pd.k, C0676Pd.h, C0676Pd.i, C0676Pd.f, C0676Pd.g, C0676Pd.e};
        C2673rg c2673rg = new C2673rg();
        c2673rg.c((C0676Pd[]) Arrays.copyOf(new C0676Pd[]{c0676Pd, c0676Pd2, c0676Pd3, c0676Pd4, c0676Pd5, c0676Pd6, c0676Pd7, c0676Pd8, c0676Pd9}, 9));
        Xj0 xj0 = Xj0.TLS_1_3;
        Xj0 xj1 = Xj0.TLS_1_2;
        c2673rg.f(xj0, xj1);
        c2673rg.d();
        c2673rg.a();
        C2673rg c2673rg2 = new C2673rg();
        c2673rg2.c((C0676Pd[]) Arrays.copyOf(c0676PdArr, 16));
        c2673rg2.f(xj0, xj1);
        c2673rg2.d();
        e = c2673rg2.a();
        C2673rg c2673rg3 = new C2673rg();
        c2673rg3.c((C0676Pd[]) Arrays.copyOf(c0676PdArr, 16));
        c2673rg3.f(xj0, xj1, Xj0.TLS_1_1, Xj0.TLS_1_0);
        c2673rg3.d();
        c2673rg3.a();
        f = new C2770sg(false, false, null, null);
    }

    public C2770sg(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C0676Pd.b.D(str));
        }
        return AbstractC0911Ye.x0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !Mr0.j(strArr, sSLSocket.getEnabledProtocols(), C3236xT.m)) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || Mr0.j(strArr2, sSLSocket.getEnabledCipherSuites(), C0676Pd.c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(Sr0.h(str));
        }
        return AbstractC0911Ye.x0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2770sg)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C2770sg c2770sg = (C2770sg) obj;
        boolean z = c2770sg.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        return !z2 || (Arrays.equals(this.c, c2770sg.c) && Arrays.equals(this.d, c2770sg.d) && this.b == c2770sg.b);
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.b + ')';
    }
}
