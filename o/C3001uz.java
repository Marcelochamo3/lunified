package o;

import com.skidush.clonex.database.AppDatabase;
import com.skidush.clonex.fragments.genre.GenreTvFragment;

/* JADX INFO: renamed from: o.uz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3001uz extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ GenreTvFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3001uz(GenreTvFragment genreTvFragment, int i) {
        super(0);
        this.m = i;
        this.n = genreTvFragment;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        switch (this.m) {
            case 0:
                return AppDatabase.m.w(this.n.Q());
            case 1:
                C0594Lz c0594Lz = (C0594Lz) this.n.o0.getValue();
                AbstractC1376eG.w(AbstractC3021v9.o(c0594Lz), AbstractC1910jn.b, 0, new C0491Hz(c0594Lz, null), 2);
                return C2985uq0.a;
            default:
                return new C0744Rt(3, this.n);
        }
    }
}
