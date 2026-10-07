package o;

/* JADX INFO: loaded from: classes.dex */
public class EE extends H50 {
    private byte[] r;
    private byte[] s;

    public EE() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) throws Ri0 {
        try {
            this.r = H50.b(fl0.e0());
            Fl0.b bVarI = fl0.i();
            if (bVarI.b()) {
                this.s = H50.b(bVarI.d());
            } else {
                fl0.n0();
            }
        } catch (Ri0 e) {
            throw fl0.f(e.getMessage());
        }
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) {
        this.r = c0474Hi.g();
        if (c0474Hi.k() > 0) {
            this.s = c0474Hi.g();
        }
    }

    @Override // o.H50
    public String I() {
        StringBuilder sb = new StringBuilder();
        sb.append(H50.c(this.r, true));
        if (this.s != null) {
            sb.append(" ");
            sb.append(H50.c(this.s, true));
        }
        return sb.toString();
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        c0578Li.k(this.r);
        byte[] bArr = this.s;
        if (bArr != null) {
            c0578Li.k(bArr);
        }
    }

    public String U() {
        return H50.c(this.r, false);
    }

    public String V() {
        byte[] bArr = this.s;
        if (bArr == null) {
            return null;
        }
        return H50.c(bArr, false);
    }

    public EE(C2848tT c2848tT, int i, long j, String str, String str2) {
        super(c2848tT, 20, i, j);
        try {
            this.r = H50.b(str);
            if (str2 != null) {
                this.s = H50.b(str2);
            }
        } catch (Ri0 e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
