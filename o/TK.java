package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class TK {
    public final Sh0 a;
    public final Uh0 b;
    public final RK c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public TK(Looper looper, Sh0 sh0, RK rk) {
        this(new CopyOnWriteArraySet(), looper, sh0, rk, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new SK(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        f();
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        Uh0 uh0 = this.b;
        if (!uh0.a.hasMessages(0)) {
            uh0.getClass();
            Th0 th0B = Uh0.b();
            th0B.a = uh0.a.obtainMessage(0);
            uh0.getClass();
            Message message = th0B.a;
            message.getClass();
            uh0.a.sendMessageAtFrontOfQueue(message);
            th0B.a();
        }
        ArrayDeque arrayDeque2 = this.e;
        boolean z = !arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (z) {
            return;
        }
        while (!arrayDeque2.isEmpty()) {
            ((Runnable) arrayDeque2.peekFirst()).run();
            arrayDeque2.removeFirst();
        }
    }

    public final void c(int i, QK qk) {
        f();
        this.f.add(new RunnableC2976um(new CopyOnWriteArraySet(this.d), i, qk, 2));
    }

    public final void d() {
        f();
        synchronized (this.g) {
            this.h = true;
        }
        for (SK sk : this.d) {
            RK rk = this.c;
            sk.d = true;
            if (sk.c) {
                sk.c = false;
                rk.d(sk.a, sk.b.b());
            }
        }
        this.d.clear();
    }

    public final void e(int i, QK qk) {
        c(i, qk);
        b();
    }

    public final void f() {
        if (this.i) {
            AbstractC0397Ej.f(Thread.currentThread() == this.b.a.getLooper().getThread());
        }
    }

    public TK(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Sh0 sh0, RK rk, boolean z) {
        this.a = sh0;
        this.d = copyOnWriteArraySet;
        this.c = rk;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = sh0.a(looper, new Handler.Callback() { // from class: o.PK
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                TK tk = this.l;
                for (SK sk : tk.d) {
                    if (!sk.d && sk.c) {
                        C3188wv c3188wvB = sk.b.b();
                        sk.b = new C2149m9(2);
                        sk.c = false;
                        tk.c.d(sk.a, c3188wvB);
                    }
                    if (tk.b.a.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.i = z;
    }
}
