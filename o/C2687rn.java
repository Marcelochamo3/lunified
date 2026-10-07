package o;

import j$.util.concurrent.ConcurrentHashMap;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o.rn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2687rn implements InterfaceC2784sn {
    public final /* synthetic */ int b;

    public /* synthetic */ C2687rn(int i) {
        this.b = i;
    }

    @Override // o.InterfaceC2784sn
    public final List a(String str) throws UnknownHostException {
        int i = this.b;
        AbstractC1474fG.j(str, "hostname");
        switch (i) {
            case 0:
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    AbstractC1474fG.i(allByName, "getAllByName(hostname)");
                    return X5.Y(allByName);
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            case 1:
                ConcurrentHashMap concurrentHashMap = C0323Bn.a;
                return C0323Bn.g(str, false);
            default:
                ConcurrentHashMap concurrentHashMap2 = C0323Bn.a;
                List listG = C0323Bn.g(str, true);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listG) {
                    InetAddress inetAddress = (InetAddress) obj;
                    C3084vr0 c3084vr0 = C3084vr0.a;
                    if (!inetAddress.isAnyLocalAddress() && !inetAddress.isLoopbackAddress()) {
                        arrayList.add(obj);
                    }
                }
                if (true ^ arrayList.isEmpty()) {
                    return arrayList;
                }
                throw new UnknownHostException(AbstractC1701hf0.u("No se pudo resolver ", str, " para iniciar el túnel"));
        }
    }
}
