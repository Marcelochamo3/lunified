package o;

import java.util.HashMap;

/* JADX INFO: renamed from: o.d7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1267d7 implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f732o;
    public final /* synthetic */ Object p;

    public /* synthetic */ RunnableC1267d7(Object obj, int i, long j, long j2, int i2) {
        this.l = i2;
        this.p = obj;
        this.m = i;
        this.n = j;
        this.f732o = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.p;
        switch (this.l) {
            case 0:
                C1364e7 c1364e7 = (C1364e7) obj;
                c1364e7.getClass();
                int i = Lr0.a;
                C0942Zj c0942Zj = c1364e7.c.l.r;
                C3201x2 c3201x2S = c0942Zj.S();
                c0942Zj.T(c3201x2S, 1011, new C0838Vj(c3201x2S, this.m, this.n, this.f732o));
                break;
            default:
                C0942Zj c0942Zj2 = ((M7) obj).b;
                C1750i4 c1750i4 = c0942Zj2.f663o;
                final C3201x2 c3201x2P = c0942Zj2.P(((AbstractC0985aF) c1750i4.n).isEmpty() ? null : (CP) UK.t((AbstractC0985aF) c1750i4.n));
                final int i2 = this.m;
                final long j = this.n;
                final long j2 = this.f732o;
                c0942Zj2.T(c3201x2P, 1006, new QK(i2, j, j2) { // from class: o.Yj
                    public final /* synthetic */ int m;
                    public final /* synthetic */ long n;

                    @Override // o.QK
                    public final void b(Object obj2) {
                        C2747sP c2747sP = (C2747sP) obj2;
                        c2747sP.getClass();
                        C3201x2 c3201x2 = this.l;
                        CP cp = c3201x2.d;
                        if (cp != null) {
                            String strD = c2747sP.b.d(c3201x2.b, cp);
                            HashMap map = c2747sP.h;
                            Long l = (Long) map.get(strD);
                            HashMap map2 = c2747sP.g;
                            Long l2 = (Long) map2.get(strD);
                            map.put(strD, Long.valueOf((l == null ? 0L : l.longValue()) + this.n));
                            map2.put(strD, Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) this.m)));
                        }
                    }
                });
                break;
        }
    }
}
