package o;

/* JADX INFO: renamed from: o.sb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2761sb0 {
    public static final C2761sb0 c;
    public static final C2761sb0 d;
    public final long a;
    public final long b;

    static {
        C2761sb0 c2761sb0 = new C2761sb0(0L, 0L);
        c = new C2761sb0(Long.MAX_VALUE, Long.MAX_VALUE);
        new C2761sb0(Long.MAX_VALUE, 0L);
        new C2761sb0(0L, Long.MAX_VALUE);
        d = c2761sb0;
    }

    public C2761sb0(long j, long j2) {
        AbstractC0397Ej.c(j >= 0);
        AbstractC0397Ej.c(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    public final long a(long j, long j2, long j3) {
        long j4 = this.b;
        long j5 = this.a;
        if (j5 == 0 && j4 == 0) {
            return j;
        }
        int i = Lr0.a;
        long j6 = j - j5;
        if (((j5 ^ j) & (j ^ j6)) < 0) {
            j6 = Long.MIN_VALUE;
        }
        long j7 = j + j4;
        if (((j4 ^ j7) & (j ^ j7)) < 0) {
            j7 = Long.MAX_VALUE;
        }
        boolean z = false;
        boolean z2 = j6 <= j2 && j2 <= j7;
        if (j6 <= j3 && j3 <= j7) {
            z = true;
        }
        if (z2 && z) {
            return Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3;
        }
        if (z2) {
            return j2;
        }
        return z ? j3 : j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2761sb0.class != obj.getClass()) {
            return false;
        }
        C2761sb0 c2761sb0 = (C2761sb0) obj;
        return this.a == c2761sb0.a && this.b == c2761sb0.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
