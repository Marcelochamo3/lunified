package o;

import com.skidush.clonex.database.AppDatabase;

/* JADX INFO: renamed from: o.qS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2557qS extends Ut0 {
    public final C2771sg0 b;
    public final C2802sw c;
    public int d;

    public C2557qS(AppDatabase appDatabase) {
        AbstractC1474fG.j(appDatabase, "database");
        C2771sg0 c2771sg0 = new C2771sg0(C1876jS.a);
        this.b = c2771sg0;
        InterfaceC0473Hh interfaceC0473Hh = null;
        this.c = new C2802sw(c2771sg0, Nr0.H(new C1924ju(appDatabase, interfaceC0473Hh, 7), c2771sg0), new C2460pS(3, interfaceC0473Hh, 0));
        this.d = 1;
        e();
    }

    public final void e() {
        AbstractC1376eG.w(AbstractC3021v9.o(this), AbstractC1910jn.b, 0, new C2266nS(this, null), 2);
    }
}
