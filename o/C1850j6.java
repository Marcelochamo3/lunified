package o;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: o.j6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1850j6 extends Thread {
    public final /* synthetic */ int l = 1;

    public /* synthetic */ C1850j6(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                break;
            default:
                Process.setThreadPriority(9);
                super.run();
                return;
        }
        while (true) {
            try {
                ReentrantLock reentrantLock = C2143m6.h;
                reentrantLock.lock();
                try {
                    C2143m6 c2143m6G = AbstractC2506pt.g();
                    if (c2143m6G == C2143m6.l) {
                        C2143m6.l = null;
                        reentrantLock.unlock();
                        return;
                    } else {
                        reentrantLock.unlock();
                        if (c2143m6G != null) {
                            c2143m6G.k();
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
            }
        }
    }

    public /* synthetic */ C1850j6(String str) {
        super(str);
    }
}
