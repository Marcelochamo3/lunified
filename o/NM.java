package o;

import com.skidush.clonex.R;

/* JADX INFO: loaded from: classes.dex */
public final class NM extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ YT n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NM(YT yt, int i) {
        super(0);
        this.m = i;
        this.n = yt;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        switch (this.m) {
            case 0:
                YT yt = this.n;
                TT ttH = yt.h();
                if (ttH == null || ttH.s != R.id.events) {
                    yt.n(R.id.events, null, null);
                }
                return C2985uq0.a;
            case 1:
                this.n.n(R.id.favorites, null, null);
                return C2985uq0.a;
            case 2:
                this.n.n(R.id.history, null, null);
                return C2985uq0.a;
            default:
                YT yt2 = this.n;
                yt2.getClass();
                return new ZT(yt2.a, yt2.u);
        }
    }
}
