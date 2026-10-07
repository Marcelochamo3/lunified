package o;

import com.skidush.clonex.database.AppDatabase;
import com.skidush.clonex.fragments.people.PeopleTvFragment;

/* JADX INFO: renamed from: o.nY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2272nY extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ PeopleTvFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2272nY(PeopleTvFragment peopleTvFragment, int i) {
        super(0);
        this.m = i;
        this.n = peopleTvFragment;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        switch (this.m) {
            case 0:
                return AppDatabase.m.w(this.n.Q());
            case 1:
                CY cy = (CY) this.n.o0.getValue();
                AbstractC1376eG.w(AbstractC3021v9.o(cy), AbstractC1910jn.b, 0, new AY(cy, null), 2);
                return C2985uq0.a;
            default:
                return new C0744Rt(14, this.n);
        }
    }
}
