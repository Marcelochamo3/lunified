package o;

import android.content.Context;
import androidx.preference.Preference;
import com.skidush.clonex.R;
import com.skidush.clonex.fragments.settings.SettingsTvFragment;
import java.io.Serializable;

/* JADX INFO: renamed from: o.cd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1208cd0 implements L20, M20 {
    public final /* synthetic */ int l;
    public final /* synthetic */ SettingsTvFragment m;

    public /* synthetic */ C1208cd0(SettingsTvFragment settingsTvFragment, int i) {
        this.l = i;
        this.m = settingsTvFragment;
    }

    @Override // o.M20
    public void a(Preference preference) {
        switch (this.l) {
            case 2:
                SettingsTvFragment settingsTvFragment = this.m;
                AbstractC1474fG.j(settingsTvFragment, "this$0");
                AbstractC1474fG.j(preference, "it");
                Pu0.j(settingsTvFragment).n(R.id.action_settings_to_dns_settings, null, null);
                break;
            default:
                SettingsTvFragment settingsTvFragment2 = this.m;
                AbstractC1474fG.j(settingsTvFragment2, "this$0");
                AbstractC1474fG.j(preference, "it");
                Context contextQ = settingsTvFragment2.Q();
                String strN = settingsTvFragment2.n(R.string.settings_clear_cache_confirm_title);
                AbstractC1474fG.i(strN, "getString(...)");
                String strN2 = settingsTvFragment2.n(R.string.settings_clear_cache_confirm_message);
                AbstractC1474fG.i(strN2, "getString(...)");
                String strN3 = settingsTvFragment2.n(R.string.settings_clear_cache_action);
                AbstractC1474fG.i(strN3, "getString(...)");
                AbstractC1468fA.B(contextQ, strN, strN2, strN3, true, R.drawable.ic_settings_cache, new io.sentry.android.replay.f(23, settingsTvFragment2));
                break;
        }
    }

    @Override // o.L20
    public boolean f(Preference preference, Serializable serializable) {
        Br0 br0;
        switch (this.l) {
            case 0:
                SettingsTvFragment settingsTvFragment = this.m;
                AbstractC1474fG.j(settingsTvFragment, "this$0");
                AbstractC1474fG.j(preference, "<anonymous parameter 0>");
                AbstractC1474fG.h(serializable, "null cannot be cast to non-null type kotlin.String");
                Cr0.y.f((String) serializable);
                settingsTvFragment.P().recreate();
                return true;
            default:
                SettingsTvFragment settingsTvFragment2 = this.m;
                AbstractC1474fG.j(settingsTvFragment2, "this$0");
                AbstractC1474fG.j(preference, "<anonymous parameter 0>");
                AbstractC1474fG.h(serializable, "null cannot be cast to non-null type kotlin.String");
                String str = (String) serializable;
                if (AbstractC1474fG.b(str, "mobile")) {
                    br0 = Br0.MOBILE;
                } else {
                    if (!AbstractC1474fG.b(str, "tv")) {
                        return false;
                    }
                    br0 = Br0.TV;
                }
                zy0.g(settingsTvFragment2.P(), br0);
                return true;
        }
    }
}
