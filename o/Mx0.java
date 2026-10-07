package o;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Mx0 {
    public final List a;
    public final List b;
    public final Map c;

    public Mx0(ArrayList arrayList, List list, LinkedHashMap linkedHashMap) {
        this.a = arrayList;
        this.b = list;
        this.c = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mx0)) {
            return false;
        }
        Mx0 mx0 = (Mx0) obj;
        return AbstractC1474fG.b(this.a, mx0.a) && AbstractC1474fG.b(this.b, mx0.b) && AbstractC1474fG.b(this.c, mx0.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + AbstractC1674hK.j(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "LiveCatalog(categories=" + this.a + ", channels=" + this.b + ", byCode=" + this.c + ")";
    }
}
