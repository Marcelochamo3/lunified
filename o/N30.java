package o;

import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes.dex */
public class N30 extends AbstractC2341o8 {
    public static final String g = "dns.server";
    public static final String h = "dns.search";
    public static final String i = "dns.ndots";
    private int f;

    @Override // o.K70
    public void a() {
        n(g, h, i);
    }

    @Override // o.AbstractC2341o8, o.K70
    public int b() {
        return this.f;
    }

    public void n(String str, String str2, String str3) {
        m();
        String property = System.getProperty(str);
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ",");
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                try {
                    URI uri = new URI("dns://" + strNextToken);
                    int i2 = 53;
                    if (uri.getHost() == null) {
                        g(new InetSocketAddress(strNextToken, 53));
                    } else {
                        int port = uri.getPort();
                        if (port != -1) {
                            i2 = port;
                        }
                        g(new InetSocketAddress(uri.getHost(), i2));
                    }
                } catch (URISyntaxException unused) {
                    this.b.y(strNextToken, "Ignored invalid server {}");
                }
            }
        }
        l(System.getProperty(str2), ",");
        this.f = k(System.getProperty(str3));
    }
}
