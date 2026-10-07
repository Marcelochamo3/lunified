package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Ca0 extends Ea0 {
    public final List a;

    public Ca0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ca0) && AbstractC1474fG.b(this.a, ((Ca0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SuccessGlobalSearching(providerResults=" + this.a + ")";
    }
}
