package o;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.Generated;

/* JADX INFO: loaded from: classes.dex */
public final class I70 {

    @Generated
    private static final CL d = DL.d(I70.class);
    public static final String e = "dnsjava.configprovider.skipinit";
    private static I70 f;
    private static List<K70> g;
    private final List<InetSocketAddress> a = new ArrayList(2);
    private final List<C2848tT> b = new ArrayList(0);
    private int c;

    public I70() {
        this.c = 1;
        synchronized (I70.class) {
            try {
                if (g == null) {
                    g = new ArrayList(8);
                    if (!Boolean.getBoolean(e)) {
                        g.add(new N30());
                        g.add(new D70());
                        g.add(new Qw0());
                        g.add(new I2());
                        g.add(new C3418zH());
                        g.add(new Ch0());
                        g.add(new C0562Ks());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (K70 k70 : g) {
            if (k70.isEnabled()) {
                try {
                    k70.a();
                    if (this.a.isEmpty()) {
                        this.a.addAll(k70.c());
                    }
                    if (this.b.isEmpty()) {
                        List<C2848tT> listD = k70.d();
                        if (!listD.isEmpty()) {
                            this.b.addAll(listD);
                            this.c = k70.b();
                        }
                    }
                    if (!this.a.isEmpty() && !this.b.isEmpty()) {
                        return;
                    }
                } catch (HF e2) {
                    d.F("Failed to initialize provider", e2);
                }
            }
        }
        if (this.a.isEmpty()) {
            this.a.add(new InetSocketAddress(InetAddress.getLoopbackAddress(), 53));
        }
    }

    private static void a() {
        if (f == null || g == null) {
            e();
        }
    }

    public static synchronized List<K70> b() {
        a();
        return Collections.unmodifiableList(g);
    }

    public static synchronized I70 c() {
        a();
        return f;
    }

    public static void e() {
        I70 i70 = new I70();
        synchronized (I70.class) {
            f = i70;
        }
    }

    public static synchronized void i(List<K70> list) {
        g = new ArrayList(list);
    }

    public int d() {
        return this.c;
    }

    public List<C2848tT> f() {
        return this.b;
    }

    public InetSocketAddress g() {
        return this.a.get(0);
    }

    public List<InetSocketAddress> h() {
        return this.a;
    }
}
