package o;

import android.graphics.Color;
import com.skidush.clonex.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Q00 implements InterfaceC1937k00 {
    public static final P00 c = new P00();
    public static final Q00 d;
    public static final List e;
    public final int a;
    public final float b;

    static {
        Q00 q00 = new Q00(R.string.player_settings_caption_style_window_opacity_0, 0.0f);
        d = q00;
        e = AbstractC0937Ze.K(q00, new Q00(R.string.player_settings_caption_style_window_opacity_0_25, 0.25f), new Q00(R.string.player_settings_caption_style_window_opacity_0_5, 0.5f), new Q00(R.string.player_settings_caption_style_window_opacity_0_75, 0.75f), new Q00(R.string.player_settings_caption_style_window_opacity_1, 1.0f));
    }

    public Q00(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final boolean a() {
        return U9.E(this.b * ((float) 255)) == Color.alpha(AbstractC1459f50.s().c);
    }
}
