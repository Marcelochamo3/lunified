package o;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class QV implements InterfaceC1610gj, InterfaceC0803Ua {
    public final InterfaceC0595Ma l;
    public final C2151mA m;
    public C1801ih n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AbstractC2051l80 f474o;
    public InterfaceC1512fj p;
    public volatile A50 q;

    public QV(InterfaceC0595Ma interfaceC0595Ma, C2151mA c2151mA) {
        this.l = interfaceC0595Ma;
        this.m = c2151mA;
    }

    @Override // o.InterfaceC0803Ua
    public final void E(A50 a50, IOException iOException) {
        Log.isLoggable("OkHttpFetcher", 3);
        this.p.d(iOException);
    }

    @Override // o.InterfaceC1610gj
    public final void a() {
        try {
            C1801ih c1801ih = this.n;
            if (c1801ih != null) {
                c1801ih.close();
            }
        } catch (IOException unused) {
        }
        AbstractC2051l80 abstractC2051l80 = this.f474o;
        if (abstractC2051l80 != null) {
            abstractC2051l80.close();
        }
        this.p = null;
    }

    @Override // o.InterfaceC1610gj
    public final Class b() {
        return InputStream.class;
    }

    @Override // o.InterfaceC1610gj
    public final int c() {
        return 2;
    }

    @Override // o.InterfaceC1610gj
    public final void cancel() {
        A50 a50 = this.q;
        if (a50 != null) {
            a50.cancel();
        }
    }

    @Override // o.InterfaceC1610gj
    public final void e(EnumC1651h30 enumC1651h30, InterfaceC1512fj interfaceC1512fj) {
        C0560Kq c0560Kq = new C0560Kq();
        c0560Kq.u(this.m.d());
        for (Map.Entry entry : this.m.b.a().entrySet()) {
            c0560Kq.a((String) entry.getKey(), (String) entry.getValue());
        }
        C1951k70 c1951k70C = c0560Kq.c();
        this.p = interfaceC1512fj;
        this.q = ((OV) this.l).c(c1951k70C);
        this.q.e(this);
    }

    @Override // o.InterfaceC0803Ua
    public final void p(A50 a50, C1855j80 c1855j80) {
        this.f474o = c1855j80.r;
        if (!c1855j80.p()) {
            this.p.d(new C1766iE(c1855j80.f840o, null, c1855j80.n));
        } else {
            AbstractC2051l80 abstractC2051l80 = this.f474o;
            AbstractC3045vW.k(abstractC2051l80, "Argument must not be null");
            C1801ih c1801ih = new C1801ih(this.f474o.a(), abstractC2051l80.i());
            this.n = c1801ih;
            this.p.f(c1801ih);
        }
    }
}
