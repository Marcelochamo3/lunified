package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class Nb0 {
    public static final J2 b;
    public static final J2 c;
    public static final J2 d;
    public static final J2 e;
    public static final int a = AbstractC0397Ej.I("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12);
    public static final int f = AbstractC0397Ej.I("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12);

    static {
        int i = 10;
        boolean z = false;
        b = new J2(i, "PERMIT", z);
        c = new J2(i, "TAKEN", z);
        d = new J2(i, "BROKEN", z);
        e = new J2(i, "CANCELLED", z);
    }

    public static Mb0 a(int i) {
        return new Mb0(i, 0);
    }
}
