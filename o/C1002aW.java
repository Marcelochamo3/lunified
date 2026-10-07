package o;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: renamed from: o.aW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1002aW implements OnBackAnimationCallback {
    public final /* synthetic */ InterfaceC0412Ey a;
    public final /* synthetic */ InterfaceC0412Ey b;
    public final /* synthetic */ InterfaceC0360Cy c;
    public final /* synthetic */ InterfaceC0360Cy d;

    public C1002aW(InterfaceC0412Ey interfaceC0412Ey, InterfaceC0412Ey interfaceC0412Ey2, InterfaceC0360Cy interfaceC0360Cy, InterfaceC0360Cy interfaceC0360Cy2) {
        this.a = interfaceC0412Ey;
        this.b = interfaceC0412Ey2;
        this.c = interfaceC0360Cy;
        this.d = interfaceC0360Cy2;
    }

    public final void onBackCancelled() {
        this.d.c();
    }

    public final void onBackInvoked() {
        this.c.c();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractC1474fG.j(backEvent, "backEvent");
        this.b.b(new E7(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractC1474fG.j(backEvent, "backEvent");
        this.a.b(new E7(backEvent));
    }
}
