package o;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class XO implements T9 {
    public static final String m;
    public static final C0633Nm n;
    public final Uri l;

    static {
        int i = Lr0.a;
        m = Integer.toString(0, 36);
        n = new C0633Nm(12);
    }

    public XO(C0334By c0334By) {
        this.l = (Uri) c0334By.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof XO) && this.l.equals(((XO) obj).l) && Lr0.a(null, null);
    }

    public final int hashCode() {
        return this.l.hashCode() * 31;
    }
}
