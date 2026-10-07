package o;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* JADX INFO: loaded from: classes.dex */
public final class O6 extends AudioDeviceCallback {
    public final /* synthetic */ Q6 a;

    public O6(Q6 q6) {
        this.a = q6;
    }

    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        Q6 q6 = this.a;
        Q6.a(q6, M6.b((Context) q6.b));
    }

    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        Q6 q6 = this.a;
        Q6.a(q6, M6.b((Context) q6.b));
    }
}
