package o;

import com.skidush.clonex.database.AppDatabase;
import com.skidush.clonex.fragments.movie.MovieMobileFragment;

/* JADX INFO: renamed from: o.hR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1681hR extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ MovieMobileFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1681hR(MovieMobileFragment movieMobileFragment, int i) {
        super(0);
        this.m = i;
        this.n = movieMobileFragment;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        switch (this.m) {
            case 0:
                return AppDatabase.m.w(this.n.Q());
            default:
                return new C0744Rt(9, this.n);
        }
    }
}
