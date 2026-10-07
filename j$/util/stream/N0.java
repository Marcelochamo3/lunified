package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
abstract class N0 implements L0 {
    protected final L0 a;
    protected final L0 b;
    private final long c;

    N0(L0 l0, L0 l1) {
        this.a = l0;
        this.b = l1;
        this.c = l0.count() + l1.count();
    }

    @Override // j$.util.stream.L0
    public /* bridge */ /* synthetic */ K0 b(int i) {
        return (K0) b(i);
    }

    @Override // j$.util.stream.L0
    public final L0 b(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.L0
    public final long count() {
        return this.c;
    }

    @Override // j$.util.stream.L0
    public final int q() {
        return 2;
    }
}
