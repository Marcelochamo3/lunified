package o;

import android.view.View;
import android.widget.AdapterView;
import com.skidush.clonex.fragments.providers.ProvidersMobileFragment;
import com.skidush.clonex.fragments.providers.ProvidersTvFragment;
import java.util.List;

/* JADX INFO: renamed from: o.b40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1067b40 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ List m;
    public final /* synthetic */ AbstractComponentCallbacksC1247cx n;

    public /* synthetic */ C1067b40(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, List list, int i) {
        this.l = i;
        this.n = abstractComponentCallbacksC1247cx;
        this.m = list;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        switch (this.l) {
            case 0:
                ProvidersMobileFragment providersMobileFragment = (ProvidersMobileFragment) this.n;
                if (i != 0) {
                    providersMobileFragment.W().e(((C1164c40) this.m.get(i - 1)).a);
                } else {
                    providersMobileFragment.W().e(null);
                }
                break;
            default:
                ProvidersTvFragment providersTvFragment = (ProvidersTvFragment) this.n;
                if (i != 0) {
                    providersTvFragment.W().e(((C1359e40) this.m.get(i - 1)).a);
                } else {
                    providersTvFragment.W().e(null);
                }
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.l;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
