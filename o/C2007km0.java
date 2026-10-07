package o;

import java.util.Arrays;

/* JADX INFO: renamed from: o.km0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2007km0 implements T9 {
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public final int l;
    public final Zl0 m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int[] f875o;
    public final boolean[] p;

    static {
        int i = Lr0.a;
        q = Integer.toString(0, 36);
        r = Integer.toString(1, 36);
        s = Integer.toString(3, 36);
        t = Integer.toString(4, 36);
    }

    public C2007km0(Zl0 zl0, boolean z, int[] iArr, boolean[] zArr) {
        int i = zl0.l;
        this.l = i;
        boolean z2 = false;
        AbstractC0397Ej.c(i == iArr.length && i == zArr.length);
        this.m = zl0;
        if (z && i > 1) {
            z2 = true;
        }
        this.n = z2;
        this.f875o = (int[]) iArr.clone();
        this.p = (boolean[]) zArr.clone();
    }

    public final int a() {
        return this.m.n;
    }

    public final boolean b() {
        for (boolean z : this.p) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2007km0.class != obj.getClass()) {
            return false;
        }
        C2007km0 c2007km0 = (C2007km0) obj;
        return this.n == c2007km0.n && this.m.equals(c2007km0.m) && Arrays.equals(this.f875o, c2007km0.f875o) && Arrays.equals(this.p, c2007km0.p);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.p) + ((Arrays.hashCode(this.f875o) + (((this.m.hashCode() * 31) + (this.n ? 1 : 0)) * 31)) * 31);
    }
}
