package o;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.Xq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0897Xq extends AbstractC1332dr {
    public final String a;
    public final Pattern b;

    public C0897Xq(String str, Pattern pattern) {
        this.a = AP.p(str);
        this.b = pattern;
    }

    @Override // o.AbstractC1332dr
    public final int a() {
        return 8;
    }

    @Override // o.AbstractC1332dr
    public final boolean b(C3176wp c3176wp, C3176wp c3176wp2) {
        String str = this.a;
        return c3176wp2.r(str) && this.b.matcher(c3176wp2.d(str)).find();
    }

    public final String toString() {
        return "[" + this.a + "~=" + this.b.toString() + "]";
    }
}
