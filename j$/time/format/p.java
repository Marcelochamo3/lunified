package j$.time.format;

import j$.time.C0111b;
import j$.time.chrono.AbstractC0121i;
import j$.time.chrono.InterfaceC0114b;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import o.C1707hi0;

/* JADX INFO: loaded from: classes2.dex */
final class p extends j {
    static final j$.time.i i = j$.time.i.i0(2000, 1, 1);
    private final int g;
    private final InterfaceC0114b h;

    private p(j$.time.temporal.p pVar, int i2, int i3, int i4, InterfaceC0114b interfaceC0114b, int i5) {
        super(pVar, i2, i3, F.NOT_NEGATIVE, i5);
        this.g = i4;
        this.h = interfaceC0114b;
    }

    p(j$.time.temporal.p pVar, j$.time.i iVar) {
        this(pVar, 2, 2, 0, iVar, 0);
        if (iVar == null) {
            long j = 0;
            if (!pVar.p().i(j)) {
                throw new IllegalArgumentException("The base value must be within the range of the field");
            }
            if (j + j.f[2] > C1707hi0.a) {
                throw new C0111b("Unable to add printer-parser as the range exceeds the capacity of an int");
            }
        }
    }

    /* synthetic */ p(j$.time.temporal.p pVar, j$.time.i iVar, int i2) {
        this(pVar, 2, 2, 0, iVar, i2);
    }

    @Override // j$.time.format.j
    final long b(y yVar, long j) {
        long jAbs = Math.abs(j);
        InterfaceC0114b interfaceC0114b = this.h;
        long jR = interfaceC0114b != null ? AbstractC0121i.p(yVar.d()).s(interfaceC0114b).r(this.a) : this.g;
        long[] jArr = j.f;
        if (j >= jR) {
            long j2 = jArr[this.b];
            if (j < jR + j2) {
                return jAbs % j2;
            }
        }
        return jAbs % jArr[this.c];
    }

    @Override // j$.time.format.j
    final boolean c(w wVar) {
        if (wVar.l()) {
            return super.c(wVar);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [j$.time.format.o] */
    @Override // j$.time.format.j
    final int d(final w wVar, final long j, final int i2, final int i3) {
        int iR;
        InterfaceC0114b interfaceC0114b = this.h;
        if (interfaceC0114b != null) {
            iR = wVar.h().s(interfaceC0114b).r(this.a);
            wVar.a(new Consumer() { // from class: j$.time.format.o
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void p(Object obj) {
                    this.a.d(wVar, j, i2, i3);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            iR = this.g;
        }
        int i4 = i3 - i2;
        int i5 = this.b;
        if (i4 == i5 && j >= 0) {
            long j2 = j.f[i5];
            long j3 = iR;
            long j4 = j3 - (j3 % j2);
            j = iR > 0 ? j4 + j : j4 - j;
            if (j < j3) {
                j += j2;
            }
        }
        return wVar.o(this.a, j, i2, i3);
    }

    @Override // j$.time.format.j
    final j e() {
        if (this.e == -1) {
            return this;
        }
        return new p(this.a, this.b, this.c, this.g, this.h, -1);
    }

    @Override // j$.time.format.j
    final j f(int i2) {
        int i3 = this.e + i2;
        return new p(this.a, this.b, this.c, this.g, this.h, i3);
    }

    @Override // j$.time.format.j
    public final String toString() {
        Integer numValueOf = Integer.valueOf(this.g);
        Object objRequireNonNull = this.h;
        if (objRequireNonNull == null) {
            objRequireNonNull = Objects.requireNonNull(numValueOf, "defaultObj");
        }
        return "ReducedValue(" + this.a + "," + this.b + "," + this.c + "," + objRequireNonNull + ")";
    }
}
