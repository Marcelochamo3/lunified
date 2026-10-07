package o;

/* JADX INFO: renamed from: o.hs0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1727hs0 {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public int a;
    public int b;
    public final byte[] c;

    public C1727hs0() {
        this.c = new byte[8];
    }

    public static long a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public static int b(int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            if ((d[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
        }
        return -1;
    }

    public long c(C0554Kk c0554Kk, boolean z, boolean z2, int i) {
        int i2 = this.a;
        byte[] bArr = this.c;
        if (i2 == 0) {
            if (!c0554Kk.a(bArr, 0, 1, z)) {
                return -1L;
            }
            int iB = b(bArr[0] & 255);
            this.b = iB;
            if (iB == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.a = 1;
        }
        int i3 = this.b;
        if (i3 > i) {
            this.a = 0;
            return -2L;
        }
        if (i3 != 1) {
            c0554Kk.a(bArr, 1, i3 - 1, false);
        }
        this.a = 0;
        return a(bArr, this.b, z2);
    }

    public C1727hs0(byte[] bArr, int i, int i2) {
        this.c = bArr;
        this.a = i;
        this.b = i2;
    }
}
