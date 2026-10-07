package o;

/* JADX INFO: renamed from: o.dz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1348dz extends H50 {
    private byte[] r;
    private byte[] s;
    private byte[] t;

    public C1348dz() {
    }

    private void a0(double d, double d2) {
        if (d < -90.0d || d > 90.0d) {
            throw new IllegalArgumentException("illegal longitude " + d);
        }
        if (d2 < -180.0d || d2 > 180.0d) {
            throw new IllegalArgumentException("illegal latitude " + d2);
        }
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) throws Ri0, Rw0 {
        try {
            this.s = H50.b(fl0.e0());
            this.r = H50.b(fl0.e0());
            this.t = H50.b(fl0.e0());
            try {
                a0(Y(), W());
            } catch (IllegalArgumentException e) {
                throw new Rw0(e.getMessage());
            }
        } catch (Ri0 e2) {
            throw fl0.f(e2.getMessage());
        }
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) throws Rw0 {
        this.s = c0474Hi.g();
        this.r = c0474Hi.g();
        this.t = c0474Hi.g();
        try {
            a0(Y(), W());
        } catch (IllegalArgumentException e) {
            throw new Rw0(e.getMessage());
        }
    }

    @Override // o.H50
    public String I() {
        return H50.c(this.s, true) + " " + H50.c(this.r, true) + " " + H50.c(this.t, true);
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        c0578Li.k(this.s);
        c0578Li.k(this.r);
        c0578Li.k(this.t);
    }

    public double U() {
        return Double.parseDouble(V());
    }

    public String V() {
        return H50.c(this.t, false);
    }

    public double W() {
        return Double.parseDouble(X());
    }

    public String X() {
        return H50.c(this.r, false);
    }

    public double Y() {
        return Double.parseDouble(Z());
    }

    public String Z() {
        return H50.c(this.s, false);
    }

    public C1348dz(C2848tT c2848tT, int i, long j, double d, double d2, double d3) {
        super(c2848tT, 27, i, j);
        a0(d, d2);
        this.s = Double.toString(d).getBytes();
        this.r = Double.toString(d2).getBytes();
        this.t = Double.toString(d3).getBytes();
    }

    public C1348dz(C2848tT c2848tT, int i, long j, String str, String str2, String str3) {
        super(c2848tT, 27, i, j);
        try {
            this.s = H50.b(str);
            this.r = H50.b(str2);
            a0(Y(), W());
            this.t = H50.b(str3);
        } catch (Ri0 e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
