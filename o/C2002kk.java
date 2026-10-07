package o;

import android.os.SystemClock;

/* JADX INFO: renamed from: o.kk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2002kk {
    public final /* synthetic */ C2197mk a;

    public final void a(int i) {
        C2197mk c2197mk = this.a;
        synchronized (c2197mk) {
            int i2 = c2197mk.i;
            if (i2 == 0 || c2197mk.e) {
                if (i2 == i) {
                    return;
                }
                c2197mk.i = i;
                if (i != 1 && i != 0 && i != 8) {
                    c2197mk.l = c2197mk.b(i);
                    c2197mk.d.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    c2197mk.c(c2197mk.f > 0 ? (int) (jElapsedRealtime - c2197mk.g) : 0, c2197mk.h, c2197mk.l);
                    c2197mk.g = jElapsedRealtime;
                    c2197mk.h = 0L;
                    c2197mk.k = 0L;
                    c2197mk.j = 0L;
                    C3349ye0 c3349ye0 = c2197mk.c;
                    c3349ye0.b.clear();
                    c3349ye0.d = -1;
                    c3349ye0.e = 0;
                    c3349ye0.f = 0;
                }
            }
        }
    }
}
