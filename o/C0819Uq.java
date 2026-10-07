package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: o.Uq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0819Uq extends AbstractC1332dr {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ C0819Uq(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
    }

    @Override // o.AbstractC1332dr
    public int a() {
        switch (this.a) {
            case 0:
                return 2;
            case 1:
                return 6;
            case 2:
                return 6;
            case 3:
            case 4:
            case 6:
            default:
                return super.a();
            case 5:
                return 10;
            case 7:
                return 10;
            case 8:
                return 2;
            case 9:
                return 1;
        }
    }

    @Override // o.AbstractC1332dr
    public final boolean b(C3176wp c3176wp, C3176wp c3176wp2) {
        switch (this.a) {
            case 0:
                return c3176wp2.r(this.b);
            case 1:
                F6 f6G = c3176wp2.g();
                f6G.getClass();
                ArrayList arrayList = new ArrayList(f6G.l);
                for (int i = 0; i < f6G.l; i++) {
                    if (!F6.q(f6G.m[i])) {
                        arrayList.add(new D6(f6G.m[i], (String) f6G.n[i], f6G));
                    }
                }
                Iterator it = Collections.unmodifiableList(arrayList).iterator();
                while (it.hasNext()) {
                    if (AP.o(((D6) it.next()).l).startsWith(this.b)) {
                        return true;
                    }
                }
                return false;
            case 2:
                return c3176wp2.Q(this.b);
            case 3:
                return AP.o(c3176wp2.M()).contains(this.b);
            case 4:
                return AP.o(c3176wp2.U()).contains(this.b);
            case 5:
                return AP.o(c3176wp2.Z()).contains(this.b);
            case 6:
                return c3176wp2.a0().contains(this.b);
            case 7:
                c3176wp2.getClass();
                StringBuilder sbB = AbstractC1021ah0.b();
                AbstractC1474fG.T(c3176wp2, AbstractC1099bV.class).forEach(new WU(3, sbB));
                return AbstractC1021ah0.h(sbB).contains(this.b);
            case 8:
                return this.b.equals(c3176wp2.S());
            case 9:
                return c3176wp2.u(this.b);
            default:
                return c3176wp2.f1103o.m.endsWith(this.b);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return AbstractC1701hf0.h(new StringBuilder("["), this.b, "]");
            case 1:
                return AbstractC1701hf0.h(new StringBuilder("[^"), this.b, "]");
            case 2:
                return "." + this.b;
            case 3:
                return AbstractC1701hf0.h(new StringBuilder(":containsData("), this.b, ")");
            case 4:
                return AbstractC1701hf0.h(new StringBuilder(":containsOwn("), this.b, ")");
            case 5:
                return AbstractC1701hf0.h(new StringBuilder(":contains("), this.b, ")");
            case 6:
                return AbstractC1701hf0.h(new StringBuilder(":containsWholeOwnText("), this.b, ")");
            case 7:
                return AbstractC1701hf0.h(new StringBuilder(":containsWholeText("), this.b, ")");
            case 8:
                return "#" + this.b;
            case 9:
                return this.b;
            default:
                return this.b;
        }
    }

    public C0819Uq(String str, int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = AP.o(str);
                break;
            case 4:
                StringBuilder sbB = AbstractC1021ah0.b();
                AbstractC1021ah0.a(sbB, str, false);
                this.b = AP.o(AbstractC1021ah0.h(sbB));
                break;
            case 5:
                StringBuilder sbB2 = AbstractC1021ah0.b();
                AbstractC1021ah0.a(sbB2, str, false);
                this.b = AP.o(AbstractC1021ah0.h(sbB2));
                break;
            default:
                Sr0.w(str);
                this.b = AP.o(str);
                break;
        }
    }
}
