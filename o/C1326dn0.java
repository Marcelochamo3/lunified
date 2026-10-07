package o;

import android.text.Layout;

/* JADX INFO: renamed from: o.dn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1326dn0 {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Layout.Alignment f743o;
    public Layout.Alignment p;
    public Ji0 r;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(C1326dn0 c1326dn0) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c1326dn0 != null) {
            if (!this.c && c1326dn0.c) {
                this.b = c1326dn0.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = c1326dn0.h;
            }
            if (this.i == -1) {
                this.i = c1326dn0.i;
            }
            if (this.a == null && (str = c1326dn0.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = c1326dn0.f;
            }
            if (this.g == -1) {
                this.g = c1326dn0.g;
            }
            if (this.n == -1) {
                this.n = c1326dn0.n;
            }
            if (this.f743o == null && (alignment2 = c1326dn0.f743o) != null) {
                this.f743o = alignment2;
            }
            if (this.p == null && (alignment = c1326dn0.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = c1326dn0.q;
            }
            if (this.j == -1) {
                this.j = c1326dn0.j;
                this.k = c1326dn0.k;
            }
            if (this.r == null) {
                this.r = c1326dn0.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = c1326dn0.s;
            }
            if (!this.e && c1326dn0.e) {
                this.d = c1326dn0.d;
                this.e = true;
            }
            if (this.m != -1 || (i = c1326dn0.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
