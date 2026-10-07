package o;

/* JADX INFO: renamed from: o.Ss, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0769Ss {
    public final String a;
    public final String b;

    public C0769Ss(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0769Ss)) {
            return false;
        }
        C0769Ss c0769Ss = (C0769Ss) obj;
        return AbstractC1474fG.b(this.a, c0769Ss.a) && AbstractC1474fG.b(this.b, c0769Ss.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FanaImage(id=");
        sb.append(this.a);
        sb.append(", url=");
        return AbstractC1701hf0.h(sb, this.b, ")");
    }
}
