package o;

import android.net.Uri;

/* JADX INFO: renamed from: o.jP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1873jP implements T9 {
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final C0633Nm z;
    public final Uri l;
    public final String m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f844o;
    public final int p;
    public final String q;
    public final String r;

    static {
        int i = Lr0.a;
        s = Integer.toString(0, 36);
        t = Integer.toString(1, 36);
        u = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        w = Integer.toString(4, 36);
        x = Integer.toString(5, 36);
        y = Integer.toString(6, 36);
        z = new C0633Nm(19);
    }

    public C1873jP(C1777iP c1777iP) {
        this.l = c1777iP.a;
        this.m = c1777iP.b;
        this.n = c1777iP.c;
        this.f844o = c1777iP.d;
        this.p = c1777iP.e;
        this.q = c1777iP.f;
        this.r = c1777iP.g;
    }

    public final C1777iP a() {
        C1777iP c1777iP = new C1777iP();
        c1777iP.a = this.l;
        c1777iP.b = this.m;
        c1777iP.c = this.n;
        c1777iP.d = this.f844o;
        c1777iP.e = this.p;
        c1777iP.f = this.q;
        c1777iP.g = this.r;
        return c1777iP;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1873jP)) {
            return false;
        }
        C1873jP c1873jP = (C1873jP) obj;
        return this.l.equals(c1873jP.l) && Lr0.a(this.m, c1873jP.m) && Lr0.a(this.n, c1873jP.n) && this.f844o == c1873jP.f844o && this.p == c1873jP.p && Lr0.a(this.q, c1873jP.q) && Lr0.a(this.r, c1873jP.r);
    }

    public final int hashCode() {
        int iHashCode = this.l.hashCode() * 31;
        String str = this.m;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.n;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f844o) * 31) + this.p) * 31;
        String str3 = this.q;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.r;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
