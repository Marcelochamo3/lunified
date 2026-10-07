package o;

import java.security.PublicKey;

/* JADX INFO: renamed from: o.gI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1574gI extends H50 {
    protected int r;
    protected int s;
    protected int t;
    protected byte[] u;
    protected int v;
    protected PublicKey w;

    public AbstractC1574gI() {
        this.v = -1;
        this.w = null;
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) {
        this.r = c0474Hi.h();
        this.s = c0474Hi.j();
        this.t = c0474Hi.j();
        if (c0474Hi.k() > 0) {
            this.u = c0474Hi.e();
        }
    }

    @Override // o.H50
    public String I() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.r);
        sb.append(" ");
        sb.append(this.s);
        sb.append(" ");
        sb.append(this.t);
        if (this.u != null) {
            if (EW.a("multiline")) {
                sb.append(" (\n");
                sb.append(Cy0.a(this.u, 64, "\t", true));
                sb.append(" ; key_tag = ");
                sb.append(W());
            } else {
                sb.append(" ");
                sb.append(Cy0.c(this.u));
            }
        }
        return sb.toString();
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        c0578Li.l(this.r);
        c0578Li.o(this.s);
        c0578Li.o(this.t);
        byte[] bArr = this.u;
        if (bArr != null) {
            c0578Li.i(bArr);
        }
    }

    public int U() {
        return this.t;
    }

    public int V() {
        return this.r;
    }

    public int W() {
        int i;
        int i2;
        int i3 = this.v;
        if (i3 >= 0) {
            return i3;
        }
        C0578Li c0578Li = new C0578Li();
        int i4 = 0;
        J(c0578Li, null, false);
        byte[] bArrG = c0578Li.g();
        if (this.t == 1) {
            int i5 = bArrG[bArrG.length - 3] & 255;
            i2 = bArrG[bArrG.length - 2] & 255;
            i = i5 << 8;
        } else {
            i = 0;
            while (i4 < bArrG.length - 1) {
                i += ((bArrG[i4] & 255) << 8) + (bArrG[i4 + 1] & 255);
                i4 += 2;
            }
            if (i4 < bArrG.length) {
                i += (bArrG[i4] & 255) << 8;
            }
            i2 = (i >> 16) & AQ.w;
        }
        int i6 = (i + i2) & AQ.w;
        this.v = i6;
        return i6;
    }

    public byte[] X() {
        return this.u;
    }

    public int Y() {
        return this.s;
    }

    public PublicKey Z() {
        PublicKey publicKey = this.w;
        if (publicKey != null) {
            return publicKey;
        }
        PublicKey publicKeyJ = C0629Ni.J(this);
        this.w = publicKeyJ;
        return publicKeyJ;
    }

    public AbstractC1574gI(C2848tT c2848tT, int i, int i2, long j, int i3, int i4, int i5, byte[] bArr) {
        super(c2848tT, i, i2, j);
        this.v = -1;
        this.w = null;
        this.r = H50.g("flags", i3);
        this.s = H50.j("proto", i4);
        this.t = H50.j("alg", i5);
        this.u = bArr;
    }
}
