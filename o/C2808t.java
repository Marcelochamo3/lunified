package o;

/* JADX INFO: renamed from: o.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2808t {
    public static final C2808t b;
    public static final C2808t c;
    public final Throwable a;

    static {
        if (E.h) {
            c = null;
            b = null;
        } else {
            c = new C2808t(null, false);
            b = new C2808t(null, true);
        }
    }

    public C2808t(Throwable th, boolean z) {
        this.a = th;
    }
}
