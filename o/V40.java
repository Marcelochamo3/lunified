package o;

/* JADX INFO: loaded from: classes.dex */
public class V40 extends H50 {
    private C2848tT r;
    private C2848tT s;

    public V40() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) {
        this.r = fl0.d0(c2848tT);
        this.s = fl0.d0(c2848tT);
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) {
        this.r = new C2848tT(c0474Hi);
        this.s = new C2848tT(c0474Hi);
    }

    @Override // o.H50
    public String I() {
        return this.r + " " + this.s;
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        this.r.B(c0578Li, null, z);
        this.s.B(c0578Li, null, z);
    }

    public C2848tT U() {
        return this.r;
    }

    public C2848tT V() {
        return this.s;
    }

    public V40(C2848tT c2848tT, int i, long j, C2848tT c2848tT2, C2848tT c2848tT3) {
        super(c2848tT, 17, i, j);
        this.r = H50.e("mailbox", c2848tT2);
        this.s = H50.e("textDomain", c2848tT3);
    }
}
