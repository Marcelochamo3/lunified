package o;

import android.os.Handler;

/* JADX INFO: renamed from: o.wZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3145wZ implements InterfaceC1324dm0 {
    public final C90 a;
    public final C2994uv b = new C2994uv(1, false);
    public final DQ c = new DQ(1);
    public long d = -9223372036854775807L;
    public final /* synthetic */ C3242xZ e;

    public C3145wZ(C3242xZ c3242xZ, C1562g8 c1562g8) {
        this.e = c3242xZ;
        this.a = new C90(c1562g8, null, null);
    }

    @Override // o.InterfaceC1324dm0
    public final void a(C0643Nw c0643Nw) {
        this.a.a(c0643Nw);
    }

    @Override // o.InterfaceC1324dm0
    public final int b(InterfaceC2000kj interfaceC2000kj, int i, boolean z) {
        return f(interfaceC2000kj, i, z);
    }

    @Override // o.InterfaceC1324dm0
    public final void c(int i, C2562qX c2562qX) {
        C90 c90 = this.a;
        c90.getClass();
        c90.c(i, c2562qX);
    }

    @Override // o.InterfaceC1324dm0
    public final void d(long j, int i, int i2, int i3, C1226cm0 c1226cm0) {
        long jG;
        long jN;
        this.a.d(j, i, i2, i3, c1226cm0);
        while (this.a.v(false)) {
            DQ dq = this.c;
            dq.E();
            if (this.a.A(this.b, dq, 0, false) == -4) {
                dq.I();
            } else {
                dq = null;
            }
            if (dq != null) {
                long j2 = dq.q;
                CQ cqD = this.e.n.d(dq);
                if (cqD != null) {
                    C2016kr c2016kr = (C2016kr) cqD.l[0];
                    String str = c2016kr.l;
                    String str2 = c2016kr.m;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            jN = Lr0.N(Lr0.o(c2016kr.p));
                        } catch (C2949uX unused) {
                            jN = -9223372036854775807L;
                        }
                        if (jN != -9223372036854775807L) {
                            C3048vZ c3048vZ = new C3048vZ(j2, jN);
                            Handler handler = this.e.f1116o;
                            handler.sendMessage(handler.obtainMessage(1, c3048vZ));
                        }
                    }
                }
            }
        }
        C90 c90 = this.a;
        C3313y90 c3313y90 = c90.a;
        synchronized (c90) {
            int i4 = c90.s;
            jG = i4 == 0 ? -1L : c90.g(i4);
        }
        c3313y90.b(jG);
    }

    @Override // o.InterfaceC1324dm0
    public final /* synthetic */ void e(int i, C2562qX c2562qX) {
        AbstractC1674hK.c(this, c2562qX, i);
    }

    public final int f(InterfaceC2000kj interfaceC2000kj, int i, boolean z) {
        C90 c90 = this.a;
        c90.getClass();
        return c90.D(interfaceC2000kj, i, z);
    }
}
