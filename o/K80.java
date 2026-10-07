package o;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes.dex */
public final class K80 {
    public final C1159c2 a;
    public final Proxy b;
    public final InetSocketAddress c;

    public K80(C1159c2 c1159c2, Proxy proxy, InetSocketAddress inetSocketAddress) {
        AbstractC1474fG.j(c1159c2, "address");
        AbstractC1474fG.j(inetSocketAddress, "socketAddress");
        this.a = c1159c2;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof K80) {
            K80 k80 = (K80) obj;
            if (AbstractC1474fG.b(k80.a, this.a) && AbstractC1474fG.b(k80.b, this.b) && AbstractC1474fG.b(k80.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.c + '}';
    }
}
