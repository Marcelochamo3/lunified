package o;

import java.util.Arrays;

/* JADX INFO: renamed from: o.gf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1602gf implements T9 {
    public static final C1602gf q = new C1602gf(1, 2, 3, null);
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final S1 v;
    public final int l;
    public final int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte[] f796o;
    public int p;

    static {
        int i = Lr0.a;
        r = Integer.toString(0, 36);
        s = Integer.toString(1, 36);
        t = Integer.toString(2, 36);
        u = Integer.toString(3, 36);
        v = new S1(3);
    }

    public C1602gf(int i, int i2, int i3, byte[] bArr) {
        this.l = i;
        this.m = i2;
        this.n = i3;
        this.f796o = bArr;
    }

    public static String a(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i != 6) {
            return i != 7 ? "Undefined color transfer" : "HLG";
        }
        return "ST2084 PQ";
    }

    public static int b(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int c(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1602gf.class != obj.getClass()) {
            return false;
        }
        C1602gf c1602gf = (C1602gf) obj;
        return this.l == c1602gf.l && this.m == c1602gf.m && this.n == c1602gf.n && Arrays.equals(this.f796o, c1602gf.f796o);
    }

    public final int hashCode() {
        if (this.p == 0) {
            this.p = Arrays.hashCode(this.f796o) + ((((((527 + this.l) * 31) + this.m) * 31) + this.n) * 31);
        }
        return this.p;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        int i = this.l;
        if (i == -1) {
            str = "Unset color space";
        } else if (i == 6) {
            str = "BT2020";
        } else if (i != 1) {
            str = i != 2 ? "Undefined color space" : "BT601";
        } else {
            str = "BT709";
        }
        sb.append(str);
        sb.append(", ");
        int i2 = this.m;
        if (i2 == -1) {
            str2 = "Unset color range";
        } else if (i2 != 1) {
            str2 = i2 != 2 ? "Undefined color range" : "Limited range";
        } else {
            str2 = "Full range";
        }
        sb.append(str2);
        sb.append(", ");
        sb.append(a(this.n));
        sb.append(", ");
        sb.append(this.f796o != null);
        sb.append(")");
        return sb.toString();
    }
}
