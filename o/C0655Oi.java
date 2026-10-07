package o;

/* JADX INFO: renamed from: o.Oi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0655Oi extends H50 {

    @Deprecated
    public static final int v = 1;

    @Deprecated
    public static final int w = 2;

    @Deprecated
    public static final int x = 3;

    @Deprecated
    public static final int y = 4;
    private int r;
    private int s;
    private int t;
    private byte[] u;

    /* JADX INFO: renamed from: o.Oi$a */
    @Deprecated
    public static class a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;

        private a() {
        }
    }

    public C0655Oi() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) {
        this.r = fl0.h0();
        this.s = fl0.j0();
        this.t = fl0.j0();
        this.u = fl0.Y(true);
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) {
        this.r = c0474Hi.h();
        this.s = c0474Hi.j();
        this.t = c0474Hi.j();
        this.u = c0474Hi.e();
    }

    @Override // o.H50
    public String I() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.r);
        sb.append(" ");
        sb.append(this.s);
        sb.append(" ");
        sb.append(this.t);
        if (this.u != null) {
            sb.append(" ");
            sb.append(Ay0.b(this.u));
        }
        return sb.toString();
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        c0578Li.l(this.r);
        c0578Li.o(this.s);
        c0578Li.o(this.t);
        byte[] bArr = this.u;
        if (bArr != null) {
            c0578Li.i(bArr);
        }
    }

    public int U() {
        return this.s;
    }

    public byte[] V() {
        return this.u;
    }

    public int W() {
        return this.t;
    }

    public int X() {
        return this.r;
    }

    public C0655Oi(C2848tT c2848tT, int i, int i2, long j, int i3, int i4, int i5, byte[] bArr) {
        super(c2848tT, i, i2, j);
        this.r = H50.g("footprint", i3);
        this.s = H50.j("alg", i4);
        this.t = H50.j("digestid", i5);
        this.u = bArr;
    }

    public C0655Oi(C2848tT c2848tT, int i, long j, int i2, int i3, int i4, byte[] bArr) {
        this(c2848tT, 43, i, j, i2, i3, i4, bArr);
    }

    public C0655Oi(C2848tT c2848tT, int i, long j, int i2, C0552Ki c0552Ki) {
        this(c2848tT, i, j, c0552Ki.W(), c0552Ki.U(), i2, C0629Ni.q(c0552Ki, i2));
    }
}
