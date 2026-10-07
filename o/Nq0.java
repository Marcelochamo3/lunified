package o;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Nq0 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Oq0 b;

    public /* synthetic */ Nq0(Oq0 oq0, int i) {
        this.a = i;
        this.b = oq0;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.S((H50) obj);
                break;
            default:
                this.b.Z((H50) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.a;
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
