package o;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: o.cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1203cb extends AbstractC1301db {
    public final /* synthetic */ int l;
    public final Object m;

    public /* synthetic */ C1203cb(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    @Override // o.AbstractC1301db
    public final void a(Throwable th) {
        switch (this.l) {
            case 0:
                if (th != null) {
                    ((Future) this.m).cancel(false);
                }
                break;
            case 1:
                ((InterfaceC2300nn) this.m).d();
                break;
            default:
                ((InterfaceC0412Ey) this.m).b(th);
                break;
        }
    }

    @Override // o.InterfaceC0412Ey
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        switch (this.l) {
            case 0:
                a((Throwable) obj);
                break;
            case 1:
                a((Throwable) obj);
                break;
            default:
                a((Throwable) obj);
                break;
        }
        return C2985uq0.a;
    }

    public final String toString() {
        switch (this.l) {
            case 0:
                return "CancelFutureOnCancel[" + ((Future) this.m) + ']';
            case 1:
                return "DisposeOnCancel[" + ((InterfaceC2300nn) this.m) + ']';
            default:
                return "InvokeOnCancel[" + ((InterfaceC0412Ey) this.m).getClass().getSimpleName() + '@' + AbstractC0397Ej.r(this) + ']';
        }
    }
}
