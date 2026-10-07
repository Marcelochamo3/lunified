package j$.util;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0143i implements IntConsumer {
    private long count;
    private long sum;
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.count++;
        this.sum += (long) i;
        this.min = Math.min(this.min, i);
        this.max = Math.max(this.max, i);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    public final void b(C0143i c0143i) {
        this.count += c0143i.count;
        this.sum += c0143i.sum;
        this.min = Math.min(this.min, c0143i.min);
        this.max = Math.max(this.max, c0143i.max);
    }

    public final String toString() {
        String simpleName = C0143i.class.getSimpleName();
        Long lValueOf = Long.valueOf(this.count);
        Long lValueOf2 = Long.valueOf(this.sum);
        Integer numValueOf = Integer.valueOf(this.min);
        long j = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, lValueOf, lValueOf2, numValueOf, Double.valueOf(j > 0 ? this.sum / j : 0.0d), Integer.valueOf(this.max));
    }
}
