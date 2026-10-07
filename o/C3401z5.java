package o;

import java.util.List;

/* JADX INFO: renamed from: o.z5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C3401z5 {

    @InterfaceC1695hc0("name")
    private final String a;

    @InterfaceC1695hc0("channels")
    private final List<A5> b;

    public final List a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3401z5)) {
            return false;
        }
        C3401z5 c3401z5 = (C3401z5) obj;
        return AbstractC1474fG.b(this.a, c3401z5.a) && AbstractC1474fG.b(this.b, c3401z5.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<A5> list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "RemoteCategory(name=" + this.a + ", channels=" + this.b + ")";
    }
}
