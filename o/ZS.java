package o;

import androidx.lifecycle.DefaultLifecycleObserver;
import com.skidush.clonex.MyApplication;

/* JADX INFO: loaded from: classes.dex */
public final class ZS implements DefaultLifecycleObserver {
    public final /* synthetic */ MyApplication l;

    public ZS(MyApplication myApplication) {
        this.l = myApplication;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(InterfaceC1283dK interfaceC1283dK) {
        AbstractC1516fl.a(this, interfaceC1283dK);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(InterfaceC1283dK interfaceC1283dK) {
        AbstractC1516fl.b(this, interfaceC1283dK);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(InterfaceC1283dK interfaceC1283dK) {
        AbstractC1516fl.c(this, interfaceC1283dK);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(InterfaceC1283dK interfaceC1283dK) {
        AbstractC1516fl.d(this, interfaceC1283dK);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(InterfaceC1283dK interfaceC1283dK) {
        AbstractC1474fG.j(interfaceC1283dK, "owner");
        I7 i7 = I7.a;
        I7.b.set(true);
        I7.e.incrementAndGet();
        I7.d.set(false);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(InterfaceC1283dK interfaceC1283dK) {
        AbstractC1474fG.j(interfaceC1283dK, "owner");
        I7.a.b(this.l);
    }
}
