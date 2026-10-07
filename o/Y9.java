package o;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Y9 implements InterfaceC2784sn {
    public final /* synthetic */ C0349Cn b;

    public Y9(C0349Cn c0349Cn) {
        this.b = c0349Cn;
    }

    @Override // o.InterfaceC2784sn
    public final List a(String str) throws Exception {
        List listY;
        AbstractC1474fG.j(str, "hostname");
        List list = Z9.b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC1119bh0.W(str, (String) it.next(), true)) {
                    return Z9.a;
                }
            }
        }
        try {
            List listA = this.b.a(str);
            if (((ArrayList) listA).isEmpty()) {
                throw new UnknownHostException("DoH returned empty list");
            }
            listA.toString();
            return listA;
        } catch (Exception e) {
            e.getMessage();
            try {
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    AbstractC1474fG.i(allByName, "getAllByName(hostname)");
                    listY = X5.Y(allByName);
                } catch (NullPointerException e2) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                    unknownHostException.initCause(e2);
                    throw unknownHostException;
                }
            } catch (Exception e3) {
                if (!Z9.b(str)) {
                    throw e3;
                }
                listY = Z9.a;
            }
            return listY;
        }
    }
}
