package o;

/* JADX INFO: renamed from: o.eT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1389eT extends H50 {
    private int r;
    private int s;
    private byte[] t;
    private byte[] u;
    private byte[] v;
    private C2848tT w;

    public C1389eT() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) throws Ri0 {
        this.r = fl0.h0();
        this.s = fl0.h0();
        try {
            this.t = H50.b(fl0.e0());
            this.u = H50.b(fl0.e0());
            this.v = H50.b(fl0.e0());
            this.w = fl0.d0(c2848tT);
        } catch (Ri0 e) {
            throw fl0.f(e.getMessage());
        }
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) {
        this.r = c0474Hi.h();
        this.s = c0474Hi.h();
        this.t = c0474Hi.g();
        this.u = c0474Hi.g();
        this.v = c0474Hi.g();
        this.w = new C2848tT(c0474Hi);
    }

    @Override // o.H50
    public String I() {
        return this.r + " " + this.s + " " + H50.c(this.t, true) + " " + H50.c(this.u, true) + " " + H50.c(this.v, true) + " " + this.w;
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        c0578Li.l(this.r);
        c0578Li.l(this.s);
        c0578Li.k(this.t);
        c0578Li.k(this.u);
        c0578Li.k(this.v);
        this.w.B(c0578Li, null, z);
    }

    public String U() {
        return H50.c(this.t, false);
    }

    public int V() {
        return this.r;
    }

    public int W() {
        return this.s;
    }

    public String X() {
        return H50.c(this.v, false);
    }

    public C2848tT Y() {
        return this.w;
    }

    public String Z() {
        return H50.c(this.u, false);
    }

    @Override // o.H50
    public C2848tT s() {
        return this.w;
    }

    public C1389eT(C2848tT c2848tT, int i, long j, int i2, int i3, String str, String str2, String str3, C2848tT c2848tT2) {
        super(c2848tT, 35, i, j);
        this.r = H50.g("order", i2);
        this.s = H50.g("preference", i3);
        try {
            this.t = H50.b(str);
            this.u = H50.b(str2);
            this.v = H50.b(str3);
            this.w = H50.e("replacement", c2848tT2);
        } catch (Ri0 e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
