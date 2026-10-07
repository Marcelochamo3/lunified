package o;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* JADX INFO: renamed from: o.zO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3425zO {
    public static void a(InterfaceC1852j7 interfaceC1852j7, Object obj) {
        C1319dk c1319dk;
        AudioDeviceInfo audioDeviceInfoB = AbstractC1026ak.b(obj);
        C1904jk c1904jk = (C1904jk) interfaceC1852j7;
        if (audioDeviceInfoB == null) {
            c1319dk = null;
        } else {
            c1904jk.getClass();
            c1319dk = new C1319dk(audioDeviceInfoB);
        }
        c1904jk.Z = c1319dk;
        AudioTrack audioTrack = c1904jk.v;
        if (audioTrack != null) {
            AbstractC1124bk.a(audioTrack, c1319dk);
        }
    }
}
