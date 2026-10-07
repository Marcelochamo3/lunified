package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.skidush.clonex.R;
import o.AbstractC1370eA;
import o.Z20;

/* JADX INFO: loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, AbstractC1370eA.q(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle));
    }

    @Override // androidx.preference.Preference
    public final boolean g() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final void l(Z20 z20) {
        super.l(z20);
        if (Build.VERSION.SDK_INT >= 28) {
            z20.a.setAccessibilityHeading(true);
        }
    }

    @Override // androidx.preference.Preference
    public final boolean x() {
        return !super.g();
    }
}
