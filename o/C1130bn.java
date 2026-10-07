package o;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: o.bn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1130bn extends AbstractC3066vi0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1130bn(Object obj, String str, int i) {
        super(str, true);
        this.e = i;
        this.f = obj;
    }

    private final long b() {
        io.sentry.android.core.internal.util.d dVar = (io.sentry.android.core.internal.util.d) this.f;
        long jNanoTime = System.nanoTime();
        int i = 0;
        long j = Long.MIN_VALUE;
        C50 c50 = null;
        int i2 = 0;
        for (C50 c51 : (ConcurrentLinkedQueue) dVar.e) {
            AbstractC1474fG.i(c51, "connection");
            synchronized (c51) {
                if (dVar.c(c51, jNanoTime) > 0) {
                    i2++;
                } else {
                    i++;
                    long j2 = jNanoTime - c51.q;
                    if (j2 > j) {
                        c50 = c51;
                        j = j2;
                    }
                }
            }
        }
        long j3 = dVar.b;
        if (j < j3 && i <= dVar.a) {
            if (i > 0) {
                return j3 - j;
            }
            if (i2 > 0) {
                return j3;
            }
            return -1L;
        }
        AbstractC1474fG.g(c50);
        synchronized (c50) {
            if (!c50.p.isEmpty()) {
                return 0L;
            }
            if (c50.q + j != jNanoTime) {
                return 0L;
            }
            c50.j = true;
            ((ConcurrentLinkedQueue) dVar.e).remove(c50);
            Socket socket = c50.d;
            AbstractC1474fG.g(socket);
            Mr0.e(socket);
            if (!((ConcurrentLinkedQueue) dVar.e).isEmpty()) {
                return 0L;
            }
            ((C3357yi0) dVar.c).a();
            return 0L;
        }
    }

    @Override // o.AbstractC3066vi0
    public final long a() {
        switch (this.e) {
            case 0:
                C1227cn c1227cn = (C1227cn) this.f;
                synchronized (c1227cn) {
                    if (c1227cn.x && !c1227cn.y) {
                        try {
                            c1227cn.Y();
                        } catch (IOException unused) {
                            c1227cn.z = true;
                        }
                        try {
                            if (c1227cn.q()) {
                                c1227cn.W();
                                c1227cn.u = 0;
                            }
                        } catch (IOException unused2) {
                            c1227cn.A = true;
                            c1227cn.s = Nr0.f(new T8());
                        }
                        break;
                    }
                }
                return -1L;
            case 1:
                TD td = (TD) this.f;
                td.getClass();
                try {
                    td.J.q(2, 0, false);
                    return -1L;
                } catch (IOException e) {
                    td.a(2, 2, e);
                    return -1L;
                }
            case 2:
                return b();
            default:
                ((InterfaceC0360Cy) this.f).c();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1130bn(String str, Object obj, int i) {
        super(str, true);
        this.e = i;
        this.f = obj;
    }
}
