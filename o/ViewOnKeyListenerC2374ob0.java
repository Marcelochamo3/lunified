package o;

import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* JADX INFO: renamed from: o.ob0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC2374ob0 implements View.OnKeyListener {
    public final /* synthetic */ SeekBarPreference l;

    public ViewOnKeyListenerC2374ob0(SeekBarPreference seekBarPreference) {
        this.l = seekBarPreference;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        SeekBar seekBar;
        if (keyEvent.getAction() != 0) {
            return false;
        }
        SeekBarPreference seekBarPreference = this.l;
        if ((!seekBarPreference.f0 && (i == 21 || i == 22)) || i == 23 || i == 66 || (seekBar = seekBarPreference.d0) == null) {
            return false;
        }
        return seekBar.onKeyDown(i, keyEvent);
    }
}
