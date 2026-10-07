package o;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Stack;
import java.util.function.Supplier;

/* JADX INFO: renamed from: o.ff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1504ff implements Supplier {
    public final /* synthetic */ int a;

    public /* synthetic */ C1504ff(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C3370yp();
            case 1:
                return new ArrayList();
            case 2:
                return new AbstractC2053l90.g();
            case 3:
                return new AbstractC2053l90.a();
            case 4:
                return new AbstractC2053l90.i();
            case 5:
                return new AbstractC2053l90.j();
            case 6:
                return new AbstractC2053l90.e();
            case 7:
                return new AbstractC2053l90.c();
            case 8:
                return new AbstractC2053l90.f();
            case 9:
                return new Stack();
            case 10:
                return new IdentityHashMap();
            case 11:
                return new C1196cV(new C3176wp(C2678ri0.c("html", "http://www.w3.org/1999/xhtml", C2852tX.d), "", null), C3176wp.class);
            case 12:
                return new C1837j();
            case 13:
                return new EE();
            case 14:
                return new C2267nT();
            case 15:
                return new Y40();
            case 16:
                return new C1585gT();
            case 17:
                return new C1683hT();
            case 18:
                return new C1174c90();
            case 19:
                return new C1672hI();
            case 20:
                return new TW();
            case 21:
                return new C1348dz();
            case 22:
                return new C1545g();
            case 23:
                return new Yu0();
            case 24:
                return new OI();
            case 25:
                return new C2461pT();
            case 26:
                return new C3326yM();
            case 27:
                return new C1857j90();
            case 28:
                return new C1389eT();
            default:
                return new C2256nI();
        }
    }
}
