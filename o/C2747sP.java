package o;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;

/* JADX INFO: renamed from: o.sP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2747sP {
    public boolean A;
    public final Context a;
    public final C3071vl b;
    public final PlaybackSession c;
    public String i;
    public PlaybackMetrics.Builder j;
    public int k;
    public AbstractC1200cZ n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C2613qy f1025o;
    public C2613qy p;
    public C2613qy q;
    public C0643Nw r;
    public C0643Nw s;
    public C0643Nw t;
    public boolean u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public int z;
    public final Ej0 e = new Ej0();
    public final Dj0 f = new Dj0();
    public final HashMap h = new HashMap();
    public final HashMap g = new HashMap();
    public final long d = SystemClock.elapsedRealtime();
    public int l = 0;
    public int m = 0;

    public C2747sP(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.c = playbackSession;
        C3071vl c3071vl = new C3071vl();
        this.b = c3071vl;
        c3071vl.d = this;
    }

    public final boolean a(C2613qy c2613qy) {
        String str;
        if (c2613qy != null) {
            String str2 = (String) c2613qy.f996o;
            C3071vl c3071vl = this.b;
            synchronized (c3071vl) {
                str = c3071vl.f;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        PlaybackMetrics.Builder builder = this.j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.z);
            this.j.setVideoFramesDropped(this.x);
            this.j.setVideoFramesPlayed(this.y);
            Long l = (Long) this.g.get(this.i);
            this.j.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.h.get(this.i);
            this.j.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.j.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.c.reportPlaybackMetrics(this.j.build());
        }
        this.j = null;
        this.i = null;
        this.z = 0;
        this.x = 0;
        this.y = 0;
        this.r = null;
        this.s = null;
        this.t = null;
        this.A = false;
    }

    public final void c(Fj0 fj0, CP cp) {
        int iB;
        PlaybackMetrics.Builder builder = this.j;
        if (cp == null || (iB = fj0.b(cp.a)) == -1) {
            return;
        }
        Dj0 dj0 = this.f;
        int i = 0;
        fj0.g(iB, dj0, false);
        int i2 = dj0.n;
        Ej0 ej0 = this.e;
        fj0.o(i2, ej0);
        C1483fP c1483fP = ej0.n.m;
        if (c1483fP != null) {
            int iF = Lr0.F(c1483fP.l, c1483fP.m);
            if (iF == 0) {
                i = 3;
            } else if (iF != 1) {
                i = iF != 2 ? 1 : 4;
            } else {
                i = 5;
            }
        }
        builder.setStreamType(i);
        if (ej0.y != -9223372036854775807L && !ej0.w && !ej0.t && !ej0.a()) {
            builder.setMediaDurationMillis(Lr0.X(ej0.y));
        }
        builder.setPlaybackType(ej0.a() ? 2 : 1);
        this.A = true;
    }

    public final void d(C3201x2 c3201x2, String str) {
        CP cp = c3201x2.d;
        if ((cp == null || !cp.a()) && str.equals(this.i)) {
            b();
        }
        this.g.remove(str);
        this.h.remove(str);
    }

    public final void e(int i, long j, C0643Nw c0643Nw, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = AbstractC2457pP.j(i).setTimeSinceCreatedMillis(j - this.d);
        if (c0643Nw != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = c0643Nw.v;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c0643Nw.w;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c0643Nw.t;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = c0643Nw.s;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = c0643Nw.B;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = c0643Nw.C;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = c0643Nw.J;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = c0643Nw.K;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = c0643Nw.n;
            if (str4 != null) {
                int i9 = Lr0.a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = c0643Nw.D;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        this.c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }
}
