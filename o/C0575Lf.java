package o;

import java.util.concurrent.CompletableFuture;

/* JADX INFO: renamed from: o.Lf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0575Lf extends CompletableFuture {
    public final InterfaceC0621Na a;

    public C0575Lf(MV mv) {
        this.a = mv;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (z) {
            this.a.cancel();
        }
        return super.cancel(z);
    }
}
