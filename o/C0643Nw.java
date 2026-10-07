package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: o.Nw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0643Nw implements T9 {
    public final long A;
    public final int B;
    public final int C;
    public final float D;
    public final int E;
    public final float F;
    public final byte[] G;
    public final int H;
    public final C1602gf I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public int S;
    public final String l;
    public final String m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f421o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final String t;
    public final CQ u;
    public final String v;
    public final String w;
    public final int x;
    public final List y;
    public final C3271xo z;
    public static final C0643Nw T = new C0643Nw(new C0617Mw());
    public static final String U = Integer.toString(0, 36);
    public static final String V = Integer.toString(1, 36);
    public static final String W = Integer.toString(2, 36);
    public static final String X = Integer.toString(3, 36);
    public static final String Y = Integer.toString(4, 36);
    public static final String Z = Integer.toString(5, 36);
    public static final String a0 = Integer.toString(6, 36);
    public static final String b0 = Integer.toString(7, 36);
    public static final String c0 = Integer.toString(8, 36);
    public static final String d0 = Integer.toString(9, 36);
    public static final String e0 = Integer.toString(10, 36);
    public static final String f0 = Integer.toString(11, 36);
    public static final String g0 = Integer.toString(12, 36);
    public static final String h0 = Integer.toString(13, 36);
    public static final String i0 = Integer.toString(14, 36);
    public static final String j0 = Integer.toString(15, 36);
    public static final String k0 = Integer.toString(16, 36);
    public static final String l0 = Integer.toString(17, 36);
    public static final String m0 = Integer.toString(18, 36);
    public static final String n0 = Integer.toString(19, 36);
    public static final String o0 = Integer.toString(20, 36);
    public static final String p0 = Integer.toString(21, 36);
    public static final String q0 = Integer.toString(22, 36);
    public static final String r0 = Integer.toString(23, 36);
    public static final String s0 = Integer.toString(24, 36);
    public static final String t0 = Integer.toString(25, 36);
    public static final String u0 = Integer.toString(26, 36);
    public static final String v0 = Integer.toString(27, 36);
    public static final String w0 = Integer.toString(28, 36);
    public static final String x0 = Integer.toString(29, 36);
    public static final String y0 = Integer.toString(30, 36);
    public static final String z0 = Integer.toString(31, 36);
    public static final C0633Nm A0 = new C0633Nm(5);

    public C0643Nw(C0617Mw c0617Mw) {
        this.l = c0617Mw.a;
        this.m = c0617Mw.b;
        this.n = Lr0.L(c0617Mw.c);
        this.f421o = c0617Mw.d;
        this.p = c0617Mw.e;
        int i = c0617Mw.f;
        this.q = i;
        int i2 = c0617Mw.g;
        this.r = i2;
        this.s = i2 != -1 ? i2 : i;
        this.t = c0617Mw.h;
        this.u = c0617Mw.i;
        this.v = c0617Mw.j;
        this.w = c0617Mw.k;
        this.x = c0617Mw.l;
        List list = c0617Mw.m;
        this.y = list == null ? Collections.emptyList() : list;
        C3271xo c3271xo = c0617Mw.n;
        this.z = c3271xo;
        this.A = c0617Mw.f405o;
        this.B = c0617Mw.p;
        this.C = c0617Mw.q;
        this.D = c0617Mw.r;
        int i3 = c0617Mw.s;
        this.E = i3 == -1 ? 0 : i3;
        float f = c0617Mw.t;
        this.F = f == -1.0f ? 1.0f : f;
        this.G = c0617Mw.u;
        this.H = c0617Mw.v;
        this.I = c0617Mw.w;
        this.J = c0617Mw.x;
        this.K = c0617Mw.y;
        this.L = c0617Mw.z;
        int i4 = c0617Mw.A;
        this.M = i4 == -1 ? 0 : i4;
        int i5 = c0617Mw.B;
        this.N = i5 != -1 ? i5 : 0;
        this.O = c0617Mw.C;
        this.P = c0617Mw.D;
        this.Q = c0617Mw.E;
        int i6 = c0617Mw.F;
        if (i6 != 0 || c3271xo == null) {
            this.R = i6;
        } else {
            this.R = 1;
        }
    }

    public final C0617Mw a() {
        C0617Mw c0617Mw = new C0617Mw();
        c0617Mw.a = this.l;
        c0617Mw.b = this.m;
        c0617Mw.c = this.n;
        c0617Mw.d = this.f421o;
        c0617Mw.e = this.p;
        c0617Mw.f = this.q;
        c0617Mw.g = this.r;
        c0617Mw.h = this.t;
        c0617Mw.i = this.u;
        c0617Mw.j = this.v;
        c0617Mw.k = this.w;
        c0617Mw.l = this.x;
        c0617Mw.m = this.y;
        c0617Mw.n = this.z;
        c0617Mw.f405o = this.A;
        c0617Mw.p = this.B;
        c0617Mw.q = this.C;
        c0617Mw.r = this.D;
        c0617Mw.s = this.E;
        c0617Mw.t = this.F;
        c0617Mw.u = this.G;
        c0617Mw.v = this.H;
        c0617Mw.w = this.I;
        c0617Mw.x = this.J;
        c0617Mw.y = this.K;
        c0617Mw.z = this.L;
        c0617Mw.A = this.M;
        c0617Mw.B = this.N;
        c0617Mw.C = this.O;
        c0617Mw.D = this.P;
        c0617Mw.E = this.Q;
        c0617Mw.F = this.R;
        return c0617Mw;
    }

    public final int b() {
        int i;
        int i2 = this.B;
        if (i2 == -1 || (i = this.C) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final boolean c(C0643Nw c0643Nw) {
        List list = this.y;
        if (list.size() != c0643Nw.y.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) c0643Nw.y.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final C0643Nw d(C0643Nw c0643Nw) {
        String str;
        String str2;
        int i;
        int i2;
        if (this == c0643Nw) {
            return this;
        }
        int i3 = IQ.i(this.w);
        String str3 = c0643Nw.l;
        String str4 = c0643Nw.m;
        if (str4 == null) {
            str4 = this.m;
        }
        if ((i3 != 3 && i3 != 1) || (str = c0643Nw.n) == null) {
            str = this.n;
        }
        int i4 = this.q;
        if (i4 == -1) {
            i4 = c0643Nw.q;
        }
        int i5 = this.r;
        if (i5 == -1) {
            i5 = c0643Nw.r;
        }
        String str5 = this.t;
        if (str5 == null) {
            String strR = Lr0.r(i3, c0643Nw.t);
            if (Lr0.V(strR).length == 1) {
                str5 = strR;
            }
        }
        CQ cqA = c0643Nw.u;
        CQ cq = this.u;
        if (cq != null) {
            cqA = cqA == null ? cq : cq.a(cqA.l);
        }
        float f = this.D;
        if (f == -1.0f && i3 == 2) {
            f = c0643Nw.D;
        }
        int i6 = this.f421o | c0643Nw.f421o;
        int i7 = this.p | c0643Nw.p;
        ArrayList arrayList = new ArrayList();
        C3271xo c3271xo = c0643Nw.z;
        if (c3271xo != null) {
            C3174wo[] c3174woArr = c3271xo.l;
            int length = c3174woArr.length;
            int i8 = 0;
            while (i8 < length) {
                int i9 = length;
                C3174wo c3174wo = c3174woArr[i8];
                C3174wo[] c3174woArr2 = c3174woArr;
                if (c3174wo.p != null) {
                    arrayList.add(c3174wo);
                }
                i8++;
                length = i9;
                c3174woArr = c3174woArr2;
            }
            str2 = c3271xo.n;
        } else {
            str2 = null;
        }
        C3271xo c3271xo2 = this.z;
        if (c3271xo2 != null) {
            if (str2 == null) {
                str2 = c3271xo2.n;
            }
            int size = arrayList.size();
            C3174wo[] c3174woArr3 = c3271xo2.l;
            int length2 = c3174woArr3.length;
            int i10 = 0;
            while (true) {
                String str6 = str2;
                if (i10 >= length2) {
                    break;
                }
                C3174wo c3174wo2 = c3174woArr3[i10];
                C3174wo[] c3174woArr4 = c3174woArr3;
                if (c3174wo2.p != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            i = size;
                            i2 = length2;
                            arrayList.add(c3174wo2);
                            break;
                        }
                        i = size;
                        i2 = length2;
                        if (((C3174wo) arrayList.get(i11)).m.equals(c3174wo2.m)) {
                            break;
                        }
                        i11++;
                        length2 = i2;
                        size = i;
                    }
                } else {
                    i = size;
                    i2 = length2;
                }
                i10++;
                str2 = str6;
                c3174woArr3 = c3174woArr4;
                length2 = i2;
                size = i;
            }
        }
        C3271xo c3271xo3 = arrayList.isEmpty() ? null : new C3271xo(str2, arrayList);
        C0617Mw c0617MwA = a();
        c0617MwA.a = str3;
        c0617MwA.b = str4;
        c0617MwA.c = str;
        c0617MwA.d = i6;
        c0617MwA.e = i7;
        c0617MwA.f = i4;
        c0617MwA.g = i5;
        c0617MwA.h = str5;
        c0617MwA.i = cqA;
        c0617MwA.n = c3271xo3;
        c0617MwA.r = f;
        return new C0643Nw(c0617MwA);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || C0643Nw.class != obj.getClass()) {
            return false;
        }
        C0643Nw c0643Nw = (C0643Nw) obj;
        int i2 = this.S;
        return (i2 == 0 || (i = c0643Nw.S) == 0 || i2 == i) && this.f421o == c0643Nw.f421o && this.p == c0643Nw.p && this.q == c0643Nw.q && this.r == c0643Nw.r && this.x == c0643Nw.x && this.A == c0643Nw.A && this.B == c0643Nw.B && this.C == c0643Nw.C && this.E == c0643Nw.E && this.H == c0643Nw.H && this.J == c0643Nw.J && this.K == c0643Nw.K && this.L == c0643Nw.L && this.M == c0643Nw.M && this.N == c0643Nw.N && this.O == c0643Nw.O && this.P == c0643Nw.P && this.Q == c0643Nw.Q && this.R == c0643Nw.R && Float.compare(this.D, c0643Nw.D) == 0 && Float.compare(this.F, c0643Nw.F) == 0 && Lr0.a(this.l, c0643Nw.l) && Lr0.a(this.m, c0643Nw.m) && Lr0.a(this.t, c0643Nw.t) && Lr0.a(this.v, c0643Nw.v) && Lr0.a(this.w, c0643Nw.w) && Lr0.a(this.n, c0643Nw.n) && Arrays.equals(this.G, c0643Nw.G) && Lr0.a(this.u, c0643Nw.u) && Lr0.a(this.I, c0643Nw.I) && Lr0.a(this.z, c0643Nw.z) && c(c0643Nw);
    }

    public final int hashCode() {
        if (this.S == 0) {
            String str = this.l;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.m;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.n;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f421o) * 31) + this.p) * 31) + this.q) * 31) + this.r) * 31;
            String str4 = this.t;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            CQ cq = this.u;
            int iHashCode5 = (iHashCode4 + (cq == null ? 0 : cq.hashCode())) * 31;
            String str5 = this.v;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.w;
            this.S = ((((((((((((((((((((Float.floatToIntBits(this.F) + ((((Float.floatToIntBits(this.D) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.x) * 31) + ((int) this.A)) * 31) + this.B) * 31) + this.C) * 31)) * 31) + this.E) * 31)) * 31) + this.H) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + this.R;
        }
        return this.S;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.l);
        sb.append(", ");
        sb.append(this.m);
        sb.append(", ");
        sb.append(this.v);
        sb.append(", ");
        sb.append(this.w);
        sb.append(", ");
        sb.append(this.t);
        sb.append(", ");
        sb.append(this.s);
        sb.append(", ");
        sb.append(this.n);
        sb.append(", [");
        sb.append(this.B);
        sb.append(", ");
        sb.append(this.C);
        sb.append(", ");
        sb.append(this.D);
        sb.append(", ");
        sb.append(this.I);
        sb.append("], [");
        sb.append(this.J);
        sb.append(", ");
        return AbstractC1701hf0.g(sb, this.K, "])");
    }
}
