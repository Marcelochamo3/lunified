package o;

import com.skidush.clonex.database.AppDatabase;
import com.skidush.clonex.fragments.season.SeasonMobileFragment;

/* JADX INFO: loaded from: classes.dex */
public final class Oa0 extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ SeasonMobileFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Oa0(SeasonMobileFragment seasonMobileFragment, int i) {
        super(0);
        this.m = i;
        this.n = seasonMobileFragment;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        switch (this.m) {
            case 0:
                return AppDatabase.m.w(this.n.Q());
            default:
                return new C0744Rt(19, this.n);
        }
    }
}
