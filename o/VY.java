package o;

import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public class VY {
    public static volatile VY a;
    public static final Logger b;

    /* JADX WARN: Code duplicated, block: B:26:0x0072 A[PHI: r3
  0x0072: PHI (r3v3 o.VY) = (r3v1 o.VY), (r3v4 o.VY) binds: [B:66:0x0158, B:25:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x0094 A[PHI: r2
  0x0094: PHI (r2v26 o.VY) = (r2v15 o.VY), (r2v20 o.VY), (r2v24 o.VY), (r2v29 o.VY) binds: [B:55:0x00e2, B:49:0x00d4, B:41:0x00b4, B:33:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00db  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:68:0x015c  */
    static {
        VY c3321yH;
        String property;
        VY vy;
        VY c3224xH = null;
        if (C2743sL.t()) {
            for (Map.Entry entry : D2.b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (D2.a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(E2.a);
                }
            }
            vy = C3298y2.d ? new C3298y2() : null;
            if (vy == null) {
                c3224xH = H2.e ? new H2() : null;
                AbstractC1474fG.g(c3224xH);
                vy = c3224xH;
            }
        } else if (AbstractC1474fG.b("Conscrypt", Security.getProviders()[0].getName())) {
            c3321yH = C3352yg.d ? new C3352yg() : null;
            if (c3321yH != null) {
                vy = c3321yH;
            } else if (!AbstractC1474fG.b("BC", Security.getProviders()[0].getName())) {
                if (C3118w9.d) {
                    c3321yH = new C3118w9();
                } else {
                    c3321yH = null;
                }
                if (c3321yH != null) {
                    vy = c3321yH;
                } else if (AbstractC1474fG.b("OpenJSSE", Security.getProviders()[0].getName())) {
                    if (C3142wW.d) {
                        c3321yH = new C3142wW();
                    } else {
                        c3321yH = null;
                    }
                    if (c3321yH != null) {
                        vy = c3321yH;
                    } else {
                        if (C3321yH.c) {
                            c3321yH = new C3321yH();
                        } else {
                            c3321yH = null;
                        }
                        if (c3321yH != null) {
                            vy = c3321yH;
                        } else {
                            property = System.getProperty("java.specification.version", "unknown");
                            AbstractC1474fG.i(property, "jvmVersion");
                            if (Integer.parseInt(property) < 9) {
                                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                Method method = cls.getMethod("put", SSLSocket.class, cls2);
                                Method method2 = cls.getMethod("get", SSLSocket.class);
                                Method method3 = cls.getMethod("remove", SSLSocket.class);
                                AbstractC1474fG.i(method, "putMethod");
                                AbstractC1474fG.i(method2, "getMethod");
                                AbstractC1474fG.i(method3, "removeMethod");
                                AbstractC1474fG.i(cls3, "clientProviderClass");
                                AbstractC1474fG.i(cls4, "serverProviderClass");
                                c3224xH = new C3224xH(method, method2, method3, cls3, cls4);
                            }
                            if (c3224xH != null) {
                                vy = c3224xH;
                            } else {
                                vy = new VY();
                            }
                        }
                    }
                } else {
                    if (C3321yH.c) {
                        c3321yH = new C3321yH();
                    } else {
                        c3321yH = null;
                    }
                    if (c3321yH != null) {
                        vy = c3321yH;
                    } else {
                        property = System.getProperty("java.specification.version", "unknown");
                        AbstractC1474fG.i(property, "jvmVersion");
                        if (Integer.parseInt(property) < 9) {
                            Class<?> cls5 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls6 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class<?> cls7 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class<?> cls8 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method method4 = cls5.getMethod("put", SSLSocket.class, cls6);
                            Method method5 = cls5.getMethod("get", SSLSocket.class);
                            Method method6 = cls5.getMethod("remove", SSLSocket.class);
                            AbstractC1474fG.i(method4, "putMethod");
                            AbstractC1474fG.i(method5, "getMethod");
                            AbstractC1474fG.i(method6, "removeMethod");
                            AbstractC1474fG.i(cls7, "clientProviderClass");
                            AbstractC1474fG.i(cls8, "serverProviderClass");
                            c3224xH = new C3224xH(method4, method5, method6, cls7, cls8);
                        }
                        if (c3224xH != null) {
                            vy = c3224xH;
                        } else {
                            vy = new VY();
                        }
                    }
                }
            } else if (AbstractC1474fG.b("OpenJSSE", Security.getProviders()[0].getName())) {
                if (C3321yH.c) {
                    c3321yH = new C3321yH();
                } else {
                    c3321yH = null;
                }
                if (c3321yH != null) {
                    vy = c3321yH;
                } else {
                    property = System.getProperty("java.specification.version", "unknown");
                    AbstractC1474fG.i(property, "jvmVersion");
                    if (Integer.parseInt(property) < 9) {
                        Class<?> cls9 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls10 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                        Class<?> cls11 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                        Class<?> cls12 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                        Method method7 = cls9.getMethod("put", SSLSocket.class, cls10);
                        Method method8 = cls9.getMethod("get", SSLSocket.class);
                        Method method9 = cls9.getMethod("remove", SSLSocket.class);
                        AbstractC1474fG.i(method7, "putMethod");
                        AbstractC1474fG.i(method8, "getMethod");
                        AbstractC1474fG.i(method9, "removeMethod");
                        AbstractC1474fG.i(cls11, "clientProviderClass");
                        AbstractC1474fG.i(cls12, "serverProviderClass");
                        c3224xH = new C3224xH(method7, method8, method9, cls11, cls12);
                    }
                    if (c3224xH != null) {
                        vy = c3224xH;
                    } else {
                        vy = new VY();
                    }
                }
            } else {
                if (C3142wW.d) {
                    c3321yH = new C3142wW();
                } else {
                    c3321yH = null;
                }
                if (c3321yH != null) {
                    vy = c3321yH;
                } else {
                    if (C3321yH.c) {
                        c3321yH = new C3321yH();
                    } else {
                        c3321yH = null;
                    }
                    if (c3321yH != null) {
                        vy = c3321yH;
                    } else {
                        property = System.getProperty("java.specification.version", "unknown");
                        AbstractC1474fG.i(property, "jvmVersion");
                        if (Integer.parseInt(property) < 9) {
                            Class<?> cls13 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls14 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class<?> cls15 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class<?> cls16 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method method10 = cls13.getMethod("put", SSLSocket.class, cls14);
                            Method method11 = cls13.getMethod("get", SSLSocket.class);
                            Method method12 = cls13.getMethod("remove", SSLSocket.class);
                            AbstractC1474fG.i(method10, "putMethod");
                            AbstractC1474fG.i(method11, "getMethod");
                            AbstractC1474fG.i(method12, "removeMethod");
                            AbstractC1474fG.i(cls15, "clientProviderClass");
                            AbstractC1474fG.i(cls16, "serverProviderClass");
                            c3224xH = new C3224xH(method10, method11, method12, cls15, cls16);
                        }
                        if (c3224xH != null) {
                            vy = c3224xH;
                        } else {
                            vy = new VY();
                        }
                    }
                }
            }
        } else if (!AbstractC1474fG.b("BC", Security.getProviders()[0].getName())) {
            if (C3118w9.d) {
                c3321yH = new C3118w9();
            } else {
                c3321yH = null;
            }
            if (c3321yH != null) {
                vy = c3321yH;
            } else if (AbstractC1474fG.b("OpenJSSE", Security.getProviders()[0].getName())) {
                if (C3321yH.c) {
                    c3321yH = new C3321yH();
                } else {
                    c3321yH = null;
                }
                if (c3321yH != null) {
                    vy = c3321yH;
                } else {
                    property = System.getProperty("java.specification.version", "unknown");
                    AbstractC1474fG.i(property, "jvmVersion");
                    if (Integer.parseInt(property) < 9) {
                        Class<?> cls17 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls18 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                        Class<?> cls19 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                        Class<?> cls110 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                        Method method13 = cls17.getMethod("put", SSLSocket.class, cls18);
                        Method method14 = cls17.getMethod("get", SSLSocket.class);
                        Method method15 = cls17.getMethod("remove", SSLSocket.class);
                        AbstractC1474fG.i(method13, "putMethod");
                        AbstractC1474fG.i(method14, "getMethod");
                        AbstractC1474fG.i(method15, "removeMethod");
                        AbstractC1474fG.i(cls19, "clientProviderClass");
                        AbstractC1474fG.i(cls110, "serverProviderClass");
                        c3224xH = new C3224xH(method13, method14, method15, cls19, cls110);
                    }
                    if (c3224xH != null) {
                        vy = c3224xH;
                    } else {
                        vy = new VY();
                    }
                }
            } else {
                if (C3142wW.d) {
                    c3321yH = new C3142wW();
                } else {
                    c3321yH = null;
                }
                if (c3321yH != null) {
                    vy = c3321yH;
                } else {
                    if (C3321yH.c) {
                        c3321yH = new C3321yH();
                    } else {
                        c3321yH = null;
                    }
                    if (c3321yH != null) {
                        vy = c3321yH;
                    } else {
                        property = System.getProperty("java.specification.version", "unknown");
                        AbstractC1474fG.i(property, "jvmVersion");
                        if (Integer.parseInt(property) < 9) {
                            Class<?> cls111 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls112 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class<?> cls113 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class<?> cls114 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method method16 = cls111.getMethod("put", SSLSocket.class, cls112);
                            Method method17 = cls111.getMethod("get", SSLSocket.class);
                            Method method18 = cls111.getMethod("remove", SSLSocket.class);
                            AbstractC1474fG.i(method16, "putMethod");
                            AbstractC1474fG.i(method17, "getMethod");
                            AbstractC1474fG.i(method18, "removeMethod");
                            AbstractC1474fG.i(cls113, "clientProviderClass");
                            AbstractC1474fG.i(cls114, "serverProviderClass");
                            c3224xH = new C3224xH(method16, method17, method18, cls113, cls114);
                        }
                        if (c3224xH != null) {
                            vy = c3224xH;
                        } else {
                            vy = new VY();
                        }
                    }
                }
            }
        } else if (AbstractC1474fG.b("OpenJSSE", Security.getProviders()[0].getName())) {
            if (C3321yH.c) {
                c3321yH = new C3321yH();
            } else {
                c3321yH = null;
            }
            if (c3321yH != null) {
                vy = c3321yH;
            } else {
                property = System.getProperty("java.specification.version", "unknown");
                try {
                    AbstractC1474fG.i(property, "jvmVersion");
                    if (Integer.parseInt(property) < 9) {
                        try {
                            Class<?> cls115 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls116 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class<?> cls117 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class<?> cls118 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method method19 = cls115.getMethod("put", SSLSocket.class, cls116);
                            Method method110 = cls115.getMethod("get", SSLSocket.class);
                            Method method111 = cls115.getMethod("remove", SSLSocket.class);
                            AbstractC1474fG.i(method19, "putMethod");
                            AbstractC1474fG.i(method110, "getMethod");
                            AbstractC1474fG.i(method111, "removeMethod");
                            AbstractC1474fG.i(cls117, "clientProviderClass");
                            AbstractC1474fG.i(cls118, "serverProviderClass");
                            c3224xH = new C3224xH(method19, method110, method111, cls117, cls118);
                        } catch (ClassNotFoundException | NoSuchMethodException unused) {
                        }
                    }
                } catch (NumberFormatException unused2) {
                }
                if (c3224xH != null) {
                    vy = c3224xH;
                } else {
                    vy = new VY();
                }
            }
        } else {
            if (C3142wW.d) {
                c3321yH = new C3142wW();
            } else {
                c3321yH = null;
            }
            if (c3321yH != null) {
                vy = c3321yH;
            } else {
                if (C3321yH.c) {
                    c3321yH = new C3321yH();
                } else {
                    c3321yH = null;
                }
                if (c3321yH != null) {
                    vy = c3321yH;
                } else {
                    property = System.getProperty("java.specification.version", "unknown");
                    AbstractC1474fG.i(property, "jvmVersion");
                    if (Integer.parseInt(property) < 9) {
                        Class<?> cls119 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls1110 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                        Class<?> cls1111 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                        Class<?> cls1112 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                        Method method112 = cls119.getMethod("put", SSLSocket.class, cls1110);
                        Method method113 = cls119.getMethod("get", SSLSocket.class);
                        Method method114 = cls119.getMethod("remove", SSLSocket.class);
                        AbstractC1474fG.i(method112, "putMethod");
                        AbstractC1474fG.i(method113, "getMethod");
                        AbstractC1474fG.i(method114, "removeMethod");
                        AbstractC1474fG.i(cls1111, "clientProviderClass");
                        AbstractC1474fG.i(cls1112, "serverProviderClass");
                        c3224xH = new C3224xH(method112, method113, method114, cls1111, cls1112);
                    }
                    if (c3224xH != null) {
                        vy = c3224xH;
                    } else {
                        vy = new VY();
                    }
                }
            }
        }
        a = vy;
        b = Logger.getLogger(OV.class.getName());
    }

    public static void i(int i, String str, Throwable th) {
        AbstractC1474fG.j(str, "message");
        b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public static /* synthetic */ void j(VY vy, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        vy.getClass();
        i(i, str, null);
    }

    public AbstractC1923jt0 b(X509TrustManager x509TrustManager) {
        AbstractC1474fG.j(x509TrustManager, "trustManager");
        return new C3116w8(c(x509TrustManager));
    }

    public Tm0 c(X509TrustManager x509TrustManager) {
        AbstractC1474fG.j(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        AbstractC1474fG.i(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C3310y8((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1474fG.j(list, "protocols");
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        AbstractC1474fG.j(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        AbstractC1474fG.j(str, "hostname");
        return true;
    }

    public void k(Object obj, String str) {
        AbstractC1474fG.j(str, "message");
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(5, str, (Throwable) obj);
    }

    public SSLContext l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        AbstractC1474fG.i(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory m(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextL = l();
            sSLContextL.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextL.getSocketFactory();
            AbstractC1474fG.i(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    public X509TrustManager n() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC1474fG.g(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                AbstractC1474fG.h(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        AbstractC1474fG.i(string, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }
}
