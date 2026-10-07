package o;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: renamed from: o.nP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2263nP implements T9 {
    public static final String A0;
    public static final C0633Nm B0;
    public static final C2263nP T = new C2263nP(new C2166mP());
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public static final String o0;
    public static final String p0;
    public static final String q0;
    public static final String r0;
    public static final String s0;
    public static final String t0;
    public static final String u0;
    public static final String v0;
    public static final String w0;
    public static final String x0;
    public static final String y0;
    public static final String z0;
    public final Boolean A;
    public final Boolean B;
    public final Integer C;
    public final Integer D;
    public final Integer E;
    public final Integer F;
    public final Integer G;
    public final Integer H;
    public final Integer I;
    public final CharSequence J;
    public final CharSequence K;
    public final CharSequence L;
    public final Integer M;
    public final Integer N;
    public final CharSequence O;
    public final CharSequence P;
    public final CharSequence Q;
    public final Integer R;
    public final Bundle S;
    public final CharSequence l;
    public final CharSequence m;
    public final CharSequence n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CharSequence f935o;
    public final CharSequence p;
    public final CharSequence q;
    public final CharSequence r;
    public final AbstractC2530q50 s;
    public final AbstractC2530q50 t;
    public final byte[] u;
    public final Integer v;
    public final Uri w;
    public final Integer x;
    public final Integer y;
    public final Integer z;

    static {
        int i = Lr0.a;
        U = Integer.toString(0, 36);
        V = Integer.toString(1, 36);
        W = Integer.toString(2, 36);
        X = Integer.toString(3, 36);
        Y = Integer.toString(4, 36);
        Z = Integer.toString(5, 36);
        a0 = Integer.toString(6, 36);
        b0 = Integer.toString(8, 36);
        c0 = Integer.toString(9, 36);
        d0 = Integer.toString(10, 36);
        e0 = Integer.toString(11, 36);
        f0 = Integer.toString(12, 36);
        g0 = Integer.toString(13, 36);
        h0 = Integer.toString(14, 36);
        i0 = Integer.toString(15, 36);
        j0 = Integer.toString(16, 36);
        k0 = Integer.toString(17, 36);
        l0 = Integer.toString(18, 36);
        m0 = Integer.toString(19, 36);
        n0 = Integer.toString(20, 36);
        o0 = Integer.toString(21, 36);
        p0 = Integer.toString(22, 36);
        q0 = Integer.toString(23, 36);
        r0 = Integer.toString(24, 36);
        s0 = Integer.toString(25, 36);
        t0 = Integer.toString(26, 36);
        u0 = Integer.toString(27, 36);
        v0 = Integer.toString(28, 36);
        w0 = Integer.toString(29, 36);
        x0 = Integer.toString(30, 36);
        y0 = Integer.toString(31, 36);
        z0 = Integer.toString(32, 36);
        A0 = Integer.toString(1000, 36);
        B0 = new C0633Nm(20);
    }

    public C2263nP(C2166mP c2166mP) {
        Boolean boolValueOf = c2166mP.p;
        Integer numValueOf = c2166mP.f912o;
        Integer numValueOf2 = c2166mP.F;
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case C3080vp0.H /* 34 */:
                        case C3080vp0.I /* 35 */:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i3 = i;
                }
                numValueOf = Integer.valueOf(i3);
            }
        } else if (numValueOf != null) {
            boolean z = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z);
            if (z && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i2);
            }
        }
        this.l = c2166mP.a;
        this.m = c2166mP.b;
        this.n = c2166mP.c;
        this.f935o = c2166mP.d;
        this.p = c2166mP.e;
        this.q = c2166mP.f;
        this.r = c2166mP.g;
        this.s = c2166mP.h;
        this.t = c2166mP.i;
        this.u = c2166mP.j;
        this.v = c2166mP.k;
        this.w = c2166mP.l;
        this.x = c2166mP.m;
        this.y = c2166mP.n;
        this.z = numValueOf;
        this.A = boolValueOf;
        this.B = c2166mP.q;
        Integer num = c2166mP.r;
        this.C = num;
        this.D = num;
        this.E = c2166mP.s;
        this.F = c2166mP.t;
        this.G = c2166mP.u;
        this.H = c2166mP.v;
        this.I = c2166mP.w;
        this.J = c2166mP.x;
        this.K = c2166mP.y;
        this.L = c2166mP.z;
        this.M = c2166mP.A;
        this.N = c2166mP.B;
        this.O = c2166mP.C;
        this.P = c2166mP.D;
        this.Q = c2166mP.E;
        this.R = numValueOf2;
        this.S = c2166mP.G;
    }

    public final C2166mP a() {
        C2166mP c2166mP = new C2166mP();
        c2166mP.a = this.l;
        c2166mP.b = this.m;
        c2166mP.c = this.n;
        c2166mP.d = this.f935o;
        c2166mP.e = this.p;
        c2166mP.f = this.q;
        c2166mP.g = this.r;
        c2166mP.h = this.s;
        c2166mP.i = this.t;
        c2166mP.j = this.u;
        c2166mP.k = this.v;
        c2166mP.l = this.w;
        c2166mP.m = this.x;
        c2166mP.n = this.y;
        c2166mP.f912o = this.z;
        c2166mP.p = this.A;
        c2166mP.q = this.B;
        c2166mP.r = this.D;
        c2166mP.s = this.E;
        c2166mP.t = this.F;
        c2166mP.u = this.G;
        c2166mP.v = this.H;
        c2166mP.w = this.I;
        c2166mP.x = this.J;
        c2166mP.y = this.K;
        c2166mP.z = this.L;
        c2166mP.A = this.M;
        c2166mP.B = this.N;
        c2166mP.C = this.O;
        c2166mP.D = this.P;
        c2166mP.E = this.Q;
        c2166mP.F = this.R;
        c2166mP.G = this.S;
        return c2166mP;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2263nP.class != obj.getClass()) {
            return false;
        }
        C2263nP c2263nP = (C2263nP) obj;
        return Lr0.a(this.l, c2263nP.l) && Lr0.a(this.m, c2263nP.m) && Lr0.a(this.n, c2263nP.n) && Lr0.a(this.f935o, c2263nP.f935o) && Lr0.a(this.p, c2263nP.p) && Lr0.a(this.q, c2263nP.q) && Lr0.a(this.r, c2263nP.r) && Lr0.a(this.s, c2263nP.s) && Lr0.a(this.t, c2263nP.t) && Arrays.equals(this.u, c2263nP.u) && Lr0.a(this.v, c2263nP.v) && Lr0.a(this.w, c2263nP.w) && Lr0.a(this.x, c2263nP.x) && Lr0.a(this.y, c2263nP.y) && Lr0.a(this.z, c2263nP.z) && Lr0.a(this.A, c2263nP.A) && Lr0.a(this.B, c2263nP.B) && Lr0.a(this.D, c2263nP.D) && Lr0.a(this.E, c2263nP.E) && Lr0.a(this.F, c2263nP.F) && Lr0.a(this.G, c2263nP.G) && Lr0.a(this.H, c2263nP.H) && Lr0.a(this.I, c2263nP.I) && Lr0.a(this.J, c2263nP.J) && Lr0.a(this.K, c2263nP.K) && Lr0.a(this.L, c2263nP.L) && Lr0.a(this.M, c2263nP.M) && Lr0.a(this.N, c2263nP.N) && Lr0.a(this.O, c2263nP.O) && Lr0.a(this.P, c2263nP.P) && Lr0.a(this.Q, c2263nP.Q) && Lr0.a(this.R, c2263nP.R);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.l, this.m, this.n, this.f935o, this.p, this.q, this.r, this.s, this.t, Integer.valueOf(Arrays.hashCode(this.u)), this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R});
    }
}
