package o;

import android.content.Context;
import androidx.preference.Preference;
import com.skidush.clonex.R;
import com.skidush.clonex.fragments.settings.SettingsTvFragment;
import io.sentry.AbstractC0031b1;
import java.util.List;

/* JADX INFO: renamed from: o.ay, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1054ay implements io.sentry.U0, M20 {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f685o;

    public /* synthetic */ C1054ay(Object obj, Comparable comparable, Object obj2, int i) {
        this.l = i;
        this.m = obj;
        this.n = comparable;
        this.f685o = obj2;
    }

    @Override // o.M20
    public void a(Preference preference) {
        S20 s20 = (S20) this.m;
        AbstractC1474fG.j(s20, "$fragment");
        List list = (List) this.f685o;
        AbstractC1474fG.j(list, "$allProviders");
        AbstractC1474fG.j(preference, "it");
        Context contextQ = s20.Q();
        String strN = s20.n(R.string.settings_reset_providers_confirm_title);
        AbstractC1474fG.i(strN, "getString(...)");
        String strN2 = s20.n(R.string.settings_reset_providers_confirm_message);
        AbstractC1474fG.i(strN2, "getString(...)");
        String strN3 = s20.n(R.string.settings_reset_providers_action);
        AbstractC1474fG.i(strN3, "getString(...)");
        AbstractC1468fA.B(contextQ, strN, strN2, strN3, s20 instanceof SettingsTvFragment, R.drawable.ic_settings_restore, new C3053vc((Preference) this.n, list, s20));
    }

    @Override // io.sentry.U0
    public void c(io.sentry.Q q) {
        String str;
        Object obj = this.f685o;
        Object obj2 = this.n;
        Object obj3 = this.m;
        switch (this.l) {
            case 1:
                String str2 = (String) obj3;
                AbstractC1474fG.j(str2, "$stage");
                String str3 = (String) obj2;
                AbstractC1474fG.j(str3, "$failure");
                Throwable th = (Throwable) obj;
                AbstractC1474fG.j(th, "$error");
                AbstractC1474fG.j(q, "scope");
                q.d("diagnostic.area", "tvprovider_playback");
                q.d("diagnostic.stage", str2);
                q.d("diagnostic.failure", str3);
                AbstractC0031b1.a(th);
                break;
            default:
                String str4 = (String) obj3;
                AbstractC1474fG.j(str4, "$path");
                String str5 = (String) obj2;
                AbstractC1474fG.j(str5, "$primaryResult");
                String str6 = (String) obj;
                AbstractC1474fG.j(str6, "$fallbackResult");
                AbstractC1474fG.j(q, "scope");
                q.d("diagnostic.area", "stremcore_catalog");
                C1816io0 c1816io0 = C1816io0.b;
                if (AbstractC1474fG.b(str4, "/meta.json")) {
                    str = "meta";
                } else if (AbstractC1899jh0.U(str4, "/pages/movies/", false)) {
                    str = "movies_page";
                } else if (AbstractC1899jh0.U(str4, "/pages/series/", false)) {
                    str = "series_page";
                } else if (AbstractC1899jh0.U(str4, "/search/movies/", false)) {
                    str = "movies_search";
                } else if (AbstractC1899jh0.U(str4, "/search/series/", false)) {
                    str = "series_search";
                } else if (AbstractC1899jh0.U(str4, "/movies/", false)) {
                    str = "movie_detail";
                } else {
                    str = AbstractC1899jh0.U(str4, "/series/", false) ? "series_detail" : "other";
                }
                q.d("diagnostic.section", str);
                q.d("diagnostic.primary", str5);
                q.d("diagnostic.fallback", str6);
                AbstractC0031b1.b("StremCore catalog transport failure");
                break;
        }
    }

    public /* synthetic */ C1054ay(Jj0 jj0, Cm0 cm0, Runnable runnable) {
        this.l = 0;
        this.m = jj0;
        this.f685o = cm0;
        this.n = runnable;
    }
}
