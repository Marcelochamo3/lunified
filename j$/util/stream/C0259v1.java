package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0259v1 extends AbstractC0267x1 implements InterfaceC0231p2 {
    private final long[] h;

    C0259v1(Spliterator spliterator, AbstractC0158b abstractC0158b, long[] jArr) {
        super(spliterator, abstractC0158b, jArr.length);
        this.h = jArr;
    }

    C0259v1(C0259v1 c0259v1, Spliterator spliterator, long j, long j2) {
        super(c0259v1, spliterator, j, j2, c0259v1.h.length);
        this.h = c0259v1.h;
    }

    @Override // j$.util.stream.AbstractC0267x1, j$.util.stream.InterfaceC0236q2, j$.util.stream.InterfaceC0231p2, java.util.function.LongConsumer
    public final void accept(long j) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        long[] jArr = this.h;
        this.f = i + 1;
        jArr[i] = j;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.AbstractC0267x1
    final AbstractC0267x1 b(Spliterator spliterator, long j, long j2) {
        return new C0259v1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.InterfaceC0231p2
    public final /* synthetic */ void j(Long l) {
        AbstractC0274z0.i(this, l);
    }
}
