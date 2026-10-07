package o;

import java.security.NoSuchAlgorithmException;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import lombok.Generated;

/* JADX INFO: renamed from: o.kT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1975kT {

    @Generated
    private static final CL b = DL.d(C1975kT.class);
    private static final C2848tT c = C2848tT.k("*");
    private static final int d = 65536;
    private final TreeMap<Integer, Integer> a;

    /* JADX INFO: renamed from: o.kT$b */
    public static final class b {
        private final C2848tT a;
        private final C1877jT b;
        private C1877jT c;
        private EnumC1887jb0 d;

        private b(C2848tT c2848tT, C1877jT c1877jT) {
            this.d = EnumC1887jb0.UNCHECKED;
            this.a = c2848tT;
            this.b = c1877jT;
        }
    }

    public C1975kT() {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        this.a = treeMap;
        treeMap.put(1024, 150);
        treeMap.put(Integer.valueOf(C1672hI.a.g), 500);
        treeMap.put(Integer.valueOf(C1672hI.a.f), 2500);
    }

    private C2848tT b(C2848tT c2848tT) {
        try {
            return C2848tT.h(c, c2848tT);
        } catch (C2945uT unused) {
            return null;
        }
    }

    private b c(C2848tT c2848tT, C2848tT c2848tT2, List<C1761i90> list) {
        while (true) {
            if (c2848tT.s() < c2848tT2.s()) {
                return null;
            }
            C1877jT c1877jTE = e(c2848tT, c2848tT2, list);
            if (c1877jTE != null) {
                return new b(c2848tT, c1877jTE);
            }
            c2848tT = new C2848tT(c2848tT, 1);
        }
    }

    private C1877jT d(C2848tT c2848tT, C2848tT c2848tT2, List<C1761i90> list) {
        for (C1761i90 c1761i90 : list) {
            try {
                C1877jT c1877jT = (C1877jT) c1761i90.m();
                if (h(c1877jT, c2848tT2, c1877jT.b0(c2848tT))) {
                    return c1877jT;
                }
            } catch (NoSuchAlgorithmException e) {
                b.R(c1761i90, e, "Unrecognized NSEC3 in set: {}");
            }
        }
        return null;
    }

    private C1877jT e(C2848tT c2848tT, C2848tT c2848tT2, List<C1761i90> list) {
        By0 by0 = new By0(By0.a.b, false, false);
        for (C1761i90 c1761i90 : list) {
            try {
                C1877jT c1877jT = (C1877jT) c1761i90.m();
                if (new C2848tT(by0.d(c1877jT.b0(c2848tT)), c2848tT2).equals(c1877jT.v())) {
                    return c1877jT;
                }
            } catch (NoSuchAlgorithmException | Ri0 e) {
                b.R(c1761i90, e, "Unrecognized NSEC3 in set: {}");
            }
        }
        return null;
    }

    private C2848tT g(C2848tT c2848tT, C2848tT c2848tT2) {
        int iS = (c2848tT.s() - c2848tT2.s()) - 1;
        return iS > 0 ? new C2848tT(c2848tT, iS) : c2848tT;
    }

    private boolean h(C1877jT c1877jT, C2848tT c2848tT, byte[] bArr) {
        if (!new C2848tT(c1877jT.v(), 1).equals(c2848tT)) {
            return false;
        }
        byte[] bArrB = new By0(By0.a.b, false, false).b(c1877jT.v().p(0));
        byte[] bArrX = c1877jT.X();
        if (C1104ba.a(bArrB, bArr) >= 0 || C1104ba.a(bArr, bArrX) >= 0) {
            return C1104ba.a(bArrX, bArrB) <= 0 && (C1104ba.a(bArr, bArrB) > 0 || C1104ba.a(bArr, bArrX) < 0);
        }
        return true;
    }

    private b i(C2848tT c2848tT, C2848tT c2848tT2, List<C1761i90> list) {
        b bVarC = c(c2848tT, c2848tT2, list);
        if (bVarC == null) {
            b.M("Could not find a candidate for the closest encloser");
            b bVar = new b(C2848tT.w, null);
            bVar.d = EnumC1887jb0.BOGUS;
            return bVar;
        }
        if (bVarC.a.equals(c2848tT)) {
            b.M("Proved that qname existed!");
            bVarC.d = EnumC1887jb0.BOGUS;
            return bVarC;
        }
        if (bVarC.b.a0(2) && !bVarC.b.a0(6)) {
            if (!bVarC.b.a0(43)) {
                bVarC.d = EnumC1887jb0.INSECURE;
                return bVarC;
            }
            b.M("Closest encloser was a delegation!");
            bVarC.d = EnumC1887jb0.BOGUS;
            return bVarC;
        }
        if (bVarC.b.a0(39)) {
            b.M("Closest encloser was a DNAME!");
            bVarC.d = EnumC1887jb0.BOGUS;
            return bVarC;
        }
        bVarC.c = d(g(c2848tT, bVarC.a), c2848tT2, list);
        if (bVarC.c != null) {
            bVarC.d = EnumC1887jb0.SECURE;
            return bVarC;
        }
        b.M("Could not find proof that the closest encloser was the closest encloser");
        bVarC.d = EnumC1887jb0.BOGUS;
        return bVarC;
    }

    private boolean o(int i) {
        return i == 1;
    }

    private boolean p(C1761i90 c1761i90, C2547qI c2547qI) {
        int iBitLength;
        try {
            Iterator<H50> it = c2547qI.c(c1761i90.v(), c1761i90.n()).q().iterator();
            while (it.hasNext()) {
                C0552Ki c0552Ki = (C0552Ki) it.next();
                switch (c0552Ki.U()) {
                    case 3:
                    case 6:
                        iBitLength = ((DSAPublicKey) c0552Ki.Z()).getParams().getP().bitLength();
                        break;
                    case 4:
                    case 9:
                    case 11:
                    default:
                        return false;
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                        iBitLength = ((RSAPublicKey) c0552Ki.Z()).getModulus().bitLength();
                        break;
                    case 12:
                        iBitLength = 512;
                        break;
                    case 13:
                    case 14:
                        iBitLength = ((ECPublicKey) c0552Ki.Z()).getParams().getCurve().getField().getFieldSize();
                        break;
                    case 15:
                        iBitLength = 256;
                        break;
                    case 16:
                        iBitLength = 456;
                        break;
                }
                Integer numFloorKey = this.a.floorKey(Integer.valueOf(iBitLength));
                if (numFloorKey == null) {
                    numFloorKey = this.a.firstKey();
                }
                if (((C1877jT) c1761i90.m()).W() > this.a.get(numFloorKey).intValue()) {
                    return false;
                }
            }
            return true;
        } catch (C0629Ni.b e) {
            b.I("Could not get public key from NSEC3 record", e);
            return false;
        }
    }

    public boolean a(List<C1761i90> list, C2547qI c2547qI) {
        HashMap map = new HashMap();
        Iterator<C1761i90> it = list.iterator();
        while (it.hasNext()) {
            Iterator<H50> it2 = it.next().q().iterator();
            while (it2.hasNext()) {
                C1877jT c1877jT = (C1877jT) it2.next();
                C2848tT c2848tT = new C2848tT(c1877jT.v(), 1);
                C1877jT c1877jT2 = (C1877jT) map.get(c2848tT);
                if (c1877jT2 == null) {
                    map.put(c2848tT, c1877jT);
                } else {
                    if (c1877jT.V() != c1877jT2.V() || c1877jT.W() != c1877jT2.W()) {
                        return true;
                    }
                    if ((c1877jT.Y() == null) ^ (c1877jT2.Y() == null)) {
                        return true;
                    }
                    if (c1877jT.Y() != null && C1104ba.a(c1877jT.Y(), c1877jT2.Y()) != 0) {
                        return true;
                    }
                }
            }
        }
        Iterator<C1761i90> it3 = list.iterator();
        while (it3.hasNext()) {
            if (p(it3.next(), c2547qI)) {
                return false;
            }
        }
        return true;
    }

    public void f(Properties properties) {
        boolean z = true;
        for (Map.Entry entry : properties.entrySet()) {
            String string = entry.getKey().toString();
            if (string.startsWith("dnsjava.dnssec.nsec3.iterations")) {
                int i = Integer.parseInt(string.substring(string.lastIndexOf(".") + 1));
                int i2 = Integer.parseInt(entry.getValue().toString());
                if (i2 > d) {
                    throw new IllegalArgumentException("Iteration count too high.");
                }
                if (z) {
                    this.a.clear();
                    z = false;
                }
                this.a.put(Integer.valueOf(i), Integer.valueOf(i2));
            }
        }
    }

    public EnumC1887jb0 j(List<C1761i90> list, C2848tT c2848tT, C2848tT c2848tT2) {
        if (list == null || list.isEmpty()) {
            return EnumC1887jb0.BOGUS;
        }
        b bVarI = i(c2848tT, c2848tT2, list);
        EnumC1887jb0 enumC1887jb0 = bVarI.d;
        EnumC1887jb0 enumC1887jb1 = EnumC1887jb0.SECURE;
        if (enumC1887jb0 != enumC1887jb1) {
            b.M("Failed to prove a closest encloser");
            return bVarI.d;
        }
        if (d(b(bVarI.a), c2848tT2, list) == null) {
            b.M("Could not prove that the applicable wildcard did not exist");
            return EnumC1887jb0.BOGUS;
        }
        if ((bVarI.c.U() & 1) != 1) {
            return enumC1887jb1;
        }
        b.M("NSEC3 nameerror proof: nc has optout");
        return EnumC1887jb0.INSECURE;
    }

    public EnumC1887jb0 k(List<C1761i90> list, C2848tT c2848tT, C2848tT c2848tT2) {
        if (list == null || list.isEmpty()) {
            return EnumC1887jb0.BOGUS;
        }
        C1877jT c1877jTE = e(c2848tT, c2848tT2, list);
        if (c1877jTE != null) {
            if (c1877jTE.a0(6) || c1877jTE.a0(43)) {
                return EnumC1887jb0.BOGUS;
            }
            return !c1877jTE.a0(2) ? EnumC1887jb0.INDETERMINATE : EnumC1887jb0.SECURE;
        }
        b bVarI = i(c2848tT, c2848tT2, list);
        if (bVarI.d != EnumC1887jb0.SECURE) {
            return EnumC1887jb0.BOGUS;
        }
        return (bVarI.c.U() & 1) != 1 ? EnumC1887jb0.BOGUS : EnumC1887jb0.INSECURE;
    }

    public C1281dI l(List<C1761i90> list, C2848tT c2848tT, int i, C2848tT c2848tT2) {
        if (list == null || list.isEmpty()) {
            return new C1281dI(EnumC1887jb0.BOGUS, 12, U40.a("failed.nsec3.none", new Object[0]));
        }
        C1877jT c1877jTE = e(c2848tT, c2848tT2, list);
        if (c1877jTE != null) {
            if (c1877jTE.a0(i)) {
                b.M("Matching NSEC3 proved that type existed!");
                return new C1281dI(EnumC1887jb0.BOGUS, 6, U40.a("failed.nsec3.type_exists", new Object[0]));
            }
            if (c1877jTE.a0(5)) {
                b.M("Matching NSEC3 proved that a CNAME existed!");
                return new C1281dI(EnumC1887jb0.BOGUS, 6, U40.a("failed.nsec3.cname_exists", new Object[0]));
            }
            if (i == 43 && c1877jTE.a0(6) && !C2848tT.v.equals(c2848tT)) {
                b.M("Apex NSEC3 abused for no DS proof, bogus");
                return new C1281dI(EnumC1887jb0.BOGUS, 6, U40.a("failed.nsec3.apex_abuse", new Object[0]));
            }
            if (i == 43 || !c1877jTE.a0(2) || c1877jTE.a0(6)) {
                return new C1281dI(EnumC1887jb0.SECURE, -1, null);
            }
            if (c1877jTE.a0(43)) {
                b.M("Matching NSEC3 is a delegation, bogus");
                return new C1281dI(EnumC1887jb0.BOGUS, 6, U40.a("failed.nsec3.delegation", new Object[0]));
            }
            b.M("Matching NSEC3 is insecure delegation");
            return new C1281dI(EnumC1887jb0.INSECURE, -1, null);
        }
        b bVarI = i(c2848tT, c2848tT2, list);
        EnumC1887jb0 enumC1887jb0 = bVarI.d;
        EnumC1887jb0 enumC1887jb1 = EnumC1887jb0.BOGUS;
        if (enumC1887jb0 == enumC1887jb1) {
            b.M("Did not match qname, nor found a proven closest encloser");
            return new C1281dI(enumC1887jb1, 6, U40.a("failed.nsec3.qname_ce", new Object[0]));
        }
        EnumC1887jb0 enumC1887jb2 = bVarI.d;
        EnumC1887jb0 enumC1887jb3 = EnumC1887jb0.INSECURE;
        if (enumC1887jb2 == enumC1887jb3 && i != 43) {
            b.M("Closest NSEC3 is insecure delegation");
            return new C1281dI(enumC1887jb3, -1, null);
        }
        C1877jT c1877jTE2 = e(b(bVarI.a), c2848tT2, list);
        if (c1877jTE2 == null) {
            if (bVarI.c == null) {
                b.M("No next closer NSEC3");
                return new C1281dI(enumC1887jb1, 12, U40.a("failed.nsec3.no_next", new Object[0]));
            }
            if ((bVarI.c.U() & 1) != 0) {
                return new C1281dI(enumC1887jb3, -1, null);
            }
            if (i != 43) {
                b.M("Covering NSEC3 was not opt-out in an opt-out DS NOERROR/NODATA case");
                return new C1281dI(enumC1887jb1, 6, U40.a("failed.nsec3.not_optout", new Object[0]));
            }
            b.M("Could not find matching NSEC3, nor matching wildcard, and qtype is not DS -- no more options");
            return new C1281dI(enumC1887jb1, 12, U40.a("failed.nsec3.not_found", new Object[0]));
        }
        if (c1877jTE2.a0(i)) {
            b.C(C3080vp0.e(i), "Matching wildcard has qtype {}");
            return new C1281dI(enumC1887jb1, 6, U40.a("failed.nsec3.type_exists_wc", new Object[0]));
        }
        if (c1877jTE2.a0(5)) {
            b.M("Matching wildcard has a CNAME, bogus");
            return new C1281dI(enumC1887jb1, 6, U40.a("failed.nsec3.cname_exists_wc", new Object[0]));
        }
        if (i == 43 && c2848tT.s() != 1 && c1877jTE2.a0(6)) {
            b.M("Matching wildcard for no DS proof has a SOA, bogus");
            return new C1281dI(enumC1887jb1, 6, U40.a("failed.nsec3.wc_soa", new Object[0]));
        }
        if (i != 43 && c1877jTE2.a0(2) && !c1877jTE2.a0(6)) {
            b.M("Matching wildcard is a delegation, bogus");
            return new C1281dI(enumC1887jb1, 6, U40.a("failed.nsec3.delegation_wc", new Object[0]));
        }
        if (bVarI.c == null || (bVarI.c.U() & 1) != 1) {
            return new C1281dI(EnumC1887jb0.SECURE, -1, null);
        }
        b.M("Matching wildcard is in opt-out range, insecure");
        return new C1281dI(enumC1887jb3, -1, null);
    }

    public EnumC1887jb0 m(List<C1761i90> list, C2848tT c2848tT, C2848tT c2848tT2, C2848tT c2848tT3) {
        if (list == null || list.isEmpty() || c2848tT == null || c2848tT3 == null) {
            return EnumC1887jb0.BOGUS;
        }
        b bVar = new b(new C2848tT(c2848tT3, 1), null);
        bVar.c = d(g(c2848tT, bVar.a), c2848tT2, list);
        if (bVar.c != null) {
            return (bVar.c.U() & 1) == 1 ? EnumC1887jb0.INSECURE : EnumC1887jb0.SECURE;
        }
        b.f("did not find a covering NSEC3 that covered the next closer name to {} from {} (derived from wildcard {})", c2848tT, bVar.a, c2848tT3);
        return EnumC1887jb0.BOGUS;
    }

    public void n(List<C1761i90> list) {
        ListIterator<C1761i90> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (!o(((C1877jT) listIterator.next().m()).V())) {
                listIterator.remove();
            }
        }
    }
}
