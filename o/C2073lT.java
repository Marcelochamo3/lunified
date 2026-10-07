package o;

/* JADX INFO: renamed from: o.lT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2073lT extends H50 {
    private C2848tT r;
    private Ip0 s;

    public C2073lT() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) {
        this.r = fl0.d0(c2848tT);
        this.s = new Ip0(fl0);
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) {
        this.r = new C2848tT(c0474Hi);
        this.s = new Ip0(c0474Hi);
    }

    @Override // o.H50
    public String I() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.r);
        if (!this.s.b()) {
            sb.append(' ');
            sb.append(this.s.toString());
        }
        return sb.toString();
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        this.r.B(c0578Li, null, false);
        this.s.e(c0578Li);
    }

    public C2848tT U() {
        return this.r;
    }

    public int[] V() {
        return this.s.d();
    }

    public boolean W(int i) {
        return this.s.a(i);
    }

    public C2073lT(C2848tT c2848tT, int i, long j, C2848tT c2848tT2, int[] iArr) {
        super(c2848tT, 47, i, j);
        this.r = H50.e("next", c2848tT2);
        for (int i2 : iArr) {
            C3080vp0.a(i2);
        }
        this.s = new Ip0(iArr);
    }
}
