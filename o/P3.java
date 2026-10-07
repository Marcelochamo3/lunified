package o;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class P3 implements Executor {
    public final /* synthetic */ int l;
    public final Executor m;
    public final ArrayDeque n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Runnable f447o;
    public final Object p;

    public P3(Executor executor) {
        this.l = 1;
        AbstractC1474fG.j(executor, "executor");
        this.m = executor;
        this.n = new ArrayDeque();
        this.p = new Object();
    }

    private final void a(Runnable runnable) {
        synchronized (this.p) {
            try {
                this.n.add(new O3(this, 0, runnable));
                if (this.f447o == null) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        synchronized (this.p) {
            try {
                Runnable runnable = (Runnable) this.n.poll();
                this.f447o = runnable;
                if (runnable != null) {
                    this.m.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        switch (this.l) {
            case 0:
                c();
                return;
            default:
                synchronized (this.p) {
                    Object objPoll = this.n.poll();
                    Runnable runnable = (Runnable) objPoll;
                    this.f447o = runnable;
                    if (objPoll != null) {
                        this.m.execute(runnable);
                    }
                    break;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.l) {
            case 0:
                a(runnable);
                return;
            default:
                AbstractC1474fG.j(runnable, "command");
                synchronized (this.p) {
                    this.n.offer(new O3(runnable, this));
                    if (this.f447o == null) {
                        b();
                    }
                    break;
                }
                return;
        }
    }

    public P3(Q3 q3) {
        this.l = 0;
        this.p = new Object();
        this.n = new ArrayDeque();
        this.m = q3;
    }
}
