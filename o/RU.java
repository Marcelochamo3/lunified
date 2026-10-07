package o;

import java.io.IOException;
import java.net.SocketAddress;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Iterator;
import lombok.Generated;

/* JADX INFO: loaded from: classes.dex */
public abstract class RU {

    @Generated
    private static final CL a = DL.d(RU.class);
    private static VW b = null;
    private static final Runnable[] c = new Runnable[2];
    private static final Runnable[] d = new Runnable[2];
    private static final Runnable[] e = new Runnable[2];
    private static Thread f;
    private static Thread g;
    private static volatile Selector h;
    private static volatile boolean i;

    public interface a {
        void a(SelectionKey selectionKey);
    }

    private static void b(Runnable[] runnableArr, Runnable runnable, boolean z) {
        if (z) {
            runnableArr[0] = runnable;
        } else {
            runnableArr[1] = runnable;
        }
    }

    public static void c() {
        d(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(boolean z) {
        i = false;
        if (!z) {
            try {
                Runtime.getRuntime().removeShutdownHook(g);
            } catch (Exception unused) {
                a.t("Failed to remove shutdown hook, ignoring and continuing close");
            }
        }
        try {
            h(e);
        } catch (Exception e2) {
            a.F("Failed to execute shutdown task, ignoring and continuing close", e2);
        }
        h.wakeup();
        try {
            h.close();
        } catch (IOException e3) {
            a.F("Failed to properly close selector, ignoring and continuing close", e3);
        }
        try {
            try {
                f.join();
                synchronized (RU.class) {
                    h = null;
                    f = null;
                    g = null;
                }
            } catch (Throwable th) {
                synchronized (RU.class) {
                    h = null;
                    f = null;
                    g = null;
                    throw th;
                }
            }
        } catch (InterruptedException unused2) {
            Thread.currentThread().interrupt();
            synchronized (RU.class) {
                h = null;
                f = null;
                g = null;
            }
        }
    }

    private static void f() {
        Iterator<SelectionKey> it = h.selectedKeys().iterator();
        while (it.hasNext()) {
            SelectionKey next = it.next();
            it.remove();
            ((a) next.attachment()).a(next);
        }
    }

    public static void g() {
        int iIntValue = Integer.getInteger("dnsjava.nio.selector_timeout", 1000).intValue();
        if (iIntValue <= 0 || iIntValue > 1000) {
            throw new IllegalArgumentException("Invalid selector_timeout, must be between 1 and 1000");
        }
        while (i) {
            try {
                if (h.select(iIntValue) == 0) {
                    h(c);
                }
                if (i) {
                    h(d);
                    f();
                }
            } catch (IOException e2) {
                a.I("A selection operation failed", e2);
            } catch (ClosedSelectorException unused) {
            }
        }
        a.M("dnsjava NIO selector thread stopped");
    }

    private static synchronized void h(Runnable[] runnableArr) {
        try {
            Runnable runnable = runnableArr[0];
            if (runnable != null) {
                runnable.run();
            }
            Runnable runnable2 = runnableArr[1];
            if (runnable2 != null) {
                runnable2.run();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static Selector i() {
        if (h == null) {
            synchronized (RU.class) {
                try {
                    if (h == null) {
                        h = Selector.open();
                        a.M("Starting dnsjava NIO selector thread");
                        i = true;
                        Thread thread = new Thread(new UU(6));
                        f = thread;
                        thread.setDaemon(true);
                        f.setName("dnsjava NIO selector");
                        f.start();
                        Thread thread2 = new Thread(new UU(7));
                        g = thread2;
                        thread2.setName("dnsjava NIO shutdown hook");
                        Runtime.getRuntime().addShutdownHook(g);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    public static synchronized void j(Runnable runnable, boolean z) {
        b(e, runnable, z);
    }

    public static void k(VW vw) {
        b = vw;
    }

    public static synchronized void l(Runnable runnable, boolean z) {
        b(d, runnable, z);
    }

    public static synchronized void m(Runnable runnable, boolean z) {
        b(c, runnable, z);
    }

    public static void n(String str, SocketAddress socketAddress, SocketAddress socketAddress2, byte[] bArr) {
        CL cl = a;
        if (cl.O()) {
            cl.v(Ey0.a(str, bArr));
        }
        VW vw = b;
        if (vw != null) {
            vw.a(str, socketAddress, socketAddress2, bArr);
        }
    }
}
