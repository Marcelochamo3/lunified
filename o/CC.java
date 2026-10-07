package o;

import android.os.Bundle;
import android.os.Parcelable;
import com.skidush.clonex.R;
import com.skidush.clonex.models.Video$Type;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class CC implements UT {
    public final String a;
    public final String b;
    public final String c;
    public final Video$Type d;

    public CC(String str, String str2, String str3, Video$Type video$Type) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = video$Type;
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
        return R.id.action_home_to_player;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CC)) {
            return false;
        }
        CC cc = (CC) obj;
        return AbstractC1474fG.b(this.a, cc.a) && AbstractC1474fG.b(this.b, cc.b) && AbstractC1474fG.b(this.c, cc.c) && AbstractC1474fG.b(this.d, cc.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + AbstractC1674hK.i(AbstractC1674hK.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "ActionHomeToPlayer(id=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", videoType=" + this.d + ")";
    }
}
