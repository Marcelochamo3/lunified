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
public final class s implements Temporal, j$.time.temporal.m, Comparable, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;
    private final k a;
    private final ZoneOffset b;

    static {
        k kVar = k.c;
        ZoneOffset zoneOffset = ZoneOffset.g;
        kVar.getClass();
        U(kVar, zoneOffset);
        k kVar2 = k.d;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        kVar2.getClass();
        U(kVar2, zoneOffset2);
    }

    private s(k kVar, ZoneOffset zoneOffset) {
        this.a = (k) Objects.requireNonNull(kVar, "dateTime");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    public static s U(k kVar, ZoneOffset zoneOffset) {
        return new s(kVar, zoneOffset);
    }

    public static s V(Instant instant, ZoneOffset zoneOffset) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneOffset, "zone");
        zoneOffset.getClass();
        ZoneOffset zoneOffsetD = j$.time.zone.f.j(zoneOffset).d(instant);
        return new s(k.e0(instant.getEpochSecond(), instant.getNano(), zoneOffsetD), zoneOffsetD);
    }

    static s X(ObjectInput objectInput) {
        k kVar = k.c;
        i iVar = i.d;
        return new s(k.d0(i.i0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), m.k0(objectInput)), ZoneOffset.h0(objectInput));
    }

    private s Z(k kVar, ZoneOffset zoneOffset) {
        return (this.a == kVar && this.b.equals(zoneOffset)) ? this : new s(kVar, zoneOffset);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 10, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object C(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.l.i() || temporalQuery == j$.time.temporal.l.k()) {
            return this.b;
        }
        if (temporalQuery == j$.time.temporal.l.l()) {
            return null;
        }
        TemporalQuery temporalQueryF = j$.time.temporal.l.f();
        k kVar = this.a;
        if (temporalQuery == temporalQueryF) {
            return kVar.j0();
        }
        if (temporalQuery == j$.time.temporal.l.g()) {
            return kVar.b();
        }
        if (temporalQuery == j$.time.temporal.l.e()) {
            return j$.time.chrono.u.d;
        }
        return temporalQuery == j$.time.temporal.l.j() ? ChronoUnit.NANOS : temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.m
    public final Temporal E(Temporal temporal) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        k kVar = this.a;
        return temporal.d(kVar.j0().y(), aVar).d(kVar.b().l0(), j$.time.temporal.a.NANO_OF_DAY).d(this.b.c0(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final s e(long j, TemporalUnit temporalUnit) {
        return temporalUnit instanceof ChronoUnit ? Z(this.a.e(j, temporalUnit), this.b) : (s) temporalUnit.r(this, j);
    }

    public final k Y() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompare;
        s sVar = (s) obj;
        ZoneOffset zoneOffset = sVar.b;
        ZoneOffset zoneOffset2 = this.b;
        boolean zEquals = zoneOffset2.equals(zoneOffset);
        k kVar = sVar.a;
        k kVar2 = this.a;
        if (zEquals) {
            iCompare = kVar2.compareTo(kVar);
        } else {
            kVar2.getClass();
            long jN = AbstractC0121i.n(kVar2, zoneOffset2);
            kVar.getClass();
            iCompare = Long.compare(jN, AbstractC0121i.n(kVar, sVar.b));
            if (iCompare == 0) {
                iCompare = kVar2.b().Z() - kVar.b().Z();
            }
        }
        return iCompare == 0 ? kVar2.compareTo(kVar) : iCompare;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (s) pVar.x(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i = r.a[aVar.ordinal()];
        ZoneOffset zoneOffset = this.b;
        k kVar = this.a;
        if (i != 1) {
            return i != 2 ? Z(kVar.d(j, pVar), zoneOffset) : Z(kVar, ZoneOffset.f0(aVar.U(j)));
        }
        return V(Instant.V(j, kVar.W()), zoneOffset);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.a.equals(sVar.a) && this.b.equals(sVar.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15, types: [j$.time.s] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        s sVar;
        if (temporal instanceof s) {
            temporal = (s) temporal;
        } else {
            try {
                ZoneOffset zoneOffsetB0 = ZoneOffset.b0(temporal);
                i iVar = (i) temporal.C(j$.time.temporal.l.f());
                m mVar = (m) temporal.C(j$.time.temporal.l.g());
                temporal = (iVar == null || mVar == null) ? V(Instant.from(temporal), zoneOffsetB0) : new s(k.d0(iVar, mVar), zoneOffsetB0);
            } catch (C0111b e) {
                throw new C0111b("Unable to obtain OffsetDateTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.p(this, temporal);
        }
        ZoneOffset zoneOffset = temporal.b;
        ZoneOffset zoneOffset2 = this.b;
        if (!zoneOffset2.equals(zoneOffset)) {
            sVar = temporal;
            sVar = new s(temporal.a.h0(zoneOffset2.c0() - zoneOffset.c0()), zoneOffset2);
        }
        sVar = temporal;
        return this.a.f(sVar.a, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        return (pVar instanceof j$.time.temporal.a) || (pVar != null && pVar.u(this));
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
        if (!(pVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.l.a(this, pVar);
        }
        int i = r.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.r(pVar) : this.b.c0();
        }
        throw new j$.time.temporal.q("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal t(i iVar) {
        return Z(this.a.l0(iVar), this.b);
    }

    public final String toString() {
        return this.a.toString() + this.b.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r u(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return (pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) pVar).p() : this.a.u(pVar);
        }
        return pVar.C(this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.a.n0(objectOutput);
        this.b.i0(objectOutput);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long x(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.t(this);
        }
        int i = r.a[((j$.time.temporal.a) pVar).ordinal()];
        ZoneOffset zoneOffset = this.b;
        k kVar = this.a;
        if (i != 1) {
            return i != 2 ? kVar.x(pVar) : zoneOffset.c0();
        }
        kVar.getClass();
        return AbstractC0121i.n(kVar, zoneOffset);
    }
}
