package o;

/* JADX INFO: renamed from: o.uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2956uc {
    public final String a;
    public final String b;
    public final C2468pa c;

    public C2956uc(String str, String str2) {
        AbstractC1474fG.j(str, "pattern");
        AbstractC1474fG.j(str2, "pin");
        if ((!AbstractC1899jh0.U(str, "*.", false) || AbstractC1119bh0.e0(str, "*", 1, false, 4) != -1) && ((!AbstractC1899jh0.U(str, "**.", false) || AbstractC1119bh0.e0(str, "*", 2, false, 4) != -1) && AbstractC1119bh0.e0(str, "*", 0, false, 6) != -1)) {
            throw new IllegalArgumentException("Unexpected pattern: ".concat(str).toString());
        }
        String strG = AbstractC1376eG.G(str);
        if (strG == null) {
            throw new IllegalArgumentException("Invalid pattern: ".concat(str));
        }
        this.a = strG;
        if (AbstractC1899jh0.U(str2, "sha1/", false)) {
            this.b = "sha1";
            C2468pa c2468pa = C2468pa.f972o;
            String strSubstring = str2.substring(5);
            AbstractC1474fG.i(strSubstring, "this as java.lang.String).substring(startIndex)");
            C2468pa c2468paR = C2691rp.r(strSubstring);
            if (c2468paR == null) {
                throw new IllegalArgumentException("Invalid pin hash: ".concat(str2));
            }
            this.c = c2468paR;
            return;
        }
        if (!AbstractC1899jh0.U(str2, "sha256/", false)) {
            throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': ".concat(str2));
        }
        this.b = "sha256";
        C2468pa c2468pa2 = C2468pa.f972o;
        String strSubstring2 = str2.substring(7);
        AbstractC1474fG.i(strSubstring2, "this as java.lang.String).substring(startIndex)");
        C2468pa c2468paR2 = C2691rp.r(strSubstring2);
        if (c2468paR2 == null) {
            throw new IllegalArgumentException("Invalid pin hash: ".concat(str2));
        }
        this.c = c2468paR2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2956uc)) {
            return false;
        }
        C2956uc c2956uc = (C2956uc) obj;
        return AbstractC1474fG.b(this.a, c2956uc.a) && AbstractC1474fG.b(this.b, c2956uc.b) && AbstractC1474fG.b(this.c, c2956uc.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + AbstractC1674hK.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return this.b + '/' + this.c.a();
    }
}
