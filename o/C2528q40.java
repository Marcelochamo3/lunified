package o;

/* JADX INFO: renamed from: o.q40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2528q40 {
    public boolean c;
    public boolean d;
    public boolean e;
    public final Oj0 a = new Oj0(0);
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public final C2562qX b = new C2562qX();

    public static int b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long c(C2562qX c2562qX) {
        int i = c2562qX.b;
        if (c2562qX.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c2562qX.e(bArr, 0, 9);
        c2562qX.F(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(C0554Kk c0554Kk) {
        byte[] bArr = Lr0.e;
        C2562qX c2562qX = this.b;
        c2562qX.getClass();
        c2562qX.D(bArr.length, bArr);
        this.c = true;
        c0554Kk.q = 0;
    }
}
