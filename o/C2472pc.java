package o;

import java.util.ArrayDeque;
import java.util.List;

/* JADX INFO: renamed from: o.pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2472pc extends AbstractC0682Pj implements InterfaceC2967uh0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC2967uh0 f974o;
    public long p;
    public final /* synthetic */ int q;
    public Object r;

    public /* synthetic */ C2472pc() {
        this.q = 0;
    }

    @Override // o.AbstractC0682Pj
    public final void E() {
        switch (this.q) {
            case 0:
                C2278nc c2278nc = (C2278nc) this.r;
                c2278nc.getClass();
                AbstractC2569qc abstractC2569qc = (AbstractC2569qc) c2278nc.m;
                abstractC2569qc.getClass();
                this.m = 0;
                this.f974o = null;
                abstractC2569qc.b.add(this);
                return;
            case 1:
                ArrayDeque arrayDeque = (ArrayDeque) ((C2100lk) this.r).e;
                AbstractC0397Ej.f(arrayDeque.size() < 2);
                AbstractC0397Ej.c(!arrayDeque.contains(this));
                this.m = 0;
                this.f974o = null;
                arrayDeque.addFirst(this);
                return;
            default:
                Rd0 rd0 = (Rd0) this.r;
                synchronized (rd0.b) {
                    this.m = 0;
                    this.f974o = null;
                    int i = rd0.h;
                    rd0.h = i + 1;
                    rd0.f[i] = this;
                    if (!rd0.c.isEmpty() && rd0.h > 0) {
                        rd0.b.notify();
                    }
                    break;
                }
                return;
        }
    }

    public final void F(long j, InterfaceC2967uh0 interfaceC2967uh0, long j2) {
        this.n = j;
        this.f974o = interfaceC2967uh0;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.p = j;
    }

    @Override // o.InterfaceC2967uh0
    public final int G() {
        InterfaceC2967uh0 interfaceC2967uh0 = this.f974o;
        interfaceC2967uh0.getClass();
        return interfaceC2967uh0.G();
    }

    @Override // o.InterfaceC2967uh0
    public final int e(long j) {
        InterfaceC2967uh0 interfaceC2967uh0 = this.f974o;
        interfaceC2967uh0.getClass();
        return interfaceC2967uh0.e(j - this.p);
    }

    @Override // o.InterfaceC2967uh0
    public final long h(int i) {
        InterfaceC2967uh0 interfaceC2967uh0 = this.f974o;
        interfaceC2967uh0.getClass();
        return interfaceC2967uh0.h(i) + this.p;
    }

    @Override // o.InterfaceC2967uh0
    public final List t(long j) {
        InterfaceC2967uh0 interfaceC2967uh0 = this.f974o;
        interfaceC2967uh0.getClass();
        return interfaceC2967uh0.t(j - this.p);
    }

    public /* synthetic */ C2472pc(InterfaceC3064vh0 interfaceC3064vh0, int i) {
        this.q = i;
        this.r = interfaceC3064vh0;
    }
}
