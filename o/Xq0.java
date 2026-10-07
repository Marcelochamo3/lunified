package o;

/* JADX INFO: loaded from: classes.dex */
public final class Xq0 {
    public final String a;
    public final String b;

    public Xq0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Xq0)) {
            return false;
        }
        Xq0 xq0 = (Xq0) obj;
        return AbstractC1474fG.b(this.a, xq0.a) && AbstractC1474fG.b(this.b, xq0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CountryOption(code=");
        sb.append(this.a);
        sb.append(", name=");
        return AbstractC1701hf0.h(sb, this.b, ")");
    }
}
