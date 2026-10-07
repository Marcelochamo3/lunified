package j$.time.format;

import j$.time.C0111b;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.InterfaceC0114b;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import j$.util.Objects;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
final class y {
    private TemporalAccessor a;
    private DateTimeFormatter b;
    private int c;

    /* JADX WARN: Code duplicated, block: B:42:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fb A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x00c8, please report this as an issue */
    y(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        int i;
        ZoneId zoneIdD;
        Object objRequireNonNull;
        j$.time.chrono.n nVarA = dateTimeFormatter.a();
        ZoneId zoneIdD2 = dateTimeFormatter.d();
        if (nVarA != null || zoneIdD2 != null) {
            j$.time.chrono.n nVar = (j$.time.chrono.n) temporalAccessor.C(j$.time.temporal.l.e());
            ZoneId zoneId = (ZoneId) temporalAccessor.C(j$.time.temporal.l.l());
            InterfaceC0114b interfaceC0114bS = null;
            nVarA = Objects.equals(nVarA, nVar) ? null : nVarA;
            zoneIdD2 = Objects.equals(zoneIdD2, zoneId) ? null : zoneIdD2;
            if (nVarA != null || zoneIdD2 != null) {
                j$.time.chrono.n nVar2 = nVarA != null ? nVarA : nVar;
                if (zoneIdD2 == null) {
                    zoneId = zoneIdD2 != null ? zoneIdD2 : zoneId;
                    if (nVarA != null) {
                        if (temporalAccessor.g(j$.time.temporal.a.EPOCH_DAY)) {
                            interfaceC0114bS = nVar2.s(temporalAccessor);
                        } else if (nVarA == j$.time.chrono.u.d || nVar != null) {
                            for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                                if (!aVar.E() && temporalAccessor.g(aVar)) {
                                    throw new C0111b("Unable to apply override chronology '" + nVarA + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                                }
                            }
                        }
                    }
                    temporalAccessor = new x(interfaceC0114bS, temporalAccessor, nVar2, zoneId);
                } else if (temporalAccessor.g(j$.time.temporal.a.INSTANT_SECONDS)) {
                    j$.time.chrono.u uVar = j$.time.chrono.u.d;
                    if (nVar2 == null) {
                        objRequireNonNull = nVar2;
                        objRequireNonNull = Objects.requireNonNull(uVar, "defaultObj");
                    }
                    objRequireNonNull = nVar2;
                    temporalAccessor = ((j$.time.chrono.n) objRequireNonNull).L(Instant.from(temporalAccessor), zoneIdD2);
                } else {
                    try {
                        j$.time.zone.f fVarV = zoneIdD2.V();
                        zoneIdD = fVarV.i() ? fVarV.d(Instant.c) : zoneIdD2;
                    } catch (j$.time.zone.g unused) {
                    }
                    if (zoneIdD instanceof ZoneOffset) {
                        j$.time.temporal.a aVar2 = j$.time.temporal.a.OFFSET_SECONDS;
                        if (temporalAccessor.g(aVar2) && temporalAccessor.r(aVar2) != zoneIdD2.V().d(Instant.c).c0()) {
                            throw new C0111b("Unable to apply override zone '" + zoneIdD2 + "' because the temporal object being formatted has a different offset but does not represent an instant: " + temporalAccessor);
                        }
                    }
                    if (zoneIdD2 != null) {
                    }
                    if (nVarA != null) {
                        if (temporalAccessor.g(j$.time.temporal.a.EPOCH_DAY)) {
                            interfaceC0114bS = nVar2.s(temporalAccessor);
                        } else if (nVarA == j$.time.chrono.u.d) {
                            while (i < r2) {
                                if (!aVar.E()) {
                                }
                            }
                        } else {
                            while (i < r2) {
                                if (!aVar.E()) {
                                }
                            }
                        }
                    }
                    temporalAccessor = new x(interfaceC0114bS, temporalAccessor, nVar2, zoneId);
                }
            }
        }
        this.a = temporalAccessor;
        this.b = dateTimeFormatter;
    }

    final void a() {
        this.c--;
    }

    final C b() {
        return this.b.b();
    }

    final Locale c() {
        return this.b.c();
    }

    final TemporalAccessor d() {
        return this.a;
    }

    final Long e(j$.time.temporal.p pVar) {
        int i = this.c;
        TemporalAccessor temporalAccessor = this.a;
        if (i <= 0 || temporalAccessor.g(pVar)) {
            return Long.valueOf(temporalAccessor.x(pVar));
        }
        return null;
    }

    final Object f(TemporalQuery temporalQuery) {
        TemporalAccessor temporalAccessor = this.a;
        Object objC = temporalAccessor.C(temporalQuery);
        if (objC != null || this.c != 0) {
            return objC;
        }
        throw new C0111b("Unable to extract " + temporalQuery + " from temporal " + temporalAccessor);
    }

    final void g() {
        this.c++;
    }

    public final String toString() {
        return this.a.toString();
    }
}
