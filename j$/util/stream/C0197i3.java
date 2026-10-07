package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0197i3 extends AbstractC0207k3 implements IntConsumer {
    final int[] c;

    C0197i3(int i) {
        this.c = new int[i];
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int i2 = this.b;
        this.b = i2 + 1;
        this.c[i2] = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.AbstractC0207k3
    public final void b(Object obj, long j) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i = 0; i < j; i++) {
            intConsumer.accept(this.c[i]);
        }
    }
}
