package o;

/* JADX INFO: renamed from: o.o50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2336o50 {
    public final C2239n50 a;
    public final C2239n50 b;

    public C2336o50(C2239n50 c2239n50, C2239n50 c2239n51) {
        this.a = c2239n50;
        this.b = c2239n51;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2336o50.class != obj.getClass()) {
            return false;
        }
        C2336o50 c2336o50 = (C2336o50) obj;
        if (this.a.equals(c2336o50.a)) {
            return this.b.equals(c2336o50.b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a + "-" + this.b;
    }
}
