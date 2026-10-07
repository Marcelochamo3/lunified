package o;

/* JADX INFO: loaded from: classes.dex */
public class TW extends H50 {
    private int r;
    private C2848tT s;
    private C2848tT t;

    public TW() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) {
        this.r = fl0.h0();
        this.s = fl0.d0(c2848tT);
        this.t = fl0.d0(c2848tT);
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) {
        this.r = c0474Hi.h();
        this.s = new C2848tT(c0474Hi);
        this.t = new C2848tT(c0474Hi);
    }

    @Override // o.H50
    public String I() {
        return this.r + " " + this.s + " " + this.t;
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        c0578Li.l(this.r);
        this.s.B(c0578Li, null, z);
        this.t.B(c0578Li, null, z);
    }

    public C2848tT U() {
        return this.s;
    }

    public C2848tT V() {
        return this.t;
    }

    public int W() {
        return this.r;
    }

    public TW(C2848tT c2848tT, int i, long j, int i2, C2848tT c2848tT2, C2848tT c2848tT3) {
        super(c2848tT, 26, i, j);
        this.r = H50.g("preference", i2);
        this.s = H50.e("map822", c2848tT2);
        this.t = H50.e("mapX400", c2848tT3);
    }
}
