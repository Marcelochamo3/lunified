package o;

/* JADX INFO: loaded from: classes.dex */
public class VA extends H50 {
    private byte[] r;
    private byte[] s;

    public VA() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) throws Ri0 {
        try {
            this.r = H50.b(fl0.e0());
            this.s = H50.b(fl0.e0());
        } catch (Ri0 e) {
            throw fl0.f(e.getMessage());
        }
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) {
        this.r = c0474Hi.g();
        this.s = c0474Hi.g();
    }

    @Override // o.H50
    public String I() {
        return H50.c(this.r, true) + " " + H50.c(this.s, true);
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        c0578Li.k(this.r);
        c0578Li.k(this.s);
    }

    public String U() {
        return H50.c(this.r, false);
    }

    public String V() {
        return H50.c(this.s, false);
    }

    public VA(C2848tT c2848tT, int i, long j, String str, String str2) {
        super(c2848tT, 13, i, j);
        try {
            this.r = H50.b(str);
            this.s = H50.b(str2);
        } catch (Ri0 e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
