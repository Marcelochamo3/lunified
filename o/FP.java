package o;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class FP implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ C0991aL m;
    public final /* synthetic */ C2069lP n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ IOException f258o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ FP(Object obj, Object obj2, C0991aL c0991aL, C2069lP c2069lP, IOException iOException, boolean z, int i) {
        this.l = i;
        this.q = obj;
        this.r = obj2;
        this.m = c0991aL;
        this.n = c2069lP;
        this.f258o = iOException;
        this.p = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                C2613qy c2613qy = (C2613qy) this.q;
                ((IP) this.r).o(c2613qy.m, (CP) c2613qy.n, this.m, this.n, this.f258o, this.p);
                break;
            default:
                C0942Zj c0942Zj = (C0942Zj) ((QP) ((C2994uv) this.q).n).i;
                Pair pair = (Pair) this.r;
                c0942Zj.o(((Integer) pair.first).intValue(), (CP) pair.second, this.m, this.n, this.f258o, this.p);
                break;
        }
    }
}
