package o;

import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.skidush.clonex.fragments.settings.SettingsTvFragment;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Rc0 implements L20 {
    public final /* synthetic */ int l;
    public final /* synthetic */ ListPreference m;

    public /* synthetic */ Rc0(ListPreference listPreference, int i) {
        this.l = i;
        this.m = listPreference;
    }

    @Override // o.L20
    public final boolean f(Preference preference, Serializable serializable) {
        ListPreference listPreference = this.m;
        switch (this.l) {
            case 0:
                AbstractC1474fG.j(preference, "<anonymous parameter 0>");
                C3084vr0 c3084vr0 = C3084vr0.a;
                AbstractC1474fG.h(serializable, "null cannot be cast to non-null type kotlin.String");
                C3084vr0.K((String) serializable);
                Wc0.c0(listPreference);
                break;
            default:
                AbstractC1474fG.j(preference, "<anonymous parameter 0>");
                C3084vr0 c3084vr1 = C3084vr0.a;
                AbstractC1474fG.h(serializable, "null cannot be cast to non-null type kotlin.String");
                C3084vr0.K((String) serializable);
                SettingsTvFragment.c0(listPreference);
                break;
        }
        return true;
    }
}
