package o;

/* JADX INFO: renamed from: o.Ez, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0413Ez extends AbstractC0439Fz {
    public final C2420oz a;
    public final boolean b;

    public C0413Ez(C2420oz c2420oz, boolean z) {
        AbstractC1474fG.j(c2420oz, "genre");
        this.a = c2420oz;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0413Ez)) {
            return false;
        }
        C0413Ez c0413Ez = (C0413Ez) obj;
        return AbstractC1474fG.b(this.a, c0413Ez.a) && this.b == c0413Ez.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "SuccessLoading(genre=" + this.a + ", hasMore=" + this.b + ")";
    }
}
