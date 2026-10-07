package o;

/* JADX INFO: loaded from: classes.dex */
public final class Ad0 extends AbstractC1162c30 {
    public static final Ad0 b = new Ad0(Bd0.a);

    @Override // o.AbstractC1162c30
    public final int c(Object obj) {
        return ((short[]) obj).length;
    }

    @Override // o.AbstractC1162c30
    public final void d(C1909jm0 c1909jm0, Object obj, int i) {
        short[] sArr = (short[]) obj;
        AbstractC1474fG.j(c1909jm0, "encoder");
        for (int i2 = 0; i2 < i; i2++) {
            short s = sArr[i2];
            C1065b30 c1065b30 = this.a;
            AbstractC1474fG.j(c1065b30, "descriptor");
            c1909jm0.i(c1065b30, i2);
            c1909jm0.p(s);
        }
    }
}
