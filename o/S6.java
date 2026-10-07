package o;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class S6 implements AudioManager.OnAudioFocusChangeListener {
    public final Handler a;
    public final /* synthetic */ T6 b;

    public S6(T6 t6, Handler handler) {
        this.b = t6;
        this.a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.a.post(new R6(i, 0, this));
    }
}
