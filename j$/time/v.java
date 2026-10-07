package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements TemporalAmount, Serializable {
    public static final v d = new v(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;
    private final int a;
    private final int b;
    private final int c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        j$.com.android.tools.r8.a.h(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    private v(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static v b(int i) {
        return i == 0 ? d : new v(0, 0, i);
    }

    static v c(DataInput dataInput) throws IOException {
        int i = dataInput.readInt();
        int i2 = dataInput.readInt();
        int i3 = dataInput.readInt();
        return ((i | i2) | i3) == 0 ? d : new v(i, i2, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 14, this);
    }

    public final int a() {
        return this.c;
    }

    public final long d() {
        return (((long) this.a) * 12) + ((long) this.b);
    }

    final void e(DataOutput dataOutput) {
        dataOutput.writeInt(this.a);
        dataOutput.writeInt(this.b);
        dataOutput.writeInt(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.a == vVar.a && this.b == vVar.b && this.c == vVar.c;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c, 16) + Integer.rotateLeft(this.b, 8) + this.a;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal p(Temporal temporal) {
        long jD;
        ChronoUnit chronoUnit;
        Objects.requireNonNull(temporal, "temporal");
        j$.time.chrono.n nVar = (j$.time.chrono.n) temporal.C(j$.time.temporal.l.e());
        if (nVar != null && !j$.time.chrono.u.d.equals(nVar)) {
            throw new C0111b("Chronology mismatch, expected: ISO, actual: " + nVar.o());
        }
        if (this.b == 0) {
            int i = this.a;
            if (i != 0) {
                jD = i;
                chronoUnit = ChronoUnit.YEARS;
                temporal = temporal.e(jD, chronoUnit);
            }
        } else {
            jD = d();
            if (jD != 0) {
                chronoUnit = ChronoUnit.MONTHS;
                temporal = temporal.e(jD, chronoUnit);
            }
        }
        int i2 = this.c;
        return i2 != 0 ? temporal.e(i2, ChronoUnit.DAYS) : temporal;
    }

    public final String toString() {
        if (this == d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }
}
