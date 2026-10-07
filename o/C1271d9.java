package o;

import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: renamed from: o.d9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1271d9 implements InterfaceC2784sn {
    public final String b;
    public final List c;

    public C1271d9(String str, List list) {
        AbstractC1474fG.j(str, "dnsHostname");
        this.b = str;
        this.c = list;
    }

    @Override // o.InterfaceC2784sn
    public final List a(String str) throws UnknownHostException {
        AbstractC1474fG.j(str, "hostname");
        String str2 = this.b;
        if (AbstractC1474fG.b(str2, str)) {
            return this.c;
        }
        throw new UnknownHostException("BootstrapDns called for " + str + " instead of " + str2);
    }
}
