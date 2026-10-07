package o;

import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.StringTokenizer;
import lombok.Generated;
import sun.net.spi.nameservice.NameService;

/* JADX INFO: renamed from: o.Ii, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0500Ii implements NameService {

    @Generated
    private static final CL f = DL.d(C0500Ii.class);
    private static final String g = "sun.net.spi.nameservice.nameservers";
    private static final String h = "sun.net.spi.nameservice.domain";
    private static final String i = "java.net.preferIPv6Addresses";
    private boolean a;
    private C2848tT b;
    private InetAddress[] c;
    private InetAddress[] d;
    private boolean e;

    public C0500Ii() {
        this.a = false;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = false;
        String property = System.getProperty(g);
        String property2 = System.getProperty(h);
        String property3 = System.getProperty(i);
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ",");
            String[] strArr = new String[stringTokenizer.countTokens()];
            int i2 = 0;
            while (stringTokenizer.hasMoreTokens()) {
                strArr[i2] = stringTokenizer.nextToken();
                i2++;
            }
            try {
                C1578gM.B(new C3085vs(strArr));
            } catch (UnknownHostException unused) {
                f.n(g);
            }
        }
        if (property2 != null) {
            try {
                C1578gM.D(property2);
            } catch (Ri0 unused2) {
                f.n(h);
            }
        }
        if (property3 != null && property3.equalsIgnoreCase("true")) {
            this.a = true;
        }
        try {
            Method declaredMethod = Class.forName("java.net.InetAddressImplFactory").getDeclaredMethod("create", null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            Class<?> cls = Class.forName("java.net.InetAddressImpl");
            Method method = cls.getMethod("getLocalHostName", null);
            method.setAccessible(true);
            this.b = C2848tT.m((String) method.invoke(objInvoke, null));
            Method method2 = cls.getMethod("lookupAllHostAddr", String.class);
            method2.setAccessible(true);
            this.c = (InetAddress[]) method2.invoke(objInvoke, this.b.toString());
            this.d = (InetAddress[]) method2.invoke(objInvoke, "localhost");
            this.e = true;
        } catch (Exception e) {
            f.I("Could not obtain localhost", e);
        }
    }

    public String a(byte[] bArr) throws UnknownHostException {
        C2848tT c2848tTC = C3020v80.c(InetAddress.getByAddress(bArr));
        H50[] h50ArrU = new C1578gM(c2848tTC, 12).u();
        if (h50ArrU != null) {
            return ((RW) h50ArrU[0]).V().toString();
        }
        throw new UnknownHostException("Unknown address: " + c2848tTC);
    }

    public InetAddress[] b(String str) throws UnknownHostException {
        try {
            C2848tT c2848tT = new C2848tT(str);
            if (this.e) {
                if (c2848tT.equals(this.b)) {
                    return this.c;
                }
                if ("localhost".equalsIgnoreCase(str)) {
                    return this.d;
                }
            }
            H50[] h50ArrU = this.a ? new C1578gM(c2848tT, 28).u() : null;
            if (h50ArrU == null) {
                h50ArrU = new C1578gM(c2848tT, 1).u();
            }
            if (h50ArrU == null && !this.a) {
                h50ArrU = new C1578gM(c2848tT, 28).u();
            }
            if (h50ArrU == null) {
                throw new UnknownHostException(str);
            }
            InetAddress[] inetAddressArr = new InetAddress[h50ArrU.length];
            for (int i2 = 0; i2 < h50ArrU.length; i2++) {
                H50 h50 = h50ArrU[i2];
                if (h50 instanceof C1837j) {
                    inetAddressArr[i2] = ((C1837j) h50).V();
                } else {
                    inetAddressArr[i2] = ((C1545g) h50).U();
                }
            }
            return inetAddressArr;
        } catch (Ri0 unused) {
            throw new UnknownHostException(str);
        }
    }
}
