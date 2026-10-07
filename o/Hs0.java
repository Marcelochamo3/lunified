package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.skidush.clonex.models.Video$Type;

/* JADX INFO: loaded from: classes.dex */
public final class Hs0 extends Video$Type {
    public static final Parcelable.Creator<Hs0> CREATOR = new Ae0(16);
    public final String l;
    public final int m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f312o;
    public final Gs0 p;
    public final Fs0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hs0(String str, int i, String str2, String str3, Gs0 gs0, Fs0 fs0) {
        super(0);
        AbstractC1474fG.j(str, "id");
        AbstractC1474fG.j(gs0, "tvShow");
        AbstractC1474fG.j(fs0, "season");
        this.l = str;
        this.m = i;
        this.n = str2;
        this.f312o = str3;
        this.p = gs0;
        this.q = fs0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Hs0)) {
            return false;
        }
        Hs0 hs0 = (Hs0) obj;
        return AbstractC1474fG.b(this.l, hs0.l) && this.m == hs0.m && AbstractC1474fG.b(this.n, hs0.n) && AbstractC1474fG.b(this.f312o, hs0.f312o) && AbstractC1474fG.b(this.p, hs0.p) && AbstractC1474fG.b(this.q, hs0.q);
    }

    public final int hashCode() {
        int iHashCode = ((this.l.hashCode() * 31) + this.m) * 31;
        String str = this.n;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f312o;
        return this.q.hashCode() + ((this.p.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Episode(id=" + this.l + ", number=" + this.m + ", title=" + this.n + ", poster=" + this.f312o + ", tvShow=" + this.p + ", season=" + this.q + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC1474fG.j(parcel, "out");
        parcel.writeString(this.l);
        parcel.writeInt(this.m);
        parcel.writeString(this.n);
        parcel.writeString(this.f312o);
        this.p.writeToParcel(parcel, i);
        this.q.writeToParcel(parcel, i);
    }
}
