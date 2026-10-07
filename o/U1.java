package o;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class U1 implements T9 {
    public static final U1 r = new U1(null, new T1[0], 0, -9223372036854775807L, 0);
    public static final T1 s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final S1 x;
    public final Object l;
    public final int m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f547o;
    public final int p;
    public final T1[] q;

    static {
        T1 t1 = new T1(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        int[] iArr = t1.p;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = t1.q;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        s = new T1(t1.l, 0, t1.n, iArrCopyOf, (Uri[]) Arrays.copyOf(t1.f524o, 0), jArrCopyOf, t1.r, t1.s);
        int i = Lr0.a;
        t = Integer.toString(1, 36);
        u = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        w = Integer.toString(4, 36);
        x = new S1(0);
    }

    public U1(Object obj, T1[] t1Arr, long j, long j2, int i) {
        this.l = obj;
        this.n = j;
        this.f547o = j2;
        this.m = t1Arr.length + i;
        this.q = t1Arr;
        this.p = i;
    }

    public final T1 a(int i) {
        int i2 = this.p;
        return i < i2 ? s : this.q[i - i2];
    }

    public final boolean b(int i) {
        if (i == this.m - 1) {
            T1 t1A = a(i);
            if (t1A.s && t1A.l == Long.MIN_VALUE && t1A.m == -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || U1.class != obj.getClass()) {
            return false;
        }
        U1 u1 = (U1) obj;
        return Lr0.a(this.l, u1.l) && this.m == u1.m && this.n == u1.n && this.f547o == u1.f547o && this.p == u1.p && Arrays.equals(this.q, u1.q);
    }

    public final int hashCode() {
        int i = this.m * 31;
        Object obj = this.l;
        return ((((((((i + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.n)) * 31) + ((int) this.f547o)) * 31) + this.p) * 31) + Arrays.hashCode(this.q);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.l);
        sb.append(", adResumePositionUs=");
        sb.append(this.n);
        sb.append(", adGroups=[");
        int i = 0;
        while (true) {
            T1[] t1Arr = this.q;
            if (i >= t1Arr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=");
            sb.append(t1Arr[i].l);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < t1Arr[i].p.length; i2++) {
                sb.append("ad(state=");
                int i3 = t1Arr[i].p[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(t1Arr[i].q[i2]);
                sb.append(')');
                if (i2 < t1Arr[i].p.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < t1Arr.length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
