package j$.time;

import j$.time.chrono.AbstractC0113a;
import j$.time.chrono.AbstractC0121i;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements TemporalAccessor, j$.time.temporal.m, Comparable, Serializable {
    private static final long serialVersionUID = -939150713474957432L;
    private final int a;
    private final int b;

    static {
        j$.time.format.v vVar = new j$.time.format.v();
        vVar.f("--");
        vVar.o(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        vVar.e('-');
        vVar.o(j$.time.temporal.a.DAY_OF_MONTH, 2);
        vVar.y(Locale.getDefault());
    }

    private q(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    static q U(DataInput dataInput) throws IOException {
        byte b = dataInput.readByte();
        byte b2 = dataInput.readByte();
        o oVarX = o.X(b);
        Objects.requireNonNull(oVarX, "month");
        j$.time.temporal.a.DAY_OF_MONTH.V(b2);
        if (b2 <= oVarX.W()) {
            return new q(oVarX.getValue(), b2);
        }
        throw new C0111b("Illegal value for DayOfMonth field, value " + ((int) b2) + " is not valid for month " + oVarX.name());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 13, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object C(TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.l.e() ? j$.time.chrono.u.d : j$.time.temporal.l.c(this, temporalQuery);
    }

    @Override // j$.time.temporal.m
    public final Temporal E(Temporal temporal) {
        if (!((AbstractC0113a) AbstractC0121i.p(temporal)).equals(j$.time.chrono.u.d)) {
            throw new C0111b("Adjustment only supported on ISO date-time");
        }
        Temporal temporalD = temporal.d(this.a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return temporalD.d(Math.min(temporalD.u(aVar).d(), this.b), aVar);
    }

    final void V(DataOutput dataOutput) {
        dataOutput.writeByte(this.a);
        dataOutput.writeByte(this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        q qVar = (q) obj;
        int i = this.a - qVar.a;
        return i == 0 ? this.b - qVar.b : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a == qVar.a && this.b == qVar.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return pVar == j$.time.temporal.a.MONTH_OF_YEAR || pVar == j$.time.temporal.a.DAY_OF_MONTH;
        }
        return pVar != null && pVar.u(this);
    }

    public final int hashCode() {
        return (this.a << 6) + this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int r(j$.time.temporal.p pVar) {
        return u(pVar).a(x(pVar), pVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i = this.a;
        sb.append(i < 10 ? "0" : "");
        sb.append(i);
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r u(j$.time.temporal.p pVar) {
        int i;
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return pVar.p();
        }
        if (pVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return j$.time.temporal.l.d(this, pVar);
        }
        int i2 = this.a;
        o oVarX = o.X(i2);
        oVarX.getClass();
        int i3 = n.a[oVarX.ordinal()];
        if (i3 != 1) {
            i = (i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5) ? 30 : 31;
        } else {
            i = 28;
        }
        return j$.time.temporal.r.k(1L, i, o.X(i2).W());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long x(j$.time.temporal.p pVar) {
        int i;
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.t(this);
        }
        int i2 = p.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 != 2) {
                throw new j$.time.temporal.q(AbstractC0112c.a("Unsupported field: ", pVar));
            }
            i = this.a;
        }
        return i;
    }
}
