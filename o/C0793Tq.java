package o;

import j$.util.Collection$EL;
import j$.util.stream.Collectors;
import java.util.List;

/* JADX INFO: renamed from: o.Tq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0793Tq extends AbstractC1332dr {
    public final /* synthetic */ int a;

    public /* synthetic */ C0793Tq(int i) {
        this.a = i;
    }

    @Override // o.AbstractC1332dr
    public int a() {
        switch (this.a) {
            case 0:
                return 10;
            case 6:
                return 1;
            case 7:
                return -1;
            case 8:
                return 1;
            default:
                return super.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ab A[ORIG_RETURN, RETURN] */
    @Override // o.AbstractC1332dr
    public final boolean b(C3176wp c3176wp, C3176wp c3176wp2) {
        C3370yp c3370yp;
        switch (this.a) {
            case 0:
                return true;
            case 1:
                for (AbstractC1099bV abstractC1099bV : c3176wp2.m()) {
                    if (abstractC1099bV instanceof Qi0) {
                        return AbstractC1021ah0.e(((Qi0) abstractC1099bV).I());
                    }
                    if (!(abstractC1099bV instanceof C3059vf) && !(abstractC1099bV instanceof C1053ax0) && !(abstractC1099bV instanceof C0686Pn)) {
                        return false;
                    }
                }
                return true;
            case 2:
                C3176wp c3176wp3 = (C3176wp) c3176wp2.l;
                return (c3176wp3 == null || (c3176wp3 instanceof C0660On) || c3176wp2 != c3176wp3.P()) ? false : true;
            case 3:
                C3176wp c3176wp4 = (C3176wp) c3176wp2.l;
                if (c3176wp4 != null && !(c3176wp4 instanceof C0660On)) {
                    int iK = c3176wp4.k();
                    C3176wp c3176wp5 = null;
                    for (AbstractC1099bV abstractC1099bVC = iK == 0 ? null : (AbstractC1099bV) c3176wp4.q().get(iK - 1); abstractC1099bVC != null; abstractC1099bVC = abstractC1099bVC.C()) {
                        if (abstractC1099bVC instanceof C3176wp) {
                            c3176wp5 = (C3176wp) abstractC1099bVC;
                            if (c3176wp2 == c3176wp5) {
                                return true;
                            }
                        }
                    }
                    if (c3176wp2 == c3176wp5) {
                        return true;
                    }
                }
                return false;
            case 4:
                AbstractC1099bV abstractC1099bV2 = c3176wp2.l;
                C3176wp c3176wp6 = (C3176wp) abstractC1099bV2;
                if (c3176wp6 == null || (c3176wp6 instanceof C0660On)) {
                    return false;
                }
                if (abstractC1099bV2 == null) {
                    c3370yp = new C3370yp(0);
                } else {
                    List<C3176wp> listK = ((C3176wp) abstractC1099bV2).K();
                    C3370yp c3370yp2 = new C3370yp(listK.size() - 1);
                    for (C3176wp c3176wp7 : listK) {
                        if (c3176wp7 != c3176wp2) {
                            c3370yp2.add(c3176wp7);
                        }
                    }
                    c3370yp = c3370yp2;
                }
                return c3370yp.isEmpty();
            case 5:
                C3176wp c3176wp8 = (C3176wp) c3176wp2.l;
                if (c3176wp8 == null || (c3176wp8 instanceof C0660On)) {
                    return false;
                }
                int i = 0;
                for (C3176wp c3176wpP = c3176wp8.P(); c3176wpP != null; c3176wpP = c3176wpP.T()) {
                    if (c3176wpP.f1103o.m.equals(c3176wp2.f1103o.m)) {
                        i++;
                    }
                    if (i > 1) {
                        if (i == 1) {
                            return true;
                        }
                        return false;
                    }
                }
                if (i == 1) {
                    return true;
                }
                return false;
            case 6:
                if (c3176wp instanceof C0660On) {
                    c3176wp = c3176wp.P();
                }
                return c3176wp2 == c3176wp;
            case 7:
                if (c3176wp2 instanceof C2818t40) {
                    return true;
                }
                for (AbstractC1099bV abstractC1099bV3 : (List) Collection$EL.stream(c3176wp2.q).filter(new C2407os()).map(new Vr0()).collect(Collectors.collectingAndThen(Collectors.toList(), new C2504ps(5)))) {
                    C2678ri0 c2678ri0 = c3176wp2.f1103o;
                    C2818t40 c2818t40 = new C2818t40(C2678ri0.c(c2678ri0.l, c2678ri0.n, C2852tX.d), c3176wp2.h(), c3176wp2.g());
                    abstractC1099bV3.G(c2818t40);
                    c2818t40.I(abstractC1099bV3);
                }
                return false;
            default:
                return c3176wp == c3176wp2;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "*";
            case 1:
                return ":empty";
            case 2:
                return ":first-child";
            case 3:
                return ":last-child";
            case 4:
                return ":only-child";
            case 5:
                return ":only-of-type";
            case 6:
                return ":root";
            case 7:
                return ":matchText";
            default:
                return "";
        }
    }
}
