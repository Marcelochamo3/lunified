package o;

import android.graphics.Color;
import com.skidush.clonex.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class J00 implements InterfaceC1937k00 {
    public static final I00 c = new I00();
    public static final J00 d;
    public static final List e;
    public final int a;
    public final float b;

    static {
        J00 j00 = new J00(R.string.player_settings_caption_style_font_opacity_1, 1.0f);
        d = j00;
        e = AbstractC0937Ze.K(new J00(R.string.player_settings_caption_style_font_opacity_0_5, 0.5f), new J00(R.string.player_settings_caption_style_font_opacity_0_75, 0.75f), j00);
    }

    public J00(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final boolean a() {
        return U9.E(this.b * ((float) 255)) == Color.alpha(AbstractC1459f50.s().a);
    }
}
