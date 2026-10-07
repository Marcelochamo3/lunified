package o;

/* JADX INFO: renamed from: o.em0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1421em0 {
    public final Wl0 a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public C1421em0(Wl0 wl0, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        AbstractC0397Ej.c(iArr.length == jArr2.length);
        AbstractC0397Ej.c(jArr.length == jArr2.length);
        AbstractC0397Ej.c(iArr2.length == jArr2.length);
        this.a = wl0;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j) {
        long[] jArr = this.f;
        for (int iB = Lr0.b(jArr, j, true); iB < jArr.length; iB++) {
            if ((this.g[iB] & 1) != 0) {
                return iB;
            }
        }
        return -1;
    }
}
