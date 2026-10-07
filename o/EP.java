package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class EP implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ C2613qy m;
    public final /* synthetic */ IP n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0991aL f237o;
    public final /* synthetic */ C2069lP p;

    public /* synthetic */ EP(C2613qy c2613qy, IP ip, C0991aL c0991aL, C2069lP c2069lP, int i) {
        this.l = i;
        this.m = c2613qy;
        this.n = ip;
        this.f237o = c0991aL;
        this.p = c2069lP;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                C2613qy c2613qy = this.m;
                this.n.L(c2613qy.m, (CP) c2613qy.n, this.f237o, this.p);
                break;
            case 1:
                C2613qy c2613qy2 = this.m;
                this.n.C(c2613qy2.m, (CP) c2613qy2.n, this.f237o, this.p);
                break;
            default:
                C2613qy c2613qy3 = this.m;
                this.n.g(c2613qy3.m, (CP) c2613qy3.n, this.f237o, this.p);
                break;
        }
    }
}
