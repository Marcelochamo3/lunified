package o;

/* JADX INFO: loaded from: classes.dex */
public final class FJ {
    public final String a;

    public FJ(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FJ) {
            return this.a.equals(((FJ) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC1701hf0.h(new StringBuilder("StringHeaderFactory{value='"), this.a, "'}");
    }
}
