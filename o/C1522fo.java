package o;

/* JADX INFO: renamed from: o.fo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1522fo extends AbstractC1162c30 {
    public static final C1522fo b = new C1522fo(C1620go.a);

    @Override // o.AbstractC1162c30
    public final int c(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // o.AbstractC1162c30
    public final void d(C1909jm0 c1909jm0, Object obj, int i) {
        double[] dArr = (double[]) obj;
        AbstractC1474fG.j(c1909jm0, "encoder");
        for (int i2 = 0; i2 < i; i2++) {
            double d = dArr[i2];
            C1065b30 c1065b30 = this.a;
            AbstractC1474fG.j(c1065b30, "descriptor");
            c1909jm0.i(c1065b30, i2);
            c1909jm0.h(d);
        }
    }
}
