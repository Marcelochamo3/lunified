package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: o.ww, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3190ww implements InterfaceC0429Fp {
    public final Context l;
    public final C0560Kq m;
    public final C0622Nb n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f1104o;
    public Handler p;
    public Executor q;
    public ThreadPoolExecutor r;
    public Pu0 s;

    public C3190ww(Context context, C0560Kq c0560Kq) {
        C0622Nb c0622Nb = C3287xw.d;
        this.f1104o = new Object();
        Jp0.h(context, "Context cannot be null");
        this.l = context.getApplicationContext();
        this.m = c0560Kq;
        this.n = c0622Nb;
    }

    @Override // o.InterfaceC0429Fp
    public final void a(Pu0 pu0) {
        synchronized (this.f1104o) {
            this.s = pu0;
        }
        c();
    }

    public final void b() {
        synchronized (this.f1104o) {
            try {
                this.s = null;
                Handler handler = this.p;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.p = null;
                ThreadPoolExecutor threadPoolExecutor = this.r;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.q = null;
                this.r = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f1104o) {
            try {
                if (this.s == null) {
                    return;
                }
                if (this.q == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1896jg("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.r = threadPoolExecutor;
                    this.q = threadPoolExecutor;
                }
                this.q.execute(new Jj0(17, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C0488Hw d() {
        try {
            C0622Nb c0622Nb = this.n;
            Context context = this.l;
            C0560Kq c0560Kq = this.m;
            c0622Nb.getClass();
            C2295nk0 c2295nk0R = AbstractC1370eA.r(context, c0560Kq);
            int i = c2295nk0R.m;
            if (i != 0) {
                throw new RuntimeException(AbstractC1674hK.p("fetchFonts failed (", i, ")"));
            }
            C0488Hw[] c0488HwArr = (C0488Hw[]) c2295nk0R.n;
            if (c0488HwArr == null || c0488HwArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c0488HwArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
