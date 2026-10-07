package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class DY extends AbstractC2530q50 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f216o;
    public static final C0633Nm p;
    public final float n;

    static {
        int i = Lr0.a;
        f216o = Integer.toString(1, 36);
        p = new C0633Nm(25);
    }

    public DY() {
        this.n = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DY) {
            return this.n == ((DY) obj).n;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.n)});
    }

    public DY(float f) {
        AbstractC0397Ej.b("percent must be in the range of [0, 100]", f >= 0.0f && f <= 100.0f);
        this.n = f;
    }
}
