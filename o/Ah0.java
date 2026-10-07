package o;

/* JADX INFO: loaded from: classes.dex */
public final class Ah0 {
    public final C2007km0 a;
    public final int b;

    public Ah0(C2007km0 c2007km0, int i) {
        this.a = c2007km0;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ah0)) {
            return false;
        }
        Ah0 ah0 = (Ah0) obj;
        return AbstractC1474fG.b(this.a, ah0.a) && this.b == ah0.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "Entry(group=" + this.a + ", index=" + this.b + ")";
    }
}
