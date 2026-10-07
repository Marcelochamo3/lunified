package o;

import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Hashtable;
import java.util.List;
import java.util.StringTokenizer;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import lombok.Generated;

/* JADX INFO: renamed from: o.zH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3418zH implements K70 {

    @Generated
    private static final CL b = DL.d(C3418zH.class);
    private b a;

    /* JADX INFO: renamed from: o.zH$b */
    public static final class b extends AbstractC2341o8 {

        @Generated
        private static final CL f;

        static {
            CL clD = DL.d(b.class);
            f = clD;
            clD.C(DirContext.class.getName(), "JNDI class: {}");
        }

        private b() {
        }

        @Override // o.K70
        public void a() {
            String str;
            m();
            Hashtable hashtable = new Hashtable();
            hashtable.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
            hashtable.put("java.naming.provider.url", "dns://");
            String str2 = null;
            try {
                InitialDirContext initialDirContext = new InitialDirContext(hashtable);
                str = (String) initialDirContext.getEnvironment().get("java.naming.provider.url");
                try {
                    initialDirContext.close();
                } catch (NamingException unused) {
                    str2 = str;
                    str = str2;
                }
            } catch (NamingException unused2) {
            }
            if (str != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
                while (stringTokenizer.hasMoreTokens()) {
                    String strNextToken = stringTokenizer.nextToken();
                    try {
                        URI uri = new URI(strNextToken);
                        String host = uri.getHost();
                        if (host != null && !host.isEmpty()) {
                            int port = uri.getPort();
                            if (port == -1) {
                                port = 53;
                            }
                            g(new InetSocketAddress(host, port));
                        }
                    } catch (URISyntaxException e) {
                        f.R(strNextToken, e, "Could not parse {} as a dns server, ignoring");
                    }
                }
            }
        }
    }

    public C3418zH() {
        if (System.getProperty("java.vendor").contains("Android")) {
            return;
        }
        try {
            this.a = new b();
        } catch (NoClassDefFoundError unused) {
            b.M("JNDI DNS not available");
        }
    }

    @Override // o.K70
    public void a() {
        this.a.a();
    }

    @Override // o.K70
    public final /* synthetic */ int b() {
        return J70.b(this);
    }

    @Override // o.K70
    public List<InetSocketAddress> c() {
        return this.a.c();
    }

    @Override // o.K70
    public List<C2848tT> d() {
        return this.a.d();
    }

    @Override // o.K70
    public boolean isEnabled() {
        return this.a != null;
    }
}
