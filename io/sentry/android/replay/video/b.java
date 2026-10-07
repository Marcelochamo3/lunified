package io.sentry.android.replay.video;

import android.media.MediaMuxer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final long a;
    public final MediaMuxer b;
    public boolean c;
    public int d;
    public int e;
    public long f;

    public b(String str, float f) {
        this.a = (long) (TimeUnit.SECONDS.toMicros(1L) / f);
        this.b = new MediaMuxer(str, 0);
    }
}
