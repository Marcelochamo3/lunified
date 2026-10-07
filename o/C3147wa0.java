package o;

import android.os.Bundle;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.wa0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3147wa0 implements UT {
    public final String a;

    public C3147wa0(String str) {
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
        return R.id.action_search_to_tv_show;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3147wa0) && AbstractC1474fG.b(this.a, ((C3147wa0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC1701hf0.h(new StringBuilder("ActionSearchToTvShow(id="), this.a, ")");
    }
}
