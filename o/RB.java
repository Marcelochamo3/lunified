package o;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class RB {
    public final String a;
    public final TB b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Map g;
    public final String h;

    public RB(String str, TB tb, String str2, String str3, String str4, String str5, LinkedHashMap linkedHashMap, String str6, int i) {
        str2 = (i & 4) != 0 ? null : str2;
        str4 = (i & 16) != 0 ? null : str4;
        str5 = (i & 32) != 0 ? null : str5;
        Map map = (i & 64) != 0 ? C1330dq.l : linkedHashMap;
        str6 = (i & 128) != 0 ? null : str6;
        AbstractC1474fG.j(map, "requestHeaders");
        this.a = str;
        this.b = tb;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = map;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RB)) {
            return false;
        }
        RB rb = (RB) obj;
        return AbstractC1474fG.b(this.a, rb.a) && this.b == rb.b && AbstractC1474fG.b(this.c, rb.c) && AbstractC1474fG.b(this.d, rb.d) && AbstractC1474fG.b(this.e, rb.e) && AbstractC1474fG.b(this.f, rb.f) && AbstractC1474fG.b(this.g, rb.g) && AbstractC1474fG.b(this.h, rb.h);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode5 = (this.g.hashCode() + ((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        String str5 = this.h;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HlsDetectionCandidate(url=");
        sb.append(this.a);
        sb.append(", source=");
        sb.append(this.b);
        sb.append(", contentType=");
        sb.append(this.c);
        sb.append(", frameUrl=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", poster=");
        sb.append(this.f);
        sb.append(", requestHeaders=");
        sb.append(this.g);
        sb.append(", requestHeaderOriginUrl=");
        return AbstractC1701hf0.h(sb, this.h, ")");
    }
}
