package o;

/* JADX INFO: renamed from: o.tb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2858tb0 {
    public static final C2858tb0 c = new C2858tb0(0, 0);
    public final long a;
    public final long b;

    public C2858tb0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2858tb0.class != obj.getClass()) {
            return false;
        }
        C2858tb0 c2858tb0 = (C2858tb0) obj;
        return this.a == c2858tb0.a && this.b == c2858tb0.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return AbstractC1674hK.q(sb, this.b, "]");
    }
}
