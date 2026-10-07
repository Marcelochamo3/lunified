package o;

/* JADX INFO: renamed from: o.hq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1723hq0 extends H50 {
    private int r;
    private int s;
    private byte[] t;

    public C1723hq0() {
        this.t = new byte[0];
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) throws Ri0 {
        this.r = fl0.h0();
        this.s = fl0.h0();
        try {
            this.t = H50.b(fl0.e0());
        } catch (Ri0 e) {
            throw fl0.f(e.getMessage());
        }
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) {
        this.r = c0474Hi.h();
        this.s = c0474Hi.h();
        this.t = c0474Hi.e();
    }

    @Override // o.H50
    public String I() {
        return this.r + " " + this.s + " " + H50.c(this.t, true);
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        c0578Li.l(this.r);
        c0578Li.l(this.s);
        c0578Li.i(this.t);
    }

    public int U() {
        return this.r;
    }

    public String V() {
        return H50.c(this.t, false);
    }

    public int W() {
        return this.s;
    }

    public C1723hq0(C2848tT c2848tT, int i, long j, int i2, int i3, String str) {
        super(c2848tT, 256, i, j);
        this.r = H50.g("priority", i2);
        this.s = H50.g("weight", i3);
        try {
            this.t = H50.b(str);
        } catch (Ri0 e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
