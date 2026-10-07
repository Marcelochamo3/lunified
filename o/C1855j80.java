package o;

import java.io.Closeable;
import java.io.EOFException;

/* JADX INFO: renamed from: o.j80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1855j80 implements Closeable {
    public final C1951k70 l;
    public final O30 m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f840o;
    public final C1469fB p;
    public final C2152mB q;
    public final AbstractC2051l80 r;
    public final C1855j80 s;
    public final C1855j80 t;
    public final C1855j80 u;
    public final long v;
    public final long w;
    public final C2599qr x;
    public C0414Fa y;

    public C1855j80(C1951k70 c1951k70, O30 o30, String str, int i, C1469fB c1469fB, C2152mB c2152mB, AbstractC2051l80 abstractC2051l80, C1855j80 c1855j80, C1855j80 c1855j81, C1855j80 c1855j82, long j, long j2, C2599qr c2599qr) {
        this.l = c1951k70;
        this.m = o30;
        this.n = str;
        this.f840o = i;
        this.p = c1469fB;
        this.q = c2152mB;
        this.r = abstractC2051l80;
        this.s = c1855j80;
        this.t = c1855j81;
        this.u = c1855j82;
        this.v = j;
        this.w = j2;
        this.x = c2599qr;
    }

    public final C0414Fa a() {
        C0414Fa c0414Fa = this.y;
        if (c0414Fa != null) {
            return c0414Fa;
        }
        int i = C0414Fa.n;
        C0414Fa c0414FaW = AbstractC3045vW.w(this.q);
        this.y = c0414FaW;
        return c0414FaW;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC2051l80 abstractC2051l80 = this.r;
        if (abstractC2051l80 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        abstractC2051l80.close();
    }

    public final String f(String str, String str2) {
        AbstractC1474fG.j(str, "name");
        String strA = this.q.a(str);
        return strA == null ? str2 : strA;
    }

    public final boolean l() {
        int i = this.f840o;
        if (i != 307 && i != 308) {
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public final boolean p() {
        int i = this.f840o;
        return 200 <= i && i < 300;
    }

    public final C1661h80 q() {
        C1661h80 c1661h80 = new C1661h80();
        c1661h80.a = this.l;
        c1661h80.b = this.m;
        c1661h80.c = this.f840o;
        c1661h80.d = this.n;
        c1661h80.e = this.p;
        c1661h80.f = this.q.f();
        c1661h80.g = this.r;
        c1661h80.h = this.s;
        c1661h80.i = this.t;
        c1661h80.j = this.u;
        c1661h80.k = this.v;
        c1661h80.l = this.w;
        c1661h80.m = this.x;
        return c1661h80;
    }

    public final E50 t(long j) throws EOFException {
        AbstractC2051l80 abstractC2051l80 = this.r;
        AbstractC1474fG.g(abstractC2051l80);
        C3111w50 c3111w50Peek = abstractC2051l80.p().peek();
        E9 e9 = new E9();
        c3111w50Peek.s(j);
        long jMin = Math.min(j, c3111w50Peek.m.m);
        while (jMin > 0) {
            long jY = c3111w50Peek.y(e9, jMin);
            if (jY == -1) {
                throw new EOFException();
            }
            jMin -= jY;
        }
        return new E50(abstractC2051l80.l(), e9.m, e9, 1);
    }

    public final String toString() {
        return "Response{protocol=" + this.m + ", code=" + this.f840o + ", message=" + this.n + ", url=" + this.l.a + '}';
    }
}
