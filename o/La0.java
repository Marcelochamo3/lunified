package o;

import com.skidush.clonex.database.AppDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class La0 extends Ut0 {
    public final C2771sg0 b;
    public final C2022ku c;
    public String d;
    public int e;
    public C1703hg0 f;

    public La0(AppDatabase appDatabase) {
        AbstractC1474fG.j(appDatabase, "database");
        C2771sg0 c2771sg0 = new C2771sg0(Aa0.a);
        this.b = c2771sg0;
        InterfaceC0473Hh interfaceC0473Hh = null;
        C0675Pc c0675PcH = Nr0.H(new Ka0(appDatabase, interfaceC0473Hh, 0), c2771sg0);
        C0675Pc c0675PcH2 = Nr0.H(new Ka0(appDatabase, interfaceC0473Hh, 1), c2771sg0);
        this.c = new C2022ku(new InterfaceC1538fw[]{c2771sg0, c0675PcH, c0675PcH2}, 2, new C0569Kz(4, interfaceC0473Hh, 2));
        this.d = "";
        this.e = 1;
        e("");
    }

    public final void e(String str) {
        AbstractC1474fG.j(str, "query");
        C1703hg0 c1703hg0 = this.f;
        if (c1703hg0 != null) {
            c1703hg0.f(null);
        }
        this.f = AbstractC1376eG.w(AbstractC3021v9.o(this), AbstractC1910jn.b, 0, new Ga0(this, str, null), 2);
    }

    public final void f(String str, String str2) {
        AbstractC1474fG.j(str, "query");
        C1703hg0 c1703hg0 = this.f;
        if (c1703hg0 != null) {
            c1703hg0.f(null);
        }
        this.f = AbstractC1376eG.w(AbstractC3021v9.o(this), AbstractC1910jn.b, 0, new Ja0(this, str, str2, null), 2);
    }
}
