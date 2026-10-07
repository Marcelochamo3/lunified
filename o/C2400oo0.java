package o;

import com.skidush.clonex.database.AppDatabase;
import com.skidush.clonex.fragments.tv_show.TvShowMobileFragment;

/* JADX INFO: renamed from: o.oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2400oo0 extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ TvShowMobileFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2400oo0(TvShowMobileFragment tvShowMobileFragment, int i) {
        super(0);
        this.m = i;
        this.n = tvShowMobileFragment;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        switch (this.m) {
            case 0:
                return AppDatabase.m.w(this.n.Q());
            default:
                return new C0744Rt(21, this.n);
        }
    }
}
