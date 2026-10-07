package o;

import com.skidush.clonex.database.AppDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class MR extends Ut0 {
    public final AppDatabase b;
    public final C2771sg0 c;
    public final C2022ku d;

    public MR(String str, AppDatabase appDatabase) {
        int i = 0;
        AbstractC1474fG.j(str, "id");
        AbstractC1474fG.j(appDatabase, "database");
        this.b = appDatabase;
        C2771sg0 c2771sg0 = new C2771sg0(FR.a);
        this.c = c2771sg0;
        C1583gR c1583gRP = appDatabase.p();
        c1583gRP.getClass();
        G80 g80A = G80.a(1, "SELECT * FROM movies WHERE id = ?");
        g80A.o(1, str);
        InterfaceC0473Hh interfaceC0473Hh = null;
        this.d = new C2022ku(new InterfaceC1538fw[]{c2771sg0, UK.j((F80) c1583gRP.m, new String[]{"movies"}, new CallableC1485fR(c1583gRP, g80A, i)), Nr0.H(new JR(this, interfaceC0473Hh, i), c2771sg0), Nr0.H(new JR(this, interfaceC0473Hh, 1), c2771sg0)}, 3, new KR(5, null));
        e(str);
    }

    public final void e(String str) {
        AbstractC1474fG.j(str, "id");
        AbstractC1376eG.w(AbstractC3021v9.o(this), AbstractC1910jn.b, 0, new IR(this, str, null), 2);
    }
}
