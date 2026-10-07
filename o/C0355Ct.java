package o;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: o.Ct, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0355Ct {
    public final String a;
    public final String b;
    public final Map c;

    public C0355Ct(String str, String str2, LinkedHashMap linkedHashMap) {
        AbstractC1474fG.j(str, "url");
        AbstractC1474fG.j(str2, "type");
        this.a = str;
        this.b = str2;
        this.c = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0355Ct)) {
            return false;
        }
        C0355Ct c0355Ct = (C0355Ct) obj;
        return AbstractC1474fG.b(this.a, c0355Ct.a) && AbstractC1474fG.b(this.b, c0355Ct.b) && AbstractC1474fG.b(this.c, c0355Ct.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + AbstractC1674hK.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return "ResolvedStream(url=" + this.a + ", type=" + this.b + ", headers=" + this.c + ")";
    }
}
