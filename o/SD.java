package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class SD extends AbstractC3066vi0 {
    public final /* synthetic */ TD e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SD(String str, TD td, int i, long j) {
        super(str, true);
        this.e = td;
        this.f = i;
        this.g = j;
    }

    @Override // o.AbstractC3066vi0
    public final long a() {
        TD td = this.e;
        try {
            td.J.Q(this.f, this.g);
            return -1L;
        } catch (IOException e) {
            td.f(e);
            return -1L;
        }
    }
}
