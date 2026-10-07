package o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.http.X509TrustManagerExtensions;
import com.skidush.clonex.MyApplication;
import com.skidush.clonex.R;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import o.AbstractC1474fG;
import o.AbstractC1899jh0;
import o.AbstractC2208mp0;
import o.Rh0;

/* JADX INFO: renamed from: o.hb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1693hb0 extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public static final C1693hb0 n = new C1693hb0(0, 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C1693hb0 f814o = new C1693hb0(0, 1);
    public static final C1693hb0 p = new C1693hb0(0, 2);
    public static final C1693hb0 q = new C1693hb0(0, 3);
    public static final C1693hb0 r = new C1693hb0(0, 4);
    public static final C1693hb0 s = new C1693hb0(0, 5);
    public static final C1693hb0 t = new C1693hb0(0, 6);
    public static final C1693hb0 u = new C1693hb0(0, 7);
    public static final C1693hb0 v = new C1693hb0(0, 8);
    public static final C1693hb0 w = new C1693hb0(0, 9);
    public static final C1693hb0 x = new C1693hb0(0, 10);
    public static final C1693hb0 y = new C1693hb0(0, 11);
    public static final C1693hb0 z = new C1693hb0(0, 12);
    public static final C1693hb0 A = new C1693hb0(0, 13);
    public static final C1693hb0 B = new C1693hb0(0, 14);
    public static final C1693hb0 C = new C1693hb0(0, 15);
    public static final C1693hb0 D = new C1693hb0(0, 16);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1693hb0(int i, int i2) {
        super(i);
        this.m = i2;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() throws NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, KeyStoreException, CertificateException, KeyManagementException, NoSuchProviderException {
        int i = 0;
        switch (this.m) {
            case 0:
                return C1791ib0.a(true, (4 & 2) != 0, false);
            case 1:
                return C2376oc0.a(true);
            case 2:
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                AbstractC1474fG.i(trustManagers, "getTrustManagers(...)");
                ArrayList arrayList = new ArrayList();
                int length = trustManagers.length;
                while (i < length) {
                    TrustManager trustManager = trustManagers[i];
                    if (trustManager instanceof X509TrustManager) {
                        arrayList.add(trustManager);
                    }
                    i++;
                }
                X509TrustManager x509TrustManager = (X509TrustManager) AbstractC0911Ye.d0(arrayList);
                if (x509TrustManager != null) {
                    return x509TrustManager;
                }
                throw new IllegalStateException("No existe un X509TrustManager del sistema".toString());
            case 3:
                return C2376oc0.a(false);
            case 4:
                NV nvH = AbstractC1370eA.h();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                nvH.i(30L, timeUnit);
                nvH.e(30L, timeUnit);
                C1813in c1813in = new C1813in();
                c1813in.n(64);
                c1813in.o(20);
                nvH.a = c1813in;
                return new OV(nvH);
            case 5:
                C3084vr0 c3084vr0 = C3084vr0.a;
                NV nvO = AbstractC1701hf0.o();
                X9 x9 = Sr0.a;
                ArrayList arrayList2 = nvO.c;
                arrayList2.add(x9);
                X9 x10 = Sr0.b;
                ArrayList arrayList3 = nvO.d;
                arrayList3.add(x10);
                X9 x11 = AbstractC1370eA.m;
                AbstractC1406ef.S(arrayList2, X10.q);
                AbstractC1406ef.S(arrayList3, X10.r);
                arrayList2.add(x11);
                arrayList3.add(x11);
                ConcurrentHashMap concurrentHashMap = C0323Bn.a;
                C0323Bn.b(nvO);
                nvO.h = false;
                nvO.i = false;
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                nvO.e(15L, timeUnit2);
                nvO.i(15L, timeUnit2);
                nvO.c(20L, timeUnit2);
                return new OV(nvO);
            case 6:
                NV nvL = AbstractC1370eA.l();
                TimeUnit timeUnit3 = TimeUnit.SECONDS;
                nvL.i(15L, timeUnit3);
                nvL.e(15L, timeUnit3);
                return new OV(nvL);
            case 7:
                TrustManagerFactory trustManagerFactory2 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory2.init((KeyStore) null);
                TrustManager[] trustManagers2 = trustManagerFactory2.getTrustManagers();
                AbstractC1474fG.i(trustManagers2, "getTrustManagers(...)");
                ArrayList arrayList4 = new ArrayList();
                for (TrustManager trustManager2 : trustManagers2) {
                    if (trustManager2 instanceof X509TrustManager) {
                        arrayList4.add(trustManager2);
                    }
                }
                X509TrustManager x509TrustManager2 = (X509TrustManager) AbstractC0911Ye.d0(arrayList4);
                if (x509TrustManager2 == null) {
                    throw new IllegalStateException("No existe un X509TrustManager del sistema".toString());
                }
                KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                keyStore.load(null, null);
                X509Certificate[] acceptedIssuers = x509TrustManager2.getAcceptedIssuers();
                AbstractC1474fG.i(acceptedIssuers, "getAcceptedIssuers(...)");
                int length2 = acceptedIssuers.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length2) {
                    keyStore.setCertificateEntry("system-" + i3, acceptedIssuers[i2]);
                    i2++;
                    i3++;
                }
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                MyApplication myApplication = MyApplication.l;
                Resources resources = Jp0.s().getResources();
                for (C1101bX c1101bX : AbstractC0937Ze.K(new C1101bX("isrg-root-x1", Integer.valueOf(R.raw.isrg_root_x1)), new C1101bX("gts-root-r4", Integer.valueOf(R.raw.gts_root_r4)))) {
                    String str = (String) c1101bX.l;
                    InputStream inputStreamOpenRawResource = resources.openRawResource(((Number) c1101bX.m).intValue());
                    try {
                        Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(inputStreamOpenRawResource);
                        AbstractC1474fG.h(certificateGenerateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                        X509Certificate x509Certificate = (X509Certificate) certificateGenerateCertificate;
                        AbstractC3409z9.g(inputStreamOpenRawResource, null);
                        if (!AbstractC1474fG.b(x509Certificate.getSubjectX500Principal(), x509Certificate.getIssuerX500Principal())) {
                            throw new IllegalStateException(AbstractC1701hf0.u("La CA empaquetada ", str, " no es una raíz autofirmada").toString());
                        }
                        x509Certificate.verify(x509Certificate.getPublicKey());
                        keyStore.setCertificateEntry(str, x509Certificate);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC3409z9.g(inputStreamOpenRawResource, th);
                            throw th2;
                        }
                    }
                }
                TrustManagerFactory trustManagerFactory3 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory3.init(keyStore);
                TrustManager[] trustManagers3 = trustManagerFactory3.getTrustManagers();
                AbstractC1474fG.i(trustManagers3, "getTrustManagers(...)");
                ArrayList arrayList5 = new ArrayList();
                for (TrustManager trustManager3 : trustManagers3) {
                    if (trustManager3 instanceof X509TrustManager) {
                        arrayList5.add(trustManager3);
                    }
                }
                X509TrustManager x509TrustManager3 = (X509TrustManager) AbstractC0911Ye.d0(arrayList5);
                if (x509TrustManager3 == null) {
                    throw new IllegalStateException("No se pudo crear el X509TrustManager compatible".toString());
                }
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, new X509TrustManager[]{x509TrustManager3}, new SecureRandom());
                SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
                AbstractC1474fG.g(socketFactory);
                return new C1913jo0(socketFactory, x509TrustManager3);
            case 8:
                TrustManagerFactory trustManagerFactory4 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory4.init((KeyStore) null);
                TrustManager[] trustManagers4 = trustManagerFactory4.getTrustManagers();
                AbstractC1474fG.i(trustManagers4, "getTrustManagers(...)");
                ArrayList arrayList6 = new ArrayList();
                int length3 = trustManagers4.length;
                while (i < length3) {
                    TrustManager trustManager4 = trustManagers4[i];
                    if (trustManager4 instanceof X509TrustManager) {
                        arrayList6.add(trustManager4);
                    }
                    i++;
                }
                final X509TrustManager x509TrustManager4 = (X509TrustManager) AbstractC0911Ye.b0(arrayList6);
                MyApplication myApplication2 = MyApplication.l;
                InputStream inputStreamOpenRawResource2 = Jp0.s().getResources().openRawResource(R.raw.rapidssl_tls_rsa_ca_g1);
                try {
                    Certificate certificateGenerateCertificate2 = CertificateFactory.getInstance("X.509").generateCertificate(inputStreamOpenRawResource2);
                    AbstractC1474fG.h(certificateGenerateCertificate2, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    final X509Certificate x509Certificate2 = (X509Certificate) certificateGenerateCertificate2;
                    AbstractC3409z9.g(inputStreamOpenRawResource2, null);
                    return new X509TrustManager(x509TrustManager4, x509Certificate2) { // from class: com.skidush.clonex.utils.TvlinTlsCompatibility$ChainCompletingTrustManager
                        private final X509TrustManagerExtensions extensions;
                        private final X509Certificate intermediate;
                        private final X509TrustManager system;

                        {
                            AbstractC1474fG.j(x509TrustManager4, "system");
                            AbstractC1474fG.j(x509Certificate2, "intermediate");
                            this.system = x509TrustManager4;
                            this.intermediate = x509Certificate2;
                            this.extensions = new X509TrustManagerExtensions(x509TrustManager4);
                        }

                        private final X509Certificate[] complete(X509Certificate[] x509CertificateArr) {
                            AbstractC1474fG.j(x509CertificateArr, "<this>");
                            X509Certificate x509Certificate3 = x509CertificateArr.length == 0 ? null : x509CertificateArr[x509CertificateArr.length - 1];
                            if (x509Certificate3 == null || !AbstractC1474fG.b(x509Certificate3.getIssuerX500Principal(), this.intermediate.getSubjectX500Principal())) {
                                return x509CertificateArr;
                            }
                            for (X509Certificate x509Certificate4 : x509CertificateArr) {
                                if (AbstractC1474fG.b(x509Certificate4, this.intermediate)) {
                                    return x509CertificateArr;
                                }
                            }
                            X509Certificate x509Certificate5 = this.intermediate;
                            int length4 = x509CertificateArr.length;
                            Object[] objArrCopyOf = Arrays.copyOf(x509CertificateArr, length4 + 1);
                            objArrCopyOf[length4] = x509Certificate5;
                            return (X509Certificate[]) objArrCopyOf;
                        }

                        @Override // javax.net.ssl.X509TrustManager
                        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str2) throws CertificateException {
                            AbstractC1474fG.j(x509CertificateArr, "chain");
                            AbstractC1474fG.j(str2, "authType");
                            this.system.checkClientTrusted(x509CertificateArr, str2);
                        }

                        @Override // javax.net.ssl.X509TrustManager
                        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str2) throws CertificateException {
                            AbstractC1474fG.j(x509CertificateArr, "chain");
                            AbstractC1474fG.j(str2, "authType");
                            this.system.checkServerTrusted(complete(x509CertificateArr), str2);
                        }

                        @Override // javax.net.ssl.X509TrustManager
                        public X509Certificate[] getAcceptedIssuers() {
                            X509Certificate[] acceptedIssuers2 = this.system.getAcceptedIssuers();
                            AbstractC1474fG.i(acceptedIssuers2, "getAcceptedIssuers(...)");
                            return acceptedIssuers2;
                        }

                        public final List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str2, String str3) throws CertificateException {
                            AbstractC1474fG.j(x509CertificateArr, "chain");
                            AbstractC1474fG.j(str2, "authType");
                            AbstractC1474fG.j(str3, "host");
                            X509TrustManagerExtensions x509TrustManagerExtensions = this.extensions;
                            Rh0 rh0 = AbstractC2208mp0.a;
                            if (AbstractC1899jh0.N(str3, "cdn1.tvlin.net", true)) {
                                x509CertificateArr = complete(x509CertificateArr);
                            }
                            List<X509Certificate> listCheckServerTrusted = x509TrustManagerExtensions.checkServerTrusted(x509CertificateArr, str2, str3);
                            AbstractC1474fG.i(listCheckServerTrusted, "checkServerTrusted(...)");
                            return listCheckServerTrusted;
                        }
                    };
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC3409z9.g(inputStreamOpenRawResource2, th3);
                        throw th4;
                    }
                }
            case 9:
                NV nv = new NV();
                nv.g(Proxy.NO_PROXY);
                X9 x12 = Sr0.a;
                ArrayList arrayList7 = nv.c;
                arrayList7.add(x12);
                X9 x13 = Sr0.b;
                ArrayList arrayList8 = nv.d;
                arrayList8.add(x13);
                X9 x14 = AbstractC1370eA.m;
                AbstractC1406ef.S(arrayList7, X10.q);
                AbstractC1406ef.S(arrayList8, X10.r);
                arrayList7.add(x14);
                arrayList8.add(x14);
                nv.f(C3084vr0.H);
                TimeUnit timeUnit4 = TimeUnit.SECONDS;
                nv.e(15L, timeUnit4);
                nv.i(20L, timeUnit4);
                nv.k(15L, timeUnit4);
                nv.c(25L, timeUnit4);
                nv.f = true;
                Rh0 rh0 = C2376oc0.a;
                C2376oc0.b(nv, false);
                return new OV(nv);
            case 10:
                SharedPreferences sharedPreferences = C3084vr0.k;
                if (sharedPreferences != null) {
                    C3084vr0 c3084vr1 = C3084vr0.a;
                    return new C3316yC(sharedPreferences, (OV) C3084vr0.L.getValue());
                }
                AbstractC1474fG.U("prefs");
                throw null;
            case 11:
                NV nvH2 = AbstractC1370eA.h();
                nvH2.h = true;
                nvH2.i = true;
                return new OV(nvH2);
            case 12:
                NV nv2 = new NV();
                nv2.g(Proxy.NO_PROXY);
                nv2.h(InterfaceC2339o7.a);
                X9 x15 = Sr0.a;
                ArrayList arrayList9 = nv2.c;
                arrayList9.add(x15);
                X9 x16 = Sr0.b;
                ArrayList arrayList10 = nv2.d;
                arrayList10.add(x16);
                X9 x17 = AbstractC1370eA.m;
                AbstractC1406ef.S(arrayList9, X10.q);
                AbstractC1406ef.S(arrayList10, X10.r);
                arrayList9.add(x17);
                arrayList10.add(x17);
                TimeUnit timeUnit5 = TimeUnit.SECONDS;
                nv2.e(8L, timeUnit5);
                nv2.i(8L, timeUnit5);
                nv2.c(10L, timeUnit5);
                nv2.h = true;
                return new OV(nv2);
            case 13:
                ArrayList arrayList11 = new ArrayList();
                String str2 = (String) AbstractC1443ex0.a.getValue();
                String[] strArr = {"sha256/J8R438TU+QLMgAtADHrw+a7psq0fQp19jnOnf4lMCIA=", "sha256/brzvtCELCIZUo4sD/qPX0ccRtPsd3DY6RfmxpOU9oB4=", "sha256/sCkq5UWXjg+7mKu9lMhhYF5bGLsy7VI/UNW3tccdR7w=", "sha256/diGVwiVYbubAI3RW4hB9xU8e/CH2GnkuvVFZE8zmgzI="};
                AbstractC1474fG.j(str2, "pattern");
                while (i < 4) {
                    arrayList11.add(new C2956uc(str2, strArr[i]));
                    i++;
                }
                return new C3150wc(AbstractC0911Ye.B0(arrayList11), null);
            case 14:
                String strH = com.skidush.clonex.bridge.N7.a.h(2);
                if (strH != null) {
                    String str3 = AbstractC1899jh0.O(strH) ^ true ? strH : null;
                    if (str3 != null) {
                        return str3;
                    }
                }
                throw new IllegalStateException("Configuración protegida no disponible");
            case 15:
                C3084vr0 c3084vr2 = C3084vr0.a;
                NV nvO2 = AbstractC1701hf0.o();
                X9 x18 = Sr0.a;
                ArrayList arrayList12 = nvO2.c;
                arrayList12.add(x18);
                X9 x19 = Sr0.b;
                ArrayList arrayList13 = nvO2.d;
                arrayList13.add(x19);
                X9 x20 = AbstractC1370eA.m;
                AbstractC1406ef.S(arrayList12, X10.q);
                AbstractC1406ef.S(arrayList13, X10.r);
                arrayList12.add(x20);
                arrayList13.add(x20);
                nvO2.h = true;
                nvO2.i = true;
                ConcurrentHashMap concurrentHashMap2 = C0323Bn.a;
                C0323Bn.b(nvO2);
                TimeUnit timeUnit6 = TimeUnit.SECONDS;
                nvO2.e(15L, timeUnit6);
                nvO2.i(15L, timeUnit6);
                return new OV(nvO2);
            default:
                NV nvH3 = AbstractC1370eA.h();
                TimeUnit timeUnit7 = TimeUnit.SECONDS;
                nvH3.e(15L, timeUnit7);
                nvH3.i(15L, timeUnit7);
                return new OV(nvH3);
        }
    }
}
