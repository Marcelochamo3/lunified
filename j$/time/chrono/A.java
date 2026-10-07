package j$.time.chrono;

import j$.time.C0111b;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalQuery;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class A implements o, Serializable {
    public static final A d;
    private static final A[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    private final transient int a;
    private final transient j$.time.i b;
    private final transient String c;

    static {
        A a = new A(-1, j$.time.i.i0(1868, 1, 1), "Meiji");
        d = a;
        e = new A[]{a, new A(0, j$.time.i.i0(1912, 7, 30), "Taisho"), new A(1, j$.time.i.i0(1926, 12, 25), "Showa"), new A(2, j$.time.i.i0(1989, 1, 8), "Heisei"), new A(3, j$.time.i.i0(2019, 5, 1), "Reiwa")};
    }

    private A(int i, j$.time.i iVar, String str) {
        this.a = i;
        this.b = iVar;
        this.c = str;
    }

    public static A[] A() {
        A[] aArr = e;
        return (A[]) Arrays.copyOf(aArr, aArr.length);
    }

    static A h(j$.time.i iVar) {
        if (iVar.d0(z.d)) {
            throw new C0111b("JapaneseDate before Meiji 6 are not supported");
        }
        A[] aArr = e;
        for (int length = aArr.length - 1; length >= 0; length--) {
            A a = aArr[length];
            if (iVar.compareTo(a.b) >= 0) {
                return a;
            }
        }
        return null;
    }

    static A i() {
        A[] aArr = e;
        return aArr[aArr.length - 1];
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static A s(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            A[] aArr = e;
            if (i2 < aArr.length) {
                return aArr[i2];
            }
        }
        throw new C0111b("Invalid era: " + i);
    }

    static long w() {
        long jF = j$.time.temporal.a.DAY_OF_YEAR.p().f();
        for (A a : e) {
            jF = Math.min(jF, (a.b.P() - a.b.Z()) + 1);
            if (a.o() != null) {
                jF = Math.min(jF, a.o().b.Z() - 1);
            }
        }
        return jF;
    }

    private Object writeReplace() {
        return new G((byte) 5, this);
    }

    static long z() {
        int iC0 = 1000000000 - i().b.c0();
        A[] aArr = e;
        int iC1 = aArr[0].b.c0();
        for (int i = 1; i < aArr.length; i++) {
            A a = aArr[i];
            iC0 = Math.min(iC0, (a.b.c0() - iC1) + 1);
            iC1 = a.b.c0();
        }
        return iC0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object C(TemporalQuery temporalQuery) {
        return AbstractC0121i.m(this, temporalQuery);
    }

    final void D(DataOutput dataOutput) {
        dataOutput.writeByte(this.a);
    }

    @Override // j$.time.temporal.m
    public final Temporal E(Temporal temporal) {
        return temporal.d(getValue(), j$.time.temporal.a.ERA);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean g(j$.time.temporal.p pVar) {
        return AbstractC0121i.i(this, pVar);
    }

    @Override // j$.time.chrono.o
    public final int getValue() {
        return this.a;
    }

    final j$.time.i n() {
        return this.b;
    }

    final A o() {
        if (this == i()) {
            return null;
        }
        return s(this.a + 1);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int r(j$.time.temporal.p pVar) {
        return AbstractC0121i.f(this, (j$.time.temporal.a) pVar);
    }

    public final String toString() {
        return this.c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r u(j$.time.temporal.p pVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        return pVar == aVar ? x.d.K(aVar) : j$.time.temporal.l.d(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long x(j$.time.temporal.p pVar) {
        return AbstractC0121i.g(this, pVar);
    }
}
