package o;

/* JADX INFO: renamed from: o.b9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1076b9 extends AbstractC1162c30 {
    public static final C1076b9 b = new C1076b9(C1173c9.a);

    @Override // o.AbstractC1162c30
    public final int c(Object obj) {
        return ((boolean[]) obj).length;
    }

    @Override // o.AbstractC1162c30
    public final void d(C1909jm0 c1909jm0, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        AbstractC1474fG.j(c1909jm0, "encoder");
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = zArr[i2];
            C1065b30 c1065b30 = this.a;
            AbstractC1474fG.j(c1065b30, "descriptor");
            c1909jm0.i(c1065b30, i2);
            c1909jm0.e(z);
        }
    }
}
