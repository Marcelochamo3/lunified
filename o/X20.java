package o;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceScreen;

/* JADX INFO: loaded from: classes.dex */
public final class X20 {
    public final Context a;
    public long b = 0;
    public SharedPreferences c = null;
    public SharedPreferences.Editor d;
    public boolean e;
    public String f;
    public PreferenceScreen g;
    public S20 h;
    public S20 i;
    public S20 j;

    public X20(Context context) {
        this.a = context;
        this.f = context.getPackageName() + "_preferences";
    }

    public final SharedPreferences.Editor a() {
        if (!this.e) {
            return c().edit();
        }
        if (this.d == null) {
            this.d = c().edit();
        }
        return this.d;
    }

    public final long b() {
        long j;
        synchronized (this) {
            j = this.b;
            this.b = 1 + j;
        }
        return j;
    }

    public final SharedPreferences c() {
        if (this.c == null) {
            this.c = this.a.getSharedPreferences(this.f, 0);
        }
        return this.c;
    }
}
