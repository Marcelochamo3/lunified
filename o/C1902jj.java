package o;

import java.io.IOException;

/* JADX INFO: renamed from: o.jj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1902jj extends JJ {
    @Override // o.AbstractC1099bV
    public final Object clone() {
        return (C1902jj) super.clone();
    }

    @Override // o.AbstractC1099bV
    /* JADX INFO: renamed from: n */
    public final AbstractC1099bV clone() {
        return (C1902jj) super.clone();
    }

    @Override // o.AbstractC1099bV
    public final String toString() {
        return y();
    }

    @Override // o.AbstractC1099bV
    public final String w() {
        return "#data";
    }

    @Override // o.AbstractC1099bV
    public final void z(Appendable appendable, int i, C0634Nn c0634Nn) throws IOException {
        String strI = I();
        if (c0634Nn.s != 2 || strI.contains("<![CDATA[")) {
            appendable.append(I());
            return;
        }
        AbstractC1099bV abstractC1099bV = this.l;
        if (abstractC1099bV != null && abstractC1099bV.x().equals("script")) {
            appendable.append("//<![CDATA[\n").append(strI).append("\n//]]>");
            return;
        }
        AbstractC1099bV abstractC1099bV2 = this.l;
        if (abstractC1099bV2 == null || !abstractC1099bV2.x().equals("style")) {
            appendable.append("<![CDATA[").append(strI).append("]]>");
        } else {
            appendable.append("/*<![CDATA[*/\n").append(strI).append("\n/*]]>*/");
        }
    }

    @Override // o.AbstractC1099bV
    public final void A(Appendable appendable, int i, C0634Nn c0634Nn) {
    }
}
