package j$.time.chrono;

import j$.time.AbstractC0112c;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class K extends AbstractC0116d {
    private static final long serialVersionUID = -8722293800195731463L;
    private final transient j$.time.i a;

    K(j$.time.i iVar) {
        Objects.requireNonNull(iVar, "isoDate");
        this.a = iVar;
    }

    private int Z() {
        return this.a.c0() + 543;
    }

    private K b0(j$.time.i iVar) {
        return iVar.equals(this.a) ? this : new K(iVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 8, this);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b
    public final InterfaceC0117e B(j$.time.m mVar) {
        return C0119g.W(this, mVar);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b
    public final o F() {
        return Z() >= 1 ? L.BE : L.BEFORE_BE;
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b
    /* JADX INFO: renamed from: N */
    public final InterfaceC0114b p(long j, TemporalUnit temporalUnit) {
        return (K) super.p(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0116d
    final InterfaceC0114b W(long j) {
        return b0(this.a.n0(j));
    }

    @Override // j$.time.chrono.AbstractC0116d
    final InterfaceC0114b X(long j) {
        return b0(this.a.o0(j));
    }

    @Override // j$.time.chrono.AbstractC0116d
    final InterfaceC0114b Y(long j) {
        return b0(this.a.q0(j));
    }

    @Override // j$.time.chrono.InterfaceC0114b
    public final n a() {
        return I.d;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:18:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0085  */
    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    @Override // j$.time.chrono.AbstractC0116d, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final K d(long j, j$.time.temporal.p pVar) {
        int iA;
        int i;
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (K) super.d(j, pVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        if (x(aVar) == j) {
            return this;
        }
        int[] iArr = J.a;
        int i2 = iArr[aVar.ordinal()];
        j$.time.i iVar = this.a;
        if (i2 == 4) {
            iA = I.d.K(aVar).a(j, aVar);
            i = iArr[aVar.ordinal()];
            if (i != 4) {
                if (Z() < 1) {
                    iA = 1 - iA;
                }
                return b0(iVar.v0(iA - 543));
            }
            if (i != 6) {
                return b0(iVar.v0(iA - 543));
            }
            if (i == 7) {
                return b0(iVar.v0((-542) - Z()));
            }
        } else {
            if (i2 == 5) {
                I.d.K(aVar).b(j, aVar);
                return b0(iVar.o0(j - (((((long) Z()) * 12) + ((long) iVar.a0())) - 1)));
            }
            if (i2 == 6 || i2 == 7) {
                iA = I.d.K(aVar).a(j, aVar);
                i = iArr[aVar.ordinal()];
                if (i != 4) {
                    if (Z() < 1) {
                        iA = 1 - iA;
                    }
                    return b0(iVar.v0(iA - 543));
                }
                if (i != 6) {
                    return b0(iVar.v0(iA - 543));
                }
                if (i == 7) {
                    return b0(iVar.v0((-542) - Z()));
                }
            }
        }
        return b0(iVar.d(j, pVar));
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b, j$.time.temporal.Temporal
    public final InterfaceC0114b e(long j, TemporalUnit temporalUnit) {
        return (K) super.e(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.temporal.Temporal
    public final Temporal e(long j, TemporalUnit temporalUnit) {
        return (K) super.e(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof K) {
            return this.a.equals(((K) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b
    public final int hashCode() {
        I.d.getClass();
        return this.a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b
    public final InterfaceC0114b j(j$.time.v vVar) {
        return (K) super.j(vVar);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b
    /* JADX INFO: renamed from: m */
    public final InterfaceC0114b t(j$.time.temporal.m mVar) {
        return (K) super.t(mVar);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.temporal.Temporal
    public final Temporal p(long j, ChronoUnit chronoUnit) {
        return (K) super.p(j, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.temporal.Temporal
    public final Temporal t(j$.time.i iVar) {
        return (K) super.t(iVar);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r u(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.C(this);
        }
        if (!AbstractC0121i.h(this, pVar)) {
            throw new j$.time.temporal.q(AbstractC0112c.a("Unsupported field: ", pVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i = J.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.u(pVar);
        }
        if (i != 4) {
            return I.d.K(aVar);
        }
        j$.time.temporal.r rVarP = j$.time.temporal.a.YEAR.p();
        return j$.time.temporal.r.j(1L, Z() <= 0 ? (-(rVarP.e() + 543)) + 1 : 543 + rVarP.d());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long x(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.t(this);
        }
        int i = J.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i == 4) {
            int iZ = Z();
            if (iZ < 1) {
                iZ = 1 - iZ;
            }
            return iZ;
        }
        j$.time.i iVar = this.a;
        if (i == 5) {
            return ((((long) Z()) * 12) + ((long) iVar.a0())) - 1;
        }
        if (i == 6) {
            return Z();
        }
        if (i != 7) {
            return iVar.x(pVar);
        }
        return Z() < 1 ? 0 : 1;
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b
    public final long y() {
        return this.a.y();
    }
}
