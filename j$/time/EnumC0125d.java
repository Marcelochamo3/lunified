package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.time.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0125d implements TemporalAccessor, j$.time.temporal.m {
    public static final EnumC0125d FRIDAY;
    public static final EnumC0125d MONDAY;
    public static final EnumC0125d SATURDAY;
    public static final EnumC0125d SUNDAY;
    public static final EnumC0125d THURSDAY;
    public static final EnumC0125d TUESDAY;
    public static final EnumC0125d WEDNESDAY;
    private static final EnumC0125d[] a;
    private static final /* synthetic */ EnumC0125d[] b;

    static {
        EnumC0125d enumC0125d = new EnumC0125d("MONDAY", 0);
        MONDAY = enumC0125d;
        EnumC0125d enumC0125d2 = new EnumC0125d("TUESDAY", 1);
        TUESDAY = enumC0125d2;
        EnumC0125d enumC0125d3 = new EnumC0125d("WEDNESDAY", 2);
        WEDNESDAY = enumC0125d3;
        EnumC0125d enumC0125d4 = new EnumC0125d("THURSDAY", 3);
        THURSDAY = enumC0125d4;
        EnumC0125d enumC0125d5 = new EnumC0125d("FRIDAY", 4);
        FRIDAY = enumC0125d5;
        EnumC0125d enumC0125d6 = new EnumC0125d("SATURDAY", 5);
        SATURDAY = enumC0125d6;
        EnumC0125d enumC0125d7 = new EnumC0125d("SUNDAY", 6);
        SUNDAY = enumC0125d7;
        b = new EnumC0125d[]{enumC0125d, enumC0125d2, enumC0125d3, enumC0125d4, enumC0125d5, enumC0125d6, enumC0125d7};
        a = values();
    }

    public static EnumC0125d U(int i) {
        if (i >= 1 && i <= 7) {
            return a[i - 1];
        }
        throw new C0111b("Invalid value for DayOfWeek: " + i);
    }

    public static EnumC0125d valueOf(String str) {
        return (EnumC0125d) Enum.valueOf(EnumC0125d.class, str);
    }

    public static EnumC0125d[] values() {
        return (EnumC0125d[]) b.clone();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object C(TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.l.j() ? ChronoUnit.DAYS : j$.time.temporal.l.c(this, temporalQuery);
    }

    @Override // j$.time.temporal.m
    public final Temporal E(Temporal temporal) {
        return temporal.d(getValue(), j$.time.temporal.a.DAY_OF_WEEK);
    }

    public final EnumC0125d V(long j) {
        return a[((((int) (j % 7)) + 7) + ordinal()) % 7];
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return pVar == j$.time.temporal.a.DAY_OF_WEEK;
        }
        return pVar != null && pVar.u(this);
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int r(j$.time.temporal.p pVar) {
        return pVar == j$.time.temporal.a.DAY_OF_WEEK ? getValue() : j$.time.temporal.l.a(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r u(j$.time.temporal.p pVar) {
        return pVar == j$.time.temporal.a.DAY_OF_WEEK ? pVar.p() : j$.time.temporal.l.d(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long x(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.q(AbstractC0112c.a("Unsupported field: ", pVar));
        }
        return pVar.t(this);
    }
}
