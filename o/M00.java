package o;

import android.content.SharedPreferences;
import com.skidush.clonex.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class M00 implements InterfaceC1937k00 {
    public static final L00 c = new L00();
    public static final M00 d;
    public static final List e;
    public final int a;
    public final float b;

    static {
        M00 m00 = new M00(R.string.player_settings_caption_style_text_size_1, 1.0f);
        d = m00;
        e = AbstractC0937Ze.K(new M00(R.string.player_settings_caption_style_text_size_0_5, 0.5f), new M00(R.string.player_settings_caption_style_text_size_0_75, 0.75f), m00, new M00(R.string.player_settings_caption_style_text_size_1_25, 1.25f), new M00(R.string.player_settings_caption_style_text_size_1_5, 1.5f), new M00(R.string.player_settings_caption_style_text_size_2, 2.0f), new M00(R.string.player_settings_caption_style_text_size_3, 3.0f));
    }

    public M00(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final boolean a() {
        float fFloatValue;
        SharedPreferences sharedPreferences = AbstractC1459f50.n;
        Float fValueOf = null;
        if (sharedPreferences == null) {
            AbstractC1474fG.U("prefs");
            throw null;
        }
        if (sharedPreferences.contains("CAPTION_TEXT_SIZE")) {
            SharedPreferences sharedPreferences2 = AbstractC1459f50.n;
            if (sharedPreferences2 == null) {
                AbstractC1474fG.U("prefs");
                throw null;
            }
            fValueOf = Float.valueOf(sharedPreferences2.getFloat("CAPTION_TEXT_SIZE", 0.0f));
        }
        if (fValueOf != null) {
            fFloatValue = fValueOf.floatValue();
        } else {
            c.getClass();
            fFloatValue = d.b;
        }
        return this.b == fFloatValue;
    }
}
