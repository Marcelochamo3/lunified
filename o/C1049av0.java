package o;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: o.av0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1049av0 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final Map e;

    public C1049av0(String str, String str2, int i, String str3, LinkedHashMap linkedHashMap) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1049av0)) {
            return false;
        }
        C1049av0 c1049av0 = (C1049av0) obj;
        return AbstractC1474fG.b(this.a, c1049av0.a) && AbstractC1474fG.b(this.b, c1049av0.b) && this.c == c1049av0.c && AbstractC1474fG.b(this.d, c1049av0.d) && AbstractC1474fG.b(this.e, c1049av0.e);
    }

    public final int hashCode() {
        String str = this.a;
        return this.e.hashCode() + AbstractC1674hK.i((AbstractC1674hK.i((str == null ? 0 : str.hashCode()) * 31, this.b, 31) + this.c) * 31, this.d, 31);
    }

    public final String toString() {
        return "HtmlResponse(body=" + this.a + ", mimeType=" + this.b + ", statusCode=" + this.c + ", reasonPhrase=" + this.d + ", headers=" + this.e + ")";
    }
}
