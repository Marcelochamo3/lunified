package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: o.yk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC3360yk extends Handler {
    public boolean a;
    public final /* synthetic */ C0294Ak b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3360yk(C0294Ak c0294Ak, Looper looper) {
        super(looper);
        this.b = c0294Ak;
    }

    public final boolean a(Message message, WO wo) {
        long jMin;
        C3457zk c3457zk = (C3457zk) message.obj;
        if (!c3457zk.b) {
            return false;
        }
        int i = c3457zk.d + 1;
        c3457zk.d = i;
        if (i > this.b.j.v(3)) {
            return false;
        }
        SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        Throwable c0811Ui = wo.getCause() instanceof IOException ? (IOException) wo.getCause() : new C0811Ui(wo.getCause());
        C0622Nb c0622Nb = this.b.j;
        int i2 = c3457zk.d;
        c0622Nb.getClass();
        if (!(c0811Ui instanceof C2949uX) && !(c0811Ui instanceof FileNotFoundException) && !(c0811Ui instanceof C1179cE) && !(c0811Ui instanceof C1675hL)) {
            int i3 = C2679rj.m;
            while (true) {
                if (c0811Ui == null) {
                    jMin = Math.min((i2 - 1) * 1000, 5000);
                    break;
                }
                if ((c0811Ui instanceof C2679rj) && ((C2679rj) c0811Ui).l == 2008) {
                    jMin = -9223372036854775807L;
                    break;
                }
                c0811Ui = c0811Ui.getCause();
            }
        } else {
            jMin = -9223372036854775807L;
            break;
        }
        if (jMin == -9223372036854775807L) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), jMin);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object objC;
        C3457zk c3457zk = (C3457zk) message.obj;
        try {
            int i = message.what;
            if (i == 0) {
                C0294Ak c0294Ak = this.b;
                objC = c0294Ak.l.c(c0294Ak.m, (C0535Jr) c3457zk.c);
            } else {
                if (i != 1) {
                    throw new RuntimeException();
                }
                C0294Ak c0294Ak2 = this.b;
                objC = c0294Ak2.l.b(c0294Ak2.m, (C0509Ir) c3457zk.c);
            }
        } catch (WO e) {
            boolean zA = a(message, e);
            objC = e;
            if (zA) {
                return;
            }
        } catch (Exception e2) {
            AP.A("Key/provisioning request produced an unexpected exception. Not retrying.", e2);
            objC = e2;
        }
        C0622Nb c0622Nb = this.b.j;
        long j = c3457zk.a;
        c0622Nb.getClass();
        synchronized (this) {
            try {
                if (!this.a) {
                    this.b.f177o.obtainMessage(message.what, Pair.create(c3457zk.c, objC)).sendToTarget();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
