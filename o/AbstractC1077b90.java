package o;

import j$.time.Instant;

/* JADX INFO: renamed from: o.b90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1077b90 extends H50 {
    protected int r;
    protected int s;
    protected int t;
    protected long u;
    protected Instant v;
    protected Instant w;
    protected int x;
    protected C2848tT y;
    protected byte[] z;

    public AbstractC1077b90() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) throws Ri0 {
        String strE0 = fl0.e0();
        int iF = C3080vp0.f(strE0);
        this.r = iF;
        if (iF < 0) {
            throw fl0.f("Invalid type: " + strE0);
        }
        String strE1 = fl0.e0();
        int iB = C0629Ni.a.b(strE1);
        this.s = iB;
        if (iB < 0) {
            throw fl0.f("Invalid algorithm: " + strE1);
        }
        this.t = fl0.j0();
        this.u = fl0.f0();
        this.v = C0695Pw.b(fl0.e0());
        this.w = C0695Pw.b(fl0.e0());
        this.x = fl0.h0();
        this.y = fl0.d0(c2848tT);
        this.z = fl0.K();
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) {
        this.r = c0474Hi.h();
        this.s = c0474Hi.j();
        this.t = c0474Hi.j();
        this.u = c0474Hi.i();
        this.v = Instant.ofEpochSecond(c0474Hi.i());
        this.w = Instant.ofEpochSecond(c0474Hi.i());
        this.x = c0474Hi.h();
        this.y = new C2848tT(c0474Hi);
        this.z = c0474Hi.e();
    }

    @Override // o.H50
    public String I() {
        StringBuilder sb = new StringBuilder();
        sb.append(C3080vp0.e(this.r));
        sb.append(" ");
        sb.append(this.s);
        sb.append(" ");
        sb.append(this.t);
        sb.append(" ");
        sb.append(this.u);
        sb.append(" ");
        if (EW.a("multiline")) {
            sb.append("(\n\t");
        }
        sb.append(C0695Pw.a(this.v));
        sb.append(" ");
        sb.append(C0695Pw.a(this.w));
        sb.append(" ");
        sb.append(this.x);
        sb.append(" ");
        sb.append(this.y);
        if (EW.a("multiline")) {
            sb.append("\n");
            sb.append(Cy0.a(this.z, 64, "\t", true));
        } else {
            sb.append(" ");
            sb.append(Cy0.c(this.z));
        }
        return sb.toString();
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        c0578Li.l(this.r);
        c0578Li.o(this.s);
        c0578Li.o(this.t);
        c0578Li.n(this.u);
        c0578Li.n(this.v.getEpochSecond());
        c0578Li.n(this.w.getEpochSecond());
        c0578Li.l(this.x);
        this.y.B(c0578Li, null, z);
        c0578Li.i(this.z);
    }

    public int U() {
        return this.s;
    }

    public Instant V() {
        return this.v;
    }

    public int W() {
        return this.x;
    }

    public int X() {
        return this.t;
    }

    public long Y() {
        return this.u;
    }

    public byte[] Z() {
        return this.z;
    }

    public C2848tT a0() {
        return this.y;
    }

    public Instant b0() {
        return this.w;
    }

    public int c0() {
        return this.r;
    }

    public void d0(byte[] bArr) {
        this.z = bArr;
    }

    @Override // o.H50
    public int w() {
        return this.r;
    }

    public AbstractC1077b90(C2848tT c2848tT, int i, int i2, long j, int i3, int i4, long j2, Instant instant, Instant instant2, int i5, C2848tT c2848tT2, byte[] bArr) {
        super(c2848tT, i, i2, j);
        C3080vp0.a(i3);
        C1707hi0.a(j2);
        this.r = i3;
        this.s = H50.j("alg", i4);
        this.t = c2848tT.s() - 1;
        if (c2848tT.r()) {
            this.t--;
        }
        this.u = j2;
        this.v = instant;
        this.w = instant2;
        this.x = H50.g("footprint", i5);
        this.y = H50.e("signer", c2848tT2);
        this.z = bArr;
    }
}
