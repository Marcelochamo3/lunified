package o;

/* JADX INFO: renamed from: o.qv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2607qv {
    public final G8 a;
    public final K8 b;
    public H8 c;
    public final int d;

    public C2607qv(I8 i8, K8 k8, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = k8;
        this.d = i;
        this.a = new G8(i8, j, j2, j3, j4, j5);
    }

    public static int a(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static int c(C0554Kk c0554Kk, long j, C2800sv c2800sv) {
        if (j == c0554Kk.f369o) {
            return 0;
        }
        c2800sv.a = j;
        return 1;
    }

    public final int b(C0554Kk c0554Kk, C2800sv c2800sv) {
        while (true) {
            H8 h8 = this.c;
            AbstractC0397Ej.g(h8);
            long j = h8.f;
            long j2 = h8.g;
            long j3 = h8.h;
            long j4 = j2 - j;
            long j5 = this.d;
            K8 k8 = this.b;
            if (j4 <= j5) {
                this.c = null;
                k8.q();
                return c(c0554Kk, j, c2800sv);
            }
            long j6 = j3 - c0554Kk.f369o;
            if (j6 < 0 || j6 > 262144) {
                return c(c0554Kk, j3, c2800sv);
            }
            c0554Kk.q((int) j6);
            c0554Kk.q = 0;
            J8 j8I = k8.i(c0554Kk, h8.b);
            int i = j8I.c;
            if (i == -3) {
                this.c = null;
                k8.q();
                return c(c0554Kk, j3, c2800sv);
            }
            long j7 = j8I.a;
            long j8 = j8I.b;
            if (i == -2) {
                h8.d = j7;
                h8.f = j8;
                h8.h = H8.a(h8.b, j7, h8.e, j8, h8.g, h8.c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long j9 = j8 - c0554Kk.f369o;
                    if (j9 >= 0 && j9 <= 262144) {
                        c0554Kk.q((int) j9);
                    }
                    this.c = null;
                    k8.q();
                    return c(c0554Kk, j8, c2800sv);
                }
                h8.e = j7;
                h8.g = j8;
                h8.h = H8.a(h8.b, h8.d, j7, h8.f, j8, h8.c);
            }
        }
    }

    public final void d(long j) {
        H8 h8 = this.c;
        if (h8 == null || h8.a != j) {
            G8 g8 = this.a;
            this.c = new H8(j, g8.a.f(j), g8.c, g8.d, g8.e, g8.f, g8.g);
        }
    }
}
