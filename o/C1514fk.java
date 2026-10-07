package o;

import android.media.AudioAttributes;
import android.media.AudioTrack;

/* JADX INFO: renamed from: o.fk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1514fk {
    public final C0643Nw a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final U6 i;
    public final boolean j;

    public C1514fk(C0643Nw c0643Nw, int i, int i2, int i3, int i4, int i5, int i6, int i7, U6 u6, boolean z) {
        this.a = c0643Nw;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = u6;
        this.j = z;
    }

    public static AudioAttributes c(I6 i6, boolean z) {
        return z ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) i6.a().m;
    }

    public final AudioTrack a(boolean z, I6 i6, int i) {
        int i2 = this.c;
        try {
            AudioTrack audioTrackB = b(z, i6, i);
            int state = audioTrackB.getState();
            if (state == 1) {
                return audioTrackB;
            }
            try {
                audioTrackB.release();
            } catch (Exception unused) {
            }
            throw new C1560g7(state, this.e, this.f, this.h, this.a, i2 == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new C1560g7(0, this.e, this.f, this.h, this.a, i2 == 1, e);
        }
    }

    public final AudioTrack b(boolean z, I6 i6, int i) {
        int i2;
        int i3 = Lr0.a;
        int i4 = this.g;
        int i5 = this.f;
        int i7 = this.e;
        if (i3 >= 29) {
            return AbstractC1026ak.c().setAudioAttributes(c(i6, z)).setAudioFormat(C1904jk.f(i7, i5, i4)).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i).setOffloadedPlayback(this.c == 1).build();
        }
        if (i3 >= 21) {
            return new AudioTrack(c(i6, z), C1904jk.f(i7, i5, i4), this.h, 1, i);
        }
        int i8 = i6.n;
        if (i8 != 13) {
            switch (i8) {
                case 2:
                    i2 = 0;
                    break;
                case 3:
                    i2 = 8;
                    break;
                case 4:
                    i2 = 4;
                    break;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    i2 = 5;
                    break;
                case 6:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 1;
        }
        if (i == 0) {
            return new AudioTrack(i2, this.e, this.f, this.g, this.h, 1);
        }
        return new AudioTrack(i2, this.e, this.f, this.g, this.h, 1, i);
    }
}
