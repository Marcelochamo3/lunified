package o;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class C3 implements J90 {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public C3(K3 k3) {
        AbstractC1474fG.j(k3, "registry");
        this.b = new LinkedHashSet();
        k3.f("androidx.savedstate.Restarter", this);
    }

    @Override // o.J90
    public final Bundle a() {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                ((E3) this.b).w().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.b));
                return bundle2;
        }
    }

    public C3(E3 e3) {
        this.b = e3;
    }
}
