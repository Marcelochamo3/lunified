package o;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class IB extends Ut0 {
    public final Context b;
    public final C2771sg0 c;
    public final C2917u50 d;
    public C1703hg0 e;

    public IB(Context context) {
        this.b = context.getApplicationContext();
        C2771sg0 c2771sg0 = new C2771sg0(CB.a);
        this.c = c2771sg0;
        this.d = new C2917u50(c2771sg0);
    }

    @Override // o.Ut0
    public final void d() {
        C1703hg0 c1703hg0 = this.e;
        if (c1703hg0 != null) {
            c1703hg0.f(null);
        }
    }
}
