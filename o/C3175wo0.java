package o;

import com.skidush.clonex.database.AppDatabase;
import com.skidush.clonex.fragments.tv_show.TvShowTvFragment;

/* JADX INFO: renamed from: o.wo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3175wo0 extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ TvShowTvFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3175wo0(TvShowTvFragment tvShowTvFragment, int i) {
        super(0);
        this.m = i;
        this.n = tvShowTvFragment;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        switch (this.m) {
            case 0:
                return AppDatabase.m.w(this.n.Q());
            default:
                return new C0744Rt(22, this.n);
        }
    }
}
