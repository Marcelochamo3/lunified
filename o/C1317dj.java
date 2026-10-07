package o;

import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: o.dj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1317dj implements InterfaceC1805ij, InterfaceC1512fj {
    public final List l;
    public final C0449Gj m;
    public final InterfaceC1708hj n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f741o = -1;
    public InterfaceC2450pI p;
    public List q;
    public int r;
    public volatile PQ s;
    public File t;

    public C1317dj(List list, C0449Gj c0449Gj, InterfaceC1708hj interfaceC1708hj) {
        this.l = list;
        this.m = c0449Gj;
        this.n = interfaceC1708hj;
    }

    @Override // o.InterfaceC1805ij
    public final boolean c() {
        while (true) {
            List list = this.q;
            boolean z = false;
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
            int i2 = this.f741o + 1;
            this.f741o = i2;
            if (i2 >= this.l.size()) {
                return false;
            }
            InterfaceC2450pI interfaceC2450pI = (InterfaceC2450pI) this.l.get(this.f741o);
            C0449Gj c0449Gj2 = this.m;
            File fileM = c0449Gj2.h.a().m(new C1414ej(interfaceC2450pI, c0449Gj2.n));
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
        this.n.b(this.p, exc, this.s.c, 3);
    }

    @Override // o.InterfaceC1512fj
    public final void f(Object obj) {
        this.n.d(this.p, obj, this.s.c, 3, this.p);
    }
}
