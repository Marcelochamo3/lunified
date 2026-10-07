package o;

import android.content.SharedPreferences;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.Toast;
import androidx.preference.Preference;
import com.skidush.clonex.R;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: renamed from: o.vc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3053vc extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1075o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3053vc(Preference preference, List list, S20 s20) {
        super(0);
        this.m = 4;
        this.n = s20;
        this.p = preference;
        this.f1075o = list;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() throws JSONException, CertificateException {
        C2985uq0 c2985uq0 = C2985uq0.a;
        Object obj = this.p;
        Object obj2 = this.f1075o;
        Object obj3 = this.n;
        switch (this.m) {
            case 0:
                AbstractC1923jt0 abstractC1923jt0 = ((C3150wc) obj3).b;
                List<Certificate> listK = (List) obj2;
                if (abstractC1923jt0 != null) {
                    listK = abstractC1923jt0.k((String) obj, listK);
                }
                ArrayList arrayList = new ArrayList(AbstractC1016af.O(listK, 10));
                for (Certificate certificate : listK) {
                    AbstractC1474fG.h(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            case 1:
                ((C0529Jl) obj3).f.e((ViewGroup) obj2, obj);
                return c2985uq0;
            case 2:
                FT ft = (FT) obj3;
                for (DT dt : (Iterable) ft.f.l.getValue()) {
                    ((C0567Kx) obj2).getClass();
                    if (C0567Kx.n()) {
                        Objects.toString(dt);
                        Objects.toString((AbstractComponentCallbacksC1247cx) obj);
                    }
                    ft.b(dt);
                }
                return c2985uq0;
            case 3:
                Tv0 webViewYouTubePlayer$core_release = ((PJ) obj3).getWebViewYouTubePlayer$core_release();
                io.sentry.android.replay.v vVar = new io.sentry.android.replay.v(6, (AbstractC2325o0) obj);
                webViewYouTubePlayer$core_release.getClass();
                webViewYouTubePlayer$core_release.n = vVar;
                C3124wE c3124wE = (C3124wE) obj2;
                if (c3124wE == null) {
                    c3124wE = C3124wE.b;
                }
                WebSettings settings = webViewYouTubePlayer$core_release.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setMediaPlaybackRequiresUserGesture(false);
                settings.setCacheMode(-1);
                webViewYouTubePlayer$core_release.addJavascriptInterface(new my0(webViewYouTubePlayer$core_release), "YouTubePlayerBridge");
                InputStream inputStreamOpenRawResource = webViewYouTubePlayer$core_release.getResources().openRawResource(R.raw.ayp_youtube_player);
                AbstractC1474fG.i(inputStreamOpenRawResource, "resources.openRawResourc…R.raw.ayp_youtube_player)");
                try {
                    try {
                        String strH0 = AbstractC0911Ye.h0(AP.u(new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, "utf-8"))), "\n", null, null, null, 62);
                        AbstractC3409z9.g(inputStreamOpenRawResource, null);
                        String strR = AbstractC1899jh0.R(strH0, "<<injectedPlayerVars>>", c3124wE.toString(), false);
                        String string = c3124wE.a.getString("origin");
                        AbstractC1474fG.i(string, "playerOptions.getString(Builder.ORIGIN)");
                        webViewYouTubePlayer$core_release.loadDataWithBaseURL(string, strR, "text/html", "utf-8", null);
                        webViewYouTubePlayer$core_release.setWebChromeClient(new Sv0(webViewYouTubePlayer$core_release));
                        return c2985uq0;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC3409z9.g(inputStreamOpenRawResource, th);
                            throw th2;
                        }
                    }
                } catch (Exception unused) {
                    throw new RuntimeException("Can't parse HTML file.");
                }
            case 4:
                SharedPreferences sharedPreferences = AbstractC1459f50.n;
                if (sharedPreferences == null) {
                    AbstractC1474fG.U("prefs");
                    throw null;
                }
                sharedPreferences.edit().remove("VISIBLE_PROVIDERS").commit();
                S20 s20 = (S20) obj3;
                UK.i((Preference) obj, (List) obj2, s20);
                Toast.makeText(s20.Q(), R.string.settings_reset_providers_done, 0).show();
                return c2985uq0;
            case 5:
                AbstractC1923jt0 abstractC1923jt1 = ((C3150wc) obj3).b;
                AbstractC1474fG.g(abstractC1923jt1);
                return abstractC1923jt1.k(((C1159c2) obj).i.d, ((C1469fB) obj2).a());
            default:
                ((C2182mc0) obj3).a.checkServerTrusted((X509Certificate[]) obj2, (String) obj);
                return c2985uq0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3053vc(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.m = i;
        this.n = obj;
        this.f1075o = obj2;
        this.p = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3053vc(DT dt, FT ft, C0567Kx c0567Kx, AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        super(0);
        this.m = 2;
        this.n = ft;
        this.f1075o = c0567Kx;
        this.p = abstractComponentCallbacksC1247cx;
    }
}
