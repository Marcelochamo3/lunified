package o;

/* JADX INFO: renamed from: o.u5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2916u5 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;

    public C2916u5(String str, String str2, String str3, long j) {
        AbstractC1474fG.j(str, "channelId");
        AbstractC1474fG.j(str2, "dashUrl");
        AbstractC1474fG.j(str3, "streamType");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2916u5)) {
            return false;
        }
        C2916u5 c2916u5 = (C2916u5) obj;
        return AbstractC1474fG.b(this.a, c2916u5.a) && AbstractC1474fG.b(this.b, c2916u5.b) && AbstractC1474fG.b(this.c, c2916u5.c) && this.d == c2916u5.d;
    }

    public final int hashCode() {
        int i = AbstractC1674hK.i(AbstractC1674hK.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        long j = this.d;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArDashCache(channelId=");
        sb.append(this.a);
        sb.append(", dashUrl=");
        sb.append(this.b);
        sb.append(", streamType=");
        sb.append(this.c);
        sb.append(", savedAt=");
        return AbstractC1674hK.q(sb, this.d, ")");
    }
}
