package o;

import com.skidush.clonex.database.AppDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class Wo0 extends Ut0 {
    public final AppDatabase b;
    public final C2771sg0 c;
    public final C2022ku d;
    public final C2771sg0 e;

    public Wo0(String str, AppDatabase appDatabase) {
        int i = 0;
        int i2 = 1;
        AbstractC1474fG.j(str, "id");
        AbstractC1474fG.j(appDatabase, "database");
        this.b = appDatabase;
        C2771sg0 c2771sg0 = new C2771sg0(Oo0.a);
        this.c = c2771sg0;
        InterfaceC0473Hh interfaceC0473Hh = null;
        C0675Pc c0675PcH = Nr0.H(new To0(this, str, null), c2771sg0);
        C2303no0 c2303no0R = appDatabase.r();
        c2303no0R.getClass();
        G80 g80A = G80.a(1, "SELECT * FROM tv_shows WHERE id = ?");
        g80A.o(1, str);
        C2538q90 c2538q90J = UK.j((F80) c2303no0R.m, new String[]{"tv_shows"}, new CallableC2206mo0(c2303no0R, g80A, i));
        C0560Kq c0560KqO = appDatabase.o();
        c0560KqO.getClass();
        G80 g80A2 = G80.a(1, "SELECT * FROM episodes WHERE tvShow = ? ORDER BY season, number");
        g80A2.o(1, str);
        this.d = new C2022ku(new InterfaceC1538fw[]{c0675PcH, c2538q90J, UK.j((F80) c0560KqO.m, new String[]{"episodes"}, new CallableC0534Jq(c0560KqO, g80A2, i2)), Nr0.H(new Uo0(this, interfaceC0473Hh, i), c2771sg0), Nr0.H(new Uo0(this, interfaceC0473Hh, i2), c2771sg0)}, 4, new Vo0(null));
        this.e = new C2771sg0(Lo0.m);
        e(str);
    }

    public final void e(String str) {
        AbstractC1474fG.j(str, "id");
        AbstractC1376eG.w(AbstractC3021v9.o(this), AbstractC1910jn.b, 0, new So0(this, str, null), 2);
    }
}
