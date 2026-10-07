package o;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: o.Fx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0437Fx extends Ut0 {
    public WeakReference b;

    @Override // o.Ut0
    public final void d() {
        WeakReference weakReference = this.b;
        if (weakReference == null) {
            AbstractC1474fG.U("completeTransition");
            throw null;
        }
        InterfaceC0360Cy interfaceC0360Cy = (InterfaceC0360Cy) weakReference.get();
        if (interfaceC0360Cy != null) {
            interfaceC0360Cy.c();
        }
    }
}
