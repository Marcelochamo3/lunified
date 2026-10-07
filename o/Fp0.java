package o;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class Fp0 extends AbstractC3177wp0 {
    public final /* synthetic */ int a;

    public /* synthetic */ Fp0(int i) {
        this.a = i;
    }

    @Override // o.AbstractC3177wp0
    public final Object a(WH wh) {
        switch (this.a) {
            case 0:
                return new AtomicBoolean(wh.Z());
            default:
                try {
                    return new AtomicInteger(wh.b0());
                } catch (NumberFormatException e) {
                    throw new XH(e);
                }
        }
    }

    @Override // o.AbstractC3177wp0
    public final void b(C1183cI c1183cI, Object obj) throws IOException {
        switch (this.a) {
            case 0:
                c1183cI.c0(((AtomicBoolean) obj).get());
                break;
            default:
                c1183cI.Y(((AtomicInteger) obj).get());
                break;
        }
    }
}
