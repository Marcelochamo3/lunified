package o;

import android.content.SharedPreferences;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.o00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2326o00 extends AbstractC2520q00 {
    public static final C2326o00 i = new C2326o00();

    @Override // o.AbstractC2520q00
    public final int a() {
        if (AbstractC2520q00.c != null || C2229n00.a()) {
            return (AbstractC1474fG.b(AbstractC2520q00.c, Boolean.FALSE) && C2229n00.a()) ? R.string.player_settings_extra_buffer_forced_off : R.string.player_settings_extra_buffer_off;
        }
        return R.string.player_settings_extra_buffer_auto_off;
    }

    @Override // o.AbstractC2520q00
    public final boolean b() {
        SharedPreferences sharedPreferences = AbstractC1459f50.n;
        Boolean boolValueOf = null;
        if (sharedPreferences == null) {
            AbstractC1474fG.U("prefs");
            throw null;
        }
        boolean zBooleanValue = false;
        if (sharedPreferences.contains("FORCE_EXTRA_BUFFERING")) {
            SharedPreferences sharedPreferences2 = AbstractC1459f50.n;
            if (sharedPreferences2 == null) {
                AbstractC1474fG.U("prefs");
                throw null;
            }
            boolValueOf = Boolean.valueOf(sharedPreferences2.getBoolean("FORCE_EXTRA_BUFFERING", false));
        }
        boolean zBooleanValue2 = boolValueOf != null ? boolValueOf.booleanValue() : true;
        boolean z = AbstractC2520q00.b;
        Boolean bool = AbstractC2520q00.c;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else if (z || zBooleanValue2) {
            zBooleanValue = true;
        }
        return true ^ zBooleanValue;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C2326o00);
    }

    public final int hashCode() {
        return -909433583;
    }

    public final String toString() {
        return "Off";
    }
}
