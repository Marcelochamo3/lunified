package o;

import java.util.Collections;

/* JADX INFO: renamed from: o.kP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1971kP implements T9 {
    public static final C1971kP r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final C0633Nm y;
    public final String l;
    public final C1483fP m;
    public final C1385eP n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C2263nP f866o;
    public final C0995aP p;
    public final C1581gP q;

    static {
        YO yo = new YO();
        XE xe = AbstractC0985aF.m;
        M60 m60 = M60.p;
        Collections.emptyList();
        M60 m61 = M60.p;
        r = new C1971kP("", new C0995aP(yo), null, new C1385eP(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C2263nP.T, C1581gP.n);
        int i = Lr0.a;
        s = Integer.toString(0, 36);
        t = Integer.toString(1, 36);
        u = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        w = Integer.toString(4, 36);
        x = Integer.toString(5, 36);
        y = new C0633Nm(11);
    }

    public C1971kP(String str, C0995aP c0995aP, C1483fP c1483fP, C1385eP c1385eP, C2263nP c2263nP, C1581gP c1581gP) {
        this.l = str;
        this.m = c1483fP;
        this.n = c1385eP;
        this.f866o = c2263nP;
        this.p = c0995aP;
        this.q = c1581gP;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1971kP)) {
            return false;
        }
        C1971kP c1971kP = (C1971kP) obj;
        return Lr0.a(this.l, c1971kP.l) && this.p.equals(c1971kP.p) && Lr0.a(this.m, c1971kP.m) && Lr0.a(this.n, c1971kP.n) && Lr0.a(this.f866o, c1971kP.f866o) && Lr0.a(this.q, c1971kP.q);
    }

    public final int hashCode() {
        int iHashCode = this.l.hashCode() * 31;
        C1483fP c1483fP = this.m;
        return this.q.hashCode() + ((this.f866o.hashCode() + ((this.p.hashCode() + ((this.n.hashCode() + ((iHashCode + (c1483fP != null ? c1483fP.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
