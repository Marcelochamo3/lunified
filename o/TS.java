package o;

import android.os.Looper;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class TS {
    public static final Object j = new Object();
    public final Object a;
    public final C3022v90 b = new C3022v90();
    public int c = 0;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;

    public TS() {
        Object obj = j;
        this.f = obj;
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        J5.F().V.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(AbstractC1701hf0.u("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(XK xk) {
        if (xk.m) {
            if (!xk.e()) {
                xk.b(false);
                return;
            }
            int i = xk.n;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            xk.n = i2;
            xk.l.b(this.e);
        }
    }

    public final void c(XK xk) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (xk != null) {
                b(xk);
                xk = null;
            } else {
                C3022v90 c3022v90 = this.b;
                c3022v90.getClass();
                C2828t90 c2828t90 = new C2828t90(c3022v90);
                c3022v90.n.put(c2828t90, Boolean.FALSE);
                while (c2828t90.hasNext()) {
                    b((XK) ((Map.Entry) c2828t90.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }
}
