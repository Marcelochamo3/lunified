package o;

/* JADX INFO: renamed from: o.uV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2947uV extends H50 {
    private byte[] r;

    public C2947uV() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) {
        this.r = fl0.K();
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) {
        this.r = c0474Hi.e();
    }

    @Override // o.H50
    public String I() {
        StringBuilder sb = new StringBuilder();
        if (this.r != null) {
            if (EW.a("multiline")) {
                sb.append("(\n");
                sb.append(Cy0.a(this.r, 64, "\t", true));
            } else {
                sb.append(Cy0.c(this.r));
            }
        }
        return sb.toString();
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        c0578Li.i(this.r);
    }

    public byte[] U() {
        return this.r;
    }

    public C2947uV(C2848tT c2848tT, int i, long j, byte[] bArr) {
        super(c2848tT, 61, i, j);
        this.r = bArr;
    }
}
