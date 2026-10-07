package o;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: o.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1545g extends H50 {
    private byte[] r;

    public C1545g() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) {
        this.r = fl0.q(2);
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) {
        this.r = c0474Hi.f(16);
    }

    @Override // o.H50
    public String I() {
        try {
            InetAddress byAddress = InetAddress.getByAddress(null, this.r);
            if (byAddress.getAddress().length != 4) {
                return byAddress.getHostAddress();
            }
            return "::ffff:" + byAddress.getHostAddress();
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        c0578Li.i(this.r);
    }

    public InetAddress U() {
        try {
            C2848tT c2848tT = this.l;
            return c2848tT == null ? InetAddress.getByAddress(this.r) : InetAddress.getByAddress(c2848tT.toString(), this.r);
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    public C1545g(C2848tT c2848tT, int i, long j, InetAddress inetAddress) {
        super(c2848tT, 28, i, j);
        if (C1062b2.c(inetAddress) != 1 && C1062b2.c(inetAddress) != 2) {
            throw new IllegalArgumentException("invalid IPv4/IPv6 address");
        }
        this.r = inetAddress.getAddress();
    }
}
