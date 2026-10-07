package o;

/* JADX INFO: renamed from: o.oj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2390oj0 {
    public final String a;
    public final String b;

    public C2390oj0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2390oj0)) {
            return false;
        }
        C2390oj0 c2390oj0 = (C2390oj0) obj;
        return AbstractC1474fG.b(this.a, c2390oj0.a) && AbstractC1474fG.b(this.b, c2390oj0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TigoSession(tsB=");
        sb.append(this.a);
        sb.append(", uuid=");
        return AbstractC1701hf0.h(sb, this.b, ")");
    }
}
