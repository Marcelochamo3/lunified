package o;

import java.util.Locale;

/* JADX INFO: renamed from: o.gZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1591gZ implements T9 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C1591gZ f794o = new C1591gZ(1.0f, 1.0f);
    public final float l;
    public final float m;
    public final int n;

    static {
        int i = Lr0.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public C1591gZ(float f, float f2) {
        AbstractC0397Ej.c(f > 0.0f);
        AbstractC0397Ej.c(f2 > 0.0f);
        this.l = f;
        this.m = f2;
        this.n = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1591gZ.class != obj.getClass()) {
            return false;
        }
        C1591gZ c1591gZ = (C1591gZ) obj;
        return this.l == c1591gZ.l && this.m == c1591gZ.m;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.m) + ((Float.floatToRawIntBits(this.l) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.l), Float.valueOf(this.m)};
        int i = Lr0.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
