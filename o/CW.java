package o;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class CW {
    public static final C3325yL e = new C3325yL();
    public final Object a;
    public final BW b;
    public final String c;
    public volatile byte[] d;

    public CW(String str, Object obj, BW bw) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.c = str;
        this.a = obj;
        this.b = bw;
    }

    public static CW a(Object obj, String str) {
        return new CW(str, obj, e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CW) {
            return this.c.equals(((CW) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return AbstractC1701hf0.h(new StringBuilder("Option{key='"), this.c, "'}");
    }
}
