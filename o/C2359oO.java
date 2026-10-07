package o;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: o.oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2359oO<S> extends NY {
    public int m0;
    public C0570La n0;

    @Override // o.AbstractComponentCallbacksC1247cx
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(j(), this.m0));
        throw null;
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void H(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.m0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.n0);
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void z(Bundle bundle) {
        super.z(bundle);
        if (bundle == null) {
            bundle = this.q;
        }
        this.m0 = bundle.getInt("THEME_RES_ID_KEY");
        AbstractC1674hK.u(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.n0 = (C0570La) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }
}
