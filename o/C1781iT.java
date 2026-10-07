package o;

/* JADX INFO: renamed from: o.iT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1781iT extends H50 {
    private int r;
    private int s;
    private int t;
    private byte[] u;

    public C1781iT() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) throws Ri0 {
        this.r = fl0.j0();
        this.s = fl0.j0();
        this.t = fl0.h0();
        if (fl0.e0().equals("-")) {
            this.u = null;
            return;
        }
        fl0.n0();
        byte[] bArrZ = fl0.Z();
        this.u = bArrZ;
        if (bArrZ.length > 255) {
            throw fl0.f("salt value too long");
        }
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) throws Rw0 {
        this.r = c0474Hi.j();
        this.s = c0474Hi.j();
        this.t = c0474Hi.h();
        int iJ = c0474Hi.j();
        if (iJ > 0) {
            this.u = c0474Hi.f(iJ);
        } else {
            this.u = null;
        }
    }

    @Override // o.H50
    public String I() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.r);
        sb.append(' ');
        sb.append(this.s);
        sb.append(' ');
        sb.append(this.t);
        sb.append(' ');
        byte[] bArr = this.u;
        if (bArr == null) {
            sb.append('-');
        } else {
            sb.append(Ay0.b(bArr));
        }
        return sb.toString();
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        c0578Li.o(this.r);
        c0578Li.o(this.s);
        c0578Li.l(this.t);
        byte[] bArr = this.u;
        if (bArr == null) {
            c0578Li.o(0);
        } else {
            c0578Li.o(bArr.length);
            c0578Li.i(this.u);
        }
    }

    public int U() {
        return this.s;
    }

    public int V() {
        return this.r;
    }

    public int W() {
        return this.t;
    }

    public byte[] X() {
        return this.u;
    }

    public byte[] Y(C2848tT c2848tT) {
        return C1877jT.c0(c2848tT, this.r, this.t, this.u);
    }

    public C1781iT(C2848tT c2848tT, int i, long j, int i2, int i3, int i4, byte[] bArr) {
        super(c2848tT, 51, i, j);
        this.r = H50.j("hashAlg", i2);
        this.s = H50.j("flags", i3);
        this.t = H50.g("iterations", i4);
        if (bArr != null) {
            if (bArr.length > 255) {
                throw new IllegalArgumentException("Invalid salt length");
            }
            if (bArr.length > 0) {
                byte[] bArr2 = new byte[bArr.length];
                this.u = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
        }
    }
}
