package j$.time.chrono;

import j$.time.C0111b;
import j$.time.Clock;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends AbstractC0113a implements Serializable {
    public static final u d = new u();
    private static final long serialVersionUID = -1440403870442975015L;

    private u() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0114b A(int i, int i2) {
        return j$.time.i.l0(i, i2);
    }

    @Override // j$.time.chrono.AbstractC0113a
    final void C(HashMap map, j$.time.format.E e) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (e != j$.time.format.E.LENIENT) {
                aVar.V(l.longValue());
            }
            long j = 12;
            AbstractC0113a.p(map, j$.time.temporal.a.MONTH_OF_YEAR, ((int) j$.com.android.tools.r8.a.j(l.longValue(), j)) + 1);
            AbstractC0113a.p(map, j$.time.temporal.a.YEAR, j$.com.android.tools.r8.a.k(l.longValue(), j));
        }
    }

    @Override // j$.time.chrono.AbstractC0113a, j$.time.chrono.n
    public final InterfaceC0117e D(TemporalAccessor temporalAccessor) {
        return j$.time.k.V(temporalAccessor);
    }

    @Override // j$.time.chrono.AbstractC0113a
    final InterfaceC0114b E(HashMap map, j$.time.format.E e) {
        int iV;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iU = aVar.U(((Long) map.remove(aVar)).longValue());
        boolean z = true;
        if (e == j$.time.format.E.LENIENT) {
            return j$.time.i.i0(iU, 1, 1).o0(j$.com.android.tools.r8.a.m(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L)).n0(j$.com.android.tools.r8.a.m(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L));
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iU2 = aVar2.U(((Long) map.remove(aVar2)).longValue());
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iU3 = aVar3.U(((Long) map.remove(aVar3)).longValue());
        if (e == j$.time.format.E.SMART) {
            if (iU2 == 4 || iU2 == 6 || iU2 == 9 || iU2 == 11) {
                iV = 30;
            } else if (iU2 == 2) {
                j$.time.o oVar = j$.time.o.FEBRUARY;
                long j = iU;
                int i = j$.time.y.b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z = false;
                }
                iV = oVar.V(z);
            }
            iU3 = Math.min(iU3, iV);
        }
        return j$.time.i.i0(iU, iU2, iU3);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0114b I(int i, int i2, int i3) {
        return j$.time.i.i0(i, i2, i3);
    }

    @Override // j$.time.chrono.n
    public final j$.time.temporal.r K(j$.time.temporal.a aVar) {
        return aVar.p();
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0123k L(Instant instant, ZoneId zoneId) {
        return j$.time.D.W(instant, zoneId);
    }

    @Override // j$.time.chrono.n
    public final List O() {
        return j$.com.android.tools.r8.a.h(v.values());
    }

    @Override // j$.time.chrono.n
    public final boolean R(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }

    @Override // j$.time.chrono.n
    public final o S(int i) {
        if (i == 0) {
            return v.BCE;
        }
        if (i == 1) {
            return v.CE;
        }
        throw new C0111b("Invalid era: " + i);
    }

    @Override // j$.time.chrono.AbstractC0113a
    final InterfaceC0114b U(HashMap map, j$.time.format.E e) {
        j$.time.temporal.a aVar;
        long jM;
        long jLongValue;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        Long l = (Long) map.remove(aVar2);
        if (l == null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
            if (!map.containsKey(aVar3)) {
                return null;
            }
            aVar3.V(((Long) map.get(aVar3)).longValue());
            return null;
        }
        if (e != j$.time.format.E.LENIENT) {
            aVar2.V(l.longValue());
        }
        Long l2 = (Long) map.remove(j$.time.temporal.a.ERA);
        if (l2 != null) {
            if (l2.longValue() == 1) {
                aVar = j$.time.temporal.a.YEAR;
                jM = l.longValue();
            } else {
                if (l2.longValue() != 0) {
                    throw new C0111b("Invalid value for era: " + l2);
                }
                aVar = j$.time.temporal.a.YEAR;
                jM = j$.com.android.tools.r8.a.m(1L, l.longValue());
            }
            AbstractC0113a.p(map, aVar, jM);
            return null;
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.YEAR;
        Long l3 = (Long) map.get(aVar4);
        if (e == j$.time.format.E.STRICT) {
            if (l3 == null) {
                map.put(aVar2, l);
                return null;
            }
            long jLongValue2 = l3.longValue();
            jLongValue = l.longValue();
            if (jLongValue2 <= 0) {
                jLongValue = j$.com.android.tools.r8.a.m(1L, jLongValue);
            }
        } else if (l3 == null || l3.longValue() > 0) {
            jLongValue = l.longValue();
        } else {
            jLongValue = l.longValue();
            jLongValue = j$.com.android.tools.r8.a.m(1L, jLongValue);
        }
        AbstractC0113a.p(map, aVar4, jLongValue);
        return null;
    }

    @Override // j$.time.chrono.AbstractC0113a, j$.time.chrono.n
    public final InterfaceC0114b h(HashMap map, j$.time.format.E e) {
        return (j$.time.i) super.h(map, e);
    }

    @Override // j$.time.chrono.n
    public final int i(o oVar, int i) {
        if (oVar instanceof v) {
            return oVar == v.CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0114b n(long j) {
        return j$.time.i.k0(j);
    }

    @Override // j$.time.chrono.n
    public final String o() {
        return "ISO";
    }

    @Override // j$.time.chrono.AbstractC0113a
    public final InterfaceC0114b r() {
        Clock clockC = Clock.c();
        Objects.requireNonNull(clockC, "clock");
        return j$.time.i.W(j$.time.i.h0(clockC));
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0114b s(TemporalAccessor temporalAccessor) {
        return j$.time.i.W(temporalAccessor);
    }

    @Override // j$.time.chrono.n
    public final String w() {
        return "iso8601";
    }

    Object writeReplace() {
        return new G((byte) 1, this);
    }

    @Override // j$.time.chrono.AbstractC0113a, j$.time.chrono.n
    public final InterfaceC0123k z(TemporalAccessor temporalAccessor) {
        return j$.time.D.V(temporalAccessor);
    }
}
