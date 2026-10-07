package o;

import java.util.Arrays;

/* JADX INFO: renamed from: o.lg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2093lg0 extends AbstractC2530q50 {
    public static final String p;
    public static final String q;
    public static final C1306dd0 r;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f897o;

    static {
        int i = Lr0.a;
        p = Integer.toString(1, 36);
        q = Integer.toString(2, 36);
        r = new C1306dd0(2);
    }

    public C2093lg0(int i) {
        AbstractC0397Ej.b("maxStars must be a positive integer", i > 0);
        this.n = i;
        this.f897o = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2093lg0)) {
            return false;
        }
        C2093lg0 c2093lg0 = (C2093lg0) obj;
        return this.n == c2093lg0.n && this.f897o == c2093lg0.f897o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.n), Float.valueOf(this.f897o)});
    }

    public C2093lg0(int i, float f) {
        boolean z = false;
        AbstractC0397Ej.b("maxStars must be a positive integer", i > 0);
        if (f >= 0.0f && f <= i) {
            z = true;
        }
        AbstractC0397Ej.b("starRating is out of range [0, maxStars]", z);
        this.n = i;
        this.f897o = f;
    }
}
