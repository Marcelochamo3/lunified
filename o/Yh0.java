package o;

/* JADX INFO: loaded from: classes.dex */
public class Yh0 extends H50 {
    private int r;
    private int s;
    private int t;
    private byte[] u;

    public static class a {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;

        private a() {
        }
    }

    public static class b {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;

        private b() {
        }
    }

    public static class c {
        public static final int a = 0;
        public static final int b = 1;

        private c() {
        }
    }

    public Yh0() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) {
        this.r = fl0.j0();
        this.s = fl0.j0();
        this.t = fl0.j0();
        this.u = fl0.Y(true);
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) throws Rw0 {
        this.r = c0474Hi.j();
        this.s = c0474Hi.j();
        this.t = c0474Hi.j();
        byte[] bArrE = c0474Hi.e();
        this.u = bArrE;
        if (bArrE.length == 0) {
            throw new Rw0("end of input");
        }
    }

    @Override // o.H50
    public String I() {
        return this.r + " " + this.s + " " + this.t + " " + Ay0.b(this.u);
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        c0578Li.o(this.r);
        c0578Li.o(this.s);
        c0578Li.o(this.t);
        c0578Li.i(this.u);
    }

    public final byte[] U() {
        return this.u;
    }

    public int V() {
        return this.r;
    }

    public int W() {
        return this.t;
    }

    public int X() {
        return this.s;
    }

    public Yh0(C2848tT c2848tT, int i, int i2, long j, int i3, int i4, int i5, byte[] bArr) {
        super(c2848tT, i, i2, j);
        this.r = H50.j("certificateUsage", i3);
        this.s = H50.j("selector", i4);
        this.t = H50.j("matchingType", i5);
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("certificateAssociationData must not be null or empty");
        }
        this.u = H50.d("certificateAssociationData", bArr, AQ.w);
    }

    public Yh0(C2848tT c2848tT, int i, long j, int i2, int i3, int i4, byte[] bArr) {
        this(c2848tT, 52, i, j, i2, i3, i4, bArr);
    }
}
