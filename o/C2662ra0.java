package o;

import com.skidush.clonex.database.AppDatabase;
import com.skidush.clonex.fragments.search.SearchTvFragment;

/* JADX INFO: renamed from: o.ra0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2662ra0 extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ SearchTvFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2662ra0(SearchTvFragment searchTvFragment, int i) {
        super(0);
        this.m = i;
        this.n = searchTvFragment;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        switch (this.m) {
            case 0:
                return AppDatabase.m.w(this.n.Q());
            case 1:
                La0 la0X = this.n.X();
                AbstractC1376eG.w(AbstractC3021v9.o(la0X), AbstractC1910jn.b, 0, new Fa0(la0X, null), 2);
                return C2985uq0.a;
            default:
                return new C0744Rt(18, this.n);
        }
    }
}
