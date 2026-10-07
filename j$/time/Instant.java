package j$.time;

import j$.time.chrono.AbstractC0121i;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class Instant implements Temporal, j$.time.temporal.m, Comparable<Instant>, Serializable {
    private static final long serialVersionUID = -665713676816604388L;
    private final long a;
    private final int b;
    public static final Instant c = new Instant(0, 0);
    public static final Instant MIN = V(-31557014167219200L, 0);
    public static final Instant MAX = V(31556889864403199L, 999999999);

    private Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    private static Instant U(long j, int i) {
        if ((((long) i) | j) == 0) {
            return c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new C0111b("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    public static Instant V(long j, long j2) {
        return U(j$.com.android.tools.r8.a.f(j, j$.com.android.tools.r8.a.k(j2, 1000000000L)), (int) j$.com.android.tools.r8.a.j(j2, 1000000000L));
    }

    private Instant W(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return V(j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.f(this.a, j), j2 / 1000000000), ((long) this.b) + (j2 % 1000000000));
    }

    private long X(Instant instant) {
        long jM = j$.com.android.tools.r8.a.m(instant.a, this.a);
        long j = instant.b - this.b;
        if (jM <= 0 || j >= 0) {
            return (jM >= 0 || j <= 0) ? jM : jM + 1;
        }
        return jM - 1;
    }

    public static Instant from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return V(temporalAccessor.x(j$.time.temporal.a.INSTANT_SECONDS), temporalAccessor.r(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (C0111b e) {
            throw new C0111b("Unable to obtain Instant from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    public static Instant now() {
        return Clock.systemUTC().instant();
    }

    public static Instant ofEpochMilli(long j) {
        long j2 = 1000;
        return U(j$.com.android.tools.r8.a.k(j, j2), ((int) j$.com.android.tools.r8.a.j(j, j2)) * 1000000);
    }

    public static Instant ofEpochSecond(long j) {
        return U(j, 0);
    }

    public static Instant parse(CharSequence charSequence) {
        return (Instant) DateTimeFormatter.i.parse(charSequence, new f());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 2, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object C(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.l.j()) {
            return ChronoUnit.NANOS;
        }
        if (temporalQuery == j$.time.temporal.l.e() || temporalQuery == j$.time.temporal.l.l() || temporalQuery == j$.time.temporal.l.k() || temporalQuery == j$.time.temporal.l.i() || temporalQuery == j$.time.temporal.l.f() || temporalQuery == j$.time.temporal.l.g()) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.m
    public final Temporal E(Temporal temporal) {
        return temporal.d(this.a, j$.time.temporal.a.INSTANT_SECONDS).d(this.b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    final void Y(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.a);
        dataOutput.writeInt(this.b);
    }

    @Override // java.lang.Comparable
    public int compareTo(Instant instant) {
        int iCompare = Long.compare(this.a, instant.a);
        return iCompare != 0 ? iCompare : this.b - instant.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (r7 != r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r7 != r2) goto L20;
     */
    @Override // j$.time.temporal.Temporal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.temporal.Temporal d(long r6, j$.time.temporal.p r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof j$.time.temporal.a
            if (r0 == 0) goto L53
            r0 = r8
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            r0.V(r6)
            int[] r1 = j$.time.g.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            int r2 = r5.b
            long r3 = r5.a
            if (r0 == r1) goto L4c
            r1 = 2
            if (r0 == r1) goto L46
            r1 = 3
            if (r0 == r1) goto L39
            r1 = 4
            if (r0 != r1) goto L2d
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 == 0) goto L2b
            j$.time.Instant r6 = U(r6, r2)
            goto L59
        L2b:
            r6 = r5
            goto L59
        L2d:
            j$.time.temporal.q r6 = new j$.time.temporal.q
            java.lang.String r7 = "Unsupported field: "
            java.lang.String r7 = j$.time.AbstractC0112c.a(r7, r8)
            r6.<init>(r7)
            throw r6
        L39:
            int r7 = (int) r6
            r6 = 1000000(0xf4240, float:1.401298E-39)
            int r7 = r7 * r6
            if (r7 == r2) goto L2b
        L41:
            j$.time.Instant r6 = U(r3, r7)
            goto L59
        L46:
            int r7 = (int) r6
            int r7 = r7 * 1000
            if (r7 == r2) goto L2b
            goto L41
        L4c:
            long r0 = (long) r2
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 == 0) goto L2b
            int r7 = (int) r6
            goto L41
        L53:
            j$.time.temporal.Temporal r6 = r8.x(r5, r6)
            j$.time.Instant r6 = (j$.time.Instant) r6
        L59:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.Instant.d(long, j$.time.temporal.p):j$.time.temporal.Temporal");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.a == instant.a && this.b == instant.b;
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        Instant instantFrom = from(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.p(this, instantFrom);
        }
        int i = g.b[((ChronoUnit) temporalUnit).ordinal()];
        int i2 = this.b;
        long j = this.a;
        switch (i) {
            case 1:
                return j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.l(j$.com.android.tools.r8.a.m(instantFrom.a, j), 1000000000L), instantFrom.b - i2);
            case 2:
                return j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.l(j$.com.android.tools.r8.a.m(instantFrom.a, j), 1000000000L), instantFrom.b - i2) / 1000;
            case 3:
                return j$.com.android.tools.r8.a.m(instantFrom.toEpochMilli(), toEpochMilli());
            case 4:
                return X(instantFrom);
            case 5:
                return X(instantFrom) / 60;
            case 6:
                return X(instantFrom) / 3600;
            case 7:
                return X(instantFrom) / 43200;
            case 8:
                return X(instantFrom) / 86400;
            default:
                throw new j$.time.temporal.q("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.NANO_OF_SECOND || pVar == j$.time.temporal.a.MICRO_OF_SECOND || pVar == j$.time.temporal.a.MILLI_OF_SECOND;
        }
        return pVar != null && pVar.u(this);
    }

    public long getEpochSecond() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isAfter(Instant instant) {
        return compareTo(instant) > 0;
    }

    public boolean isBefore(Instant instant) {
        return compareTo(instant) < 0;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal p(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: plus, reason: merged with bridge method [inline-methods] */
    public Instant e(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.r(this, j);
        }
        switch (g.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return W(0L, j);
            case 2:
                return W(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return W(j / 1000, (j % 1000) * 1000000);
            case 4:
                return W(j, 0L);
            case 5:
                return W(j$.com.android.tools.r8.a.l(j, 60), 0L);
            case 6:
                return W(j$.com.android.tools.r8.a.l(j, 3600), 0L);
            case 7:
                return W(j$.com.android.tools.r8.a.l(j, 43200), 0L);
            case 8:
                return W(j$.com.android.tools.r8.a.l(j, 86400), 0L);
            default:
                throw new j$.time.temporal.q("Unsupported unit: " + temporalUnit);
        }
    }

    public Instant plus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.p(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int r(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.l.d(this, pVar).a(pVar.t(this), pVar);
        }
        int i = g.a[((j$.time.temporal.a) pVar).ordinal()];
        int i2 = this.b;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            return i2 / 1000;
        }
        if (i == 3) {
            return i2 / 1000000;
        }
        if (i == 4) {
            j$.time.temporal.a.INSTANT_SECONDS.U(this.a);
        }
        throw new j$.time.temporal.q(AbstractC0112c.a("Unsupported field: ", pVar));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal t(i iVar) {
        return (Instant) AbstractC0121i.a(iVar, this);
    }

    public long toEpochMilli() {
        long jL;
        int i;
        int i2 = this.b;
        long j = this.a;
        if (j >= 0 || i2 <= 0) {
            jL = j$.com.android.tools.r8.a.l(j, 1000);
            i = i2 / 1000000;
        } else {
            jL = j$.com.android.tools.r8.a.l(j + 1, 1000);
            i = (i2 / 1000000) - 1000;
        }
        return j$.com.android.tools.r8.a.f(jL, i);
    }

    public String toString() {
        return DateTimeFormatter.i.format(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r u(j$.time.temporal.p pVar) {
        return j$.time.temporal.l.d(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long x(j$.time.temporal.p pVar) {
        int i;
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.t(this);
        }
        int i2 = g.a[((j$.time.temporal.a) pVar).ordinal()];
        int i3 = this.b;
        if (i2 == 1) {
            return i3;
        }
        if (i2 == 2) {
            i = i3 / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new j$.time.temporal.q(AbstractC0112c.a("Unsupported field: ", pVar));
            }
            i = i3 / 1000000;
        }
        return i;
    }
}
