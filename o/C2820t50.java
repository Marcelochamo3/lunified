package o;

/* JADX INFO: renamed from: o.t50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2820t50 {
    private static final MQ a;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;

    @Deprecated
    public static final int g = 4;
    public static final int h = 5;
    public static final int i = 6;
    public static final int j = 7;
    public static final int k = 8;
    public static final int l = 9;
    public static final int m = 10;
    public static final int n = 16;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f1039o = 16;
    public static final int p = 17;
    public static final int q = 18;
    public static final int r = 19;
    public static final int s = 20;
    public static final int t = 21;
    public static final int u = 22;
    public static final int v = 23;

    static {
        MQ mq = new MQ("DNS Rcode", 2);
        a = mq;
        mq.m(4095);
        mq.o("RESERVED");
        mq.n(true);
        mq.b(0, "NOERROR");
        mq.b(1, "FORMERR");
        mq.b(2, "SERVFAIL");
        mq.b(3, "NXDOMAIN");
        mq.b(4, "NOTIMP");
        mq.c(4, "NOTIMPL");
        mq.b(5, "REFUSED");
        mq.b(6, "YXDOMAIN");
        mq.b(7, "YXRRSET");
        mq.b(8, "NXRRSET");
        mq.b(9, "NOTAUTH");
        mq.b(10, "NOTZONE");
        mq.b(16, "BADVERS");
        mq.b(17, "BADKEY");
        mq.b(18, "BADTIME");
        mq.b(19, "BADMODE");
        mq.b(20, "BADNAME");
        mq.b(21, "BADALG");
        mq.b(22, "BADTRUNC");
        mq.b(23, "BADCOOKIE");
    }

    private C2820t50() {
    }

    public static String a(int i2) {
        return i2 == 16 ? "BADSIG" : b(i2);
    }

    public static String b(int i2) {
        return a.f(i2);
    }

    public static int c(String str) {
        if ("BADSIG".equalsIgnoreCase(str)) {
            return 16;
        }
        return a.g(str);
    }
}
