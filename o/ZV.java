package o;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final class ZV {
    public static final ZV a = new ZV();

    public final OnBackInvokedCallback a(InterfaceC0360Cy interfaceC0360Cy) {
        AbstractC1474fG.j(interfaceC0360Cy, "onBackInvoked");
        return new X3(2, interfaceC0360Cy);
    }

    public final void b(Object obj, int i, Object obj2) {
        AbstractC1474fG.j(obj, "dispatcher");
        AbstractC1474fG.j(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        AbstractC1474fG.j(obj, "dispatcher");
        AbstractC1474fG.j(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
