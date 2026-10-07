package j$.time.temporal;

import j$.time.ZoneId;
import j$.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o implements TemporalQuery, m {
    public final /* synthetic */ int a;

    public /* synthetic */ o(int i) {
        this.a = i;
    }

    @Override // j$.time.temporal.m
    public Temporal E(Temporal temporal) {
        a aVar = a.DAY_OF_MONTH;
        return temporal.d(temporal.u(aVar).d(), aVar);
    }

    @Override // j$.time.temporal.TemporalQuery
    public Object queryFrom(TemporalAccessor temporalAccessor) {
        switch (this.a) {
            case 1:
                return (ZoneId) temporalAccessor.C(l.a);
            case 2:
                return (j$.time.chrono.n) temporalAccessor.C(l.b);
            case 3:
                return (TemporalUnit) temporalAccessor.C(l.c);
            case 4:
                a aVar = a.OFFSET_SECONDS;
                if (temporalAccessor.g(aVar)) {
                    return ZoneOffset.f0(temporalAccessor.r(aVar));
                }
                return null;
            case 5:
                ZoneId zoneId = (ZoneId) temporalAccessor.C(l.a);
                return zoneId != null ? zoneId : (ZoneId) temporalAccessor.C(l.d);
            case 6:
                a aVar2 = a.EPOCH_DAY;
                if (temporalAccessor.g(aVar2)) {
                    return j$.time.i.k0(temporalAccessor.x(aVar2));
                }
                return null;
            default:
                a aVar3 = a.NANO_OF_DAY;
                if (temporalAccessor.g(aVar3)) {
                    return j$.time.m.d0(temporalAccessor.x(aVar3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "ZoneId";
            case 2:
                return "Chronology";
            case 3:
                return "Precision";
            case 4:
                return "ZoneOffset";
            case 5:
                return "Zone";
            case 6:
                return "LocalDate";
            case 7:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
