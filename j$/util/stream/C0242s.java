package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0242s implements DoubleConsumer {
    public final /* synthetic */ InterfaceC0236q2 a;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.a.accept(d);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }
}
