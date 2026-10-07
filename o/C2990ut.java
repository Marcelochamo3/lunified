package o;

/* JADX INFO: renamed from: o.ut, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2990ut {
    public final String a;
    public final String b;
    public final String c;

    public C2990ut(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2990ut)) {
            return false;
        }
        C2990ut c2990ut = (C2990ut) obj;
        return AbstractC1474fG.b(this.a, c2990ut.a) && AbstractC1474fG.b(this.b, c2990ut.b) && AbstractC1474fG.b(this.c, c2990ut.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FanaVideoRef(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", language=");
        return AbstractC1701hf0.h(sb, this.c, ")");
    }
}
