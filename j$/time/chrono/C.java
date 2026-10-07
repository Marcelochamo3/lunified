package j$.time.chrono;

import j$.time.C0111b;
import j$.time.Clock;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class C extends AbstractC0113a implements Serializable {
    public static final C d = new C();
    private static final long serialVersionUID = 1039765215346859963L;

    private C() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0114b A(int i, int i2) {
        return new E(j$.time.i.l0(i + 1911, i2));
    }

    @Override // j$.time.chrono.AbstractC0113a, j$.time.chrono.n
    public final InterfaceC0117e D(TemporalAccessor temporalAccessor) {
        return super.D(temporalAccessor);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0114b I(int i, int i2, int i3) {
        return new E(j$.time.i.i0(i + 1911, i2, i3));
    }

    @Override // j$.time.chrono.n
    public final j$.time.temporal.r K(j$.time.temporal.a aVar) {
        int i = B.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.r rVarP = j$.time.temporal.a.PROLEPTIC_MONTH.p();
            return j$.time.temporal.r.j(rVarP.e() - 22932, rVarP.d() - 22932);
        }
        if (i == 2) {
            j$.time.temporal.r rVarP2 = j$.time.temporal.a.YEAR.p();
            return j$.time.temporal.r.k(1L, rVarP2.d() - 1911, (-rVarP2.e()) + 1912);
        }
        if (i != 3) {
            return aVar.p();
        }
        j$.time.temporal.r rVarP3 = j$.time.temporal.a.YEAR.p();
        return j$.time.temporal.r.j(rVarP3.e() - 1911, rVarP3.d() - 1911);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0123k L(Instant instant, ZoneId zoneId) {
        return m.X(this, instant, zoneId);
    }

    @Override // j$.time.chrono.n
    public final List O() {
        return j$.com.android.tools.r8.a.h(F.values());
    }

    @Override // j$.time.chrono.n
    public final boolean R(long j) {
        return u.d.R(j + 1911);
    }

    @Override // j$.time.chrono.n
    public final o S(int i) {
        if (i == 0) {
            return F.BEFORE_ROC;
        }
        if (i == 1) {
            return F.ROC;
        }
        throw new C0111b("Invalid era: " + i);
    }

    @Override // j$.time.chrono.AbstractC0113a, j$.time.chrono.n
    public final InterfaceC0114b h(HashMap map, j$.time.format.E e) {
        return (E) super.h(map, e);
    }

    @Override // j$.time.chrono.n
    public final int i(o oVar, int i) {
        if (oVar instanceof F) {
            return oVar == F.ROC ? i : 1 - i;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0114b n(long j) {
        return new E(j$.time.i.k0(j));
    }

    @Override // j$.time.chrono.n
    public final String o() {
        return "Minguo";
    }

    @Override // j$.time.chrono.AbstractC0113a
    public final InterfaceC0114b r() {
        TemporalAccessor temporalAccessorH0 = j$.time.i.h0(Clock.c());
        return temporalAccessorH0 instanceof E ? (E) temporalAccessorH0 : new E(j$.time.i.W(temporalAccessorH0));
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0114b s(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof E ? (E) temporalAccessor : new E(j$.time.i.W(temporalAccessor));
    }

    @Override // j$.time.chrono.n
    public final String w() {
        return "roc";
    }

    Object writeReplace() {
        return new G((byte) 1, this);
    }

    @Override // j$.time.chrono.AbstractC0113a, j$.time.chrono.n
    public final InterfaceC0123k z(TemporalAccessor temporalAccessor) {
        return super.z(temporalAccessor);
    }
}
