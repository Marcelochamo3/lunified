package o;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: o.Uz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0828Uz implements Handler.Callback {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ C0828Uz(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.l) {
            case 0:
                int i = message.what;
                C0854Vz c0854Vz = (C0854Vz) this.m;
                if (i == 1) {
                    c0854Vz.b((C0776Sz) message.obj);
                    return true;
                }
                if (i == 2) {
                    c0854Vz.d.l((C0776Sz) message.obj);
                }
                return false;
            default:
                if (message.what != 0) {
                    return false;
                }
                L0 l0 = (L0) this.m;
                AbstractC1674hK.w(message.obj);
                synchronized (l0.l) {
                    try {
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
