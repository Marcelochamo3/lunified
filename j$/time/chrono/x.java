package j$.time.chrono;

import j$.time.C0111b;
import j$.time.Clock;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends AbstractC0113a implements Serializable {
    public static final x d = new x();
    private static final long serialVersionUID = 459996390165777884L;

    private x() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0114b A(int i, int i2) {
        return new z(j$.time.i.l0(i, i2));
    }

    @Override // j$.time.chrono.AbstractC0113a, j$.time.chrono.n
    public final InterfaceC0117e D(TemporalAccessor temporalAccessor) {
        return super.D(temporalAccessor);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0114b I(int i, int i2, int i3) {
        return new z(j$.time.i.i0(i, i2, i3));
    }

    @Override // j$.time.chrono.n
    public final j$.time.temporal.r K(j$.time.temporal.a aVar) {
        long jC0;
        long value;
        switch (w.a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.q("Unsupported field: " + aVar);
            case 5:
                return j$.time.temporal.r.k(1L, A.z(), 999999999 - A.i().n().c0());
            case 6:
                return j$.time.temporal.r.k(1L, A.w(), j$.time.temporal.a.DAY_OF_YEAR.p().d());
            case 7:
                jC0 = z.d.c0();
                value = 999999999;
                break;
            case 8:
                jC0 = A.d.getValue();
                value = A.i().getValue();
                break;
            default:
                return aVar.p();
        }
        return j$.time.temporal.r.j(jC0, value);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0123k L(Instant instant, ZoneId zoneId) {
        return m.X(this, instant, zoneId);
    }

    @Override // j$.time.chrono.n
    public final List O() {
        return j$.com.android.tools.r8.a.h(A.A());
    }

    @Override // j$.time.chrono.n
    public final boolean R(long j) {
        return u.d.R(j);
    }

    @Override // j$.time.chrono.n
    public final o S(int i) {
        return A.s(i);
    }

    @Override // j$.time.chrono.AbstractC0113a
    final InterfaceC0114b U(HashMap map, j$.time.format.E e) {
        z zVarD0;
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        Long l = (Long) map.get(aVar);
        A aS = l != null ? A.s(K(aVar).a(l.longValue(), aVar)) : null;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        Long l2 = (Long) map.get(aVar2);
        int iA = l2 != null ? K(aVar2).a(l2.longValue(), aVar2) : 0;
        if (aS == null && l2 != null && !map.containsKey(j$.time.temporal.a.YEAR) && e != j$.time.format.E.STRICT) {
            aS = A.A()[A.A().length - 1];
        }
        if (l2 != null && aS != null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                j$.time.temporal.a aVar4 = j$.time.temporal.a.DAY_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    map.remove(aVar);
                    map.remove(aVar2);
                    if (e == j$.time.format.E.LENIENT) {
                        return new z(j$.time.i.i0((aS.n().c0() + iA) - 1, 1, 1)).a0(j$.com.android.tools.r8.a.m(((Long) map.remove(aVar3)).longValue(), 1L), ChronoUnit.MONTHS).a0(j$.com.android.tools.r8.a.m(((Long) map.remove(aVar4)).longValue(), 1L), ChronoUnit.DAYS);
                    }
                    int iA2 = K(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    int iA3 = K(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                    if (e != j$.time.format.E.SMART) {
                        j$.time.i iVar = z.d;
                        Objects.requireNonNull(aS, "era");
                        j$.time.i iVarI0 = j$.time.i.i0((aS.n().c0() + iA) - 1, iA2, iA3);
                        if (iVarI0.d0(aS.n()) || aS != A.h(iVarI0)) {
                            throw new C0111b("year, month, and day not valid for Era");
                        }
                        return new z(aS, iA, iVarI0);
                    }
                    if (iA < 1) {
                        throw new C0111b("Invalid YearOfEra: " + iA);
                    }
                    int iC0 = (aS.n().c0() + iA) - 1;
                    try {
                        zVarD0 = new z(j$.time.i.i0(iC0, iA2, iA3));
                    } catch (C0111b unused) {
                        zVarD0 = new z(j$.time.i.i0(iC0, iA2, 1)).d0(new j$.time.temporal.o(0));
                    }
                    if (zVarD0.Z() == aS || j$.time.temporal.l.a(zVarD0, j$.time.temporal.a.YEAR_OF_ERA) <= 1 || iA <= 1) {
                        return zVarD0;
                    }
                    throw new C0111b("Invalid YearOfEra for Era: " + aS + " " + iA);
                }
            }
            j$.time.temporal.a aVar5 = j$.time.temporal.a.DAY_OF_YEAR;
            if (map.containsKey(aVar5)) {
                map.remove(aVar);
                map.remove(aVar2);
                if (e == j$.time.format.E.LENIENT) {
                    return new z(j$.time.i.l0((aS.n().c0() + iA) - 1, 1)).a0(j$.com.android.tools.r8.a.m(((Long) map.remove(aVar5)).longValue(), 1L), ChronoUnit.DAYS);
                }
                int iA4 = K(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5);
                j$.time.i iVar2 = z.d;
                Objects.requireNonNull(aS, "era");
                int iC1 = aS.n().c0();
                j$.time.i iVarL0 = iA == 1 ? j$.time.i.l0(iC1, (aS.n().Z() + iA4) - 1) : j$.time.i.l0((iC1 + iA) - 1, iA4);
                if (iVarL0.d0(aS.n()) || aS != A.h(iVarL0)) {
                    throw new C0111b("Invalid parameters");
                }
                return new z(aS, iA, iVarL0);
            }
        }
        return null;
    }

    @Override // j$.time.chrono.AbstractC0113a, j$.time.chrono.n
    public final InterfaceC0114b h(HashMap map, j$.time.format.E e) {
        return (z) super.h(map, e);
    }

    @Override // j$.time.chrono.n
    public final int i(o oVar, int i) {
        if (!(oVar instanceof A)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        A a = (A) oVar;
        int iC0 = (a.n().c0() + i) - 1;
        if (i == 1) {
            return iC0;
        }
        if (iC0 < -999999999 || iC0 > 999999999 || iC0 < a.n().c0() || oVar != A.h(j$.time.i.i0(iC0, 1, 1))) {
            throw new C0111b("Invalid yearOfEra value");
        }
        return iC0;
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0114b n(long j) {
        return new z(j$.time.i.k0(j));
    }

    @Override // j$.time.chrono.n
    public final String o() {
        return "Japanese";
    }

    @Override // j$.time.chrono.AbstractC0113a
    public final InterfaceC0114b r() {
        TemporalAccessor temporalAccessorH0 = j$.time.i.h0(Clock.c());
        return temporalAccessorH0 instanceof z ? (z) temporalAccessorH0 : new z(j$.time.i.W(temporalAccessorH0));
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0114b s(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof z ? (z) temporalAccessor : new z(j$.time.i.W(temporalAccessor));
    }

    @Override // j$.time.chrono.n
    public final String w() {
        return "japanese";
    }

    Object writeReplace() {
        return new G((byte) 1, this);
    }

    @Override // j$.time.chrono.AbstractC0113a, j$.time.chrono.n
    public final InterfaceC0123k z(TemporalAccessor temporalAccessor) {
        return super.z(temporalAccessor);
    }
}
