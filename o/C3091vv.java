package o;

import java.util.Collections;

/* JADX INFO: renamed from: o.vv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3091vv {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final C2994uv k;
    public final CQ l;

    public C3091vv(int i, byte[] bArr) {
        C2084lc c2084lc = new C2084lc(bArr.length, bArr);
        c2084lc.p(i * 8);
        this.a = c2084lc.i(16);
        this.b = c2084lc.i(16);
        this.c = c2084lc.i(24);
        this.d = c2084lc.i(24);
        int i2 = c2084lc.i(20);
        this.e = i2;
        this.f = d(i2);
        this.g = c2084lc.i(3) + 1;
        int i3 = c2084lc.i(5) + 1;
        this.h = i3;
        this.i = a(i3);
        int i4 = c2084lc.i(4);
        int i5 = c2084lc.i(32);
        int i6 = Lr0.a;
        this.j = ((((long) i4) & 4294967295L) << 32) | (((long) i5) & 4294967295L);
        this.k = null;
        this.l = null;
    }

    public static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.e);
    }

    public final C0643Nw c(byte[] bArr, CQ cq) {
        bArr[4] = -128;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        CQ cq2 = this.l;
        if (cq2 != null) {
            cq = cq == null ? cq2 : cq2.a(cq.l);
        }
        C0617Mw c0617Mw = new C0617Mw();
        c0617Mw.k = "audio/flac";
        c0617Mw.l = i;
        c0617Mw.x = this.g;
        c0617Mw.y = this.e;
        c0617Mw.m = Collections.singletonList(bArr);
        c0617Mw.i = cq;
        return new C0643Nw(c0617Mw);
    }

    public C3091vv(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, C2994uv c2994uv, CQ cq) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = d(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = c2994uv;
        this.l = cq;
    }
}
