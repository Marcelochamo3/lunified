package o;

import android.util.Pair;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: o.um, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2976um implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1060o;

    public /* synthetic */ RunnableC2976um(Object obj, int i, Object obj2, int i2) {
        this.l = i2;
        this.n = obj;
        this.m = i;
        this.f1060o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                ((InterfaceC2719s30) ((Q6) this.n).c).g(this.m, this.f1060o);
                break;
            case 1:
                C0350Co c0350Co = (C0350Co) this.n;
                int i = c0350Co.a;
                InterfaceC0376Do interfaceC0376Do = (InterfaceC0376Do) this.f1060o;
                interfaceC0376Do.getClass();
                interfaceC0376Do.k(i, c0350Co.b, this.m);
                break;
            case 2:
                for (SK sk : (CopyOnWriteArraySet) this.n) {
                    if (!sk.d) {
                        int i2 = this.m;
                        if (i2 != -1) {
                            sk.b.a(i2);
                        }
                        sk.c = true;
                        ((QK) this.f1060o).b(sk.a);
                    }
                }
                break;
            default:
                C0942Zj c0942Zj = (C0942Zj) ((QP) ((C2994uv) this.n).n).i;
                Pair pair = (Pair) this.f1060o;
                c0942Zj.k(((Integer) pair.first).intValue(), (CP) pair.second, this.m);
                break;
        }
    }

    public /* synthetic */ RunnableC2976um(Object obj, Object obj2, int i, int i2) {
        this.l = i2;
        this.n = obj;
        this.f1060o = obj2;
        this.m = i;
    }
}
