package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o.Zt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0952Zt {
    public final List a;
    public final List b;
    public final List c;

    public C0952Zt(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0952Zt)) {
            return false;
        }
        C0952Zt c0952Zt = (C0952Zt) obj;
        return AbstractC1474fG.b(this.a, c0952Zt.a) && AbstractC1474fG.b(this.b, c0952Zt.b) && AbstractC1474fG.b(this.c, c0952Zt.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + AbstractC1674hK.j(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ProviderFavorites(channels=" + this.a + ", movies=" + this.b + ", tvShows=" + this.c + ")";
    }
}
