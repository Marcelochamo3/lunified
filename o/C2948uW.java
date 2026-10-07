package o;

/* JADX INFO: renamed from: o.uW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2948uW {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 6;
    private static final MQ g;

    static {
        MQ mq = new MQ("DNS Opcode", 2);
        g = mq;
        mq.m(15);
        mq.o("RESERVED");
        mq.n(true);
        mq.b(0, "QUERY");
        mq.b(1, "IQUERY");
        mq.b(2, "STATUS");
        mq.b(4, "NOTIFY");
        mq.b(5, "UPDATE");
        mq.b(6, "DSO");
    }

    private C2948uW() {
    }

    public static String a(int i) {
        return g.f(i);
    }

    public static int b(String str) {
        return g.g(str);
    }
}
