package o;

import android.media.AudioFocusRequest;
import java.lang.invoke.MethodHandles;

/* JADX INFO: renamed from: o.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3391z0 {
    public static /* synthetic */ AudioFocusRequest.Builder f(int i) {
        return new AudioFocusRequest.Builder(i);
    }

    public static /* synthetic */ AudioFocusRequest.Builder j(AudioFocusRequest audioFocusRequest) {
        return new AudioFocusRequest.Builder(audioFocusRequest);
    }

    public static /* bridge */ /* synthetic */ Class n() {
        return MethodHandles.Lookup.class;
    }

    public static /* bridge */ /* synthetic */ MethodHandles.Lookup r(Object obj) {
        return (MethodHandles.Lookup) obj;
    }

    public static /* synthetic */ void s() {
    }
}
