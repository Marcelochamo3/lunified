package o;

/* JADX INFO: renamed from: o.l50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2045l50 {
    public static final C1947k50 l = new C1947k50();
    public static final AbstractC1350e0 m;

    static {
        Integer num = AbstractC0987aH.a;
        m = (num == null || num.intValue() >= 34) ? new ZY() : new C0587Ls();
    }

    public abstract int a(int i);

    public abstract int b();

    public int c(int i, int i2) {
        int iB;
        int i3;
        int iA;
        if (i2 <= i) {
            throw new IllegalArgumentException(("Random range is empty: [" + Integer.valueOf(i) + ", " + Integer.valueOf(i2) + ").").toString());
        }
        int i4 = i2 - i;
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            if (((-i4) & i4) == i4) {
                iA = a(31 - Integer.numberOfLeadingZeros(i4));
            } else {
                do {
                    iB = b() >>> 1;
                    i3 = iB % i4;
                } while ((i4 - 1) + (iB - i3) < 0);
                iA = i3;
            }
            return i + iA;
        }
        while (true) {
            int iB2 = b();
            if (i <= iB2 && iB2 < i2) {
                return iB2;
            }
        }
    }
}
