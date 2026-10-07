package o;

import java.util.Arrays;

/* JADX INFO: renamed from: o.jj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1903jj0 extends AbstractC2530q50 {
    public static final String p;
    public static final String q;
    public static final C1306dd0 r;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f850o;

    static {
        int i = Lr0.a;
        p = Integer.toString(1, 36);
        q = Integer.toString(2, 36);
        r = new C1306dd0(4);
    }

    public C1903jj0() {
        this.n = false;
        this.f850o = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1903jj0)) {
            return false;
        }
        C1903jj0 c1903jj0 = (C1903jj0) obj;
        return this.f850o == c1903jj0.f850o && this.n == c1903jj0.n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.n), Boolean.valueOf(this.f850o)});
    }

    public C1903jj0(boolean z) {
        this.n = true;
        this.f850o = z;
    }
}
