package o;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class X8 {
    public final String a;
    public final Map b;

    public X8(String str, LinkedHashMap linkedHashMap) {
        AbstractC1474fG.j(str, "url");
        this.a = str;
        this.b = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X8)) {
            return false;
        }
        X8 x8 = (X8) obj;
        return AbstractC1474fG.b(this.a, x8.a) && AbstractC1474fG.b(this.b, x8.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FlowRequestProfile(url=" + this.a + ", headers=" + this.b + ")";
    }
}
