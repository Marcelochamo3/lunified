package o;

import android.graphics.Color;
import com.skidush.clonex.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class D00 implements InterfaceC1937k00 {
    public static final C00 c = new C00();
    public static final D00 d;
    public static final List e;
    public final int a;
    public final float b;

    static {
        D00 d00 = new D00(R.string.player_settings_caption_style_background_opacity_0, 0.0f);
        d = d00;
        e = AbstractC0937Ze.K(d00, new D00(R.string.player_settings_caption_style_background_opacity_0_25, 0.25f), new D00(R.string.player_settings_caption_style_background_opacity_0_5, 0.5f), new D00(R.string.player_settings_caption_style_background_opacity_0_75, 0.75f), new D00(R.string.player_settings_caption_style_background_opacity_1, 1.0f));
    }

    public D00(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final boolean a() {
        return U9.E(this.b * ((float) 255)) == Color.alpha(AbstractC1459f50.s().b);
    }
}
