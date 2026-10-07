package o;

/* JADX INFO: loaded from: classes.dex */
public final class B7 extends AbstractC1301db {
    public final A7[] l;

    public B7(A7[] a7Arr) {
        this.l = a7Arr;
    }

    @Override // o.AbstractC1301db
    public final void a(Throwable th) {
        d();
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        d();
        return C2985uq0.a;
    }

    public final void d() {
        for (A7 a7 : this.l) {
            InterfaceC2300nn interfaceC2300nn = a7.q;
            if (interfaceC2300nn == null) {
                AbstractC1474fG.U("handle");
                throw null;
            }
            interfaceC2300nn.d();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.l + ']';
    }
}
