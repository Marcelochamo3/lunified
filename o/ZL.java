package o;

/* JADX INFO: loaded from: classes.dex */
public final class ZL extends AbstractC1162c30 {
    public static final ZL b = new ZL(C1382eM.a);

    @Override // o.AbstractC1162c30
    public final int c(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // o.AbstractC1162c30
    public final void d(C1909jm0 c1909jm0, Object obj, int i) {
        long[] jArr = (long[]) obj;
        AbstractC1474fG.j(c1909jm0, "encoder");
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            C1065b30 c1065b30 = this.a;
            AbstractC1474fG.j(c1065b30, "descriptor");
            c1909jm0.i(c1065b30, i2);
            c1909jm0.m(j);
        }
    }
}
