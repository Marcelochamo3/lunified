package o;

/* JADX INFO: loaded from: classes.dex */
public final class Po0 extends Qo0 {
    public final C2109lo0 a;

    public Po0(C2109lo0 c2109lo0) {
        this.a = c2109lo0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Po0) && AbstractC1474fG.b(this.a, ((Po0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SuccessLoading(tvShow=" + this.a + ")";
    }
}
