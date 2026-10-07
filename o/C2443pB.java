package o;

import java.util.Arrays;

/* JADX INFO: renamed from: o.pB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2443pB extends AbstractC2530q50 {
    public static final String p;
    public static final String q;
    public static final C0633Nm r;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f967o;

    static {
        int i = Lr0.a;
        p = Integer.toString(1, 36);
        q = Integer.toString(2, 36);
        r = new C0633Nm(6);
    }

    public C2443pB() {
        this.n = false;
        this.f967o = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2443pB)) {
            return false;
        }
        C2443pB c2443pB = (C2443pB) obj;
        return this.f967o == c2443pB.f967o && this.n == c2443pB.n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.n), Boolean.valueOf(this.f967o)});
    }

    public C2443pB(boolean z) {
        this.n = true;
        this.f967o = z;
    }
}
