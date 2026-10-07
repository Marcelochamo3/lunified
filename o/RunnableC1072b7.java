package o;

/* JADX INFO: renamed from: o.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1072b7 implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ C1364e7 m;
    public final /* synthetic */ C0579Lj n;

    public /* synthetic */ RunnableC1072b7(C1364e7 c1364e7, C0579Lj c0579Lj, int i) {
        this.l = i;
        this.m = c1364e7;
        this.n = c0579Lj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                C1364e7 c1364e7 = this.m;
                c1364e7.getClass();
                int i = Lr0.a;
                C1042as c1042as = c1364e7.c.l;
                c1042as.getClass();
                C0942Zj c0942Zj = c1042as.r;
                C3201x2 c3201x2S = c0942Zj.S();
                c0942Zj.T(c3201x2S, 1007, new C0838Vj(c3201x2S, this.n, 10));
                break;
            default:
                C1364e7 c1364e8 = this.m;
                C0579Lj c0579Lj = this.n;
                c1364e8.getClass();
                synchronized (c0579Lj) {
                }
                SurfaceHolderCallbackC0898Xr surfaceHolderCallbackC0898Xr = c1364e8.c;
                int i2 = Lr0.a;
                C0942Zj c0942Zj2 = surfaceHolderCallbackC0898Xr.l.r;
                c0942Zj2.T(c0942Zj2.P((CP) c0942Zj2.f663o.q), 1013, new S1(25));
                break;
        }
    }
}
