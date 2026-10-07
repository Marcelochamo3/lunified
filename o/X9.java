package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class X9 implements InterfaceC1181cG {
    public final /* synthetic */ int a;

    public /* synthetic */ X9(int i) {
        this.a = i;
    }

    @Override // o.InterfaceC1181cG
    public final C1855j80 a(D50 d50) throws IOException {
        switch (this.a) {
            case 0:
                C1951k70 c1951k70 = d50.e;
                c1951k70.a.getClass();
                if (!Z9.b(c1951k70.a.d)) {
                    return d50.b(c1951k70);
                }
                C0560Kq c0560KqA = c1951k70.a();
                C2152mB c2152mB = c1951k70.c;
                if (c2152mB.a("User-Agent") == null && c2152mB.a("user-agent") == null) {
                    c0560KqA.j("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
                }
                if (c2152mB.a("Referer") == null && c2152mB.a("referer") == null) {
                    c0560KqA.j("Referer", "https://streamtpcloud.com/");
                }
                if (c2152mB.a("Origin") == null && c2152mB.a("origin") == null) {
                    c0560KqA.j("Origin", "https://streamtpcloud.com");
                }
                return d50.b(c0560KqA.c());
            case 1:
                C1951k70 c1951k71 = d50.e;
                C2774si c2774si = (C2774si) C2774si.class.cast(c1951k71.e.get(C2774si.class));
                if (c2774si == null) {
                    C2446pE c2446pE = c1951k71.a;
                    AbstractC1474fG.j(c2446pE, "url");
                    String lowerCase = c2446pE.d.toLowerCase(Locale.ROOT);
                    AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                    c2774si = new C2774si(c2446pE.a, c2446pE.e, lowerCase);
                }
                C0560Kq c0560KqA2 = c1951k71.a();
                c0560KqA2.r(C2774si.class, c2774si);
                return d50.b(c0560KqA2.c());
            case 2:
                C1951k70 c1951k72 = d50.e;
                C2774si c2774si2 = (C2774si) C2774si.class.cast(c1951k72.e.get(C2774si.class));
                if (c2774si2 != null) {
                    C2446pE c2446pE2 = c1951k72.a;
                    AbstractC1474fG.j(c2446pE2, "url");
                    if (!AbstractC1899jh0.N(c2774si2.a, c2446pE2.a, true) || !AbstractC1899jh0.N(c2774si2.b, c2446pE2.d, true) || c2774si2.c != c2446pE2.e) {
                        C0560Kq c0560KqA3 = c1951k72.a();
                        Set setE = c1951k72.c.e();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : setE) {
                            if (AbstractC2506pt.z((String) obj)) {
                                arrayList.add(obj);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            c0560KqA3.n((String) it.next());
                        }
                        return d50.b(c0560KqA3.c());
                    }
                }
                return d50.b(c1951k72);
            case 3:
                return C2838tJ.p(d50);
            case 4:
                C1951k70 c1951k73 = d50.e;
                AbstractC1370eA.M(c1951k73.a.i, false);
                return d50.b(c1951k73);
            default:
                C1951k70 c1951k74 = d50.e;
                AbstractC1370eA.M(c1951k74.a.i, true);
                return d50.b(c1951k74);
        }
    }
}
