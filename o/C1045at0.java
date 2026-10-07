package o;

/* JADX INFO: renamed from: o.at0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1045at0 implements T9 {
    public static final C1045at0 p = new C1045at0(1.0f, 0, 0, 0);
    public final int l;
    public final int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f684o;

    static {
        int i = Lr0.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public C1045at0(float f, int i, int i2, int i3) {
        this.l = i;
        this.m = i2;
        this.n = i3;
        this.f684o = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1045at0)) {
            return false;
        }
        C1045at0 c1045at0 = (C1045at0) obj;
        return this.l == c1045at0.l && this.m == c1045at0.m && this.n == c1045at0.n && this.f684o == c1045at0.f684o;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f684o) + ((((((217 + this.l) * 31) + this.m) * 31) + this.n) * 31);
    }
}
