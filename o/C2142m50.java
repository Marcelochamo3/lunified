package o;

/* JADX INFO: renamed from: o.m50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2142m50 {
    public final C2336o50 a;
    public final C2336o50 b;

    public C2142m50(C2336o50 c2336o50, C2336o50 c2336o51) {
        this.a = c2336o50;
        this.b = c2336o51;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2142m50.class != obj.getClass()) {
            return false;
        }
        C2142m50 c2142m50 = (C2142m50) obj;
        if (this.a.equals(c2142m50.a)) {
            return this.b.equals(c2142m50.b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.toString() + "=" + this.b.toString();
    }
}
