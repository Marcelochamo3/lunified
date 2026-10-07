package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LC extends MC {
    public final List a;

    public LC(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LC) && AbstractC1474fG.b(this.a, ((LC) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SuccessLoading(categories=" + this.a + ")";
    }
}
