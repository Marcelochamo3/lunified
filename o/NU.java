package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class NU extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ C1583gR n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NU(C1583gR c1583gR, int i) {
        super(0);
        this.m = i;
        this.n = c1583gR;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        switch (this.m) {
            case 0:
                Iterator it = ((ArrayList) this.n.n).iterator();
                while (it.hasNext()) {
                    ((OJ) it.next()).a();
                }
                break;
            default:
                Iterator it2 = ((ArrayList) this.n.n).iterator();
                while (it2.hasNext()) {
                    ((OJ) it2.next()).getClass();
                }
                break;
        }
        return C2985uq0.a;
    }
}
