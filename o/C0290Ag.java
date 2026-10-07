package o;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: o.Ag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0290Ag implements Ge0 {
    public static final C3449zg a = new C3449zg();

    @Override // o.Ge0
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // o.Ge0
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // o.Ge0
    public final boolean c() {
        boolean z = C3352yg.d;
        return C3352yg.d;
    }

    @Override // o.Ge0
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1474fG.j(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            VY vy = VY.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C2743sL.f(list).toArray(new String[0]));
        }
    }
}
