package o;

import com.skidush.clonex.database.AppDatabase;
import com.skidush.clonex.fragments.movie.MovieTvFragment;

/* JADX INFO: renamed from: o.oR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2362oR extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ MovieTvFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2362oR(MovieTvFragment movieTvFragment, int i) {
        super(0);
        this.m = i;
        this.n = movieTvFragment;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        switch (this.m) {
            case 0:
                return AppDatabase.m.w(this.n.Q());
            default:
                return new C0744Rt(10, this.n);
        }
    }
}
