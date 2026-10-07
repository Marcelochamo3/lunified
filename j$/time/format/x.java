package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC0114b;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

/* JADX INFO: loaded from: classes2.dex */
final class x implements TemporalAccessor {
    final /* synthetic */ InterfaceC0114b a;
    final /* synthetic */ TemporalAccessor b;
    final /* synthetic */ j$.time.chrono.n c;
    final /* synthetic */ ZoneId d;

    x(InterfaceC0114b interfaceC0114b, TemporalAccessor temporalAccessor, j$.time.chrono.n nVar, ZoneId zoneId) {
        this.a = interfaceC0114b;
        this.b = temporalAccessor;
        this.c = nVar;
        this.d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object C(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.l.e()) {
            return this.c;
        }
        if (temporalQuery == j$.time.temporal.l.l()) {
            return this.d;
        }
        return temporalQuery == j$.time.temporal.l.j() ? this.b.C(temporalQuery) : temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        InterfaceC0114b interfaceC0114b = this.a;
        return (interfaceC0114b == null || !pVar.E()) ? this.b.g(pVar) : interfaceC0114b.g(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int r(j$.time.temporal.p pVar) {
        return j$.time.temporal.l.a(this, pVar);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.n nVar = this.c;
        if (nVar != null) {
            str = " with chronology " + nVar;
        } else {
            str = "";
        }
        ZoneId zoneId = this.d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.b + str + str2;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r u(j$.time.temporal.p pVar) {
        InterfaceC0114b interfaceC0114b = this.a;
        return (interfaceC0114b == null || !pVar.E()) ? this.b.u(pVar) : interfaceC0114b.u(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long x(j$.time.temporal.p pVar) {
        InterfaceC0114b interfaceC0114b = this.a;
        return (interfaceC0114b == null || !pVar.E()) ? this.b.x(pVar) : interfaceC0114b.x(pVar);
    }
}
