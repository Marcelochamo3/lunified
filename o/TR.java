package o;

import android.os.Bundle;
import com.skidush.clonex.R;

/* JADX INFO: loaded from: classes.dex */
public final class TR implements UT {
    public final String a;
    public final String b;

    public TR(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // o.UT
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("id", this.a);
        bundle.putString("name", this.b);
        return bundle;
    }

    @Override // o.UT
    public final int b() {
        return R.id.action_movies_home_to_genre;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TR)) {
            return false;
        }
        TR tr = (TR) obj;
        return AbstractC1474fG.b(this.a, tr.a) && AbstractC1474fG.b(this.b, tr.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionMoviesHomeToGenre(id=");
        sb.append(this.a);
        sb.append(", name=");
        return AbstractC1701hf0.h(sb, this.b, ")");
    }
}
