package o;

import java.util.concurrent.CompletableFuture;

/* JADX INFO: renamed from: o.Jf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0523Jf implements InterfaceC0777Ta {
    public final /* synthetic */ int l;
    public final CompletableFuture m;

    public /* synthetic */ C0523Jf(C0575Lf c0575Lf, int i) {
        this.l = i;
        this.m = c0575Lf;
    }

    @Override // o.InterfaceC0777Ta
    public final void E(InterfaceC0621Na interfaceC0621Na, C1759i80 c1759i80) {
        switch (this.l) {
            case 0:
                if (!c1759i80.a.p()) {
                    this.m.completeExceptionally(new C1668hE(c1759i80));
                } else {
                    this.m.complete(c1759i80.b);
                }
                break;
            default:
                this.m.complete(c1759i80);
                break;
        }
    }

    @Override // o.InterfaceC0777Ta
    public final void w(InterfaceC0621Na interfaceC0621Na, Throwable th) {
        switch (this.l) {
            case 0:
                this.m.completeExceptionally(th);
                break;
            default:
                this.m.completeExceptionally(th);
                break;
        }
    }
}
