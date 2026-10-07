package o;

/* JADX INFO: renamed from: o.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1448f0 {
    public static final C1448f0 b;
    public static final C1448f0 c;
    public final Throwable a;

    static {
        if (AbstractFutureC2034l0.d) {
            c = null;
            b = null;
        } else {
            c = new C1448f0(null, false);
            b = new C1448f0(null, true);
        }
    }

    public C1448f0(Throwable th, boolean z) {
        this.a = th;
    }
}
