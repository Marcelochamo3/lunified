package o;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: o.cP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1190cP implements T9 {
    public static final String A;
    public static final C0633Nm B;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public final UUID l;
    public final Uri m;
    public final AbstractC1278dF n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f714o;
    public final boolean p;
    public final boolean q;
    public final AbstractC0985aF r;
    public final byte[] s;

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
        B = new C0633Nm(14);
    }

    public C1190cP(C1093bP c1093bP) {
        AbstractC0397Ej.f((c1093bP.f && c1093bP.b == null) ? false : true);
        UUID uuid = c1093bP.a;
        uuid.getClass();
        this.l = uuid;
        this.m = c1093bP.b;
        this.n = c1093bP.c;
        this.f714o = c1093bP.d;
        this.q = c1093bP.f;
        this.p = c1093bP.e;
        this.r = c1093bP.g;
        byte[] bArr = c1093bP.h;
        this.s = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1190cP)) {
            return false;
        }
        C1190cP c1190cP = (C1190cP) obj;
        return this.l.equals(c1190cP.l) && Lr0.a(this.m, c1190cP.m) && Lr0.a(this.n, c1190cP.n) && this.f714o == c1190cP.f714o && this.q == c1190cP.q && this.p == c1190cP.p && this.r.equals(c1190cP.r) && Arrays.equals(this.s, c1190cP.s);
    }

    public final int hashCode() {
        int iHashCode = this.l.hashCode() * 31;
        Uri uri = this.m;
        return Arrays.hashCode(this.s) + ((this.r.hashCode() + ((((((((this.n.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f714o ? 1 : 0)) * 31) + (this.q ? 1 : 0)) * 31) + (this.p ? 1 : 0)) * 31)) * 31);
    }
}
