package o;

/* JADX INFO: renamed from: o.xv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3285xv {
    private static final MQ a;
    public static final byte b = 0;
    public static final byte c = 5;
    public static final byte d = 6;
    public static final byte e = 7;
    public static final byte f = 8;
    public static final byte g = 10;
    public static final byte h = 11;
    public static final int i = 32768;

    static {
        MQ mq = new MQ("DNS Header Flag", 3);
        a = mq;
        mq.m(15);
        mq.o("FLAG");
        mq.n(true);
        mq.b(0, "qr");
        mq.b(5, "aa");
        mq.b(6, "tc");
        mq.b(7, "rd");
        mq.b(8, "ra");
        mq.b(10, "ad");
        mq.b(11, "cd");
    }

    private C3285xv() {
    }

    public static boolean a(int i2) {
        a.e(i2);
        return (i2 < 1 || i2 > 4) && i2 < 12;
    }

    public static String b(int i2) {
        return a.f(i2);
    }

    public static int c(String str) {
        return a.g(str);
    }
}
