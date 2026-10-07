package o;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class LP implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ C2994uv m;
    public final /* synthetic */ Pair n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0991aL f377o;
    public final /* synthetic */ C2069lP p;

    public /* synthetic */ LP(C2994uv c2994uv, Pair pair, C0991aL c0991aL, C2069lP c2069lP, int i) {
        this.l = i;
        this.m = c2994uv;
        this.n = pair;
        this.f377o = c0991aL;
        this.p = c2069lP;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                C0942Zj c0942Zj = (C0942Zj) ((QP) this.m.n).i;
                Pair pair = this.n;
                c0942Zj.L(((Integer) pair.first).intValue(), (CP) pair.second, this.f377o, this.p);
                break;
            case 1:
                C0942Zj c0942Zj2 = (C0942Zj) ((QP) this.m.n).i;
                Pair pair2 = this.n;
                c0942Zj2.g(((Integer) pair2.first).intValue(), (CP) pair2.second, this.f377o, this.p);
                break;
            default:
                C0942Zj c0942Zj3 = (C0942Zj) ((QP) this.m.n).i;
                Pair pair3 = this.n;
                c0942Zj3.C(((Integer) pair3.first).intValue(), (CP) pair3.second, this.f377o, this.p);
                break;
        }
    }
}
