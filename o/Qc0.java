package o;

import android.content.Context;
import android.content.Intent;
import androidx.preference.Preference;
import com.skidush.clonex.DnsConfigActivity;
import com.skidush.clonex.R;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Qc0 implements L20, M20 {
    public final /* synthetic */ int l;
    public final /* synthetic */ Wc0 m;

    public /* synthetic */ Qc0(Wc0 wc0, int i) {
        this.l = i;
        this.m = wc0;
    }

    @Override // o.M20
    public void a(Preference preference) {
        switch (this.l) {
            case 2:
                Wc0 wc0 = this.m;
                AbstractC1474fG.j(wc0, "this$0");
                AbstractC1474fG.j(preference, "it");
                Intent intent = new Intent(wc0.Q(), (Class<?>) DnsConfigActivity.class);
                C1442ex c1442ex = wc0.G;
                if (c1442ex != null) {
                    c1442ex.p.startActivity(intent, null);
                    return;
                }
                throw new IllegalStateException("Fragment " + wc0 + " not attached to Activity");
            default:
                Wc0 wc1 = this.m;
                AbstractC1474fG.j(wc1, "this$0");
                AbstractC1474fG.j(preference, "it");
                Context contextQ = wc1.Q();
                String strN = wc1.n(R.string.settings_clear_cache_confirm_title);
                AbstractC1474fG.i(strN, "getString(...)");
                String strN2 = wc1.n(R.string.settings_clear_cache_confirm_message);
                AbstractC1474fG.i(strN2, "getString(...)");
                String strN3 = wc1.n(R.string.settings_clear_cache_action);
                AbstractC1474fG.i(strN3, "getString(...)");
                AbstractC1468fA.B(contextQ, strN, strN2, strN3, false, R.drawable.ic_settings_cache, new io.sentry.android.replay.f(22, wc1));
                return;
        }
    }

    @Override // o.L20
    public boolean f(Preference preference, Serializable serializable) {
        Br0 br0;
        switch (this.l) {
            case 0:
                Wc0 wc0 = this.m;
                AbstractC1474fG.j(wc0, "this$0");
                AbstractC1474fG.j(preference, "<anonymous parameter 0>");
                AbstractC1474fG.h(serializable, "null cannot be cast to non-null type kotlin.String");
                Cr0.y.f((String) serializable);
                wc0.P().recreate();
                return true;
            default:
                Wc0 wc1 = this.m;
                AbstractC1474fG.j(wc1, "this$0");
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
                zy0.g(wc1.P(), br0);
                return true;
        }
    }
}
