package o;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class Ua0 implements AT {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;

    public Ua0(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = str6;
    }

    public static final Ua0 fromBundle(Bundle bundle) {
        AbstractC1474fG.j(bundle, "bundle");
        bundle.setClassLoader(Ua0.class.getClassLoader());
        if (!bundle.containsKey("tvShowId")) {
            throw new IllegalArgumentException("Required argument \"tvShowId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("tvShowId");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"tvShowId\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("tvShowTitle")) {
            throw new IllegalArgumentException("Required argument \"tvShowTitle\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("tvShowTitle");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"tvShowTitle\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("tvShowPoster")) {
            throw new IllegalArgumentException("Required argument \"tvShowPoster\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("tvShowPoster");
        if (!bundle.containsKey("tvShowBanner")) {
            throw new IllegalArgumentException("Required argument \"tvShowBanner\" is missing and does not have an android:defaultValue");
        }
        String string4 = bundle.getString("tvShowBanner");
        if (!bundle.containsKey("seasonId")) {
            throw new IllegalArgumentException("Required argument \"seasonId\" is missing and does not have an android:defaultValue");
        }
        String string5 = bundle.getString("seasonId");
        if (string5 == null) {
            throw new IllegalArgumentException("Argument \"seasonId\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("seasonNumber")) {
            throw new IllegalArgumentException("Required argument \"seasonNumber\" is missing and does not have an android:defaultValue");
        }
        int i = bundle.getInt("seasonNumber");
        if (bundle.containsKey("seasonTitle")) {
            return new Ua0(i, string, string2, string3, string4, string5, bundle.getString("seasonTitle"));
        }
        throw new IllegalArgumentException("Required argument \"seasonTitle\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ua0)) {
            return false;
        }
        Ua0 ua0 = (Ua0) obj;
        return AbstractC1474fG.b(this.a, ua0.a) && AbstractC1474fG.b(this.b, ua0.b) && AbstractC1474fG.b(this.c, ua0.c) && AbstractC1474fG.b(this.d, ua0.d) && AbstractC1474fG.b(this.e, ua0.e) && this.f == ua0.f && AbstractC1474fG.b(this.g, ua0.g);
    }

    public final int hashCode() {
        int i = AbstractC1674hK.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int i2 = (AbstractC1674hK.i((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, this.e, 31) + this.f) * 31;
        String str3 = this.g;
        return i2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SeasonTvFragmentArgs(tvShowId=");
        sb.append(this.a);
        sb.append(", tvShowTitle=");
        sb.append(this.b);
        sb.append(", tvShowPoster=");
        sb.append(this.c);
        sb.append(", tvShowBanner=");
        sb.append(this.d);
        sb.append(", seasonId=");
        sb.append(this.e);
        sb.append(", seasonNumber=");
        sb.append(this.f);
        sb.append(", seasonTitle=");
        return AbstractC1701hf0.h(sb, this.g, ")");
    }
}
