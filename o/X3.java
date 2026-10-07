package o;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class X3 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ X3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        switch (this.a) {
            case 0:
                ((LayoutInflaterFactory2C1456f4) this.b).B();
                break;
            case 1:
                ((NN) this.b).a();
                break;
            case 2:
                InterfaceC0360Cy interfaceC0360Cy = (InterfaceC0360Cy) this.b;
                AbstractC1474fG.j(interfaceC0360Cy, "$onBackInvoked");
                interfaceC0360Cy.c();
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
