package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o.ni0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2291ni0 {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public C2291ni0(String str, boolean z, List list, List list2) {
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2291ni0)) {
            return false;
        }
        C2291ni0 c2291ni0 = (C2291ni0) obj;
        if (this.b != c2291ni0.b || !AbstractC1474fG.b(this.c, c2291ni0.c) || !AbstractC1474fG.b(this.d, c2291ni0.d)) {
            return false;
        }
        String str = this.a;
        boolean zU = AbstractC1899jh0.U(str, "index_", false);
        String str2 = c2291ni0.a;
        return zU ? AbstractC1899jh0.U(str2, "index_", false) : AbstractC1474fG.b(str, str2);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + AbstractC1674hK.j(this.c, (((AbstractC1899jh0.U(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31, 31);
    }

    public final String toString() {
        return "Index{name='" + this.a + "', unique=" + this.b + ", columns=" + this.c + ", orders=" + this.d + "'}";
    }
}
