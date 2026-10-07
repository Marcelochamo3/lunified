package o;

/* JADX INFO: renamed from: o.bU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1098bU {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public String j;

    public C1098bU(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3, int i4, int i5) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = z4;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1098bU)) {
            return false;
        }
        C1098bU c1098bU = (C1098bU) obj;
        if (this.a == c1098bU.a && this.b == c1098bU.b && this.c == c1098bU.c && AbstractC1474fG.b(this.j, c1098bU.j)) {
            c1098bU.getClass();
            if (AbstractC1474fG.b(null, null)) {
                c1098bU.getClass();
                if (AbstractC1474fG.b(null, null) && this.d == c1098bU.d && this.e == c1098bU.e && this.f == c1098bU.f && this.g == c1098bU.g && this.h == c1098bU.h && this.i == c1098bU.i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + this.c) * 31;
        String str = this.j;
        return ((((((((((((((((i + (str != null ? str.hashCode() : 0)) * 31) + 0) * 31) + 0) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C1098bU.class.getSimpleName());
        sb.append("(");
        if (this.a) {
            sb.append("launchSingleTop ");
        }
        if (this.b) {
            sb.append("restoreState ");
        }
        int i = this.c;
        String str = this.j;
        if ((str != null || i != -1) && str != null) {
            sb.append("popUpTo(");
            if (str != null) {
                sb.append(str);
            } else {
                sb.append("0x");
                sb.append(Integer.toHexString(i));
            }
            if (this.d) {
                sb.append(" inclusive");
            }
            if (this.e) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        int i2 = this.i;
        int i3 = this.h;
        int i4 = this.g;
        int i5 = this.f;
        if (i5 != -1 || i4 != -1 || i3 != -1 || i2 != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i5));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i4));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(i3));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(i2));
            sb.append(")");
        }
        String string = sb.toString();
        AbstractC1474fG.i(string, "sb.toString()");
        return string;
    }
}
