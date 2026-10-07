package o;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class H2 extends VY {
    public static final boolean e;
    public final ArrayList c;
    public final C0522Je d;

    static {
        boolean z = false;
        if (C2743sL.t() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        e = z;
    }

    public H2() throws NoSuchMethodException {
        C1800ig0 c1800ig0;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            c1800ig0 = new C1800ig0(cls);
        } catch (Exception e2) {
            VY.a.getClass();
            VY.i(5, "unable to load android socket classes", e2);
            c1800ig0 = null;
        }
        ArrayList arrayListP = X5.P(new Ge0[]{c1800ig0, new C1616gm(K2.f), new C1616gm(C0290Ag.a), new C1616gm(C3312y9.a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListP) {
            if (((Ge0) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method = cls2.getMethod("open", String.class);
            method2 = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.d = new C0522Je(method3, method, method2);
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
    public final Tm0 c(X509TrustManager x509TrustManager) {
        AbstractC1474fG.j(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new G2(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
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
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        AbstractC1474fG.j(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
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
    public final Object g() {
        C0522Je c0522Je = this.d;
        c0522Je.getClass();
        Method method = c0522Je.a;
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(null, null);
            Method method2 = c0522Je.b;
            AbstractC1474fG.g(method2);
            method2.invoke(objInvoke, "response.body().close()");
            return objInvoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // o.VY
    public final boolean h(String str) {
        AbstractC1474fG.j(str, "hostname");
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        if (i >= 23) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
        return true;
    }

    @Override // o.VY
    public final void k(Object obj, String str) {
        AbstractC1474fG.j(str, "message");
        C0522Je c0522Je = this.d;
        c0522Je.getClass();
        if (obj != null) {
            try {
                Method method = c0522Je.c;
                AbstractC1474fG.g(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        VY.j(this, str, 5, 4);
    }
}
