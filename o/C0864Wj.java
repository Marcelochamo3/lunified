package o;

import androidx.leanback.widget.HorizontalGridView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.Wj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0864Wj implements QK, Rt0 {
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    public /* synthetic */ C0864Wj(int i, int i2) {
        this.l = i2;
        this.m = i;
    }

    @Override // o.QK
    public void b(Object obj) {
        switch (this.l) {
            case 0:
                C2747sP c2747sP = (C2747sP) obj;
                c2747sP.getClass();
                int i = this.m;
                if (i == 1) {
                    c2747sP.u = true;
                }
                c2747sP.k = i;
                break;
            default:
                ((InterfaceC2176mZ) obj).n(this.m);
                break;
        }
    }

    @Override // o.Rt0
    public void d(AbstractC2144m60 abstractC2144m60) {
        O50 adapter;
        C1498fc c1498fc = abstractC2144m60 instanceof C1498fc ? (C1498fc) abstractC2144m60 : null;
        RecyclerView recyclerViewV = c1498fc != null ? c1498fc.v() : null;
        HorizontalGridView horizontalGridView = recyclerViewV instanceof HorizontalGridView ? (HorizontalGridView) recyclerViewV : null;
        int iA = (horizontalGridView == null || (adapter = horizontalGridView.getAdapter()) == null) ? 0 : adapter.a();
        if (horizontalGridView == null || iA == 0) {
            abstractC2144m60.a.requestFocus();
        } else {
            horizontalGridView.r0(U9.h(this.m, 0, iA - 1), new C2278nc(24, horizontalGridView));
        }
    }

    public /* synthetic */ C0864Wj(C3201x2 c3201x2, int i, C2273nZ c2273nZ, C2273nZ c2273nZ2) {
        this.l = 0;
        this.m = i;
    }
}
