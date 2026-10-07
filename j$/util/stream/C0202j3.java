package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0202j3 extends AbstractC0207k3 implements LongConsumer {
    final long[] c;

    C0202j3(int i) {
        this.c = new long[i];
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        int i = this.b;
        this.b = i + 1;
        this.c[i] = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.AbstractC0207k3
    public final void b(Object obj, long j) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i = 0; i < j; i++) {
            longConsumer.accept(this.c[i]);
        }
    }
}
