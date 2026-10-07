package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ND extends AbstractC3066vi0 {
    public final /* synthetic */ OD e;
    public final /* synthetic */ boolean f = false;
    public final /* synthetic */ Nc0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ND(String str, OD od, Nc0 nc0) {
        super(str, true);
        this.e = od;
        this.g = nc0;
    }

    @Override // o.AbstractC3066vi0
    public final long a() {
        long jA;
        int i;
        C0984aE[] c0984aEArr;
        OD od = this.e;
        boolean z = this.f;
        Nc0 nc0 = this.g;
        od.getClass();
        AbstractC1474fG.j(nc0, "settings");
        IF r3 = new IF();
        TD td = od.m;
        synchronized (td.J) {
            try {
                synchronized (td) {
                    try {
                        Nc0 nc1 = td.D;
                        if (!z) {
                            Nc0 nc2 = new Nc0();
                            nc2.b(nc1);
                            nc2.b(nc0);
                            nc0 = nc2;
                        }
                        r3.m = nc0;
                        jA = ((long) nc0.a()) - ((long) nc1.a());
                        c0984aEArr = (jA == 0 || td.n.isEmpty()) ? null : (C0984aE[]) td.n.values().toArray(new C0984aE[0]);
                        Nc0 nc3 = (Nc0) r3.m;
                        AbstractC1474fG.j(nc3, "<set-?>");
                        td.D = nc3;
                        td.v.c(new LD(td.f530o + " onSettings", td, r3, 0), 0L);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    td.J.a((Nc0) r3.m);
                } catch (IOException e) {
                    td.a(2, 2, e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c0984aEArr == null) {
            return -1L;
        }
        for (C0984aE c0984aE : c0984aEArr) {
            synchronized (c0984aE) {
                c0984aE.f += jA;
                if (jA > 0) {
                    c0984aE.notifyAll();
                }
            }
        }
        return -1L;
    }
}
