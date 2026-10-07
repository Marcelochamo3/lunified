package o;

/* JADX INFO: renamed from: o.gx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1639gx0 {
    public final String a;
    public final int b;

    public C1639gx0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1639gx0)) {
            return false;
        }
        C1639gx0 c1639gx0 = (C1639gx0) obj;
        return AbstractC1474fG.b(this.a, c1639gx0.a) && this.b == c1639gx0.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "OfficialSection(title=" + this.a + ", columnId=" + this.b + ")";
    }
}
