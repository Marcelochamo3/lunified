package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: o.Rg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0731Rg {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final C0394Eg I;
    public final C0394Eg J;
    public final C0394Eg K;
    public final C0394Eg L;
    public final C0394Eg M;
    public final C0394Eg N;
    public final C0394Eg O;
    public final C0394Eg P;
    public final C0394Eg[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public C0731Rg T;
    public int U;
    public int V;
    public float W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public C3344yc b;
    public int b0;
    public C3344yc c;
    public int c0;
    public float d0;
    public float e0;
    public Object f0;
    public int g0;
    public String h0;
    public int i0;
    public String j;
    public int j0;
    public boolean k;
    public final float[] k0;
    public boolean l;
    public final C0731Rg[] l0;
    public boolean m;
    public final C0731Rg[] m0;
    public boolean n;
    public int n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f492o;
    public int o0;
    public int p;
    public final int[] p0;
    public int q;
    public int r;
    public int s;
    public final int[] t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;
    public boolean a = false;
    public TC d = null;
    public As0 e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    public C0731Rg() {
        new HashMap();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.f492o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = 0.0f;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        C0394Eg c0394Eg = new C0394Eg(this, 2);
        this.I = c0394Eg;
        C0394Eg c0394Eg2 = new C0394Eg(this, 3);
        this.J = c0394Eg2;
        C0394Eg c0394Eg3 = new C0394Eg(this, 4);
        this.K = c0394Eg3;
        C0394Eg c0394Eg4 = new C0394Eg(this, 5);
        this.L = c0394Eg4;
        C0394Eg c0394Eg5 = new C0394Eg(this, 6);
        this.M = c0394Eg5;
        C0394Eg c0394Eg6 = new C0394Eg(this, 8);
        this.N = c0394Eg6;
        C0394Eg c0394Eg7 = new C0394Eg(this, 9);
        this.O = c0394Eg7;
        C0394Eg c0394Eg8 = new C0394Eg(this, 7);
        this.P = c0394Eg8;
        this.Q = new C0394Eg[]{c0394Eg, c0394Eg3, c0394Eg2, c0394Eg4, c0394Eg5, c0394Eg8};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        this.p0 = new int[]{1, 1};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.d0 = 0.5f;
        this.e0 = 0.5f;
        this.g0 = 0;
        this.h0 = null;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = new float[]{-1.0f, -1.0f};
        this.l0 = new C0731Rg[]{null, null};
        this.m0 = new C0731Rg[]{null, null};
        this.n0 = -1;
        this.o0 = -1;
        arrayList.add(c0394Eg);
        arrayList.add(c0394Eg2);
        arrayList.add(c0394Eg3);
        arrayList.add(c0394Eg4);
        arrayList.add(c0394Eg6);
        arrayList.add(c0394Eg7);
        arrayList.add(c0394Eg8);
        arrayList.add(c0394Eg5);
    }

    public static void G(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void H(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void o(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f) {
        sb.append(str);
        sb.append(" :  {\n");
        G(i, 0, "      size", sb);
        G(i2, 0, "      min", sb);
        G(i3, Integer.MAX_VALUE, "      max", sb);
        G(i4, 0, "      matchMin", sb);
        G(i5, 0, "      matchDef", sb);
        H(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void p(StringBuilder sb, String str, C0394Eg c0394Eg) {
        if (c0394Eg.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(c0394Eg.f);
        sb.append("'");
        if (c0394Eg.h != Integer.MIN_VALUE || c0394Eg.g != 0) {
            sb.append(",");
            sb.append(c0394Eg.g);
            if (c0394Eg.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(c0394Eg.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public boolean A() {
        return this.k || (this.I.c && this.K.c);
    }

    public boolean B() {
        return this.l || (this.J.c && this.L.c);
    }

    public void C() {
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.T = null;
        this.D = 0.0f;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0.5f;
        this.e0 = 0.5f;
        int[] iArr = this.p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f0 = null;
        this.g0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        float[] fArr = this.k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f492o = -1;
        this.p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr3 = this.t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void D() {
        C0731Rg c0731Rg = this.T;
        if (c0731Rg != null && (c0731Rg instanceof C0757Sg)) {
            ((C0757Sg) c0731Rg).getClass();
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0394Eg) arrayList.get(i)).j();
        }
    }

    public final void E() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0394Eg c0394Eg = (C0394Eg) arrayList.get(i);
            c0394Eg.c = false;
            c0394Eg.b = 0;
        }
    }

    public void F(Na0 na0) {
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.P.k();
        this.N.k();
        this.O.k();
    }

    public final void I(int i) {
        this.a0 = i;
        this.E = i > 0;
    }

    public final void J(int i, int i2) {
        if (this.k) {
            return;
        }
        this.I.l(i);
        this.K.l(i2);
        this.Y = i;
        this.U = i2 - i;
        this.k = true;
    }

    public final void K(int i, int i2) {
        if (this.l) {
            return;
        }
        this.J.l(i);
        this.L.l(i2);
        this.Z = i;
        this.V = i2 - i;
        if (this.E) {
            this.M.l(i + this.a0);
        }
        this.l = true;
    }

    public final void L(int i) {
        this.V = i;
        int i2 = this.c0;
        if (i < i2) {
            this.V = i2;
        }
    }

    public final void M(int i) {
        this.p0[0] = i;
    }

    public final void N(int i) {
        this.p0[1] = i;
    }

    public final void O(int i) {
        this.U = i;
        int i2 = this.b0;
        if (i < i2) {
            this.U = i2;
        }
    }

    public void P(boolean z, boolean z2) {
        int i;
        int i2;
        TC tc = this.d;
        boolean z3 = z & tc.g;
        As0 as0 = this.e;
        boolean z4 = z2 & as0.g;
        int i3 = tc.h.g;
        int i4 = as0.h.g;
        int i5 = tc.i.g;
        int i6 = as0.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.Y = i3;
        }
        if (z4) {
            this.Z = i4;
        }
        if (this.g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.p0;
        if (z3) {
            if (iArr[0] == 1 && i8 < (i2 = this.U)) {
                i8 = i2;
            }
            this.U = i8;
            int i10 = this.b0;
            if (i8 < i10) {
                this.U = i10;
            }
        }
        if (z4) {
            if (iArr[1] == 1 && i9 < (i = this.V)) {
                i9 = i;
            }
            this.V = i9;
            int i11 = this.c0;
            if (i9 < i11) {
                this.V = i11;
            }
        }
    }

    public void Q(C2742sK c2742sK, boolean z) {
        int i;
        int i2;
        As0 as0;
        TC tc;
        C0394Eg c0394Eg = this.I;
        c2742sK.getClass();
        int iN = C2742sK.n(c0394Eg);
        int iN2 = C2742sK.n(this.J);
        int iN3 = C2742sK.n(this.K);
        int iN4 = C2742sK.n(this.L);
        if (z && (tc = this.d) != null) {
            C2395om c2395om = tc.h;
            if (c2395om.j) {
                C2395om c2395om2 = tc.i;
                if (c2395om2.j) {
                    iN = c2395om.g;
                    iN3 = c2395om2.g;
                }
            }
        }
        if (z && (as0 = this.e) != null) {
            C2395om c2395om3 = as0.h;
            if (c2395om3.j) {
                C2395om c2395om4 = as0.i;
                if (c2395om4.j) {
                    iN2 = c2395om3.g;
                    iN4 = c2395om4.g;
                }
            }
        }
        int i3 = iN4 - iN2;
        if (iN3 - iN < 0 || i3 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i4 = iN3 - iN;
        int i5 = iN4 - iN2;
        this.Y = iN;
        this.Z = iN2;
        if (this.g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.p0;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.U)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.V)) {
            i5 = i;
        }
        this.U = i4;
        this.V = i5;
        int i7 = this.c0;
        if (i5 < i7) {
            this.V = i7;
        }
        int i8 = this.b0;
        if (i4 < i8) {
            this.U = i8;
        }
        int i9 = this.v;
        if (i9 > 0 && i6 == 3) {
            this.U = Math.min(this.U, i9);
        }
        int i10 = this.y;
        if (i10 > 0 && iArr[1] == 3) {
            this.V = Math.min(this.V, i10);
        }
        int i11 = this.U;
        if (i4 != i11) {
            this.h = i11;
        }
        int i12 = this.V;
        if (i5 != i12) {
            this.i = i12;
        }
    }

    public final void a(C0757Sg c0757Sg, C2742sK c2742sK, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            zy0.j(c0757Sg, c2742sK, this);
            hashSet.remove(this);
            b(c2742sK, c0757Sg.W(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.I.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((C0394Eg) it.next()).d.a(c0757Sg, c2742sK, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.K.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((C0394Eg) it2.next()).d.a(c0757Sg, c2742sK, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((C0394Eg) it3.next()).d.a(c0757Sg, c2742sK, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.L.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((C0394Eg) it4.next()).d.a(c0757Sg, c2742sK, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.M.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((C0394Eg) it5.next()).d.a(c0757Sg, c2742sK, hashSet, i, true);
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19971. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public void b(o.C2742sK r59, boolean r60) {
        /*
            Method dump skipped, instruction units count: 1997
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0731Rg.b(o.sK, boolean):void");
    }

    public boolean c() {
        return this.g0 != 8;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x01cc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x01ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x0208  */
    /* JADX WARN: Code duplicated, block: B:128:0x020e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:218:0x0391 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:221:0x039a  */
    /* JADX WARN: Code duplicated, block: B:223:0x039e  */
    /* JADX WARN: Code duplicated, block: B:224:0x03a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:229:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:232:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:235:0x0403  */
    /* JADX WARN: Code duplicated, block: B:244:0x0414  */
    /* JADX WARN: Code duplicated, block: B:245:0x0416 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:253:0x0435  */
    /* JADX WARN: Code duplicated, block: B:255:0x0439 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:263:0x044b  */
    /* JADX WARN: Code duplicated, block: B:266:0x0451  */
    /* JADX WARN: Code duplicated, block: B:267:0x0453 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:270:0x0459 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:275:0x0462  */
    /* JADX WARN: Code duplicated, block: B:277:0x0466  */
    /* JADX WARN: Code duplicated, block: B:280:0x046c  */
    /* JADX WARN: Code duplicated, block: B:282:0x0470  */
    /* JADX WARN: Code duplicated, block: B:284:0x0474  */
    /* JADX WARN: Code duplicated, block: B:285:0x0476  */
    /* JADX WARN: Code duplicated, block: B:289:0x047f  */
    /* JADX WARN: Code duplicated, block: B:291:0x0485 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:297:0x049d  */
    /* JADX WARN: Code duplicated, block: B:299:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:300:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:302:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:304:0x04b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:311:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:316:0x04d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:324:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:345:0x0529  */
    /* JADX WARN: Code duplicated, block: B:353:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final void d(C2742sK c2742sK, boolean z, boolean z2, boolean z3, boolean z4, C1798if0 c1798if0, C1798if0 c1798if1, int i, boolean z5, C0394Eg c0394Eg, C0394Eg c0394Eg2, int i2, int i3, int i4, int i5, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i6, int i7, int i8, int i9, float f2, boolean z11) {
        boolean z12;
        boolean z13;
        int iMin;
        int i10;
        boolean z14;
        boolean z15;
        C1798if0 c1798if0K;
        C1798if0 c1798if0K2;
        char c;
        char c2;
        C0394Eg c0394Eg3;
        C1798if0 c1798if2;
        int i11;
        boolean z16;
        boolean z17;
        boolean z18;
        int i12;
        int i13;
        boolean z19;
        C1798if0 c1798if3;
        boolean z20;
        boolean z21;
        C1798if0 c1798if4;
        C0731Rg c0731Rg;
        int iMax;
        int iE;
        int iMin2;
        int i14;
        HashSet hashSet;
        int i15;
        int i16;
        int i17;
        boolean z22;
        boolean z23;
        int i18;
        int i19;
        int i20 = i8;
        int i21 = i9;
        C1798if0 c1798if0K3 = c2742sK.k(c0394Eg);
        C1798if0 c1798if0K4 = c2742sK.k(c0394Eg2);
        C1798if0 c1798if0K5 = c2742sK.k(c0394Eg.f);
        C1798if0 c1798if0K6 = c2742sK.k(c0394Eg2.f);
        boolean zH = c0394Eg.h();
        boolean zH2 = c0394Eg2.h();
        boolean zH3 = this.P.h();
        int i22 = zH2 ? (zH ? 1 : 0) + 1 : zH ? 1 : 0;
        if (zH3) {
            i22++;
        }
        int i23 = i22;
        int i24 = z6 ? 3 : i6;
        int iW = AbstractC1701hf0.w(i);
        boolean z24 = (iW == 0 || iW == 1 || iW != 2 || i24 == 4) ? false : true;
        int i25 = this.h;
        if (i25 == -1 || !z) {
            i25 = i3;
            z12 = z24;
        } else {
            this.h = -1;
            z12 = false;
        }
        int i26 = this.i;
        if (i26 == -1 || z) {
            z13 = z12;
        } else {
            this.i = -1;
            i25 = i26;
            z13 = false;
        }
        int i27 = i25;
        if (this.g0 == 8) {
            iMin = 0;
            z13 = false;
        } else {
            iMin = i27;
        }
        if (z11) {
            if (!zH && !zH2 && !zH3) {
                c2742sK.d(c1798if0K3, i2);
            } else if (zH && !zH2) {
                c2742sK.e(c1798if0K3, c1798if0K5, c0394Eg.e(), 8);
            }
        }
        if (z13) {
            if (i23 == 2 || z6 || !(i24 == 1 || i24 == 0)) {
                if (i20 == -2) {
                    i20 = iMin;
                }
                if (i21 == -2) {
                    i21 = iMin;
                }
                if (iMin > 0 && i24 != 1) {
                    iMin = 0;
                }
                if (i20 > 0) {
                    c2742sK.f(c1798if0K4, c1798if0K3, i20, 8);
                    iMin = Math.max(iMin, i20);
                }
                if (i21 > 0) {
                    if (!z2 || i24 != 1) {
                        c2742sK.g(c1798if0K4, c1798if0K3, i21, 8);
                    }
                    iMin = Math.min(iMin, i21);
                }
                if (i24 == 1) {
                    if (z2) {
                        c2742sK.e(c1798if0K4, c1798if0K3, iMin, 8);
                    } else if (z8) {
                        c2742sK.e(c1798if0K4, c1798if0K3, iMin, 5);
                        c2742sK.g(c1798if0K4, c1798if0K3, iMin, 8);
                    } else {
                        c2742sK.e(c1798if0K4, c1798if0K3, iMin, 5);
                        c2742sK.g(c1798if0K4, c1798if0K3, iMin, 8);
                    }
                } else if (i24 == 2) {
                    int i28 = c0394Eg.e;
                    if (i28 == 3 || i28 == 5) {
                        c1798if0K = c2742sK.k(this.T.i(3));
                        c1798if0K2 = c2742sK.k(this.T.i(5));
                    } else {
                        c1798if0K = c2742sK.k(this.T.i(2));
                        c1798if0K2 = c2742sK.k(this.T.i(4));
                    }
                    T5 t5L = c2742sK.l();
                    t5L.d.j(c1798if0K4, -1.0f);
                    t5L.d.j(c1798if0K3, 1.0f);
                    t5L.d.j(c1798if0K2, f2);
                    t5L.d.j(c1798if0K, -f2);
                    c2742sK.c(t5L);
                    z15 = z4;
                    i10 = i20;
                    z14 = z2 ? false : z13;
                } else {
                    i10 = i20;
                    z14 = z13;
                    z15 = true;
                }
            } else {
                int iMax2 = Math.max(i20, iMin);
                if (i21 > 0) {
                    iMax2 = Math.min(i21, iMax2);
                }
                c2742sK.e(c1798if0K4, c1798if0K3, iMax2, 8);
                z15 = z4;
                i10 = i20;
                z14 = false;
            }
            if (z11) {
                c = 1;
                c2 = 2;
            } else {
                if (z8) {
                    if (!zH || zH2 || zH3) {
                        if (zH || zH2) {
                            if (zH && zH2) {
                                c2742sK.e(c1798if0K4, c1798if2, -c0394Eg2.e(), 8);
                                if (z2) {
                                    c1798if2 = c1798if0K6;
                                    c2742sK.f(c1798if0K3, c1798if0, 0, 5);
                                }
                            } else {
                                c1798if2 = c1798if0K6;
                                if (!zH && zH2) {
                                    C0731Rg c0731Rg2 = c0394Eg.f.d;
                                    c0394Eg2 = c0394Eg2;
                                    C0731Rg c0731Rg3 = c0394Eg2.f.d;
                                    C0731Rg c0731Rg4 = this.T;
                                    int i29 = 6;
                                    if (z14) {
                                        if (i24 == 0) {
                                            if (i21 != 0 || i10 != 0) {
                                                i11 = 5;
                                                z22 = true;
                                                z23 = false;
                                                z17 = true;
                                                i18 = 5;
                                            } else if (c1798if0K5.q && c1798if2.q) {
                                                c2742sK.e(c1798if0K3, c1798if0K5, c0394Eg.e(), 8);
                                                c2742sK.e(c1798if0K4, c1798if2, -c0394Eg2.e(), 8);
                                                return;
                                            } else {
                                                i11 = 8;
                                                z22 = false;
                                                z23 = true;
                                                z17 = false;
                                                i18 = 8;
                                            }
                                            if ((c0731Rg2 instanceof O7) || (c0731Rg3 instanceof O7)) {
                                                i12 = 6;
                                                i13 = 4;
                                            } else {
                                                i13 = i18;
                                                i12 = 6;
                                            }
                                            z18 = z23;
                                            z16 = z22;
                                            i24 = i24;
                                        } else {
                                            if (i24 == 2) {
                                                if ((c0731Rg2 instanceof O7) || (c0731Rg3 instanceof O7)) {
                                                    i11 = 5;
                                                    z16 = true;
                                                    z17 = true;
                                                    z18 = false;
                                                    i12 = 6;
                                                    i13 = 4;
                                                } else {
                                                    i24 = i24;
                                                    i11 = 5;
                                                    z16 = true;
                                                    z17 = true;
                                                    z18 = false;
                                                    i12 = 6;
                                                    i13 = 5;
                                                }
                                            } else if (i24 == 1) {
                                                i11 = 8;
                                                z16 = true;
                                                z17 = true;
                                                z18 = false;
                                                i12 = 6;
                                                i13 = 4;
                                            } else if (i24 == 3) {
                                                i24 = i24;
                                                if (this.A == -1) {
                                                    if (z9) {
                                                        c1798if1 = c1798if1;
                                                        i11 = 8;
                                                        z16 = true;
                                                        z17 = true;
                                                        z18 = true;
                                                        i12 = z2 ? 5 : 4;
                                                    } else {
                                                        c1798if1 = c1798if1;
                                                        i11 = 8;
                                                        z16 = true;
                                                        z17 = true;
                                                        z18 = true;
                                                        i12 = 8;
                                                    }
                                                } else if (z6) {
                                                    if (i7 == 2 || i7 == 1) {
                                                        i11 = 5;
                                                        i17 = 4;
                                                    } else {
                                                        i11 = 8;
                                                        i17 = 5;
                                                    }
                                                    i13 = i17;
                                                    z16 = true;
                                                    z17 = true;
                                                    z18 = true;
                                                    i12 = 6;
                                                } else if (i21 > 0) {
                                                    c1798if1 = c1798if1;
                                                    i11 = 5;
                                                    z16 = true;
                                                    z17 = true;
                                                    z18 = true;
                                                    i12 = 6;
                                                } else {
                                                    if (i21 != 0 || i10 != 0) {
                                                        i11 = 5;
                                                    } else if (z9) {
                                                        i11 = (c0731Rg2 == c0731Rg4 || c0731Rg3 == c0731Rg4) ? 5 : 4;
                                                    } else {
                                                        c1798if1 = c1798if1;
                                                        i11 = 5;
                                                        z16 = true;
                                                        z17 = true;
                                                        z18 = true;
                                                        i12 = 6;
                                                        i13 = 8;
                                                    }
                                                    z16 = true;
                                                    z17 = true;
                                                    z18 = true;
                                                    i12 = 6;
                                                    i13 = 4;
                                                }
                                                i13 = 5;
                                            } else {
                                                i11 = 5;
                                                z16 = false;
                                                z17 = false;
                                            }
                                            if (z17 || c1798if0K5 != c1798if2 || c0731Rg2 == c0731Rg4) {
                                                z19 = true;
                                            } else {
                                                z17 = false;
                                                z19 = false;
                                            }
                                            if (z16) {
                                                if (z14 && !z7 && !z9 && c1798if0K5 == c1798if0 && c1798if2 == c1798if1) {
                                                    z20 = false;
                                                    i16 = 8;
                                                    z19 = false;
                                                    i15 = 8;
                                                } else {
                                                    z20 = z2;
                                                    i15 = i12;
                                                    i16 = i11;
                                                }
                                                c1798if3 = c1798if0K4;
                                                c2742sK.b(c1798if0K3, c1798if0K5, c0394Eg.e(), f, c1798if2, c1798if0K4, c0394Eg2.e(), i15);
                                                i11 = i16;
                                            } else {
                                                c1798if3 = c1798if0K4;
                                                z20 = z2;
                                            }
                                            z21 = z19;
                                            if (this.g0 != 8 && ((hashSet = c0394Eg2.a) == null || hashSet.size() <= 0)) {
                                                return;
                                            }
                                            c1798if4 = c1798if2;
                                            if (z17) {
                                                if (z20 && c1798if0K5 != c1798if4 && !z14 && ((c0731Rg2 instanceof O7) || (c0731Rg3 instanceof O7))) {
                                                    i11 = 6;
                                                }
                                                c2742sK.f(c1798if0K3, c1798if0K5, c0394Eg.e(), i11);
                                                c1798if0K4 = c1798if3;
                                                c2742sK.g(c1798if0K4, c1798if4, -c0394Eg2.e(), i11);
                                            } else {
                                                c1798if0K4 = c1798if3;
                                            }
                                            if (z20 || !z10 || (c0731Rg2 instanceof O7) || (c0731Rg3 instanceof O7)) {
                                                c0731Rg = c0731Rg4;
                                            } else {
                                                c0731Rg = c0731Rg4;
                                                if (c0731Rg3 != c0731Rg) {
                                                    i11 = 6;
                                                    iMax = 6;
                                                    z21 = true;
                                                }
                                                if (z21) {
                                                    if (z18 && (!z9 || z3)) {
                                                        if (c0731Rg2 != c0731Rg && c0731Rg3 != c0731Rg) {
                                                            i29 = iMax;
                                                        }
                                                        if ((c0731Rg2 instanceof HA) || (c0731Rg3 instanceof HA)) {
                                                            i29 = 5;
                                                        }
                                                        if ((c0731Rg2 instanceof O7) || (c0731Rg3 instanceof O7)) {
                                                            i29 = 5;
                                                        }
                                                        if (z9) {
                                                            i14 = 5;
                                                        } else {
                                                            i14 = i29;
                                                        }
                                                        iMax = Math.max(i14, iMax);
                                                    }
                                                    iMin2 = iMax;
                                                    if (z20) {
                                                        iMin2 = Math.min(i11, iMin2);
                                                        if (z6 && !z9 && (c0731Rg2 == c0731Rg || c0731Rg3 == c0731Rg)) {
                                                            iMin2 = 4;
                                                        }
                                                    }
                                                    c2742sK.e(c1798if0K3, c1798if0K5, c0394Eg.e(), iMin2);
                                                    c2742sK.e(c1798if0K4, c1798if4, -c0394Eg2.e(), iMin2);
                                                }
                                                if (z20) {
                                                    if (c1798if0 == c1798if0K5) {
                                                        iE = c0394Eg.e();
                                                    } else {
                                                        iE = 0;
                                                    }
                                                    if (c1798if0K5 != c1798if0) {
                                                        c2742sK.f(c1798if0K3, c1798if0, iE, 5);
                                                    }
                                                }
                                                if (!z20 && z14 && i4 == 0 && i10 == 0) {
                                                    if (z14 && i24 == 3) {
                                                        c2742sK.f(c1798if0K4, c1798if0K3, 0, 8);
                                                    } else {
                                                        c2742sK.f(c1798if0K4, c1798if0K3, 0, 5);
                                                    }
                                                }
                                            }
                                            iMax = i13;
                                            if (z21) {
                                                if (z18) {
                                                    if (c0731Rg2 != c0731Rg) {
                                                        i29 = iMax;
                                                    }
                                                    if (c0731Rg2 instanceof HA) {
                                                        i29 = 5;
                                                    } else {
                                                        i29 = 5;
                                                    }
                                                    if (c0731Rg2 instanceof O7) {
                                                        i29 = 5;
                                                    } else {
                                                        i29 = 5;
                                                    }
                                                    if (z9) {
                                                        i14 = 5;
                                                    } else {
                                                        i14 = i29;
                                                    }
                                                    iMax = Math.max(i14, iMax);
                                                }
                                                iMin2 = iMax;
                                                if (z20) {
                                                    iMin2 = Math.min(i11, iMin2);
                                                    if (z6) {
                                                        iMin2 = 4;
                                                    }
                                                }
                                                c2742sK.e(c1798if0K3, c1798if0K5, c0394Eg.e(), iMin2);
                                                c2742sK.e(c1798if0K4, c1798if4, -c0394Eg2.e(), iMin2);
                                            }
                                            if (z20) {
                                                if (c1798if0 == c1798if0K5) {
                                                    iE = c0394Eg.e();
                                                } else {
                                                    iE = 0;
                                                }
                                                if (c1798if0K5 != c1798if0) {
                                                    c2742sK.f(c1798if0K3, c1798if0, iE, 5);
                                                }
                                            }
                                            if (!z20) {
                                            }
                                        }
                                        c1798if1 = c1798if1;
                                        if (z17) {
                                            z19 = true;
                                        } else {
                                            z19 = true;
                                        }
                                        if (z16) {
                                            if (z14) {
                                                z20 = z2;
                                                i15 = i12;
                                                i16 = i11;
                                            } else {
                                                z20 = z2;
                                                i15 = i12;
                                                i16 = i11;
                                            }
                                            c1798if3 = c1798if0K4;
                                            c2742sK.b(c1798if0K3, c1798if0K5, c0394Eg.e(), f, c1798if2, c1798if0K4, c0394Eg2.e(), i15);
                                            i11 = i16;
                                        } else {
                                            c1798if3 = c1798if0K4;
                                            z20 = z2;
                                        }
                                        z21 = z19;
                                        if (this.g0 != 8) {
                                        }
                                        c1798if4 = c1798if2;
                                        if (z17) {
                                            if (z20) {
                                                i11 = 6;
                                            }
                                            c2742sK.f(c1798if0K3, c1798if0K5, c0394Eg.e(), i11);
                                            c1798if0K4 = c1798if3;
                                            c2742sK.g(c1798if0K4, c1798if4, -c0394Eg2.e(), i11);
                                        } else {
                                            c1798if0K4 = c1798if3;
                                        }
                                        if (z20) {
                                            c0731Rg = c0731Rg4;
                                            iMax = i13;
                                        } else {
                                            c0731Rg = c0731Rg4;
                                            iMax = i13;
                                        }
                                        if (z21) {
                                            if (z18) {
                                                if (c0731Rg2 != c0731Rg) {
                                                    i29 = iMax;
                                                }
                                                if (c0731Rg2 instanceof HA) {
                                                    i29 = 5;
                                                } else {
                                                    i29 = 5;
                                                }
                                                if (c0731Rg2 instanceof O7) {
                                                    i29 = 5;
                                                } else {
                                                    i29 = 5;
                                                }
                                                if (z9) {
                                                    i14 = 5;
                                                } else {
                                                    i14 = i29;
                                                }
                                                iMax = Math.max(i14, iMax);
                                            }
                                            iMin2 = iMax;
                                            if (z20) {
                                                iMin2 = Math.min(i11, iMin2);
                                                if (z6) {
                                                    iMin2 = 4;
                                                }
                                            }
                                            c2742sK.e(c1798if0K3, c1798if0K5, c0394Eg.e(), iMin2);
                                            c2742sK.e(c1798if0K4, c1798if4, -c0394Eg2.e(), iMin2);
                                        }
                                        if (z20) {
                                            if (c1798if0 == c1798if0K5) {
                                                iE = c0394Eg.e();
                                            } else {
                                                iE = 0;
                                            }
                                            if (c1798if0K5 != c1798if0) {
                                                c2742sK.f(c1798if0K3, c1798if0, iE, 5);
                                            }
                                        }
                                        if (!z20) {
                                        }
                                    } else {
                                        if (c1798if0K5.q && c1798if2.q) {
                                            c2742sK.b(c1798if0K3, c1798if0K5, c0394Eg.e(), f, c1798if2, c1798if0K4, c0394Eg2.e(), 8);
                                            if (z2 && z15) {
                                                int iE2 = c0394Eg2.f != null ? c0394Eg2.e() : 0;
                                                if (c1798if2 != c1798if1) {
                                                    c2742sK.f(c1798if1, c1798if0K4, iE2, 5);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        i11 = 5;
                                        z16 = true;
                                        z17 = true;
                                    }
                                    z18 = false;
                                    i12 = 6;
                                    i13 = 4;
                                    if (z17) {
                                        z19 = true;
                                    } else {
                                        z19 = true;
                                    }
                                    if (z16) {
                                        if (z14) {
                                            z20 = z2;
                                            i15 = i12;
                                            i16 = i11;
                                        } else {
                                            z20 = z2;
                                            i15 = i12;
                                            i16 = i11;
                                        }
                                        c1798if3 = c1798if0K4;
                                        c2742sK.b(c1798if0K3, c1798if0K5, c0394Eg.e(), f, c1798if2, c1798if0K4, c0394Eg2.e(), i15);
                                        i11 = i16;
                                    } else {
                                        c1798if3 = c1798if0K4;
                                        z20 = z2;
                                    }
                                    z21 = z19;
                                    if (this.g0 != 8) {
                                    }
                                    c1798if4 = c1798if2;
                                    if (z17) {
                                        if (z20) {
                                            i11 = 6;
                                        }
                                        c2742sK.f(c1798if0K3, c1798if0K5, c0394Eg.e(), i11);
                                        c1798if0K4 = c1798if3;
                                        c2742sK.g(c1798if0K4, c1798if4, -c0394Eg2.e(), i11);
                                    } else {
                                        c1798if0K4 = c1798if3;
                                    }
                                    if (z20) {
                                        c0731Rg = c0731Rg4;
                                        iMax = i13;
                                    } else {
                                        c0731Rg = c0731Rg4;
                                        iMax = i13;
                                    }
                                    if (z21) {
                                        if (z18) {
                                            if (c0731Rg2 != c0731Rg) {
                                                i29 = iMax;
                                            }
                                            if (c0731Rg2 instanceof HA) {
                                                i29 = 5;
                                            } else {
                                                i29 = 5;
                                            }
                                            if (c0731Rg2 instanceof O7) {
                                                i29 = 5;
                                            } else {
                                                i29 = 5;
                                            }
                                            if (z9) {
                                                i14 = 5;
                                            } else {
                                                i14 = i29;
                                            }
                                            iMax = Math.max(i14, iMax);
                                        }
                                        iMin2 = iMax;
                                        if (z20) {
                                            iMin2 = Math.min(i11, iMin2);
                                            if (z6) {
                                                iMin2 = 4;
                                            }
                                        }
                                        c2742sK.e(c1798if0K3, c1798if0K5, c0394Eg.e(), iMin2);
                                        c2742sK.e(c1798if0K4, c1798if4, -c0394Eg2.e(), iMin2);
                                    }
                                    if (z20) {
                                        if (c1798if0 == c1798if0K5) {
                                            iE = c0394Eg.e();
                                        } else {
                                            iE = 0;
                                        }
                                        if (c1798if0K5 != c1798if0) {
                                            c2742sK.f(c1798if0K3, c1798if0, iE, 5);
                                        }
                                    }
                                    if (!z20) {
                                    }
                                }
                                i19 = 5;
                            }
                            c1798if2 = c1798if0K6;
                            c1798if4 = c1798if2;
                        } else {
                            c0394Eg2 = c0394Eg2;
                            c1798if0K4 = c1798if0K4;
                            z15 = z15;
                            i19 = (z2 && (c0394Eg.f.d instanceof O7)) ? 8 : 5;
                            c1798if4 = c1798if0K6;
                            z20 = z2;
                        }
                        if (z20 || !z15) {
                            return;
                        }
                        int iE3 = c0394Eg2.f != null ? c0394Eg2.e() : 0;
                        if (c1798if4 != c1798if1) {
                            c2742sK.f(c1798if1, c1798if0K4, iE3, i19);
                            return;
                        }
                        return;
                    }
                    c1798if4 = c1798if0K6;
                    z20 = z2;
                    i19 = 5;
                    if (z20) {
                        return;
                    } else {
                        return;
                    }
                }
                c2 = 2;
                c = 1;
            }
            if (i23 >= c2 && z2 && z15) {
                c2742sK.f(c1798if0K3, c1798if0, 0, 8);
                C0394Eg c0394Eg4 = this.M;
                boolean z25 = z || c0394Eg4.f == null;
                if (!z && (c0394Eg3 = c0394Eg4.f) != null) {
                    C0731Rg c0731Rg5 = c0394Eg3.d;
                    if (c0731Rg5.W != 0.0f) {
                        int[] iArr = c0731Rg5.p0;
                        if (iArr[0] == 3 && iArr[c] == 3) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                    } else {
                        z25 = false;
                    }
                }
                if (z25) {
                    c2742sK.f(c1798if1, c1798if0K4, 0, 8);
                    return;
                }
                return;
            }
            return;
        }
        if (z5) {
            c2742sK.e(c1798if0K4, c1798if0K3, 0, 3);
            if (i4 > 0) {
                c2742sK.f(c1798if0K4, c1798if0K3, i4, 8);
            }
            if (i5 < Integer.MAX_VALUE) {
                c2742sK.g(c1798if0K4, c1798if0K3, i5, 8);
            }
        } else {
            c2742sK.e(c1798if0K4, c1798if0K3, iMin, 8);
        }
        z15 = z4;
        i10 = i20;
        z14 = z13;
        if (z11) {
            c = 1;
            c2 = 2;
        } else {
            if (z8) {
                if (zH) {
                    if (zH) {
                    }
                    if (zH) {
                        c1798if2 = c1798if0K6;
                        if (!zH) {
                        }
                        c1798if2 = c1798if0K6;
                        c1798if4 = c1798if2;
                        z20 = z2;
                    } else {
                        c1798if2 = c1798if0K6;
                        if (!zH) {
                        }
                        c1798if2 = c1798if0K6;
                        c1798if4 = c1798if2;
                        z20 = z2;
                    }
                    i19 = 5;
                } else {
                    if (zH) {
                    }
                    if (zH) {
                        c1798if2 = c1798if0K6;
                        if (!zH) {
                        }
                        c1798if2 = c1798if0K6;
                        c1798if4 = c1798if2;
                        z20 = z2;
                    } else {
                        c1798if2 = c1798if0K6;
                        if (!zH) {
                        }
                        c1798if2 = c1798if0K6;
                        c1798if4 = c1798if2;
                        z20 = z2;
                    }
                    i19 = 5;
                }
                if (z20) {
                    return;
                } else {
                    return;
                }
            }
            c2 = 2;
            c = 1;
        }
        if (i23 >= c2) {
        }
    }

    public final void e(int i, C0731Rg c0731Rg, int i2, int i3) {
        boolean z;
        if (i == 7) {
            if (i2 != 7) {
                if (i2 == 2 || i2 == 4) {
                    e(2, c0731Rg, i2, 0);
                    e(4, c0731Rg, i2, 0);
                    i(7).a(c0731Rg.i(i2), 0);
                    return;
                } else {
                    if (i2 == 3 || i2 == 5) {
                        e(3, c0731Rg, i2, 0);
                        e(5, c0731Rg, i2, 0);
                        i(7).a(c0731Rg.i(i2), 0);
                        return;
                    }
                    return;
                }
            }
            C0394Eg c0394EgI = i(2);
            C0394Eg c0394EgI2 = i(4);
            C0394Eg c0394EgI3 = i(3);
            C0394Eg c0394EgI4 = i(5);
            boolean z2 = true;
            if ((c0394EgI == null || !c0394EgI.h()) && (c0394EgI2 == null || !c0394EgI2.h())) {
                e(2, c0731Rg, 2, 0);
                e(4, c0731Rg, 4, 0);
                z = true;
            } else {
                z = false;
            }
            if ((c0394EgI3 == null || !c0394EgI3.h()) && (c0394EgI4 == null || !c0394EgI4.h())) {
                e(3, c0731Rg, 3, 0);
                e(5, c0731Rg, 5, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                i(7).a(c0731Rg.i(7), 0);
                return;
            } else if (z) {
                i(8).a(c0731Rg.i(8), 0);
                return;
            } else {
                if (z2) {
                    i(9).a(c0731Rg.i(9), 0);
                    return;
                }
                return;
            }
        }
        if (i == 8 && (i2 == 2 || i2 == 4)) {
            C0394Eg c0394EgI5 = i(2);
            C0394Eg c0394EgI6 = c0731Rg.i(i2);
            C0394Eg c0394EgI7 = i(4);
            c0394EgI5.a(c0394EgI6, 0);
            c0394EgI7.a(c0394EgI6, 0);
            i(8).a(c0394EgI6, 0);
            return;
        }
        if (i == 9 && (i2 == 3 || i2 == 5)) {
            C0394Eg c0394EgI8 = c0731Rg.i(i2);
            i(3).a(c0394EgI8, 0);
            i(5).a(c0394EgI8, 0);
            i(9).a(c0394EgI8, 0);
            return;
        }
        if (i == 8 && i2 == 8) {
            i(2).a(c0731Rg.i(2), 0);
            i(4).a(c0731Rg.i(4), 0);
            i(8).a(c0731Rg.i(i2), 0);
            return;
        }
        if (i == 9 && i2 == 9) {
            i(3).a(c0731Rg.i(3), 0);
            i(5).a(c0731Rg.i(5), 0);
            i(9).a(c0731Rg.i(i2), 0);
            return;
        }
        C0394Eg c0394EgI9 = i(i);
        C0394Eg c0394EgI10 = c0731Rg.i(i2);
        if (c0394EgI9.i(c0394EgI10)) {
            if (i == 6) {
                C0394Eg c0394EgI11 = i(3);
                C0394Eg c0394EgI12 = i(5);
                if (c0394EgI11 != null) {
                    c0394EgI11.j();
                }
                if (c0394EgI12 != null) {
                    c0394EgI12.j();
                }
            } else if (i == 3 || i == 5) {
                C0394Eg c0394EgI13 = i(6);
                if (c0394EgI13 != null) {
                    c0394EgI13.j();
                }
                C0394Eg c0394EgI14 = i(7);
                if (c0394EgI14.f != c0394EgI10) {
                    c0394EgI14.j();
                }
                C0394Eg c0394EgF = i(i).f();
                C0394Eg c0394EgI15 = i(9);
                if (c0394EgI15.h()) {
                    c0394EgF.j();
                    c0394EgI15.j();
                }
            } else if (i == 2 || i == 4) {
                C0394Eg c0394EgI16 = i(7);
                if (c0394EgI16.f != c0394EgI10) {
                    c0394EgI16.j();
                }
                C0394Eg c0394EgF2 = i(i).f();
                C0394Eg c0394EgI17 = i(8);
                if (c0394EgI17.h()) {
                    c0394EgF2.j();
                    c0394EgI17.j();
                }
            }
            c0394EgI9.a(c0394EgI10, i3);
        }
    }

    public final void f(C0394Eg c0394Eg, C0394Eg c0394Eg2, int i) {
        if (c0394Eg.d == this) {
            e(c0394Eg.e, c0394Eg2.d, c0394Eg2.e, i);
        }
    }

    public final void g(C2742sK c2742sK) {
        c2742sK.k(this.I);
        c2742sK.k(this.J);
        c2742sK.k(this.K);
        c2742sK.k(this.L);
        if (this.a0 > 0) {
            c2742sK.k(this.M);
        }
    }

    public final void h() {
        if (this.d == null) {
            TC tc = new TC(this);
            tc.h.e = 4;
            tc.i.e = 5;
            tc.f = 0;
            this.d = tc;
        }
        if (this.e == null) {
            As0 as0 = new As0(this);
            C2395om c2395om = new C2395om(as0);
            as0.k = c2395om;
            as0.l = null;
            as0.h.e = 6;
            as0.i.e = 7;
            c2395om.e = 8;
            as0.f = 1;
            this.e = as0;
        }
    }

    public C0394Eg i(int i) {
        switch (AbstractC1701hf0.w(i)) {
            case 0:
                return null;
            case 1:
                return this.I;
            case 2:
                return this.J;
            case 3:
                return this.K;
            case 4:
                return this.L;
            case 5:
                return this.M;
            case 6:
                return this.P;
            case 7:
                return this.N;
            case 8:
                return this.O;
            default:
                throw new AssertionError(AbstractC1701hf0.v(i));
        }
    }

    public final int j(int i) {
        int[] iArr = this.p0;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.g0 == 8) {
            return 0;
        }
        return this.V;
    }

    public final C0731Rg l(int i) {
        C0394Eg c0394Eg;
        C0394Eg c0394Eg2;
        if (i != 0) {
            if (i == 1 && (c0394Eg2 = (c0394Eg = this.L).f) != null && c0394Eg2.f == c0394Eg) {
                return c0394Eg2.d;
            }
            return null;
        }
        C0394Eg c0394Eg3 = this.K;
        C0394Eg c0394Eg4 = c0394Eg3.f;
        if (c0394Eg4 == null || c0394Eg4.f != c0394Eg3) {
            return null;
        }
        return c0394Eg4.d;
    }

    public final C0731Rg m(int i) {
        C0394Eg c0394Eg;
        C0394Eg c0394Eg2;
        if (i != 0) {
            if (i == 1 && (c0394Eg2 = (c0394Eg = this.J).f) != null && c0394Eg2.f == c0394Eg) {
                return c0394Eg2.d;
            }
            return null;
        }
        C0394Eg c0394Eg3 = this.I;
        C0394Eg c0394Eg4 = c0394Eg3.f;
        if (c0394Eg4 == null || c0394Eg4.f != c0394Eg3) {
            return null;
        }
        return c0394Eg4.d;
    }

    public void n(StringBuilder sb) {
        sb.append("  " + this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.V);
        sb.append("\n");
        sb.append("    actualLeft:" + this.Y);
        sb.append("\n");
        sb.append("    actualTop:" + this.Z);
        sb.append("\n");
        p(sb, "left", this.I);
        p(sb, "top", this.J);
        p(sb, "right", this.K);
        p(sb, "bottom", this.L);
        p(sb, "baseline", this.M);
        p(sb, "centerX", this.N);
        p(sb, "centerY", this.O);
        int i = this.U;
        int i2 = this.b0;
        int[] iArr = this.C;
        int i3 = iArr[0];
        int i4 = this.u;
        int i5 = this.r;
        float f = this.w;
        float[] fArr = this.k0;
        float f2 = fArr[0];
        o(sb, "    width", i, i2, i3, i4, i5, f);
        int i6 = this.V;
        int i7 = this.c0;
        int i8 = iArr[1];
        int i9 = this.x;
        int i10 = this.s;
        float f3 = this.z;
        float f4 = fArr[1];
        o(sb, "    height", i6, i7, i8, i9, i10, f3);
        float f5 = this.W;
        int i11 = this.X;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        H(sb, "    horizontalBias", this.d0, 0.5f);
        H(sb, "    verticalBias", this.e0, 0.5f);
        G(this.i0, 0, "    horizontalChainStyle", sb);
        G(this.j0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int q() {
        if (this.g0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final int r() {
        C0731Rg c0731Rg = this.T;
        return (c0731Rg == null || !(c0731Rg instanceof C0757Sg)) ? this.Y : ((C0757Sg) c0731Rg).x0 + this.Y;
    }

    public final int s() {
        C0731Rg c0731Rg = this.T;
        return (c0731Rg == null || !(c0731Rg instanceof C0757Sg)) ? this.Z : ((C0757Sg) c0731Rg).y0 + this.Z;
    }

    public final boolean t(int i) {
        if (i == 0) {
            return (this.I.f != null ? 1 : 0) + (this.K.f != null ? 1 : 0) < 2;
        }
        return ((this.J.f != null ? 1 : 0) + (this.L.f != null ? 1 : 0)) + (this.M.f != null ? 1 : 0) < 2;
    }

    public String toString() {
        StringBuilder sbK = AbstractC1701hf0.k("");
        sbK.append(this.h0 != null ? AbstractC1701hf0.h(new StringBuilder("id: "), this.h0, " ") : "");
        sbK.append("(");
        sbK.append(this.Y);
        sbK.append(", ");
        sbK.append(this.Z);
        sbK.append(") - (");
        sbK.append(this.U);
        sbK.append(" x ");
        return AbstractC1701hf0.g(sbK, this.V, ")");
    }

    public final boolean u(int i, int i2) {
        C0394Eg c0394Eg;
        C0394Eg c0394Eg2;
        C0394Eg c0394Eg3;
        C0394Eg c0394Eg4;
        if (i == 0) {
            C0394Eg c0394Eg5 = this.I;
            C0394Eg c0394Eg6 = c0394Eg5.f;
            if (c0394Eg6 != null && c0394Eg6.c && (c0394Eg4 = (c0394Eg3 = this.K).f) != null && c0394Eg4.c) {
                return (c0394Eg4.d() - c0394Eg3.e()) - (c0394Eg5.e() + c0394Eg5.f.d()) >= i2;
            }
        } else {
            C0394Eg c0394Eg7 = this.J;
            C0394Eg c0394Eg8 = c0394Eg7.f;
            if (c0394Eg8 != null && c0394Eg8.c && (c0394Eg2 = (c0394Eg = this.L).f) != null && c0394Eg2.c) {
                return (c0394Eg2.d() - c0394Eg.e()) - (c0394Eg7.e() + c0394Eg7.f.d()) >= i2;
            }
        }
        return false;
    }

    public final void v(int i, int i2, int i3, int i4, C0731Rg c0731Rg) {
        i(i).b(c0731Rg.i(i2), i3, i4, true);
    }

    public final boolean w(int i) {
        C0394Eg c0394Eg;
        C0394Eg c0394Eg2;
        int i2 = i * 2;
        C0394Eg[] c0394EgArr = this.Q;
        C0394Eg c0394Eg3 = c0394EgArr[i2];
        C0394Eg c0394Eg4 = c0394Eg3.f;
        return (c0394Eg4 == null || c0394Eg4.f == c0394Eg3 || (c0394Eg2 = (c0394Eg = c0394EgArr[i2 + 1]).f) == null || c0394Eg2.f != c0394Eg) ? false : true;
    }

    public final boolean x() {
        C0394Eg c0394Eg = this.I;
        C0394Eg c0394Eg2 = c0394Eg.f;
        if (c0394Eg2 != null && c0394Eg2.f == c0394Eg) {
            return true;
        }
        C0394Eg c0394Eg3 = this.K;
        C0394Eg c0394Eg4 = c0394Eg3.f;
        return c0394Eg4 != null && c0394Eg4.f == c0394Eg3;
    }

    public final boolean y() {
        C0394Eg c0394Eg = this.J;
        C0394Eg c0394Eg2 = c0394Eg.f;
        if (c0394Eg2 != null && c0394Eg2.f == c0394Eg) {
            return true;
        }
        C0394Eg c0394Eg3 = this.L;
        C0394Eg c0394Eg4 = c0394Eg3.f;
        return c0394Eg4 != null && c0394Eg4.f == c0394Eg3;
    }

    public final boolean z() {
        return this.g && this.g0 != 8;
    }
}
