package o;

import java.io.IOException;

/* JADX INFO: renamed from: o.Pn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0686Pn extends JJ {
    public C0686Pn(String str, String str2, String str3) {
        Sr0.w(str);
        Sr0.w(str2);
        Sr0.w(str3);
        e("name", str);
        e("publicId", str2);
        e("systemId", str3);
        if (K("publicId")) {
            e("pubSysKey", "PUBLIC");
        } else if (K("systemId")) {
            e("pubSysKey", "SYSTEM");
        }
    }

    public final boolean K(String str) {
        return !AbstractC1021ah0.e(d(str));
    }

    @Override // o.AbstractC1099bV
    public final String w() {
        return "#doctype";
    }

    @Override // o.AbstractC1099bV
    public final void z(Appendable appendable, int i, C0634Nn c0634Nn) throws IOException {
        if (this.m > 0 && c0634Nn.p) {
            appendable.append('\n');
        }
        if (c0634Nn.s != 1 || K("publicId") || K("systemId")) {
            appendable.append("<!DOCTYPE");
        } else {
            appendable.append("<!doctype");
        }
        if (K("name")) {
            appendable.append(" ").append(d("name"));
        }
        if (K("pubSysKey")) {
            appendable.append(" ").append(d("pubSysKey"));
        }
        if (K("publicId")) {
            appendable.append(" \"").append(d("publicId")).append('\"');
        }
        if (K("systemId")) {
            appendable.append(" \"").append(d("systemId")).append('\"');
        }
        appendable.append('>');
    }

    @Override // o.AbstractC1099bV
    public final void A(Appendable appendable, int i, C0634Nn c0634Nn) {
    }
}
