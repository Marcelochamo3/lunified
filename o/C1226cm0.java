package o;

import java.util.Arrays;

/* JADX INFO: renamed from: o.cm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1226cm0 {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public C1226cm0(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1226cm0.class != obj.getClass()) {
            return false;
        }
        C1226cm0 c1226cm0 = (C1226cm0) obj;
        return this.a == c1226cm0.a && this.c == c1226cm0.c && this.d == c1226cm0.d && Arrays.equals(this.b, c1226cm0.b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
