package o;

import com.skidush.clonex.utils.RuntimeSecurityGuard;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Kj0 implements ThreadFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ Kj0(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return Lj0.a.c(runnable);
            case 1:
                Thread thread = new Thread(runnable, "lumix-doh");
                thread.setDaemon(true);
                return thread;
            default:
                RuntimeSecurityGuard runtimeSecurityGuard = RuntimeSecurityGuard.a;
                Thread thread2 = new Thread(runnable, "runtime-security");
                thread2.setDaemon(true);
                return thread2;
        }
    }
}
