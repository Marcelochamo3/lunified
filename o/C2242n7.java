package o;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: o.n7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2242n7 {
    public long A;
    public long B;
    public long C;
    public long D;
    public boolean E;
    public long F;
    public long G;
    public final C2133m1 a;
    public final long[] b;
    public AudioTrack c;
    public int d;
    public int e;
    public C2145m7 f;
    public int g;
    public boolean h;
    public long i;
    public float j;
    public boolean k;
    public long l;
    public long m;
    public Method n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f931o;
    public boolean p;
    public boolean q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public int w;
    public int x;
    public long y;
    public long z;

    public C2242n7(C2133m1 c2133m1) {
        this.a = c2133m1;
        if (Lr0.a >= 18) {
            try {
                this.n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.b = new long[10];
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0070  */
    /* JADX WARN: Code duplicated, block: B:58:0x0109  */
    /* JADX WARN: Code duplicated, block: B:62:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0113  */
    /* JADX WARN: Code duplicated, block: B:64:0x011c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0123  */
    /* JADX WARN: Code duplicated, block: B:67:0x0128  */
    /* JADX WARN: Code duplicated, block: B:70:0x013f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0156  */
    /* JADX WARN: Code duplicated, block: B:73:0x0168  */
    /* JADX WARN: Code duplicated, block: B:74:0x017d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0182  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c0 A[Catch: Exception -> 0x01c9, TRY_LEAVE, TryCatch #0 {Exception -> 0x01c9, blocks: (B:84:0x0199, B:86:0x01c0), top: B:128:0x0199 }] */
    public final long a(boolean z) {
        long jQ;
        final C1364e7 c1364e7;
        Handler handler;
        C2145m7 c2145m7;
        C2048l7 c2048l7;
        boolean z2;
        Method method;
        long jMax;
        long j;
        long j2;
        long jQ2;
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        C2133m1 c2133m1 = this.a;
        if (playState == 3) {
            long jNanoTime = System.nanoTime() / 1000;
            if (jNanoTime - this.m >= 30000) {
                long jQ3 = Lr0.Q(this.g, b());
                if (jQ3 != 0) {
                    int i = this.w;
                    long jZ = Lr0.z(jQ3, this.j) - jNanoTime;
                    long[] jArr = this.b;
                    jArr[i] = jZ;
                    this.w = (this.w + 1) % 10;
                    int i2 = this.x;
                    if (i2 < 10) {
                        this.x = i2 + 1;
                    }
                    this.m = jNanoTime;
                    this.l = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.x;
                        if (i3 >= i4) {
                            break;
                        }
                        this.l = (jArr[i3] / ((long) i4)) + this.l;
                        i3++;
                    }
                    if (!this.h) {
                        c2145m7 = this.f;
                        c2145m7.getClass();
                        c2048l7 = c2145m7.a;
                        if (c2048l7 != null || jNanoTime - c2145m7.e < c2145m7.d) {
                            z2 = false;
                        } else {
                            c2145m7.e = jNanoTime;
                            AudioTrack audioTrack2 = c2048l7.a;
                            AudioTimestamp audioTimestamp = c2048l7.b;
                            boolean timestamp = audioTrack2.getTimestamp(audioTimestamp);
                            if (timestamp) {
                                long j3 = audioTimestamp.framePosition;
                                if (c2048l7.d > j3) {
                                    c2048l7.c++;
                                }
                                c2048l7.d = j3;
                                c2048l7.e = j3 + (c2048l7.c << 32);
                            }
                            int i5 = c2145m7.b;
                            if (i5 != 0) {
                                if (i5 != 1) {
                                    if (i5 != 2) {
                                        if (i5 != 3) {
                                            if (i5 != 4) {
                                                throw new IllegalStateException();
                                            }
                                        } else if (timestamp) {
                                            c2145m7.a();
                                        }
                                    } else if (timestamp == 0) {
                                        c2145m7.a();
                                    }
                                } else if (timestamp == 0) {
                                    c2145m7.a();
                                } else if (c2048l7.e > c2145m7.f) {
                                    c2145m7.b(2);
                                }
                            } else if (timestamp != 0) {
                                if (audioTimestamp.nanoTime / 1000 >= c2145m7.c) {
                                    c2145m7.f = c2048l7.e;
                                    c2145m7.b(1);
                                } else {
                                    z2 = false;
                                }
                            } else if (jNanoTime - c2145m7.c > 500000) {
                                c2145m7.b(3);
                            }
                            z2 = timestamp;
                        }
                        if (z2) {
                            if (c2048l7 != null) {
                                j = c2048l7.b.nanoTime / 1000;
                            } else {
                                j = -9223372036854775807L;
                            }
                            if (c2048l7 != null) {
                                j2 = c2048l7.e;
                            } else {
                                j2 = -1;
                            }
                            jQ2 = Lr0.Q(this.g, b());
                            if (Math.abs(j - jNanoTime) > 5000000) {
                                c2133m1.getClass();
                                C1904jk c1904jk = (C1904jk) c2133m1.m;
                                c1904jk.h();
                                c1904jk.i();
                                AP.z();
                                c2145m7.b(4);
                            } else if (Math.abs(Lr0.Q(this.g, j2) - jQ2) > 5000000) {
                                c2133m1.getClass();
                                C1904jk c1904jk2 = (C1904jk) c2133m1.m;
                                c1904jk2.h();
                                c1904jk2.i();
                                AP.z();
                                c2145m7.b(4);
                            } else if (c2145m7.b == 4) {
                                c2145m7.a();
                            }
                        }
                        if (this.q && (method = this.n) != null && jNanoTime - this.r >= 500000) {
                            try {
                                AudioTrack audioTrack3 = this.c;
                                audioTrack3.getClass();
                                Integer num = (Integer) method.invoke(audioTrack3, null);
                                int i6 = Lr0.a;
                                long jIntValue = (((long) num.intValue()) * 1000) - this.i;
                                this.f931o = jIntValue;
                                jMax = Math.max(jIntValue, 0L);
                                this.f931o = jMax;
                                if (jMax > 5000000) {
                                    c2133m1.getClass();
                                    AP.z();
                                    this.f931o = 0L;
                                }
                            } catch (Exception unused) {
                                this.n = null;
                            }
                            this.r = jNanoTime;
                        }
                    }
                }
            } else if (!this.h) {
                c2145m7 = this.f;
                c2145m7.getClass();
                c2048l7 = c2145m7.a;
                if (c2048l7 != null) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (c2048l7 != null) {
                        j = c2048l7.b.nanoTime / 1000;
                    } else {
                        j = -9223372036854775807L;
                    }
                    if (c2048l7 != null) {
                        j2 = c2048l7.e;
                    } else {
                        j2 = -1;
                    }
                    jQ2 = Lr0.Q(this.g, b());
                    if (Math.abs(j - jNanoTime) > 5000000) {
                        c2133m1.getClass();
                        C1904jk c1904jk3 = (C1904jk) c2133m1.m;
                        c1904jk3.h();
                        c1904jk3.i();
                        AP.z();
                        c2145m7.b(4);
                    } else if (Math.abs(Lr0.Q(this.g, j2) - jQ2) > 5000000) {
                        c2133m1.getClass();
                        C1904jk c1904jk4 = (C1904jk) c2133m1.m;
                        c1904jk4.h();
                        c1904jk4.i();
                        AP.z();
                        c2145m7.b(4);
                    } else if (c2145m7.b == 4) {
                        c2145m7.a();
                    }
                }
                if (this.q) {
                    AudioTrack audioTrack4 = this.c;
                    audioTrack4.getClass();
                    Integer num2 = (Integer) method.invoke(audioTrack4, null);
                    int i7 = Lr0.a;
                    long jIntValue2 = (((long) num2.intValue()) * 1000) - this.i;
                    this.f931o = jIntValue2;
                    jMax = Math.max(jIntValue2, 0L);
                    this.f931o = jMax;
                    if (jMax > 5000000) {
                        c2133m1.getClass();
                        AP.z();
                        this.f931o = 0L;
                    }
                    this.r = jNanoTime;
                }
            }
        }
        long jNanoTime2 = System.nanoTime() / 1000;
        C2145m7 c2145m8 = this.f;
        c2145m8.getClass();
        boolean z3 = c2145m8.b == 2;
        if (z3) {
            C2048l7 c2048l8 = c2145m8.a;
            jQ = Lr0.v(jNanoTime2 - (c2048l8 != null ? c2048l8.b.nanoTime / 1000 : -9223372036854775807L), this.j) + Lr0.Q(this.g, c2048l8 != null ? c2048l8.e : -1L);
        } else {
            jQ = this.x == 0 ? Lr0.Q(this.g, b()) : Lr0.v(this.l + jNanoTime2, this.j);
            if (!z) {
                jQ = Math.max(0L, jQ - this.f931o);
            }
        }
        if (this.E != z3) {
            this.G = this.D;
            this.F = this.C;
        }
        long j4 = jNanoTime2 - this.G;
        if (j4 < 1000000) {
            long jV = Lr0.v(j4, this.j) + this.F;
            long j5 = (j4 * 1000) / 1000000;
            jQ = (((1000 - j5) * jV) + (jQ * j5)) / 1000;
        }
        if (!this.k) {
            long j6 = this.C;
            if (jQ > j6) {
                this.k = true;
                final long jCurrentTimeMillis = System.currentTimeMillis() - Lr0.X(Lr0.z(Lr0.X(jQ - j6), this.j));
                C0334By c0334By = ((C1904jk) c2133m1.m).r;
                if (c0334By != null && (handler = (c1364e7 = ((AO) c0334By.m).R0).b) != null) {
                    handler.post(new Runnable() { // from class: o.a7
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1364e7 c1364e8 = c1364e7;
                            c1364e8.getClass();
                            int i8 = Lr0.a;
                            C0942Zj c0942Zj = c1364e8.c.l.r;
                            C3201x2 c3201x2S = c0942Zj.S();
                            c0942Zj.T(c3201x2S, 1010, new S1(c3201x2S, jCurrentTimeMillis));
                        }
                    });
                }
            }
        }
        this.D = jNanoTime2;
        this.C = jQ;
        this.E = z3;
        return jQ;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    public final long b() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.y;
        if (j != -9223372036854775807L) {
            return Math.min(this.B, this.A + (((Lr0.v((jElapsedRealtime * 1000) - j, this.j) * ((long) this.g)) + 999999) / 1000000));
        }
        if (jElapsedRealtime - this.s >= 5) {
            AudioTrack audioTrack = this.c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (this.h) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.v = this.t;
                    }
                    playbackHeadPosition += this.v;
                }
                if (Lr0.a > 29) {
                    if (this.t > playbackHeadPosition) {
                        this.u++;
                    }
                    this.t = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.t <= 0 || playState != 3) {
                    this.z = -9223372036854775807L;
                    if (this.t > playbackHeadPosition) {
                        this.u++;
                    }
                    this.t = playbackHeadPosition;
                } else if (this.z == -9223372036854775807L) {
                    this.z = jElapsedRealtime;
                }
            }
            this.s = jElapsedRealtime;
        }
        return this.t + (this.u << 32);
    }

    public final boolean c(long j) {
        long jA = a(false);
        int i = this.g;
        int i2 = Lr0.a;
        if (j <= ((jA * ((long) i)) + 999999) / 1000000) {
            if (!this.h) {
                return false;
            }
            AudioTrack audioTrack = this.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() != 2 || b() != 0) {
                return false;
            }
        }
        return true;
    }

    public final void d() {
        this.l = 0L;
        this.x = 0;
        this.w = 0;
        this.m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.k = false;
    }
}
