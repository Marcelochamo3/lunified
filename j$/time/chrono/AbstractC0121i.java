package j$.time.chrono;

import j$.time.AbstractC0112c;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import j$.util.Objects;

/* JADX INFO: renamed from: j$.time.chrono.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0121i {
    public static Temporal a(InterfaceC0114b interfaceC0114b, Temporal temporal) {
        return temporal.d(interfaceC0114b.y(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static int b(InterfaceC0114b interfaceC0114b, InterfaceC0114b interfaceC0114b2) {
        int iCompare = Long.compare(interfaceC0114b.y(), interfaceC0114b2.y());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC0113a) interfaceC0114b.a()).o().compareTo(interfaceC0114b2.a().o());
    }

    public static int c(InterfaceC0117e interfaceC0117e, InterfaceC0117e interfaceC0117e2) {
        int iCompareTo = interfaceC0117e.c().compareTo(interfaceC0117e2.c());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iU = interfaceC0117e.b().compareTo(interfaceC0117e2.b());
        if (iU != 0) {
            return iU;
        }
        return ((AbstractC0113a) interfaceC0117e.a()).o().compareTo(interfaceC0117e2.a().o());
    }

    public static int d(InterfaceC0123k interfaceC0123k, InterfaceC0123k interfaceC0123k2) {
        int iCompare = Long.compare(interfaceC0123k.T(), interfaceC0123k2.T());
        if (iCompare != 0) {
            return iCompare;
        }
        int iZ = interfaceC0123k.b().Z() - interfaceC0123k2.b().Z();
        if (iZ != 0) {
            return iZ;
        }
        int iG = interfaceC0123k.H().compareTo(interfaceC0123k2.H());
        if (iG != 0) {
            return iG;
        }
        int iCompareTo = interfaceC0123k.v().o().compareTo(interfaceC0123k2.v().o());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        return ((AbstractC0113a) interfaceC0123k.a()).o().compareTo(interfaceC0123k2.a().o());
    }

    public static int e(InterfaceC0123k interfaceC0123k, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.l.a(interfaceC0123k, pVar);
        }
        int i = AbstractC0122j.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i != 1) {
            return i != 2 ? interfaceC0123k.H().r(pVar) : interfaceC0123k.k().c0();
        }
        throw new j$.time.temporal.q("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public static int f(o oVar, j$.time.temporal.a aVar) {
        return aVar == j$.time.temporal.a.ERA ? oVar.getValue() : j$.time.temporal.l.a(oVar, aVar);
    }

    public static long g(o oVar, j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.ERA) {
            return oVar.getValue();
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.q(AbstractC0112c.a("Unsupported field: ", pVar));
        }
        return pVar.t(oVar);
    }

    public static boolean h(InterfaceC0114b interfaceC0114b, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).E();
        }
        return pVar != null && pVar.u(interfaceC0114b);
    }

    public static boolean i(o oVar, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return pVar == j$.time.temporal.a.ERA;
        }
        return pVar != null && pVar.u(oVar);
    }

    public static Object j(InterfaceC0114b interfaceC0114b, TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.l.l() || temporalQuery == j$.time.temporal.l.k() || temporalQuery == j$.time.temporal.l.i() || temporalQuery == j$.time.temporal.l.g()) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.l.e()) {
            return interfaceC0114b.a();
        }
        return temporalQuery == j$.time.temporal.l.j() ? ChronoUnit.DAYS : temporalQuery.queryFrom(interfaceC0114b);
    }

    public static Object k(InterfaceC0117e interfaceC0117e, TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.l.l() || temporalQuery == j$.time.temporal.l.k() || temporalQuery == j$.time.temporal.l.i()) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.l.g()) {
            return interfaceC0117e.b();
        }
        if (temporalQuery == j$.time.temporal.l.e()) {
            return interfaceC0117e.a();
        }
        return temporalQuery == j$.time.temporal.l.j() ? ChronoUnit.NANOS : temporalQuery.queryFrom(interfaceC0117e);
    }

    public static Object l(InterfaceC0123k interfaceC0123k, TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.l.k() || temporalQuery == j$.time.temporal.l.l()) {
            return interfaceC0123k.v();
        }
        if (temporalQuery == j$.time.temporal.l.i()) {
            return interfaceC0123k.k();
        }
        if (temporalQuery == j$.time.temporal.l.g()) {
            return interfaceC0123k.b();
        }
        if (temporalQuery == j$.time.temporal.l.e()) {
            return interfaceC0123k.a();
        }
        return temporalQuery == j$.time.temporal.l.j() ? ChronoUnit.NANOS : temporalQuery.queryFrom(interfaceC0123k);
    }

    public static Object m(o oVar, TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.l.j() ? ChronoUnit.ERAS : j$.time.temporal.l.c(oVar, temporalQuery);
    }

    public static long n(InterfaceC0117e interfaceC0117e, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((interfaceC0117e.c().y() * 86400) + ((long) interfaceC0117e.b().m0())) - ((long) zoneOffset.c0());
    }

    public static long o(InterfaceC0123k interfaceC0123k) {
        return ((interfaceC0123k.c().y() * 86400) + ((long) interfaceC0123k.b().m0())) - ((long) interfaceC0123k.k().c0());
    }

    public static n p(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        Object objRequireNonNull = (n) temporalAccessor.C(j$.time.temporal.l.e());
        u uVar = u.d;
        if (objRequireNonNull == null) {
            objRequireNonNull = Objects.requireNonNull(uVar, "defaultObj");
        }
        return (n) objRequireNonNull;
    }
}
