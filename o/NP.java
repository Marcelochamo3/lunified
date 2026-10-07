package o;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class NP implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ C2994uv m;
    public final /* synthetic */ Pair n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2069lP f411o;

    public /* synthetic */ NP(C2994uv c2994uv, Pair pair, C2069lP c2069lP, int i) {
        this.l = i;
        this.m = c2994uv;
        this.n = pair;
        this.f411o = c2069lP;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                C0942Zj c0942Zj = (C0942Zj) ((QP) this.m.n).i;
                Pair pair = this.n;
                c0942Zj.B(((Integer) pair.first).intValue(), (CP) pair.second, this.f411o);
                break;
            default:
                C0942Zj c0942Zj2 = (C0942Zj) ((QP) this.m.n).i;
                Pair pair2 = this.n;
                int iIntValue = ((Integer) pair2.first).intValue();
                CP cp = (CP) pair2.second;
                cp.getClass();
                c0942Zj2.K(iIntValue, cp, this.f411o);
                break;
        }
    }
}
