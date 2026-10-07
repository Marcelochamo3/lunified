package o;

import com.skidush.clonex.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class F00 implements InterfaceC1937k00 {
    public static final E00 c = new E00();
    public static final F00 d;
    public static final List e;
    public final int a;
    public final int b;

    static {
        F00 f00 = new F00(R.string.player_settings_caption_style_edge_style_none, 0);
        d = f00;
        e = AbstractC0937Ze.K(f00, new F00(R.string.player_settings_caption_style_edge_style_raised, 3), new F00(R.string.player_settings_caption_style_edge_style_depressed, 4), new F00(R.string.player_settings_caption_style_edge_style_outline, 1), new F00(R.string.player_settings_caption_style_edge_style_drop_shadow, 2));
    }

    public F00(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
