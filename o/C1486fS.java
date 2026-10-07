package o;

import com.skidush.clonex.database.AppDatabase;
import com.skidush.clonex.fragments.movies.MoviesTvFragment;

/* JADX INFO: renamed from: o.fS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1486fS extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ MoviesTvFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1486fS(MoviesTvFragment moviesTvFragment, int i) {
        super(0);
        this.m = i;
        this.n = moviesTvFragment;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        switch (this.m) {
            case 0:
                return AppDatabase.m.w(this.n.Q());
            case 1:
                C2557qS c2557qS = (C2557qS) this.n.n0.getValue();
                AbstractC1376eG.w(AbstractC3021v9.o(c2557qS), AbstractC1910jn.b, 0, new C2363oS(c2557qS, null), 2);
                return C2985uq0.a;
            default:
                return new C0744Rt(12, this.n);
        }
    }
}
