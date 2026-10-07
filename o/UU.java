package o;

import android.os.Process;
import com.skidush.clonex.utils.RuntimeSecurityGuard;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class UU implements Runnable {
    public final /* synthetic */ int l;

    public /* synthetic */ UU(int i) {
        this.l = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U80 u80A;
        U80 u80A2;
        switch (this.l) {
            case 0:
                VU.z();
                return;
            case 1:
                VU.v();
                return;
            case 2:
                VU.w();
                return;
            case 3:
                XU.w();
                return;
            case 4:
                XU.t();
                return;
            case 5:
                XU.u();
                return;
            case 6:
                RU.g();
                return;
            case 7:
                RU.d(true);
                return;
            case 8:
                RuntimeSecurityGuard runtimeSecurityGuard = RuntimeSecurityGuard.a;
                if (RuntimeSecurityGuard.e.get() || (u80A = RuntimeSecurityGuard.a()) == null) {
                    return;
                }
                RuntimeSecurityGuard.e(u80A);
                return;
            case 9:
                RuntimeSecurityGuard runtimeSecurityGuard2 = RuntimeSecurityGuard.a;
                try {
                    Process.killProcess(Process.myPid());
                    System.exit(10);
                    throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
                } catch (Throwable unused) {
                    System.exit(10);
                    throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
                }
            case 10:
                AtomicBoolean atomicBoolean = RuntimeSecurityGuard.d;
                try {
                    RuntimeSecurityGuard runtimeSecurityGuard3 = RuntimeSecurityGuard.a;
                    if (!RuntimeSecurityGuard.e.get() && (u80A2 = RuntimeSecurityGuard.a()) != null) {
                        RuntimeSecurityGuard.e(u80A2);
                        break;
                    }
                    return;
                } finally {
                    atomicBoolean.set(false);
                }
            case 11:
                AtomicBoolean atomicBoolean2 = Uj0.c;
                try {
                    ReentrantLock reentrantLock = Uj0.a;
                    reentrantLock.lock();
                    try {
                        Uj0.d();
                        reentrantLock.unlock();
                        atomicBoolean2.set(false);
                        return;
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                } catch (Throwable th2) {
                    atomicBoolean2.set(false);
                    throw th2;
                }
            default:
                C3084vr0 c3084vr0 = C3084vr0.a;
                return;
        }
    }
}
