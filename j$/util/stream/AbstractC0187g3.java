package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC0187g3 implements Spliterator {
    final boolean a;
    final AbstractC0158b b;
    private Supplier c;
    Spliterator d;
    InterfaceC0236q2 e;
    BooleanSupplier f;
    long g;
    AbstractC0168d h;
    boolean i;

    AbstractC0187g3(AbstractC0158b abstractC0158b, Spliterator spliterator, boolean z) {
        this.b = abstractC0158b;
        this.c = null;
        this.d = spliterator;
        this.a = z;
    }

    AbstractC0187g3(AbstractC0158b abstractC0158b, Supplier supplier, boolean z) {
        this.b = abstractC0158b;
        this.c = supplier;
        this.d = null;
        this.a = z;
    }

    private boolean b() {
        while (this.h.count() == 0) {
            if (this.e.n() || !this.f.getAsBoolean()) {
                if (this.i) {
                    return false;
                }
                this.e.k();
                this.i = true;
            }
        }
        return true;
    }

    final boolean a() {
        AbstractC0168d abstractC0168d = this.h;
        if (abstractC0168d == null) {
            if (this.i) {
                return false;
            }
            c();
            d();
            this.g = 0L;
            this.e.l(this.d.getExactSizeIfKnown());
            return b();
        }
        long j = this.g + 1;
        this.g = j;
        boolean z = j < abstractC0168d.count();
        if (z) {
            return z;
        }
        this.g = 0L;
        this.h.clear();
        return b();
    }

    final void c() {
        if (this.d == null) {
            this.d = (Spliterator) this.c.get();
            this.c = null;
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int iE = EnumC0177e3.E(this.b.G()) & EnumC0177e3.f;
        return (iE & 64) != 0 ? (iE & (-16449)) | (this.d.characteristics() & 16448) : iE;
    }

    abstract void d();

    abstract AbstractC0187g3 e(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        c();
        return this.d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (j$.util.B.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        c();
        if (EnumC0177e3.SIZED.u(this.b.G())) {
            return this.d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.B.e(this, i);
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.d);
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.a || this.h != null || this.i) {
            return null;
        }
        c();
        Spliterator spliteratorTrySplit = this.d.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return e(spliteratorTrySplit);
    }
}
