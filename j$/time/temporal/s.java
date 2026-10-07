package j$.time.temporal;

import j$.time.C0111b;
import j$.time.chrono.AbstractC0121i;
import j$.time.chrono.InterfaceC0114b;
import j$.time.format.E;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class s implements p {
    private static final r f = r.j(1, 7);
    private static final r g = r.k(0, 4, 6);
    private static final r h = r.k(0, 52, 54);
    private static final r i = r.k(1, 52, 53);
    private final String a;
    private final t b;
    private final TemporalUnit c;
    private final TemporalUnit d;
    private final r e;

    private s(String str, t tVar, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, r rVar) {
        this.a = str;
        this.b = tVar;
        this.c = temporalUnit;
        this.d = temporalUnit2;
        this.e = rVar;
    }

    private static int a(int i2, int i3) {
        return ((i3 - 1) + (i2 + 7)) / 7;
    }

    private int b(TemporalAccessor temporalAccessor) {
        return l.h(temporalAccessor.r(a.DAY_OF_WEEK) - this.b.e().getValue()) + 1;
    }

    private int c(TemporalAccessor temporalAccessor) {
        int iB = b(temporalAccessor);
        int iR = temporalAccessor.r(a.YEAR);
        a aVar = a.DAY_OF_YEAR;
        int iR2 = temporalAccessor.r(aVar);
        int iL = l(iR2, iB);
        int iA = a(iL, iR2);
        if (iA == 0) {
            return iR - 1;
        }
        return iA >= a(iL, this.b.f() + ((int) temporalAccessor.u(aVar).d())) ? iR + 1 : iR;
    }

    private int d(TemporalAccessor temporalAccessor) {
        int iB = b(temporalAccessor);
        a aVar = a.DAY_OF_YEAR;
        int iR = temporalAccessor.r(aVar);
        int iL = l(iR, iB);
        int iA = a(iL, iR);
        if (iA == 0) {
            return d(AbstractC0121i.p(temporalAccessor).s(temporalAccessor).p(iR, ChronoUnit.DAYS));
        }
        if (iA <= 50) {
            return iA;
        }
        int iA2 = a(iL, this.b.f() + ((int) temporalAccessor.u(aVar).d()));
        return iA >= iA2 ? (iA - iA2) + 1 : iA;
    }

    static s e(t tVar) {
        return new s("DayOfWeek", tVar, ChronoUnit.DAYS, ChronoUnit.WEEKS, f);
    }

    private InterfaceC0114b f(j$.time.chrono.n nVar, int i2, int i3, int i4) {
        InterfaceC0114b interfaceC0114bI = nVar.I(i2, 1, 1);
        int iL = l(1, b(interfaceC0114bI));
        return interfaceC0114bI.e(((Math.min(i3, a(iL, this.b.f() + interfaceC0114bI.P()) - 1) - 1) * 7) + (i4 - 1) + (-iL), (TemporalUnit) ChronoUnit.DAYS);
    }

    static s g(t tVar) {
        return new s("WeekBasedYear", tVar, i.d, ChronoUnit.FOREVER, a.YEAR.p());
    }

    static s h(t tVar) {
        return new s("WeekOfMonth", tVar, ChronoUnit.WEEKS, ChronoUnit.MONTHS, g);
    }

    static s i(t tVar) {
        return new s("WeekOfWeekBasedYear", tVar, ChronoUnit.WEEKS, i.d, i);
    }

    private r j(TemporalAccessor temporalAccessor, a aVar) {
        int iL = l(temporalAccessor.r(aVar), b(temporalAccessor));
        r rVarU = temporalAccessor.u(aVar);
        return r.j(a(iL, (int) rVarU.e()), a(iL, (int) rVarU.d()));
    }

    private r k(TemporalAccessor temporalAccessor) {
        a aVar = a.DAY_OF_YEAR;
        if (!temporalAccessor.g(aVar)) {
            return h;
        }
        int iB = b(temporalAccessor);
        int iR = temporalAccessor.r(aVar);
        int iL = l(iR, iB);
        int iA = a(iL, iR);
        if (iA == 0) {
            return k(AbstractC0121i.p(temporalAccessor).s(temporalAccessor).p(iR + 7, ChronoUnit.DAYS));
        }
        int iD = (int) temporalAccessor.u(aVar).d();
        int iA2 = a(iL, this.b.f() + iD);
        return iA >= iA2 ? k(AbstractC0121i.p(temporalAccessor).s(temporalAccessor).e((iD - iR) + 8, (TemporalUnit) ChronoUnit.DAYS)) : r.j(1L, iA2 - 1);
    }

    private int l(int i2, int i3) {
        int iH = l.h(i2 - i3);
        return iH + 1 > this.b.f() ? 7 - iH : -iH;
    }

    @Override // j$.time.temporal.p
    public final r C(TemporalAccessor temporalAccessor) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            return this.e;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            return j(temporalAccessor, a.DAY_OF_MONTH);
        }
        if (temporalUnit == ChronoUnit.YEARS) {
            return j(temporalAccessor, a.DAY_OF_YEAR);
        }
        if (temporalUnit == t.h) {
            return k(temporalAccessor);
        }
        if (temporalUnit == ChronoUnit.FOREVER) {
            return a.YEAR.p();
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + temporalUnit + ", this: " + this);
    }

    @Override // j$.time.temporal.p
    public final boolean E() {
        return true;
    }

    @Override // j$.time.temporal.p
    public final r p() {
        return this.e;
    }

    @Override // j$.time.temporal.p
    public final TemporalAccessor r(HashMap map, TemporalAccessor temporalAccessor, E e) {
        InterfaceC0114b interfaceC0114bE;
        InterfaceC0114b interfaceC0114bE2;
        a aVar;
        InterfaceC0114b interfaceC0114bE3;
        long jLongValue = ((Long) map.get(this)).longValue();
        int iE = j$.com.android.tools.r8.a.e(jLongValue);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        r rVar = this.e;
        t tVar = this.b;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            long jH = l.h((rVar.a(jLongValue, this) - 1) + (tVar.e().getValue() - 1)) + 1;
            map.remove(this);
            map.put(a.DAY_OF_WEEK, Long.valueOf(jH));
        } else {
            a aVar2 = a.DAY_OF_WEEK;
            if (map.containsKey(aVar2)) {
                int iH = l.h(aVar2.U(((Long) map.get(aVar2)).longValue()) - tVar.e().getValue()) + 1;
                j$.time.chrono.n nVarP = AbstractC0121i.p(temporalAccessor);
                a aVar3 = a.YEAR;
                if (map.containsKey(aVar3)) {
                    int iU = aVar3.U(((Long) map.get(aVar3)).longValue());
                    ChronoUnit chronoUnit2 = ChronoUnit.MONTHS;
                    if (temporalUnit == chronoUnit2) {
                        a aVar4 = a.MONTH_OF_YEAR;
                        if (map.containsKey(aVar4)) {
                            long jLongValue2 = ((Long) map.get(aVar4)).longValue();
                            long j = iE;
                            if (e == E.LENIENT) {
                                InterfaceC0114b interfaceC0114bE4 = nVarP.I(iU, 1, 1).e(j$.com.android.tools.r8.a.m(jLongValue2, 1L), (TemporalUnit) chronoUnit2);
                                int iB = b(interfaceC0114bE4);
                                int iR = interfaceC0114bE4.r(a.DAY_OF_MONTH);
                                interfaceC0114bE3 = interfaceC0114bE4.e(j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.l(j$.com.android.tools.r8.a.m(j, a(l(iR, iB), iR)), 7), iH - b(interfaceC0114bE4)), (TemporalUnit) ChronoUnit.DAYS);
                                aVar = aVar4;
                            } else {
                                aVar = aVar4;
                                InterfaceC0114b interfaceC0114bI = nVarP.I(iU, aVar.U(jLongValue2), 1);
                                long jA = rVar.a(j, this);
                                int iB2 = b(interfaceC0114bI);
                                int iR2 = interfaceC0114bI.r(a.DAY_OF_MONTH);
                                InterfaceC0114b interfaceC0114bE5 = interfaceC0114bI.e((((int) (jA - ((long) a(l(iR2, iB2), iR2)))) * 7) + (iH - b(interfaceC0114bI)), (TemporalUnit) ChronoUnit.DAYS);
                                if (e == E.STRICT && interfaceC0114bE5.x(aVar) != jLongValue2) {
                                    throw new C0111b("Strict mode rejected resolved date as it is in a different month");
                                }
                                interfaceC0114bE3 = interfaceC0114bE5;
                            }
                            map.remove(this);
                            map.remove(aVar3);
                            map.remove(aVar);
                            map.remove(aVar2);
                            return interfaceC0114bE3;
                        }
                    }
                    if (temporalUnit == ChronoUnit.YEARS) {
                        long j2 = iE;
                        InterfaceC0114b interfaceC0114bI2 = nVarP.I(iU, 1, 1);
                        if (e == E.LENIENT) {
                            int iB3 = b(interfaceC0114bI2);
                            int iR3 = interfaceC0114bI2.r(a.DAY_OF_YEAR);
                            interfaceC0114bE2 = interfaceC0114bI2.e(j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.l(j$.com.android.tools.r8.a.m(j2, a(l(iR3, iB3), iR3)), 7), iH - b(interfaceC0114bI2)), (TemporalUnit) ChronoUnit.DAYS);
                        } else {
                            long jA2 = rVar.a(j2, this);
                            int iB4 = b(interfaceC0114bI2);
                            int iR4 = interfaceC0114bI2.r(a.DAY_OF_YEAR);
                            InterfaceC0114b interfaceC0114bE6 = interfaceC0114bI2.e((((int) (jA2 - ((long) a(l(iR4, iB4), iR4)))) * 7) + (iH - b(interfaceC0114bI2)), (TemporalUnit) ChronoUnit.DAYS);
                            if (e == E.STRICT && interfaceC0114bE6.x(aVar3) != iU) {
                                throw new C0111b("Strict mode rejected resolved date as it is in a different year");
                            }
                            interfaceC0114bE2 = interfaceC0114bE6;
                        }
                        map.remove(this);
                        map.remove(aVar3);
                        map.remove(aVar2);
                        return interfaceC0114bE2;
                    }
                } else if ((temporalUnit == t.h || temporalUnit == ChronoUnit.FOREVER) && map.containsKey(tVar.f) && map.containsKey(tVar.e)) {
                    int iA = ((s) tVar.f).e.a(((Long) map.get(tVar.f)).longValue(), tVar.f);
                    if (e == E.LENIENT) {
                        interfaceC0114bE = f(nVarP, iA, 1, iH).e(j$.com.android.tools.r8.a.m(((Long) map.get(tVar.e)).longValue(), 1L), (TemporalUnit) chronoUnit);
                    } else {
                        InterfaceC0114b interfaceC0114bF = f(nVarP, iA, ((s) tVar.e).e.a(((Long) map.get(tVar.e)).longValue(), tVar.e), iH);
                        if (e == E.STRICT && c(interfaceC0114bF) != iA) {
                            throw new C0111b("Strict mode rejected resolved date as it is in a different week-based-year");
                        }
                        interfaceC0114bE = interfaceC0114bF;
                    }
                    map.remove(this);
                    map.remove(tVar.f);
                    map.remove(tVar.e);
                    map.remove(aVar2);
                    return interfaceC0114bE;
                }
            }
        }
        return null;
    }

    @Override // j$.time.temporal.p
    public final long t(TemporalAccessor temporalAccessor) {
        int iC;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            iC = b(temporalAccessor);
        } else {
            if (temporalUnit == ChronoUnit.MONTHS) {
                int iB = b(temporalAccessor);
                int iR = temporalAccessor.r(a.DAY_OF_MONTH);
                return a(l(iR, iB), iR);
            }
            if (temporalUnit == ChronoUnit.YEARS) {
                int iB2 = b(temporalAccessor);
                int iR2 = temporalAccessor.r(a.DAY_OF_YEAR);
                return a(l(iR2, iB2), iR2);
            }
            if (temporalUnit == t.h) {
                iC = d(temporalAccessor);
            } else {
                if (temporalUnit != ChronoUnit.FOREVER) {
                    throw new IllegalStateException("unreachable, rangeUnit: " + temporalUnit + ", this: " + this);
                }
                iC = c(temporalAccessor);
            }
        }
        return iC;
    }

    public final String toString() {
        return this.a + "[" + this.b.toString() + "]";
    }

    @Override // j$.time.temporal.p
    public final boolean u(TemporalAccessor temporalAccessor) {
        a aVar;
        if (!temporalAccessor.g(a.DAY_OF_WEEK)) {
            return false;
        }
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        TemporalUnit temporalUnit = this.d;
        if (temporalUnit == chronoUnit) {
            return true;
        }
        if (temporalUnit == ChronoUnit.MONTHS) {
            aVar = a.DAY_OF_MONTH;
        } else if (temporalUnit == ChronoUnit.YEARS || temporalUnit == t.h) {
            aVar = a.DAY_OF_YEAR;
        } else {
            if (temporalUnit != ChronoUnit.FOREVER) {
                return false;
            }
            aVar = a.YEAR;
        }
        return temporalAccessor.g(aVar);
    }

    @Override // j$.time.temporal.p
    public final Temporal x(Temporal temporal, long j) {
        int iA = this.e.a(j, this);
        int iR = temporal.r(this);
        if (iA == iR) {
            return temporal;
        }
        if (this.d != ChronoUnit.FOREVER) {
            return temporal.e(iA - iR, this.c);
        }
        t tVar = this.b;
        return f(AbstractC0121i.p(temporal), (int) j, temporal.r(tVar.e), temporal.r(tVar.c));
    }
}
