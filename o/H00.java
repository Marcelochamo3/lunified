package o;

import android.graphics.Color;
import com.skidush.clonex.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class H00 implements InterfaceC1937k00 {
    public static final G00 c = new G00();
    public static final H00 d;
    public static final List e;
    public final int a;
    public final int b;

    static {
        H00 h00 = new H00(R.string.player_settings_caption_style_font_color_white, -1);
        d = h00;
        e = AbstractC0937Ze.K(h00, new H00(R.string.player_settings_caption_style_font_color_yellow, -256), new H00(R.string.player_settings_caption_style_font_color_green, -16711936), new H00(R.string.player_settings_caption_style_font_color_cyan, -16711681), new H00(R.string.player_settings_caption_style_font_color_blue, -16776961), new H00(R.string.player_settings_caption_style_font_color_magenta, -65281), new H00(R.string.player_settings_caption_style_font_color_red, -65536), new H00(R.string.player_settings_caption_style_font_color_black, -16777216));
    }

    public H00(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean a() {
        int i = AbstractC1459f50.s().a;
        return this.b == Color.rgb(Color.red(i), Color.green(i), Color.blue(i));
    }
}
