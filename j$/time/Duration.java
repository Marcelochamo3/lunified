package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class Duration implements TemporalAmount, Comparable<Duration>, Serializable {
    public static final Duration c = new Duration(0, 0);
    private static final BigInteger d = BigInteger.valueOf(1000000000);
    private static final long serialVersionUID = 3078945930695997490L;
    private final long a;
    private final int b;

    private Duration(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public static Duration C(long j, long j2) {
        return r(j$.com.android.tools.r8.a.f(j, j$.com.android.tools.r8.a.k(j2, 1000000000L)), (int) j$.com.android.tools.r8.a.j(j2, 1000000000L));
    }

    private Duration E(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return C(j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.f(this.a, j), j2 / 1000000000), ((long) this.b) + (j2 % 1000000000));
    }

    public static Duration between(Temporal temporal, Temporal temporal2) {
        try {
            return x(temporal.f(temporal2, ChronoUnit.NANOS));
        } catch (C0111b | ArithmeticException unused) {
            long jF = temporal.f(temporal2, ChronoUnit.SECONDS);
            long j = 0;
            try {
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
                long jX = temporal2.x(aVar) - temporal.x(aVar);
                if (jF > 0 && jX < 0) {
                    jF++;
                } else if (jF < 0 && jX > 0) {
                    jF--;
                }
                j = jX;
            } catch (C0111b unused2) {
            }
            return C(jF, j);
        }
    }

    public static Duration ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return r(j2, i * 1000000);
    }

    public static Duration ofMinutes(long j) {
        return r(j$.com.android.tools.r8.a.l(j, 60), 0);
    }

    public static Duration ofSeconds(long j) {
        return r(j, 0);
    }

    private static Duration r(long j, int i) {
        return (((long) i) | j) == 0 ? c : new Duration(j, i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 1, this);
    }

    public static Duration x(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (((long) i) + 1000000000);
            j2--;
        }
        return r(j2, i);
    }

    public final Duration U(long j, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporalUnit, "unit");
        if (temporalUnit == ChronoUnit.DAYS) {
            return E(j$.com.android.tools.r8.a.l(j, 86400), 0L);
        }
        if (temporalUnit.t()) {
            throw new j$.time.temporal.q("Unit must not have an estimated duration");
        }
        if (j == 0) {
            return this;
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            Duration durationU = temporalUnit.u().u(j);
            return E(durationU.getSeconds(), 0L).E(0L, durationU.b);
        }
        int i = e.a[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return E(0L, j);
        }
        if (i == 2) {
            return E((j / 1000000000) * 1000, 0L).E(0L, (j % 1000000000) * 1000);
        }
        if (i != 3) {
            return i != 4 ? E(j$.com.android.tools.r8.a.l(temporalUnit.u().a, j), 0L) : E(j, 0L);
        }
        return E(j / 1000, (j % 1000) * 1000000);
    }

    final void V(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.a);
        dataOutput.writeInt(this.b);
    }

    public Duration abs() {
        return isNegative() ? u(-1L) : this;
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        int iCompare = Long.compare(this.a, duration.a);
        return iCompare != 0 ? iCompare : this.b - duration.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        return this.a == duration.a && this.b == duration.b;
    }

    public long getSeconds() {
        return this.a;
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isNegative() {
        return this.a < 0;
    }

    public Duration minus(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? U(Long.MAX_VALUE, temporalUnit).U(1L, temporalUnit) : U(-j, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal p(Temporal temporal) {
        long j = this.a;
        if (j != 0) {
            temporal = temporal.e(j, ChronoUnit.SECONDS);
        }
        int i = this.b;
        return i != 0 ? temporal.e(i, ChronoUnit.NANOS) : temporal;
    }

    public final int t() {
        return this.b;
    }

    public long toMillis() {
        long j = this.b;
        long j2 = this.a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.l(j2, 1000), j / 1000000);
    }

    public long toNanos() {
        long j = this.b;
        long j2 = this.a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.l(j2, 1000000000L), j);
    }

    public final String toString() {
        if (this == c) {
            return "PT0S";
        }
        long j = this.a;
        int i = this.b;
        long j2 = (j >= 0 || i <= 0) ? j : 1 + j;
        long j3 = j2 / 3600;
        int i2 = (int) ((j2 % 3600) / 60);
        int i3 = (int) (j2 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j3 != 0) {
            sb.append(j3);
            sb.append('H');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i3 == 0 && i == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j >= 0 || i <= 0 || i3 != 0) {
            sb.append(i3);
        } else {
            sb.append("-0");
        }
        if (i > 0) {
            int length = sb.length();
            sb.append(j < 0 ? 2000000000 - ((long) i) : ((long) i) + 1000000000);
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    public final Duration u(long j) {
        if (j == 0) {
            return c;
        }
        if (j == 1) {
            return this;
        }
        BigInteger bigIntegerExact = BigDecimal.valueOf(this.a).add(BigDecimal.valueOf(this.b, 9)).multiply(BigDecimal.valueOf(j)).movePointRight(9).toBigIntegerExact();
        BigInteger[] bigIntegerArrDivideAndRemainder = bigIntegerExact.divideAndRemainder(d);
        if (bigIntegerArrDivideAndRemainder[0].bitLength() <= 63) {
            return C(bigIntegerArrDivideAndRemainder[0].longValue(), bigIntegerArrDivideAndRemainder[1].intValue());
        }
        throw new ArithmeticException("Exceeds capacity of Duration: " + bigIntegerExact);
    }
}
