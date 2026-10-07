package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class V6 {
    public static final V6 e = new V6(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public V6(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = Lr0.H(i3) ? Lr0.y(i3, i2) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V6)) {
            return false;
        }
        V6 v6 = (V6) obj;
        return this.a == v6.a && this.b == v6.b && this.c == v6.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.a + ", channelCount=" + this.b + ", encoding=" + this.c + ']';
    }
}
