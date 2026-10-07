package o;

import java.util.Locale;

/* JADX INFO: renamed from: o.ki0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1999ki0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public C1999ki0(int i, int i2, String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        Locale locale = Locale.US;
        AbstractC1474fG.i(locale, "US");
        String upperCase = str2.toUpperCase(locale);
        AbstractC1474fG.i(upperCase, "this as java.lang.String).toUpperCase(locale)");
        this.g = AbstractC1119bh0.W(upperCase, "INT", false) ? 3 : (AbstractC1119bh0.W(upperCase, "CHAR", false) || AbstractC1119bh0.W(upperCase, "CLOB", false) || AbstractC1119bh0.W(upperCase, "TEXT", false)) ? 2 : AbstractC1119bh0.W(upperCase, "BLOB", false) ? 5 : (AbstractC1119bh0.W(upperCase, "REAL", false) || AbstractC1119bh0.W(upperCase, "FLOA", false) || AbstractC1119bh0.W(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1999ki0)) {
            return false;
        }
        C1999ki0 c1999ki0 = (C1999ki0) obj;
        if (this.d != c1999ki0.d) {
            return false;
        }
        if (!AbstractC1474fG.b(this.a, c1999ki0.a) || this.c != c1999ki0.c) {
            return false;
        }
        int i = c1999ki0.f;
        String str = c1999ki0.e;
        String str2 = this.e;
        int i2 = this.f;
        if (i2 == 1 && i == 2 && str2 != null && !AbstractC1370eA.n(str2, str)) {
            return false;
        }
        if (i2 != 2 || i != 1 || str == null || AbstractC1370eA.n(str, str2)) {
            return (i2 == 0 || i2 != i || (str2 == null ? str == null : AbstractC1370eA.n(str2, str))) && this.g == c1999ki0.g;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.a);
        sb.append("', type='");
        sb.append(this.b);
        sb.append("', affinity='");
        sb.append(this.g);
        sb.append("', notNull=");
        sb.append(this.c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.d);
        sb.append(", defaultValue='");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        return AbstractC1701hf0.h(sb, str, "'}");
    }
}
