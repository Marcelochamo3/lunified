package o;

import android.media.AudioTrack;

/* JADX INFO: renamed from: o.m7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2145m7 {
    public final C2048l7 a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    public C2145m7(AudioTrack audioTrack) {
        if (Lr0.a >= 19) {
            this.a = new C2048l7(audioTrack);
            a();
        } else {
            this.a = null;
            b(3);
        }
    }

    public final void a() {
        if (this.a != null) {
            b(0);
        }
    }

    public final void b(int i) {
        this.b = i;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000;
            this.d = 10000L;
            return;
        }
        if (i == 1) {
            this.d = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.d = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.d = 500000L;
        }
    }
}
