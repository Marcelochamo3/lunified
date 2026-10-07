package j$.time;

import j$.time.chrono.AbstractC0121i;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements Temporal, j$.time.temporal.m, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;
    private final m a;
    private final ZoneOffset b;

    static {
        m mVar = m.e;
        ZoneOffset zoneOffset = ZoneOffset.g;
        mVar.getClass();
        U(mVar, zoneOffset);
        m mVar2 = m.f;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        mVar2.getClass();
        U(mVar2, zoneOffset2);
    }

    private u(m mVar, ZoneOffset zoneOffset) {
        this.a = (m) Objects.requireNonNull(mVar, "time");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    public static u U(m mVar, ZoneOffset zoneOffset) {
        return new u(mVar, zoneOffset);
    }

    static u W(ObjectInput objectInput) {
        return new u(m.k0(objectInput), ZoneOffset.h0(objectInput));
    }

    private long X() {
        return this.a.l0() - (((long) this.b.c0()) * 1000000000);
    }

    private u Y(m mVar, ZoneOffset zoneOffset) {
        return (this.a == mVar && this.b.equals(zoneOffset)) ? this : new u(mVar, zoneOffset);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 9, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object C(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.l.i() || temporalQuery == j$.time.temporal.l.k()) {
            return this.b;
        }
        if (((temporalQuery == j$.time.temporal.l.l()) || (temporalQuery == j$.time.temporal.l.e())) || temporalQuery == j$.time.temporal.l.f()) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.l.g()) {
            return this.a;
        }
        return temporalQuery == j$.time.temporal.l.j() ? ChronoUnit.NANOS : temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.m
    public final Temporal E(Temporal temporal) {
        return temporal.d(this.a.l0(), j$.time.temporal.a.NANO_OF_DAY).d(this.b.c0(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final u e(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? Y(this.a.e(j, temporalUnit), this.b) : (u) temporalUnit.r(this, j);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompare;
        u uVar = (u) obj;
        return (this.b.equals(uVar.b) || (iCompare = Long.compare(X(), uVar.X())) == 0) ? this.a.compareTo(uVar.a) : iCompare;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (u) pVar.x(this, j);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
        m mVar = this.a;
        return pVar == aVar ? Y(mVar, ZoneOffset.f0(((j$.time.temporal.a) pVar).U(j))) : Y(mVar.d(j, pVar), this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.a.equals(uVar.a) && this.b.equals(uVar.b);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        u uVar;
        long j;
        if (temporal instanceof u) {
            uVar = (u) temporal;
        } else {
            try {
                uVar = new u(m.W(temporal), ZoneOffset.b0(temporal));
            } catch (C0111b e) {
                throw new C0111b("Unable to obtain OffsetTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.p(this, uVar);
        }
        long jX = uVar.X() - X();
        switch (t.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return jX;
            case 2:
                j = 1000;
                break;
            case 3:
                j = 1000000;
                break;
            case 4:
                j = 1000000000;
                break;
            case 5:
                j = 60000000000L;
                break;
            case 6:
                j = 3600000000000L;
                break;
            case 7:
                j = 43200000000000L;
                break;
            default:
                throw new j$.time.temporal.q("Unsupported unit: " + temporalUnit);
        }
        return jX / j;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).W() || pVar == j$.time.temporal.a.OFFSET_SECONDS;
        }
        return pVar != null && pVar.u(this);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal p(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int r(j$.time.temporal.p pVar) {
        return j$.time.temporal.l.a(this, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.time.temporal.Temporal
    public final Temporal t(i iVar) {
        Object objA;
        if (iVar instanceof m) {
            return Y((m) iVar, this.b);
        }
        if (iVar instanceof ZoneOffset) {
            return Y(this.a, (ZoneOffset) iVar);
        }
        if (!(iVar instanceof u)) {
            objA = iVar;
            objA = AbstractC0121i.a(iVar, this);
        }
        objA = iVar;
        return (u) objA;
    }

    public final String toString() {
        return this.a.toString() + this.b.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r u(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.C(this);
        }
        if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return ((j$.time.temporal.a) pVar).p();
        }
        m mVar = this.a;
        mVar.getClass();
        return j$.time.temporal.l.d(mVar, pVar);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.a.p0(objectOutput);
        this.b.i0(objectOutput);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long x(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return pVar == j$.time.temporal.a.OFFSET_SECONDS ? this.b.c0() : this.a.x(pVar);
        }
        return pVar.t(this);
    }
}
