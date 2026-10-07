package o;

/* JADX INFO: loaded from: classes.dex */
public final class Oe0 {
    public final String a;
    public final String b;
    public final String c;

    public Oe0(String str, String str2, String str3) {
        AbstractC1474fG.j(str, "label");
        AbstractC1474fG.j(str3, "value");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Oe0)) {
            return false;
        }
        Oe0 oe0 = (Oe0) obj;
        return AbstractC1474fG.b(this.a, oe0.a) && AbstractC1474fG.b(this.b, oe0.b) && AbstractC1474fG.b(this.c, oe0.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PremiumVariant(label=");
        sb.append(this.a);
        sb.append(", language=");
        sb.append(this.b);
        sb.append(", value=");
        return AbstractC1701hf0.h(sb, this.c, ")");
    }
}
