package o;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class VB extends AbstractC2843tO {
    public static final AtomicInteger X = new AtomicInteger();
    public final InterfaceC2583qj A;
    public final C2970uj B;
    public final Na0 C;
    public final boolean D;
    public final boolean E;
    public final Oj0 F;
    public final UB G;
    public final List H;
    public final C3271xo I;
    public final ME J;
    public final C2562qX K;
    public final boolean L;
    public final boolean M;
    public final long N;
    public Na0 O;
    public C2637rC P;
    public int Q;
    public boolean R;
    public volatile boolean S;
    public boolean T;
    public AbstractC0985aF U;
    public boolean V;
    public boolean W;
    public final int v;
    public final int w;
    public final Uri x;
    public final boolean y;
    public final int z;

    public VB(UB ub, InterfaceC2583qj interfaceC2583qj, C2970uj c2970uj, C0643Nw c0643Nw, boolean z, InterfaceC2583qj interfaceC2583qj2, C2970uj c2970uj2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, Oj0 oj0, long j4, C3271xo c3271xo, Na0 na0, ME me, C2562qX c2562qX, boolean z6, C3436zZ c3436zZ) {
        super(interfaceC2583qj, c2970uj, c0643Nw, i, obj, j, j2, j3);
        this.L = z;
        this.z = i2;
        this.W = z3;
        this.w = i3;
        this.B = c2970uj2;
        this.A = interfaceC2583qj2;
        this.R = c2970uj2 != null;
        this.M = z2;
        this.x = uri;
        this.D = z5;
        this.F = oj0;
        this.N = j4;
        this.E = z4;
        this.G = ub;
        this.H = list;
        this.I = c3271xo;
        this.C = na0;
        this.J = me;
        this.K = c2562qX;
        this.y = z6;
        XE xe = AbstractC0985aF.m;
        this.U = M60.p;
        this.v = X.getAndIncrement();
    }

    public static byte[] f(String str) {
        if (U9.I(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // o.InterfaceC1479fL
    public final void b() {
        Na0 na0;
        this.P.getClass();
        if (this.O == null && (na0 = this.C) != null) {
            InterfaceC0302As interfaceC0302As = (InterfaceC0302As) na0.m;
            if ((interfaceC0302As instanceof Wm0) || (interfaceC0302As instanceof C1932jy)) {
                this.O = na0;
                this.R = false;
            }
        }
        if (this.R) {
            InterfaceC2583qj interfaceC2583qj = this.A;
            interfaceC2583qj.getClass();
            C2970uj c2970uj = this.B;
            c2970uj.getClass();
            d(interfaceC2583qj, c2970uj, this.M, false);
            this.Q = 0;
            this.R = false;
        }
        if (this.S) {
            return;
        }
        if (!this.E) {
            d(this.t, this.m, this.L, true);
        }
        this.T = !this.S;
    }

    @Override // o.AbstractC2843tO
    public final boolean c() {
        throw null;
    }

    public final void d(InterfaceC2583qj interfaceC2583qj, C2970uj c2970uj, boolean z, boolean z2) {
        C2970uj c2970ujC;
        long j;
        long j2;
        boolean z3 = false;
        if (z) {
            z3 = this.Q != 0;
            c2970ujC = c2970uj;
        } else {
            c2970ujC = c2970uj.c(this.Q);
        }
        try {
            C0554Kk c0554KkH = h(interfaceC2583qj, c2970ujC, z2);
            if (z3) {
                c0554KkH.q(this.Q);
            }
            while (!this.S) {
                try {
                    try {
                        if (((InterfaceC0302As) this.O.m).h(c0554KkH, Na0.r) != 0) {
                            break;
                        }
                    } catch (EOFException e) {
                        if ((this.f1028o.p & 16384) == 0) {
                            throw e;
                        }
                        ((InterfaceC0302As) this.O.m).d(0L, 0L);
                        j = c0554KkH.f369o;
                        j2 = c2970uj.f;
                    }
                } catch (Throwable th) {
                    this.Q = (int) (c0554KkH.f369o - c2970uj.f);
                    throw th;
                }
            }
            j = c0554KkH.f369o;
            j2 = c2970uj.f;
            this.Q = (int) (j - j2);
            AbstractC2506pt.k(interfaceC2583qj);
        } catch (Throwable th2) {
            AbstractC2506pt.k(interfaceC2583qj);
            throw th2;
        }
    }

    @Override // o.InterfaceC1479fL
    public final void e() {
        this.S = true;
    }

    public final int g(int i) {
        AbstractC0397Ej.f(!this.y);
        if (i >= this.U.size()) {
            return 0;
        }
        return ((Integer) this.U.get(i)).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0229  */
    /* JADX WARN: Code duplicated, block: B:114:0x022b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0230  */
    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    public final C0554Kk h(InterfaceC2583qj interfaceC2583qj, C2970uj c2970uj, boolean z) throws IOException {
        long jO;
        long j;
        Na0 na0;
        Na0 na1;
        ArrayList arrayList;
        InterfaceC0302As c2422p0;
        boolean zE;
        boolean z2;
        int i;
        int i2;
        Object c2653rS;
        long jV = interfaceC2583qj.v(c2970uj);
        if (z) {
            try {
                this.F.g(this.D, this.r, this.N);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e) {
                throw new IOException(e);
            }
        }
        C0554Kk c0554Kk = new C0554Kk(interfaceC2583qj, c2970uj.f, jV);
        int i3 = 1;
        int i4 = 0;
        if (this.O == null) {
            C2562qX c2562qX = this.K;
            c0554Kk.q = 0;
            try {
                c2562qX.C(10);
                c0554Kk.x(c2562qX.a, 0, 10, false);
                if (c2562qX.w() != 4801587) {
                    jO = -9223372036854775807L;
                    break;
                }
                c2562qX.G(3);
                int iT = c2562qX.t();
                int i5 = iT + 10;
                byte[] bArr = c2562qX.a;
                if (i5 > bArr.length) {
                    c2562qX.C(i5);
                    System.arraycopy(bArr, 0, c2562qX.a, 0, 10);
                }
                c0554Kk.x(c2562qX.a, 10, iT, false);
                CQ cqB = this.J.B(iT, c2562qX.a);
                if (cqB == null) {
                    jO = -9223372036854775807L;
                    break;
                }
                BQ[] bqArr = cqB.l;
                int length = bqArr.length;
                int i6 = 0;
                while (true) {
                    if (i6 >= length) {
                        jO = -9223372036854775807L;
                        break;
                    }
                    BQ bq = bqArr[i6];
                    if (bq instanceof C1943k30) {
                        C1943k30 c1943k30 = (C1943k30) bq;
                        if ("com.apple.streaming.transportStreamTimestamp".equals(c1943k30.m)) {
                            System.arraycopy(c1943k30.n, 0, c2562qX.a, 0, 8);
                            c2562qX.F(0);
                            c2562qX.E(8);
                            jO = c2562qX.o() & 8589934591L;
                            break;
                        }
                    }
                    i6++;
                }
            } catch (EOFException unused2) {
            }
            c0554Kk.q = 0;
            Oj0 oj0 = this.F;
            Na0 na2 = this.C;
            if (na2 != null) {
                InterfaceC0302As interfaceC0302As = (InterfaceC0302As) na2.m;
                AbstractC0397Ej.f(!((interfaceC0302As instanceof Wm0) || (interfaceC0302As instanceof C1932jy)));
                boolean z3 = interfaceC0302As instanceof C1343dw0;
                Oj0 oj1 = (Oj0) na2.f414o;
                C0643Nw c0643Nw = (C0643Nw) na2.n;
                if (z3) {
                    c2653rS = new C1343dw0(c0643Nw.n, oj1);
                } else if (interfaceC0302As instanceof C1354e2) {
                    c2653rS = new C1354e2();
                } else if (interfaceC0302As instanceof C2422p0) {
                    c2653rS = new C2422p0();
                } else if (interfaceC0302As instanceof C2615r0) {
                    c2653rS = new C2615r0();
                } else {
                    if (!(interfaceC0302As instanceof C2653rS)) {
                        throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(interfaceC0302As.getClass().getSimpleName()));
                    }
                    c2653rS = new C2653rS();
                }
                na1 = new Na0(c2653rS, c0643Nw, oj1, 2);
                j = jO;
            } else {
                Map mapL = interfaceC2583qj.l();
                ((O9) this.G).getClass();
                C0643Nw c0643Nw2 = this.f1028o;
                int iA = AbstractC1474fG.A(c0643Nw2.w);
                List list = (List) mapL.get("Content-Type");
                int iA2 = AbstractC1474fG.A((list == null || list.isEmpty()) ? null : (String) list.get(0));
                int iB = AbstractC1474fG.B(c2970uj.a);
                int i7 = 7;
                ArrayList arrayList2 = new ArrayList(7);
                O9.k(iA, arrayList2);
                O9.k(iA2, arrayList2);
                O9.k(iB, arrayList2);
                int[] iArr = O9.r;
                for (int i8 = 0; i8 < 7; i8++) {
                    O9.k(iArr[i8], arrayList2);
                }
                c0554Kk.q = 0;
                int i9 = 0;
                InterfaceC0302As interfaceC0302As2 = null;
                while (true) {
                    if (i9 >= arrayList2.size()) {
                        j = jO;
                        interfaceC0302As2.getClass();
                        na0 = new Na0(interfaceC0302As2, c0643Nw2, oj0, 2);
                        break;
                    }
                    int iIntValue = ((Integer) arrayList2.get(i9)).intValue();
                    if (iIntValue == 0) {
                        arrayList = arrayList2;
                        j = jO;
                        c2422p0 = new C2422p0();
                    } else if (iIntValue == i3) {
                        arrayList = arrayList2;
                        j = jO;
                        c2422p0 = new C2615r0();
                    } else if (iIntValue == 2) {
                        arrayList = arrayList2;
                        j = jO;
                        c2422p0 = new C1354e2();
                    } else if (iIntValue != i7) {
                        List listEmptyList = this.H;
                        if (iIntValue != 8) {
                            if (iIntValue == 11) {
                                if (listEmptyList != null) {
                                    i2 = 48;
                                } else {
                                    C0617Mw c0617Mw = new C0617Mw();
                                    c0617Mw.k = "application/cea-608";
                                    listEmptyList = Collections.singletonList(new C0643Nw(c0617Mw));
                                    i2 = 16;
                                }
                                String str = c0643Nw2.t;
                                if (TextUtils.isEmpty(str)) {
                                    arrayList = arrayList2;
                                } else {
                                    arrayList = arrayList2;
                                    if (IQ.c(str, "audio/mp4a-latm") == null) {
                                        i2 |= 2;
                                    }
                                    if (IQ.c(str, "video/avc") == null) {
                                        i2 |= 4;
                                    }
                                }
                                c2422p0 = new Wm0(2, oj0, new C1225cm(i2, listEmptyList));
                            } else if (iIntValue != 13) {
                                arrayList = arrayList2;
                                j = jO;
                                c2422p0 = null;
                            } else {
                                c2422p0 = new C1343dw0(c0643Nw2.n, oj0);
                                arrayList = arrayList2;
                            }
                            j = jO;
                        } else {
                            arrayList = arrayList2;
                            CQ cq = c0643Nw2.u;
                            if (cq == null) {
                                j = jO;
                            } else {
                                j = jO;
                                int i10 = 0;
                                while (true) {
                                    BQ[] bqArr2 = cq.l;
                                    if (i10 < bqArr2.length) {
                                        BQ bq2 = bqArr2[i10];
                                        if (bq2 instanceof C2831tC) {
                                            z2 = !((C2831tC) bq2).n.isEmpty();
                                            break;
                                        }
                                        i10++;
                                    }
                                }
                                if (z2) {
                                    i = 4;
                                } else {
                                    i = 0;
                                }
                                if (listEmptyList == null) {
                                    listEmptyList = Collections.emptyList();
                                }
                                c2422p0 = new C1932jy(i, oj0, listEmptyList, null);
                            }
                            z2 = false;
                            if (z2) {
                                i = 4;
                            } else {
                                i = 0;
                            }
                            if (listEmptyList == null) {
                                listEmptyList = Collections.emptyList();
                            }
                            c2422p0 = new C1932jy(i, oj0, listEmptyList, null);
                        }
                    } else {
                        arrayList = arrayList2;
                        j = jO;
                        c2422p0 = new C2653rS(0L);
                    }
                    c2422p0.getClass();
                    try {
                        zE = c2422p0.e(c0554Kk);
                        i4 = 0;
                        c0554Kk.q = 0;
                    } catch (EOFException unused3) {
                        i4 = 0;
                        c0554Kk.q = 0;
                        zE = false;
                    } catch (Throwable th) {
                        c0554Kk.q = 0;
                        throw th;
                    }
                    if (zE) {
                        na0 = new Na0(c2422p0, c0643Nw2, oj0, 2);
                        break;
                    }
                    if (interfaceC0302As2 == null && (iIntValue == iA || iIntValue == iA2 || iIntValue == iB || iIntValue == 11)) {
                        interfaceC0302As2 = c2422p0;
                    }
                    i9++;
                    arrayList2 = arrayList;
                    jO = j;
                    i3 = 1;
                    i7 = 7;
                }
                na1 = na0;
            }
            this.O = na1;
            InterfaceC0302As interfaceC0302As3 = (InterfaceC0302As) na1.m;
            if ((interfaceC0302As3 instanceof C1354e2) || (interfaceC0302As3 instanceof C2422p0) || (interfaceC0302As3 instanceof C2615r0) || (interfaceC0302As3 instanceof C2653rS)) {
                C2637rC c2637rC = this.P;
                long jB = j != -9223372036854775807L ? oj0.b(j) : this.r;
                if (c2637rC.g0 != jB) {
                    c2637rC.g0 = jB;
                    for (C2541qC c2541qC : c2637rC.G) {
                        if (c2541qC.F != jB) {
                            c2541qC.F = jB;
                            c2541qC.z = true;
                        }
                    }
                }
            } else {
                C2637rC c2637rC2 = this.P;
                if (c2637rC2.g0 != 0) {
                    c2637rC2.g0 = 0L;
                    for (C2541qC c2541qC2 : c2637rC2.G) {
                        if (c2541qC2.F != 0) {
                            c2541qC2.F = 0L;
                            c2541qC2.z = true;
                        }
                    }
                }
            }
            this.P.I.clear();
            ((InterfaceC0302As) this.O.m).f(this.P);
        }
        C2637rC c2637rC3 = this.P;
        C3271xo c3271xo = c2637rC3.h0;
        C3271xo c3271xo2 = this.I;
        if (!Lr0.a(c3271xo, c3271xo2)) {
            c2637rC3.h0 = c3271xo2;
            while (true) {
                C2541qC[] c2541qCArr = c2637rC3.G;
                if (i4 >= c2541qCArr.length) {
                    break;
                }
                if (c2637rC3.Z[i4]) {
                    C2541qC c2541qC3 = c2541qCArr[i4];
                    c2541qC3.I = c3271xo2;
                    c2541qC3.z = true;
                }
                i4++;
            }
        }
        return c0554Kk;
    }
}
