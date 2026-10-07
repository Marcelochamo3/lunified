package o;

/* JADX INFO: renamed from: o.wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3146wa extends H50 {
    public static final int v = 1;
    public static final int w = 2;
    public static final int x = 3;
    public static final int y = 253;
    public static final int z = 254;
    private int r;
    private int s;
    private int t;
    private byte[] u;

    /* JADX INFO: renamed from: o.wa$a */
    public static class a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public static final int e = 5;
        public static final int f = 6;
        public static final int g = 7;
        public static final int h = 8;
        public static final int i = 253;
        public static final int j = 254;
        private static final MQ k;

        static {
            MQ mq = new MQ("Certificate type", 2);
            k = mq;
            mq.m(AQ.w);
            mq.n(true);
            mq.b(1, "PKIX");
            mq.b(2, "SPKI");
            mq.b(3, "PGP");
            mq.b(1, "IPKIX");
            mq.b(2, "ISPKI");
            mq.b(3, "IPGP");
            mq.b(3, "ACPKIX");
            mq.b(3, "IACPKIX");
            mq.b(253, "URI");
            mq.b(254, "OID");
        }

        private a() {
        }

        public static String a(int i2) {
            return k.f(i2);
        }

        public static int b(String str) {
            return k.g(str);
        }
    }

    public C3146wa() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) throws Ri0 {
        String strE0 = fl0.e0();
        int iB = a.b(strE0);
        this.r = iB;
        if (iB < 0) {
            throw fl0.f("Invalid certificate type: " + strE0);
        }
        this.s = fl0.h0();
        String strE1 = fl0.e0();
        int iB2 = C0629Ni.a.b(strE1);
        this.t = iB2;
        if (iB2 >= 0) {
            this.u = fl0.K();
        } else {
            throw fl0.f("Invalid algorithm: " + strE1);
        }
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) {
        this.r = c0474Hi.h();
        this.s = c0474Hi.h();
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
            if (EW.a("multiline")) {
                sb.append(" (\n");
                sb.append(Cy0.a(this.u, 64, "\t", true));
            } else {
                sb.append(" ");
                sb.append(Cy0.c(this.u));
            }
        }
        return sb.toString();
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z2) {
        c0578Li.l(this.r);
        c0578Li.l(this.s);
        c0578Li.o(this.t);
        c0578Li.i(this.u);
    }

    public int U() {
        return this.t;
    }

    public byte[] V() {
        return this.u;
    }

    public int W() {
        return this.r;
    }

    public int X() {
        return this.s;
    }

    public C3146wa(C2848tT c2848tT, int i, long j, int i2, int i3, int i4, byte[] bArr) {
        super(c2848tT, 37, i, j);
        this.r = H50.g("certType", i2);
        this.s = H50.g("keyTag", i3);
        this.t = H50.j("alg", i4);
        this.u = bArr;
    }
}
