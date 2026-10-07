package o;

import com.skidush.clonex.database.AppDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class CY extends Ut0 {
    public final String b;
    public final C2771sg0 c;
    public final C2022ku d;
    public int e;

    public CY(String str, AppDatabase appDatabase) {
        int i = 1;
        AbstractC1474fG.j(str, "id");
        AbstractC1474fG.j(appDatabase, "database");
        this.b = str;
        C2771sg0 c2771sg0 = new C2771sg0(C3047vY.a);
        this.c = c2771sg0;
        InterfaceC0473Hh interfaceC0473Hh = null;
        C0675Pc c0675PcH = Nr0.H(new BY(appDatabase, interfaceC0473Hh, 0), c2771sg0);
        C0675Pc c0675PcH2 = Nr0.H(new BY(appDatabase, interfaceC0473Hh, i), c2771sg0);
        this.d = new C2022ku(new InterfaceC1538fw[]{c2771sg0, c0675PcH, c0675PcH2}, 2, new C0569Kz(4, interfaceC0473Hh, i));
        this.e = 1;
        e(str);
    }

    public final void e(String str) {
        AbstractC1474fG.j(str, "id");
        AbstractC1376eG.w(AbstractC3021v9.o(this), AbstractC1910jn.b, 0, new C3435zY(this, str, null), 2);
    }
}
