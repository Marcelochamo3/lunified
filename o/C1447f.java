package o;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: o.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1447f extends H50 {
    private int r;
    private InetAddress s;
    private C2848tT t;

    public C1447f() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) throws Ri0 {
        int iJ0 = fl0.j0();
        this.r = iJ0;
        if (iJ0 > 128) {
            throw fl0.f("prefix bits must be [0..128]");
        }
        if (iJ0 < 128) {
            String strE0 = fl0.e0();
            try {
                this.s = C1062b2.f(strE0, 2);
            } catch (UnknownHostException unused) {
                throw fl0.f("invalid IPv6 address: " + strE0);
            }
        }
        if (this.r > 0) {
            this.t = fl0.d0(c2848tT);
        }
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) throws Rw0 {
        int iJ = c0474Hi.j();
        this.r = iJ;
        int i = (135 - iJ) / 8;
        if (iJ < 128) {
            byte[] bArr = new byte[16];
            c0474Hi.d(bArr, 16 - i, i);
            this.s = InetAddress.getByAddress(bArr);
        }
        if (this.r > 0) {
            this.t = new C2848tT(c0474Hi);
        }
    }

    @Override // o.H50
    public String I() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.r);
        if (this.s != null) {
            sb.append(" ");
            sb.append(this.s.getHostAddress());
        }
        if (this.t != null) {
            sb.append(" ");
            sb.append(this.t);
        }
        return sb.toString();
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        c0578Li.o(this.r);
        InetAddress inetAddress = this.s;
        if (inetAddress != null) {
            int i = (135 - this.r) / 8;
            c0578Li.j(inetAddress.getAddress(), 16 - i, i);
        }
        C2848tT c2848tT = this.t;
        if (c2848tT != null) {
            c2848tT.B(c0578Li, null, z);
        }
    }

    public C2848tT U() {
        return this.t;
    }

    public int V() {
        return this.r;
    }

    public InetAddress W() {
        return this.s;
    }

    public C1447f(C2848tT c2848tT, int i, long j, int i2, InetAddress inetAddress, C2848tT c2848tT2) {
        super(c2848tT, 38, i, j);
        this.r = H50.j("prefixBits", i2);
        if (inetAddress != null && C1062b2.c(inetAddress) != 2) {
            throw new IllegalArgumentException("invalid IPv6 address");
        }
        this.s = inetAddress;
        if (c2848tT2 != null) {
            this.t = H50.e("prefix", c2848tT2);
        }
    }
}
