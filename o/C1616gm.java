package o;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: o.gm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1616gm implements Ge0 {
    public final InterfaceC1518fm a;
    public Ge0 b;

    public C1616gm(InterfaceC1518fm interfaceC1518fm) {
        this.a = interfaceC1518fm;
    }

    @Override // o.Ge0
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.a(sSLSocket);
    }

    @Override // o.Ge0
    public final String b(SSLSocket sSLSocket) {
        Ge0 ge0E = e(sSLSocket);
        if (ge0E != null) {
            return ge0E.b(sSLSocket);
        }
        return null;
    }

    @Override // o.Ge0
    public final boolean c() {
        return true;
    }

    @Override // o.Ge0
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1474fG.j(list, "protocols");
        Ge0 ge0E = e(sSLSocket);
        if (ge0E != null) {
            ge0E.d(sSLSocket, str, list);
        }
    }

    public final synchronized Ge0 e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.a(sSLSocket)) {
                this.b = this.a.c(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
