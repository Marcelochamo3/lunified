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
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements Temporal, j$.time.temporal.m, InterfaceC0117e, Serializable {
    public static final k c = d0(i.d, m.e);
    public static final k d = d0(i.e, m.f);
    private static final long serialVersionUID = 6207766400415563566L;
    private final i a;
    private final m b;

    private k(i iVar, m mVar) {
        this.a = iVar;
        this.b = mVar;
    }

    private int U(k kVar) {
        int iU = this.a.U(kVar.a);
        return iU == 0 ? this.b.compareTo(kVar.b) : iU;
    }

    public static k V(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof k) {
            return (k) temporalAccessor;
        }
        if (temporalAccessor instanceof D) {
            return ((D) temporalAccessor).a0();
        }
        if (temporalAccessor instanceof s) {
            return ((s) temporalAccessor).Y();
        }
        try {
            return new k(i.W(temporalAccessor), m.W(temporalAccessor));
        } catch (C0111b e) {
            throw new C0111b("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    public static k b0(int i) {
        return new k(i.i0(i, 12, 31), m.b0(0));
    }

    public static k c0(int i, int i2, int i3, int i4, int i5, int i6) {
        return new k(i.i0(i, i2, i3), m.c0(i4, i5, i6, 0));
    }

    public static k d0(i iVar, m mVar) {
        Objects.requireNonNull(iVar, "date");
        Objects.requireNonNull(mVar, "time");
        return new k(iVar, mVar);
    }

    public static k e0(long j, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.V(j2);
        long jC0 = j + ((long) zoneOffset.c0());
        long j3 = 86400;
        return new k(i.k0(j$.com.android.tools.r8.a.k(jC0, j3)), m.d0((((long) ((int) j$.com.android.tools.r8.a.j(jC0, j3))) * 1000000000) + j2));
    }

    private k i0(i iVar, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        m mVarD0 = this.b;
        if (j5 == 0) {
            return m0(iVar, mVarD0);
        }
        long j6 = j / 24;
        long j7 = j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long j8 = 1;
        long j9 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jL0 = mVarD0.l0();
        long j10 = (j9 * j8) + jL0;
        long jK = j$.com.android.tools.r8.a.k(j10, 86400000000000L) + (j7 * j8);
        long j11 = j$.com.android.tools.r8.a.j(j10, 86400000000000L);
        if (j11 != jL0) {
            mVarD0 = m.d0(j11);
        }
        return m0(iVar.n0(jK), mVarD0);
    }

    private k m0(i iVar, m mVar) {
        return (this.a == iVar && this.b == mVar) ? this : new k(iVar, mVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 5, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object C(TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.l.f() ? this.a : AbstractC0121i.k(this, temporalQuery);
    }

    @Override // j$.time.temporal.m
    public final Temporal E(Temporal temporal) {
        return temporal.d(((i) c()).y(), j$.time.temporal.a.EPOCH_DAY).d(b().l0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC0117e interfaceC0117e) {
        return interfaceC0117e instanceof k ? U((k) interfaceC0117e) : AbstractC0121i.c(this, interfaceC0117e);
    }

    public final int W() {
        return this.b.Z();
    }

    public final int X() {
        return this.b.a0();
    }

    public final int Y() {
        return this.a.c0();
    }

    public final boolean Z(k kVar) {
        if (kVar instanceof k) {
            return U(kVar) > 0;
        }
        long jY = this.a.y();
        long jY2 = kVar.a.y();
        return jY > jY2 || (jY == jY2 && this.b.l0() > kVar.b.l0());
    }

    @Override // j$.time.chrono.InterfaceC0117e
    public final j$.time.chrono.n a() {
        return ((i) c()).a();
    }

    public final boolean a0(k kVar) {
        if (kVar instanceof k) {
            return U(kVar) < 0;
        }
        long jY = this.a.y();
        long jY2 = kVar.a.y();
        return jY < jY2 || (jY == jY2 && this.b.l0() < kVar.b.l0());
    }

    @Override // j$.time.chrono.InterfaceC0117e
    public final m b() {
        return this.b;
    }

    @Override // j$.time.chrono.InterfaceC0117e
    public final InterfaceC0114b c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a.equals(kVar.a) && this.b.equals(kVar.b);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00da  */
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
        long jL;
        long j;
        long j2;
        k kVarV = V(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.p(this, kVarV);
        }
        boolean z = ((ChronoUnit) temporalUnit).compareTo(ChronoUnit.DAYS) < 0;
        m mVar = this.b;
        i iVar = this.a;
        if (!z) {
            i iVarN0 = kVarV.a;
            iVarN0.getClass();
            boolean z2 = iVar instanceof i;
            m mVar2 = kVarV.b;
            if (!z2 ? iVarN0.y() > iVar.y() : iVarN0.U(iVar) > 0) {
                if (iVarN0.d0(iVar) && mVar2.compareTo(mVar) > 0) {
                    iVarN0 = iVarN0.n0(1L);
                }
            } else if (mVar2.compareTo(mVar) < 0) {
                iVarN0 = iVarN0.n0(-1L);
            } else if (iVarN0.d0(iVar)) {
                iVarN0 = iVarN0.n0(1L);
            }
            return iVar.f(iVarN0, temporalUnit);
        }
        i iVar2 = kVarV.a;
        iVar.getClass();
        long jY = iVar2.y() - iVar.y();
        m mVar3 = kVarV.b;
        if (jY == 0) {
            return mVar.f(mVar3, temporalUnit);
        }
        long jL0 = mVar3.l0() - mVar.l0();
        if (jY > 0) {
            jL = jY - 1;
            j = jL0 + 86400000000000L;
        } else {
            jL = jY + 1;
            j = jL0 - 86400000000000L;
        }
        switch (j.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                jL = j$.com.android.tools.r8.a.l(jL, 86400000000000L);
                break;
            case 2:
                jL = j$.com.android.tools.r8.a.l(jL, 86400000000L);
                j2 = 1000;
                j /= j2;
                break;
            case 3:
                jL = j$.com.android.tools.r8.a.l(jL, 86400000L);
                j2 = 1000000;
                j /= j2;
                break;
            case 4:
                jL = j$.com.android.tools.r8.a.l(jL, 86400);
                j2 = 1000000000;
                j /= j2;
                break;
            case 5:
                jL = j$.com.android.tools.r8.a.l(jL, 1440);
                j2 = 60000000000L;
                j /= j2;
                break;
            case 6:
                jL = j$.com.android.tools.r8.a.l(jL, 24);
                j2 = 3600000000000L;
                j /= j2;
                break;
            case 7:
                jL = j$.com.android.tools.r8.a.l(jL, 2);
                j2 = 43200000000000L;
                j /= j2;
                break;
        }
        return j$.com.android.tools.r8.a.f(jL, j);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final k e(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (k) temporalUnit.r(this, j);
        }
        switch (j.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return i0(this.a, 0L, 0L, 0L, j);
            case 2:
                k kVarG0 = g0(j / 86400000000L);
                return kVarG0.i0(kVarG0.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                k kVarG1 = g0(j / 86400000);
                return kVarG1.i0(kVarG1.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return h0(j);
            case 5:
                return i0(this.a, 0L, j, 0L, 0L);
            case 6:
                return i0(this.a, j, 0L, 0L, 0L);
            case 7:
                k kVarG2 = g0(j / 256);
                return kVarG2.i0(kVarG2.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return m0(this.a.e(j, temporalUnit), this.b);
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar != null && pVar.u(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        return aVar.E() || aVar.W();
    }

    public final k g0(long j) {
        return m0(this.a.n0(j), this.b);
    }

    public final k h0(long j) {
        return i0(this.a, 0L, 0L, j, 0L);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final i j0() {
        return this.a;
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public final k d(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (k) pVar.x(this, j);
        }
        boolean zW = ((j$.time.temporal.a) pVar).W();
        m mVar = this.b;
        i iVar = this.a;
        return zW ? m0(iVar, mVar.d(j, pVar)) : m0(iVar.d(j, pVar), mVar);
    }

    public final k l0(i iVar) {
        return m0(iVar, this.b);
    }

    final void n0(DataOutput dataOutput) {
        this.a.w0(dataOutput);
        this.b.p0(dataOutput);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal p(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.chrono.InterfaceC0117e
    public final InterfaceC0123k q(ZoneId zoneId) {
        return D.X(this, zoneId, null);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int r(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).W() ? this.b.r(pVar) : this.a.r(pVar);
        }
        return j$.time.temporal.l.a(this, pVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal t(i iVar) {
        return m0(iVar, this.b);
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
        m mVar = this.b;
        mVar.getClass();
        return j$.time.temporal.l.d(mVar, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long x(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).W() ? this.b.x(pVar) : this.a.x(pVar);
        }
        return pVar.t(this);
    }
}
