package o;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: o.Ip, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0507Ip extends Pu0 {
    public final /* synthetic */ Pu0 f;
    public final /* synthetic */ ThreadPoolExecutor g;

    public C0507Ip(Pu0 pu0, ThreadPoolExecutor threadPoolExecutor) {
        this.f = pu0;
        this.g = threadPoolExecutor;
    }

    @Override // o.Pu0
    public final void o(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.g;
        try {
            this.f.o(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // o.Pu0
    public final void p(C1583gR c1583gR) {
        ThreadPoolExecutor threadPoolExecutor = this.g;
        try {
            this.f.p(c1583gR);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
