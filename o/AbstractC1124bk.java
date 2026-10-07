package o;

import android.media.AudioTrack;

/* JADX INFO: renamed from: o.bk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1124bk {
    public static void a(AudioTrack audioTrack, C1319dk c1319dk) {
        audioTrack.setPreferredDevice(c1319dk == null ? null : c1319dk.a);
    }
}
