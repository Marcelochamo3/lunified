package o;

import java.util.Arrays;

/* JADX INFO: renamed from: o.np, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2304np {
    private final int a;

    /* JADX INFO: renamed from: o.np$a */
    public static class a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 5;
        public static final int e = 6;
        public static final int f = 7;
        public static final int g = 8;
        public static final int h = 9;
        public static final int i = 10;
        public static final int j = 11;
        public static final int k = 12;
        public static final int l = 13;
        public static final int m = 14;
        public static final int n = 15;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f942o = 16;
        public static final int p = 17;
        private static final MQ q;

        static {
            MQ mq = new MQ("EDNS Option Codes", 1);
            q = mq;
            mq.m(AQ.w);
            mq.o("CODE");
            mq.n(true);
            mq.b(1, "LLQ");
            mq.b(2, "UL");
            mq.b(3, "NSID");
            mq.b(5, "DAU");
            mq.b(6, "DHU");
            mq.b(7, "N3U");
            mq.b(8, "edns-client-subnet");
            mq.b(9, "EDNS_EXPIRE");
            mq.b(10, "COOKIE");
            mq.b(11, "edns-tcp-keepalive");
            mq.b(12, "Padding");
            mq.b(13, "CHAIN");
            mq.b(14, "edns-key-tag");
            mq.b(15, "Extended_DNS_Error");
            mq.b(16, "EDNS-Client-Tag");
            mq.b(17, "EDNS-Server-Tag");
        }

        private a() {
        }

        public static String a(int i2) {
            return q.f(i2);
        }

        public static int b(String str) {
            return q.g(str);
        }
    }

    public AbstractC2304np(int i) {
        this.a = H50.g("code", i);
    }

    public static AbstractC2304np a(C0474Hi c0474Hi) throws Rw0 {
        AbstractC2304np c2170mT;
        int iH = c0474Hi.h();
        int iH2 = c0474Hi.h();
        if (c0474Hi.k() < iH2) {
            throw new Rw0("truncated option");
        }
        int iP = c0474Hi.p();
        c0474Hi.q(iH2);
        if (iH == 3) {
            c2170mT = new C2170mT();
        } else if (iH == 15) {
            c2170mT = new C2213ms();
        } else if (iH == 5 || iH == 6 || iH == 7) {
            c2170mT = new C0608Mn(iH, new int[0]);
        } else if (iH == 8) {
            c2170mT = new C0340Ce();
        } else if (iH != 10) {
            c2170mT = iH != 11 ? new C2032kz(iH) : new Ci0();
        } else {
            c2170mT = new C0680Ph();
        }
        c2170mT.e(c0474Hi);
        c0474Hi.n(iP);
        return c2170mT;
    }

    public static AbstractC2304np b(byte[] bArr) {
        return a(new C0474Hi(bArr));
    }

    public int c() {
        return this.a;
    }

    public byte[] d() {
        C0578Li c0578Li = new C0578Li();
        g(c0578Li);
        return c0578Li.g();
    }

    public abstract void e(C0474Hi c0474Hi);

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC2304np)) {
            return false;
        }
        AbstractC2304np abstractC2304np = (AbstractC2304np) obj;
        if (this.a != abstractC2304np.a) {
            return false;
        }
        return Arrays.equals(d(), abstractC2304np.d());
    }

    public abstract String f();

    public abstract void g(C0578Li c0578Li);

    public void h(C0578Li c0578Li) {
        c0578Li.l(this.a);
        int iB = c0578Li.b();
        c0578Li.l(0);
        g(c0578Li);
        c0578Li.m((c0578Li.b() - iB) - 2, iB);
    }

    public int hashCode() {
        int i = 0;
        for (byte b : d()) {
            i += (i << 3) + (b & 255);
        }
        return i;
    }

    public byte[] i() {
        C0578Li c0578Li = new C0578Li();
        h(c0578Li);
        return c0578Li.g();
    }

    public String toString() {
        return "{" + a.a(this.a) + ": " + f() + "}";
    }
}
