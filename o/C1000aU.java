package o;

/* JADX INFO: renamed from: o.aU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1000aU {
    public boolean a;
    public boolean b;
    public int c;
    public String d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;

    public final C1098bU a() {
        String str = this.d;
        if (str == null) {
            return new C1098bU(this.a, this.b, this.c, this.e, this.f, this.g, this.h, this.i, this.j);
        }
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.e;
        boolean z4 = this.f;
        int i = this.g;
        int i2 = this.h;
        int i3 = this.i;
        int i4 = this.j;
        int i5 = TT.v;
        C1098bU c1098bU = new C1098bU(z, z2, "android-app://androidx.navigation/".concat(str).hashCode(), z3, z4, i, i2, i3, i4);
        c1098bU.j = str;
        return c1098bU;
    }
}
