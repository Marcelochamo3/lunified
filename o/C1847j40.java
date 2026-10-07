package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o.j40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1847j40 extends AbstractC1945k40 {
    public final List a;

    public C1847j40(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1847j40) && AbstractC1474fG.b(this.a, ((C1847j40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SuccessLoading(providers=" + this.a + ")";
    }
}
