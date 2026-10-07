package o;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Surface;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class Xs0 {
    public final C2413ov a;
    public final Us0 b;
    public final Ws0 c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f626o;
    public long p;
    public long q;

    /* JADX WARN: Code duplicated, block: B:14:0x0050  */
    public Xs0(Context context) {
        Us0 vs0;
        DisplayManager displayManager;
        C2413ov c2413ov = new C2413ov();
        c2413ov.a = new C2316nv();
        c2413ov.b = new C2316nv();
        c2413ov.d = -9223372036854775807L;
        this.a = c2413ov;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            vs0 = (Lr0.a < 17 || (displayManager = (DisplayManager) applicationContext.getSystemService("display")) == null) ? null : new Vs0(displayManager);
            if (vs0 == null) {
                WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
                if (windowManager != null) {
                    vs0 = new L80(windowManager);
                } else {
                    vs0 = null;
                }
            }
        } else {
            vs0 = null;
        }
        this.b = vs0;
        this.c = vs0 != null ? Ws0.p : null;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public final long a(long j) {
        long j2;
        long j3;
        long j4;
        if (this.p == -1 || !this.a.a.a()) {
            j2 = j;
        } else {
            C2413ov c2413ov = this.a;
            if (c2413ov.a.a()) {
                C2316nv c2316nv = c2413ov.a;
                long j5 = c2316nv.e;
                j4 = j5 == 0 ? 0L : c2316nv.f / j5;
            } else {
                j4 = -9223372036854775807L;
            }
            j2 = this.q + ((long) (((this.m - this.p) * j4) / this.i));
            if (Math.abs(j - j2) > 20000000) {
                this.m = 0L;
                this.p = -1L;
                this.n = -1L;
                j2 = j;
            }
        }
        this.n = this.m;
        this.f626o = j2;
        Ws0 ws0 = this.c;
        if (ws0 == null || this.k == -9223372036854775807L) {
            return j2;
        }
        long j6 = ws0.l;
        if (j6 == -9223372036854775807L) {
            return j2;
        }
        long j7 = this.k;
        long j8 = (((j2 - j6) / j7) * j7) + j6;
        if (j2 <= j8) {
            j3 = j8 - j7;
        } else {
            j3 = j8;
            j8 = j7 + j8;
        }
        if (j8 - j2 >= j2 - j3) {
            j8 = j3;
        }
        return j8 - this.l;
    }

    public final void b() {
        Surface surface;
        if (Lr0.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == 0.0f) {
            return;
        }
        this.h = 0.0f;
        Ts0.a(surface, 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    public final void c(long j) {
        boolean z;
        long j2 = this.n;
        if (j2 != -1) {
            this.p = j2;
            this.q = this.f626o;
        }
        this.m++;
        long j3 = j * 1000;
        C2413ov c2413ov = this.a;
        c2413ov.a.b(j3);
        if (c2413ov.a.a()) {
            c2413ov.c = false;
        } else if (c2413ov.d != -9223372036854775807L) {
            if (c2413ov.c) {
                C2316nv c2316nv = c2413ov.b;
                long j4 = c2316nv.d;
                if (j4 == 0) {
                    z = false;
                } else {
                    z = c2316nv.g[(int) ((j4 - 1) % 15)];
                }
                if (z) {
                    c2413ov.b.c();
                    c2413ov.b.b(c2413ov.d);
                }
            } else {
                c2413ov.b.c();
                c2413ov.b.b(c2413ov.d);
            }
            c2413ov.c = true;
            c2413ov.b.b(j3);
        }
        if (c2413ov.c && c2413ov.b.a()) {
            C2316nv c2316nv2 = c2413ov.a;
            c2413ov.a = c2413ov.b;
            c2413ov.b = c2316nv2;
            c2413ov.c = false;
        }
        c2413ov.d = j3;
        c2413ov.e = c2413ov.a.a() ? 0 : c2413ov.e + 1;
        d();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    public final void d() {
        float f;
        float f2;
        if (Lr0.a < 30 || this.e == null) {
            return;
        }
        C2413ov c2413ov = this.a;
        if (!c2413ov.a.a()) {
            f = this.f;
        } else if (c2413ov.a.a()) {
            C2316nv c2316nv = c2413ov.a;
            long j = c2316nv.e;
            f = (float) (1.0E9d / (j != 0 ? c2316nv.f / j : 0L));
        } else {
            f = -1.0f;
        }
        float f3 = this.g;
        if (f == f3) {
            return;
        }
        if (f != -1.0f && f3 != -1.0f) {
            if (c2413ov.a.a()) {
                if ((c2413ov.a.a() ? c2413ov.a.f : -9223372036854775807L) >= 5000000000L) {
                    f2 = 0.02f;
                } else {
                    f2 = 1.0f;
                }
            } else {
                f2 = 1.0f;
            }
            if (Math.abs(f - this.g) < f2) {
                return;
            }
        } else if (f == -1.0f && c2413ov.e < 30) {
            return;
        }
        this.g = f;
        e(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    public final void e(boolean z) {
        Surface surface;
        float f;
        if (Lr0.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        if (this.d) {
            float f2 = this.g;
            if (f2 != -1.0f) {
                f = f2 * this.i;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        if (z || this.h != f) {
            this.h = f;
            Ts0.a(surface, f);
        }
    }
}
