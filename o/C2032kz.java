package o;

/* JADX INFO: renamed from: o.kz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2032kz extends AbstractC2304np {
    private byte[] b;

    public C2032kz(int i) {
        super(i);
    }

    @Override // o.AbstractC2304np
    public void e(C0474Hi c0474Hi) {
        this.b = c0474Hi.e();
    }

    @Override // o.AbstractC2304np
    public String f() {
        return "<" + Ay0.b(this.b) + ">";
    }

    @Override // o.AbstractC2304np
    public void g(C0578Li c0578Li) {
        c0578Li.i(this.b);
    }

    public C2032kz(int i, byte[] bArr) {
        super(i);
        this.b = H50.d("option data", bArr, AQ.w);
    }
}
