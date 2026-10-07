package o;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: o.xs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3279xs extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ InterfaceC0360Cy n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3279xs(InterfaceC0360Cy interfaceC0360Cy, int i) {
        super(0);
        this.m = i;
        this.n = interfaceC0360Cy;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        switch (this.m) {
            case 0:
                return (InterfaceC1047au0) this.n.c();
            case 1:
                try {
                    return (List) this.n.c();
                } catch (SSLPeerUnverifiedException unused) {
                    return C1233cq.l;
                }
            case 2:
                return (InterfaceC1047au0) this.n.c();
            case 3:
                return (InterfaceC1047au0) this.n.c();
            case 4:
                return (InterfaceC1047au0) this.n.c();
            case 5:
                return (InterfaceC1047au0) this.n.c();
            case 6:
                this.n.c();
                return C2985uq0.a;
            default:
                this.n.c();
                return C2985uq0.a;
        }
    }
}
