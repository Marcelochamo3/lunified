package o;

import com.skidush.clonex.utils.TvlinTlsCompatibility$ChainCompletingTrustManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: o.mp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2208mp0 {
    public static final Rh0 a = new Rh0(C1693hb0.v);

    public static void a(NV nv) {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Rh0 rh0 = a;
        sSLContext.init(null, new TvlinTlsCompatibility$ChainCompletingTrustManager[]{(TvlinTlsCompatibility$ChainCompletingTrustManager) rh0.getValue()}, null);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        AbstractC1474fG.i(socketFactory, "getSocketFactory(...)");
        nv.j(socketFactory, (TvlinTlsCompatibility$ChainCompletingTrustManager) rh0.getValue());
    }
}
