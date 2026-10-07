package o;

/* JADX INFO: loaded from: classes.dex */
public final class Nc0 {
    public int a;
    public final int[] b = new int[10];

    public final int a() {
        return (this.a & 128) != 0 ? this.b[7] : AQ.w;
    }

    public final void b(Nc0 nc0) {
        AbstractC1474fG.j(nc0, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & nc0.a) != 0) {
                c(i, nc0.b[i]);
            }
        }
    }

    public final void c(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i >= iArr.length) {
                return;
            }
            this.a = (1 << i) | this.a;
            iArr[i] = i2;
        }
    }
}
