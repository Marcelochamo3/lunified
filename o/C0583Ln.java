package o;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import lombok.Generated;

/* JADX INFO: renamed from: o.Ln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0583Ln {

    @Generated
    private static final CL a = DL.d(C0583Ln.class);

    private List<C0552Ki> a(X40 x40, W40 w40) {
        if (!w40.a0().equals(x40.o())) {
            a.z(w40.a0(), x40.o(), "Could not find appropriate key because incorrect keyset was supplied. Wanted: {}, got: {}");
            return Collections.emptyList();
        }
        int iW = w40.W();
        int iU = w40.U();
        ArrayList arrayList = new ArrayList(x40.t());
        Iterator<H50> it = x40.q().iterator();
        while (it.hasNext()) {
            C0552Ki c0552Ki = (C0552Ki) it.next();
            if (c0552Ki.U() == iU && c0552Ki.W() == iW) {
                arrayList.add(c0552Ki);
            }
        }
        return arrayList;
    }

    private C1281dI d(C1761i90 c1761i90, W40 w40, X40 x40, Instant instant) {
        if (!c1761i90.o().y(x40.o())) {
            a.M("Signer name is off-tree");
            return new C1281dI(EnumC1887jb0.BOGUS, 6, U40.a("dnskey.key_offtree", x40.o(), c1761i90.o()));
        }
        List<C0552Ki> listA = a(x40, w40);
        if (listA.isEmpty()) {
            a.v("Could not find appropriate key");
            return new C1281dI(EnumC1887jb0.BOGUS, 9, U40.a("dnskey.no_key", w40.a0()));
        }
        Iterator<C0552Ki> it = listA.iterator();
        if (!it.hasNext()) {
            return new C1281dI(EnumC1887jb0.UNCHECKED, -1, null);
        }
        try {
            C0629Ni.P(c1761i90, w40, it.next(), instant);
            Rr0.t(c1761i90, w40);
            return new C1281dI(EnumC1887jb0.SECURE, -1, null);
        } catch (C0629Ni.f unused) {
            return new C1281dI(EnumC1887jb0.BOGUS, 6, U40.a("dnskey.no_match", new Object[0]));
        } catch (C0629Ni.i unused2) {
            return new C1281dI(EnumC1887jb0.BOGUS, 7, U40.a("dnskey.expired", new Object[0]));
        } catch (C0629Ni.j unused3) {
            return new C1281dI(EnumC1887jb0.BOGUS, 8, U40.a("dnskey.not_yet_valid", new Object[0]));
        } catch (C0629Ni.b e) {
            a.m(c1761i90.o(), C3080vp0.e(c1761i90.getType()), e);
            return new C1281dI(EnumC1887jb0.BOGUS, 6, U40.a("dnskey.invalid", new Object[0]));
        }
    }

    public C1281dI b(X40 x40, C0552Ki c0552Ki, Instant instant) {
        List<W40> listS = x40.s();
        if (listS.isEmpty()) {
            a.q("RRset failed to verify due to lack of signatures");
            return new C1281dI(EnumC1887jb0.BOGUS, 10, U40.a("dnskey.no_sigs", x40.o()));
        }
        C0629Ni.b e = null;
        for (W40 w40 : listS) {
            if (w40.W() == c0552Ki.W()) {
                try {
                    C0629Ni.P(x40, w40, c0552Ki, instant);
                    return new C1281dI(EnumC1887jb0.SECURE, -1, null);
                } catch (C0629Ni.b e2) {
                    e = e2;
                    a.I("Failed to validate RRset", e);
                }
            }
        }
        a.q("RRset failed to verify: all signatures were BOGUS");
        return new C1281dI(EnumC1887jb0.BOGUS, e instanceof C0629Ni.i ? 7 : e instanceof C0629Ni.j ? 8 : 6, "dnskey.invalid");
    }

    public C1281dI c(C1761i90 c1761i90, X40 x40, Instant instant) {
        List<W40> listS = c1761i90.s();
        if (listS.isEmpty()) {
            a.q("RRset failed to verify due to lack of signatures");
            return new C1281dI(EnumC1887jb0.BOGUS, 10, U40.a("validate.bogus.missingsig", new Object[0]));
        }
        C1281dI c1281dI = new C1281dI(EnumC1887jb0.BOGUS, 10, U40.a("validate.bogus.missingsig", new Object[0]));
        Iterator<W40> it = listS.iterator();
        while (it.hasNext()) {
            c1281dI = d(c1761i90, it.next(), x40, instant);
            if (c1281dI.a == EnumC1887jb0.SECURE) {
                return c1281dI;
            }
        }
        a.q("RRset failed to verify: all signatures were BOGUS");
        return c1281dI;
    }
}
