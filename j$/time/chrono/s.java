package j$.time.chrono;

import j$.time.AbstractC0112c;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends AbstractC0116d {
    private static final long serialVersionUID = -5207853542612002020L;
    private final transient q a;
    private final transient int b;
    private final transient int c;
    private final transient int d;

    private s(q qVar, int i, int i2, int i3) {
        qVar.a0(i, i2, i3);
        this.a = qVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private s(q qVar, long j) {
        int[] iArrB0 = qVar.b0((int) j);
        this.a = qVar;
        this.b = iArrB0[0];
        this.c = iArrB0[1];
        this.d = iArrB0[2];
    }

    private int Z() {
        return this.a.Z(this.b, this.c) + this.d;
    }

    static s a0(q qVar, int i, int i2, int i3) {
        return new s(qVar, i, i2, i3);
    }

    static s b0(q qVar, long j) {
        return new s(qVar, j);
    }

    private s e0(int i, int i2, int i3) {
        q qVar = this.a;
        int iC0 = qVar.c0(i, i2);
        if (i3 > iC0) {
            i3 = iC0;
        }
        return new s(qVar, i, i2, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 6, this);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b
    public final InterfaceC0117e B(j$.time.m mVar) {
        return C0119g.W(this, mVar);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b
    public final o F() {
        return t.AH;
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b
    public final boolean J() {
        return this.a.R(this.b);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b
    /* JADX INFO: renamed from: N */
    public final InterfaceC0114b p(long j, TemporalUnit temporalUnit) {
        return (s) super.p(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b
    public final int P() {
        return this.a.d0(this.b);
    }

    @Override // j$.time.chrono.AbstractC0116d
    final InterfaceC0114b Y(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.b) + ((long) ((int) j));
        int i = (int) j2;
        if (j2 == i) {
            return e0(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.chrono.InterfaceC0114b
    public final n a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC0116d
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final s W(long j) {
        return new s(this.a, y() + j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC0116d
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final s X(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.b) * 12) + ((long) (this.c - 1)) + j;
        return e0(this.a.W(j$.com.android.tools.r8.a.k(j2, 12L)), ((int) j$.com.android.tools.r8.a.j(j2, 12L)) + 1, this.d);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b, j$.time.temporal.Temporal
    public final InterfaceC0114b e(long j, TemporalUnit temporalUnit) {
        return (s) super.e(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.temporal.Temporal
    public final Temporal e(long j, TemporalUnit temporalUnit) {
        return (s) super.e(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.b == sVar.b && this.c == sVar.c && this.d == sVar.d && this.a.equals(sVar.a);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final s d(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (s) super.d(j, pVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        q qVar = this.a;
        qVar.K(aVar).b(j, aVar);
        int i = (int) j;
        int i2 = r.a[aVar.ordinal()];
        int i3 = this.d;
        int i4 = this.c;
        int i5 = this.b;
        switch (i2) {
            case 1:
                return e0(i5, i4, i);
            case 2:
                return W(Math.min(i, P()) - Z());
            case 3:
                return W((j - x(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return W(j - ((long) (((int) j$.com.android.tools.r8.a.j(y() + 3, 7)) + 1)));
            case 5:
                return W(j - x(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return W(j - x(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new s(qVar, j);
            case 8:
                return W((j - x(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return e0(i5, i, i3);
            case 10:
                return X(j - (((((long) i5) * 12) + ((long) i4)) - 1));
            case 11:
                if (i5 < 1) {
                    i = 1 - i;
                }
                return e0(i, i4, i3);
            case 12:
                return e0(i, i4, i3);
            case 13:
                return e0(1 - i5, i4, i3);
            default:
                throw new j$.time.temporal.q(AbstractC0112c.a("Unsupported field: ", pVar));
        }
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b
    public final int hashCode() {
        int iHashCode = this.a.o().hashCode();
        int i = this.b;
        return (iHashCode ^ (i & (-2048))) ^ (((i << 11) + (this.c << 6)) + this.d);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b
    public final InterfaceC0114b j(j$.time.v vVar) {
        return (s) super.j(vVar);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b
    /* JADX INFO: renamed from: m */
    public final InterfaceC0114b t(j$.time.temporal.m mVar) {
        return (s) super.t(mVar);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.temporal.Temporal
    public final Temporal p(long j, ChronoUnit chronoUnit) {
        return (s) super.p(j, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.temporal.Temporal
    public final Temporal t(j$.time.i iVar) {
        return (s) super.t(iVar);
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r u(j$.time.temporal.p pVar) {
        int iC0;
        long j;
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.C(this);
        }
        if (!AbstractC0121i.h(this, pVar)) {
            throw new j$.time.temporal.q(AbstractC0112c.a("Unsupported field: ", pVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i = r.a[aVar.ordinal()];
        q qVar = this.a;
        if (i != 1) {
            if (i == 2) {
                iC0 = P();
            } else {
                if (i != 3) {
                    return qVar.K(aVar);
                }
                j = 5;
            }
            return j$.time.temporal.r.j(1L, j);
        }
        iC0 = qVar.c0(this.b, this.c);
        j = iC0;
        return j$.time.temporal.r.j(1L, j);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.a);
        objectOutput.writeInt(j$.time.temporal.l.a(this, j$.time.temporal.a.YEAR));
        objectOutput.writeByte(j$.time.temporal.l.a(this, j$.time.temporal.a.MONTH_OF_YEAR));
        objectOutput.writeByte(j$.time.temporal.l.a(this, j$.time.temporal.a.DAY_OF_MONTH));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long x(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.t(this);
        }
        int i = r.a[((j$.time.temporal.a) pVar).ordinal()];
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.b;
        switch (i) {
            case 1:
                return i3;
            case 2:
                return Z();
            case 3:
                return ((i3 - 1) / 7) + 1;
            case 4:
                return ((int) j$.com.android.tools.r8.a.j(y() + 3, 7)) + 1;
            case 5:
                return ((i3 - 1) % 7) + 1;
            case 6:
                return ((Z() - 1) % 7) + 1;
            case 7:
                return y();
            case 8:
                return ((Z() - 1) / 7) + 1;
            case 9:
                return i2;
            case 10:
                return ((((long) i4) * 12) + ((long) i2)) - 1;
            case 11:
                return i4;
            case 12:
                return i4;
            case 13:
                return i4 <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.q(AbstractC0112c.a("Unsupported field: ", pVar));
        }
    }

    @Override // j$.time.chrono.AbstractC0116d, j$.time.chrono.InterfaceC0114b
    public final long y() {
        return this.a.a0(this.b, this.c, this.d);
    }
}
