package o;

/* JADX INFO: renamed from: o.qn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2592qn0 {
    public final String a;
    public final String b;

    public C2592qn0(String str, String str2) {
        AbstractC1474fG.j(str2, "result");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2592qn0)) {
            return false;
        }
        C2592qn0 c2592qn0 = (C2592qn0) obj;
        return AbstractC1474fG.b(this.a, c2592qn0.a) && AbstractC1474fG.b(this.b, c2592qn0.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StremcoreAttempt(payload=");
        sb.append(this.a);
        sb.append(", result=");
        return AbstractC1701hf0.h(sb, this.b, ")");
    }
}
