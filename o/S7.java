package o;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class S7 implements InterfaceC2583qj {
    public final boolean l;
    public final ArrayList m = new ArrayList(1);
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C2970uj f507o;

    public S7(boolean z) {
        this.l = z;
    }

    public final void b(int i) {
        C2970uj c2970uj = this.f507o;
        int i2 = Lr0.a;
        for (int i3 = 0; i3 < this.n; i3++) {
            InterfaceC2590qm0 interfaceC2590qm0 = (InterfaceC2590qm0) this.m.get(i3);
            boolean z = this.l;
            C2197mk c2197mk = (C2197mk) interfaceC2590qm0;
            synchronized (c2197mk) {
                M60 m60 = C2197mk.n;
                if (z && (c2970uj.i & 8) != 8) {
                    c2197mk.h += (long) i;
                }
            }
        }
    }

    public final void c() {
        C2970uj c2970uj = this.f507o;
        int i = Lr0.a;
        for (int i2 = 0; i2 < this.n; i2++) {
            InterfaceC2590qm0 interfaceC2590qm0 = (InterfaceC2590qm0) this.m.get(i2);
            boolean z = this.l;
            C2197mk c2197mk = (C2197mk) interfaceC2590qm0;
            synchronized (c2197mk) {
                try {
                    M60 m60 = C2197mk.n;
                    if (z && (c2970uj.i & 8) != 8) {
                        AbstractC0397Ej.f(c2197mk.f > 0);
                        c2197mk.d.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i3 = (int) (jElapsedRealtime - c2197mk.g);
                        c2197mk.j += (long) i3;
                        long j = c2197mk.k;
                        long j2 = c2197mk.h;
                        c2197mk.k = j + j2;
                        if (i3 > 0) {
                            c2197mk.c.a((int) Math.sqrt(j2), (j2 * 8000.0f) / i3);
                            if (c2197mk.j >= 2000 || c2197mk.k >= 524288) {
                                c2197mk.l = (long) c2197mk.c.b();
                            }
                            c2197mk.c(i3, c2197mk.h, c2197mk.l);
                            c2197mk.g = jElapsedRealtime;
                            c2197mk.h = 0L;
                        }
                        c2197mk.f--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f507o = null;
    }

    public final void e() {
        for (int i = 0; i < this.n; i++) {
            ((InterfaceC2590qm0) this.m.get(i)).getClass();
        }
    }

    public final void f(C2970uj c2970uj) {
        this.f507o = c2970uj;
        for (int i = 0; i < this.n; i++) {
            InterfaceC2590qm0 interfaceC2590qm0 = (InterfaceC2590qm0) this.m.get(i);
            boolean z = this.l;
            C2197mk c2197mk = (C2197mk) interfaceC2590qm0;
            synchronized (c2197mk) {
                try {
                    M60 m60 = C2197mk.n;
                    if (z && (c2970uj.i & 8) != 8) {
                        if (c2197mk.f == 0) {
                            c2197mk.d.getClass();
                            c2197mk.g = SystemClock.elapsedRealtime();
                        }
                        c2197mk.f++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // o.InterfaceC2583qj
    public final void k(InterfaceC2590qm0 interfaceC2590qm0) {
        interfaceC2590qm0.getClass();
        ArrayList arrayList = this.m;
        if (arrayList.contains(interfaceC2590qm0)) {
            return;
        }
        arrayList.add(interfaceC2590qm0);
        this.n++;
    }

    @Override // o.InterfaceC2583qj
    public Map l() {
        return Collections.emptyMap();
    }
}
