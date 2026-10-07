package o;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Ej0 implements T9 {
    public static final Object C = new Object();
    public static final Object D = new Object();
    public static final C1971kP E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public int A;
    public long B;
    public Object m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f245o;
    public long p;
    public long q;
    public long r;
    public boolean s;
    public boolean t;
    public boolean u;
    public C1385eP v;
    public boolean w;
    public long x;
    public long y;
    public int z;
    public Object l = C;
    public C1971kP n = E;

    static {
        C1483fP c1483fP;
        YO yo = new YO();
        C1093bP c1093bP = new C1093bP();
        List listEmptyList = Collections.emptyList();
        M60 m60 = M60.p;
        C1581gP c1581gP = C1581gP.n;
        Uri uri = Uri.EMPTY;
        AbstractC0397Ej.f(c1093bP.b == null || c1093bP.a != null);
        if (uri != null) {
            c1483fP = new C1483fP(uri, null, c1093bP.a != null ? new C1190cP(c1093bP) : null, null, listEmptyList, null, m60, null);
        } else {
            c1483fP = null;
        }
        E = new C1971kP("o.Fj0", new C0995aP(yo), c1483fP, new C1385eP(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C2263nP.T, c1581gP);
        int i = Lr0.a;
        F = Integer.toString(1, 36);
        G = Integer.toString(2, 36);
        H = Integer.toString(3, 36);
        I = Integer.toString(4, 36);
        J = Integer.toString(5, 36);
        K = Integer.toString(6, 36);
        L = Integer.toString(7, 36);
        M = Integer.toString(8, 36);
        N = Integer.toString(9, 36);
        O = Integer.toString(10, 36);
        P = Integer.toString(11, 36);
        Q = Integer.toString(12, 36);
        R = Integer.toString(13, 36);
    }

    public final boolean a() {
        AbstractC0397Ej.f(this.u == (this.v != null));
        return this.v != null;
    }

    public final void b(Object obj, C1971kP c1971kP, Object obj2, long j, long j2, long j3, boolean z, boolean z2, C1385eP c1385eP, long j4, long j5, int i, int i2, long j6) {
        C1483fP c1483fP;
        this.l = obj;
        this.n = c1971kP != null ? c1971kP : E;
        this.m = (c1971kP == null || (c1483fP = c1971kP.m) == null) ? null : c1483fP.s;
        this.f245o = obj2;
        this.p = j;
        this.q = j2;
        this.r = j3;
        this.s = z;
        this.t = z2;
        this.u = c1385eP != null;
        this.v = c1385eP;
        this.x = j4;
        this.y = j5;
        this.z = i;
        this.A = i2;
        this.B = j6;
        this.w = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Ej0.class.equals(obj.getClass())) {
            return false;
        }
        Ej0 ej0 = (Ej0) obj;
        return Lr0.a(this.l, ej0.l) && Lr0.a(this.n, ej0.n) && Lr0.a(this.f245o, ej0.f245o) && Lr0.a(this.v, ej0.v) && this.p == ej0.p && this.q == ej0.q && this.r == ej0.r && this.s == ej0.s && this.t == ej0.t && this.w == ej0.w && this.x == ej0.x && this.y == ej0.y && this.z == ej0.z && this.A == ej0.A && this.B == ej0.B;
    }

    public final int hashCode() {
        int iHashCode = (this.n.hashCode() + ((this.l.hashCode() + 217) * 31)) * 31;
        Object obj = this.f245o;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        C1385eP c1385eP = this.v;
        int iHashCode3 = (iHashCode2 + (c1385eP != null ? c1385eP.hashCode() : 0)) * 31;
        long j = this.p;
        int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.q;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.r;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.s ? 1 : 0)) * 31) + (this.t ? 1 : 0)) * 31) + (this.w ? 1 : 0)) * 31;
        long j4 = this.x;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.y;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.z) * 31) + this.A) * 31;
        long j6 = this.B;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
