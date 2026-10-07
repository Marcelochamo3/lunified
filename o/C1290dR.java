package o;

import android.animation.TimeInterpolator;

/* JADX INFO: renamed from: o.dR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1290dR {
    public long a;
    public long b;
    public TimeInterpolator c;
    public int d;
    public int e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : AbstractC1161c3.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1290dR)) {
            return false;
        }
        C1290dR c1290dR = (C1290dR) obj;
        if (this.a == c1290dR.a && this.b == c1290dR.b && this.d == c1290dR.d && this.e == c1290dR.e) {
            return a().getClass().equals(c1290dR.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((((a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(C1290dR.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.a);
        sb.append(" duration: ");
        sb.append(this.b);
        sb.append(" interpolator: ");
        sb.append(a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.d);
        sb.append(" repeatMode: ");
        return AbstractC1701hf0.g(sb, this.e, "}\n");
    }
}
