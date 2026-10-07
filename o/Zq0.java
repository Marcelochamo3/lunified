package o;

/* JADX INFO: loaded from: classes.dex */
public final class Zq0 {
    public final String a;
    public final String b;

    public Zq0(String str, String str2) {
        AbstractC1474fG.j(str, "code");
        AbstractC1474fG.j(str2, "name");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Zq0)) {
            return false;
        }
        Zq0 zq0 = (Zq0) obj;
        return AbstractC1474fG.b(this.a, zq0.a) && AbstractC1474fG.b(this.b, zq0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProviderOption(code=");
        sb.append(this.a);
        sb.append(", name=");
        return AbstractC1701hf0.h(sb, this.b, ")");
    }
}
