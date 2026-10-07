package o;

import java.security.PublicKey;
import java.util.StringTokenizer;

/* JADX INFO: renamed from: o.hI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1672hI extends AbstractC1574gI {
    public static final int A = 256;
    public static final int B = 512;
    public static final int C = 0;
    public static final int D = 1;
    public static final int E = 2;
    public static final int F = 3;
    public static final int G = 4;
    public static final int H = 255;
    public static final int x = 16384;
    public static final int y = 32768;
    public static final int z = 49152;

    /* JADX INFO: renamed from: o.hI$a */
    public static class a {
        public static final int A = 9;
        public static final int B = 10;
        public static final int C = 11;
        public static final int D = 12;
        public static final int E = 13;
        public static final int F = 14;
        public static final int G = 15;
        private static final MQ H;
        public static final int a = 16384;
        public static final int b = 32768;
        public static final int c = 49152;
        public static final int d = 49152;
        public static final int e = 8192;
        public static final int f = 4096;
        public static final int g = 2048;
        public static final int h = 1024;
        public static final int i = 0;
        public static final int j = 256;
        public static final int k = 512;
        public static final int l = 768;
        public static final int m = 768;
        public static final int n = 128;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f812o = 64;
        public static final int p = 32;
        public static final int q = 16;
        public static final int r = 0;
        public static final int s = 1;
        public static final int t = 2;
        public static final int u = 3;
        public static final int v = 4;
        public static final int w = 5;
        public static final int x = 6;
        public static final int y = 7;
        public static final int z = 8;

        static {
            MQ mq = new MQ("KEY flags", 2);
            H = mq;
            mq.m(AQ.w);
            mq.n(false);
            mq.b(16384, "NOCONF");
            mq.b(32768, "NOAUTH");
            mq.b(49152, "NOKEY");
            mq.b(e, "FLAG2");
            mq.b(f, "EXTEND");
            mq.b(g, "FLAG4");
            mq.b(1024, "FLAG5");
            mq.b(0, "USER");
            mq.b(256, "ZONE");
            mq.b(512, "HOST");
            mq.b(768, "NTYP3");
            mq.b(128, "FLAG8");
            mq.b(64, "FLAG9");
            mq.b(32, "FLAG10");
            mq.b(16, "FLAG11");
            mq.b(0, "SIG0");
            mq.b(1, "SIG1");
            mq.b(2, "SIG2");
            mq.b(3, "SIG3");
            mq.b(4, "SIG4");
            mq.b(5, "SIG5");
            mq.b(6, "SIG6");
            mq.b(7, "SIG7");
            mq.b(8, "SIG8");
            mq.b(9, "SIG9");
            mq.b(10, "SIG10");
            mq.b(11, "SIG11");
            mq.b(12, "SIG12");
            mq.b(13, "SIG13");
            mq.b(14, "SIG14");
            mq.b(15, "SIG15");
        }

        private a() {
        }

        public static int a(String str) {
            try {
                int i2 = Integer.parseInt(str);
                if (i2 < 0 || i2 > 65535) {
                    return -1;
                }
                return i2;
            } catch (NumberFormatException unused) {
                StringTokenizer stringTokenizer = new StringTokenizer(str, "|");
                int i3 = 0;
                while (stringTokenizer.hasMoreTokens()) {
                    int iG = H.g(stringTokenizer.nextToken());
                    if (iG < 0) {
                        return -1;
                    }
                    i3 |= iG;
                }
                return i3;
            }
        }
    }

    /* JADX INFO: renamed from: o.hI$b */
    public static class b {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;
        public static final int f = 255;
        private static final MQ g;

        static {
            MQ mq = new MQ("KEY protocol", 2);
            g = mq;
            mq.m(255);
            mq.n(true);
            mq.b(0, "NONE");
            mq.b(1, "TLS");
            mq.b(2, "EMAIL");
            mq.b(3, "DNSSEC");
            mq.b(4, "IPSEC");
            mq.b(255, "ANY");
        }

        private b() {
        }

        public static String a(int i) {
            return g.f(i);
        }

        public static int b(String str) {
            return g.g(str);
        }
    }

    public C1672hI() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) throws Ri0 {
        String strA0 = fl0.a0();
        int iA = a.a(strA0);
        this.r = iA;
        if (iA < 0) {
            throw fl0.f("Invalid flags: " + strA0);
        }
        String strA1 = fl0.a0();
        int iB = b.b(strA1);
        this.s = iB;
        if (iB < 0) {
            throw fl0.f("Invalid protocol: " + strA1);
        }
        String strA2 = fl0.a0();
        int iB2 = C0629Ni.a.b(strA2);
        this.t = iB2;
        if (iB2 < 0) {
            throw fl0.f("Invalid algorithm: " + strA2);
        }
        if ((this.r & 49152) == 49152) {
            this.u = null;
        } else {
            this.u = fl0.K();
        }
    }

    @Override // o.AbstractC1574gI
    public /* bridge */ /* synthetic */ int U() {
        return super.U();
    }

    @Override // o.AbstractC1574gI
    public /* bridge */ /* synthetic */ int V() {
        return super.V();
    }

    @Override // o.AbstractC1574gI
    public /* bridge */ /* synthetic */ int W() {
        return super.W();
    }

    @Override // o.AbstractC1574gI
    public /* bridge */ /* synthetic */ byte[] X() {
        return super.X();
    }

    @Override // o.AbstractC1574gI
    public /* bridge */ /* synthetic */ int Y() {
        return super.Y();
    }

    @Override // o.AbstractC1574gI
    public /* bridge */ /* synthetic */ PublicKey Z() {
        return super.Z();
    }

    public C1672hI(C2848tT c2848tT, int i, long j, int i2, int i3, int i4, byte[] bArr) {
        super(c2848tT, 25, i, j, i2, i3, i4, bArr);
    }

    public C1672hI(C2848tT c2848tT, int i, long j, int i2, int i3, int i4, PublicKey publicKey) {
        super(c2848tT, 25, i, j, i2, i3, i4, C0629Ni.o(publicKey, i4));
        this.w = publicKey;
    }
}
