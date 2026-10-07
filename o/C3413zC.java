package o;

import com.skidush.clonex.database.AppDatabase;
import com.skidush.clonex.fragments.home.HomeMobileFragment;

/* JADX INFO: renamed from: o.zC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3413zC extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ HomeMobileFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3413zC(HomeMobileFragment homeMobileFragment, int i) {
        super(0);
        this.m = i;
        this.n = homeMobileFragment;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        switch (this.m) {
            case 0:
                return AppDatabase.m.w(this.n.Q());
            default:
                return new C0744Rt(6, this.n);
        }
    }
}
