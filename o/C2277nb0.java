package o;

import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.SeekBarPreference;

/* JADX INFO: renamed from: o.nb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2277nb0 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ SeekBarPreference a;

    public C2277nb0(SeekBarPreference seekBarPreference) {
        this.a = seekBarPreference;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        SeekBarPreference seekBarPreference = this.a;
        if (z && (seekBarPreference.h0 || !seekBarPreference.c0)) {
            seekBarPreference.B(seekBar);
            return;
        }
        int i2 = i + seekBarPreference.Z;
        TextView textView = seekBarPreference.e0;
        if (textView != null) {
            textView.setText(String.valueOf(i2));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.a.c0 = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        SeekBarPreference seekBarPreference = this.a;
        seekBarPreference.c0 = false;
        if (seekBar.getProgress() + seekBarPreference.Z != seekBarPreference.Y) {
            seekBarPreference.B(seekBar);
        }
    }
}
