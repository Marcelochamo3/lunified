package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class m implements InterfaceC0123k, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    private final transient C0119g a;
    private final transient ZoneOffset b;
    private final transient ZoneId c;

    private m(ZoneId zoneId, ZoneOffset zoneOffset, C0119g c0119g) {
        this.a = (C0119g) Objects.requireNonNull(c0119g, "dateTime");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
        this.c = (ZoneId) Objects.requireNonNull(zoneId, "zone");
    }

    static m U(n nVar, Temporal temporal) {
        m mVar = (m) temporal;
        AbstractC0113a abstractC0113a = (AbstractC0113a) nVar;
        if (abstractC0113a.equals(mVar.a())) {
            return mVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + abstractC0113a.o() + ", actual: " + mVar.a().o());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002b  */
    static InterfaceC0123k W(ZoneId zoneId, ZoneOffset zoneOffset, C0119g c0119g) {
        Objects.requireNonNull(c0119g, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new m(zoneId, (ZoneOffset) zoneId, c0119g);
        }
        j$.time.zone.f fVarV = zoneId.V();
        j$.time.k kVarV = j$.time.k.V(c0119g);
        List listG = fVarV.g(kVarV);
        if (listG.size() == 1) {
            zoneOffset = (ZoneOffset) listG.get(0);
        } else if (listG.size() == 0) {
            j$.time.zone.b bVarF = fVarV.f(kVarV);
            c0119g = c0119g.Y(bVarF.t().getSeconds());
            zoneOffset = bVarF.u();
        } else if (zoneOffset == null || !listG.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) listG.get(0);
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new m(zoneId, zoneOffset, c0119g);
    }

    static m X(n nVar, Instant instant, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.V().d(instant);
        Objects.requireNonNull(zoneOffsetD, "offset");
        return new m(zoneId, zoneOffsetD, (C0119g) nVar.D(j$.time.k.e0(instant.getEpochSecond(), instant.getNano(), zoneOffsetD)));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 3, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object C(TemporalQuery temporalQuery) {
        return AbstractC0121i.l(this, temporalQuery);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ int compareTo(InterfaceC0123k interfaceC0123k) {
        return AbstractC0121i.d(this, interfaceC0123k);
    }

    @Override // j$.time.chrono.InterfaceC0123k
    public final InterfaceC0117e H() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC0123k
    public final InterfaceC0123k M(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "zone");
        if (this.c.equals(zoneOffset)) {
            return this;
        }
        return X(a(), this.a.a0(this.b), zoneOffset);
    }

    @Override // j$.time.chrono.InterfaceC0123k
    public final /* synthetic */ long T() {
        return AbstractC0121i.o(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0123k p(long j, TemporalUnit temporalUnit) {
        return U(a(), j$.time.temporal.l.b(this, j, temporalUnit));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0123k e(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return U(a(), temporalUnit.r(this, j));
        }
        return U(a(), this.a.e(j, temporalUnit).E(this));
    }

    @Override // j$.time.chrono.InterfaceC0123k
    public final n a() {
        return c().a();
    }

    @Override // j$.time.chrono.InterfaceC0123k
    public final j$.time.m b() {
        return ((C0119g) H()).b();
    }

    @Override // j$.time.chrono.InterfaceC0123k
    public final InterfaceC0114b c() {
        return ((C0119g) H()).c();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return U(a(), pVar.x(this, j));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i = AbstractC0124l.a[aVar.ordinal()];
        if (i == 1) {
            return e(j - AbstractC0121i.o(this), ChronoUnit.SECONDS);
        }
        ZoneId zoneId = this.c;
        C0119g c0119g = this.a;
        if (i != 2) {
            return W(zoneId, this.b, c0119g.d(j, pVar));
        }
        return X(a(), c0119g.a0(ZoneOffset.f0(aVar.U(j))), zoneId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0123k) && AbstractC0121i.d(this, (InterfaceC0123k) obj) == 0;
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        InterfaceC0123k interfaceC0123kZ = a().z(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.a.f(interfaceC0123kZ.M(this.b).H(), temporalUnit);
        }
        Objects.requireNonNull(temporalUnit, "unit");
        return temporalUnit.p(this, interfaceC0123kZ);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        return (pVar instanceof j$.time.temporal.a) || (pVar != null && pVar.u(this));
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.chrono.InterfaceC0123k
    public final ZoneOffset k() {
        return this.b;
    }

    @Override // j$.time.chrono.InterfaceC0123k
    public final InterfaceC0123k l(ZoneId zoneId) {
        return W(zoneId, this.b, this.a);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int r(j$.time.temporal.p pVar) {
        return AbstractC0121i.e(this, pVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal t(j$.time.i iVar) {
        return U(a(), iVar.E(this));
    }

    public final String toString() {
        String string = this.a.toString();
        ZoneOffset zoneOffset = this.b;
        String str = string + zoneOffset.toString();
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r u(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return (pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) pVar).p() : ((C0119g) H()).u(pVar);
        }
        return pVar.C(this);
    }

    @Override // j$.time.chrono.InterfaceC0123k
    public final ZoneId v() {
        return this.c;
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.a);
        objectOutput.writeObject(this.b);
        objectOutput.writeObject(this.c);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long x(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.t(this);
        }
        int i = AbstractC0122j.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i != 1) {
            return i != 2 ? ((C0119g) H()).x(pVar) : k().c0();
        }
        return T();
    }
}
