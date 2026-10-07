package o;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class G90 implements J90 {
    public final K3 a;
    public boolean b;
    public Bundle c;
    public final Rh0 d;

    public G90(K3 k3, InterfaceC1047au0 interfaceC1047au0) {
        AbstractC1474fG.j(k3, "savedStateRegistry");
        AbstractC1474fG.j(interfaceC1047au0, "viewModelStoreOwner");
        this.a = k3;
        this.d = new Rh0(new io.sentry.android.replay.f(18, interfaceC1047au0));
    }

    @Override // o.J90
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((H90) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((E90) entry.getValue()).e.a();
            if (!AbstractC1474fG.b(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundle;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleC = this.a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleC != null) {
            bundle.putAll(bundleC);
        }
        this.c = bundle;
        this.b = true;
    }
}
