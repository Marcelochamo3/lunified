package o;

/* JADX INFO: renamed from: o.Ei, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0396Ei extends H50 {
    private byte[] r;

    public C0396Ei() {
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
        return Cy0.c(this.r);
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        c0578Li.i(this.r);
    }

    public byte[] U() {
        return this.r;
    }

    public C0396Ei(C2848tT c2848tT, int i, long j, byte[] bArr) {
        super(c2848tT, 49, i, j);
        this.r = bArr;
    }
}
