package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0256u3 extends x3 implements j$.util.E {
    @Override // j$.util.stream.z3
    protected final Spliterator a(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new C0256u3((j$.util.E) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.stream.x3
    protected final Object b() {
        return new E0(1);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.B.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.B.f(this, consumer);
    }
}
