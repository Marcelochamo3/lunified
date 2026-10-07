package o;

import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Rx0 {
    public final String a;
    public final JSONObject b;
    public final JSONArray c;
    public final Set d;
    public final long e;

    public Rx0(String str, JSONObject jSONObject, JSONArray jSONArray, Set set, long j) {
        AbstractC1474fG.j(str, "liveCode");
        this.a = str;
        this.b = jSONObject;
        this.c = jSONArray;
        this.d = set;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rx0)) {
            return false;
        }
        Rx0 rx0 = (Rx0) obj;
        return AbstractC1474fG.b(this.a, rx0.a) && AbstractC1474fG.b(this.b, rx0.b) && AbstractC1474fG.b(this.c, rx0.c) && AbstractC1474fG.b(this.d, rx0.d) && this.e == rx0.e;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        long j = this.e;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangerConfiguration(liveCode=");
        sb.append(this.a);
        sb.append(", environment=");
        sb.append(this.b);
        sb.append(", entries=");
        sb.append(this.c);
        sb.append(", allowedLiveTags=");
        sb.append(this.d);
        sb.append(", createdAt=");
        return AbstractC1674hK.q(sb, this.e, ")");
    }
}
