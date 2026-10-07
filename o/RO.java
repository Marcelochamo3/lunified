package o;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class RO implements Handler.Callback {
    public final Handler l;
    public final /* synthetic */ SO m;

    public RO(SO so, InterfaceC3328yO interfaceC3328yO) {
        this.m = so;
        Handler handlerN = Lr0.n(this);
        this.l = handlerN;
        interfaceC3328yO.q(this, handlerN);
    }

    public final void a(long j) {
        SO so = this.m;
        if (this != so.w1 || so.U == null) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            so.J0 = true;
            return;
        }
        try {
            so.q0(j);
            so.z0(so.s1);
            so.L0.e++;
            so.y0();
            so.Y(j);
        } catch (Lr e) {
            so.K0 = e;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        int i3 = Lr0.a;
        a(((((long) i) & 4294967295L) << 32) | (4294967295L & ((long) i2)));
        return true;
    }
}
