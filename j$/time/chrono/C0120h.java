package j$.time.chrono;

import j$.time.C0111b;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: j$.time.chrono.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0120h implements TemporalAmount, Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    private final n a;
    final int b;
    final int c;
    final int d;

    static {
        j$.com.android.tools.r8.a.h(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    C0120h(n nVar, int i, int i2, int i3) {
        Objects.requireNonNull(nVar, "chrono");
        this.a = nVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void a(DataOutput dataOutput) {
        dataOutput.writeUTF(this.a.o());
        dataOutput.writeInt(this.b);
        dataOutput.writeInt(this.c);
        dataOutput.writeInt(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0120h)) {
            return false;
        }
        C0120h c0120h = (C0120h) obj;
        if (this.b == c0120h.b && this.c == c0120h.c && this.d == c0120h.d) {
            if (((AbstractC0113a) this.a).equals(c0120h.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractC0113a) this.a).hashCode() ^ (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008f  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // j$.time.temporal.TemporalAmount
    public final Temporal p(Temporal temporal) {
        long j;
        ChronoUnit chronoUnit;
        int i;
        Objects.requireNonNull(temporal, "temporal");
        n nVar = (n) temporal.C(j$.time.temporal.l.e());
        n nVar2 = this.a;
        if (nVar != null && !((AbstractC0113a) nVar2).equals(nVar)) {
            throw new C0111b("Chronology mismatch, expected: " + nVar2.o() + ", actual: " + nVar.o());
        }
        int i2 = this.b;
        int i3 = this.c;
        if (i3 == 0) {
            if (i2 != 0) {
                j = i2;
                chronoUnit = ChronoUnit.YEARS;
            }
            i = this.d;
            if (i != 0) {
                return temporal.e(i, ChronoUnit.DAYS);
            }
            return temporal;
        }
        j$.time.temporal.r rVarK = nVar2.K(j$.time.temporal.a.MONTH_OF_YEAR);
        long jD = (rVarK.g() && rVarK.h()) ? (rVarK.d() - rVarK.e()) + 1 : -1L;
        if (jD > 0) {
            j = (((long) i2) * jD) + ((long) i3);
        } else {
            if (i2 != 0) {
                temporal = temporal.e(i2, ChronoUnit.YEARS);
            }
            j = i3;
        }
        chronoUnit = ChronoUnit.MONTHS;
        temporal = temporal.e(j, chronoUnit);
        i = this.d;
        if (i != 0) {
            return temporal.e(i, ChronoUnit.DAYS);
        }
        return temporal;
    }

    public final String toString() {
        n nVar = this.a;
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 == 0 && i2 == 0 && i == 0) {
            return ((AbstractC0113a) nVar).o() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(((AbstractC0113a) nVar).o());
        sb.append(" P");
        if (i3 != 0) {
            sb.append(i3);
            sb.append('Y');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('D');
        }
        return sb.toString();
    }

    protected Object writeReplace() {
        return new G((byte) 9, this);
    }
}
