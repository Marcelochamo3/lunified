package o;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: o.uj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2970uj {
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;
    public final Object j;

    static {
        AbstractC1726hs.a("goog.exo.datasource");
    }

    public C2970uj(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj) {
        byte[] bArr2 = bArr;
        AbstractC0397Ej.c(j + j2 >= 0);
        AbstractC0397Ej.c(j2 >= 0);
        AbstractC0397Ej.c(j3 > 0 || j3 == -1);
        this.a = uri;
        this.b = j;
        this.c = i;
        this.d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j2;
        this.g = j3;
        this.h = str;
        this.i = i2;
        this.j = obj;
    }

    public static String b(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public final C2873tj a() {
        C2873tj c2873tj = new C2873tj();
        c2873tj.a = this.a;
        c2873tj.b = this.b;
        c2873tj.c = this.c;
        c2873tj.d = this.d;
        c2873tj.e = this.e;
        c2873tj.f = this.f;
        c2873tj.g = this.g;
        c2873tj.h = this.h;
        c2873tj.i = this.i;
        c2873tj.j = this.j;
        return c2873tj;
    }

    public final C2970uj c(long j) {
        long j2 = this.g;
        long j3 = j2 != -1 ? j2 - j : -1L;
        if (j == 0 && j2 == j3) {
            return this;
        }
        return new C2970uj(this.a, this.b, this.c, this.d, this.e, this.f + j, j3, this.h, this.i, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(b(this.c));
        sb.append(" ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        return AbstractC1701hf0.g(sb, this.i, "]");
    }
}
