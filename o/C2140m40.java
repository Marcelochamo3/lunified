package o;

import android.app.Application;

/* JADX INFO: renamed from: o.m40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2140m40 extends L2 {
    public final C2771sg0 c;
    public final C2771sg0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2140m40(Application application) {
        super(application);
        AbstractC1474fG.j(application, "application");
        C2771sg0 c2771sg0 = new C2771sg0(C1653h40.a);
        this.c = c2771sg0;
        this.d = c2771sg0;
        e(null);
    }

    public final C1703hg0 e(String str) {
        return AbstractC1376eG.w(AbstractC3021v9.o(this), AbstractC1910jn.b, 0, new C2043l40(this, str, null), 2);
    }
}
