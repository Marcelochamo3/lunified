package o;

import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: renamed from: o.vf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3059vf extends JJ {
    public C3059vf(String str) {
        this.f339o = str;
    }

    public final C1053ax0 K() {
        String strI = I();
        boolean z = true;
        String strSubstring = strI.substring(1, strI.length() - 1);
        if (strSubstring.length() <= 1 || (!strSubstring.startsWith("!") && !strSubstring.startsWith("?"))) {
            z = false;
        }
        if (z) {
            return null;
        }
        String strU = AbstractC1701hf0.u("<", strSubstring, ">");
        RN rn = new RN(new C1081bD());
        rn.f488o = C2852tX.d;
        String strH = h();
        C0660On c0660OnF = ((Nm0) rn.m).f(new StringReader(strU), strH, rn);
        if (c0660OnF.b0().K().size() <= 0) {
            return null;
        }
        C3176wp c3176wp = (C3176wp) c0660OnF.b0().K().get(0);
        C1053ax0 c1053ax0 = new C1053ax0(((C2852tX) AbstractC1474fG.O(c0660OnF).f488o).b(c3176wp.f1103o.l), strI.startsWith("!"));
        c1053ax0.g().d(c3176wp.g());
        return c1053ax0;
    }

    @Override // o.AbstractC1099bV
    public final Object clone() {
        return (C3059vf) super.clone();
    }

    @Override // o.AbstractC1099bV
    /* JADX INFO: renamed from: n */
    public final AbstractC1099bV clone() {
        return (C3059vf) super.clone();
    }

    @Override // o.AbstractC1099bV
    public final String toString() {
        return y();
    }

    @Override // o.AbstractC1099bV
    public final String w() {
        return "#comment";
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    @Override // o.AbstractC1099bV
    public final void z(Appendable appendable, int i, C0634Nn c0634Nn) throws IOException {
        AbstractC1099bV abstractC1099bV;
        if (c0634Nn.p) {
            int i2 = this.m;
            if (i2 == 0) {
                abstractC1099bV = this.l;
                if (abstractC1099bV instanceof C3176wp) {
                    AbstractC1099bV.t(appendable, i, c0634Nn);
                }
            } else if (i2 == 1) {
                AbstractC1099bV abstractC1099bVC = C();
                if ((abstractC1099bVC instanceof Qi0) && AbstractC1021ah0.e(((Qi0) abstractC1099bVC).I())) {
                    abstractC1099bV = this.l;
                    if ((abstractC1099bV instanceof C3176wp) && ((C3176wp) abstractC1099bV).f1103o.p) {
                        AbstractC1099bV.t(appendable, i, c0634Nn);
                    }
                }
            }
        }
        appendable.append("<!--").append(I()).append("-->");
    }

    @Override // o.AbstractC1099bV
    public final void A(Appendable appendable, int i, C0634Nn c0634Nn) {
    }
}
