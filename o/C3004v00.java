package o;

import com.skidush.clonex.R;
import java.util.List;

/* JADX INFO: renamed from: o.v00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3004v00 implements InterfaceC1937k00 {
    public static final C2229n00 d = new C2229n00(4);
    public static final C3004v00 e;
    public static final List f;
    public final int a;
    public final float b;
    public boolean c;

    static {
        C3004v00 c3004v00 = new C3004v00(R.string.player_settings_speed_1, 1.0f);
        e = c3004v00;
        f = AbstractC0937Ze.K(new C3004v00(R.string.player_settings_speed_0_25, 0.25f), new C3004v00(R.string.player_settings_speed_0_5, 0.5f), new C3004v00(R.string.player_settings_speed_0_75, 0.75f), c3004v00, new C3004v00(R.string.player_settings_speed_1_25, 1.25f), new C3004v00(R.string.player_settings_speed_1_5, 1.5f), new C3004v00(R.string.player_settings_speed_1_75, 1.75f), new C3004v00(R.string.player_settings_speed_2, 2.0f));
    }

    public C3004v00(int i, float f2) {
        this.a = i;
        this.b = f2;
    }
}
