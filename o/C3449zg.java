package o;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: o.zg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3449zg implements InterfaceC1518fm {
    @Override // o.InterfaceC1518fm
    public final boolean a(SSLSocket sSLSocket) {
        boolean z = C3352yg.d;
        return AbstractC3158wg.b() && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // o.InterfaceC1518fm
    public final Ge0 c(SSLSocket sSLSocket) {
        return new C0290Ag();
    }
}
