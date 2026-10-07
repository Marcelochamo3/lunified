package o;

import android.window.OnBackInvokedCallback;

/* JADX INFO: renamed from: o.bW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1100bW {
    public static final C1100bW a = new C1100bW();

    public final OnBackInvokedCallback a(InterfaceC0412Ey interfaceC0412Ey, InterfaceC0412Ey interfaceC0412Ey2, InterfaceC0360Cy interfaceC0360Cy, InterfaceC0360Cy interfaceC0360Cy2) {
        AbstractC1474fG.j(interfaceC0412Ey, "onBackStarted");
        AbstractC1474fG.j(interfaceC0412Ey2, "onBackProgressed");
        AbstractC1474fG.j(interfaceC0360Cy, "onBackInvoked");
        AbstractC1474fG.j(interfaceC0360Cy2, "onBackCancelled");
        return new C1002aW(interfaceC0412Ey, interfaceC0412Ey2, interfaceC0360Cy, interfaceC0360Cy2);
    }
}
