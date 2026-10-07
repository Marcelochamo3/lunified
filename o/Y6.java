package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Y6 implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ String m;
    public final /* synthetic */ long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f631o;
    public final /* synthetic */ Object p;

    public /* synthetic */ Y6(Object obj, String str, long j, long j2, int i) {
        this.l = i;
        this.p = obj;
        this.m = str;
        this.n = j;
        this.f631o = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.p;
        int i = this.l;
        C1364e7 c1364e7 = (C1364e7) obj;
        c1364e7.getClass();
        switch (i) {
            case 0:
                int i2 = Lr0.a;
                C0942Zj c0942Zj = c1364e7.c.l.r;
                C3201x2 c3201x2S = c0942Zj.S();
                c0942Zj.T(c3201x2S, 1008, new S1(c3201x2S, this.m, this.f631o, this.n, 5));
                break;
            default:
                int i3 = Lr0.a;
                C0942Zj c0942Zj2 = c1364e7.c.l.r;
                C3201x2 c3201x2S2 = c0942Zj2.S();
                c0942Zj2.T(c3201x2S2, 1016, new S1(c3201x2S2, this.m, this.f631o, this.n, 22));
                break;
        }
    }
}
