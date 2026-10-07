package o;

/* JADX INFO: renamed from: o.k90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1955k90 extends H50 {
    private int r;
    private int s;
    private byte[] t;

    /* JADX INFO: renamed from: o.k90$a */
    public static class a {
        public static final int a = 1;
        public static final int b = 2;

        private a() {
        }
    }

    /* JADX INFO: renamed from: o.k90$b */
    public static class b {
        public static final int a = 1;

        private b() {
        }
    }

    public C1955k90() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) {
        this.r = fl0.j0();
        this.s = fl0.j0();
        this.t = fl0.Y(true);
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) {
        this.r = c0474Hi.j();
        this.s = c0474Hi.j();
        this.t = c0474Hi.e();
    }

    @Override // o.H50
    public String I() {
        return this.r + " " + this.s + " " + Ay0.b(this.t);
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        c0578Li.o(this.r);
        c0578Li.o(this.s);
        c0578Li.i(this.t);
    }

    public int U() {
        return this.r;
    }

    public int V() {
        return this.s;
    }

    public byte[] W() {
        return this.t;
    }

    public C1955k90(C2848tT c2848tT, int i, long j, int i2, int i3, byte[] bArr) {
        super(c2848tT, 44, i, j);
        this.r = H50.j("alg", i2);
        this.s = H50.j("digestType", i3);
        this.t = bArr;
    }
}
