package o;

import android.os.Bundle;
import android.os.Parcelable;
import com.skidush.clonex.R;
import com.skidush.clonex.models.Video$Type;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class Bo0 implements UT {
    public final String a;
    public final String b;
    public final String c;
    public final Video$Type d;

    public Bo0(String str, String str2, String str3, Hs0 hs0) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = hs0;
    }

    @Override // o.UT
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("id", this.a);
        bundle.putString("title", this.b);
        bundle.putString("subtitle", this.c);
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(Video$Type.class);
        Parcelable parcelable = this.d;
        if (zIsAssignableFrom) {
            AbstractC1474fG.h(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("videoType", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(Video$Type.class)) {
                throw new UnsupportedOperationException(Video$Type.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            AbstractC1474fG.h(parcelable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("videoType", (Serializable) parcelable);
        }
        return bundle;
    }

    @Override // o.UT
    public final int b() {
        return R.id.action_tv_show_to_player;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bo0)) {
            return false;
        }
        Bo0 bo0 = (Bo0) obj;
        return AbstractC1474fG.b(this.a, bo0.a) && AbstractC1474fG.b(this.b, bo0.b) && AbstractC1474fG.b(this.c, bo0.c) && AbstractC1474fG.b(this.d, bo0.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + AbstractC1674hK.i(AbstractC1674hK.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "ActionTvShowToPlayer(id=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", videoType=" + this.d + ")";
    }
}
