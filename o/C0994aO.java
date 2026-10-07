package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.aO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0994aO extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ C1287dO F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0994aO(C1287dO c1287dO, int i, int i2) {
        super(i);
        this.F = c1287dO;
        this.E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.X50
    public final void S0(int i, RecyclerView recyclerView) {
        De0 de0 = new De0(recyclerView.getContext());
        de0.a = i;
        T0(de0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void V0(C1755i60 c1755i60, int[] iArr) {
        int i = this.E;
        C1287dO c1287dO = this.F;
        if (i == 0) {
            iArr[0] = c1287dO.s0.getWidth();
            iArr[1] = c1287dO.s0.getWidth();
        } else {
            iArr[0] = c1287dO.s0.getHeight();
            iArr[1] = c1287dO.s0.getHeight();
        }
    }
}
