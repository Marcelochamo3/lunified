package j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0279v implements LongConsumer {
    public final /* synthetic */ Consumer a;

    public /* synthetic */ C0279v(Consumer consumer) {
        this.a = consumer;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.a.accept(Long.valueOf(j));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }
}
