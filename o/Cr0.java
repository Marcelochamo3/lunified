package o;

import android.content.SharedPreferences;
import java.util.LinkedHashSet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Cr0 {
    public static final Cr0 A;
    public static final Cr0 B;
    public static final Cr0 C;
    public static final Cr0 D;
    public static final Cr0 E;
    public static final /* synthetic */ Cr0[] F;
    public static final Cr0 l;
    public static final Cr0 m;
    public static final Cr0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Cr0 f205o;
    public static final Cr0 p;
    public static final Cr0 q;
    public static final Cr0 r;
    public static final Cr0 s;
    public static final Cr0 t;
    public static final Cr0 u;
    public static final Cr0 v;
    public static final Cr0 w;
    public static final Cr0 x;
    public static final Cr0 y;
    public static final Cr0 z;

    static {
        Cr0 cr0 = new Cr0("APP_LAYOUT", 0);
        l = cr0;
        Cr0 cr1 = new Cr0("CURRENT_PROVIDER", 1);
        m = cr1;
        Cr0 cr2 = new Cr0("POSEIDON_DOMAIN", 2);
        n = cr2;
        Cr0 cr3 = new Cr0("HAS_SHOWN_LAYOUT_DIALOG", 3);
        f205o = cr3;
        Cr0 cr4 = new Cr0("PLAYER_RESIZE", 4);
        p = cr4;
        Cr0 cr5 = new Cr0("CAPTION_TEXT_SIZE", 5);
        Cr0 cr6 = new Cr0("CAPTION_STYLE_FONT_COLOR", 6);
        q = cr6;
        Cr0 cr7 = new Cr0("CAPTION_STYLE_BACKGROUND_COLOR", 7);
        r = cr7;
        Cr0 cr8 = new Cr0("CAPTION_STYLE_WINDOW_COLOR", 8);
        s = cr8;
        Cr0 cr9 = new Cr0("CAPTION_STYLE_EDGE_TYPE", 9);
        t = cr9;
        Cr0 cr10 = new Cr0("CAPTION_STYLE_EDGE_COLOR", 10);
        u = cr10;
        Cr0 cr11 = new Cr0("QUALITY_HEIGHT", 11);
        v = cr11;
        Cr0 cr12 = new Cr0("SUBTITLE_NAME", 12);
        w = cr12;
        Cr0 cr13 = new Cr0("FORCE_EXTRA_BUFFERING", 13);
        x = cr13;
        Cr0 cr14 = new Cr0("SELECTED_THEME", 14);
        y = cr14;
        Cr0 cr15 = new Cr0("ENABLE_URBAN_PROXY", 15);
        z = cr15;
        Cr0 cr16 = new Cr0("URBAN_PROXY_COUNTRY", 16);
        A = cr16;
        Cr0 cr17 = new Cr0("PROXY_PROVIDER", 17);
        B = cr17;
        Cr0 cr18 = new Cr0("HOLA_PROXY_COUNTRY", 18);
        C = cr18;
        Cr0 cr19 = new Cr0("VISIBLE_PROVIDERS", 19);
        D = cr19;
        Cr0 cr20 = new Cr0("PROVIDER_VISIBILITY_SCHEMA", 20);
        E = cr20;
        F = new Cr0[]{cr0, cr1, cr2, cr3, cr4, cr5, cr6, cr7, cr8, cr9, cr10, cr11, cr12, cr13, cr14, cr15, cr16, cr17, cr18, cr19, cr20};
    }

    public static Cr0 valueOf(String str) {
        return (Cr0) Enum.valueOf(Cr0.class, str);
    }

    public static Cr0[] values() {
        return (Cr0[]) F.clone();
    }

    public final Integer a() {
        SharedPreferences sharedPreferences = AbstractC1459f50.n;
        if (sharedPreferences == null) {
            AbstractC1474fG.U("prefs");
            throw null;
        }
        if (!sharedPreferences.contains(name())) {
            return null;
        }
        SharedPreferences sharedPreferences2 = AbstractC1459f50.n;
        if (sharedPreferences2 != null) {
            return Integer.valueOf(sharedPreferences2.getInt(name(), 0));
        }
        AbstractC1474fG.U("prefs");
        throw null;
    }

    public final String b() {
        SharedPreferences sharedPreferences = AbstractC1459f50.n;
        if (sharedPreferences == null) {
            AbstractC1474fG.U("prefs");
            throw null;
        }
        if (!sharedPreferences.contains(name())) {
            return null;
        }
        SharedPreferences sharedPreferences2 = AbstractC1459f50.n;
        if (sharedPreferences2 != null) {
            return sharedPreferences2.getString(name(), "");
        }
        AbstractC1474fG.U("prefs");
        throw null;
    }

    public final void c() {
        SharedPreferences sharedPreferences = AbstractC1459f50.n;
        if (sharedPreferences == null) {
            AbstractC1474fG.U("prefs");
            throw null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.remove(name());
        editorEdit.apply();
    }

    public final void d(Boolean bool) {
        C2985uq0 c2985uq0 = null;
        if (bool != null) {
            SharedPreferences sharedPreferences = AbstractC1459f50.n;
            if (sharedPreferences == null) {
                AbstractC1474fG.U("prefs");
                throw null;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putBoolean(name(), bool.booleanValue());
            editorEdit.apply();
            c2985uq0 = C2985uq0.a;
        }
        if (c2985uq0 == null) {
            c();
        }
    }

    public final void e(Integer num) {
        C2985uq0 c2985uq0 = null;
        if (num != null) {
            SharedPreferences sharedPreferences = AbstractC1459f50.n;
            if (sharedPreferences == null) {
                AbstractC1474fG.U("prefs");
                throw null;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putInt(name(), num.intValue());
            editorEdit.apply();
            c2985uq0 = C2985uq0.a;
        }
        if (c2985uq0 == null) {
            c();
        }
    }

    public final void f(String str) {
        C2985uq0 c2985uq0 = null;
        if (str != null) {
            SharedPreferences sharedPreferences = AbstractC1459f50.n;
            if (sharedPreferences == null) {
                AbstractC1474fG.U("prefs");
                throw null;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString(name(), str);
            editorEdit.apply();
            c2985uq0 = C2985uq0.a;
        }
        if (c2985uq0 == null) {
            c();
        }
    }

    public final void g(LinkedHashSet linkedHashSet) {
        SharedPreferences sharedPreferences = AbstractC1459f50.n;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putStringSet(name(), new LinkedHashSet(linkedHashSet)).commit();
        } else {
            AbstractC1474fG.U("prefs");
            throw null;
        }
    }
}
