package o;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: o.Gk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0450Gk {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final C1727hs0 c = new C1727hs0();
    public C0334By d;
    public int e;
    public int f;
    public long g;

    public final long a(C0554Kk c0554Kk, int i) {
        byte[] bArr = this.a;
        c0554Kk.a(bArr, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }
}
