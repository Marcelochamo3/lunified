package o;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class QF implements InterfaceC2098lj {
    public final C1813in a;

    public QF(C1813in c1813in) {
        this.a = c1813in;
    }

    @Override // o.InterfaceC2098lj
    public final InterfaceC2195mj a(Object obj) {
        return new C0334By((InputStream) obj, this.a);
    }

    @Override // o.InterfaceC2098lj
    public final Class b() {
        return InputStream.class;
    }
}
