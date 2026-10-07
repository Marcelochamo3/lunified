package o;

import android.os.Bundle;
import com.skidush.clonex.R;

/* JADX INFO: loaded from: classes.dex */
public final class Co0 implements UT {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;

    public Co0(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = str6;
    }

    @Override // o.UT
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("tvShowId", this.a);
        bundle.putString("tvShowTitle", this.b);
        bundle.putString("tvShowPoster", this.c);
        bundle.putString("tvShowBanner", this.d);
        bundle.putString("seasonId", this.e);
        bundle.putInt("seasonNumber", this.f);
        bundle.putString("seasonTitle", this.g);
        return bundle;
    }

    @Override // o.UT
    public final int b() {
        return R.id.action_tv_show_to_season;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Co0)) {
            return false;
        }
        Co0 co0 = (Co0) obj;
        return AbstractC1474fG.b(this.a, co0.a) && AbstractC1474fG.b(this.b, co0.b) && AbstractC1474fG.b(this.c, co0.c) && AbstractC1474fG.b(this.d, co0.d) && AbstractC1474fG.b(this.e, co0.e) && this.f == co0.f && AbstractC1474fG.b(this.g, co0.g);
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
        StringBuilder sb = new StringBuilder("ActionTvShowToSeason(tvShowId=");
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
