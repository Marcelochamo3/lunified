package o;

/* JADX INFO: renamed from: o.sa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2758sa extends H50 {
    private int r;
    private byte[] s;
    private byte[] t;

    /* JADX INFO: renamed from: o.sa$a */
    public static class a {
        public static final int a = 128;

        private a() {
        }
    }

    public C2758sa() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) throws Ri0 {
        this.r = fl0.j0();
        try {
            this.s = H50.b(fl0.e0());
            this.t = H50.b(fl0.e0());
        } catch (Ri0 e) {
            throw fl0.f(e.getMessage());
        }
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) {
        this.r = c0474Hi.j();
        this.s = c0474Hi.g();
        this.t = c0474Hi.e();
    }

    @Override // o.H50
    public String I() {
        return this.r + " " + H50.c(this.s, false) + " " + H50.c(this.t, true);
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        c0578Li.o(this.r);
        c0578Li.k(this.s);
        c0578Li.i(this.t);
    }

    public int U() {
        return this.r;
    }

    public String V() {
        return H50.c(this.s, false);
    }

    public String W() {
        return H50.c(this.t, false);
    }

    public C2758sa(C2848tT c2848tT, int i, long j, int i2, String str, String str2) {
        super(c2848tT, C3080vp0.F0, i, j);
        this.r = H50.j("flags", i2);
        try {
            this.s = H50.b(str);
            this.t = H50.b(str2);
        } catch (Ri0 e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
