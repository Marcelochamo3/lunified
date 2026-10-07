package o;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class F90 implements ZJ, Closeable {
    public final String l;
    public final E90 m;
    public boolean n;

    public F90(String str, E90 e90) {
        this.l = str;
        this.m = e90;
    }

    @Override // o.ZJ
    public final void a(InterfaceC1283dK interfaceC1283dK, SJ sj) {
        if (sj == SJ.ON_DESTROY) {
            this.n = false;
            interfaceC1283dK.f().f(this);
        }
    }

    public final void f(K3 k3, C1478fK c1478fK) {
        AbstractC1474fG.j(k3, "registry");
        AbstractC1474fG.j(c1478fK, "lifecycle");
        if (!(!this.n)) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.n = true;
        c1478fK.a(this);
        k3.f(this.l, this.m.e);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
