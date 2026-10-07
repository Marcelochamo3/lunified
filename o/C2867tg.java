package o;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: o.tg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2867tg {
    public final List a;
    public int b;
    public boolean c;
    public boolean d;

    public C2867tg(List list) {
        AbstractC1474fG.j(list, "connectionSpecs");
        this.a = list;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.Serializable, java.lang.String[]] */
    public final C2770sg a(SSLSocket sSLSocket) throws UnknownServiceException {
        C2770sg c2770sg;
        int i;
        boolean z;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i2 = this.b;
        List list = this.a;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                c2770sg = null;
                break;
            }
            c2770sg = (C2770sg) list.get(i2);
            if (c2770sg.b(sSLSocket)) {
                this.b = i2 + 1;
                break;
            }
            i2++;
        }
        if (c2770sg == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.d);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            AbstractC1474fG.g(enabledProtocols2);
            String string = Arrays.toString(enabledProtocols2);
            AbstractC1474fG.i(string, "toString(this)");
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        int i3 = this.b;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i3 >= size2) {
                z = false;
                break;
            }
            if (((C2770sg) list.get(i3)).b(sSLSocket)) {
                z = true;
                break;
            }
            i3++;
        }
        this.c = z;
        boolean z2 = this.d;
        String[] strArr = c2770sg.c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            AbstractC1474fG.i(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = Mr0.p(enabledCipherSuites2, strArr, C0676Pd.c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        ?? r6 = c2770sg.d;
        if (r6 != 0) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            AbstractC1474fG.i(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = Mr0.p(enabledProtocols3, r6, C3236xT.m);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        AbstractC1474fG.i(supportedCipherSuites, "supportedCipherSuites");
        N2 n2 = C0676Pd.c;
        byte[] bArr = Mr0.a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (n2.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z2 && i != -1) {
            AbstractC1474fG.i(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i];
            AbstractC1474fG.i(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] objArrCopyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            AbstractC1474fG.i(objArrCopyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) objArrCopyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        C2673rg c2673rg = new C2673rg();
        c2673rg.a = c2770sg.a;
        c2673rg.c = strArr;
        c2673rg.d = r6;
        c2673rg.b = c2770sg.b;
        AbstractC1474fG.i(enabledCipherSuites, "cipherSuitesIntersection");
        c2673rg.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        AbstractC1474fG.i(enabledProtocols, "tlsVersionsIntersection");
        c2673rg.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        C2770sg c2770sgA = c2673rg.a();
        if (c2770sgA.c() != null) {
            sSLSocket.setEnabledProtocols(c2770sgA.d);
        }
        if (c2770sgA.a() != null) {
            sSLSocket.setEnabledCipherSuites(c2770sgA.c);
        }
        return c2770sg;
    }
}
