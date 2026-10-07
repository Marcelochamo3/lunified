package o;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: o.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1837j extends H50 {
    private int r;

    public C1837j() {
    }

    private static int U(byte[] bArr) {
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    private static byte[] W(int i) {
        return new byte[]{(byte) ((i >>> 24) & 255), (byte) ((i >>> 16) & 255), (byte) ((i >>> 8) & 255), (byte) (i & 255)};
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) {
        this.r = U(fl0.q(1));
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) {
        this.r = U(c0474Hi.f(4));
    }

    @Override // o.H50
    public String I() {
        return C1062b2.p(W(this.r));
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        c0578Li.n(((long) this.r) & 4294967295L);
    }

    public InetAddress V() {
        try {
            C2848tT c2848tT = this.l;
            return c2848tT == null ? InetAddress.getByAddress(W(this.r)) : InetAddress.getByAddress(c2848tT.toString(), W(this.r));
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    public C1837j(C2848tT c2848tT, int i, long j, InetAddress inetAddress) {
        super(c2848tT, 1, i, j);
        if (C1062b2.c(inetAddress) != 1) {
            throw new IllegalArgumentException("invalid IPv4 address");
        }
        this.r = U(inetAddress.getAddress());
    }
}
