package o;

import org.json.JSONObject;

/* JADX INFO: renamed from: o.Zn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0946Zn {
    public final String a;
    public final String b;
    public final JSONObject c;
    public final JSONObject d;

    public C0946Zn(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        this.a = str;
        this.b = str2;
        this.c = jSONObject;
        this.d = jSONObject2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0946Zn)) {
            return false;
        }
        C0946Zn c0946Zn = (C0946Zn) obj;
        return AbstractC1474fG.b(this.a, c0946Zn.a) && AbstractC1474fG.b(this.b, c0946Zn.b) && AbstractC1474fG.b(this.c, c0946Zn.c) && AbstractC1474fG.b(this.d, c0946Zn.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "ParsedChannel(name=" + this.a + ", logo=" + this.b + ", groupIdJson=" + this.c + ", keyPairJson=" + this.d + ")";
    }
}
