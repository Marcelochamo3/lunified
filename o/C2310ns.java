package o;

/* JADX INFO: renamed from: o.ns, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2310ns {
    private static final MQ a;
    public static final int b = 32768;

    static {
        MQ mq = new MQ("EDNS Flag", 3);
        a = mq;
        mq.m(AQ.w);
        mq.o("FLAG");
        mq.n(true);
        mq.b(32768, "do");
    }

    private C2310ns() {
    }

    public static String a(int i) {
        return a.f(i);
    }

    public static String b(int i) {
        return a.f(1 << (15 - i));
    }

    public static int c(String str) {
        return a.g(str);
    }
}
