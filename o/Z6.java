package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Z6 implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ C1364e7 m;
    public final /* synthetic */ Exception n;

    public /* synthetic */ Z6(C1364e7 c1364e7, Exception exc, int i) {
        this.l = i;
        this.m = c1364e7;
        this.n = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Exception exc = this.n;
        C1364e7 c1364e7 = this.m;
        int i = this.l;
        c1364e7.getClass();
        switch (i) {
            case 0:
                int i2 = Lr0.a;
                C0942Zj c0942Zj = c1364e7.c.l.r;
                C3201x2 c3201x2S = c0942Zj.S();
                c0942Zj.T(c3201x2S, 1029, new C0838Vj(c3201x2S, exc, 26));
                break;
            default:
                int i3 = Lr0.a;
                C0942Zj c0942Zj2 = c1364e7.c.l.r;
                C3201x2 c3201x2S2 = c0942Zj2.S();
                c0942Zj2.T(c3201x2S2, 1014, new C0838Vj(c3201x2S2, exc, 6));
                break;
        }
    }
}
