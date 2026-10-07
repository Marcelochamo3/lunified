package o;

import j$.util.Collection$EL;
import j$.util.stream.Collectors;
import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/* JADX INFO: renamed from: o.o8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2341o8 implements K70 {
    private static final boolean d = Boolean.getBoolean("java.net.preferIPv4Stack");
    private static final boolean e = Boolean.getBoolean("java.net.preferIPv6Addresses");
    private final List<InetSocketAddress> a = new ArrayList(3);
    protected final CL b = DL.d(getClass());
    protected final List<C2848tT> c = new ArrayList(1);

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int i(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) {
        return Integer.compare(inetSocketAddress2.getAddress().getAddress().length, inetSocketAddress.getAddress().getAddress().length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean j(InetSocketAddress inetSocketAddress) {
        return inetSocketAddress.getAddress() instanceof Inet4Address;
    }

    @Override // o.K70
    public /* synthetic */ int b() {
        return J70.b(this);
    }

    @Override // o.K70
    public final List<InetSocketAddress> c() {
        if (e) {
            return (List) Collection$EL.stream(this.a).sorted(new C2147m8(0)).collect(Collectors.toList());
        }
        return d ? (List) Collection$EL.stream(this.a).filter(new C2244n8(0)).collect(Collectors.toList()) : Collections.unmodifiableList(this.a);
    }

    @Override // o.K70
    public final List<C2848tT> d() {
        return Collections.unmodifiableList(this.c);
    }

    public void g(InetSocketAddress inetSocketAddress) {
        if (this.a.contains(inetSocketAddress)) {
            return;
        }
        this.a.add(inetSocketAddress);
        this.b.C(inetSocketAddress, "Added {} to nameservers");
    }

    public void h(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            C2848tT c2848tTN = C2848tT.n(str, C2848tT.v);
            if (this.c.contains(c2848tTN)) {
                return;
            }
            this.c.add(c2848tTN);
            this.b.C(c2848tTN, "Added {} to search paths");
        } catch (Ri0 unused) {
            this.b.y(str, "Could not parse search path {} as a dns name, ignoring");
        }
    }

    @Override // o.K70
    public /* synthetic */ boolean isEnabled() {
        return J70.a(this);
    }

    public int k(String str) {
        if (str == null || str.isEmpty()) {
            return 1;
        }
        try {
            int i = Integer.parseInt(str);
            if (i < 0) {
                return 1;
            }
            if (i > 15) {
                return 15;
            }
            return i;
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    public void l(String str, String str2) {
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, str2);
            while (stringTokenizer.hasMoreTokens()) {
                h(stringTokenizer.nextToken());
            }
        }
    }

    public final void m() {
        this.a.clear();
        this.c.clear();
    }
}
