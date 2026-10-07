package o;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MP implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ C2994uv m;
    public final /* synthetic */ Pair n;

    public /* synthetic */ MP(C2994uv c2994uv, Pair pair, int i) {
        this.l = i;
        this.m = c2994uv;
        this.n = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                C0942Zj c0942Zj = (C0942Zj) ((QP) this.m.n).i;
                Pair pair = this.n;
                c0942Zj.j(((Integer) pair.first).intValue(), (CP) pair.second);
                break;
            case 1:
                C0942Zj c0942Zj2 = (C0942Zj) ((QP) this.m.n).i;
                Pair pair2 = this.n;
                c0942Zj2.c(((Integer) pair2.first).intValue(), (CP) pair2.second);
                break;
            case 2:
                C0942Zj c0942Zj3 = (C0942Zj) ((QP) this.m.n).i;
                Pair pair3 = this.n;
                c0942Zj3.D(((Integer) pair3.first).intValue(), (CP) pair3.second);
                break;
            default:
                C0942Zj c0942Zj4 = (C0942Zj) ((QP) this.m.n).i;
                Pair pair4 = this.n;
                c0942Zj4.x(((Integer) pair4.first).intValue(), (CP) pair4.second);
                break;
        }
    }
}
