package o;

import j$.time.Instant;
import java.security.Security;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import lombok.Generated;

/* JADX INFO: loaded from: classes.dex */
final class Rr0 {
    public static final String i = "dnsjava.dnssec.digest_preference";
    public static final String j = "dnsjava.dnssec.digest";
    public static final String k = "dnsjava.dnssec.harden_algo_downgrade";
    public static final String l = "dnsjava.dnssec.algorithm";
    private boolean e;
    private boolean f;
    private boolean g;

    @Generated
    private static final CL h = DL.d(Rr0.class);
    private static final C2848tT m = C2848tT.k("*");
    private int[] b = null;
    private Properties c = null;
    private boolean d = true;
    private final C0583Ln a = new C0583Ln();

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC1887jb0.values().length];
            a = iArr;
            try {
                iArr[EnumC1887jb0.SECURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC1887jb0.BOGUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC1887jb0.INSECURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class b {
        boolean a;
        C2848tT b;
    }

    public Rr0() {
        this.e = Security.getProviders("MessageDigest.GOST3411") != null;
        this.f = Security.getProviders("KeyFactory.Ed25519") != null;
        this.g = Security.getProviders("KeyFactory.Ed448") != null;
    }

    public static EnumC2148m80 c(AQ aq, C1369e90 c1369e90) {
        if (c1369e90.k() == 3 && c1369e90.f(1) == 0) {
            return EnumC2148m80.NAMEERROR;
        }
        boolean z = false;
        if (!aq.k().g(7) && c1369e90.f(1) == 0 && c1369e90.k() != 0) {
            for (C1761i90 c1761i90 : c1369e90.l(2)) {
                if (c1761i90.getType() == 6) {
                    return EnumC2148m80.NODATA;
                }
                if (c1761i90.getType() == 43) {
                    return EnumC2148m80.REFERRAL;
                }
                if (c1761i90.getType() == 2) {
                    z = true;
                }
            }
            return z ? EnumC2148m80.REFERRAL : EnumC2148m80.NODATA;
        }
        if (c1369e90.l(2).isEmpty() && c1369e90.l(1).size() == 1 && c1369e90.k() == 0 && c1369e90.l(1).get(0).getType() == 2 && !c1369e90.l(1).get(0).o().equals(aq.n().v())) {
            return EnumC2148m80.REFERRAL;
        }
        if (c1369e90.k() != 0 && c1369e90.k() != 3) {
            return EnumC2148m80.UNKNOWN;
        }
        if (c1369e90.k() == 0 && c1369e90.f(1) == 0) {
            return EnumC2148m80.NODATA;
        }
        int iY = c1369e90.j().y();
        if (iY == 255) {
            return EnumC2148m80.ANY;
        }
        for (C1761i90 c1761i91 : c1369e90.l(1)) {
            if (c1761i91.getType() == iY) {
                return EnumC2148m80.POSITIVE;
            }
            if (c1761i91.getType() == 5 || c1761i91.getType() == 39) {
                if (iY == 43) {
                    return EnumC2148m80.CNAME;
                }
                z = true;
            }
        }
        if (z) {
            return c1369e90.k() == 3 ? EnumC2148m80.CNAME_NAMEERROR : EnumC2148m80.CNAME_NODATA;
        }
        h.y(c1369e90, "Failed to classify response message:\n{}");
        return EnumC2148m80.UNKNOWN;
    }

    public static C2848tT d(C2848tT c2848tT, C2848tT c2848tT2, C2848tT c2848tT3) {
        C2848tT c2848tTK = k(c2848tT, c2848tT2);
        C2848tT c2848tTK2 = k(c2848tT, c2848tT3);
        return c2848tTK.s() > c2848tTK2.s() ? c2848tTK : c2848tTK2;
    }

    private C2643rI f(C1761i90 c1761i90, Instant instant, C0655Oi c0655Oi, C0552Ki c0552Ki) {
        byte[] bArrV = new C0655Oi(C2848tT.v, c0655Oi.t(), 0L, c0655Oi.W(), c0552Ki).V();
        byte[] bArrV2 = c0655Oi.V();
        if (bArrV.length != bArrV2.length) {
            C2643rI c2643rIB = C2643rI.B(c0655Oi.v(), c0655Oi.t(), c0655Oi.x());
            c2643rIB.E(6, U40.a("dnskey.invalid", new Object[0]));
            return c2643rIB;
        }
        for (int i2 = 0; i2 < bArrV.length; i2++) {
            if (bArrV[i2] != bArrV2[i2]) {
                C2643rI c2643rIB2 = C2643rI.B(c0655Oi.v(), c0655Oi.t(), c0655Oi.x());
                c2643rIB2.E(6, U40.a("dnskey.invalid", new Object[0]));
                return c2643rIB2;
            }
        }
        C1281dI c1281dIB = this.a.b(c1761i90, c0552Ki, instant);
        int i3 = a.a[c1281dIB.a.ordinal()];
        if (i3 == 1) {
            c1761i90.x(EnumC1887jb0.SECURE);
            return C2643rI.C(c1761i90);
        }
        if (i3 != 2) {
            throw new IllegalStateException("Unexpected security status");
        }
        C2643rI c2643rIB3 = C2643rI.B(c0655Oi.v(), c0655Oi.t(), c0655Oi.x());
        c2643rIB3.E(c1281dIB.b, c1281dIB.c);
        return c2643rIB3;
    }

    public static C2848tT k(C2848tT c2848tT, C2848tT c2848tT2) {
        int iMin = Math.min(c2848tT.s(), c2848tT2.s());
        C2848tT c2848tT3 = new C2848tT(c2848tT, c2848tT.s() - iMin);
        C2848tT c2848tT4 = new C2848tT(c2848tT2, c2848tT2.s() - iMin);
        for (int i2 = 0; i2 < iMin - 1; i2++) {
            C2848tT c2848tT5 = new C2848tT(c2848tT3, i2);
            if (c2848tT5.equals(new C2848tT(c2848tT4, i2))) {
                return c2848tT5;
            }
        }
        return C2848tT.v;
    }

    public static boolean l(C1761i90 c1761i90, C2073lT c2073lT, C2848tT c2848tT) {
        C2848tT c2848tTO = c1761i90.o();
        C2848tT c2848tTU = c2073lT.U();
        if (c2848tT.equals(c2848tTO) || !c2848tTU.y(c1761i90.v())) {
            return false;
        }
        if (c2848tT.y(c2848tTO)) {
            if (c2073lT.W(39)) {
                return false;
            }
            if (c2073lT.W(2) && !c2073lT.W(6)) {
                return false;
            }
        }
        if (c2848tTO.equals(c2848tTU)) {
            return u(c2848tT, c2848tTU);
        }
        if (c2848tTO.compareTo(c2848tTU) > 0) {
            return c2848tTO.compareTo(c2848tT) < 0 && u(c2848tT, c2848tTU);
        }
        return c2848tTO.compareTo(c2848tT) < 0 && c2848tT.compareTo(c2848tTU) < 0;
    }

    public static EnumC1887jb0 m(C2073lT c2073lT, C2848tT c2848tT) {
        if ((!c2073lT.W(6) || C2848tT.v.equals(c2848tT)) && !c2073lT.W(43)) {
            return !c2073lT.W(2) ? EnumC1887jb0.INSECURE : EnumC1887jb0.SECURE;
        }
        return EnumC1887jb0.BOGUS;
    }

    public static boolean n(C1761i90 c1761i90, C2073lT c2073lT, C2848tT c2848tT) {
        int iS = c2848tT.s() - d(c2848tT, c1761i90.o(), c2073lT.U()).s();
        if (iS > 0) {
            return l(c1761i90, c2073lT, c2848tT.F(iS));
        }
        return false;
    }

    public static b o(C1761i90 c1761i90, C2073lT c2073lT, C2848tT c2848tT, int i2) {
        b bVar = new b();
        if (c1761i90.o().equals(c2848tT)) {
            if (c2073lT.W(i2)) {
                h.C(C3080vp0.e(i2), "NSEC proofed that {} exists");
                bVar.a = false;
                return bVar;
            }
            if (c2073lT.W(5)) {
                h.M("NSEC proofed CNAME");
                bVar.a = false;
                return bVar;
            }
            if (i2 != 43 && c2073lT.W(2) && !c2073lT.W(6)) {
                h.M("NSEC proofed missing referral");
                bVar.a = false;
                return bVar;
            }
            if (i2 != 43 || !c2073lT.W(6) || C2848tT.v.equals(c2848tT)) {
                bVar.a = true;
                return bVar;
            }
            h.M("NSEC from wrong zone");
            bVar.a = false;
            return bVar;
        }
        if (u(c2073lT.U(), c2848tT) && c1761i90.o().compareTo(c2848tT) < 0) {
            bVar.a = true;
            return bVar;
        }
        if (!c1761i90.o().r()) {
            bVar.a = false;
            return bVar;
        }
        C2848tT c2848tT2 = new C2848tT(c1761i90.o(), 1);
        if (u(c2848tT, c2848tT2)) {
            if (c2073lT.W(5)) {
                h.M("NSEC proofed wildcard CNAME");
                bVar.a = false;
                return bVar;
            }
            if (c2073lT.W(2) && !c2073lT.W(6)) {
                h.M("Wrong parent (wildcard) NSEC used");
                bVar.a = false;
                return bVar;
            }
            if (c2073lT.W(i2)) {
                h.C(C3080vp0.e(i2), "NSEC proofed that {} exists");
                bVar.a = false;
                return bVar;
            }
        }
        bVar.b = c2848tT2;
        bVar.a = true;
        return bVar;
    }

    public static C2848tT q(C2848tT c2848tT, C1761i90 c1761i90, C2073lT c2073lT) {
        return C2848tT.h(m, d(c2848tT, c1761i90.o(), c2073lT.U()));
    }

    private boolean r(String str, boolean z) {
        if (!z) {
            return false;
        }
        Properties properties = this.c;
        if (properties == null) {
            return true;
        }
        return Boolean.parseBoolean(properties.getProperty(str, Boolean.TRUE.toString()));
    }

    public static C2848tT s(X40 x40) {
        List<W40> listS = x40.s();
        W40 w40 = listS.get(0);
        for (int i2 = 1; i2 < listS.size(); i2++) {
            if (listS.get(i2).X() != w40.X()) {
                throw new IllegalArgumentException("failed.wildcard.label_count_mismatch");
            }
        }
        C2848tT c2848tTO = x40.o();
        if (x40.o().r()) {
            c2848tTO = new C2848tT(c2848tTO, 1);
        }
        int iS = (c2848tTO.s() - 1) - w40.X();
        if (iS > 0) {
            return c2848tTO.F(iS);
        }
        return null;
    }

    public static void t(C1761i90 c1761i90, W40 w40) {
        if (c1761i90.getType() != 47) {
            return;
        }
        H50 h50M = c1761i90.m();
        int iS = h50M.v().s();
        int i2 = iS - 1;
        if (h50M.v().r()) {
            i2 = iS - 2;
        }
        if (w40.X() == i2) {
            c1761i90.w(h50M.v());
        } else {
            if (w40.X() >= i2) {
                throw new IllegalArgumentException("invalid nsec record");
            }
            c1761i90.w(h50M.v().F(w40.a0().s() - w40.X()));
        }
    }

    public static boolean u(C2848tT c2848tT, C2848tT c2848tT2) {
        if (c2848tT.s() <= c2848tT2.s()) {
            return false;
        }
        return new C2848tT(c2848tT, c2848tT.s() - c2848tT2.s()).equals(c2848tT2);
    }

    public boolean a(X40 x40) {
        Iterator<H50> it = x40.q().iterator();
        while (it.hasNext()) {
            if (j(((C0655Oi) it.next()).W())) {
                return true;
            }
        }
        return false;
    }

    public boolean b(X40 x40) {
        Iterator<H50> it = x40.q().iterator();
        while (it.hasNext()) {
            if (i(((C0655Oi) it.next()).U())) {
                return true;
            }
        }
        return false;
    }

    public int e(C1761i90 c1761i90) {
        int[] iArr = this.b;
        int iW = 0;
        if (iArr == null) {
            Iterator<H50> it = c1761i90.q().iterator();
            while (it.hasNext()) {
                C0655Oi c0655Oi = (C0655Oi) it.next();
                if (c0655Oi.W() > iW && j(c0655Oi.W()) && i(c0655Oi.U())) {
                    iW = c0655Oi.W();
                }
            }
            return iW;
        }
        for (int i2 : iArr) {
            Iterator<H50> it2 = c1761i90.q().iterator();
            while (it2.hasNext()) {
                C0655Oi c0655Oi2 = (C0655Oi) it2.next();
                if (c0655Oi2.W() == i2) {
                    return c0655Oi2.W();
                }
            }
        }
        return 0;
    }

    public boolean g(C1369e90 c1369e90) {
        for (C1761i90 c1761i90 : c1369e90.l(2)) {
            if (c1761i90.getType() == 47 || c1761i90.getType() == 50) {
                if (!c1761i90.s().isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void h(Properties properties) {
        this.e = Security.getProviders("MessageDigest.GOST3411") != null;
        this.f = Security.getProviders("KeyFactory.Ed25519") != null;
        this.g = Security.getProviders("KeyFactory.Ed448") != null;
        this.c = properties;
        String property = properties.getProperty(i);
        if (property != null) {
            String[] strArrSplit = property.split(",");
            this.b = new int[strArrSplit.length];
            for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                this.b[i2] = Integer.parseInt(strArrSplit[i2]);
                if (!j(this.b[i2])) {
                    throw new IllegalArgumentException("Unsupported or disabled digest ID in digest preferences");
                }
            }
        }
        this.d = Boolean.parseBoolean(properties.getProperty(k));
    }

    public boolean i(int i2) {
        String strN = AbstractC1674hK.n(i2, "dnsjava.dnssec.algorithm.");
        switch (i2) {
            case 3:
            case 6:
                Properties properties = this.c;
                if (properties == null) {
                    return false;
                }
                return Boolean.parseBoolean(properties.getProperty(strN, Boolean.FALSE.toString()));
            case 4:
            case 9:
            case 11:
            default:
                return false;
            case 5:
            case 7:
            case 8:
            case 10:
            case 13:
            case 14:
                return r(strN, true);
            case 12:
                return r(strN, this.e);
            case 15:
                return r(strN, this.f);
            case 16:
                return r(strN, this.g);
        }
    }

    public boolean j(int i2) {
        String strN = AbstractC1674hK.n(i2, "dnsjava.dnssec.digest.");
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                return r(strN, this.e);
            }
            if (i2 != 4) {
                return false;
            }
        }
        Properties properties = this.c;
        if (properties == null) {
            return true;
        }
        return Boolean.parseBoolean(properties.getProperty(strN, Boolean.TRUE.toString()));
    }

    public C1281dI p(AQ aq, C1369e90 c1369e90, C1761i90 c1761i90, Instant instant) {
        C2848tT c2848tTV = aq.n().v();
        C1761i90 c1761i90D = c1369e90.d(c2848tTV, 47, aq.n().t(), 2);
        if (c1761i90D != null) {
            C1281dI c1281dIW = w(c1761i90D, c1761i90, instant);
            if (c1281dIW.a != EnumC1887jb0.SECURE) {
                return new C1281dI(EnumC1887jb0.BOGUS, 6, U40.a("failed.ds.nsec", c1281dIW.c));
            }
            EnumC1887jb0 enumC1887jb0M = m((C2073lT) c1761i90D.m(), c2848tTV);
            int i2 = a.a[enumC1887jb0M.ordinal()];
            if (i2 != 1) {
                return i2 != 3 ? new C1281dI(enumC1887jb0M, 6, U40.a("failed.ds.nsec.hasdata", new Object[0])) : new C1281dI(enumC1887jb0M, -1, U40.a("failed.ds.nodelegation", new Object[0]));
            }
            return new C1281dI(enumC1887jb0M, -1, U40.a("insecure.ds.nsec", new Object[0]));
        }
        b bVar = new b();
        C2848tT c2848tTD = null;
        C2073lT c2073lT = null;
        boolean z = false;
        for (C1761i90 c1761i91 : c1369e90.m(2, 47)) {
            C1281dI c1281dIW2 = w(c1761i91, c1761i90, instant);
            EnumC1887jb0 enumC1887jb0 = c1281dIW2.a;
            if (enumC1887jb0 != EnumC1887jb0.SECURE) {
                return new C1281dI(enumC1887jb0, c1281dIW2.b, U40.a("failed.ds.nsec.ent", new Object[0]));
            }
            C2073lT c2073lT2 = (C2073lT) c1761i91.q().get(0);
            b bVarO = o(c1761i91, c2073lT2, c2848tTV, 43);
            if (bVarO.a) {
                if (bVarO.b != null && c2073lT2.v().r()) {
                    c2073lT = c2073lT2;
                }
                z = true;
            }
            if (l(c1761i91, c2073lT2, c2848tTV)) {
                c2848tTD = d(c2848tTV, c1761i91.o(), c2073lT2.U());
            }
            bVar = bVarO;
        }
        C2848tT c2848tT = bVar.b;
        if (c2848tT != null && (c2848tTD == null || !c2848tTD.equals(c2848tT))) {
            z = false;
        }
        if (z) {
            return bVar.b != null ? new C1281dI(m(c2073lT, c2848tTV), 12, U40.a("failed.ds.nowildcardproof", new Object[0])) : new C1281dI(EnumC1887jb0.INSECURE, -1, U40.a("insecure.ds.nsec.ent", new Object[0]));
        }
        return new C1281dI(EnumC1887jb0.UNCHECKED, 5, U40.a("failed.ds.nonconclusive", new Object[0]));
    }

    public C2643rI v(C1761i90 c1761i90, C1761i90 c1761i91, long j2, Instant instant) {
        if (!a(c1761i91)) {
            C2643rI c2643rID = C2643rI.D(c1761i91.o(), c1761i91.n(), c1761i91.p());
            c2643rID.E(2, U40.a("failed.ds.nodigest", c1761i91.o()));
            return c2643rID;
        }
        if (!b(c1761i91)) {
            C2643rI c2643rID2 = C2643rI.D(c1761i91.o(), c1761i91.n(), c1761i91.p());
            c2643rID2.E(1, U40.a("failed.ds.noalg", c1761i91.o()));
            return c2643rID2;
        }
        int iE = e(c1761i91);
        Iterator<H50> it = c1761i91.q().iterator();
        C2643rI c2643rIF = null;
        while (it.hasNext()) {
            C0655Oi c0655Oi = (C0655Oi) it.next();
            if (!this.d || c0655Oi.W() == iE) {
                Iterator<H50> it2 = c1761i90.q().iterator();
                while (it2.hasNext()) {
                    C0552Ki c0552Ki = (C0552Ki) it2.next();
                    if (c0655Oi.X() == c0552Ki.W() && c0655Oi.U() == c0552Ki.U()) {
                        c2643rIF = f(c1761i90, instant, c0655Oi, c0552Ki);
                        if (c2643rIF.z()) {
                            return c2643rIF;
                        }
                    }
                }
            }
        }
        if (c2643rIF != null) {
            return c2643rIF;
        }
        C2643rI c2643rIB = C2643rI.B(c1761i91.o(), c1761i91.n(), j2);
        c2643rIB.E(9, U40.a("dnskey.no_ds_match", new Object[0]));
        return c2643rIB;
    }

    public C1281dI w(C1761i90 c1761i90, C1761i90 c1761i91, Instant instant) {
        EnumC1887jb0 enumC1887jb0U = c1761i90.u();
        EnumC1887jb0 enumC1887jb0 = EnumC1887jb0.SECURE;
        if (enumC1887jb0U == enumC1887jb0) {
            h.u("RRset <{}/{}/{}> previously found to be SECURE", c1761i90.o(), C3080vp0.e(c1761i90.getType()), C0344Ci.b(c1761i90.n()));
            return new C1281dI(enumC1887jb0, -1, null);
        }
        C1281dI c1281dIC = this.a.c(c1761i90, c1761i91, instant);
        c1761i90.x(c1281dIC.a);
        return c1281dIC;
    }
}
