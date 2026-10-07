package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Me0 {
    public final Ke0 a;
    public final List b;
    public final long c;

    public Me0(Ke0 ke0, ArrayList arrayList, long j) {
        this.a = ke0;
        this.b = arrayList;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Me0)) {
            return false;
        }
        Me0 me0 = (Me0) obj;
        return AbstractC1474fG.b(this.a, me0.a) && AbstractC1474fG.b(this.b, me0.b) && this.c == me0.c;
    }

    public final int hashCode() {
        int iJ = AbstractC1674hK.j(this.b, this.a.hashCode() * 31, 31);
        long j = this.c;
        return iJ + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PremiumSession(state=");
        sb.append(this.a);
        sb.append(", variants=");
        sb.append(this.b);
        sb.append(", createdAtMs=");
        return AbstractC1674hK.q(sb, this.c, ")");
    }
}
