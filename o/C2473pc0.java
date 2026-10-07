package o;

import java.util.Arrays;

/* JADX INFO: renamed from: o.pc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2473pc0 {
    public final String a;
    public final char[] b;

    public C2473pc0(String str, char[] cArr) {
        AbstractC1474fG.j(str, "email");
        this.a = str;
        this.b = cArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2473pc0)) {
            return false;
        }
        C2473pc0 c2473pc0 = (C2473pc0) obj;
        return AbstractC1474fG.b(this.a, c2473pc0.a) && AbstractC1474fG.b(this.b, c2473pc0.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MemoryCredentials(email=" + this.a + ", password=" + Arrays.toString(this.b) + ")";
    }
}
