package o;

import java.util.Arrays;

/* JADX INFO: renamed from: o.u8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2922u8 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public C2922u8(int i, int i2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2922u8)) {
            return false;
        }
        C2922u8 c2922u8 = (C2922u8) obj;
        return this.c == c2922u8.c && this.d == c2922u8.d && AbstractC1459f50.p(this.a, c2922u8.a) && AbstractC1459f50.p(this.b, c2922u8.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }
}
