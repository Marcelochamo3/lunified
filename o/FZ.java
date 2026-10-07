package o;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class FZ implements InterfaceC1181cG {
    public final /* synthetic */ int a;
    public final /* synthetic */ Map b;

    public /* synthetic */ FZ(LinkedHashMap linkedHashMap, int i) {
        this.a = i;
        this.b = linkedHashMap;
    }

    @Override // o.InterfaceC1181cG
    public final C1855j80 a(D50 d50) {
        switch (this.a) {
            case 0:
                Map map = this.b;
                AbstractC1474fG.j(map, "$customHeaders");
                C1951k70 c1951k70 = d50.e;
                String str = c1951k70.a.a;
                AbstractC0911Ye.q0(c1951k70.c.e()).toString();
                C1855j80 c1855j80B = d50.b(c1951k70);
                if (c1855j80B.l()) {
                    AbstractC1923jt0.G(c1855j80B.f("Location", null));
                    AbstractC1923jt0.F(map);
                }
                return c1855j80B;
            default:
                Map map2 = this.b;
                AbstractC1474fG.j(map2, "$customHeaders");
                C1951k70 c1951k71 = d50.e;
                String str2 = c1951k71.a.a;
                AbstractC0911Ye.q0(c1951k71.c.e()).toString();
                C1855j80 c1855j80B2 = d50.b(c1951k71);
                if (c1855j80B2.l()) {
                    AbstractC1923jt0.G(c1855j80B2.f("Location", null));
                    AbstractC1923jt0.F(map2);
                }
                return c1855j80B2;
        }
    }
}
