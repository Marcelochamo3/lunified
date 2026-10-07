package o;

/* JADX INFO: renamed from: o.h80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1661h80 {
    public C1951k70 a;
    public O30 b;
    public String d;
    public C1469fB e;
    public AbstractC2051l80 g;
    public C1855j80 h;
    public C1855j80 i;
    public C1855j80 j;
    public long k;
    public long l;
    public C2599qr m;
    public int c = -1;
    public C2112lq f = new C2112lq(1);

    public static void b(String str, C1855j80 c1855j80) {
        if (c1855j80 != null) {
            if (c1855j80.r != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (c1855j80.s != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (c1855j80.t != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (c1855j80.u != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final C1855j80 a() {
        int i = this.c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.c).toString());
        }
        C1951k70 c1951k70 = this.a;
        if (c1951k70 == null) {
            throw new IllegalStateException("request == null".toString());
        }
        O30 o30 = this.b;
        if (o30 == null) {
            throw new IllegalStateException("protocol == null".toString());
        }
        String str = this.d;
        if (str != null) {
            return new C1855j80(c1951k70, o30, str, i, this.e, this.f.f(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        }
        throw new IllegalStateException("message == null".toString());
    }

    public final void c(C2152mB c2152mB) {
        AbstractC1474fG.j(c2152mB, "headers");
        this.f = c2152mB.f();
    }
}
