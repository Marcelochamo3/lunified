package o;

/* JADX INFO: renamed from: o.Ci, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0344Ci {
    public static final int a = 1;
    public static final int b = 3;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 4;
    public static final int f = 254;
    public static final int g = 255;
    private static final MQ h;

    /* JADX INFO: renamed from: o.Ci$a */
    public static class a extends MQ {
        public a() {
            super("DClass", 2);
            o("CLASS");
        }

        @Override // o.MQ
        public void e(int i) {
            C0344Ci.a(i);
        }
    }

    static {
        a aVar = new a();
        h = aVar;
        aVar.b(1, "IN");
        aVar.b(3, "CH");
        aVar.c(3, "CHAOS");
        aVar.b(4, "HS");
        aVar.c(4, "HESIOD");
        aVar.b(254, "NONE");
        aVar.b(255, "ANY");
    }

    private C0344Ci() {
    }

    public static void a(int i) {
        if (i < 0 || i > 65535) {
            throw new C1864jG(i);
        }
    }

    public static String b(int i) {
        return h.f(i);
    }

    public static int c(String str) {
        return h.g(str);
    }
}
