package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Ds0 implements Parcelable {
    public static final Parcelable.Creator<Ds0> CREATOR = new Ae0(14);
    public final String l;
    public final String m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Map f223o;
    public final String p;
    public final String q;
    public Js0 r;

    public Ds0(String str, String str2, String str3, Map map, String str4, String str5) {
        AbstractC1474fG.j(str, "id");
        AbstractC1474fG.j(str2, "name");
        AbstractC1474fG.j(str3, "src");
        this.l = str;
        this.m = str2;
        this.n = str3;
        this.f223o = map;
        this.p = str4;
        this.q = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ds0)) {
            return false;
        }
        Ds0 ds0 = (Ds0) obj;
        return AbstractC1474fG.b(this.l, ds0.l) && AbstractC1474fG.b(this.m, ds0.m) && AbstractC1474fG.b(this.n, ds0.n) && AbstractC1474fG.b(this.f223o, ds0.f223o) && AbstractC1474fG.b(this.p, ds0.p) && AbstractC1474fG.b(this.q, ds0.q);
    }

    public final int hashCode() {
        int i = AbstractC1674hK.i(AbstractC1674hK.i(this.l.hashCode() * 31, this.m, 31), this.n, 31);
        Map map = this.f223o;
        int iHashCode = (i + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.p;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.q;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC1701hf0.h(new StringBuilder("Server(name="), this.m, ", transport=<redacted>)");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC1474fG.j(parcel, "out");
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        Map map = this.f223o;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        parcel.writeString(this.p);
        parcel.writeString(this.q);
    }

    public /* synthetic */ Ds0(String str, String str2, String str3, Map map, int i) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : map, null, null);
    }
}
