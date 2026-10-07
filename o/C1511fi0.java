package o;

import j$.time.Clock;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection$EL;
import j$.util.Objects;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import lombok.Generated;

/* JADX INFO: renamed from: o.fi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1511fi0 {

    @Generated
    private static final CL g = DL.d(C1511fi0.class);
    public static final C2848tT h = C2848tT.k("gss-tsig.");
    public static final C2848tT i;

    @Deprecated
    public static final C2848tT j;
    public static final C2848tT k;
    public static final C2848tT l;
    public static final C2848tT m;
    public static final C2848tT n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2848tT f781o;
    private static final Map<C2848tT, String> p;
    public static final Duration q;
    private final C2848tT a;
    private final Clock b;
    private final C2848tT c;
    private final SecretKey d;
    private final String e;
    private final Mac f;

    /* JADX INFO: renamed from: o.fi0$a */
    public static class a {
        private final C1511fi0 a;
        private final Mac b;
        private final int c;
        private int d;
        private C1609gi0 e;

        public a(C1511fi0 c1511fi0, C1609gi0 c1609gi0) {
            this(c1511fi0, c1609gi0, 1);
        }

        public void a(AQ aq) {
            b(aq, true);
        }

        public void b(AQ aq, boolean z) {
            int i = this.d;
            boolean z2 = i % this.c == 0;
            boolean z3 = i == 0;
            if (z3 || z2 || z) {
                C1609gi0 c1609gi0S = this.a.s(aq, aq.L(), 0, z3 ? this.e : null, z3, this.b);
                aq.b(c1609gi0S, 3);
                aq.u = 3;
                this.e = c1609gi0S;
                C1511fi0.w(this.b, c1609gi0S);
            } else {
                this.b.update(aq.M(AQ.w));
            }
            this.d++;
        }

        public a(C1511fi0 c1511fi0, C1609gi0 c1609gi0, int i) {
            if (i < 1 || i > 100) {
                throw new IllegalArgumentException("signEveryNthMessage must be between 1 and 100");
            }
            this.a = c1511fi0;
            this.e = c1609gi0;
            this.c = i;
            this.b = c1511fi0.x();
        }
    }

    /* JADX INFO: renamed from: o.fi0$b */
    public static class b {
        private final C1511fi0 a;
        private final Mac b;
        private final C1609gi0 c;
        private int d = 0;
        private int e;
        private String f;

        public b(C1511fi0 c1511fi0, C1609gi0 c1609gi0) {
            this.a = c1511fi0;
            this.b = c1511fi0.x();
            this.c = c1609gi0;
        }

        private void a(AQ aq, byte[] bArr, Mac mac) {
            byte[] bArrZ = aq.k().z();
            if (C1511fi0.g.O()) {
                C1511fi0.g.v(Ey0.a("TSIG-HMAC header", bArrZ));
            }
            mac.update(bArrZ);
            int length = bArr.length - bArrZ.length;
            if (C1511fi0.g.O()) {
                C1511fi0.g.v(Ey0.b("TSIG-HMAC message after header", bArr, bArrZ.length, length));
            }
            mac.update(bArr, bArrZ.length, length);
            aq.u = 2;
        }

        @Generated
        public String b() {
            return this.f;
        }

        public int c(AQ aq, byte[] bArr) {
            return d(aq, bArr, false);
        }

        public int d(AQ aq, byte[] bArr, boolean z) {
            C1609gi0 c1609gi0T = aq.t();
            int i = this.d + 1;
            this.d = i;
            if (i == 1) {
                if (c1609gi0T != null) {
                    int iH = this.a.H(aq, bArr, this.c, true, this.b);
                    C1511fi0.w(this.b, c1609gi0T);
                    this.e = this.d;
                    return iH;
                }
                this.f = "missing required signature on first message";
                C1511fi0.g.C(this.f, "FORMERR: {}");
                aq.u = 4;
                return 1;
            }
            if (c1609gi0T != null) {
                int iH2 = this.a.H(aq, bArr, null, false, this.b);
                this.e = this.d;
                C1511fi0.w(this.b, c1609gi0T);
                return iH2;
            }
            if (i - this.e >= 100) {
                this.f = "Missing required signature on message #" + this.d;
                C1511fi0.g.C(this.f, "FORMERR: {}");
                aq.u = 4;
                return 1;
            }
            if (z) {
                this.f = "Missing required signature on last message";
                C1511fi0.g.C(this.f, "FORMERR: {}");
                aq.u = 4;
                return 1;
            }
            this.f = AbstractC1701hf0.g(new StringBuilder("Intermediate message #"), this.d, " without signature");
            C1511fi0.g.C(this.f, "FORMERR: {}");
            a(aq, bArr, this.b);
            return 0;
        }
    }

    static {
        C2848tT c2848tTK = C2848tT.k("HMAC-MD5.SIG-ALG.REG.INT.");
        i = c2848tTK;
        j = c2848tTK;
        C2848tT c2848tTK2 = C2848tT.k("hmac-sha1.");
        k = c2848tTK2;
        C2848tT c2848tTK3 = C2848tT.k("hmac-sha224.");
        l = c2848tTK3;
        C2848tT c2848tTK4 = C2848tT.k("hmac-sha256.");
        m = c2848tTK4;
        C2848tT c2848tTK5 = C2848tT.k("hmac-sha384.");
        n = c2848tTK5;
        C2848tT c2848tTK6 = C2848tT.k("hmac-sha512.");
        f781o = c2848tTK6;
        HashMap map = new HashMap();
        map.put(c2848tTK, "HmacMD5");
        map.put(c2848tTK2, "HmacSHA1");
        map.put(c2848tTK3, "HmacSHA224");
        map.put(c2848tTK4, "HmacSHA256");
        map.put(c2848tTK5, "HmacSHA384");
        map.put(c2848tTK6, "HmacSHA512");
        p = Collections.unmodifiableMap(map);
        q = Duration.ofSeconds(300L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1511fi0(C2848tT c2848tT, C2848tT c2848tT2, String str) {
        byte[] bArrB = Cy0.b(str);
        Objects.requireNonNull(bArrB);
        this(c2848tT, c2848tT2, bArrB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean A(String str, Map.Entry entry) {
        return ((String) entry.getValue()).equalsIgnoreCase(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException B(String str) {
        return new IllegalArgumentException(AbstractC1701hf0.t("Unknown algorithm: ", str));
    }

    @Deprecated
    public static String C(C2848tT c2848tT) {
        String str = p.get(c2848tT);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unknown algorithm: " + c2848tT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int H(AQ aq, byte[] bArr, C1609gi0 c1609gi0, boolean z, Mac mac) {
        aq.u = 4;
        C1609gi0 c1609gi0T = aq.t();
        if (c1609gi0T == null) {
            return 1;
        }
        if (!c1609gi0T.v().equals(this.c) || !c1609gi0T.U().equals(this.a)) {
            g.f("BADKEY failure on message id {}, expected: {}/{}, actual: {}/{}", Integer.valueOf(aq.k().k()), this.c, this.a, c1609gi0T.v(), c1609gi0T.U());
            return 17;
        }
        if (mac == null) {
            mac = x();
        }
        if (c1609gi0 != null && c1609gi0T.V() != 17 && c1609gi0T.V() != 16) {
            w(mac, c1609gi0);
        }
        aq.k().d(3);
        byte[] bArrZ = aq.k().z();
        aq.k().o(3);
        CL cl = g;
        if (cl.O()) {
            cl.v(Ey0.a("TSIG-HMAC header", bArrZ));
        }
        mac.update(bArrZ);
        int length = aq.t - bArrZ.length;
        if (cl.O()) {
            cl.v(Ey0.b("TSIG-HMAC message after header", bArr, bArrZ.length, length));
        }
        mac.update(bArr, bArrZ.length, length);
        mac.update(v(z, c1609gi0T));
        int iJ = J(mac, c1609gi0T.Z());
        if (iJ != 0) {
            return iJ;
        }
        int iK = K(c1609gi0T);
        if (iK != 0) {
            return iK;
        }
        aq.u = 1;
        return 0;
    }

    private static boolean I(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            int length = bArr2.length;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, 0, bArr3, 0, length);
            bArr = bArr3;
        }
        return Arrays.equals(bArr2, bArr);
    }

    private static int J(Mac mac, byte[] bArr) {
        int macLength = mac.getMacLength();
        int iMax = Math.max(10, macLength / 2);
        if (bArr.length > macLength) {
            g.R(Integer.valueOf(macLength), Integer.valueOf(bArr.length), "BADSIG: signature too long, expected: {}, actual: {}");
            return 16;
        }
        if (bArr.length < iMax) {
            g.f("BADSIG: signature too short, expected: {} of {}, actual: {}", Integer.valueOf(iMax), Integer.valueOf(macLength), Integer.valueOf(bArr.length));
            return 16;
        }
        byte[] bArrDoFinal = mac.doFinal();
        if (I(bArrDoFinal, bArr)) {
            return 0;
        }
        CL cl = g;
        if (cl.j()) {
            cl.R(Cy0.c(bArrDoFinal), Cy0.c(bArr), "BADSIG: signature verification failed, expected: {}, actual: {}");
        }
        return 16;
    }

    private int K(C1609gi0 c1609gi0) {
        Instant instant = this.b.instant();
        if (Duration.between(instant, c1609gi0.a0()).abs().compareTo(c1609gi0.W()) <= 0) {
            return 0;
        }
        g.f("BADTIME failure, now {} +/- tsig {} > fudge {}", instant, c1609gi0.a0(), c1609gi0.W());
        return 18;
    }

    private static void L(Instant instant, C0578Li c0578Li) {
        long epochSecond = instant.getEpochSecond();
        c0578Li.l((int) (epochSecond >> 32));
        c0578Li.n(epochSecond & 4294967295L);
    }

    private static void M(Instant instant, Duration duration, C0578Li c0578Li) {
        L(instant, c0578Li);
        c0578Li.l((int) duration.getSeconds());
    }

    public static C2848tT j(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Null algorithm");
        }
        if (str.equalsIgnoreCase("HMAC-MD5") || str.equalsIgnoreCase("HMAC-MD5.")) {
            return i;
        }
        int i2 = 1;
        return (C2848tT) Collection$EL.stream(p.keySet()).filter(new C1316di0(str, i2)).findAny().orElseGet(new C1413ei0(str, i2));
    }

    @Deprecated
    public static C1511fi0 p(String str) {
        String[] strArrSplit = str.split("[:/]", 3);
        int length = strArrSplit.length;
        if (length == 2) {
            return new C1511fi0(i, strArrSplit[0], strArrSplit[1]);
        }
        if (length == 3) {
            return new C1511fi0(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
        }
        throw new IllegalArgumentException("Invalid TSIG key specification");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C1609gi0 s(AQ aq, byte[] bArr, int i2, C1609gi0 c1609gi0, boolean z, Mac mac) {
        byte[] bArrDoFinal;
        byte[] bArrG;
        Instant instantT = t(i2, c1609gi0);
        Duration durationU = u();
        boolean z2 = mac != null;
        if (c1609gi0 != null && z2) {
            w(mac, c1609gi0);
        }
        if (z2) {
            CL cl = g;
            if (cl.O()) {
                cl.v(Ey0.a("TSIG-HMAC rendered message", bArr));
            }
            mac.update(bArr);
        }
        C0578Li c0578Li = new C0578Li();
        if (z) {
            this.c.D(c0578Li);
            c0578Li.l(255);
            c0578Li.n(0L);
            this.a.D(c0578Li);
        }
        M(instantT, durationU, c0578Li);
        if (z) {
            c0578Li.l(i2);
            c0578Li.l(0);
        }
        if (z2) {
            byte[] bArrG2 = c0578Li.g();
            CL cl2 = g;
            if (cl2.O()) {
                cl2.v(Ey0.a("TSIG-HMAC variables", bArrG2));
            }
            bArrDoFinal = mac.doFinal(bArrG2);
        } else {
            bArrDoFinal = new byte[0];
        }
        byte[] bArr2 = bArrDoFinal;
        if (i2 == 18) {
            C0578Li c0578Li2 = new C0578Li(6);
            L(this.b.instant(), c0578Li2);
            bArrG = c0578Li2.g();
        } else {
            bArrG = null;
        }
        return new C1609gi0(this.c, 255, 0L, this.a, instantT, durationU, bArr2, aq.k().k(), i2, bArrG);
    }

    private Instant t(int i2, C1609gi0 c1609gi0) {
        return i2 == 18 ? c1609gi0.a0() : this.b.instant();
    }

    private static Duration u() {
        int iC = EW.c("tsigfudge");
        return (iC < 0 || iC > 32767) ? q : Duration.ofSeconds(iC);
    }

    private static byte[] v(boolean z, C1609gi0 c1609gi0) {
        C0578Li c0578Li = new C0578Li();
        if (z) {
            c1609gi0.v().D(c0578Li);
            c0578Li.l(c1609gi0.n);
            c0578Li.n(c1609gi0.f295o);
            c1609gi0.U().D(c0578Li);
        }
        M(c1609gi0.a0(), c1609gi0.W(), c0578Li);
        if (z) {
            c0578Li.l(c1609gi0.V());
            if (c1609gi0.Y() != null) {
                c0578Li.l(c1609gi0.Y().length);
                c0578Li.i(c1609gi0.Y());
            } else {
                c0578Li.l(0);
            }
        }
        byte[] bArrG = c0578Li.g();
        CL cl = g;
        if (cl.O()) {
            cl.v(Ey0.a("TSIG-HMAC variables", bArrG));
        }
        return bArrG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void w(Mac mac, C1609gi0 c1609gi0) {
        byte[] bArrH = C0578Li.h(c1609gi0.Z().length);
        CL cl = g;
        if (cl.O()) {
            cl.v(Ey0.a("TSIG-HMAC signature size", bArrH));
            cl.v(Ey0.a("TSIG-HMAC signature", c1609gi0.Z()));
        }
        mac.update(bArrH);
        mac.update(c1609gi0.Z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Mac x() {
        Mac mac = this.f;
        if (mac != null) {
            try {
                return (Mac) mac.clone();
            } catch (CloneNotSupportedException unused) {
                this.f.reset();
                return this.f;
            }
        }
        try {
            Mac mac2 = Mac.getInstance(this.e);
            mac2.init(this.d);
            return mac2;
        } catch (GeneralSecurityException e) {
            throw new IllegalArgumentException("Caught security exception setting up HMAC.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean y(String str, C2848tT c2848tT) {
        return c2848tT.toString().equalsIgnoreCase(str) || c2848tT.z(true).equalsIgnoreCase(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C2848tT z(String str) {
        return (C2848tT) Collection$EL.stream(p.entrySet()).filter(new C1316di0(str, 0)).map(new C2504ps(15)).findAny().orElseThrow(new C1413ei0(str, 0));
    }

    public int D() {
        return this.a.t() + this.c.t() + 10 + 38;
    }

    @Deprecated
    public byte E(AQ aq, byte[] bArr, int i2, C1609gi0 c1609gi0) {
        return (byte) F(aq, bArr, c1609gi0);
    }

    public int F(AQ aq, byte[] bArr, C1609gi0 c1609gi0) {
        return G(aq, bArr, c1609gi0, true);
    }

    public int G(AQ aq, byte[] bArr, C1609gi0 c1609gi0, boolean z) {
        return H(aq, bArr, c1609gi0, z, null);
    }

    public void k(AQ aq, int i2, C1609gi0 c1609gi0) {
        l(aq, i2, c1609gi0, true);
    }

    public void l(AQ aq, int i2, C1609gi0 c1609gi0, boolean z) {
        aq.b(r(aq, aq.L(), i2, c1609gi0, z), 3);
        aq.u = 3;
    }

    public void m(AQ aq, C1609gi0 c1609gi0) {
        l(aq, 0, c1609gi0, true);
    }

    public void n(AQ aq, C1609gi0 c1609gi0, boolean z) {
        l(aq, 0, c1609gi0, z);
    }

    @Deprecated
    public void o(AQ aq, C1609gi0 c1609gi0, boolean z) {
        l(aq, 0, c1609gi0, z);
    }

    public C1609gi0 q(AQ aq, byte[] bArr, int i2, C1609gi0 c1609gi0) {
        return r(aq, bArr, i2, c1609gi0, true);
    }

    public C1609gi0 r(AQ aq, byte[] bArr, int i2, C1609gi0 c1609gi0, boolean z) {
        return s(aq, bArr, i2, c1609gi0, z, (i2 == 0 || i2 == 18 || i2 == 22) ? x() : null);
    }

    public C1511fi0(C2848tT c2848tT, C2848tT c2848tT2, byte[] bArr) {
        this(c2848tT, c2848tT2, new SecretKeySpec(bArr, C(c2848tT)));
    }

    public C1511fi0(C2848tT c2848tT, C2848tT c2848tT2, SecretKey secretKey) {
        this(c2848tT, c2848tT2, secretKey, Clock.systemUTC());
    }

    public C1511fi0(C2848tT c2848tT, C2848tT c2848tT2, SecretKey secretKey, Clock clock) {
        this.c = c2848tT2;
        this.a = c2848tT;
        this.b = clock;
        this.e = C(c2848tT);
        this.d = secretKey;
        this.f = null;
    }

    @Deprecated
    public C1511fi0(Mac mac, C2848tT c2848tT) {
        this.c = c2848tT;
        this.f = mac;
        this.e = null;
        this.d = null;
        this.b = Clock.systemUTC();
        this.a = j(mac.getAlgorithm());
    }

    @Deprecated
    public C1511fi0(C2848tT c2848tT, byte[] bArr) {
        this(i, c2848tT, bArr);
    }

    public C1511fi0(C2848tT c2848tT, String str, String str2) {
        byte[] bArrB = Cy0.b(str2);
        if (bArrB != null) {
            try {
                this.c = C2848tT.n(str, C2848tT.v);
                this.a = c2848tT;
                this.b = Clock.systemUTC();
                String strC = C(c2848tT);
                this.e = strC;
                this.f = null;
                this.d = new SecretKeySpec(bArrB, strC);
                return;
            } catch (Ri0 unused) {
                throw new IllegalArgumentException("Invalid TSIG key name");
            }
        }
        throw new IllegalArgumentException("Invalid TSIG key string");
    }

    public C1511fi0(String str, String str2, String str3) {
        this(j(str), str2, str3);
    }

    @Deprecated
    public C1511fi0(String str, String str2) {
        this(i, str, str2);
    }
}
