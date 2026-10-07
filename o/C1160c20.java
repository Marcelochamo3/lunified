package o;

import java.util.ArrayList;

/* JADX INFO: renamed from: o.c20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1160c20 extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ AbstractC1258d20 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1160c20(AbstractC1258d20 abstractC1258d20, int i) {
        super(0);
        this.m = i;
        this.n = abstractC1258d20;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        AbstractC1258d20 abstractC1258d20 = this.n;
        switch (this.m) {
            case 0:
                return Integer.valueOf(AbstractC1468fA.p(abstractC1258d20, (Zb0[]) abstractC1258d20.j.getValue()));
            case 1:
                LF lf = abstractC1258d20.b;
                return lf != null ? new InterfaceC2159mI[]{(InterfaceC2159mI) lf.b} : AbstractC3021v9.c;
            default:
                return UK.g(abstractC1258d20.b != null ? new ArrayList(0) : null);
        }
    }
}
