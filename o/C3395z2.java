package o;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: o.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3395z2 implements Ge0 {
    @Override // o.Ge0
    public final boolean a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // o.Ge0
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : AbstractC1474fG.b(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // o.Ge0
    public final boolean c() {
        VY vy = VY.a;
        return C2743sL.t() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // o.Ge0
    public final void d(SSLSocket sSLSocket, String str, List list) throws IOException {
        AbstractC1474fG.j(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            VY vy = VY.a;
            sSLParameters.setApplicationProtocols((String[]) C2743sL.f(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
