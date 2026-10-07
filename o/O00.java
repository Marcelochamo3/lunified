package o;

import android.graphics.Color;
import com.skidush.clonex.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class O00 implements InterfaceC1937k00 {
    public static final N00 c = new N00();
    public static final O00 d;
    public static final List e;
    public final int a;
    public final int b;

    static {
        O00 o00 = new O00(R.string.player_settings_caption_style_window_color_black, -16777216);
        d = o00;
        e = AbstractC0937Ze.K(o00, new O00(R.string.player_settings_caption_style_window_color_yellow, -256), new O00(R.string.player_settings_caption_style_window_color_green, -16711936), new O00(R.string.player_settings_caption_style_window_color_cyan, -16711681), new O00(R.string.player_settings_caption_style_window_color_blue, -16776961), new O00(R.string.player_settings_caption_style_window_color_magenta, -65281), new O00(R.string.player_settings_caption_style_window_color_red, -65536), new O00(R.string.player_settings_caption_style_window_color_white, -1));
    }

    public O00(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean a() {
        int i = AbstractC1459f50.s().c;
        return this.b == Color.rgb(Color.red(i), Color.green(i), Color.blue(i));
    }
}
