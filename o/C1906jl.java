package o;

/* JADX INFO: renamed from: o.jl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1906jl {
    public final C1562g8 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public int j;
    public boolean k;

    public C1906jl(C1562g8 c1562g8, int i, int i2, int i3, int i4, boolean z) {
        a(i3, 0, "bufferForPlaybackMs", "0");
        a(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i, i3, "minBufferMs", "bufferForPlaybackMs");
        a(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i2, i, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.a = c1562g8;
        this.b = Lr0.K(i);
        this.c = Lr0.K(i2);
        this.d = Lr0.K(i3);
        this.e = Lr0.K(i4);
        this.f = -1;
        this.j = 13107200;
        this.g = z;
        this.h = Lr0.K(0);
        this.i = false;
    }

    public static void a(int i, int i2, String str, String str2) {
        AbstractC0397Ej.b(str + " cannot be less than " + str2, i >= i2);
    }

    public final void b(boolean z) {
        int i = this.f;
        if (i == -1) {
            i = 13107200;
        }
        this.j = i;
        this.k = false;
        if (z) {
            C1562g8 c1562g8 = this.a;
            synchronized (c1562g8) {
                if (c1562g8.b) {
                    c1562g8.b(0);
                }
            }
        }
    }

    public final boolean c(long j, float f) {
        int i;
        C1562g8 c1562g8 = this.a;
        synchronized (c1562g8) {
            i = c1562g8.e * c1562g8.c;
        }
        boolean z = true;
        boolean z2 = i >= this.j;
        long j2 = this.c;
        long jMin = this.b;
        if (f > 1.0f) {
            jMin = Math.min(Lr0.v(jMin, f), j2);
        }
        if (j < Math.max(jMin, 500000L)) {
            if (!this.g && z2) {
                z = false;
            }
            this.k = z;
            if (!z && j < 500000) {
                AP.z();
            }
        } else if (j >= j2 || z2) {
            this.k = false;
        }
        return this.k;
    }
}
