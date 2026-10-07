package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Zl0 implements T9 {
    public static final String q;
    public static final String r;
    public static final C1306dd0 s;
    public final int l;
    public final String m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0643Nw[] f665o;
    public int p;

    static {
        int i = Lr0.a;
        q = Integer.toString(0, 36);
        r = Integer.toString(1, 36);
        s = new C1306dd0(7);
    }

    public Zl0(String str, C0643Nw... c0643NwArr) {
        AbstractC0397Ej.c(c0643NwArr.length > 0);
        this.m = str;
        this.f665o = c0643NwArr;
        this.l = c0643NwArr.length;
        int i = IQ.i(c0643NwArr[0].w);
        this.n = i == -1 ? IQ.i(c0643NwArr[0].v) : i;
        String str2 = c0643NwArr[0].n;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i2 = c0643NwArr[0].p | 16384;
        for (int i3 = 1; i3 < c0643NwArr.length; i3++) {
            String str3 = c0643NwArr[i3].n;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                b(i3, "languages", c0643NwArr[0].n, c0643NwArr[i3].n);
                return;
            } else {
                if (i2 != (c0643NwArr[i3].p | 16384)) {
                    b(i3, "role flags", Integer.toBinaryString(c0643NwArr[0].p), Integer.toBinaryString(c0643NwArr[i3].p));
                    return;
                }
            }
        }
    }

    public static void b(int i, String str, String str2, String str3) {
        AP.g("", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    public final int a(C0643Nw c0643Nw) {
        int i = 0;
        while (true) {
            C0643Nw[] c0643NwArr = this.f665o;
            if (i >= c0643NwArr.length) {
                return -1;
            }
            if (c0643Nw == c0643NwArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Zl0.class != obj.getClass()) {
            return false;
        }
        Zl0 zl0 = (Zl0) obj;
        return this.m.equals(zl0.m) && Arrays.equals(this.f665o, zl0.f665o);
    }

    public final int hashCode() {
        if (this.p == 0) {
            this.p = AbstractC1674hK.i(527, this.m, 31) + Arrays.hashCode(this.f665o);
        }
        return this.p;
    }
}
