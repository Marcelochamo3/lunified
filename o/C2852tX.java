package o;

/* JADX INFO: renamed from: o.tX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2852tX {
    public static final C2852tX c = new C2852tX(false, false);
    public static final C2852tX d = new C2852tX(true, true);
    public final boolean a;
    public final boolean b;

    public C2852tX(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final void a(F6 f6) {
        if (f6 == null || this.b) {
            return;
        }
        for (int i = 0; i < f6.l; i++) {
            if (!F6.q(f6.m[i])) {
                String[] strArr = f6.m;
                strArr[i] = AP.o(strArr[i]);
            }
        }
    }

    public final String b(String str) {
        String strTrim = str.trim();
        return !this.a ? AP.o(strTrim) : strTrim;
    }
}
