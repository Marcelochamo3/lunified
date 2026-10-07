package o;

/* JADX INFO: loaded from: classes.dex */
abstract class Ud0 extends H50 {
    protected C2848tT r;

    public Ud0() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) {
        this.r = fl0.d0(c2848tT);
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) {
        this.r = new C2848tT(c0474Hi);
    }

    @Override // o.H50
    public String I() {
        return this.r.toString();
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        this.r.B(c0578Li, null, z);
    }

    public C2848tT U() {
        return this.r;
    }

    public Ud0(C2848tT c2848tT, int i, int i2, long j) {
        super(c2848tT, i, i2, j);
    }

    public Ud0(C2848tT c2848tT, int i, int i2, long j, C2848tT c2848tT2, String str) {
        super(c2848tT, i, i2, j);
        this.r = H50.e(str, c2848tT2);
    }
}
