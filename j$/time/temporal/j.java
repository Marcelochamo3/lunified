package j$.time.temporal;

import j$.time.C0111b;
import j$.time.chrono.AbstractC0121i;
import j$.time.format.E;
import java.util.HashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
final class j implements p {
    public static final j JULIAN_DAY;
    public static final j MODIFIED_JULIAN_DAY;
    public static final j RATA_DIE;
    private static final /* synthetic */ j[] f;
    private static final long serialVersionUID = -7501623920830201812L;
    private final transient String a;
    private final transient TemporalUnit b;
    private final transient TemporalUnit c;
    private final transient r d;
    private final transient long e;

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        j jVar = new j("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = jVar;
        j jVar2 = new j("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = jVar2;
        j jVar3 = new j("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = jVar3;
        f = new j[]{jVar, jVar2, jVar3};
    }

    private j(String str, int i, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j) {
        super(str, i);
        this.a = str2;
        this.d = r.j((-365243219162L) + j, 365241780471L + j);
        this.e = j;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f.clone();
    }

    @Override // j$.time.temporal.p
    public final r C(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.g(a.EPOCH_DAY)) {
            return this.d;
        }
        throw new C0111b("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.p
    public final boolean E() {
        return true;
    }

    @Override // j$.time.temporal.p
    public final r p() {
        return this.d;
    }

    @Override // j$.time.temporal.p
    public final TemporalAccessor r(HashMap map, TemporalAccessor temporalAccessor, E e) {
        long jLongValue = ((Long) map.remove(this)).longValue();
        j$.time.chrono.n nVarP = AbstractC0121i.p(temporalAccessor);
        E e2 = E.LENIENT;
        long j = this.e;
        if (e == e2) {
            return nVarP.n(j$.com.android.tools.r8.a.m(jLongValue, j));
        }
        this.d.b(jLongValue, this);
        return nVarP.n(jLongValue - j);
    }

    @Override // j$.time.temporal.p
    public final long t(TemporalAccessor temporalAccessor) {
        return temporalAccessor.x(a.EPOCH_DAY) + this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // j$.time.temporal.p
    public final boolean u(TemporalAccessor temporalAccessor) {
        return temporalAccessor.g(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.p
    public final Temporal x(Temporal temporal, long j) {
        if (this.d.i(j)) {
            return temporal.d(j$.com.android.tools.r8.a.m(j, this.e), a.EPOCH_DAY);
        }
        throw new C0111b("Invalid value: " + this.a + " " + j);
    }
}
