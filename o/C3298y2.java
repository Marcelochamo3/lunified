package o;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: o.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3298y2 extends VY {
    public static final boolean d;
    public final ArrayList c;

    static {
        d = C2743sL.t() && Build.VERSION.SDK_INT >= 29;
    }

    public C3298y2() {
        ArrayList arrayListP = X5.P(new Ge0[]{(!C2743sL.t() || Build.VERSION.SDK_INT < 29) ? null : new C3395z2(), new C1616gm(K2.f), new C1616gm(C0290Ag.a), new C1616gm(C3312y9.a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListP) {
            if (((Ge0) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
    }

    @Override // o.VY
    public final AbstractC1923jt0 b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        AbstractC1474fG.j(x509TrustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        A2 a2 = x509TrustManagerExtensions != null ? new A2(x509TrustManager, x509TrustManagerExtensions) : null;
        return a2 != null ? a2 : super.b(x509TrustManager);
    }

    @Override // o.VY
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        AbstractC1474fG.j(list, "protocols");
        Iterator it = this.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((Ge0) next).a(sSLSocket));
        Ge0 ge0 = (Ge0) next;
        if (ge0 != null) {
            ge0.d(sSLSocket, str, list);
        }
    }

    @Override // o.VY
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((Ge0) next).a(sSLSocket));
        Ge0 ge0 = (Ge0) next;
        if (ge0 != null) {
            return ge0.b(sSLSocket);
        }
        return null;
    }

    @Override // o.VY
    public final boolean h(String str) {
        AbstractC1474fG.j(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
