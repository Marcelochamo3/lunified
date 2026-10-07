package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.skidush.clonex.R;
import o.AbstractC1370eA;
import o.AbstractComponentCallbacksC1247cx;
import o.S20;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public final boolean e0;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, AbstractC1370eA.q(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
        this.e0 = true;
    }

    @Override // androidx.preference.Preference
    public final void m() {
        S20 s20;
        if (this.x != null || this.y != null || this.Z.size() == 0 || (s20 = this.m.j) == null) {
            return;
        }
        for (AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = s20; abstractComponentCallbacksC1247cx != null; abstractComponentCallbacksC1247cx = abstractComponentCallbacksC1247cx.I) {
        }
        s20.j();
        s20.h();
    }
}
