package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class GQ extends AbstractC1952k8 implements Handler.Callback {
    public final SurfaceHolderCallbackC0898Xr A;
    public final Handler B;
    public final DQ C;
    public AP D;
    public boolean E;
    public boolean F;
    public long G;
    public CQ H;
    public long I;
    public final O9 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GQ(SurfaceHolderCallbackC0898Xr surfaceHolderCallbackC0898Xr, Looper looper) {
        Handler handler;
        super(5);
        O9 o9 = O9.w;
        this.A = surfaceHolderCallbackC0898Xr;
        if (looper == null) {
            handler = null;
        } else {
            int i = Lr0.a;
            handler = new Handler(looper, this);
        }
        this.B = handler;
        this.z = o9;
        this.C = new DQ(1);
        this.I = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    public final void A(CQ cq, ArrayList arrayList) {
        int i = 0;
        while (true) {
            BQ[] bqArr = cq.l;
            if (i >= bqArr.length) {
                return;
            }
            C0643Nw c0643NwB = bqArr[i].b();
            if (c0643NwB != null) {
                O9 o9 = this.z;
                if (o9.G(c0643NwB)) {
                    AP apO = o9.o(c0643NwB);
                    byte[] bArrC = bqArr[i].c();
                    bArrC.getClass();
                    DQ dq = this.C;
                    dq.E();
                    dq.H(bArrC.length);
                    dq.f439o.put(bArrC);
                    dq.I();
                    CQ cqD = apO.d(dq);
                    if (cqD != null) {
                        A(cqD, arrayList);
                    }
                } else {
                    arrayList.add(bqArr[i]);
                }
            } else {
                arrayList.add(bqArr[i]);
            }
            i++;
        }
    }

    public final long B(long j) {
        AbstractC0397Ej.f(j != -9223372036854775807L);
        AbstractC0397Ej.f(this.I != -9223372036854775807L);
        return j - this.I;
    }

    public final void C(CQ cq) {
        SurfaceHolderCallbackC0898Xr surfaceHolderCallbackC0898Xr = this.A;
        C1042as c1042as = surfaceHolderCallbackC0898Xr.l;
        C2166mP c2166mPA = c1042as.i0.a();
        int i = 0;
        while (true) {
            BQ[] bqArr = cq.l;
            if (i >= bqArr.length) {
                break;
            }
            bqArr[i].d(c2166mPA);
            i++;
        }
        c1042as.i0 = c2166mPA.a();
        C2263nP c2263nPR = c1042as.r();
        boolean zEquals = c2263nPR.equals(c1042as.N);
        TK tk = c1042as.l;
        if (!zEquals) {
            c1042as.N = c2263nPR;
            tk.c(14, new C2278nc(13, surfaceHolderCallbackC0898Xr));
        }
        tk.c(28, new C2278nc(14, cq));
        tk.b();
    }

    @Override // o.AbstractC1952k8
    public final String h() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        C((CQ) message.obj);
        return true;
    }

    @Override // o.AbstractC1952k8
    public final boolean j() {
        return this.F;
    }

    @Override // o.AbstractC1952k8
    public final boolean k() {
        return true;
    }

    @Override // o.AbstractC1952k8
    public final void l() {
        this.H = null;
        this.D = null;
        this.I = -9223372036854775807L;
    }

    @Override // o.AbstractC1952k8
    public final void n(long j, boolean z) {
        this.H = null;
        this.E = false;
        this.F = false;
    }

    @Override // o.AbstractC1952k8
    public final void s(C0643Nw[] c0643NwArr, long j, long j2) {
        this.D = this.z.o(c0643NwArr[0]);
        CQ cq = this.H;
        if (cq != null) {
            long j3 = this.I;
            long j4 = cq.m;
            long j5 = (j3 + j4) - j2;
            if (j4 != j5) {
                cq = new CQ(j5, cq.l);
            }
            this.H = cq;
        }
        this.I = j2;
    }

    @Override // o.AbstractC1952k8
    public final void u(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.E && this.H == null) {
                DQ dq = this.C;
                dq.E();
                C2994uv c2994uv = this.n;
                c2994uv.u();
                int iT = t(c2994uv, dq, 0);
                if (iT == -4) {
                    if (dq.j(4)) {
                        this.E = true;
                    } else {
                        dq.u = this.G;
                        dq.I();
                        AP ap = this.D;
                        int i = Lr0.a;
                        CQ cqD = ap.d(dq);
                        if (cqD != null) {
                            ArrayList arrayList = new ArrayList(cqD.l.length);
                            A(cqD, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.H = new CQ(B(dq.q), (BQ[]) arrayList.toArray(new BQ[0]));
                            }
                        }
                    }
                } else if (iT == -5) {
                    C0643Nw c0643Nw = (C0643Nw) c2994uv.n;
                    c0643Nw.getClass();
                    this.G = c0643Nw.A;
                }
            }
            CQ cq = this.H;
            if (cq == null || cq.m > B(j)) {
                z = false;
            } else {
                CQ cq2 = this.H;
                Handler handler = this.B;
                if (handler != null) {
                    handler.obtainMessage(0, cq2).sendToTarget();
                } else {
                    C(cq2);
                }
                this.H = null;
                z = true;
            }
            if (this.E && this.H == null) {
                this.F = true;
            }
        }
    }

    @Override // o.AbstractC1952k8
    public final int y(C0643Nw c0643Nw) {
        if (this.z.G(c0643Nw)) {
            return AbstractC1674hK.e(c0643Nw.R == 0 ? 4 : 2, 0, 0);
        }
        return AbstractC1674hK.e(0, 0, 0);
    }
}
