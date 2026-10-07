package o;

import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public abstract class Ts0 {
    public static void a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            AP.g("Failed to call Surface.setFrameRate", e);
        }
    }
}
