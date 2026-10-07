package o;

/* JADX INFO: renamed from: o.Br, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0327Br {
    public final long a;
    public final long b;

    public C0327Br(long j, long j2) {
        if (j2 == 0) {
            this.a = 0L;
            this.b = 1L;
        } else {
            this.a = j;
            this.b = j2;
        }
    }

    public final String toString() {
        return this.a + "/" + this.b;
    }
}
