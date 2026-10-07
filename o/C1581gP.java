package o;

import android.net.Uri;

/* JADX INFO: renamed from: o.gP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1581gP implements T9 {
    public static final C1581gP n = new C1581gP(new RN(1));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f792o;
    public static final String p;
    public static final String q;
    public static final C0633Nm r;
    public final Uri l;
    public final String m;

    static {
        int i = Lr0.a;
        f792o = Integer.toString(0, 36);
        p = Integer.toString(1, 36);
        q = Integer.toString(2, 36);
        r = new C0633Nm(18);
    }

    public C1581gP(RN rn) {
        this.l = (Uri) rn.m;
        this.m = (String) rn.n;
        Object obj = rn.f488o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1581gP)) {
            return false;
        }
        C1581gP c1581gP = (C1581gP) obj;
        return Lr0.a(this.l, c1581gP.l) && Lr0.a(this.m, c1581gP.m);
    }

    public final int hashCode() {
        Uri uri = this.l;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.m;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
