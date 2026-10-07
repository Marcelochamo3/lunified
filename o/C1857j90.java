package o;

/* JADX INFO: renamed from: o.j90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1857j90 extends H50 {
    private int r;
    private int s;
    private int t;
    private C2848tT u;

    public C1857j90() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) {
        this.r = fl0.h0();
        this.s = fl0.h0();
        this.t = fl0.h0();
        this.u = fl0.d0(c2848tT);
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) {
        this.r = c0474Hi.h();
        this.s = c0474Hi.h();
        this.t = c0474Hi.h();
        this.u = new C2848tT(c0474Hi);
    }

    @Override // o.H50
    public String I() {
        return this.r + " " + this.s + " " + this.t + " " + this.u;
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        c0578Li.l(this.r);
        c0578Li.l(this.s);
        c0578Li.l(this.t);
        this.u.B(c0578Li, null, z);
    }

    public int U() {
        return this.t;
    }

    public int V() {
        return this.r;
    }

    public C2848tT W() {
        return this.u;
    }

    public int X() {
        return this.s;
    }

    @Override // o.H50
    public C2848tT s() {
        return this.u;
    }

    public C1857j90(C2848tT c2848tT, int i, long j, int i2, int i3, int i4, C2848tT c2848tT2) {
        super(c2848tT, 33, i, j);
        this.r = H50.g("priority", i2);
        this.s = H50.g("weight", i3);
        this.t = H50.g("port", i4);
        this.u = H50.e("target", c2848tT2);
    }
}
