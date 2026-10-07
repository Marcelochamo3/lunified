package o;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: renamed from: o.y9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3312y9 implements Ge0 {
    public static final C3215x9 a = new C3215x9();

    @Override // o.Ge0
    public final boolean a(SSLSocket sSLSocket) {
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // o.Ge0
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : AbstractC1474fG.b(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // o.Ge0
    public final boolean c() {
        boolean z = C3118w9.d;
        return C3118w9.d;
    }

    @Override // o.Ge0
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1474fG.j(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            VY vy = VY.a;
            parameters.setApplicationProtocols((String[]) C2743sL.f(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
