package o;

import android.os.Bundle;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.ka0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1983ka0 implements UT {
    public final String a;
    public final String b;

    public C1983ka0(String str, String str2) {
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
        return R.id.action_search_to_genre;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1983ka0)) {
            return false;
        }
        C1983ka0 c1983ka0 = (C1983ka0) obj;
        return AbstractC1474fG.b(this.a, c1983ka0.a) && AbstractC1474fG.b(this.b, c1983ka0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionSearchToGenre(id=");
        sb.append(this.a);
        sb.append(", name=");
        return AbstractC1701hf0.h(sb, this.b, ")");
    }
}
