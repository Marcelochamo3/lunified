package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class D50 {
    public final A50 a;
    public final List b;
    public final int c;
    public final C2599qr d;
    public final C1951k70 e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public D50(A50 a50, List list, int i, C2599qr c2599qr, C1951k70 c1951k70, int i2, int i3, int i4) {
        AbstractC1474fG.j(a50, "call");
        AbstractC1474fG.j(list, "interceptors");
        AbstractC1474fG.j(c1951k70, "request");
        this.a = a50;
        this.b = list;
        this.c = i;
        this.d = c2599qr;
        this.e = c1951k70;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public static D50 a(D50 d50, int i, C2599qr c2599qr, C1951k70 c1951k70, int i2) {
        if ((i2 & 1) != 0) {
            i = d50.c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            c2599qr = d50.d;
        }
        C2599qr c2599qr2 = c2599qr;
        if ((i2 & 4) != 0) {
            c1951k70 = d50.e;
        }
        C1951k70 c1951k71 = c1951k70;
        int i4 = d50.f;
        int i5 = d50.g;
        int i6 = d50.h;
        d50.getClass();
        AbstractC1474fG.j(c1951k71, "request");
        return new D50(d50.a, d50.b, i3, c2599qr2, c1951k71, i4, i5, i6);
    }

    public final C1855j80 b(C1951k70 c1951k70) {
        AbstractC1474fG.j(c1951k70, "request");
        List list = this.b;
        int size = list.size();
        int i = this.c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.i++;
        C2599qr c2599qr = this.d;
        if (c2599qr != null) {
            if (!c2599qr.c.b(c1951k70.a)) {
                throw new IllegalStateException(("network interceptor " + list.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + list.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        D50 d50A = a(this, i2, null, c1951k70, 58);
        InterfaceC1181cG interfaceC1181cG = (InterfaceC1181cG) list.get(i);
        C1855j80 c1855j80A = interfaceC1181cG.a(d50A);
        if (c1855j80A == null) {
            throw new NullPointerException("interceptor " + interfaceC1181cG + " returned null");
        }
        if (c2599qr != null && i2 < list.size() && d50A.i != 1) {
            throw new IllegalStateException(("network interceptor " + interfaceC1181cG + " must call proceed() exactly once").toString());
        }
        if (c1855j80A.r != null) {
            return c1855j80A;
        }
        throw new IllegalStateException(("interceptor " + interfaceC1181cG + " returned a response with no body").toString());
    }
}
