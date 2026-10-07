package o;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: o.jT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1877jT extends H50 {
    public static final int x = 1;
    private static final By0 y = new By0(By0.a.b, false, false);
    private int r;
    private int s;
    private int t;
    private byte[] u;
    private byte[] v;
    private Ip0 w;

    /* JADX INFO: renamed from: o.jT$a */
    public static class a {
        private static final MQ a;
        public static final int b = 1;

        static {
            MQ mq = new MQ("DNSSEC NSEC3 Hash Algorithms", 1);
            a = mq;
            mq.b(1, "SHA-1");
        }

        private a() {
        }

        public static String a(int i) {
            return a.f(i);
        }

        public static int b(String str) {
            return a.g(str);
        }
    }

    /* JADX INFO: renamed from: o.jT$b */
    public static class b {
        public static final int a = 1;

        private b() {
        }
    }

    public C1877jT() {
    }

    public static byte[] c0(C2848tT c2848tT, int i, int i2, byte[] bArr) throws NoSuchAlgorithmException {
        if (i != 1) {
            throw new NoSuchAlgorithmException(AbstractC1674hK.n(i, "Unknown NSEC3 algorithm identifier: "));
        }
        MessageDigest messageDigest = MessageDigest.getInstance("sha-1");
        byte[] bArrDigest = null;
        for (int i3 = 0; i3 <= i2; i3++) {
            messageDigest.reset();
            if (i3 == 0) {
                messageDigest.update(c2848tT.E());
            } else {
                messageDigest.update(bArrDigest);
            }
            if (bArr != null) {
                messageDigest.update(bArr);
            }
            bArrDigest = messageDigest.digest();
        }
        return bArrDigest;
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) throws Ri0 {
        this.r = fl0.j0();
        this.s = fl0.j0();
        this.t = fl0.h0();
        if (fl0.e0().equals("-")) {
            this.u = null;
        } else {
            fl0.n0();
            byte[] bArrZ = fl0.Z();
            this.u = bArrZ;
            if (bArrZ.length > 255) {
                throw fl0.f("salt value too long");
            }
        }
        this.v = fl0.t(y);
        this.w = new Ip0(fl0);
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) throws Rw0 {
        this.r = c0474Hi.j();
        this.s = c0474Hi.j();
        this.t = c0474Hi.h();
        int iJ = c0474Hi.j();
        if (iJ > 0) {
            this.u = c0474Hi.f(iJ);
        } else {
            this.u = null;
        }
        this.v = c0474Hi.f(c0474Hi.j());
        this.w = new Ip0(c0474Hi);
    }

    @Override // o.H50
    public String I() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.r);
        sb.append(' ');
        sb.append(this.s);
        sb.append(' ');
        sb.append(this.t);
        sb.append(' ');
        byte[] bArr = this.u;
        if (bArr == null) {
            sb.append('-');
        } else {
            sb.append(Ay0.b(bArr));
        }
        sb.append(' ');
        sb.append(y.d(this.v));
        if (!this.w.b()) {
            sb.append(' ');
            sb.append(this.w.toString());
        }
        return sb.toString();
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        c0578Li.o(this.r);
        c0578Li.o(this.s);
        c0578Li.l(this.t);
        byte[] bArr = this.u;
        if (bArr != null) {
            c0578Li.o(bArr.length);
            c0578Li.i(this.u);
        } else {
            c0578Li.o(0);
        }
        c0578Li.o(this.v.length);
        c0578Li.i(this.v);
        this.w.e(c0578Li);
    }

    public int U() {
        return this.s;
    }

    public int V() {
        return this.r;
    }

    public int W() {
        return this.t;
    }

    public byte[] X() {
        return this.v;
    }

    public byte[] Y() {
        return this.u;
    }

    public int[] Z() {
        return this.w.d();
    }

    public boolean a0(int i) {
        return this.w.a(i);
    }

    public byte[] b0(C2848tT c2848tT) {
        return c0(c2848tT, this.r, this.t, this.u);
    }

    public C1877jT(C2848tT c2848tT, int i, long j, int i2, int i3, int i4, byte[] bArr, byte[] bArr2, int[] iArr) {
        super(c2848tT, 50, i, j);
        this.r = H50.j("hashAlg", i2);
        this.s = H50.j("flags", i3);
        this.t = H50.g("iterations", i4);
        if (bArr != null) {
            if (bArr.length > 255) {
                throw new IllegalArgumentException("Invalid salt");
            }
            if (bArr.length > 0) {
                byte[] bArr3 = new byte[bArr.length];
                this.u = bArr3;
                System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            }
        }
        if (bArr2.length > 255) {
            throw new IllegalArgumentException("Invalid next hash");
        }
        byte[] bArr4 = new byte[bArr2.length];
        this.v = bArr4;
        System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
        this.w = new Ip0(iArr);
    }
}
