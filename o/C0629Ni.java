package o;

import j$.time.Instant;
import j$.util.Collection$EL;
import j$.util.DateRetargetClass;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Date;
import java.util.function.Consumer;

/* JADX INFO: renamed from: o.Ni, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0629Ni {
    private static final d a = new d(32, "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD97", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD94", "A6", "1", "8D91E471E0989CDA27DF505A453F2B7635294F2DDF23E3B122ACC99C9E9F1E14", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF6C611070995AD10045841B09B761B893");
    private static final d b = new d(32, "FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF", "FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC", "5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B", "6B17D1F2E12C4247F8BCE6E563A440F277037D812DEB33A0F4A13945D898C296", "4FE342E2FE1A7F9B8EE7EB4A7C0F9E162BCE33576B315ECECBB6406837BF51F5", "FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551");
    private static final d c = new d(48, "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC", "B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF", "AA87CA22BE8B05378EB1C71EF320AD746E1D3B628BA79B9859F741E082542A385502F25DBF55296C3A545E3872760AB7", "3617DE4A96262C6F5D9E98BF9292DC29F8F41DBD289A147CE9DA3113B5F0B8C00A60B1CE1D7E819D7A431D7C90EA0E5F", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973");
    static final int d = 48;
    static final int e = 2;
    static final int f = 3;
    static final int g = 6;
    private static final int h = 20;

    /* JADX INFO: renamed from: o.Ni$a */
    public static class a {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 5;
        public static final int f = 6;
        public static final int g = 7;
        public static final int h = 8;
        public static final int i = 10;
        public static final int j = 12;
        public static final int k = 13;
        public static final int l = 14;
        public static final int m = 15;
        public static final int n = 16;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f416o = 252;
        public static final int p = 253;
        public static final int q = 254;
        private static final MQ r;

        static {
            MQ mq = new MQ("DNSSEC algorithm", 2);
            r = mq;
            mq.m(255);
            mq.n(true);
            mq.b(0, "DELETE");
            mq.b(1, "RSAMD5");
            mq.b(2, "DH");
            mq.b(3, "DSA");
            mq.b(5, "RSASHA1");
            mq.b(6, "DSA-NSEC3-SHA1");
            mq.b(7, "RSA-NSEC3-SHA1");
            mq.b(8, "RSASHA256");
            mq.b(10, "RSASHA512");
            mq.b(12, "ECC-GOST");
            mq.b(13, "ECDSAP256SHA256");
            mq.b(14, "ECDSAP384SHA384");
            mq.b(15, "ED25519");
            mq.b(16, "ED448");
            mq.b(252, "INDIRECT");
            mq.b(253, "PRIVATEDNS");
            mq.b(254, "PRIVATEOID");
        }

        private a() {
        }

        public static String a(int i2) {
            return r.f(i2);
        }

        public static int b(String str) {
            return r.g(str);
        }
    }

    /* JADX INFO: renamed from: o.Ni$b */
    public static class b extends Exception {
        public b(String str, Throwable th) {
            super(str, th);
        }

        public b(Throwable th) {
            super(th);
        }

        public b(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: o.Ni$c */
    public static class c {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        private static final MQ e;

        static {
            MQ mq = new MQ("DNSSEC Digest Algorithm", 2);
            e = mq;
            mq.m(255);
            mq.n(true);
            mq.b(1, "SHA-1");
            mq.b(2, "SHA-256");
            mq.b(3, "GOST R 34.11-94");
            mq.b(4, "SHA-384");
        }

        private c() {
        }

        public static String a(int i) {
            return e.f(i);
        }

        public static int b(String str) {
            return e.g(str);
        }
    }

    /* JADX INFO: renamed from: o.Ni$d */
    public static class d {
        int a;
        EllipticCurve b;
        ECParameterSpec c;

        public d(int i, String str, String str2, String str3, String str4, String str5, String str6) {
            this.a = i;
            BigInteger bigInteger = new BigInteger(str, 16);
            BigInteger bigInteger2 = new BigInteger(str2, 16);
            BigInteger bigInteger3 = new BigInteger(str3, 16);
            BigInteger bigInteger4 = new BigInteger(str4, 16);
            BigInteger bigInteger5 = new BigInteger(str5, 16);
            BigInteger bigInteger6 = new BigInteger(str6, 16);
            this.b = new EllipticCurve(new ECFieldFp(bigInteger), bigInteger2, bigInteger3);
            this.c = new ECParameterSpec(this.b, new ECPoint(bigInteger4, bigInteger5), bigInteger6, 1);
        }
    }

    /* JADX INFO: renamed from: o.Ni$e */
    public static class e extends IllegalArgumentException {
        public e() {
            super("incompatible keys");
        }
    }

    /* JADX INFO: renamed from: o.Ni$f */
    public static class f extends b {
        public f(AbstractC1574gI abstractC1574gI, AbstractC1077b90 abstractC1077b90) {
            super("key " + abstractC1574gI.v() + "/" + a.a(abstractC1574gI.U()) + "/" + abstractC1574gI.W() + " does not match signature " + abstractC1077b90.a0() + "/" + a.a(abstractC1077b90.U()) + "/" + abstractC1077b90.W());
        }
    }

    /* JADX INFO: renamed from: o.Ni$g */
    public static class g extends b {
        public g(String str) {
            super(str);
        }

        public g(H50 h50, Throwable th) {
            super("Invalid key data: " + h50.F(), th);
        }
    }

    /* JADX INFO: renamed from: o.Ni$h */
    public static class h extends b {
        public h() {
            super("no signature found");
        }
    }

    /* JADX INFO: renamed from: o.Ni$i */
    public static class i extends b {
        private final Instant l;
        private final Instant m;

        public i(Instant instant, Instant instant2) {
            super("signature expired");
            this.l = instant;
            this.m = instant2;
        }

        public Instant a() {
            return this.l;
        }

        public Instant b() {
            return this.m;
        }
    }

    /* JADX INFO: renamed from: o.Ni$j */
    public static class j extends b {
        private final Instant l;
        private final Instant m;

        public j(Instant instant, Instant instant2) {
            super("signature is not yet valid");
            this.l = instant;
            this.m = instant2;
        }

        public Instant a() {
            return this.l;
        }

        public Instant b() {
            return this.m;
        }
    }

    /* JADX INFO: renamed from: o.Ni$k */
    public static class k extends b {
        public k() {
            super("signature verification failed");
        }
    }

    /* JADX INFO: renamed from: o.Ni$l */
    public static class l extends b {
        public l(int i) {
            super(AbstractC1674hK.n(i, "Unsupported algorithm: "));
        }
    }

    private C0629Ni() {
    }

    @Deprecated
    public static W40 A(X40 x40, C0552Ki c0552Ki, PrivateKey privateKey, Date date, Date date2) {
        return z(x40, c0552Ki, privateKey, DateRetargetClass.toInstant(date), DateRetargetClass.toInstant(date2), null);
    }

    @Deprecated
    public static W40 B(X40 x40, C0552Ki c0552Ki, PrivateKey privateKey, Date date, Date date2, String str) {
        return z(x40, c0552Ki, privateKey, DateRetargetClass.toInstant(date), DateRetargetClass.toInstant(date2), str);
    }

    public static byte[] C(PrivateKey privateKey, PublicKey publicKey, int i2, byte[] bArr, String str) throws b {
        try {
            Signature signature = str != null ? Signature.getInstance(b(i2), str) : Signature.getInstance(b(i2));
            signature.initSign(privateKey);
            signature.update(bArr);
            byte[] bArrSign = signature.sign();
            if (publicKey instanceof DSAPublicKey) {
                try {
                    return j(bArrSign, 20, (d(((DSAPublicKey) publicKey).getParams().getP()) - 64) / 8);
                } catch (IOException e2) {
                    throw new IllegalStateException(e2);
                }
            }
            if (!(publicKey instanceof ECPublicKey)) {
                return bArrSign;
            }
            try {
                switch (i2) {
                    case 12:
                        return bArrSign;
                    case 13:
                        return j(bArrSign, b.a, -1);
                    case 14:
                        return j(bArrSign, c.a, -1);
                    default:
                        throw new l(i2);
                }
            } catch (IOException e3) {
                throw new IllegalStateException(e3);
            }
        } catch (GeneralSecurityException e4) {
            throw new b(e4);
        }
    }

    public static C1174c90 D(AQ aq, C1174c90 c1174c90, C1672hI c1672hI, PrivateKey privateKey, Instant instant, Instant instant2) throws l {
        int iU = c1672hI.U();
        e(privateKey, iU);
        C1174c90 c1174c91 = new C1174c90(C2848tT.v, 255, 0L, 0, iU, 0L, instant2, instant, c1672hI.W(), c1672hI.v(), (byte[]) null);
        C0578Li c0578Li = new C0578Li();
        h(c0578Li, c1174c91);
        if (c1174c90 != null) {
            c0578Li.i(c1174c90.Z());
        }
        c0578Li.i(aq.L());
        c1174c91.d0(C(privateKey, c1672hI.Z(), iU, c0578Li.g(), null));
        return c1174c91;
    }

    private static PublicKey E(byte[] bArr) throws g, Rw0 {
        C0474Hi c0474Hi = new C0474Hi(bArr);
        int iJ = c0474Hi.j();
        if (iJ > 8) {
            throw new g("t is too large");
        }
        BigInteger bigIntegerV = v(c0474Hi, 20);
        int i2 = (iJ * 8) + 64;
        BigInteger bigIntegerV2 = v(c0474Hi, i2);
        BigInteger bigIntegerV3 = v(c0474Hi, i2);
        return KeyFactory.getInstance("DSA").generatePublic(new DSAPublicKeySpec(v(c0474Hi, i2), bigIntegerV2, bigIntegerV, bigIntegerV3));
    }

    private static PublicKey F(byte[] bArr, d dVar) {
        C0474Hi c0474Hi = new C0474Hi(bArr);
        return KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(v(c0474Hi, dVar.a), v(c0474Hi, dVar.a)), dVar.c));
    }

    private static PublicKey G(byte[] bArr, d dVar) {
        C0474Hi c0474Hi = new C0474Hi(bArr);
        return KeyFactory.getInstance("ECGOST3410").generatePublic(new ECPublicKeySpec(new ECPoint(w(c0474Hi, dVar.a), w(c0474Hi, dVar.a)), dVar.c));
    }

    private static PublicKey H(byte[] bArr, byte b2) {
        byte[] bArr2 = new byte[bArr.length + 12];
        bArr2[0] = 48;
        bArr2[1] = (byte) (bArr.length + 10);
        bArr2[2] = 48;
        bArr2[3] = 5;
        bArr2[4] = 6;
        bArr2[5] = 3;
        bArr2[6] = 43;
        bArr2[7] = 101;
        bArr2[8] = b2;
        bArr2[9] = 3;
        bArr2[10] = (byte) (bArr.length + 1);
        System.arraycopy(bArr, 0, bArr2, 12, bArr.length);
        return KeyFactory.getInstance("EdDSA").generatePublic(new X509EncodedKeySpec(bArr2));
    }

    public static PublicKey I(int i2, byte[] bArr, H50 h50) throws b {
        try {
            switch (i2) {
                case 1:
                case 5:
                case 7:
                case 8:
                case 10:
                    return K(bArr);
                case 2:
                case 4:
                case 9:
                case 11:
                default:
                    throw new l(i2);
                case 3:
                case 6:
                    return E(bArr);
                case 12:
                    return G(bArr, a);
                case 13:
                    return F(bArr, b);
                case 14:
                    return F(bArr, c);
                case 15:
                    return H(bArr, (byte) 112);
                case 16:
                    return H(bArr, (byte) 113);
            }
        } catch (IOException e2) {
            throw new g(h50, e2);
        } catch (GeneralSecurityException e3) {
            throw new b(e3);
        }
    }

    public static PublicKey J(AbstractC1574gI abstractC1574gI) {
        return I(abstractC1574gI.U(), abstractC1574gI.X(), abstractC1574gI);
    }

    private static PublicKey K(byte[] bArr) throws Rw0 {
        C0474Hi c0474Hi = new C0474Hi(bArr);
        int iJ = c0474Hi.j();
        if (iJ == 0) {
            iJ = c0474Hi.h();
        }
        BigInteger bigIntegerV = v(c0474Hi, iJ);
        return KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(u(c0474Hi), bigIntegerV));
    }

    private static void L(int i2, C0474Hi c0474Hi, C0578Li c0578Li) throws IOException {
        int iJ = c0474Hi.j();
        if (iJ != 2) {
            throw c(2, Integer.valueOf(iJ));
        }
        int iJ2 = c0474Hi.j();
        if (iJ2 == i2 + 1 && c0474Hi.j() == 0) {
            iJ2--;
        } else {
            if (iJ2 > i2) {
                throw new IOException(AbstractC1674hK.n(iJ2, "Invalid r/s-value in ASN.1 DER encoded signature: "));
            }
            for (int i3 = 0; i3 < i2 - iJ2; i3++) {
                c0578Li.o(0);
            }
        }
        c0578Li.i(c0474Hi.f(iJ2));
    }

    private static byte[] M(byte[] bArr) {
        if (bArr[0] != 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length - 1];
        System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
        return bArr2;
    }

    private static void N(PublicKey publicKey, int i2, byte[] bArr, byte[] bArr2) throws b {
        if (publicKey instanceof DSAPublicKey) {
            try {
                bArr2 = i(bArr2, 20, true);
            } catch (IOException unused) {
                throw new IllegalStateException();
            }
        } else if (publicKey instanceof ECPublicKey) {
            try {
                switch (i2) {
                    case 12:
                        if (bArr2.length != a.a * 2) {
                            throw new k();
                        }
                        break;
                        break;
                    case 13:
                        bArr2 = i(bArr2, b.a, false);
                        break;
                    case 14:
                        bArr2 = i(bArr2, c.a, false);
                        break;
                    default:
                        throw new l(i2);
                }
            } catch (IOException unused2) {
                throw new IllegalStateException();
            }
        }
        try {
            Signature signature = Signature.getInstance(b(i2));
            signature.initVerify(publicKey);
            signature.update(bArr);
            if (signature.verify(bArr2)) {
            } else {
                throw new k();
            }
        } catch (GeneralSecurityException e2) {
            throw new b(e2);
        }
    }

    public static void O(X40 x40, W40 w40, C0552Ki c0552Ki) throws b {
        P(x40, w40, c0552Ki, Instant.now());
    }

    public static void P(X40 x40, W40 w40, C0552Ki c0552Ki, Instant instant) throws b {
        if (!t(w40, c0552Ki)) {
            throw new f(c0552Ki, w40);
        }
        if (instant.compareTo(w40.V()) > 0) {
            throw new i(w40.V(), instant);
        }
        if (instant.compareTo(w40.b0()) < 0) {
            throw new j(w40.b0(), instant);
        }
        N(c0552Ki.Z(), w40.U(), g(w40, x40), w40.Z());
    }

    @Deprecated
    public static void Q(X40 x40, W40 w40, C0552Ki c0552Ki, Date date) throws b {
        P(x40, w40, c0552Ki, DateRetargetClass.toInstant(date));
    }

    public static void R(AQ aq, byte[] bArr, C1174c90 c1174c90, C1174c90 c1174c91, C1672hI c1672hI, Instant instant) throws b {
        if (aq.v == 0) {
            throw new h();
        }
        if (!t(c1174c90, c1672hI)) {
            throw new f(c1672hI, c1174c90);
        }
        if (instant.compareTo(c1174c90.V()) > 0) {
            throw new i(c1174c90.V(), instant);
        }
        if (instant.compareTo(c1174c90.b0()) < 0) {
            throw new j(c1174c90.b0(), instant);
        }
        C0578Li c0578Li = new C0578Li();
        h(c0578Li, c1174c90);
        if (c1174c91 != null) {
            c0578Li.i(c1174c91.Z());
        }
        C1763iB c1763iBClone = aq.k().clone();
        c1763iBClone.d(3);
        c0578Li.i(c1763iBClone.z());
        c0578Li.j(bArr, 12, aq.v - 12);
        N(c1672hI.Z(), c1174c90.U(), c0578Li.g(), c1174c90.Z());
    }

    private static void S(int i2, C0578Li c0578Li, byte[] bArr, int i3) {
        c0578Li.o(2);
        c0578Li.o(i3);
        if (i3 > i2) {
            c0578Li.o(0);
        }
        if (i3 >= i2) {
            c0578Li.i(bArr);
        } else {
            c0578Li.j(bArr, i2 - i3, i3);
        }
    }

    private static void T(C0578Li c0578Li, BigInteger bigInteger) {
        c0578Li.i(M(bigInteger.toByteArray()));
    }

    private static void U(C0578Li c0578Li, BigInteger bigInteger, int i2) {
        byte[] bArrM = M(bigInteger.toByteArray());
        if (bArrM.length > i2) {
            throw new IllegalArgumentException();
        }
        if (bArrM.length < i2) {
            c0578Li.i(new byte[i2 - bArrM.length]);
        }
        c0578Li.i(bArrM);
    }

    private static void V(C0578Li c0578Li, BigInteger bigInteger, int i2) {
        byte[] bArrM = M(bigInteger.toByteArray());
        if (bArrM.length > i2) {
            throw new IllegalArgumentException();
        }
        x(bArrM);
        c0578Li.i(bArrM);
        if (bArrM.length < i2) {
            c0578Li.i(new byte[i2 - bArrM.length]);
        }
    }

    public static String b(int i2) throws l {
        switch (i2) {
            case 1:
                return "MD5withRSA";
            case 2:
            case 4:
            case 9:
            case 11:
            default:
                throw new l(i2);
            case 3:
            case 6:
                return "SHA1withDSA";
            case 5:
            case 7:
                return "SHA1withRSA";
            case 8:
                return "SHA256withRSA";
            case 10:
                return "SHA512withRSA";
            case 12:
                return "GOST3411withECGOST3410";
            case 13:
                return "SHA256withECDSA";
            case 14:
                return "SHA384withECDSA";
            case 15:
                return "Ed25519";
            case 16:
                return "Ed448";
        }
    }

    private static IOException c(Object obj, Object obj2) {
        return new IOException("Invalid ASN.1 data, expected " + obj + " got " + obj2);
    }

    private static int d(BigInteger bigInteger) {
        return (bigInteger.bitLength() + 7) / 8;
    }

    public static void e(PrivateKey privateKey, int i2) throws l {
        switch (i2) {
            case 1:
            case 5:
            case 7:
            case 8:
            case 10:
                if (!"RSA".equals(privateKey.getAlgorithm())) {
                    throw new e();
                }
                return;
            case 2:
            case 4:
            case 9:
            case 11:
            default:
                throw new l(i2);
            case 3:
            case 6:
                if (!"DSA".equals(privateKey.getAlgorithm())) {
                    throw new e();
                }
                return;
            case 12:
            case 13:
            case 14:
                if (!"EC".equals(privateKey.getAlgorithm()) && !"ECDSA".equals(privateKey.getAlgorithm())) {
                    throw new e();
                }
                return;
            case 15:
                if (!"Ed25519".equals(privateKey.getAlgorithm()) && !"EdDSA".equals(privateKey.getAlgorithm())) {
                    throw new e();
                }
                return;
            case 16:
                if (!"Ed448".equals(privateKey.getAlgorithm()) && !"EdDSA".equals(privateKey.getAlgorithm())) {
                    throw new e();
                }
                return;
        }
    }

    public static byte[] f(C1174c90 c1174c90, AQ aq, byte[] bArr) {
        C0578Li c0578Li = new C0578Li();
        h(c0578Li, c1174c90);
        if (bArr != null) {
            c0578Li.i(bArr);
        }
        aq.J(c0578Li);
        return c0578Li.g();
    }

    public static byte[] g(W40 w40, X40 x40) {
        final C0578Li c0578Li = new C0578Li();
        h(c0578Li, w40);
        C2848tT c2848tTO = x40.o();
        int iX = w40.X() + 1;
        C2848tT c2848tTF = c2848tTO.s() > iX ? c2848tTO.F(c2848tTO.s() - iX) : null;
        final C0578Li c0578Li2 = new C0578Li();
        if (c2848tTF != null) {
            c2848tTF.D(c0578Li2);
        } else {
            c2848tTO.D(c0578Li2);
        }
        c0578Li2.l(x40.getType());
        c0578Li2.l(x40.n());
        c0578Li2.n(w40.Y());
        Collection$EL.stream(x40.r(false)).sorted().forEachOrdered(new Consumer() { // from class: o.Mi
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C0629Ni.s(c0578Li, c0578Li2, (H50) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return c0578Li.g();
    }

    private static void h(C0578Li c0578Li, AbstractC1077b90 abstractC1077b90) {
        c0578Li.l(abstractC1077b90.c0());
        c0578Li.o(abstractC1077b90.U());
        c0578Li.o(abstractC1077b90.X());
        c0578Li.n(abstractC1077b90.Y());
        c0578Li.n(abstractC1077b90.V().getEpochSecond());
        c0578Li.n(abstractC1077b90.b0().getEpochSecond());
        c0578Li.l(abstractC1077b90.W());
        abstractC1077b90.a0().D(c0578Li);
    }

    private static byte[] i(byte[] bArr, int i2, boolean z) throws k, Rw0 {
        if (bArr.length != (i2 * 2) + (z ? 1 : 0)) {
            throw new k();
        }
        C0474Hi c0474Hi = new C0474Hi(bArr);
        C0578Li c0578Li = new C0578Li();
        if (z) {
            c0474Hi.j();
        }
        byte[] bArrF = c0474Hi.f(i2);
        int iR = r(bArrF, i2);
        byte[] bArrF2 = c0474Hi.f(i2);
        int iR2 = r(bArrF2, i2);
        c0578Li.o(48);
        c0578Li.o(iR + iR2 + 4);
        S(i2, c0578Li, bArrF, iR);
        S(i2, c0578Li, bArrF2, iR2);
        return c0578Li.g();
    }

    private static byte[] j(byte[] bArr, int i2, int i3) throws IOException {
        C0474Hi c0474Hi = new C0474Hi(bArr);
        C0578Li c0578Li = new C0578Li();
        if (i3 > -1) {
            c0578Li.o(i3);
        }
        int iJ = c0474Hi.j();
        if (iJ != 48) {
            throw c(48, Integer.valueOf(iJ));
        }
        c0474Hi.j();
        L(i2, c0474Hi, c0578Li);
        L(i2, c0474Hi, c0578Li);
        return c0578Li.g();
    }

    private static byte[] k(DSAPublicKey dSAPublicKey) {
        C0578Li c0578Li = new C0578Li();
        BigInteger q = dSAPublicKey.getParams().getQ();
        BigInteger p = dSAPublicKey.getParams().getP();
        BigInteger g2 = dSAPublicKey.getParams().getG();
        BigInteger y = dSAPublicKey.getY();
        int length = (p.toByteArray().length - 64) / 8;
        c0578Li.o(length);
        T(c0578Li, q);
        T(c0578Li, p);
        int i2 = (length * 8) + 64;
        U(c0578Li, g2, i2);
        U(c0578Li, y, i2);
        return c0578Li.g();
    }

    private static byte[] l(ECPublicKey eCPublicKey, d dVar) {
        C0578Li c0578Li = new C0578Li();
        BigInteger affineX = eCPublicKey.getW().getAffineX();
        BigInteger affineY = eCPublicKey.getW().getAffineY();
        U(c0578Li, affineX, dVar.a);
        U(c0578Li, affineY, dVar.a);
        return c0578Li.g();
    }

    private static byte[] m(ECPublicKey eCPublicKey, d dVar) {
        C0578Li c0578Li = new C0578Li();
        BigInteger affineX = eCPublicKey.getW().getAffineX();
        BigInteger affineY = eCPublicKey.getW().getAffineY();
        V(c0578Li, affineX, dVar.a);
        V(c0578Li, affineY, dVar.a);
        return c0578Li.g();
    }

    private static byte[] n(PublicKey publicKey) {
        byte[] encoded = publicKey.getEncoded();
        return Arrays.copyOfRange(encoded, 12, encoded.length);
    }

    public static byte[] o(PublicKey publicKey, int i2) throws l {
        switch (i2) {
            case 1:
            case 5:
            case 7:
            case 8:
            case 10:
                if (publicKey instanceof RSAPublicKey) {
                    return p((RSAPublicKey) publicKey);
                }
                throw new e();
            case 2:
            case 4:
            case 9:
            case 11:
            default:
                throw new l(i2);
            case 3:
            case 6:
                if (publicKey instanceof DSAPublicKey) {
                    return k((DSAPublicKey) publicKey);
                }
                throw new e();
            case 12:
                if (publicKey instanceof ECPublicKey) {
                    return m((ECPublicKey) publicKey, a);
                }
                throw new e();
            case 13:
                if (publicKey instanceof ECPublicKey) {
                    return l((ECPublicKey) publicKey, b);
                }
                throw new e();
            case 14:
                if (publicKey instanceof ECPublicKey) {
                    return l((ECPublicKey) publicKey, c);
                }
                throw new e();
            case 15:
            case 16:
                if (publicKey.getFormat().equalsIgnoreCase("X.509")) {
                    return n(publicKey);
                }
                throw new e();
        }
    }

    private static byte[] p(RSAPublicKey rSAPublicKey) {
        C0578Li c0578Li = new C0578Li();
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iD = d(publicExponent);
        if (iD < 256) {
            c0578Li.o(iD);
        } else {
            c0578Li.o(0);
            c0578Li.l(iD);
        }
        T(c0578Li, publicExponent);
        T(c0578Li, modulus);
        return c0578Li.g();
    }

    public static byte[] q(C0552Ki c0552Ki, int i2) {
        MessageDigest messageDigest;
        try {
            if (i2 == 1) {
                messageDigest = MessageDigest.getInstance("sha-1");
            } else if (i2 == 2) {
                messageDigest = MessageDigest.getInstance("sha-256");
            } else if (i2 == 3) {
                messageDigest = MessageDigest.getInstance("GOST3411");
            } else {
                if (i2 != 4) {
                    throw new IllegalArgumentException("unknown DS digest type " + i2);
                }
                messageDigest = MessageDigest.getInstance("sha-384");
            }
            messageDigest.update(c0552Ki.v().E());
            messageDigest.update(c0552Ki.G());
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException unused) {
            throw new IllegalStateException("no message digest support");
        }
    }

    private static int r(byte[] bArr, int i2) {
        if (bArr[0] < 0) {
            return i2 + 1;
        }
        int i3 = i2;
        int i4 = 0;
        while (i4 < i2 - 1 && bArr[i4] == 0) {
            i4++;
            if (bArr[i4] < 0) {
                break;
            }
            i3--;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(C0578Li c0578Li, C0578Li c0578Li2, H50 h50) {
        c0578Li.i(c0578Li2.g());
        int iB = c0578Li.b();
        c0578Li.l(0);
        h50.J(c0578Li, null, true);
        int iB2 = (c0578Li.b() - iB) - 2;
        c0578Li.f();
        c0578Li.c(iB);
        c0578Li.l(iB2);
        c0578Li.e();
    }

    private static boolean t(AbstractC1077b90 abstractC1077b90, AbstractC1574gI abstractC1574gI) {
        return abstractC1574gI.U() == abstractC1077b90.U() && abstractC1574gI.W() == abstractC1077b90.W() && abstractC1574gI.v().equals(abstractC1077b90.a0());
    }

    private static BigInteger u(C0474Hi c0474Hi) {
        return new BigInteger(1, c0474Hi.e());
    }

    private static BigInteger v(C0474Hi c0474Hi, int i2) {
        return new BigInteger(1, c0474Hi.f(i2));
    }

    private static BigInteger w(C0474Hi c0474Hi, int i2) throws Rw0 {
        byte[] bArrF = c0474Hi.f(i2);
        x(bArrF);
        return new BigInteger(1, bArrF);
    }

    private static void x(byte[] bArr) {
        for (int i2 = 0; i2 < bArr.length / 2; i2++) {
            int length = (bArr.length - i2) - 1;
            byte b2 = bArr[i2];
            bArr[i2] = bArr[length];
            bArr[length] = b2;
        }
    }

    public static W40 y(X40 x40, C0552Ki c0552Ki, PrivateKey privateKey, Instant instant, Instant instant2) {
        return z(x40, c0552Ki, privateKey, instant, instant2, null);
    }

    public static W40 z(X40 x40, C0552Ki c0552Ki, PrivateKey privateKey, Instant instant, Instant instant2, String str) throws l {
        int iU = c0552Ki.U();
        e(privateKey, iU);
        W40 w40 = new W40(x40.o(), x40.n(), x40.p(), x40.getType(), iU, x40.p(), instant2, instant, c0552Ki.W(), c0552Ki.v(), (byte[]) null);
        w40.d0(C(privateKey, c0552Ki.Z(), iU, g(w40, x40), str));
        return w40;
    }
}
