package o;

import sun.net.spi.nameservice.NameService;
import sun.net.spi.nameservice.NameServiceDescriptor;

/* JADX INFO: renamed from: o.Ji, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0526Ji implements NameServiceDescriptor {
    public NameService a() {
        return new C0500Ii();
    }

    public String b() {
        return "dnsjava";
    }

    public String c() {
        return "dns";
    }
}
