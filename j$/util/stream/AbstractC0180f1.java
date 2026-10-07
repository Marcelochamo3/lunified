package j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC0180f1 implements L0 {
    @Override // j$.util.stream.L0
    public L0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.L0
    public final long count() {
        return 0L;
    }

    public final void d(Object obj, int i) {
    }

    public final void f(Object obj) {
    }

    @Override // j$.util.stream.L0
    public /* synthetic */ L0 h(long j, long j2, IntFunction intFunction) {
        return AbstractC0274z0.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.L0
    public final Object[] o(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ int q() {
        return 0;
    }
}
