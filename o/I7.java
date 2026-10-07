package o;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class I7 {
    public static final I7 a = new I7();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final AtomicBoolean d = new AtomicBoolean(false);
    public static final AtomicLong e = new AtomicLong(0);

    public static void a() {
        try {
            Process.killProcess(Process.myPid());
            System.exit(0);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        } catch (Throwable unused) {
            System.exit(0);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
    }

    public final void b(Context context) {
        Object objK;
        Object objK2;
        Object objK3;
        Object objK4;
        Object objK5;
        Object objK6;
        Object objK7 = C2985uq0.a;
        AbstractC1474fG.j(context, "context");
        if (b.get() && !d.get() && c.compareAndSet(false, true)) {
            try {
                Thread thread = new Thread(new Jj0(3, this), "background-hard-exit");
                thread.setDaemon(false);
                thread.start();
                objK = thread;
            } catch (Throwable th) {
                objK = Jp0.k(th);
            }
            C2536q80.a(objK);
            try {
                C3084vr0 c3084vr0 = C3084vr0.a;
                C3084vr0.J(false);
                objK2 = objK7;
            } catch (Throwable th2) {
                objK2 = Jp0.k(th2);
            }
            C2536q80.a(objK2);
            try {
                C3084vr0 c3084vr1 = C3084vr0.a;
                C3084vr0.s = false;
                C3084vr0.r = null;
                objK3 = objK7;
            } catch (Throwable th3) {
                objK3 = Jp0.k(th3);
            }
            C2536q80.a(objK3);
            try {
                C3084vr0 c3084vr2 = C3084vr0.a;
                C3084vr0.t = null;
                C3084vr0.v.incrementAndGet();
                C3084vr0.w = 0L;
                C3084vr0.x = null;
                objK4 = objK7;
            } catch (Throwable th4) {
                objK4 = Jp0.k(th4);
            }
            C2536q80.a(objK4);
            try {
                C2691rp.s.o();
                objK5 = objK7;
            } catch (Throwable th5) {
                objK5 = Jp0.k(th5);
            }
            C2536q80.a(objK5);
            try {
                Ec0 ec0 = Ec0.a;
                Ec0.b();
                objK6 = objK7;
            } catch (Throwable th6) {
                objK6 = Jp0.k(th6);
            }
            C2536q80.a(objK6);
            try {
                Object systemService = context.getSystemService("activity");
                AbstractC1474fG.h(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                List<ActivityManager.AppTask> appTasks = ((ActivityManager) systemService).getAppTasks();
                AbstractC1474fG.i(appTasks, "getAppTasks(...)");
                Iterator<T> it = appTasks.iterator();
                while (it.hasNext()) {
                    ((ActivityManager.AppTask) it.next()).finishAndRemoveTask();
                }
            } catch (Throwable th7) {
                objK7 = Jp0.k(th7);
            }
            C2536q80.a(objK7);
            a();
            throw null;
        }
    }
}
