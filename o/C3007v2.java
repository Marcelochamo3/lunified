package o;

/* JADX INFO: renamed from: o.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3007v2 {
    public final int a;
    public final String b;
    public final long c;

    public C3007v2(int i, String str, long j) {
        this.a = i;
        this.b = str;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3007v2)) {
            return false;
        }
        C3007v2 c3007v2 = (C3007v2) obj;
        return this.a == c3007v2.a && AbstractC1474fG.b(this.b, c3007v2.b) && this.c == c3007v2.c;
    }

    public final int hashCode() {
        int i = AbstractC1674hK.i(this.a * 31, this.b, 31);
        long j = this.c;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Solution(counter=");
        sb.append(this.a);
        sb.append(", derivedKey=");
        sb.append(this.b);
        sb.append(", elapsedMs=");
        return AbstractC1674hK.q(sb, this.c, ")");
    }
}
