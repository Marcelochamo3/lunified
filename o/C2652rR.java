package o;

import android.os.Bundle;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.rR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2652rR implements UT {
    public final String a;

    public C2652rR(String str) {
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
        return R.id.action_movie_to_movie;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2652rR) && AbstractC1474fG.b(this.a, ((C2652rR) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC1701hf0.h(new StringBuilder("ActionMovieToMovie(id="), this.a, ")");
    }
}
