package o;

import android.os.Bundle;
import android.os.Parcelable;
import com.skidush.clonex.models.Video$Type;
import java.io.Serializable;

/* JADX INFO: renamed from: o.g00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1547g00 implements AT {
    public final String a;
    public final String b;
    public final String c;
    public final Video$Type d;

    public C1547g00(String str, String str2, String str3, Video$Type video$Type) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = video$Type;
    }

    public static final C1547g00 fromBundle(Bundle bundle) {
        AbstractC1474fG.j(bundle, "bundle");
        bundle.setClassLoader(C1547g00.class.getClassLoader());
        if (!bundle.containsKey("id")) {
            throw new IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("id");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"id\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("title");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("subtitle")) {
            throw new IllegalArgumentException("Required argument \"subtitle\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("subtitle");
        if (string3 == null) {
            throw new IllegalArgumentException("Argument \"subtitle\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("videoType")) {
            throw new IllegalArgumentException("Required argument \"videoType\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Video$Type.class) && !Serializable.class.isAssignableFrom(Video$Type.class)) {
            throw new UnsupportedOperationException(Video$Type.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        Video$Type video$Type = (Video$Type) bundle.get("videoType");
        if (video$Type != null) {
            return new C1547g00(string, string2, string3, video$Type);
        }
        throw new IllegalArgumentException("Argument \"videoType\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1547g00)) {
            return false;
        }
        C1547g00 c1547g00 = (C1547g00) obj;
        return AbstractC1474fG.b(this.a, c1547g00.a) && AbstractC1474fG.b(this.b, c1547g00.b) && AbstractC1474fG.b(this.c, c1547g00.c) && AbstractC1474fG.b(this.d, c1547g00.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + AbstractC1674hK.i(AbstractC1674hK.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "PlayerMobileFragmentArgs(id=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", videoType=" + this.d + ")";
    }
}
