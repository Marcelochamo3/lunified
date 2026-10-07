package j$.time.temporal;

import j$.time.C0111b;
import j$.time.EnumC0125d;
import j$.time.chrono.u;
import j$.time.format.E;
import java.util.HashMap;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
abstract class g implements p {
    public static final g DAY_OF_QUARTER;
    public static final g QUARTER_OF_YEAR;
    public static final g WEEK_BASED_YEAR;
    public static final g WEEK_OF_WEEK_BASED_YEAR;
    private static final int[] a;
    private static final /* synthetic */ g[] b;

    static {
        g gVar = new g() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.p
            public final r C(TemporalAccessor temporalAccessor) {
                if (!u(temporalAccessor)) {
                    throw new q("Unsupported field: DayOfQuarter");
                }
                long jX = temporalAccessor.x(g.QUARTER_OF_YEAR);
                if (jX == 1) {
                    return u.d.R(temporalAccessor.x(a.YEAR)) ? r.j(1L, 91L) : r.j(1L, 90L);
                }
                if (jX == 2) {
                    return r.j(1L, 91L);
                }
                return (jX == 3 || jX == 4) ? r.j(1L, 92L) : p();
            }

            @Override // j$.time.temporal.p
            public final r p() {
                return r.k(1L, 90L, 92L);
            }

            @Override // j$.time.temporal.g, j$.time.temporal.p
            public final TemporalAccessor r(HashMap map, TemporalAccessor temporalAccessor, E e) {
                long jM;
                j$.time.i iVarO0;
                a aVar = a.YEAR;
                Long l = (Long) map.get(aVar);
                p pVar = g.QUARTER_OF_YEAR;
                Long l2 = (Long) map.get(pVar);
                if (l == null || l2 == null) {
                    return null;
                }
                int iU = aVar.U(l.longValue());
                long jLongValue = ((Long) map.get(g.DAY_OF_QUARTER)).longValue();
                if (!i.a(temporalAccessor)) {
                    throw new C0111b("Resolve requires IsoChronology");
                }
                if (e == E.LENIENT) {
                    iVarO0 = j$.time.i.i0(iU, 1, 1).o0(j$.com.android.tools.r8.a.l(j$.com.android.tools.r8.a.m(l2.longValue(), 1L), 3));
                    jM = j$.com.android.tools.r8.a.m(jLongValue, 1L);
                } else {
                    j$.time.i iVarI0 = j$.time.i.i0(iU, ((pVar.p().a(l2.longValue(), pVar) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        (e == E.STRICT ? C(iVarI0) : p()).b(jLongValue, this);
                    }
                    jM = jLongValue - 1;
                    iVarO0 = iVarI0;
                }
                map.remove(this);
                map.remove(aVar);
                map.remove(pVar);
                return iVarO0.n0(jM);
            }

            @Override // j$.time.temporal.p
            public final long t(TemporalAccessor temporalAccessor) {
                if (!u(temporalAccessor)) {
                    throw new q("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.r(a.DAY_OF_YEAR) - g.a[((temporalAccessor.r(a.MONTH_OF_YEAR) - 1) / 3) + (u.d.R(temporalAccessor.x(a.YEAR)) ? 4 : 0)];
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }

            @Override // j$.time.temporal.p
            public final boolean u(TemporalAccessor temporalAccessor) {
                return temporalAccessor.g(a.DAY_OF_YEAR) && temporalAccessor.g(a.MONTH_OF_YEAR) && temporalAccessor.g(a.YEAR) && i.a(temporalAccessor);
            }

            @Override // j$.time.temporal.p
            public final Temporal x(Temporal temporal, long j) {
                long jT = t(temporal);
                p().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return temporal.d((j - jT) + temporal.x(aVar), aVar);
            }
        };
        DAY_OF_QUARTER = gVar;
        g gVar2 = new g() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.p
            public final r C(TemporalAccessor temporalAccessor) {
                if (u(temporalAccessor)) {
                    return p();
                }
                throw new q("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.p
            public final r p() {
                return r.j(1L, 4L);
            }

            @Override // j$.time.temporal.p
            public final long t(TemporalAccessor temporalAccessor) {
                if (u(temporalAccessor)) {
                    return (temporalAccessor.x(a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new q("Unsupported field: QuarterOfYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }

            @Override // j$.time.temporal.p
            public final boolean u(TemporalAccessor temporalAccessor) {
                return temporalAccessor.g(a.MONTH_OF_YEAR) && i.a(temporalAccessor);
            }

            @Override // j$.time.temporal.p
            public final Temporal x(Temporal temporal, long j) {
                long jT = t(temporal);
                p().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return temporal.d(((j - jT) * 3) + temporal.x(aVar), aVar);
            }
        };
        QUARTER_OF_YEAR = gVar2;
        g gVar3 = new g() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.p
            public final r C(TemporalAccessor temporalAccessor) {
                if (u(temporalAccessor)) {
                    return g.Y(j$.time.i.W(temporalAccessor));
                }
                throw new q("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.p
            public final r p() {
                return r.k(1L, 52L, 53L);
            }

            @Override // j$.time.temporal.g, j$.time.temporal.p
            public final TemporalAccessor r(HashMap map, TemporalAccessor temporalAccessor, E e) {
                j$.time.i iVarD;
                long j;
                long j2;
                p pVar = g.WEEK_BASED_YEAR;
                Long l = (Long) map.get(pVar);
                a aVar = a.DAY_OF_WEEK;
                Long l2 = (Long) map.get(aVar);
                if (l == null || l2 == null) {
                    return null;
                }
                int iA = pVar.p().a(l.longValue(), pVar);
                long jLongValue = ((Long) map.get(g.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                if (!i.a(temporalAccessor)) {
                    throw new C0111b("Resolve requires IsoChronology");
                }
                j$.time.i iVarI0 = j$.time.i.i0(iA, 1, 4);
                if (e == E.LENIENT) {
                    long jLongValue2 = l2.longValue();
                    if (jLongValue2 > 7) {
                        j2 = jLongValue2 - 1;
                        iVarI0 = iVarI0.p0(j2 / 7);
                    } else {
                        j = 1;
                        if (jLongValue2 < 1) {
                            iVarI0 = iVarI0.p0(j$.com.android.tools.r8.a.m(jLongValue2, 7L) / 7);
                            j2 = jLongValue2 + 6;
                        }
                        iVarD = iVarI0.p0(j$.com.android.tools.r8.a.m(jLongValue, j)).d(jLongValue2, aVar);
                    }
                    j = 1;
                    jLongValue2 = (j2 % 7) + 1;
                    iVarD = iVarI0.p0(j$.com.android.tools.r8.a.m(jLongValue, j)).d(jLongValue2, aVar);
                } else {
                    int iU = aVar.U(l2.longValue());
                    if (jLongValue < 1 || jLongValue > 52) {
                        (e == E.STRICT ? g.Y(iVarI0) : p()).b(jLongValue, this);
                    }
                    iVarD = iVarI0.p0(jLongValue - 1).d(iU, aVar);
                }
                map.remove(this);
                map.remove(pVar);
                map.remove(aVar);
                return iVarD;
            }

            @Override // j$.time.temporal.p
            public final long t(TemporalAccessor temporalAccessor) {
                if (u(temporalAccessor)) {
                    return g.V(j$.time.i.W(temporalAccessor));
                }
                throw new q("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }

            @Override // j$.time.temporal.p
            public final boolean u(TemporalAccessor temporalAccessor) {
                return temporalAccessor.g(a.EPOCH_DAY) && i.a(temporalAccessor);
            }

            @Override // j$.time.temporal.p
            public final Temporal x(Temporal temporal, long j) {
                p().b(j, this);
                return temporal.e(j$.com.android.tools.r8.a.m(j, t(temporal)), ChronoUnit.WEEKS);
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = gVar3;
        g gVar4 = new g() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.p
            public final r C(TemporalAccessor temporalAccessor) {
                if (u(temporalAccessor)) {
                    return a.YEAR.p();
                }
                throw new q("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.p
            public final r p() {
                return a.YEAR.p();
            }

            @Override // j$.time.temporal.p
            public final long t(TemporalAccessor temporalAccessor) {
                if (u(temporalAccessor)) {
                    return g.Z(j$.time.i.W(temporalAccessor));
                }
                throw new q("Unsupported field: WeekBasedYear");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }

            @Override // j$.time.temporal.p
            public final boolean u(TemporalAccessor temporalAccessor) {
                return temporalAccessor.g(a.EPOCH_DAY) && i.a(temporalAccessor);
            }

            @Override // j$.time.temporal.p
            public final Temporal x(Temporal temporal, long j) {
                if (!u(temporal)) {
                    throw new q("Unsupported field: WeekBasedYear");
                }
                int iA = a.YEAR.p().a(j, g.WEEK_BASED_YEAR);
                j$.time.i iVarW = j$.time.i.W(temporal);
                a aVar = a.DAY_OF_WEEK;
                int iR = iVarW.r(aVar);
                int iV = g.V(iVarW);
                if (iV == 53 && g.a0(iA) == 52) {
                    iV = 52;
                }
                j$.time.i iVarI0 = j$.time.i.i0(iA, 1, 4);
                return temporal.t(iVarI0.n0(((iV - 1) * 7) + (iR - iVarI0.r(aVar))));
            }
        };
        WEEK_BASED_YEAR = gVar4;
        b = new g[]{gVar, gVar2, gVar3, gVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    static int V(j$.time.i iVar) {
        int iOrdinal = iVar.Y().ordinal();
        int i = 1;
        int iZ = iVar.Z() - 1;
        int i2 = (3 - iOrdinal) + iZ;
        int i3 = i2 - ((i2 / 7) * 7);
        int i4 = i3 - 3;
        if (i4 < -3) {
            i4 = i3 + 4;
        }
        if (iZ < i4) {
            return (int) r.j(1L, a0(Z(iVar.u0(180).q0(-1L)))).d();
        }
        int i5 = ((iZ - i4) / 7) + 1;
        if (i5 != 53 || i4 == -3 || (i4 == -2 && iVar.J())) {
            i = i5;
        }
        return i;
    }

    static r Y(j$.time.i iVar) {
        return r.j(1L, a0(Z(iVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int Z(j$.time.i iVar) {
        int iC0 = iVar.c0();
        int iZ = iVar.Z();
        if (iZ <= 3) {
            return iZ - iVar.Y().ordinal() < -2 ? iC0 - 1 : iC0;
        }
        if (iZ >= 363) {
            return ((iZ - 363) - (iVar.J() ? 1 : 0)) - iVar.Y().ordinal() >= 0 ? iC0 + 1 : iC0;
        }
        return iC0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a0(int i) {
        j$.time.i iVarI0 = j$.time.i.i0(i, 1, 1);
        if (iVarI0.Y() != EnumC0125d.THURSDAY) {
            return (iVarI0.Y() == EnumC0125d.WEDNESDAY && iVarI0.J()) ? 53 : 52;
        }
        return 53;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) b.clone();
    }

    @Override // j$.time.temporal.p
    public final boolean E() {
        return true;
    }

    public /* synthetic */ TemporalAccessor r(HashMap map, TemporalAccessor temporalAccessor, E e) {
        return null;
    }
}
