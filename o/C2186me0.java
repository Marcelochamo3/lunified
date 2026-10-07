package o;

/* JADX INFO: renamed from: o.me0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2186me0 {
    public static final C2186me0 c = new C2186me0(-1, -1);
    public final int a;
    public final int b;

    static {
        new C2186me0(0, 0);
    }

    public C2186me0(int i, int i2) {
        AbstractC0397Ej.c((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2186me0)) {
            return false;
        }
        C2186me0 c2186me0 = (C2186me0) obj;
        return this.a == c2186me0.a && this.b == c2186me0.b;
    }

    public final int hashCode() {
        int i = this.a;
        return ((i >>> 16) | (i << 16)) ^ this.b;
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
