package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
public final class C50 extends KD {
    public final K80 b;
    public Socket c;
    public Socket d;
    public C1469fB e;
    public O30 f;
    public TD g;
    public C3111w50 h;
    public C3014v50 i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f194o;
    public final ArrayList p;
    public long q;

    public C50(io.sentry.android.core.internal.util.d dVar, K80 k80) {
        AbstractC1474fG.j(dVar, "connectionPool");
        AbstractC1474fG.j(k80, "route");
        this.b = k80;
        this.f194o = 1;
        this.p = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    public static void d(OV ov, K80 k80, IOException iOException) {
        AbstractC1474fG.j(ov, "client");
        AbstractC1474fG.j(k80, "failedRoute");
        AbstractC1474fG.j(iOException, "failure");
        if (k80.b.type() != Proxy.Type.DIRECT) {
            C1159c2 c1159c2 = k80.a;
            c1159c2.h.connectFailed(c1159c2.i.k(), k80.b.address(), iOException);
        }
        L80 l80 = ov.O;
        synchronized (l80) {
            ((LinkedHashSet) l80.l).add(k80);
        }
    }

    @Override // o.KD
    public final synchronized void a(TD td, Nc0 nc0) {
        AbstractC1474fG.j(td, "connection");
        AbstractC1474fG.j(nc0, "settings");
        this.f194o = (nc0.a & 16) != 0 ? nc0.b[4] : Integer.MAX_VALUE;
    }

    @Override // o.KD
    public final void b(C0984aE c0984aE) {
        AbstractC1474fG.j(c0984aE, "stream");
        c0984aE.c(8, null);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:57:0x0118  */
    /* JADX WARN: Code duplicated, block: B:58:0x011e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0127  */
    /* JADX WARN: Code duplicated, block: B:62:0x012d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0131  */
    /* JADX WARN: Code duplicated, block: B:66:0x0135  */
    /* JADX WARN: Code duplicated, block: B:72:0x0145  */
    /* JADX WARN: Code duplicated, block: B:86:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[LOOP:0: B:84:0x0071->B:95:?, LOOP_END, SYNTHETIC] */
    public final void c(int i, int i2, int i3, int i4, boolean z, A50 a50, C2691rp c2691rp) throws Throwable {
        Socket socket;
        Socket socket2;
        AbstractC1474fG.j(a50, "call");
        AbstractC1474fG.j(c2691rp, "eventListener");
        if (this.f != null) {
            throw new IllegalStateException("already connected".toString());
        }
        List list = this.b.a.k;
        C2867tg c2867tg = new C2867tg(list);
        C1159c2 c1159c2 = this.b.a;
        if (c1159c2.c == null) {
            if (!list.contains(C2770sg.f)) {
                throw new M80(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.b.a.i.d;
            VY vy = VY.a;
            if (!VY.a.h(str)) {
                throw new M80(new UnknownServiceException(AbstractC1701hf0.u("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (c1159c2.j.contains(O30.H2_PRIOR_KNOWLEDGE)) {
            throw new M80(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        M80 m80 = null;
        while (true) {
            try {
                K80 k80 = this.b;
                if (k80.a.c == null || k80.b.type() != Proxy.Type.HTTP) {
                    try {
                        e(i, i2, a50, c2691rp);
                    } catch (IOException e) {
                        e = e;
                        socket = this.d;
                        if (socket != null) {
                            Mr0.e(socket);
                        }
                        socket2 = this.c;
                        if (socket2 != null) {
                            Mr0.e(socket2);
                        }
                        this.d = null;
                        this.c = null;
                        this.h = null;
                        this.i = null;
                        this.e = null;
                        this.f = null;
                        this.g = null;
                        this.f194o = 1;
                        K80 k81 = this.b;
                        InetSocketAddress inetSocketAddress = k81.c;
                        Proxy proxy = k81.b;
                        AbstractC1474fG.j(inetSocketAddress, "inetSocketAddress");
                        AbstractC1474fG.j(proxy, "proxy");
                        if (m80 == null) {
                            m80 = new M80(e);
                        } else {
                            AbstractC3409z9.a(m80.l, e);
                            m80.m = e;
                        }
                        if (z) {
                            throw m80;
                        }
                        c2867tg.d = true;
                        if (c2867tg.c) {
                            throw m80;
                        }
                        if (!(e instanceof ProtocolException)) {
                            throw m80;
                        }
                        if (!(e instanceof InterruptedIOException)) {
                            throw m80;
                        }
                        if (!(e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                            throw m80;
                        }
                        if (!(e instanceof SSLPeerUnverifiedException)) {
                            throw m80;
                        }
                        if (e instanceof SSLException) {
                            throw m80;
                        }
                    }
                } else {
                    f(i, i2, i3, a50, c2691rp);
                    if (this.c == null) {
                        break;
                    }
                }
                try {
                    g(c2867tg, i4, a50, c2691rp);
                    K80 k82 = this.b;
                    InetSocketAddress inetSocketAddress2 = k82.c;
                    Proxy proxy2 = k82.b;
                    AbstractC1474fG.j(inetSocketAddress2, "inetSocketAddress");
                    AbstractC1474fG.j(proxy2, "proxy");
                    break;
                } catch (IOException e2) {
                    e = e2;
                    socket = this.d;
                    if (socket != null) {
                        Mr0.e(socket);
                    }
                    socket2 = this.c;
                    if (socket2 != null) {
                        Mr0.e(socket2);
                    }
                    this.d = null;
                    this.c = null;
                    this.h = null;
                    this.i = null;
                    this.e = null;
                    this.f = null;
                    this.g = null;
                    this.f194o = 1;
                    K80 k83 = this.b;
                    InetSocketAddress inetSocketAddress3 = k83.c;
                    Proxy proxy3 = k83.b;
                    AbstractC1474fG.j(inetSocketAddress3, "inetSocketAddress");
                    AbstractC1474fG.j(proxy3, "proxy");
                    if (m80 == null) {
                        m80 = new M80(e);
                    } else {
                        AbstractC3409z9.a(m80.l, e);
                        m80.m = e;
                    }
                    if (z) {
                        throw m80;
                    }
                    c2867tg.d = true;
                    if (c2867tg.c) {
                        throw m80;
                    }
                    if (!(e instanceof ProtocolException)) {
                        throw m80;
                    }
                    if (!(e instanceof InterruptedIOException)) {
                        throw m80;
                    }
                    if (!(e instanceof SSLHandshakeException)) {
                    }
                    if (!(e instanceof SSLPeerUnverifiedException)) {
                        throw m80;
                    }
                    if (e instanceof SSLException) {
                        throw m80;
                    }
                }
            } catch (IOException e3) {
                e = e3;
            }
        }
        K80 k84 = this.b;
        if (k84.a.c != null && k84.b.type() == Proxy.Type.HTTP && this.c == null) {
            throw new M80(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.q = System.nanoTime();
    }

    public final void e(int i, int i2, A50 a50, C2691rp c2691rp) throws IOException {
        Socket socketCreateSocket;
        K80 k80 = this.b;
        Proxy proxy = k80.b;
        C1159c2 c1159c2 = k80.a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : B50.a[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            socketCreateSocket = c1159c2.b.createSocket();
            AbstractC1474fG.g(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.c = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.b.c;
        c2691rp.getClass();
        AbstractC1474fG.j(a50, "call");
        AbstractC1474fG.j(inetSocketAddress, "inetSocketAddress");
        socketCreateSocket.setSoTimeout(i2);
        try {
            VY vy = VY.a;
            VY.a.e(socketCreateSocket, this.b.c, i);
            try {
                this.h = Nr0.g(Nr0.E(socketCreateSocket));
                this.i = Nr0.f(Nr0.D(socketCreateSocket));
            } catch (NullPointerException e) {
                if (AbstractC1474fG.b(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.b.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, A50 a50, C2691rp c2691rp) throws IOException {
        C1951k70 c1951k70E;
        C0560Kq c0560Kq = new C0560Kq();
        K80 k80 = this.b;
        C2446pE c2446pE = k80.a.i;
        AbstractC1474fG.j(c2446pE, "url");
        c0560Kq.m = c2446pE;
        OV ov = null;
        c0560Kq.m("CONNECT", null);
        C1159c2 c1159c2 = k80.a;
        boolean z = true;
        c0560Kq.j("Host", Mr0.w(c1159c2.i, true));
        c0560Kq.j("Proxy-Connection", "Keep-Alive");
        c0560Kq.j("User-Agent", "okhttp/4.12.0");
        C1951k70 c1951k70C = c0560Kq.c();
        C1661h80 c1661h80 = new C1661h80();
        c1661h80.a = c1951k70C;
        c1661h80.b = O30.HTTP_1_1;
        c1661h80.c = 407;
        c1661h80.d = "Preemptive Authenticate";
        c1661h80.g = Mr0.c;
        c1661h80.k = -1L;
        c1661h80.l = -1L;
        c1661h80.f.q("Proxy-Authenticate", "OkHttp-Preemptive");
        C1951k70 c1951k70E2 = c1159c2.f.e(k80, c1661h80.a());
        if (c1951k70E2 != null) {
            c1951k70C = c1951k70E2;
        }
        C1951k70 c1951k70 = c1951k70C;
        int i4 = 0;
        while (i4 < 21) {
            e(i, i2, a50, c2691rp);
            String str = "CONNECT " + Mr0.w(c1951k70C.a, z) + " HTTP/1.1";
            while (true) {
                C3111w50 c3111w50 = this.h;
                AbstractC1474fG.g(c3111w50);
                C3014v50 c3014v50 = this.i;
                AbstractC1474fG.g(c3014v50);
                HD hd = new HD(ov, this, c3111w50, c3014v50);
                Hj0 hj0C = c3111w50.l.c();
                long j = i2;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                hj0C.g(j, timeUnit);
                c3014v50.l.c().g(i3, timeUnit);
                hd.j(c1951k70.c, str);
                hd.a();
                C1661h80 c1661h80G = hd.g(false);
                AbstractC1474fG.g(c1661h80G);
                c1661h80G.a = c1951k70;
                C1855j80 c1855j80A = c1661h80G.a();
                long jK = Mr0.k(c1855j80A);
                if (jK != -1) {
                    ED edI = hd.i(jK);
                    Mr0.u(edI, Integer.MAX_VALUE, timeUnit);
                    edI.close();
                }
                int i5 = c1855j80A.f840o;
                if (i5 == 200) {
                    if (!c3111w50.m.D() || !c3014v50.m.D()) {
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    c1951k70E = null;
                    break;
                }
                if (i5 != 407) {
                    throw new IOException(AbstractC1674hK.n(i5, "Unexpected response code for CONNECT: "));
                }
                c1951k70E = c1159c2.f.e(k80, c1855j80A);
                if (c1951k70E == null) {
                    throw new IOException("Failed to authenticate with proxy");
                }
                if (AbstractC1899jh0.N("close", c1855j80A.f("Connection", null), true)) {
                    break;
                }
                i2 = i2;
                c1951k70 = c1951k70E;
                ov = null;
            }
            if (c1951k70E == null) {
                return;
            }
            Socket socket = this.c;
            if (socket != null) {
                Mr0.e(socket);
            }
            this.c = null;
            this.i = null;
            this.h = null;
            AbstractC1474fG.j(a50, "call");
            AbstractC1474fG.j(k80.c, "inetSocketAddress");
            AbstractC1474fG.j(k80.b, "proxy");
            i4++;
            c1951k70 = c1951k70E;
            ov = null;
            z = true;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void g(C2867tg c2867tg, int i, A50 a50, C2691rp c2691rp) throws Throwable {
        C1159c2 c1159c2 = this.b.a;
        SSLSocketFactory sSLSocketFactory = c1159c2.c;
        O30 o30K = O30.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = c1159c2.j;
            O30 o30 = O30.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(o30)) {
                this.d = this.c;
                this.f = o30K;
                return;
            } else {
                this.d = this.c;
                this.f = o30;
                m(i);
                return;
            }
        }
        c2691rp.getClass();
        AbstractC1474fG.j(a50, "call");
        C1159c2 c1159c3 = this.b.a;
        SSLSocketFactory sSLSocketFactory2 = c1159c3.c;
        SSLSocket sSLSocket = null;
        String strF = null;
        try {
            AbstractC1474fG.g(sSLSocketFactory2);
            Socket socket = this.c;
            C2446pE c2446pE = c1159c3.i;
            Socket socketCreateSocket = sSLSocketFactory2.createSocket(socket, c2446pE.d, c2446pE.e, true);
            AbstractC1474fG.h(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                C2770sg c2770sgA = c2867tg.a(sSLSocket2);
                if (c2770sgA.b) {
                    VY vy = VY.a;
                    VY.a.d(sSLSocket2, c1159c3.i.d, c1159c3.j);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                AbstractC1474fG.i(session, "sslSocketSession");
                C1469fB c1469fBP = AbstractC2506pt.p(session);
                HostnameVerifier hostnameVerifier = c1159c3.d;
                AbstractC1474fG.g(hostnameVerifier);
                if (hostnameVerifier.verify(c1159c3.i.d, session)) {
                    C3150wc c3150wc = c1159c3.e;
                    AbstractC1474fG.g(c3150wc);
                    this.e = new C1469fB(c1469fBP.a, c1469fBP.b, c1469fBP.c, new C3053vc(c3150wc, c1469fBP, c1159c3, 5));
                    c3150wc.a(c1159c3.i.d, new io.sentry.android.replay.f(17, this));
                    if (c2770sgA.b) {
                        VY vy2 = VY.a;
                        strF = VY.a.f(sSLSocket2);
                    }
                    this.d = sSLSocket2;
                    this.h = Nr0.g(Nr0.E(sSLSocket2));
                    this.i = Nr0.f(Nr0.D(sSLSocket2));
                    if (strF != null) {
                        o30K = Ou0.k(strF);
                    }
                    this.f = o30K;
                    VY vy3 = VY.a;
                    VY.a.a(sSLSocket2);
                    if (this.f == O30.HTTP_2) {
                        m(i);
                        return;
                    }
                    return;
                }
                List listA = c1469fBP.a();
                if (!(!listA.isEmpty())) {
                    throw new SSLPeerUnverifiedException("Hostname " + c1159c3.i.d + " not verified (no certificates)");
                }
                Object obj = listA.get(0);
                AbstractC1474fG.h(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(c1159c3.i.d);
                sb.append(" not verified:\n              |    certificate: ");
                C3150wc c3150wc2 = C3150wc.c;
                sb.append(Ou0.w(x509Certificate));
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                sb.append(AbstractC0911Ye.m0(JV.a(x509Certificate, 7), JV.a(x509Certificate, 2)));
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(AbstractC1216ch0.H(sb.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    VY vy4 = VY.a;
                    VY.a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    Mr0.e(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized void h() {
        this.m++;
    }

    public final boolean i(C1159c2 c1159c2, List list) throws NoSuchAlgorithmException {
        C1469fB c1469fB;
        int i = 0;
        AbstractC1474fG.j(c1159c2, "address");
        byte[] bArr = Mr0.a;
        if (this.p.size() < this.f194o && !this.j) {
            K80 k80 = this.b;
            if (!k80.a.a(c1159c2)) {
                return false;
            }
            C2446pE c2446pE = c1159c2.i;
            String str = c2446pE.d;
            C1159c2 c1159c3 = k80.a;
            if (AbstractC1474fG.b(str, c1159c3.i.d)) {
                return true;
            }
            if (this.g != null && list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    K80 k81 = (K80) it.next();
                    Proxy.Type type = k81.b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && k80.b.type() == type2) {
                        if (AbstractC1474fG.b(k80.c, k81.c)) {
                            if (c1159c2.d == JV.a) {
                                byte[] bArr2 = Mr0.a;
                                C2446pE c2446pE2 = c1159c3.i;
                                if (c2446pE.e != c2446pE2.e) {
                                    break;
                                }
                                String str2 = c2446pE2.d;
                                String str3 = c2446pE.d;
                                if (!AbstractC1474fG.b(str3, str2)) {
                                    if (!this.k && (c1469fB = this.e) != null) {
                                        List listA = c1469fB.a();
                                        if (!(!listA.isEmpty())) {
                                            break;
                                        }
                                        Object obj = listA.get(0);
                                        AbstractC1474fG.h(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                        if (!JV.b(str3, (X509Certificate) obj)) {
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    C3150wc c3150wc = c1159c2.e;
                                    AbstractC1474fG.g(c3150wc);
                                    C1469fB c1469fB2 = this.e;
                                    AbstractC1474fG.g(c1469fB2);
                                    List listA2 = c1469fB2.a();
                                    AbstractC1474fG.j(str3, "hostname");
                                    AbstractC1474fG.j(listA2, "peerCertificates");
                                    c3150wc.a(str3, new C3053vc(c3150wc, listA2, str3, i));
                                    return true;
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean j(boolean z) {
        long j;
        byte[] bArr = Mr0.a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.c;
        AbstractC1474fG.g(socket);
        Socket socket2 = this.d;
        AbstractC1474fG.g(socket2);
        C3111w50 c3111w50 = this.h;
        AbstractC1474fG.g(c3111w50);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        TD td = this.g;
        if (td != null) {
            return td.l(jNanoTime);
        }
        synchronized (this) {
            j = jNanoTime - this.q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !c3111w50.D();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final InterfaceC2695rr k(OV ov, D50 d50) throws SocketException {
        Socket socket = this.d;
        AbstractC1474fG.g(socket);
        C3111w50 c3111w50 = this.h;
        AbstractC1474fG.g(c3111w50);
        C3014v50 c3014v50 = this.i;
        AbstractC1474fG.g(c3014v50);
        TD td = this.g;
        if (td != null) {
            return new UD(ov, this, d50, td);
        }
        int i = d50.g;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c3111w50.l.c().g(i, timeUnit);
        c3014v50.l.c().g(d50.h, timeUnit);
        return new HD(ov, this, c3111w50, c3014v50);
    }

    public final synchronized void l() {
        this.j = true;
    }

    public final void m(int i) throws SocketException {
        Socket socket = this.d;
        AbstractC1474fG.g(socket);
        C3111w50 c3111w50 = this.h;
        AbstractC1474fG.g(c3111w50);
        C3014v50 c3014v50 = this.i;
        AbstractC1474fG.g(c3014v50);
        socket.setSoTimeout(0);
        C3454zi0 c3454zi0 = C3454zi0.i;
        HD hd = new HD(c3454zi0);
        String str = this.b.a.i.d;
        AbstractC1474fG.j(str, "peerName");
        hd.e = socket;
        String str2 = Mr0.g + ' ' + str;
        AbstractC1474fG.j(str2, "<set-?>");
        hd.f = str2;
        hd.a = c3111w50;
        hd.b = c3014v50;
        hd.g = this;
        hd.c = i;
        TD td = new TD(hd);
        this.g = td;
        Nc0 nc0 = TD.M;
        this.f194o = (nc0.a & 16) != 0 ? nc0.b[4] : Integer.MAX_VALUE;
        C1082bE c1082bE = td.J;
        synchronized (c1082bE) {
            try {
                if (c1082bE.p) {
                    throw new IOException("closed");
                }
                if (c1082bE.m) {
                    Logger logger = C1082bE.r;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(Mr0.i(">> CONNECTION " + ID.a.e(), new Object[0]));
                    }
                    c1082bE.l.E(ID.a);
                    c1082bE.l.flush();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        td.J.K(td.C);
        int iA = td.C.a();
        if (iA != 65535) {
            td.J.Q(0, iA - AQ.w);
        }
        c3454zi0.f().c(new C1130bn(td.f530o, td.K, 3), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        K80 k80 = this.b;
        sb.append(k80.a.i.d);
        sb.append(':');
        sb.append(k80.a.i.e);
        sb.append(", proxy=");
        sb.append(k80.b);
        sb.append(" hostAddress=");
        sb.append(k80.c);
        sb.append(" cipherSuite=");
        C1469fB c1469fB = this.e;
        if (c1469fB == null || (obj = c1469fB.b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
