package o;

/* JADX INFO: renamed from: o.gq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1625gq0 extends H50 {
    private byte[] r;

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) throws Ri0 {
        throw fl0.f("invalid unknown RR encoding");
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
}
