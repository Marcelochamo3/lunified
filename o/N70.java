package o;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class N70 implements InterfaceC1805ij, InterfaceC1512fj {
    public final InterfaceC1708hj l;
    public final C0449Gj m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f408o = -1;
    public InterfaceC2450pI p;
    public List q;
    public int r;
    public volatile PQ s;
    public File t;
    public O70 u;

    public N70(C0449Gj c0449Gj, InterfaceC1708hj interfaceC1708hj) {
        this.m = c0449Gj;
        this.l = interfaceC1708hj;
    }

    @Override // o.InterfaceC1805ij
    public final boolean c() {
        ArrayList arrayListA = this.m.a();
        boolean z = false;
        if (arrayListA.isEmpty()) {
            return false;
        }
        List listD = this.m.d();
        if (listD.isEmpty()) {
            if (File.class.equals(this.m.k)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.m.d.getClass() + " to " + this.m.k);
        }
        while (true) {
            List list = this.q;
            if (list != null && this.r < list.size()) {
                this.s = null;
                while (!z && this.r < this.q.size()) {
                    List list2 = this.q;
                    int i = this.r;
                    this.r = i + 1;
                    QQ qq = (QQ) list2.get(i);
                    File file = this.t;
                    C0449Gj c0449Gj = this.m;
                    this.s = qq.b(file, c0449Gj.e, c0449Gj.f, c0449Gj.i);
                    if (this.s != null && this.m.c(this.s.c.b()) != null) {
                        this.s.c.e(this.m.f285o, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f408o + 1;
            this.f408o = i2;
            if (i2 >= listD.size()) {
                int i3 = this.n + 1;
                this.n = i3;
                if (i3 >= arrayListA.size()) {
                    return false;
                }
                this.f408o = 0;
            }
            InterfaceC2450pI interfaceC2450pI = (InterfaceC2450pI) arrayListA.get(this.n);
            Class cls = (Class) listD.get(this.f408o);
            InterfaceC2686rm0 interfaceC2686rm0F = this.m.f(cls);
            C0449Gj c0449Gj2 = this.m;
            this.u = new O70(c0449Gj2.c.a, interfaceC2450pI, c0449Gj2.n, c0449Gj2.e, c0449Gj2.f, interfaceC2686rm0F, cls, c0449Gj2.i);
            File fileM = c0449Gj2.h.a().m(this.u);
            this.t = fileM;
            if (fileM != null) {
                this.p = interfaceC2450pI;
                this.q = this.m.c.b().g(fileM);
                this.r = 0;
            }
        }
    }

    @Override // o.InterfaceC1805ij
    public final void cancel() {
        PQ pq = this.s;
        if (pq != null) {
            pq.c.cancel();
        }
    }

    @Override // o.InterfaceC1512fj
    public final void d(Exception exc) {
        this.l.b(this.u, exc, this.s.c, 4);
    }

    @Override // o.InterfaceC1512fj
    public final void f(Object obj) {
        this.l.d(this.p, obj, this.s.c, 4, this.u);
    }
}
