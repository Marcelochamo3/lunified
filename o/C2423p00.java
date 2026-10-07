package o;

import android.content.SharedPreferences;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.p00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2423p00 extends AbstractC2520q00 {
    public static final C2423p00 i = new C2423p00();

    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f A[ORIG_RETURN, RETURN] */
    @Override // o.AbstractC2520q00
    public final int a() {
        Boolean bool = AbstractC2520q00.c;
        if (bool == null && AbstractC2520q00.b) {
            return R.string.player_settings_extra_buffer_auto_on;
        }
        if (bool == null) {
            SharedPreferences sharedPreferences = AbstractC1459f50.n;
            Boolean boolValueOf = null;
            if (sharedPreferences == null) {
                AbstractC1474fG.U("prefs");
                throw null;
            }
            if (sharedPreferences.contains("FORCE_EXTRA_BUFFERING")) {
                SharedPreferences sharedPreferences2 = AbstractC1459f50.n;
                if (sharedPreferences2 == null) {
                    AbstractC1474fG.U("prefs");
                    throw null;
                }
                boolValueOf = Boolean.valueOf(sharedPreferences2.getBoolean("FORCE_EXTRA_BUFFERING", false));
            }
            if (!(boolValueOf != null ? boolValueOf.booleanValue() : true)) {
                if (AbstractC1474fG.b(AbstractC2520q00.c, Boolean.TRUE)) {
                    return R.string.player_settings_extra_buffer_on;
                }
            }
        } else if (AbstractC1474fG.b(AbstractC2520q00.c, Boolean.TRUE)) {
            return R.string.player_settings_extra_buffer_on;
        }
        return R.string.player_settings_extra_buffer_forced_on;
    }

    @Override // o.AbstractC2520q00
    public final boolean b() {
        SharedPreferences sharedPreferences = AbstractC1459f50.n;
        Boolean boolValueOf = null;
        if (sharedPreferences == null) {
            AbstractC1474fG.U("prefs");
            throw null;
        }
        if (sharedPreferences.contains("FORCE_EXTRA_BUFFERING")) {
            SharedPreferences sharedPreferences2 = AbstractC1459f50.n;
            if (sharedPreferences2 == null) {
                AbstractC1474fG.U("prefs");
                throw null;
            }
            boolValueOf = Boolean.valueOf(sharedPreferences2.getBoolean("FORCE_EXTRA_BUFFERING", false));
        }
        boolean zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : true;
        boolean z = AbstractC2520q00.b;
        Boolean bool = AbstractC2520q00.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        return z || zBooleanValue;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C2423p00);
    }

    public final int hashCode() {
        return -583525891;
    }

    public final String toString() {
        return "On";
    }
}
