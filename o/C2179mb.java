package o;

import java.util.Map;

/* JADX INFO: renamed from: o.mb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2179mb {
    public final Map a;
    public final String b;
    public final String c;
    public final String d;
    public final Map e;
    public final String f;

    public C2179mb(Map map, String str, String str2, String str3, Map map2, String str4) {
        AbstractC1474fG.j(map, "values");
        AbstractC1474fG.j(str, "region");
        AbstractC1474fG.j(str2, "locale");
        this.a = map;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = map2;
        this.f = str4;
    }

    public final String a(String str) {
        String str2 = (String) this.a.get(str);
        if (str2 != null) {
            return str2;
        }
        throw new IllegalStateException("Canela config: falta ".concat(str).toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2179mb)) {
            return false;
        }
        C2179mb c2179mb = (C2179mb) obj;
        return AbstractC1474fG.b(this.a, c2179mb.a) && AbstractC1474fG.b(this.b, c2179mb.b) && AbstractC1474fG.b(this.c, c2179mb.c) && AbstractC1474fG.b(this.d, c2179mb.d) && AbstractC1474fG.b(this.e, c2179mb.e) && AbstractC1474fG.b(this.f, c2179mb.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + AbstractC1674hK.i(AbstractC1674hK.i(AbstractC1674hK.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RuntimeConfig(values=");
        sb.append(this.a);
        sb.append(", region=");
        sb.append(this.b);
        sb.append(", locale=");
        sb.append(this.c);
        sb.append(", storefrontId=");
        sb.append(this.d);
        sb.append(", tabs=");
        sb.append(this.e);
        sb.append(", landingJson=");
        return AbstractC1701hf0.h(sb, this.f, ")");
    }
}
