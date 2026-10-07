package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC0158b implements BaseStream {
    private final AbstractC0158b a;
    private final AbstractC0158b b;
    protected final int c;
    private AbstractC0158b d;
    private int e;
    private int f;
    private Spliterator g;
    private boolean h;
    private boolean i;
    private Runnable j;
    private boolean k;

    AbstractC0158b(Spliterator spliterator, int i, boolean z) {
        this.b = null;
        this.g = spliterator;
        this.a = this;
        int i2 = EnumC0177e3.g & i;
        this.c = i2;
        this.f = (~(i2 << 1)) & EnumC0177e3.l;
        this.e = 0;
        this.k = z;
    }

    AbstractC0158b(AbstractC0158b abstractC0158b, int i) {
        if (abstractC0158b.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC0158b.h = true;
        abstractC0158b.d = this;
        this.b = abstractC0158b;
        this.c = EnumC0177e3.h & i;
        this.f = EnumC0177e3.p(i, abstractC0158b.f);
        AbstractC0158b abstractC0158b2 = abstractC0158b.a;
        this.a = abstractC0158b2;
        if (M()) {
            abstractC0158b2.i = true;
        }
        this.e = abstractC0158b.e + 1;
    }

    private Spliterator O(int i) {
        int i2;
        int i3;
        AbstractC0158b abstractC0158b = this.a;
        Spliterator spliteratorL = abstractC0158b.g;
        if (spliteratorL == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC0158b.g = null;
        if (abstractC0158b.k && abstractC0158b.i) {
            AbstractC0158b abstractC0158b2 = abstractC0158b.d;
            int i4 = 1;
            while (abstractC0158b != this) {
                int i5 = abstractC0158b2.c;
                if (abstractC0158b2.M()) {
                    if (EnumC0177e3.SHORT_CIRCUIT.u(i5)) {
                        i5 &= ~EnumC0177e3.u;
                    }
                    spliteratorL = abstractC0158b2.L(abstractC0158b, spliteratorL);
                    if (spliteratorL.hasCharacteristics(64)) {
                        i2 = (~EnumC0177e3.t) & i5;
                        i3 = EnumC0177e3.s;
                    } else {
                        i2 = (~EnumC0177e3.s) & i5;
                        i3 = EnumC0177e3.t;
                    }
                    i5 = i2 | i3;
                    i4 = 0;
                }
                abstractC0158b2.e = i4;
                abstractC0158b2.f = EnumC0177e3.p(i5, abstractC0158b.f);
                i4++;
                AbstractC0158b abstractC0158b3 = abstractC0158b2;
                abstractC0158b2 = abstractC0158b2.d;
                abstractC0158b = abstractC0158b3;
            }
        }
        if (i != 0) {
            this.f = EnumC0177e3.p(i, this.f);
        }
        return spliteratorL;
    }

    final L0 A(IntFunction intFunction) {
        AbstractC0158b abstractC0158b;
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        if (!this.a.k || (abstractC0158b = this.b) == null || !M()) {
            return y(O(0), true, intFunction);
        }
        this.e = 0;
        return K(abstractC0158b, abstractC0158b.O(0), intFunction);
    }

    abstract L0 B(AbstractC0158b abstractC0158b, Spliterator spliterator, boolean z, IntFunction intFunction);

    final long C(Spliterator spliterator) {
        if (EnumC0177e3.SIZED.u(this.f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    abstract boolean D(Spliterator spliterator, InterfaceC0236q2 interfaceC0236q2);

    abstract EnumC0182f3 E();

    final EnumC0182f3 F() {
        AbstractC0158b abstractC0158b = this;
        while (abstractC0158b.e > 0) {
            abstractC0158b = abstractC0158b.b;
        }
        return abstractC0158b.E();
    }

    final int G() {
        return this.f;
    }

    final boolean H() {
        return EnumC0177e3.ORDERED.u(this.f);
    }

    final /* synthetic */ Spliterator I() {
        return O(0);
    }

    abstract D0 J(long j, IntFunction intFunction);

    L0 K(AbstractC0158b abstractC0158b, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    Spliterator L(AbstractC0158b abstractC0158b, Spliterator spliterator) {
        return K(abstractC0158b, spliterator, new C0203k(19)).spliterator();
    }

    abstract boolean M();

    abstract InterfaceC0236q2 N(int i, InterfaceC0236q2 interfaceC0236q2);

    final Spliterator P() {
        AbstractC0158b abstractC0158b = this.a;
        if (this != abstractC0158b) {
            throw new IllegalStateException();
        }
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        Spliterator spliterator = abstractC0158b.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC0158b.g = null;
        return spliterator;
    }

    abstract Spliterator Q(AbstractC0158b abstractC0158b, Supplier supplier, boolean z);

    final InterfaceC0236q2 R(Spliterator spliterator, InterfaceC0236q2 interfaceC0236q2) {
        w(spliterator, S((InterfaceC0236q2) Objects.requireNonNull(interfaceC0236q2)));
        return interfaceC0236q2;
    }

    final InterfaceC0236q2 S(InterfaceC0236q2 interfaceC0236q2) {
        Objects.requireNonNull(interfaceC0236q2);
        AbstractC0158b abstractC0158b = this;
        while (abstractC0158b.e > 0) {
            AbstractC0158b abstractC0158b2 = abstractC0158b.b;
            interfaceC0236q2 = abstractC0158b.N(abstractC0158b2.f, interfaceC0236q2);
            abstractC0158b = abstractC0158b2;
        }
        return interfaceC0236q2;
    }

    final Spliterator T(Spliterator spliterator) {
        return this.e == 0 ? spliterator : Q(this, new C0153a(spliterator, 6), this.a.k);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.h = true;
        this.g = null;
        AbstractC0158b abstractC0158b = this.a;
        Runnable runnable = abstractC0158b.j;
        if (runnable != null) {
            abstractC0158b.j = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.BaseStream
    public final boolean isParallel() {
        return this.a.k;
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream onClose(Runnable runnable) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        AbstractC0158b abstractC0158b = this.a;
        Runnable runnable2 = abstractC0158b.j;
        if (runnable2 != null) {
            runnable = new J3(runnable2, runnable);
        }
        abstractC0158b.j = runnable;
        return this;
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.G
    public final BaseStream parallel() {
        this.a.k = true;
        return this;
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.G
    public final BaseStream sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.BaseStream
    public Spliterator spliterator() {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        AbstractC0158b abstractC0158b = this.a;
        if (this != abstractC0158b) {
            return Q(this, new C0153a(this, 0), abstractC0158b.k);
        }
        Spliterator spliterator = abstractC0158b.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC0158b.g = null;
        return spliterator;
    }

    final void w(Spliterator spliterator, InterfaceC0236q2 interfaceC0236q2) {
        Objects.requireNonNull(interfaceC0236q2);
        if (EnumC0177e3.SHORT_CIRCUIT.u(this.f)) {
            x(spliterator, interfaceC0236q2);
            return;
        }
        interfaceC0236q2.l(spliterator.getExactSizeIfKnown());
        spliterator.forEachRemaining(interfaceC0236q2);
        interfaceC0236q2.k();
    }

    final boolean x(Spliterator spliterator, InterfaceC0236q2 interfaceC0236q2) {
        AbstractC0158b abstractC0158b = this;
        while (abstractC0158b.e > 0) {
            abstractC0158b = abstractC0158b.b;
        }
        interfaceC0236q2.l(spliterator.getExactSizeIfKnown());
        boolean zD = abstractC0158b.D(spliterator, interfaceC0236q2);
        interfaceC0236q2.k();
        return zD;
    }

    final L0 y(Spliterator spliterator, boolean z, IntFunction intFunction) {
        if (this.a.k) {
            return B(this, spliterator, z, intFunction);
        }
        D0 d0J = J(C(spliterator), intFunction);
        R(spliterator, d0J);
        return d0J.a();
    }

    final Object z(K3 k3) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        return this.a.k ? k3.c(this, O(k3.d())) : k3.b(this, O(k3.d()));
    }
}
