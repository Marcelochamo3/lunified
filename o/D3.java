package o;

import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes.dex */
public final class D3 implements InterfaceC2076lW {
    public final /* synthetic */ E3 a;

    public D3(E3 e3) {
        this.a = e3;
    }

    @Override // o.InterfaceC2076lW
    public final void a() {
        E3 e3 = this.a;
        R3 r3W = e3.w();
        LayoutInflaterFactory2C1456f4 layoutInflaterFactory2C1456f4 = (LayoutInflaterFactory2C1456f4) r3W;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(layoutInflaterFactory2C1456f4.v);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(layoutInflaterFactory2C1456f4);
        } else {
            boolean z = layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C1456f4;
        }
        ((K3) e3.p.f832o).c("androidx:appcompat");
        r3W.b();
    }
}
