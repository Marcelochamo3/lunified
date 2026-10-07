package o;

/* JADX INFO: loaded from: classes.dex */
public final class D30 {
    public final int a;
    public final boolean b;

    public D30(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || D30.class != obj.getClass()) {
            return false;
        }
        D30 d30 = (D30) obj;
        return this.a == d30.a && this.b == d30.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
