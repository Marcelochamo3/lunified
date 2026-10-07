package j$.time.chrono;

import j$.time.AbstractC0112c;
import j$.time.C0111b;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class z extends AbstractC0116d {
    static final j$.time.i d = j$.time.i.i0(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    private final transient j$.time.i a;
    private transient A b;
    private transient int c;

    z(A a, int i, j$.time.i iVar) {
        if (iVar.d0(d)) {
            throw new C0111b("JapaneseDate before Meiji 6 is not supported");
        }
        this.b = a;
        this.c = i;
        this.a = iVar;
    }

    z(j$.time.i iVar) {
        if (iVar.d0(d)) {
            throw new C0111b("JapaneseDate before Meiji 6 is not supported");
        }
        A aH = A.h(iVar);
        this.b = aH;
        this.c = (iVar.c0() - aH.n().c0()) + 1;
        this.a = iVar;
    }

    private z c0(j$.time.i iVar) {
        return iVar.equals(this.a) ? this : new z(iVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 4, this);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b
    public final InterfaceC0117e B(j$.time.m mVar) {
        return C0119g.W(this, mVar);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b
    public final o F() {
        return this.b;
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b
    /* JADX INFO: renamed from: N */
    public final InterfaceC0114b p(long j, TemporalUnit temporalUnit) {
        return (z) super.p(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b
    public final int P() {
        A a = this.b;
        A aO = a.o();
        j$.time.i iVar = this.a;
        int iP = (aO == null || aO.n().c0() != iVar.c0()) ? iVar.P() : aO.n().Z() - 1;
        return this.c == 1 ? iP - (a.n().Z() - 1) : iP;
    }

    @Override // j$.time.chrono.AbstractC0116d
    final InterfaceC0114b W(long j) {
        return c0(this.a.n0(j));
    }

    @Override // j$.time.chrono.AbstractC0116d
    final InterfaceC0114b X(long j) {
        return c0(this.a.o0(j));
    }

    @Override // j$.time.chrono.AbstractC0116d
    final InterfaceC0114b Y(long j) {
        return c0(this.a.q0(j));
    }

    public final A Z() {
        return this.b;
    }

    @Override // j$.time.chrono.InterfaceC0114b
    public final n a() {
        return x.d;
    }

    public final z a0(long j, ChronoUnit chronoUnit) {
        return (z) super.e(j, (TemporalUnit) chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final z d(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (z) super.d(j, pVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        if (x(aVar) == j) {
            return this;
        }
        int[] iArr = y.a;
        int i = iArr[aVar.ordinal()];
        j$.time.i iVar = this.a;
        if (i == 3 || i == 8 || i == 9) {
            x xVar = x.d;
            int iA = xVar.K(aVar).a(j, aVar);
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 3) {
                return c0(iVar.v0(xVar.i(this.b, iA)));
            }
            if (i2 == 8) {
                return c0(iVar.v0(xVar.i(A.s(iA), this.c)));
            }
            if (i2 == 9) {
                return c0(iVar.v0(iA));
            }
        }
        return c0(iVar.d(j, pVar));
    }

    public final z d0(j$.time.temporal.o oVar) {
        return (z) super.t(oVar);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b, j$.time.temporal.Temporal
    public final InterfaceC0114b e(long j, TemporalUnit temporalUnit) {
        return (z) super.e(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.temporal.Temporal
    public final Temporal e(long j, TemporalUnit temporalUnit) {
        return (z) super.e(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return this.a.equals(((z) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b, j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || pVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || pVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || pVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).E();
        }
        return pVar != null && pVar.u(this);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b
    public final int hashCode() {
        x.d.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b
    public final InterfaceC0114b j(j$.time.v vVar) {
        return (z) super.j(vVar);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b
    /* JADX INFO: renamed from: m */
    public final InterfaceC0114b t(j$.time.temporal.m mVar) {
        return (z) super.t(mVar);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.temporal.Temporal
    public final Temporal p(long j, ChronoUnit chronoUnit) {
        return (z) super.p(j, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.temporal.Temporal
    public final Temporal t(j$.time.i iVar) {
        return (z) super.t(iVar);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r u(j$.time.temporal.p pVar) {
        int iE0;
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.C(this);
        }
        if (!g(pVar)) {
            throw new j$.time.temporal.q(AbstractC0112c.a("Unsupported field: ", pVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i = y.a[aVar.ordinal()];
        if (i == 1) {
            iE0 = this.a.e0();
        } else if (i == 2) {
            iE0 = P();
        } else {
            if (i != 3) {
                return x.d.K(aVar);
            }
            A a = this.b;
            int iC0 = a.n().c0();
            A aO = a.o();
            iE0 = aO != null ? (aO.n().c0() - iC0) + 1 : 999999999 - iC0;
        }
        return j$.time.temporal.r.j(1L, iE0);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long x(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.t(this);
        }
        int i = y.a[((j$.time.temporal.a) pVar).ordinal()];
        int i2 = this.c;
        A a = this.b;
        j$.time.i iVar = this.a;
        switch (i) {
            case 2:
                return i2 == 1 ? (iVar.Z() - a.n().Z()) + 1 : iVar.Z();
            case 3:
                return i2;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.q(AbstractC0112c.a("Unsupported field: ", pVar));
            case 8:
                return a.getValue();
            default:
                return iVar.x(pVar);
        }
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b
    public final long y() {
        return this.a.y();
    }
}
