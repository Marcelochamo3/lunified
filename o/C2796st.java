package o;

import java.util.List;

/* JADX INFO: renamed from: o.st, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2796st {
    public final String a;
    public final int b;
    public final String c;
    public final List d;

    public C2796st(int i, String str, String str2, List list) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2796st)) {
            return false;
        }
        C2796st c2796st = (C2796st) obj;
        return AbstractC1474fG.b(this.a, c2796st.a) && this.b == c2796st.b && AbstractC1474fG.b(this.c, c2796st.c) && AbstractC1474fG.b(this.d, c2796st.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + AbstractC1674hK.i(((this.a.hashCode() * 31) + this.b) * 31, this.c, 31);
    }

    public final String toString() {
        return "FanaSeriesSeason(id=" + this.a + ", year=" + this.b + ", name=" + this.c + ", episodes=" + this.d + ")";
    }
}
