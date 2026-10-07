package o;

import java.util.Set;

/* JADX INFO: renamed from: o.Rs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0743Rs {
    public final String a;
    public final String b;
    public final Set c;

    public C0743Rs(String str, String str2, Set set) {
        this.a = str;
        this.b = str2;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0743Rs)) {
            return false;
        }
        C0743Rs c0743Rs = (C0743Rs) obj;
        return AbstractC1474fG.b(this.a, c0743Rs.a) && AbstractC1474fG.b(this.b, c0743Rs.b) && AbstractC1474fG.b(this.c, c0743Rs.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + AbstractC1674hK.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return "FanaFilter(route=" + this.a + ", name=" + this.b + ", deniedCountries=" + this.c + ")";
    }
}
