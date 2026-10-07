package o;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.MediaDrmResetException;
import android.security.keystore.KeyGenParameterSpec;

/* JADX INFO: renamed from: o.ak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1026ak {
    public static /* bridge */ /* synthetic */ boolean A(Object obj) {
        return obj instanceof MediaDrmResetException;
    }

    public static /* synthetic */ KeyGenParameterSpec.Builder C() {
        return new KeyGenParameterSpec.Builder("lumix_proxy_store_rsa_v1", 3);
    }

    public static /* bridge */ /* synthetic */ AudioDeviceInfo b(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    public static /* synthetic */ AudioTrack.Builder c() {
        return new AudioTrack.Builder();
    }

    public static /* synthetic */ KeyGenParameterSpec.Builder m() {
        return new KeyGenParameterSpec.Builder("blindaje_device_key_v1", 4);
    }

    public static /* synthetic */ void r() {
    }
}
