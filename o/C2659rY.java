package o;

import android.os.Bundle;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.rY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2659rY implements UT {
    public final String a;

    public C2659rY(String str) {
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
        return R.id.action_people_to_tv_show;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2659rY) && AbstractC1474fG.b(this.a, ((C2659rY) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC1701hf0.h(new StringBuilder("ActionPeopleToTvShow(id="), this.a, ")");
    }
}
