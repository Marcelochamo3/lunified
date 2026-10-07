package o;

import j$.util.function.BiConsumer$CC;
import java.io.EOFException;
import java.util.concurrent.ScheduledFuture;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SU implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ SU(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((VU.b) obj2).d((EOFException) this.b);
                break;
            default:
                Lj0.f((ScheduledFuture) this.b, obj, (Throwable) obj2);
                break;
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        int i = this.a;
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
