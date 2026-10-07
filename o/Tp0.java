package o;

/* JADX INFO: loaded from: classes.dex */
abstract class Tp0 extends H50 {
    protected int r;
    protected C2848tT s;

    public Tp0() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) {
        this.r = fl0.h0();
        this.s = fl0.d0(c2848tT);
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) {
        this.r = c0474Hi.h();
        this.s = new C2848tT(c0474Hi);
    }

    @Override // o.H50
    public String I() {
        return this.r + " " + this.s;
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        c0578Li.l(this.r);
        this.s.B(c0578Li, null, z);
    }

    public C2848tT U() {
        return this.s;
    }

    public int V() {
        return this.r;
    }

    public Tp0(C2848tT c2848tT, int i, int i2, long j) {
        super(c2848tT, i, i2, j);
    }

    public Tp0(C2848tT c2848tT, int i, int i2, long j, int i3, String str, C2848tT c2848tT2, String str2) {
        super(c2848tT, i, i2, j);
        this.r = H50.g(str, i3);
        this.s = H50.e(str2, c2848tT2);
    }
}
