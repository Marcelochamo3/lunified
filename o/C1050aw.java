package o;

/* JADX INFO: renamed from: o.aw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1050aw extends AbstractC1162c30 {
    public static final C1050aw b = new C1050aw(C1148bw.a);

    @Override // o.AbstractC1162c30
    public final int c(Object obj) {
        return ((float[]) obj).length;
    }

    @Override // o.AbstractC1162c30
    public final void d(C1909jm0 c1909jm0, Object obj, int i) {
        float[] fArr = (float[]) obj;
        AbstractC1474fG.j(c1909jm0, "encoder");
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            C1065b30 c1065b30 = this.a;
            AbstractC1474fG.j(c1065b30, "descriptor");
            c1909jm0.i(c1065b30, i2);
            c1909jm0.k(f);
        }
    }
}
