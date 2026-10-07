package o;

import java.net.InetSocketAddress;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Ch0 extends AbstractC2341o8 {
    @Override // o.K70
    public void a() throws HF {
        m();
        try {
            Class<?> cls = Class.forName("sun.net.dns.ResolverConfiguration");
            Object objInvoke = cls.getDeclaredMethod("open", null).invoke(null, null);
            Iterator it = ((List) cls.getMethod("nameservers", null).invoke(objInvoke, null)).iterator();
            while (it.hasNext()) {
                g(new InetSocketAddress((String) it.next(), 53));
            }
            Iterator it2 = ((List) cls.getMethod("searchlist", null).invoke(objInvoke, null)).iterator();
            while (it2.hasNext()) {
                h((String) it2.next());
            }
        } catch (Exception e) {
            throw new HF(e);
        }
    }

    @Override // o.AbstractC2341o8, o.K70
    public boolean isEnabled() {
        return Boolean.getBoolean("dnsjava.configprovider.sunjvm.enabled");
    }
}
