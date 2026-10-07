package o;

/* JADX INFO: renamed from: o.jL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1869jL extends Ut0 {
    public static final C3483zx c = new C3483zx(1);
    public final C2866tf0 b = new C2866tf0();

    @Override // o.Ut0
    public final void d() {
        C2866tf0 c2866tf0 = this.b;
        if (c2866tf0.h() > 0) {
            AbstractC1674hK.w(c2866tf0.j(0));
            throw null;
        }
        int i = c2866tf0.f1044o;
        Object[] objArr = c2866tf0.n;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        c2866tf0.f1044o = 0;
        c2866tf0.l = false;
    }
}
