package o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Iterator;
import lombok.Generated;

/* JADX INFO: loaded from: classes.dex */
public class I2 extends AbstractC2341o8 {

    @Generated
    private static final CL f = DL.d(I2.class);
    private static Context g = null;

    public static void n(Context context) {
        g = context;
    }

    @Override // o.K70
    public void a() throws HF {
        LinkProperties linkProperties;
        m();
        Context context = g;
        if (context == null) {
            throw new HF("Context must be initialized by calling setContext");
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) == null) {
            return;
        }
        Iterator<InetAddress> it = linkProperties.getDnsServers().iterator();
        while (it.hasNext()) {
            g(new InetSocketAddress(it.next(), 53));
        }
        l(linkProperties.getDomains(), ",");
    }

    @Override // o.AbstractC2341o8, o.K70
    public boolean isEnabled() {
        return System.getProperty("java.vendor").contains("Android");
    }
}
