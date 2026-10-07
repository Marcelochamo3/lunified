package o;

import com.skidush.clonex.database.AppDatabase;

/* JADX INFO: renamed from: o.db0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1302db0 extends Ut0 {
    public final C2109lo0 b;
    public final Ma0 c;
    public final AppDatabase d;
    public final C2771sg0 e;
    public final C2802sw f;

    public C1302db0(String str, C2109lo0 c2109lo0, Ma0 ma0, AppDatabase appDatabase) {
        AbstractC1474fG.j(str, "seasonId");
        AbstractC1474fG.j(appDatabase, "database");
        this.b = c2109lo0;
        this.c = ma0;
        this.d = appDatabase;
        C2771sg0 c2771sg0 = new C2771sg0(Za0.a);
        this.e = c2771sg0;
        InterfaceC0473Hh interfaceC0473Hh = null;
        this.f = new C2802sw(c2771sg0, Nr0.H(new C1924ju(this, interfaceC0473Hh, 8), c2771sg0), new C2460pS(3, interfaceC0473Hh, 1));
        e(str);
    }

    public final void e(String str) {
        AbstractC1474fG.j(str, "seasonId");
        AbstractC1376eG.w(AbstractC3021v9.o(this), AbstractC1910jn.b, 0, new C1204cb0(this, str, null), 2);
    }
}
