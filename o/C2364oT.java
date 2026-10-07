package o;

/* JADX INFO: renamed from: o.oT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2364oT extends H50 {
    private byte[] r;

    public C2364oT() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) throws Ri0 {
        throw fl0.f("no defined text format for NULL records");
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) {
        this.r = c0474Hi.e();
    }

    @Override // o.H50
    public String I() {
        return H50.R(this.r);
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        c0578Li.i(this.r);
    }

    public byte[] U() {
        return this.r;
    }

    public C2364oT(C2848tT c2848tT, int i, long j, byte[] bArr) {
        super(c2848tT, 10, i, j);
        if (bArr.length > 65535) {
            throw new IllegalArgumentException("data must be <65536 bytes");
        }
        this.r = bArr;
    }
}
