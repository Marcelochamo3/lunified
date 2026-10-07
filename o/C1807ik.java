package o;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: renamed from: o.ik, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1807ik extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ Na0 a;

    public C1807ik(Na0 na0) {
        this.a = na0;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        C1904jk c1904jk;
        C0334By c0334By;
        C1140bs c1140bs;
        if (audioTrack.equals(((C1904jk) this.a.f414o).v) && (c0334By = (c1904jk = (C1904jk) this.a.f414o).r) != null && c1904jk.V && (c1140bs = ((AO) c0334By.m).b1) != null) {
            c1140bs.a.s.d(2);
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        C1904jk c1904jk;
        C0334By c0334By;
        C1140bs c1140bs;
        if (audioTrack.equals(((C1904jk) this.a.f414o).v) && (c0334By = (c1904jk = (C1904jk) this.a.f414o).r) != null && c1904jk.V && (c1140bs = ((AO) c0334By.m).b1) != null) {
            c1140bs.a.s.d(2);
        }
    }
}
