package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: o.nC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2250nC implements D90 {
    public final int l;
    public final C2637rC m;
    public int n = -1;

    public C2250nC(C2637rC c2637rC, int i) {
        this.m = c2637rC;
        this.l = i;
    }

    @Override // o.D90
    public final void a() throws IOException {
        int i = this.n;
        C2637rC c2637rC = this.m;
        if (i == -2) {
            c2637rC.e();
            throw new C0811Ui(AbstractC1701hf0.u("Unable to bind a sample queue to TrackGroup with MIME type ", c2637rC.T.a(this.l).f665o[0].w, "."));
        }
        if (i == -1) {
            c2637rC.w();
        } else if (i != -3) {
            c2637rC.w();
            c2637rC.G[i].x();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    public final void b() {
        AbstractC0397Ej.c(this.n == -1);
        C2637rC c2637rC = this.m;
        c2637rC.e();
        c2637rC.V.getClass();
        int[] iArr = c2637rC.V;
        int i = this.l;
        int i2 = iArr[i];
        if (i2 != -1) {
            boolean[] zArr = c2637rC.Y;
            if (zArr[i2]) {
                i2 = -2;
            } else {
                zArr[i2] = true;
            }
        } else if (c2637rC.U.contains(c2637rC.T.a(i))) {
            i2 = -3;
        } else {
            i2 = -2;
        }
        this.n = i2;
    }

    public final boolean c() {
        int i = this.n;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // o.D90
    public final boolean e() {
        if (this.n != -3) {
            if (c()) {
                int i = this.n;
                C2637rC c2637rC = this.m;
                if (c2637rC.u() || !c2637rC.G[i].v(c2637rC.e0)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // o.D90
    public final int f(long j) {
        if (!c()) {
            return 0;
        }
        int i = this.n;
        C2637rC c2637rC = this.m;
        if (c2637rC.u()) {
            return 0;
        }
        C2541qC c2541qC = c2637rC.G[i];
        int iS = c2541qC.s(j, c2637rC.e0);
        ArrayList arrayList = c2637rC.y;
        Object next = null;
        if (!(arrayList instanceof Collection)) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
            }
        } else if (!arrayList.isEmpty()) {
            next = AbstractC1701hf0.c(1, arrayList);
        }
        VB vb = (VB) next;
        if (vb != null && !vb.W) {
            iS = Math.min(iS, vb.g(i) - c2541qC.q());
        }
        c2541qC.F(iS);
        return iS;
    }

    @Override // o.D90
    public final int g(C2994uv c2994uv, C0656Oj c0656Oj, int i) {
        C0643Nw c0643Nw;
        int iA = -3;
        if (this.n == -3) {
            c0656Oj.b(4);
            return -4;
        }
        if (c()) {
            int i2 = this.n;
            C2637rC c2637rC = this.m;
            if (!c2637rC.u()) {
                ArrayList arrayList = c2637rC.y;
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = ((VB) arrayList.get(i4)).v;
                        int length = c2637rC.G.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (c2637rC.Y[i6] && c2637rC.G[i6].z() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    Lr0.P(arrayList, 0, i4);
                    VB vb = (VB) arrayList.get(0);
                    C0643Nw c0643Nw2 = vb.f1028o;
                    if (!c0643Nw2.equals(c2637rC.R)) {
                        c2637rC.v.m(c2637rC.m, c0643Nw2, vb.p, vb.q, vb.r);
                    }
                    c2637rC.R = c0643Nw2;
                }
                if ((arrayList.isEmpty() || ((VB) arrayList.get(0)).W) && (iA = c2637rC.G[i2].A(c2994uv, c0656Oj, i, c2637rC.e0)) == -5) {
                    C0643Nw c0643NwD = (C0643Nw) c2994uv.n;
                    c0643NwD.getClass();
                    if (i2 == c2637rC.M) {
                        int iD = Pu0.d(c2637rC.G[i2].z());
                        while (i3 < arrayList.size() && ((VB) arrayList.get(i3)).v != iD) {
                            i3++;
                        }
                        if (i3 < arrayList.size()) {
                            c0643Nw = ((VB) arrayList.get(i3)).f1028o;
                        } else {
                            c0643Nw = c2637rC.Q;
                            c0643Nw.getClass();
                        }
                        c0643NwD = c0643NwD.d(c0643Nw);
                    }
                    c2994uv.n = c0643NwD;
                }
            }
        }
        return iA;
    }
}
