package o;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Zu0 {
    public final String a;
    public final String b;
    public final Map c;

    public Zu0(String str, String str2, Map map) {
        AbstractC1474fG.j(str, "url");
        AbstractC1474fG.j(map, "headers");
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Zu0)) {
            return false;
        }
        Zu0 zu0 = (Zu0) obj;
        return AbstractC1474fG.b(this.a, zu0.a) && AbstractC1474fG.b(this.b, zu0.b) && AbstractC1474fG.b(this.c, zu0.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "Candidate(url=" + this.a + ", headerOriginUrl=" + this.b + ", headers=" + this.c + ")";
    }
}
