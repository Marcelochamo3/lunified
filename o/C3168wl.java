package o;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.wl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3168wl {
    public final Context a;
    public final C2102ll b;
    public int c;
    public boolean d;
    public JO e;

    public C3168wl(Context context) {
        this.a = context;
        C2102ll c2102ll = new C2102ll();
        c2102ll.l = 0;
        this.b = c2102ll;
        this.c = 0;
        this.e = JO.k;
    }

    public final AbstractC1952k8[] a(Handler handler, SurfaceHolderCallbackC0898Xr surfaceHolderCallbackC0898Xr, SurfaceHolderCallbackC0898Xr surfaceHolderCallbackC0898Xr2, SurfaceHolderCallbackC0898Xr surfaceHolderCallbackC0898Xr3, SurfaceHolderCallbackC0898Xr surfaceHolderCallbackC0898Xr4) {
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList = new ArrayList();
        int i5 = this.c;
        arrayList.add(new SO(this.a, this.b, this.e, this.d, handler, surfaceHolderCallbackC0898Xr));
        if (i5 != 0) {
            int size = arrayList.size();
            if (i5 == 2) {
                size--;
            }
            try {
                try {
                    i4 = size + 1;
                    try {
                        arrayList.add(size, (AbstractC1952k8) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, SurfaceHolderCallbackC0898Xr.class, Integer.TYPE).newInstance(5000L, handler, surfaceHolderCallbackC0898Xr, 50));
                        AP.j();
                    } catch (ClassNotFoundException unused) {
                        size = i4;
                        i4 = size;
                    }
                } catch (ClassNotFoundException unused2) {
                }
                try {
                    arrayList.add(i4, (AbstractC1952k8) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, SurfaceHolderCallbackC0898Xr.class, Integer.TYPE).newInstance(5000L, handler, surfaceHolderCallbackC0898Xr, 50));
                    AP.j();
                } catch (ClassNotFoundException unused3) {
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating AV1 extension", e);
                }
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating VP9 extension", e2);
            }
        }
        C1416ek c1416ek = new C1416ek(this.a);
        c1416ek.d = false;
        c1416ek.e = false;
        c1416ek.f = 0;
        if (c1416ek.c == null) {
            c1416ek.c = new Na0(new X6[0]);
        }
        C1904jk c1904jk = new C1904jk(c1416ek);
        int i6 = this.c;
        arrayList.add(new AO(this.a, this.b, this.e, this.d, handler, surfaceHolderCallbackC0898Xr2, c1904jk));
        if (i6 != 0) {
            int size2 = arrayList.size();
            if (i6 == 2) {
                size2--;
            }
            try {
                try {
                    i = size2 + 1;
                    try {
                        arrayList.add(size2, (AbstractC1952k8) Class.forName("com.google.android.exoplayer2.decoder.midi.MidiRenderer").getConstructor(null).newInstance(null));
                        AP.j();
                    } catch (ClassNotFoundException unused4) {
                        size2 = i;
                        i = size2;
                    }
                } catch (ClassNotFoundException unused5) {
                }
                try {
                    try {
                        i2 = i + 1;
                        try {
                            arrayList.add(i, (AbstractC1952k8) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, SurfaceHolderCallbackC0898Xr.class, InterfaceC1852j7.class).newInstance(handler, surfaceHolderCallbackC0898Xr2, c1904jk));
                            AP.j();
                        } catch (ClassNotFoundException unused6) {
                            i = i2;
                            i2 = i;
                        }
                    } catch (Exception e3) {
                        throw new RuntimeException("Error instantiating Opus extension", e3);
                    }
                } catch (ClassNotFoundException unused7) {
                }
                try {
                    try {
                        i3 = i2 + 1;
                        try {
                            arrayList.add(i2, (AbstractC1952k8) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, SurfaceHolderCallbackC0898Xr.class, InterfaceC1852j7.class).newInstance(handler, surfaceHolderCallbackC0898Xr2, c1904jk));
                            AP.j();
                        } catch (ClassNotFoundException unused8) {
                            i2 = i3;
                            i3 = i2;
                        }
                    } catch (ClassNotFoundException unused9) {
                    }
                    try {
                        arrayList.add(i3, (AbstractC1952k8) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, SurfaceHolderCallbackC0898Xr.class, InterfaceC1852j7.class).newInstance(handler, surfaceHolderCallbackC0898Xr2, c1904jk));
                        AP.j();
                    } catch (ClassNotFoundException unused10) {
                    } catch (Exception e4) {
                        throw new RuntimeException("Error instantiating FFmpeg extension", e4);
                    }
                } catch (Exception e5) {
                    throw new RuntimeException("Error instantiating FLAC extension", e5);
                }
            } catch (Exception e6) {
                throw new RuntimeException("Error instantiating MIDI extension", e6);
            }
        }
        arrayList.add(new Si0(surfaceHolderCallbackC0898Xr3, handler.getLooper()));
        arrayList.add(new GQ(surfaceHolderCallbackC0898Xr4, handler.getLooper()));
        arrayList.add(new C1106bb());
        return (AbstractC1952k8[]) arrayList.toArray(new AbstractC1952k8[0]);
    }
}
