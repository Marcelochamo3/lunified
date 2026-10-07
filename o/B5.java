package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class B5 {

    @InterfaceC1695hc0("categories")
    private final List<C3401z5> a;

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B5) && AbstractC1474fG.b(this.a, ((B5) obj).a);
    }

    public final int hashCode() {
        List<C3401z5> list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "RemoteData(categories=" + this.a + ")";
    }
}
