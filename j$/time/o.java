package j$.time;

import j$.time.chrono.AbstractC0113a;
import j$.time.chrono.AbstractC0121i;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import o.Yu0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements TemporalAccessor, j$.time.temporal.m {
    public static final o APRIL;
    public static final o AUGUST;
    public static final o DECEMBER;
    public static final o FEBRUARY;
    public static final o JANUARY;
    public static final o JULY;
    public static final o JUNE;
    public static final o MARCH;
    public static final o MAY;
    public static final o NOVEMBER;
    public static final o OCTOBER;
    public static final o SEPTEMBER;
    private static final o[] a;
    private static final /* synthetic */ o[] b;

    static {
        o oVar = new o("JANUARY", 0);
        JANUARY = oVar;
        o oVar2 = new o("FEBRUARY", 1);
        FEBRUARY = oVar2;
        o oVar3 = new o("MARCH", 2);
        MARCH = oVar3;
        o oVar4 = new o("APRIL", 3);
        APRIL = oVar4;
        o oVar5 = new o("MAY", 4);
        MAY = oVar5;
        o oVar6 = new o("JUNE", 5);
        JUNE = oVar6;
        o oVar7 = new o("JULY", 6);
        JULY = oVar7;
        o oVar8 = new o("AUGUST", 7);
        AUGUST = oVar8;
        o oVar9 = new o("SEPTEMBER", 8);
        SEPTEMBER = oVar9;
        o oVar10 = new o("OCTOBER", 9);
        OCTOBER = oVar10;
        o oVar11 = new o("NOVEMBER", 10);
        NOVEMBER = oVar11;
        o oVar12 = new o("DECEMBER", 11);
        DECEMBER = oVar12;
        b = new o[]{oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8, oVar9, oVar10, oVar11, oVar12};
        a = values();
    }

    public static o X(int i) {
        if (i >= 1 && i <= 12) {
            return a[i - 1];
        }
        throw new C0111b("Invalid value for MonthOfYear: " + i);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) b.clone();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object C(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.l.e()) {
            return j$.time.chrono.u.d;
        }
        return temporalQuery == j$.time.temporal.l.j() ? ChronoUnit.MONTHS : j$.time.temporal.l.c(this, temporalQuery);
    }

    @Override // j$.time.temporal.m
    public final Temporal E(Temporal temporal) {
        if (!((AbstractC0113a) AbstractC0121i.p(temporal)).equals(j$.time.chrono.u.d)) {
            throw new C0111b("Adjustment only supported on ISO date-time");
        }
        return temporal.d(getValue(), j$.time.temporal.a.MONTH_OF_YEAR);
    }

    public final int U(boolean z) {
        switch (n.a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 91;
            case 3:
                return (z ? 1 : 0) + 152;
            case 4:
                return (z ? 1 : 0) + 244;
            case 5:
                return (z ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z ? 1 : 0) + 60;
            case 8:
                return (z ? 1 : 0) + Yu0.b.h0;
            case 9:
                return (z ? 1 : 0) + 182;
            case 10:
                return (z ? 1 : 0) + 213;
            case 11:
                return (z ? 1 : 0) + 274;
            default:
                return (z ? 1 : 0) + 335;
        }
    }

    public final int V(boolean z) {
        int i = n.a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return z ? 29 : 28;
    }

    public final int W() {
        int i = n.a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 29;
    }

    public final o Y() {
        return a[((((int) 1) + 12) + ordinal()) % 12];
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return pVar == j$.time.temporal.a.MONTH_OF_YEAR;
        }
        return pVar != null && pVar.u(this);
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int r(j$.time.temporal.p pVar) {
        return pVar == j$.time.temporal.a.MONTH_OF_YEAR ? getValue() : j$.time.temporal.l.a(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r u(j$.time.temporal.p pVar) {
        return pVar == j$.time.temporal.a.MONTH_OF_YEAR ? pVar.p() : j$.time.temporal.l.d(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long x(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.q(AbstractC0112c.a("Unsupported field: ", pVar));
        }
        return pVar.t(this);
    }
}
