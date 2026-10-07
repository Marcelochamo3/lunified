package o;

/* JADX INFO: loaded from: classes.dex */
public final class Yb0 {
    private static final long a = 4294967295L;

    private Yb0() {
    }

    public static int a(long j, long j2) {
        if (j < 0 || j > a) {
            throw new IllegalArgumentException(j + " out of range");
        }
        if (j2 < 0 || j2 > a) {
            throw new IllegalArgumentException(j2 + " out of range");
        }
        long j3 = j - j2;
        if (j3 >= a) {
            j3 -= 4294967296L;
        } else if (j3 < -4294967295L) {
            j3 += 4294967296L;
        }
        return (int) j3;
    }

    public static long b(long j) {
        if (j >= 0 && j <= a) {
            if (j == a) {
                return 1L;
            }
            return j + 1;
        }
        throw new IllegalArgumentException(j + " out of range");
    }
}
