package j$.time.zone;

import j$.time.Duration;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC0121i;
import j$.time.k;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;
    private final long a;
    private final k b;
    private final ZoneOffset c;
    private final ZoneOffset d;

    b(long j, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.a = j;
        this.b = k.e0(j, 0, zoneOffset);
        this.c = zoneOffset;
        this.d = zoneOffset2;
    }

    b(k kVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        kVar.getClass();
        this.a = AbstractC0121i.n(kVar, zoneOffset);
        this.b = kVar;
        this.c = zoneOffset;
        this.d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    final List C() {
        return E() ? Collections.emptyList() : j$.com.android.tools.r8.a.h(new Object[]{this.c, this.d});
    }

    public final boolean E() {
        return this.d.c0() > this.c.c0();
    }

    public final long T() {
        return this.a;
    }

    final void U(DataOutput dataOutput) {
        a.c(this.a, dataOutput);
        a.d(this.c, dataOutput);
        a.d(this.d, dataOutput);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((b) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.c.equals(bVar.c) && this.d.equals(bVar.d);
    }

    public final int hashCode() {
        return (this.b.hashCode() ^ this.c.hashCode()) ^ Integer.rotateLeft(this.d.hashCode(), 16);
    }

    public final k p() {
        return this.b.h0(this.d.c0() - this.c.c0());
    }

    public final k r() {
        return this.b;
    }

    public final Duration t() {
        return Duration.ofSeconds(this.d.c0() - this.c.c0());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(E() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.b);
        sb.append(this.c);
        sb.append(" to ");
        sb.append(this.d);
        sb.append(']');
        return sb.toString();
    }

    public final ZoneOffset u() {
        return this.d;
    }

    public final ZoneOffset x() {
        return this.c;
    }
}
