package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class Gs0 implements Parcelable {
    public static final Parcelable.Creator<Gs0> CREATOR = new Ae0(18);
    public final String l;
    public final String m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f288o;

    public Gs0(String str, String str2, String str3, String str4) {
        AbstractC1474fG.j(str, "id");
        AbstractC1474fG.j(str2, "title");
        this.l = str;
        this.m = str2;
        this.n = str3;
        this.f288o = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Gs0)) {
            return false;
        }
        Gs0 gs0 = (Gs0) obj;
        return AbstractC1474fG.b(this.l, gs0.l) && AbstractC1474fG.b(this.m, gs0.m) && AbstractC1474fG.b(this.n, gs0.n) && AbstractC1474fG.b(this.f288o, gs0.f288o);
    }

    public final int hashCode() {
        int i = AbstractC1674hK.i(this.l.hashCode() * 31, this.m, 31);
        String str = this.n;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f288o;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvShow(id=");
        sb.append(this.l);
        sb.append(", title=");
        sb.append(this.m);
        sb.append(", poster=");
        sb.append(this.n);
        sb.append(", banner=");
        return AbstractC1701hf0.h(sb, this.f288o, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC1474fG.j(parcel, "out");
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeString(this.f288o);
    }
}
