package o;

import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: renamed from: o.x9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3215x9 implements InterfaceC1518fm {
    @Override // o.InterfaceC1518fm
    public final boolean a(SSLSocket sSLSocket) {
        boolean z = C3118w9.d;
        return AbstractC3021v9.t() && (sSLSocket instanceof BCSSLSocket);
    }

    @Override // o.InterfaceC1518fm
    public final Ge0 c(SSLSocket sSLSocket) {
        return new C3312y9();
    }
}
