package o;

import android.os.Bundle;
import com.skidush.clonex.R;

/* JADX INFO: loaded from: classes.dex */
public final class QR implements UT {
    public final String a;

    public QR(String str) {
        this.a = str;
    }

    @Override // o.UT
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("id", this.a);
        return bundle;
    }

    @Override // o.UT
    public final int b() {
        return R.id.action_movies_home_to_movie;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof QR) && AbstractC1474fG.b(this.a, ((QR) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC1701hf0.h(new StringBuilder("ActionMoviesHomeToMovie(id="), this.a, ")");
    }
}
