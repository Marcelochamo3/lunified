package androidx.leanback.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import com.skidush.clonex.R;
import o.C2469pa0;

/* JADX INFO: loaded from: classes.dex */
public class SpeechOrbView extends SearchOrbView {
    public final float D;
    public C2469pa0 E;
    public C2469pa0 F;
    public int G;
    public boolean H;

    public SpeechOrbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.G = 0;
        this.H = false;
        Resources resources = context.getResources();
        this.D = resources.getFraction(R.fraction.lb_search_bar_speech_orb_max_level_zoom, 1, 1);
        this.F = new C2469pa0(resources.getColor(R.color.lb_speech_orb_not_recording), resources.getColor(R.color.lb_speech_orb_not_recording_pulsed), resources.getColor(R.color.lb_speech_orb_not_recording_icon));
        this.E = new C2469pa0(resources.getColor(R.color.lb_speech_orb_recording), resources.getColor(R.color.lb_speech_orb_recording), 0);
        c();
    }

    public final void c() {
        setOrbColors(this.F);
        setOrbIcon(getResources().getDrawable(R.drawable.lb_ic_search_mic_out));
        a(hasFocus());
        View view = this.n;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        this.H = false;
    }

    @Override // androidx.leanback.widget.SearchOrbView
    public int getLayoutResourceId() {
        return R.layout.lb_speech_orb;
    }

    public void setListeningOrbColors(C2469pa0 c2469pa0) {
        this.E = c2469pa0;
    }

    public void setNotListeningOrbColors(C2469pa0 c2469pa0) {
        this.F = c2469pa0;
    }

    public void setSoundLevel(int i) {
        if (this.H) {
            int i2 = this.G;
            if (i > i2) {
                this.G = ((i - i2) / 2) + i2;
            } else {
                this.G = (int) (i2 * 0.7f);
            }
            float focusedZoom = (((this.D - getFocusedZoom()) * this.G) / 100.0f) + 1.0f;
            View view = this.n;
            view.setScaleX(focusedZoom);
            view.setScaleY(focusedZoom);
        }
    }
}
