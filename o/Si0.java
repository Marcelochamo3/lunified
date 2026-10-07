package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class Si0 extends AbstractC1952k8 implements Handler.Callback {
    public final SurfaceHolderCallbackC0898Xr A;
    public final O9 B;
    public final C2994uv C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public C0643Nw H;
    public InterfaceC3064vh0 I;
    public C3258xh0 J;
    public C2472pc K;
    public C2472pc L;
    public int M;
    public long N;
    public long O;
    public long P;
    public final Handler z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Si0(SurfaceHolderCallbackC0898Xr surfaceHolderCallbackC0898Xr, Looper looper) {
        Handler handler;
        super(3);
        O9 o9 = O9.E;
        this.A = surfaceHolderCallbackC0898Xr;
        if (looper == null) {
            handler = null;
        } else {
            int i = Lr0.a;
            handler = new Handler(looper, this);
        }
        this.z = handler;
        this.B = o9;
        this.C = new C2994uv(1, false);
        this.N = -9223372036854775807L;
        this.O = -9223372036854775807L;
        this.P = -9223372036854775807L;
    }

    public final long A() {
        if (this.M == -1) {
            return Long.MAX_VALUE;
        }
        this.K.getClass();
        if (this.M >= this.K.G()) {
            return Long.MAX_VALUE;
        }
        return this.K.h(this.M);
    }

    public final long B(long j) {
        AbstractC0397Ej.f(j != -9223372036854775807L);
        AbstractC0397Ej.f(this.O != -9223372036854775807L);
        return j - this.O;
    }

    public final void C(C3259xi c3259xi) {
        AbstractC0985aF abstractC0985aF = c3259xi.l;
        SurfaceHolderCallbackC0898Xr surfaceHolderCallbackC0898Xr = this.A;
        surfaceHolderCallbackC0898Xr.l.l.e(27, new C2278nc(11, abstractC0985aF));
        C1042as c1042as = surfaceHolderCallbackC0898Xr.l;
        c1042as.d0 = c3259xi;
        c1042as.l.e(27, new C2278nc(12, c3259xi));
    }

    public final void D() {
        this.J = null;
        this.M = -1;
        C2472pc c2472pc = this.K;
        if (c2472pc != null) {
            c2472pc.E();
            this.K = null;
        }
        C2472pc c2472pc2 = this.L;
        if (c2472pc2 != null) {
            c2472pc2.E();
            this.L = null;
        }
    }

    @Override // o.AbstractC1952k8
    public final String h() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        C((C3259xi) message.obj);
        return true;
    }

    @Override // o.AbstractC1952k8
    public final boolean j() {
        return this.E;
    }

    @Override // o.AbstractC1952k8
    public final boolean k() {
        return true;
    }

    @Override // o.AbstractC1952k8
    public final void l() {
        this.H = null;
        this.N = -9223372036854775807L;
        C3259xi c3259xi = new C3259xi(B(this.P), M60.p);
        Handler handler = this.z;
        if (handler != null) {
            handler.obtainMessage(0, c3259xi).sendToTarget();
        } else {
            C(c3259xi);
        }
        this.O = -9223372036854775807L;
        this.P = -9223372036854775807L;
        D();
        InterfaceC3064vh0 interfaceC3064vh0 = this.I;
        interfaceC3064vh0.getClass();
        interfaceC3064vh0.a();
        this.I = null;
        this.G = 0;
    }

    @Override // o.AbstractC1952k8
    public final void n(long j, boolean z) {
        this.P = j;
        C3259xi c3259xi = new C3259xi(B(this.P), M60.p);
        Handler handler = this.z;
        if (handler != null) {
            handler.obtainMessage(0, c3259xi).sendToTarget();
        } else {
            C(c3259xi);
        }
        this.D = false;
        this.E = false;
        this.N = -9223372036854775807L;
        if (this.G == 0) {
            D();
            InterfaceC3064vh0 interfaceC3064vh0 = this.I;
            interfaceC3064vh0.getClass();
            interfaceC3064vh0.flush();
            return;
        }
        D();
        InterfaceC3064vh0 interfaceC3064vh1 = this.I;
        interfaceC3064vh1.getClass();
        interfaceC3064vh1.a();
        this.I = null;
        this.G = 0;
        this.F = true;
        C0643Nw c0643Nw = this.H;
        c0643Nw.getClass();
        this.I = this.B.p(c0643Nw);
    }

    @Override // o.AbstractC1952k8
    public final void s(C0643Nw[] c0643NwArr, long j, long j2) {
        this.O = j2;
        C0643Nw c0643Nw = c0643NwArr[0];
        this.H = c0643Nw;
        if (this.I != null) {
            this.G = 1;
            return;
        }
        this.F = true;
        c0643Nw.getClass();
        this.I = this.B.p(c0643Nw);
    }

    @Override // o.AbstractC1952k8
    public final void u(long j, long j2) {
        boolean z;
        long jH;
        C2994uv c2994uv = this.C;
        this.P = j;
        if (this.w) {
            long j3 = this.N;
            if (j3 != -9223372036854775807L && j >= j3) {
                D();
                this.E = true;
            }
        }
        if (this.E) {
            return;
        }
        C2472pc c2472pc = this.L;
        O9 o9 = this.B;
        Handler handler = this.z;
        if (c2472pc == null) {
            InterfaceC3064vh0 interfaceC3064vh0 = this.I;
            interfaceC3064vh0.getClass();
            interfaceC3064vh0.c(j);
            try {
                InterfaceC3064vh0 interfaceC3064vh1 = this.I;
                interfaceC3064vh1.getClass();
                this.L = (C2472pc) interfaceC3064vh1.d();
            } catch (C3161wh0 e) {
                AP.g("Subtitle decoding failed. streamFormat=" + this.H, e);
                C3259xi c3259xi = new C3259xi(B(this.P), M60.p);
                if (handler != null) {
                    handler.obtainMessage(0, c3259xi).sendToTarget();
                } else {
                    C(c3259xi);
                }
                D();
                InterfaceC3064vh0 interfaceC3064vh2 = this.I;
                interfaceC3064vh2.getClass();
                interfaceC3064vh2.a();
                this.I = null;
                this.G = 0;
                this.F = true;
                C0643Nw c0643Nw = this.H;
                c0643Nw.getClass();
                this.I = o9.p(c0643Nw);
                return;
            }
        }
        if (this.r != 2) {
            return;
        }
        if (this.K != null) {
            long jA = A();
            z = false;
            while (jA <= j) {
                this.M++;
                jA = A();
                z = true;
            }
        } else {
            z = false;
        }
        C2472pc c2472pc2 = this.L;
        if (c2472pc2 != null) {
            if (c2472pc2.j(4)) {
                if (!z && A() == Long.MAX_VALUE) {
                    if (this.G == 2) {
                        D();
                        InterfaceC3064vh0 interfaceC3064vh3 = this.I;
                        interfaceC3064vh3.getClass();
                        interfaceC3064vh3.a();
                        this.I = null;
                        this.G = 0;
                        this.F = true;
                        C0643Nw c0643Nw2 = this.H;
                        c0643Nw2.getClass();
                        this.I = o9.p(c0643Nw2);
                    } else {
                        D();
                        this.E = true;
                    }
                }
            } else if (c2472pc2.n <= j) {
                C2472pc c2472pc3 = this.K;
                if (c2472pc3 != null) {
                    c2472pc3.E();
                }
                this.M = c2472pc2.e(j);
                this.K = c2472pc2;
                this.L = null;
                z = true;
            }
        }
        if (z) {
            this.K.getClass();
            int iE = this.K.e(j);
            if (iE == 0 || this.K.G() == 0) {
                jH = this.K.n;
            } else if (iE == -1) {
                C2472pc c2472pc4 = this.K;
                jH = c2472pc4.h(c2472pc4.G() - 1);
            } else {
                jH = this.K.h(iE - 1);
            }
            C3259xi c3259xi2 = new C3259xi(B(jH), this.K.t(j));
            if (handler != null) {
                handler.obtainMessage(0, c3259xi2).sendToTarget();
            } else {
                C(c3259xi2);
            }
        }
        if (this.G == 2) {
            return;
        }
        while (!this.D) {
            try {
                C3258xh0 c3258xh0 = this.J;
                if (c3258xh0 == null) {
                    InterfaceC3064vh0 interfaceC3064vh4 = this.I;
                    interfaceC3064vh4.getClass();
                    c3258xh0 = (C3258xh0) interfaceC3064vh4.e();
                    if (c3258xh0 == null) {
                        return;
                    } else {
                        this.J = c3258xh0;
                    }
                }
                if (this.G == 1) {
                    c3258xh0.m = 4;
                    InterfaceC3064vh0 interfaceC3064vh5 = this.I;
                    interfaceC3064vh5.getClass();
                    interfaceC3064vh5.b(c3258xh0);
                    this.J = null;
                    this.G = 2;
                    return;
                }
                int iT = t(c2994uv, c3258xh0, 0);
                if (iT == -4) {
                    if (c3258xh0.j(4)) {
                        this.D = true;
                        this.F = false;
                    } else {
                        C0643Nw c0643Nw3 = (C0643Nw) c2994uv.n;
                        if (c0643Nw3 == null) {
                            return;
                        }
                        c3258xh0.u = c0643Nw3.A;
                        c3258xh0.I();
                        this.F &= !c3258xh0.j(1);
                    }
                    if (!this.F) {
                        InterfaceC3064vh0 interfaceC3064vh6 = this.I;
                        interfaceC3064vh6.getClass();
                        interfaceC3064vh6.b(c3258xh0);
                        this.J = null;
                    }
                } else if (iT == -3) {
                    return;
                }
            } catch (C3161wh0 e2) {
                AP.g("Subtitle decoding failed. streamFormat=" + this.H, e2);
                C3259xi c3259xi3 = new C3259xi(B(this.P), M60.p);
                if (handler != null) {
                    handler.obtainMessage(0, c3259xi3).sendToTarget();
                } else {
                    C(c3259xi3);
                }
                D();
                InterfaceC3064vh0 interfaceC3064vh7 = this.I;
                interfaceC3064vh7.getClass();
                interfaceC3064vh7.a();
                this.I = null;
                this.G = 0;
                this.F = true;
                C0643Nw c0643Nw4 = this.H;
                c0643Nw4.getClass();
                this.I = o9.p(c0643Nw4);
                return;
            }
        }
    }

    @Override // o.AbstractC1952k8
    public final int y(C0643Nw c0643Nw) {
        if (this.B.G(c0643Nw)) {
            return AbstractC1674hK.e(c0643Nw.R == 0 ? 4 : 2, 0, 0);
        }
        return IQ.l(c0643Nw.w) ? AbstractC1674hK.e(1, 0, 0) : AbstractC1674hK.e(0, 0, 0);
    }
}
