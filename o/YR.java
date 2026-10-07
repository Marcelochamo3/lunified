package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class YR extends ZR {
    public final List a;

    public YR(List list) {
        AbstractC1474fG.j(list, "categories");
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof YR) && AbstractC1474fG.b(this.a, ((YR) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SuccessLoading(categories=" + this.a + ")";
    }
}
