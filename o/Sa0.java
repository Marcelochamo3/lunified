package o;

import com.skidush.clonex.database.AppDatabase;
import com.skidush.clonex.fragments.season.SeasonTvFragment;

/* JADX INFO: loaded from: classes.dex */
public final class Sa0 extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ SeasonTvFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Sa0(SeasonTvFragment seasonTvFragment, int i) {
        super(0);
        this.m = i;
        this.n = seasonTvFragment;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        switch (this.m) {
            case 0:
                return AppDatabase.m.w(this.n.Q());
            default:
                return new C0744Rt(20, this.n);
        }
    }
}
