package j$.time;

import j$.time.chrono.AbstractC0121i;
import j$.time.chrono.InterfaceC0114b;
import j$.time.chrono.InterfaceC0117e;
import j$.time.chrono.InterfaceC0123k;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class D implements Temporal, InterfaceC0123k, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    private final k a;
    private final ZoneOffset b;
    private final ZoneId c;

    private D(k kVar, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.a = kVar;
        this.b = zoneOffset;
        this.c = zoneId;
    }

    private static D U(long j, int i, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.V().d(Instant.V(j, i));
        return new D(k.e0(j, i, zoneOffsetD), zoneId, zoneOffsetD);
    }

    public static D V(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof D) {
            return (D) temporalAccessor;
        }
        try {
            ZoneId zoneIdU = ZoneId.U(temporalAccessor);
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            return temporalAccessor.g(aVar) ? U(temporalAccessor.x(aVar), temporalAccessor.r(j$.time.temporal.a.NANO_OF_SECOND), zoneIdU) : X(k.d0(i.W(temporalAccessor), m.W(temporalAccessor)), zoneIdU, null);
        } catch (C0111b e) {
            throw new C0111b("Unable to obtain ZonedDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    public static D W(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return U(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    public static D X(k kVar, ZoneId zoneId, ZoneOffset zoneOffset) {
        Object objRequireNonNull;
        Objects.requireNonNull(kVar, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new D(kVar, zoneId, (ZoneOffset) zoneId);
        }
        j$.time.zone.f fVarV = zoneId.V();
        List listG = fVarV.g(kVar);
        if (listG.size() != 1) {
            if (listG.size() == 0) {
                j$.time.zone.b bVarF = fVarV.f(kVar);
                kVar = kVar.h0(bVarF.t().getSeconds());
                zoneOffset = bVarF.u();
            } else if (zoneOffset == null || !listG.contains(zoneOffset)) {
                objRequireNonNull = Objects.requireNonNull((ZoneOffset) listG.get(0), "offset");
            }
            return new D(kVar, zoneId, zoneOffset);
        }
        objRequireNonNull = listG.get(0);
        zoneOffset = (ZoneOffset) objRequireNonNull;
        return new D(kVar, zoneId, zoneOffset);
    }

    static D Z(ObjectInput objectInput) throws IOException {
        k kVar = k.c;
        i iVar = i.d;
        k kVarD0 = k.d0(i.i0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), m.k0(objectInput));
        ZoneOffset zoneOffsetH0 = ZoneOffset.h0(objectInput);
        ZoneId zoneId = (ZoneId) w.a(objectInput);
        Objects.requireNonNull(kVarD0, "localDateTime");
        Objects.requireNonNull(zoneOffsetH0, "offset");
        Objects.requireNonNull(zoneId, "zone");
        if (!(zoneId instanceof ZoneOffset) || zoneOffsetH0.equals(zoneId)) {
            return new D(kVarD0, zoneId, zoneOffsetH0);
        }
        throw new IllegalArgumentException("ZoneId must match ZoneOffset");
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 6, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object C(TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.l.f() ? this.a.j0() : AbstractC0121i.l(this, temporalQuery);
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
    public final /* synthetic */ long T() {
        return AbstractC0121i.o(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final D e(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (D) temporalUnit.r(this, j);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        boolean z = chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER;
        ZoneOffset zoneOffset = this.b;
        ZoneId zoneId = this.c;
        k kVarE = this.a.e(j, temporalUnit);
        if (z) {
            return X(kVarE, zoneId, zoneOffset);
        }
        Objects.requireNonNull(kVarE, "localDateTime");
        Objects.requireNonNull(zoneOffset, "offset");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId.V().g(kVarE).contains(zoneOffset)) {
            return new D(kVarE, zoneId, zoneOffset);
        }
        kVarE.getClass();
        return U(AbstractC0121i.n(kVarE, zoneOffset), kVarE.W(), zoneId);
    }

    @Override // j$.time.chrono.InterfaceC0123k
    public final j$.time.chrono.n a() {
        return ((i) c()).a();
    }

    public final k a0() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC0123k
    public final m b() {
        return this.a.b();
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final D t(i iVar) {
        return X(k.d0(iVar, this.a.b()), this.c, this.b);
    }

    @Override // j$.time.chrono.InterfaceC0123k
    public final InterfaceC0114b c() {
        return this.a.j0();
    }

    @Override // j$.time.chrono.InterfaceC0123k
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final D M(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        k kVar = this.a;
        kVar.getClass();
        return U(AbstractC0121i.n(kVar, this.b), kVar.W(), zoneId);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (D) pVar.x(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i = C.a[aVar.ordinal()];
        k kVar = this.a;
        ZoneId zoneId = this.c;
        if (i == 1) {
            return U(j, kVar.W(), zoneId);
        }
        ZoneOffset zoneOffset = this.b;
        if (i != 2) {
            return X(kVar.d(j, pVar), zoneId, zoneOffset);
        }
        ZoneOffset zoneOffsetF0 = ZoneOffset.f0(aVar.U(j));
        return (zoneOffsetF0.equals(zoneOffset) || !zoneId.V().g(kVar).contains(zoneOffsetF0)) ? this : new D(kVar, zoneId, zoneOffsetF0);
    }

    final void d0(DataOutput dataOutput) {
        this.a.n0(dataOutput);
        this.b.i0(dataOutput);
        this.c.Z(dataOutput);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d = (D) obj;
        return this.a.equals(d.a) && this.b.equals(d.b) && this.c.equals(d.c);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        D dV = V(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.p(this, dV);
        }
        D dM = dV.M(this.c);
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        int iCompareTo = chronoUnit.compareTo(ChronoUnit.DAYS);
        k kVar = this.a;
        k kVar2 = dM.a;
        return (iCompareTo < 0 || chronoUnit == ChronoUnit.FOREVER) ? s.U(kVar, this.b).f(s.U(kVar2, dM.b), temporalUnit) : kVar.f(kVar2, temporalUnit);
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
        Objects.requireNonNull(zoneId, "zone");
        return this.c.equals(zoneId) ? this : X(this.a, zoneId, this.b);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal p(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int r(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return AbstractC0121i.e(this, pVar);
        }
        int i = C.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.r(pVar) : this.b.c0();
        }
        throw new j$.time.temporal.q("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
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
            return (pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) pVar).p() : this.a.u(pVar);
        }
        return pVar.C(this);
    }

    @Override // j$.time.chrono.InterfaceC0123k
    public final ZoneId v() {
        return this.c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long x(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.t(this);
        }
        int i = C.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.x(pVar) : this.b.c0();
        }
        return AbstractC0121i.o(this);
    }
}
