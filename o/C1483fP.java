package o;

import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: o.fP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1483fP implements T9 {
    public static final C0633Nm A;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public final Uri l;
    public final String m;
    public final C1190cP n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final XO f773o;
    public final List p;
    public final String q;
    public final AbstractC0985aF r;
    public final Object s;

    static {
        int i = Lr0.a;
        t = Integer.toString(0, 36);
        u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        w = Integer.toString(3, 36);
        x = Integer.toString(4, 36);
        y = Integer.toString(5, 36);
        z = Integer.toString(6, 36);
        A = new C0633Nm(16);
    }

    public C1483fP(Uri uri, String str, C1190cP c1190cP, XO xo, List list, String str2, AbstractC0985aF abstractC0985aF, Object obj) {
        this.l = uri;
        this.m = str;
        this.n = c1190cP;
        this.f773o = xo;
        this.p = list;
        this.q = str2;
        this.r = abstractC0985aF;
        WE weK = AbstractC0985aF.k();
        for (int i = 0; i < abstractC0985aF.size(); i++) {
            weK.c(C1777iP.a(((C1873jP) abstractC0985aF.get(i)).a()));
        }
        weK.g();
        this.s = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1483fP)) {
            return false;
        }
        C1483fP c1483fP = (C1483fP) obj;
        return this.l.equals(c1483fP.l) && Lr0.a(this.m, c1483fP.m) && Lr0.a(this.n, c1483fP.n) && Lr0.a(this.f773o, c1483fP.f773o) && this.p.equals(c1483fP.p) && Lr0.a(this.q, c1483fP.q) && this.r.equals(c1483fP.r) && Lr0.a(this.s, c1483fP.s);
    }

    public final int hashCode() {
        int iHashCode = this.l.hashCode() * 31;
        String str = this.m;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C1190cP c1190cP = this.n;
        int iHashCode3 = (iHashCode2 + (c1190cP == null ? 0 : c1190cP.hashCode())) * 31;
        XO xo = this.f773o;
        int iHashCode4 = (this.p.hashCode() + ((iHashCode3 + (xo == null ? 0 : xo.hashCode())) * 31)) * 31;
        String str2 = this.q;
        int iHashCode5 = (this.r.hashCode() + ((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Object obj = this.s;
        return iHashCode5 + (obj != null ? obj.hashCode() : 0);
    }
}
