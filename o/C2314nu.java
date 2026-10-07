package o;

import android.content.Context;

/* JADX INFO: renamed from: o.nu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2314nu extends Ut0 {
    public final Context b;
    public final C2771sg0 c;
    public final C2917u50 d;
    public C1703hg0 e;

    public C2314nu(Context context) {
        this.b = context.getApplicationContext();
        C2771sg0 c2771sg0 = new C2771sg0(C1241cu.a);
        this.c = c2771sg0;
        this.d = new C2917u50(c2771sg0);
    }

    public static final C1387eR e(C2314nu c2314nu, C1387eR c1387eR, String str) {
        c2314nu.getClass();
        C1387eR c1387eRF = C1387eR.f(c1387eR, null, null, 32767);
        c1387eRF.h(c1387eR);
        c1387eRF.t = str;
        return c1387eRF;
    }

    @Override // o.Ut0
    public final void d() {
        C1703hg0 c1703hg0 = this.e;
        if (c1703hg0 != null) {
            c1703hg0.f(null);
        }
    }
}
