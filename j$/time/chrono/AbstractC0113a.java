package j$.time.chrono;

import j$.time.C0111b;
import j$.time.EnumC0125d;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0113a implements n {
    private static final ConcurrentHashMap a = new ConcurrentHashMap();
    private static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final /* synthetic */ int c = 0;

    static {
        new Locale("ja", "JP", "JP");
    }

    protected AbstractC0113a() {
    }

    static void p(HashMap map, j$.time.temporal.a aVar, long j) {
        Long l = (Long) map.get(aVar);
        if (l == null || l.longValue() == j) {
            map.put(aVar, Long.valueOf(j));
            return;
        }
        throw new C0111b("Conflict found: " + aVar + " " + l + " differs from " + aVar + " " + j);
    }

    static n t(String str) {
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap = a;
            n nVar = (n) concurrentHashMap.get(str);
            if (nVar == null) {
                nVar = (n) b.get(str);
            }
            if (nVar != null) {
                return nVar;
            }
            if (concurrentHashMap.get("ISO") != null) {
                for (n nVar2 : ServiceLoader.load(n.class)) {
                    if (str.equals(nVar2.o()) || str.equals(nVar2.w())) {
                        return nVar2;
                    }
                }
                throw new C0111b("Unknown chronology: " + str);
            }
            q qVar = q.f157o;
            u(qVar, qVar.o());
            x xVar = x.d;
            u(xVar, xVar.o());
            C c2 = C.d;
            u(c2, c2.o());
            I i = I.d;
            u(i, i.o());
            for (AbstractC0113a abstractC0113a : ServiceLoader.load(AbstractC0113a.class, null)) {
                if (!abstractC0113a.o().equals("ISO")) {
                    u(abstractC0113a, abstractC0113a.o());
                }
            }
            u uVar = u.d;
            u(uVar, uVar.o());
        }
    }

    static n u(AbstractC0113a abstractC0113a, String str) {
        String strW;
        n nVar = (n) a.putIfAbsent(str, abstractC0113a);
        if (nVar == null && (strW = abstractC0113a.w()) != null) {
            b.putIfAbsent(strW, abstractC0113a);
        }
        return nVar;
    }

    static InterfaceC0114b x(InterfaceC0114b interfaceC0114b, long j, long j2, long j3) {
        long j4;
        InterfaceC0114b interfaceC0114bE = interfaceC0114b.e(j, (TemporalUnit) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        InterfaceC0114b interfaceC0114bE2 = interfaceC0114bE.e(j2, (TemporalUnit) chronoUnit);
        if (j3 <= 7) {
            if (j3 < 1) {
                interfaceC0114bE2 = interfaceC0114bE2.e(j$.com.android.tools.r8.a.m(j3, 7L) / 7, (TemporalUnit) chronoUnit);
                j4 = j3 + 6;
            }
            return interfaceC0114bE2.t(new j$.time.temporal.n(EnumC0125d.U((int) j3).getValue(), 0));
        }
        j4 = j3 - 1;
        interfaceC0114bE2 = interfaceC0114bE2.e(j4 / 7, (TemporalUnit) chronoUnit);
        j3 = (j4 % 7) + 1;
        return interfaceC0114bE2.t(new j$.time.temporal.n(EnumC0125d.U((int) j3).getValue(), 0));
    }

    void C(HashMap map, j$.time.format.E e) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (e != j$.time.format.E.LENIENT) {
                aVar.V(l.longValue());
            }
            InterfaceC0114b interfaceC0114bD = r().d(1L, (j$.time.temporal.p) j$.time.temporal.a.DAY_OF_MONTH).d(l.longValue(), (j$.time.temporal.p) aVar);
            j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
            p(map, aVar2, interfaceC0114bD.r(aVar2));
            j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
            p(map, aVar3, interfaceC0114bD.r(aVar3));
        }
    }

    @Override // j$.time.chrono.n
    public InterfaceC0117e D(TemporalAccessor temporalAccessor) {
        try {
            return s(temporalAccessor).B(j$.time.m.W(temporalAccessor));
        } catch (C0111b e) {
            throw new C0111b("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + temporalAccessor.getClass(), e);
        }
    }

    InterfaceC0114b E(HashMap map, j$.time.format.E e) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iA = K(aVar).a(((Long) map.remove(aVar)).longValue(), aVar);
        if (e == j$.time.format.E.LENIENT) {
            long jM = j$.com.android.tools.r8.a.m(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L);
            return I(iA, 1, 1).e(jM, (TemporalUnit) ChronoUnit.MONTHS).e(j$.com.android.tools.r8.a.m(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iA2 = K(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iA3 = K(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (e != j$.time.format.E.SMART) {
            return I(iA, iA2, iA3);
        }
        try {
            return I(iA, iA2, iA3);
        } catch (C0111b unused) {
            return I(iA, iA2, 1).t(new j$.time.temporal.o(0));
        }
    }

    InterfaceC0114b U(HashMap map, j$.time.format.E e) {
        o oVarF;
        long jI;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l = (Long) map.remove(aVar);
        if (l == null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.ERA;
            if (!map.containsKey(aVar2)) {
                return null;
            }
            K(aVar2).b(((Long) map.get(aVar2)).longValue(), aVar2);
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
        Long l2 = (Long) map.remove(aVar3);
        int iA = e != j$.time.format.E.LENIENT ? K(aVar).a(l.longValue(), aVar) : j$.com.android.tools.r8.a.e(l.longValue());
        if (l2 != null) {
            p(map, j$.time.temporal.a.YEAR, i(S(K(aVar3).a(l2.longValue(), aVar3)), iA));
            return null;
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.YEAR;
        if (!map.containsKey(aVar4)) {
            if (e == j$.time.format.E.STRICT) {
                map.put(aVar, l);
                return null;
            }
            List listO = O();
            if (listO.isEmpty()) {
                jI = iA;
            } else {
                oVarF = (o) listO.get(listO.size() - 1);
            }
            p(map, aVar4, jI);
            return null;
        }
        oVarF = A(K(aVar4).a(((Long) map.get(aVar4)).longValue(), aVar4), 1).F();
        jI = i(oVarF, iA);
        p(map, aVar4, jI);
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return o().compareTo(((n) obj).o());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC0113a) && o().compareTo(((AbstractC0113a) obj).o()) == 0;
    }

    @Override // j$.time.chrono.n
    public InterfaceC0114b h(HashMap map, j$.time.format.E e) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            return n(((Long) map.remove(aVar)).longValue());
        }
        C(map, e);
        InterfaceC0114b interfaceC0114bU = U(map, e);
        if (interfaceC0114bU != null) {
            return interfaceC0114bU;
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (!map.containsKey(aVar2)) {
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
        if (map.containsKey(aVar3)) {
            if (map.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                return E(map, e);
            }
            j$.time.temporal.a aVar4 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(aVar4)) {
                j$.time.temporal.a aVar5 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(aVar5)) {
                    int iA = K(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (e == j$.time.format.E.LENIENT) {
                        long jM = j$.com.android.tools.r8.a.m(((Long) map.remove(aVar3)).longValue(), 1L);
                        return I(iA, 1, 1).e(jM, (TemporalUnit) ChronoUnit.MONTHS).e(j$.com.android.tools.r8.a.m(((Long) map.remove(aVar4)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).e(j$.com.android.tools.r8.a.m(((Long) map.remove(aVar5)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                    }
                    int iA2 = K(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    InterfaceC0114b interfaceC0114bE = I(iA, iA2, 1).e((K(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5) - 1) + ((K(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                    if (e != j$.time.format.E.STRICT || interfaceC0114bE.r(aVar3) == iA2) {
                        return interfaceC0114bE;
                    }
                    throw new C0111b("Strict mode rejected resolved date as it is in a different month");
                }
                j$.time.temporal.a aVar6 = j$.time.temporal.a.DAY_OF_WEEK;
                if (map.containsKey(aVar6)) {
                    int iA3 = K(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (e == j$.time.format.E.LENIENT) {
                        return x(I(iA3, 1, 1), j$.com.android.tools.r8.a.m(((Long) map.remove(aVar3)).longValue(), 1L), j$.com.android.tools.r8.a.m(((Long) map.remove(aVar4)).longValue(), 1L), j$.com.android.tools.r8.a.m(((Long) map.remove(aVar6)).longValue(), 1L));
                    }
                    int iA4 = K(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    InterfaceC0114b interfaceC0114bT = I(iA3, iA4, 1).e((K(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).t(new j$.time.temporal.n(EnumC0125d.U(K(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6)).getValue(), 0));
                    if (e != j$.time.format.E.STRICT || interfaceC0114bT.r(aVar3) == iA4) {
                        return interfaceC0114bT;
                    }
                    throw new C0111b("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_YEAR;
        if (map.containsKey(aVar7)) {
            int iA5 = K(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
            if (e != j$.time.format.E.LENIENT) {
                return A(iA5, K(aVar7).a(((Long) map.remove(aVar7)).longValue(), aVar7));
            }
            return A(iA5, 1).e(j$.com.android.tools.r8.a.m(((Long) map.remove(aVar7)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(aVar8)) {
            return null;
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(aVar9)) {
            int iA6 = K(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
            if (e == j$.time.format.E.LENIENT) {
                return A(iA6, 1).e(j$.com.android.tools.r8.a.m(((Long) map.remove(aVar8)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).e(j$.com.android.tools.r8.a.m(((Long) map.remove(aVar9)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
            }
            InterfaceC0114b interfaceC0114bE2 = A(iA6, 1).e((K(aVar9).a(((Long) map.remove(aVar9)).longValue(), aVar9) - 1) + ((K(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
            if (e != j$.time.format.E.STRICT || interfaceC0114bE2.r(aVar2) == iA6) {
                return interfaceC0114bE2;
            }
            throw new C0111b("Strict mode rejected resolved date as it is in a different year");
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
        if (!map.containsKey(aVar10)) {
            return null;
        }
        int iA7 = K(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        if (e == j$.time.format.E.LENIENT) {
            return x(A(iA7, 1), 0L, j$.com.android.tools.r8.a.m(((Long) map.remove(aVar8)).longValue(), 1L), j$.com.android.tools.r8.a.m(((Long) map.remove(aVar10)).longValue(), 1L));
        }
        InterfaceC0114b interfaceC0114bT2 = A(iA7, 1).e((K(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).t(new j$.time.temporal.n(EnumC0125d.U(K(aVar10).a(((Long) map.remove(aVar10)).longValue(), aVar10)).getValue(), 0));
        if (e != j$.time.format.E.STRICT || interfaceC0114bT2.r(aVar2) == iA7) {
            return interfaceC0114bT2;
        }
        throw new C0111b("Strict mode rejected resolved date as it is in a different year");
    }

    public final int hashCode() {
        return getClass().hashCode() ^ o().hashCode();
    }

    public abstract /* synthetic */ InterfaceC0114b r();

    public final String toString() {
        return o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [j$.time.chrono.k] */
    @Override // j$.time.chrono.n
    public InterfaceC0123k z(TemporalAccessor temporalAccessor) {
        try {
            ZoneId zoneIdU = ZoneId.U(temporalAccessor);
            try {
                temporalAccessor = L(Instant.from(temporalAccessor), zoneIdU);
                return temporalAccessor;
            } catch (C0111b unused) {
                return m.W(zoneIdU, null, C0119g.U(this, D(temporalAccessor)));
            }
        } catch (C0111b e) {
            throw new C0111b("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + temporalAccessor.getClass(), e);
        }
    }
}
