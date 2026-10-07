package o;

import android.net.http.X509TrustManagerExtensions;
import java.net.InetAddress;
import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: o.lc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2085lc0 extends X509ExtendedTrustManager {
    public final X509TrustManager a;
    public final C2182mc0 b;
    public final X509TrustManagerExtensions c;

    public C2085lc0(X509TrustManager x509TrustManager, boolean z) {
        AbstractC1474fG.j(x509TrustManager, "delegate");
        this.a = x509TrustManager;
        this.b = new C2182mc0(x509TrustManager, z);
        this.c = new X509TrustManagerExtensions(x509TrustManager);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        AbstractC1474fG.j(x509CertificateArr, "chain");
        AbstractC1474fG.j(str, "authType");
        this.a.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        AbstractC1474fG.j(x509CertificateArr, "chain");
        AbstractC1474fG.j(str, "authType");
        this.b.checkServerTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        X509Certificate[] acceptedIssuers = this.a.getAcceptedIssuers();
        AbstractC1474fG.i(acceptedIssuers, "getAcceptedIssuers(...)");
        return acceptedIssuers;
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        AbstractC1474fG.j(x509CertificateArr, "chain");
        AbstractC1474fG.j(str, "authType");
        AbstractC1474fG.j(socket, "socket");
        this.a.checkClientTrusted(x509CertificateArr, str);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        String hostName;
        String str2;
        SSLSession handshakeSession;
        String peerHost;
        AbstractC1474fG.j(x509CertificateArr, "chain");
        AbstractC1474fG.j(str, "authType");
        AbstractC1474fG.j(socket, "socket");
        SSLSocket sSLSocket = socket instanceof SSLSocket ? (SSLSocket) socket : null;
        if (sSLSocket == null || (handshakeSession = sSLSocket.getHandshakeSession()) == null || (peerHost = handshakeSession.getPeerHost()) == null) {
            InetAddress inetAddress = socket.getInetAddress();
            hostName = inetAddress != null ? inetAddress.getHostName() : null;
            if (hostName != null) {
                throw new CertificateException("TLS sin hostname");
            }
            str2 = hostName;
        } else {
            if (!(!AbstractC1899jh0.O(peerHost))) {
                peerHost = null;
            }
            if (peerHost != null) {
                str2 = peerHost;
            } else {
                InetAddress inetAddress2 = socket.getInetAddress();
                if (inetAddress2 != null) {
                }
                if (hostName != null) {
                    throw new CertificateException("TLS sin hostname");
                }
                str2 = hostName;
            }
        }
        this.b.a(x509CertificateArr, new C1205cc(this, x509CertificateArr, str, str2, 2));
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        AbstractC1474fG.j(x509CertificateArr, "chain");
        AbstractC1474fG.j(str, "authType");
        AbstractC1474fG.j(sSLEngine, "engine");
        this.a.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        AbstractC1474fG.j(x509CertificateArr, "chain");
        AbstractC1474fG.j(str, "authType");
        AbstractC1474fG.j(sSLEngine, "engine");
        String peerHost = sSLEngine.getPeerHost();
        if (peerHost != null) {
            if (!(!AbstractC1899jh0.O(peerHost))) {
                peerHost = null;
            }
            String str2 = peerHost;
            if (str2 != null) {
                this.b.a(x509CertificateArr, new C1205cc(this, x509CertificateArr, str, str2, 2));
                return;
            }
        }
        throw new CertificateException("TLS sin hostname");
    }
}
