package o;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class T1 implements T9 {
    public static final String A;
    public static final S1 B;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public final long l;
    public final int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Uri[] f524o;
    public final int[] p;
    public final long[] q;
    public final long r;
    public final boolean s;

    static {
        int i = Lr0.a;
        t = Integer.toString(0, 36);
        u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        w = Integer.toString(3, 36);
        x = Integer.toString(4, 36);
        y = Integer.toString(5, 36);
        z = Integer.toString(6, 36);
        A = Integer.toString(7, 36);
        B = new S1(1);
    }

    public T1(long j, int i, int i2, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z2) {
        AbstractC0397Ej.c(iArr.length == uriArr.length);
        this.l = j;
        this.m = i;
        this.n = i2;
        this.p = iArr;
        this.f524o = uriArr;
        this.q = jArr;
        this.r = j2;
        this.s = z2;
    }

    public final int a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.p;
            if (i3 >= iArr.length || this.s || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || T1.class != obj.getClass()) {
            return false;
        }
        T1 t1 = (T1) obj;
        return this.l == t1.l && this.m == t1.m && this.n == t1.n && Arrays.equals(this.f524o, t1.f524o) && Arrays.equals(this.p, t1.p) && Arrays.equals(this.q, t1.q) && this.r == t1.r && this.s == t1.s;
    }

    public final int hashCode() {
        int i = ((this.m * 31) + this.n) * 31;
        long j = this.l;
        int iHashCode = (Arrays.hashCode(this.q) + ((Arrays.hashCode(this.p) + ((((i + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f524o)) * 31)) * 31)) * 31;
        long j2 = this.r;
        return ((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.s ? 1 : 0);
    }
}
