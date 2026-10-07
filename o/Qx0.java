package o;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Qx0 {
    public final JSONObject a;
    public final LinkedHashSet b;
    public final LinkedHashMap c;

    public Qx0(JSONObject jSONObject) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = jSONObject;
        this.b = linkedHashSet;
        this.c = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Qx0)) {
            return false;
        }
        Qx0 qx0 = (Qx0) obj;
        return AbstractC1474fG.b(this.a, qx0.a) && AbstractC1474fG.b(this.b, qx0.b) && AbstractC1474fG.b(this.c, qx0.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MutableChannel(raw=" + this.a + ", categoryIds=" + this.b + ", addresses=" + this.c + ")";
    }
}
