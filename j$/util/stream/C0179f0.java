package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0179f0 implements LongConsumer {
    public final /* synthetic */ InterfaceC0236q2 a;

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.a.accept(j);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }
}
