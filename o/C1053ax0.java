package o;

import java.io.IOException;

/* JADX INFO: renamed from: o.ax0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1053ax0 extends JJ {
    public final boolean p;

    public C1053ax0(String str, boolean z) {
        Sr0.w(str);
        this.f339o = str;
        this.p = z;
    }

    @Override // o.AbstractC1099bV
    public final Object clone() {
        return (C1053ax0) super.clone();
    }

    @Override // o.AbstractC1099bV
    /* JADX INFO: renamed from: n */
    public final AbstractC1099bV clone() {
        return (C1053ax0) super.clone();
    }

    @Override // o.AbstractC1099bV
    public final String toString() {
        return y();
    }

    @Override // o.AbstractC1099bV
    public final String w() {
        return "#declaration";
    }

    @Override // o.AbstractC1099bV
    public final void z(Appendable appendable, int i, C0634Nn c0634Nn) throws IOException {
        Appendable appendableAppend = appendable.append("<");
        boolean z = this.p;
        appendableAppend.append(z ? "!" : "?").append(I());
        F6 f6G = g();
        f6G.getClass();
        E6 e6 = new E6(f6G);
        while (e6.hasNext()) {
            D6 d6 = (D6) e6.next();
            String str = d6.m;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            String str3 = d6.l;
            if (!str3.equals("#declaration")) {
                appendable.append(' ');
                appendable.append(str3);
                if (!str2.isEmpty()) {
                    appendable.append("=\"");
                    AbstractC0300Aq.b(appendable, str2, c0634Nn, true, false, false, false);
                    appendable.append('\"');
                }
            }
        }
        appendable.append(z ? "!" : "?").append(">");
    }

    @Override // o.AbstractC1099bV
    public final void A(Appendable appendable, int i, C0634Nn c0634Nn) {
    }
}
