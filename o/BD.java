package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class BD implements InterfaceC2091lf0 {
    public final C0851Vw l;
    public boolean m;
    public final /* synthetic */ HD n;

    public BD(HD hd) {
        this.n = hd;
        this.l = new C0851Vw(hd.a.c());
    }

    public final void a() {
        HD hd = this.n;
        int i = hd.c;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + hd.c);
        }
        C0851Vw c0851Vw = this.l;
        Hj0 hj0 = c0851Vw.e;
        c0851Vw.e = Hj0.d;
        hj0.a();
        hj0.b();
        hd.c = 6;
    }

    @Override // o.InterfaceC2091lf0
    public final Hj0 c() {
        return this.l;
    }

    @Override // o.InterfaceC2091lf0
    public long y(E9 e9, long j) {
        HD hd = this.n;
        AbstractC1474fG.j(e9, "sink");
        try {
            return hd.a.y(e9, j);
        } catch (IOException e) {
            ((C50) hd.e).l();
            a();
            throw e;
        }
    }
}
