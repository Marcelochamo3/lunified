package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class Qi0 extends JJ {
    public Qi0(String str) {
        this.f339o = str;
    }

    public static boolean L(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    @Override // o.AbstractC1099bV
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public Qi0 clone() {
        return (Qi0) super.clone();
    }

    public String M() {
        String strI = I();
        StringBuilder sbB = AbstractC1021ah0.b();
        AbstractC1021ah0.a(sbB, strI, false);
        return AbstractC1021ah0.h(sbB);
    }

    @Override // o.AbstractC1099bV
    public final String toString() {
        return y();
    }

    @Override // o.AbstractC1099bV
    public String w() {
        return "#text";
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0028  */
    @Override // o.AbstractC1099bV
    public void z(Appendable appendable, int i, C0634Nn c0634Nn) throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = c0634Nn.p;
        AbstractC1099bV abstractC1099bV = this.l;
        C3176wp c3176wp = abstractC1099bV instanceof C3176wp ? (C3176wp) abstractC1099bV : null;
        boolean z5 = z4 && !C3176wp.V(abstractC1099bV);
        if (c3176wp != null) {
            C2678ri0 c2678ri0 = c3176wp.f1103o;
            if (c2678ri0.f1008o || c2678ri0.p) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z5) {
            boolean z6 = (z && this.m == 0) || (this.l instanceof C0660On);
            boolean z7 = z && v() == null;
            AbstractC1099bV abstractC1099bVV = v();
            AbstractC1099bV abstractC1099bVC = C();
            boolean zE = AbstractC1021ah0.e(I());
            if ((((abstractC1099bVV instanceof C3176wp) && ((C3176wp) abstractC1099bVV).Y(c0634Nn)) || (((abstractC1099bVV instanceof Qi0) && AbstractC1021ah0.e(((Qi0) abstractC1099bVV).I())) || ((abstractC1099bVC instanceof C3176wp) && (((C3176wp) abstractC1099bVC).f1103o.f1008o || abstractC1099bVC.u("br"))))) && zE) {
                return;
            }
            if ((abstractC1099bVC == null && c3176wp != null && c3176wp.f1103o.p && !zE) || (abstractC1099bVC != null && abstractC1099bVC.u("br"))) {
                AbstractC1099bV.t(appendable, i, c0634Nn);
            }
            z2 = z6;
            z3 = z7;
        } else {
            z2 = false;
            z3 = false;
        }
        AbstractC0300Aq.b(appendable, I(), c0634Nn, false, z5, z2, z3);
    }

    @Override // o.AbstractC1099bV
    public void A(Appendable appendable, int i, C0634Nn c0634Nn) {
    }
}
