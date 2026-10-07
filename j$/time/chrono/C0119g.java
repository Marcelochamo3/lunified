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

/* JADX INFO: renamed from: j$.time.chrono.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0119g implements InterfaceC0117e, Temporal, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    private final transient InterfaceC0114b a;
    private final transient j$.time.m b;

    private C0119g(InterfaceC0114b interfaceC0114b, j$.time.m mVar) {
        Objects.requireNonNull(interfaceC0114b, "date");
        Objects.requireNonNull(mVar, "time");
        this.a = interfaceC0114b;
        this.b = mVar;
    }

    static C0119g U(n nVar, Temporal temporal) {
        C0119g c0119g = (C0119g) temporal;
        AbstractC0113a abstractC0113a = (AbstractC0113a) nVar;
        if (abstractC0113a.equals(c0119g.a.a())) {
            return c0119g;
        }
        throw new ClassCastException("Chronology mismatch, required: " + abstractC0113a.o() + ", actual: " + c0119g.a.a().o());
    }

    static C0119g W(InterfaceC0114b interfaceC0114b, j$.time.m mVar) {
        return new C0119g(interfaceC0114b, mVar);
    }

    private C0119g Z(InterfaceC0114b interfaceC0114b, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        j$.time.m mVarD0 = this.b;
        if (j5 == 0) {
            return c0(interfaceC0114b, mVarD0);
        }
        long j6 = j2 / 1440;
        long j7 = j / 24;
        long j8 = (j2 % 1440) * 60000000000L;
        long j9 = ((j % 24) * 3600000000000L) + j8 + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jL0 = mVarD0.l0();
        long j10 = j9 + jL0;
        long jK = j$.com.android.tools.r8.a.k(j10, 86400000000000L) + j7 + j6 + (j3 / 86400) + (j4 / 86400000000000L);
        long j11 = j$.com.android.tools.r8.a.j(j10, 86400000000000L);
        if (j11 != jL0) {
            mVarD0 = j$.time.m.d0(j11);
        }
        return c0(interfaceC0114b.e(jK, (TemporalUnit) ChronoUnit.DAYS), mVarD0);
    }

    private C0119g c0(Temporal temporal, j$.time.m mVar) {
        InterfaceC0114b interfaceC0114b = this.a;
        return (interfaceC0114b == temporal && this.b == mVar) ? this : new C0119g(AbstractC0116d.U(interfaceC0114b.a(), temporal), mVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 2, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object C(TemporalQuery temporalQuery) {
        return AbstractC0121i.k(this, temporalQuery);
    }

    @Override // j$.time.temporal.m
    public final Temporal E(Temporal temporal) {
        return temporal.d(c().y(), j$.time.temporal.a.EPOCH_DAY).d(b().l0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int compareTo(InterfaceC0117e interfaceC0117e) {
        return AbstractC0121i.c(this, interfaceC0117e);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0117e p(long j, TemporalUnit temporalUnit) {
        return U(this.a.a(), j$.time.temporal.l.b(this, j, temporalUnit));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final C0119g e(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        InterfaceC0114b interfaceC0114b = this.a;
        if (!z) {
            return U(interfaceC0114b.a(), temporalUnit.r(this, j));
        }
        int i = AbstractC0118f.a[((ChronoUnit) temporalUnit).ordinal()];
        j$.time.m mVar = this.b;
        switch (i) {
            case 1:
                return Z(this.a, 0L, 0L, 0L, j);
            case 2:
                C0119g c0119gC0 = c0(interfaceC0114b.e(j / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), mVar);
                return c0119gC0.Z(c0119gC0.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                C0119g c0119gC1 = c0(interfaceC0114b.e(j / 86400000, (TemporalUnit) ChronoUnit.DAYS), mVar);
                return c0119gC1.Z(c0119gC1.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return Y(j);
            case 5:
                return Z(this.a, 0L, j, 0L, 0L);
            case 6:
                return Z(this.a, j, 0L, 0L, 0L);
            case 7:
                C0119g c0119gC2 = c0(interfaceC0114b.e(j / 256, (TemporalUnit) ChronoUnit.DAYS), mVar);
                return c0119gC2.Z(c0119gC2.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return c0(interfaceC0114b.e(j, temporalUnit), mVar);
        }
    }

    final C0119g Y(long j) {
        return Z(this.a, 0L, 0L, j, 0L);
    }

    @Override // j$.time.chrono.InterfaceC0117e
    public final n a() {
        return this.a.a();
    }

    public final Instant a0(ZoneOffset zoneOffset) {
        return Instant.V(AbstractC0121i.n(this, zoneOffset), this.b.Z());
    }

    @Override // j$.time.chrono.InterfaceC0117e
    public final j$.time.m b() {
        return this.b;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final C0119g d(long j, j$.time.temporal.p pVar) {
        boolean z = pVar instanceof j$.time.temporal.a;
        InterfaceC0114b interfaceC0114b = this.a;
        if (!z) {
            return U(interfaceC0114b.a(), pVar.x(this, j));
        }
        boolean zW = ((j$.time.temporal.a) pVar).W();
        j$.time.m mVar = this.b;
        return zW ? c0(interfaceC0114b, mVar.d(j, pVar)) : c0(interfaceC0114b.d(j, pVar), mVar);
    }

    @Override // j$.time.chrono.InterfaceC0117e
    public final InterfaceC0114b c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0117e) && AbstractC0121i.c(this, (InterfaceC0117e) obj) == 0;
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        long j;
        Objects.requireNonNull(temporal, "endExclusive");
        InterfaceC0114b interfaceC0114b = this.a;
        InterfaceC0117e interfaceC0117eD = interfaceC0114b.a().D(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.p(this, interfaceC0117eD);
        }
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        boolean z = ((ChronoUnit) temporalUnit).compareTo(chronoUnit) < 0;
        j$.time.m mVar = this.b;
        if (!z) {
            InterfaceC0114b interfaceC0114bC = interfaceC0117eD.c();
            if (interfaceC0117eD.b().compareTo(mVar) < 0) {
                interfaceC0114bC = interfaceC0114bC.p(1L, chronoUnit);
            }
            return interfaceC0114b.f(interfaceC0114bC, temporalUnit);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        long jX = interfaceC0117eD.x(aVar) - interfaceC0114b.x(aVar);
        switch (AbstractC0118f.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                j = 86400000000000L;
                jX = j$.com.android.tools.r8.a.l(jX, j);
                break;
            case 2:
                j = 86400000000L;
                jX = j$.com.android.tools.r8.a.l(jX, j);
                break;
            case 3:
                j = 86400000;
                jX = j$.com.android.tools.r8.a.l(jX, j);
                break;
            case 4:
                jX = j$.com.android.tools.r8.a.l(jX, 86400);
                break;
            case 5:
                jX = j$.com.android.tools.r8.a.l(jX, 1440);
                break;
            case 6:
                jX = j$.com.android.tools.r8.a.l(jX, 24);
                break;
            case 7:
                jX = j$.com.android.tools.r8.a.l(jX, 2);
                break;
        }
        return j$.com.android.tools.r8.a.f(jX, mVar.f(interfaceC0117eD.b(), temporalUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar != null && pVar.u(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        return aVar.E() || aVar.W();
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.chrono.InterfaceC0117e
    public final InterfaceC0123k q(ZoneId zoneId) {
        return m.W(zoneId, null, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int r(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).W() ? this.b.r(pVar) : this.a.r(pVar);
        }
        return u(pVar).a(x(pVar), pVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal t(j$.time.i iVar) {
        return c0(iVar, this.b);
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r u(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.C(this);
        }
        if (!((j$.time.temporal.a) pVar).W()) {
            return this.a.u(pVar);
        }
        j$.time.m mVar = this.b;
        mVar.getClass();
        return j$.time.temporal.l.d(mVar, pVar);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.a);
        objectOutput.writeObject(this.b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long x(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).W() ? this.b.x(pVar) : this.a.x(pVar);
        }
        return pVar.t(this);
    }
}
