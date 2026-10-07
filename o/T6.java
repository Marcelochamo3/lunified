package o;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class T6 {
    public final AudioManager a;
    public final S6 b;
    public SurfaceHolderCallbackC0898Xr c;
    public I6 d;
    public int e;
    public int f;
    public float g = 1.0f;
    public AudioFocusRequest h;

    public T6(Context context, Handler handler, SurfaceHolderCallbackC0898Xr surfaceHolderCallbackC0898Xr) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.a = audioManager;
        this.c = surfaceHolderCallbackC0898Xr;
        this.b = new S6(this, handler);
        this.e = 0;
    }

    public final void a() {
        if (this.e == 0) {
            return;
        }
        int i = Lr0.a;
        AudioManager audioManager = this.a;
        if (i >= 26) {
            AudioFocusRequest audioFocusRequest = this.h;
            if (audioFocusRequest != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            audioManager.abandonAudioFocus(this.b);
        }
        c(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    /* JADX WARN: Code duplicated, block: B:6:0x000e  */
    public final void b(I6 i6) {
        int i;
        if (Lr0.a(this.d, i6)) {
            return;
        }
        this.d = i6;
        if (i6 != null) {
            i = 3;
            switch (i6.n) {
                case 0:
                    AP.z();
                    i = 1;
                    break;
                case 1:
                case 14:
                    i = 1;
                    break;
                case 2:
                case 4:
                    i = 2;
                    break;
                case 3:
                    i = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 12:
                case 13:
                    break;
                case 11:
                    if (i6.l == 1) {
                        i = 2;
                    }
                    break;
                case 15:
                default:
                    AP.z();
                    i = 0;
                    break;
                case 16:
                    if (Lr0.a < 19) {
                        i = 2;
                    } else {
                        i = 4;
                    }
                    break;
            }
        } else {
            i = 0;
        }
        this.f = i;
        AbstractC0397Ej.b("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i == 1 || i == 0);
    }

    public final void c(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.g == f) {
            return;
        }
        this.g = f;
        SurfaceHolderCallbackC0898Xr surfaceHolderCallbackC0898Xr = this.c;
        if (surfaceHolderCallbackC0898Xr != null) {
            C1042as c1042as = surfaceHolderCallbackC0898Xr.l;
            c1042as.U(1, 2, Float.valueOf(c1042as.b0 * c1042as.A.g));
        }
    }

    public final int d(int i, boolean z) {
        int i2;
        int iRequestAudioFocus;
        AudioFocusRequest.Builder builderJ;
        int i3 = 1;
        if (i == 1 || this.f != 1) {
            a();
            return z ? 1 : -1;
        }
        if (!z) {
            return -1;
        }
        if (this.e != 1) {
            int i4 = Lr0.a;
            AudioManager audioManager = this.a;
            S6 s6 = this.b;
            if (i4 >= 26) {
                AudioFocusRequest audioFocusRequest = this.h;
                if (audioFocusRequest == null) {
                    if (audioFocusRequest == null) {
                        AbstractC3391z0.s();
                        builderJ = AbstractC3391z0.f(this.f);
                    } else {
                        AbstractC3391z0.s();
                        builderJ = AbstractC3391z0.j(this.h);
                    }
                    I6 i6 = this.d;
                    boolean z2 = i6 != null && i6.l == 1;
                    i6.getClass();
                    this.h = builderJ.setAudioAttributes((AudioAttributes) i6.a().m).setWillPauseWhenDucked(z2).setOnAudioFocusChangeListener(s6).build();
                }
                iRequestAudioFocus = audioManager.requestAudioFocus(this.h);
            } else {
                I6 i7 = this.d;
                i7.getClass();
                int i5 = i7.n;
                if (i5 != 13) {
                    switch (i5) {
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
                iRequestAudioFocus = audioManager.requestAudioFocus(s6, i2, this.f);
            }
            if (iRequestAudioFocus == 1) {
                c(1);
            } else {
                c(0);
                i3 = -1;
            }
        }
        return i3;
    }
}
