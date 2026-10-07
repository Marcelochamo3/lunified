package o;

/* JADX INFO: loaded from: classes.dex */
public final class U80 {
    public final V80 a;
    public final String b;

    public U80(V80 v80, String str) {
        AbstractC1474fG.j(str, "detail");
        this.a = v80;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U80)) {
            return false;
        }
        U80 u80 = (U80) obj;
        return this.a == u80.a && AbstractC1474fG.b(this.b, u80.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Detection(restriction=");
        sb.append(this.a);
        sb.append(", detail=");
        return AbstractC1701hf0.h(sb, this.b, ")");
    }
}
