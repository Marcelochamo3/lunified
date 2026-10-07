package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Zs0 implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ C1364e7 m;
    public final /* synthetic */ C0579Lj n;

    public /* synthetic */ Zs0(C1364e7 c1364e7, C0579Lj c0579Lj, int i) {
        this.l = i;
        this.m = c1364e7;
        this.n = c0579Lj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                C1364e7 c1364e7 = this.m;
                C0579Lj c0579Lj = this.n;
                c1364e7.getClass();
                synchronized (c0579Lj) {
                }
                SurfaceHolderCallbackC0898Xr surfaceHolderCallbackC0898Xr = c1364e7.c;
                int i = Lr0.a;
                C1042as c1042as = surfaceHolderCallbackC0898Xr.l;
                C0942Zj c0942Zj = c1042as.r;
                C3201x2 c3201x2P = c0942Zj.P((CP) c0942Zj.f663o.q);
                c0942Zj.T(c3201x2P, 1020, new C2278nc(c3201x2P, (Object) c0579Lj, 3));
                c1042as.P = null;
                break;
            default:
                C1364e7 c1364e8 = this.m;
                c1364e8.getClass();
                int i2 = Lr0.a;
                C1042as c1042as2 = c1364e8.c.l;
                c1042as2.getClass();
                C0942Zj c0942Zj2 = c1042as2.r;
                C3201x2 c3201x2S = c0942Zj2.S();
                c0942Zj2.T(c3201x2S, 1015, new S1(c3201x2S, this.n, 20));
                break;
        }
    }
}
