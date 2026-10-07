package o;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: o.q8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2535q8 implements Handler.Callback {
    public final /* synthetic */ int l;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.l) {
            case 0:
                int i = message.what;
                if (i == 0) {
                    AbstractC1674hK.w(message.obj);
                    throw null;
                }
                if (i != 1) {
                    return false;
                }
                AbstractC1674hK.w(message.obj);
                throw null;
            default:
                if (message.what != 1) {
                    return false;
                }
                ((M70) message.obj).e();
                return true;
        }
    }
}
