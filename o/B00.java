package o;

import android.graphics.Color;
import com.skidush.clonex.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class B00 implements InterfaceC1937k00 {
    public static final A00 c = new A00();
    public static final B00 d;
    public static final List e;
    public final int a;
    public final int b;

    static {
        B00 b00 = new B00(R.string.player_settings_caption_style_background_color_black, -16777216);
        d = b00;
        e = AbstractC0937Ze.K(b00, new B00(R.string.player_settings_caption_style_background_color_yellow, -256), new B00(R.string.player_settings_caption_style_background_color_green, -16711936), new B00(R.string.player_settings_caption_style_background_color_cyan, -16711681), new B00(R.string.player_settings_caption_style_background_color_blue, -16776961), new B00(R.string.player_settings_caption_style_background_color_magenta, -65281), new B00(R.string.player_settings_caption_style_background_color_red, -65536), new B00(R.string.player_settings_caption_style_background_color_white, -1));
    }

    public B00(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean a() {
        int i = AbstractC1459f50.s().b;
        return this.b == Color.rgb(Color.red(i), Color.green(i), Color.blue(i));
    }
}
