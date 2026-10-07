package j$.time.chrono;

import j$.time.AbstractC0112c;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.Serializable;

/* JADX INFO: renamed from: j$.time.chrono.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC0116d implements InterfaceC0114b, Temporal, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    AbstractC0116d() {
    }

    static InterfaceC0114b U(n nVar, Temporal temporal) {
        InterfaceC0114b interfaceC0114b = (InterfaceC0114b) temporal;
        AbstractC0113a abstractC0113a = (AbstractC0113a) nVar;
        if (abstractC0113a.equals(interfaceC0114b.a())) {
            return interfaceC0114b;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + abstractC0113a.o() + ", actual: " + interfaceC0114b.a().o());
    }

    private long V(InterfaceC0114b interfaceC0114b) {
        if (a().K(j$.time.temporal.a.MONTH_OF_YEAR).d() != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        long jX = x(aVar) * 32;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_MONTH;
        return (((interfaceC0114b.x(aVar) * 32) + ((long) interfaceC0114b.r(aVar2))) - (jX + ((long) j$.time.temporal.l.a(this, aVar2)))) / 32;
    }

    @Override // j$.time.chrono.InterfaceC0114b
    public InterfaceC0117e B(j$.time.m mVar) {
        return C0119g.W(this, mVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object C(TemporalQuery temporalQuery) {
        return AbstractC0121i.j(this, temporalQuery);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Temporal E(Temporal temporal) {
        return AbstractC0121i.a(this, temporal);
    }

    @Override // j$.time.chrono.InterfaceC0114b
    public o F() {
        return a().S(j$.time.temporal.l.a(this, j$.time.temporal.a.ERA));
    }

    @Override // j$.time.chrono.InterfaceC0114b
    public boolean J() {
        return a().R(x(j$.time.temporal.a.YEAR));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: N */
    public InterfaceC0114b p(long j, TemporalUnit temporalUnit) {
        return U(a(), j$.time.temporal.l.b(this, j, temporalUnit));
    }

    @Override // j$.time.chrono.InterfaceC0114b
    public int P() {
        return J() ? 366 : 365;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ int compareTo(InterfaceC0114b interfaceC0114b) {
        return AbstractC0121i.b(this, interfaceC0114b);
    }

    abstract InterfaceC0114b W(long j);

    abstract InterfaceC0114b X(long j);

    abstract InterfaceC0114b Y(long j);

    @Override // j$.time.temporal.Temporal
    public InterfaceC0114b d(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.q(AbstractC0112c.a("Unsupported field: ", pVar));
        }
        return U(a(), pVar.x(this, j));
    }

    @Override // j$.time.temporal.Temporal
    public InterfaceC0114b e(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        if (!z) {
            if (!z) {
                return U(a(), temporalUnit.r(this, j));
            }
            throw new j$.time.temporal.q("Unsupported unit: " + temporalUnit);
        }
        switch (AbstractC0115c.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return W(j);
            case 2:
                return W(j$.com.android.tools.r8.a.l(j, 7));
            case 3:
                return X(j);
            case 4:
                return Y(j);
            case 5:
                return Y(j$.com.android.tools.r8.a.l(j, 10));
            case 6:
                return Y(j$.com.android.tools.r8.a.l(j, 100));
            case 7:
                return Y(j$.com.android.tools.r8.a.l(j, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.f(x(aVar), j), (j$.time.temporal.p) aVar);
            default:
                throw new j$.time.temporal.q("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // j$.time.chrono.InterfaceC0114b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0114b) && AbstractC0121i.b(this, (InterfaceC0114b) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC0114b, j$.time.temporal.Temporal
    public long f(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        InterfaceC0114b interfaceC0114bS = a().s(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.p(this, interfaceC0114bS);
        }
        switch (AbstractC0115c.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return interfaceC0114bS.y() - y();
            case 2:
                return (interfaceC0114bS.y() - y()) / 7;
            case 3:
                return V(interfaceC0114bS);
            case 4:
                return V(interfaceC0114bS) / 12;
            case 5:
                return V(interfaceC0114bS) / 120;
            case 6:
                return V(interfaceC0114bS) / 1200;
            case 7:
                return V(interfaceC0114bS) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return interfaceC0114bS.x(aVar) - x(aVar);
            default:
                throw new j$.time.temporal.q("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // j$.time.chrono.InterfaceC0114b, j$.time.temporal.TemporalAccessor
    public /* synthetic */ boolean g(j$.time.temporal.p pVar) {
        return AbstractC0121i.h(this, pVar);
    }

    @Override // j$.time.chrono.InterfaceC0114b
    public int hashCode() {
        long jY = y();
        return ((AbstractC0113a) a()).hashCode() ^ ((int) (jY ^ (jY >>> 32)));
    }

    @Override // j$.time.chrono.InterfaceC0114b
    public InterfaceC0114b j(j$.time.v vVar) {
        return U(a(), vVar.p(this));
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: m */
    public InterfaceC0114b t(j$.time.temporal.m mVar) {
        return U(a(), mVar.E(this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int r(j$.time.temporal.p pVar) {
        return j$.time.temporal.l.a(this, pVar);
    }

    @Override // j$.time.chrono.InterfaceC0114b
    public String toString() {
        long jX = x(j$.time.temporal.a.YEAR_OF_ERA);
        long jX2 = x(j$.time.temporal.a.MONTH_OF_YEAR);
        long jX3 = x(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(((AbstractC0113a) a()).o());
        sb.append(" ");
        sb.append(F());
        sb.append(" ");
        sb.append(jX);
        sb.append(jX2 < 10 ? "-0" : "-");
        sb.append(jX2);
        sb.append(jX3 < 10 ? "-0" : "-");
        sb.append(jX3);
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ j$.time.temporal.r u(j$.time.temporal.p pVar) {
        return j$.time.temporal.l.d(this, pVar);
    }

    @Override // j$.time.chrono.InterfaceC0114b
    public long y() {
        return x(j$.time.temporal.a.EPOCH_DAY);
    }
}
