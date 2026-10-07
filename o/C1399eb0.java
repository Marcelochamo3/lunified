package o;

/* JADX INFO: renamed from: o.eb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1399eb0 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    private static final MQ h;
    private static final String[] i;
    private static final String[] j;

    static {
        MQ mq = new MQ("Message Section", 3);
        h = mq;
        i = new String[]{"QUESTIONS", "ANSWERS", "AUTHORITY RECORDS", "ADDITIONAL RECORDS"};
        j = new String[]{"ZONE", "PREREQUISITES", "UPDATE RECORDS", "ADDITIONAL RECORDS"};
        mq.m(3);
        mq.n(true);
        mq.b(0, "qd");
        mq.b(1, "an");
        mq.b(2, "au");
        mq.b(3, "ad");
    }

    private C1399eb0() {
    }

    public static String a(int i2) {
        h.e(i2);
        return i[i2];
    }

    public static String b(int i2) {
        return h.f(i2);
    }

    public static String c(int i2) {
        h.e(i2);
        return j[i2];
    }

    public static int d(String str) {
        return h.g(str);
    }
}
