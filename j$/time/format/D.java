package j$.time.format;

import j$.time.AbstractC0112c;
import j$.time.C0111b;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC0113a;
import j$.time.chrono.InterfaceC0114b;
import j$.time.chrono.InterfaceC0117e;
import j$.time.chrono.InterfaceC0123k;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class D implements TemporalAccessor {
    ZoneId b;
    j$.time.chrono.n c;
    boolean d;
    private E e;
    private InterfaceC0114b f;
    private j$.time.m g;
    final HashMap a = new HashMap();
    j$.time.v h = j$.time.v.d;

    D() {
    }

    private void A(InterfaceC0114b interfaceC0114b) {
        InterfaceC0114b interfaceC0114b2 = this.f;
        if (interfaceC0114b2 != null) {
            if (interfaceC0114b == null || interfaceC0114b2.equals(interfaceC0114b)) {
                return;
            }
            throw new C0111b("Conflict found: Fields resolved to two different dates: " + this.f + " " + interfaceC0114b);
        }
        if (interfaceC0114b != null) {
            if (((AbstractC0113a) this.c).equals(interfaceC0114b.a())) {
                this.f = interfaceC0114b;
                return;
            }
            throw new C0111b("ChronoLocalDate must use the effective parsed chronology: " + this.c);
        }
    }

    private void D(j$.time.temporal.a aVar, j$.time.temporal.a aVar2, Long l) {
        Long l2 = (Long) this.a.put(aVar2, l);
        if (l2 == null || l2.longValue() == l.longValue()) {
            return;
        }
        throw new C0111b("Conflict found: " + aVar2 + " " + l2 + " differs from " + aVar2 + " " + l + " while resolving  " + aVar);
    }

    private void h(TemporalAccessor temporalAccessor) {
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            j$.time.temporal.p pVar = (j$.time.temporal.p) entry.getKey();
            if (temporalAccessor.g(pVar)) {
                try {
                    long jX = temporalAccessor.x(pVar);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (jX != jLongValue) {
                        throw new C0111b("Conflict found: Field " + pVar + " " + jX + " differs from " + pVar + " " + jLongValue + " derived from " + temporalAccessor);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    private void n() {
        HashMap map = this.a;
        if (map.containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
            ZoneId zoneId = this.b;
            if (zoneId != null) {
                o(zoneId);
                return;
            }
            Long l = (Long) map.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l != null) {
                o(ZoneOffset.f0(l.intValue()));
            }
        }
    }

    private void o(ZoneId zoneId) {
        HashMap map = this.a;
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        InterfaceC0123k interfaceC0123kL = this.c.L(Instant.ofEpochSecond(((Long) map.remove(aVar)).longValue()), zoneId);
        A(interfaceC0123kL.c());
        D(aVar, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(interfaceC0123kL.b().m0()));
    }

    private void s(long j, long j2, long j3, long j4) {
        j$.time.m mVarC0;
        j$.time.v vVarB;
        if (this.e == E.LENIENT) {
            long jF = j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.l(j, 3600000000000L), j$.com.android.tools.r8.a.l(j2, 60000000000L)), j$.com.android.tools.r8.a.l(j3, 1000000000L)), j4);
            int iK = (int) j$.com.android.tools.r8.a.k(jF, 86400000000000L);
            mVarC0 = j$.time.m.d0(j$.com.android.tools.r8.a.j(jF, 86400000000000L));
            vVarB = j$.time.v.b(iK);
        } else {
            int iU = j$.time.temporal.a.MINUTE_OF_HOUR.U(j2);
            int iU2 = j$.time.temporal.a.NANO_OF_SECOND.U(j4);
            if (this.e == E.SMART && j == 24 && iU == 0 && j3 == 0 && iU2 == 0) {
                mVarC0 = j$.time.m.g;
                vVarB = j$.time.v.b(1);
            } else {
                mVarC0 = j$.time.m.c0(j$.time.temporal.a.HOUR_OF_DAY.U(j), iU, j$.time.temporal.a.SECOND_OF_MINUTE.U(j3), iU2);
                vVarB = j$.time.v.d;
            }
        }
        z(mVarC0, vVarB);
    }

    private void w() {
        j$.time.temporal.a aVar;
        long jF;
        HashMap map = this.a;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.CLOCK_HOUR_OF_DAY;
        if (map.containsKey(aVar2)) {
            long jLongValue = ((Long) map.remove(aVar2)).longValue();
            E e = this.e;
            if (e == E.STRICT || (e == E.SMART && jLongValue != 0)) {
                aVar2.V(jLongValue);
            }
            j$.time.temporal.a aVar3 = j$.time.temporal.a.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            D(aVar2, aVar3, Long.valueOf(jLongValue));
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.CLOCK_HOUR_OF_AMPM;
        if (map.containsKey(aVar4)) {
            long jLongValue2 = ((Long) map.remove(aVar4)).longValue();
            E e2 = this.e;
            if (e2 == E.STRICT || (e2 == E.SMART && jLongValue2 != 0)) {
                aVar4.V(jLongValue2);
            }
            D(aVar4, j$.time.temporal.a.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        j$.time.temporal.a aVar5 = j$.time.temporal.a.AMPM_OF_DAY;
        if (map.containsKey(aVar5)) {
            j$.time.temporal.a aVar6 = j$.time.temporal.a.HOUR_OF_AMPM;
            if (map.containsKey(aVar6)) {
                long jLongValue3 = ((Long) map.remove(aVar5)).longValue();
                long jLongValue4 = ((Long) map.remove(aVar6)).longValue();
                if (this.e == E.LENIENT) {
                    aVar = j$.time.temporal.a.HOUR_OF_DAY;
                    jF = j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.l(jLongValue3, 12), jLongValue4);
                } else {
                    aVar5.V(jLongValue3);
                    aVar6.V(jLongValue3);
                    aVar = j$.time.temporal.a.HOUR_OF_DAY;
                    jF = (jLongValue3 * 12) + jLongValue4;
                }
                D(aVar5, aVar, Long.valueOf(jF));
            }
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.NANO_OF_DAY;
        if (map.containsKey(aVar7)) {
            long jLongValue5 = ((Long) map.remove(aVar7)).longValue();
            if (this.e != E.LENIENT) {
                aVar7.V(jLongValue5);
            }
            D(aVar7, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            D(aVar7, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            D(aVar7, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / 1000000000) % 60));
            D(aVar7, j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue5 % 1000000000));
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.MICRO_OF_DAY;
        if (map.containsKey(aVar8)) {
            long jLongValue6 = ((Long) map.remove(aVar8)).longValue();
            if (this.e != E.LENIENT) {
                aVar8.V(jLongValue6);
            }
            D(aVar8, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            D(aVar8, j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.MILLI_OF_DAY;
        if (map.containsKey(aVar9)) {
            long jLongValue7 = ((Long) map.remove(aVar9)).longValue();
            if (this.e != E.LENIENT) {
                aVar9.V(jLongValue7);
            }
            D(aVar9, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            D(aVar9, j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.SECOND_OF_DAY;
        if (map.containsKey(aVar10)) {
            long jLongValue8 = ((Long) map.remove(aVar10)).longValue();
            if (this.e != E.LENIENT) {
                aVar10.V(jLongValue8);
            }
            D(aVar10, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            D(aVar10, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            D(aVar10, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        j$.time.temporal.a aVar11 = j$.time.temporal.a.MINUTE_OF_DAY;
        if (map.containsKey(aVar11)) {
            long jLongValue9 = ((Long) map.remove(aVar11)).longValue();
            if (this.e != E.LENIENT) {
                aVar11.V(jLongValue9);
            }
            D(aVar11, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            D(aVar11, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        j$.time.temporal.a aVar12 = j$.time.temporal.a.NANO_OF_SECOND;
        if (map.containsKey(aVar12)) {
            long jLongValue10 = ((Long) map.get(aVar12)).longValue();
            E e3 = this.e;
            E e4 = E.LENIENT;
            if (e3 != e4) {
                aVar12.V(jLongValue10);
            }
            j$.time.temporal.a aVar13 = j$.time.temporal.a.MICRO_OF_SECOND;
            if (map.containsKey(aVar13)) {
                long jLongValue11 = ((Long) map.remove(aVar13)).longValue();
                if (this.e != e4) {
                    aVar13.V(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                D(aVar13, aVar12, Long.valueOf(jLongValue10));
            }
            j$.time.temporal.a aVar14 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (map.containsKey(aVar14)) {
                long jLongValue12 = ((Long) map.remove(aVar14)).longValue();
                if (this.e != e4) {
                    aVar14.V(jLongValue12);
                }
                D(aVar14, aVar12, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        j$.time.temporal.a aVar15 = j$.time.temporal.a.HOUR_OF_DAY;
        if (map.containsKey(aVar15)) {
            j$.time.temporal.a aVar16 = j$.time.temporal.a.MINUTE_OF_HOUR;
            if (map.containsKey(aVar16)) {
                j$.time.temporal.a aVar17 = j$.time.temporal.a.SECOND_OF_MINUTE;
                if (map.containsKey(aVar17) && map.containsKey(aVar12)) {
                    s(((Long) map.remove(aVar15)).longValue(), ((Long) map.remove(aVar16)).longValue(), ((Long) map.remove(aVar17)).longValue(), ((Long) map.remove(aVar12)).longValue());
                }
            }
        }
    }

    private void z(j$.time.m mVar, j$.time.v vVar) {
        j$.time.m mVar2 = this.g;
        if (mVar2 == null) {
            this.g = mVar;
        } else {
            if (!mVar2.equals(mVar)) {
                throw new C0111b("Conflict found: Fields resolved to different times: " + this.g + " " + mVar);
            }
            j$.time.v vVar2 = this.h;
            vVar2.getClass();
            j$.time.v vVar3 = j$.time.v.d;
            if (vVar2 != vVar3 && vVar != vVar3 && !this.h.equals(vVar)) {
                throw new C0111b("Conflict found: Fields resolved to different excess periods: " + this.h + " " + vVar);
            }
        }
        this.h = vVar;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object C(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.l.l()) {
            return this.b;
        }
        if (temporalQuery == j$.time.temporal.l.e()) {
            return this.c;
        }
        if (temporalQuery == j$.time.temporal.l.f()) {
            InterfaceC0114b interfaceC0114b = this.f;
            if (interfaceC0114b != null) {
                return j$.time.i.W(interfaceC0114b);
            }
            return null;
        }
        if (temporalQuery == j$.time.temporal.l.g()) {
            return this.g;
        }
        if (temporalQuery != j$.time.temporal.l.i()) {
            if (temporalQuery != j$.time.temporal.l.k() && temporalQuery == j$.time.temporal.l.j()) {
                return null;
            }
            return temporalQuery.queryFrom(this);
        }
        Long l = (Long) this.a.get(j$.time.temporal.a.OFFSET_SECONDS);
        if (l != null) {
            return ZoneOffset.f0(l.intValue());
        }
        ZoneId zoneId = this.b;
        return zoneId instanceof ZoneOffset ? zoneId : temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        if (this.a.containsKey(pVar)) {
            return true;
        }
        InterfaceC0114b interfaceC0114b = this.f;
        if (interfaceC0114b != null && interfaceC0114b.g(pVar)) {
            return true;
        }
        j$.time.m mVar = this.g;
        if (mVar == null || !mVar.g(pVar)) {
            return (pVar == null || (pVar instanceof j$.time.temporal.a) || !pVar.u(this)) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:142:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x01d2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x01be  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d8  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    final void i(E e, Set set) {
        j$.time.temporal.p pVar;
        InterfaceC0123k interfaceC0123kQ;
        j$.time.temporal.a aVar;
        Long lValueOf;
        j$.time.temporal.p pVar2;
        HashMap map = this.a;
        if (set != null) {
            map.keySet().retainAll(set);
        }
        this.e = e;
        n();
        A(this.c.h(map, this.e));
        w();
        if (map.size() > 0) {
            int i = 0;
            loop0: while (i < 50) {
                Iterator it = map.entrySet().iterator();
                do {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    pVar2 = (j$.time.temporal.p) ((Map.Entry) it.next()).getKey();
                    TemporalAccessor temporalAccessorR = pVar2.r(map, this, this.e);
                    if (temporalAccessorR != null) {
                        if (temporalAccessorR instanceof InterfaceC0123k) {
                            InterfaceC0123k interfaceC0123k = (InterfaceC0123k) temporalAccessorR;
                            ZoneId zoneId = this.b;
                            if (zoneId == null) {
                                this.b = interfaceC0123k.v();
                            } else if (!zoneId.equals(interfaceC0123k.v())) {
                                throw new C0111b("ChronoZonedDateTime must use the effective parsed zone: " + this.b);
                            }
                            temporalAccessorR = interfaceC0123k.H();
                        }
                        if (!(temporalAccessorR instanceof InterfaceC0117e)) {
                            if (!(temporalAccessorR instanceof InterfaceC0114b)) {
                                if (!(temporalAccessorR instanceof j$.time.m)) {
                                    throw new C0111b("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                                }
                                z((j$.time.m) temporalAccessorR, j$.time.v.d);
                                break;
                            }
                            A((InterfaceC0114b) temporalAccessorR);
                            break;
                        }
                        InterfaceC0117e interfaceC0117e = (InterfaceC0117e) temporalAccessorR;
                        z(interfaceC0117e.b(), j$.time.v.d);
                        A(interfaceC0117e.c());
                        break;
                    }
                } while (map.containsKey(pVar2));
                i++;
            }
            if (i == 50) {
                throw new C0111b("One of the parsed fields has an incorrectly implemented resolve method");
            }
            if (i > 0) {
                n();
                A(this.c.h(map, this.e));
                w();
            }
        }
        if (this.g == null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (map.containsKey(aVar2)) {
                long jLongValue = ((Long) map.remove(aVar2)).longValue();
                j$.time.temporal.a aVar3 = j$.time.temporal.a.MICRO_OF_SECOND;
                if (map.containsKey(aVar3)) {
                    long jLongValue2 = (((Long) map.get(aVar3)).longValue() % 1000) + (jLongValue * 1000);
                    D(aVar2, aVar3, Long.valueOf(jLongValue2));
                    map.remove(aVar3);
                    aVar = j$.time.temporal.a.NANO_OF_SECOND;
                    lValueOf = Long.valueOf(jLongValue2 * 1000);
                } else {
                    aVar = j$.time.temporal.a.NANO_OF_SECOND;
                    lValueOf = Long.valueOf(jLongValue * 1000000);
                }
                map.put(aVar, lValueOf);
            } else {
                Object obj = j$.time.temporal.a.MICRO_OF_SECOND;
                if (map.containsKey(obj)) {
                    map.put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(((Long) map.remove(obj)).longValue() * 1000));
                }
            }
            Object obj2 = j$.time.temporal.a.HOUR_OF_DAY;
            Long l = (Long) map.get(obj2);
            if (l != null) {
                Object obj3 = j$.time.temporal.a.MINUTE_OF_HOUR;
                Long l2 = (Long) map.get(obj3);
                Object obj4 = j$.time.temporal.a.SECOND_OF_MINUTE;
                Long l3 = (Long) map.get(obj4);
                Object obj5 = j$.time.temporal.a.NANO_OF_SECOND;
                Long l4 = (Long) map.get(obj5);
                if ((l2 != null || (l3 == null && l4 == null)) && (l2 == null || l3 != null || l4 == null)) {
                    s(l.longValue(), l2 != null ? l2.longValue() : 0L, l3 != null ? l3.longValue() : 0L, l4 != null ? l4.longValue() : 0L);
                    map.remove(obj2);
                    map.remove(obj3);
                    map.remove(obj4);
                    map.remove(obj5);
                    if (this.e != E.LENIENT && map.size() > 0) {
                        for (Map.Entry entry : map.entrySet()) {
                            pVar = (j$.time.temporal.p) entry.getKey();
                            if (!(pVar instanceof j$.time.temporal.a) && ((j$.time.temporal.a) pVar).W()) {
                                ((j$.time.temporal.a) pVar).V(((Long) entry.getValue()).longValue());
                            }
                        }
                    }
                }
            } else if (this.e != E.LENIENT) {
                while (r0.hasNext()) {
                    pVar = (j$.time.temporal.p) entry.getKey();
                    if (!(pVar instanceof j$.time.temporal.a)) {
                    }
                }
            }
        } else if (this.e != E.LENIENT) {
            while (r0.hasNext()) {
                pVar = (j$.time.temporal.p) entry.getKey();
                if (!(pVar instanceof j$.time.temporal.a)) {
                }
            }
        }
        InterfaceC0114b interfaceC0114b = this.f;
        if (interfaceC0114b != null) {
            h(interfaceC0114b);
        }
        j$.time.m mVar = this.g;
        if (mVar != null) {
            h(mVar);
            if (this.f != null && map.size() > 0) {
                h(this.f.B(this.g));
            }
        }
        if (this.f != null && this.g != null) {
            j$.time.v vVar = this.h;
            vVar.getClass();
            j$.time.v vVar2 = j$.time.v.d;
            if (vVar != vVar2) {
                this.f = this.f.j(this.h);
                this.h = vVar2;
            }
        }
        if (this.g == null && (map.containsKey(j$.time.temporal.a.INSTANT_SECONDS) || map.containsKey(j$.time.temporal.a.SECOND_OF_DAY) || map.containsKey(j$.time.temporal.a.SECOND_OF_MINUTE))) {
            j$.time.temporal.a aVar4 = j$.time.temporal.a.NANO_OF_SECOND;
            if (map.containsKey(aVar4)) {
                long jLongValue3 = ((Long) map.get(aVar4)).longValue();
                map.put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue3 / 1000));
                map.put(j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue3 / 1000000));
            } else {
                map.put(aVar4, 0L);
                map.put(j$.time.temporal.a.MICRO_OF_SECOND, 0L);
                map.put(j$.time.temporal.a.MILLI_OF_SECOND, 0L);
            }
        }
        if (this.f == null || this.g == null) {
            return;
        }
        Long l5 = (Long) map.get(j$.time.temporal.a.OFFSET_SECONDS);
        if (l5 != null) {
            interfaceC0123kQ = this.f.B(this.g).q(ZoneOffset.f0(l5.intValue()));
        } else if (this.b == null) {
            return;
        } else {
            interfaceC0123kQ = this.f.B(this.g).q(this.b);
        }
        map.put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(interfaceC0123kQ.T()));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int r(j$.time.temporal.p pVar) {
        return j$.time.temporal.l.a(this, pVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.a);
        sb.append(',');
        sb.append(this.c);
        if (this.b != null) {
            sb.append(',');
            sb.append(this.b);
        }
        if (this.f != null || this.g != null) {
            sb.append(" resolved to ");
            InterfaceC0114b interfaceC0114b = this.f;
            if (interfaceC0114b != null) {
                sb.append(interfaceC0114b);
                if (this.g != null) {
                    sb.append('T');
                    sb.append(this.g);
                }
            } else {
                sb.append(this.g);
            }
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ j$.time.temporal.r u(j$.time.temporal.p pVar) {
        return j$.time.temporal.l.d(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long x(j$.time.temporal.p pVar) {
        Objects.requireNonNull(pVar, "field");
        Long l = (Long) this.a.get(pVar);
        if (l != null) {
            return l.longValue();
        }
        InterfaceC0114b interfaceC0114b = this.f;
        if (interfaceC0114b != null && interfaceC0114b.g(pVar)) {
            return this.f.x(pVar);
        }
        j$.time.m mVar = this.g;
        if (mVar != null && mVar.g(pVar)) {
            return this.g.x(pVar);
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.q(AbstractC0112c.a("Unsupported field: ", pVar));
        }
        return pVar.t(this);
    }
}
