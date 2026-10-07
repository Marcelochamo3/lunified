package o;

import com.skidush.clonex.database.AppDatabase;
import com.skidush.clonex.fragments.tv_shows.TvShowsTvFragment;

/* JADX INFO: renamed from: o.ap0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1037ap0 extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ TvShowsTvFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1037ap0(TvShowsTvFragment tvShowsTvFragment, int i) {
        super(0);
        this.m = i;
        this.n = tvShowsTvFragment;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        switch (this.m) {
            case 0:
                return AppDatabase.m.w(this.n.Q());
            case 1:
                C2111lp0 c2111lp0 = (C2111lp0) this.n.n0.getValue();
                AbstractC1376eG.w(AbstractC3021v9.o(c2111lp0), AbstractC1910jn.b, 0, new C2013kp0(c2111lp0, null), 2);
                return C2985uq0.a;
            default:
                return new C0744Rt(24, this.n);
        }
    }
}
