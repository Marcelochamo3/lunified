package o;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class TF {
    public static final TF e = new TF(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public TF(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static TF a(TF tf, TF tf2) {
        return b(Math.max(tf.a, tf2.a), Math.max(tf.b, tf2.b), Math.max(tf.c, tf2.c), Math.max(tf.d, tf2.d));
    }

    public static TF b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new TF(i, i2, i3, i4);
    }

    public static TF c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return SF.a(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TF.class != obj.getClass()) {
            return false;
        }
        TF tf = (TF) obj;
        return this.d == tf.d && this.a == tf.a && this.c == tf.c && this.b == tf.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
